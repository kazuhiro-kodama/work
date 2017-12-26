// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.hitachi.pcs.common.RepositoryAnnotation;
import com.hitachi.pcs.common.RepositoryType;
import com.hitachi.pcs.common.util.CommonUtils;
import com.hitachi.pcs.common.util.Constants;
import com.hitachi.pcs.common.util.JsonDataUtils;
import com.hitachi.pcs.common.util.PropertyUtils;
import com.hitachi.pcs.data.sam.repository.RepositoriyMap;
import com.hitachi.pcs.data.sam.repository.RepositoryBase;

public abstract class TaskBase {

  @Getter(AccessLevel.PROTECTED)
  @Setter(AccessLevel.PROTECTED)
  private String environmentName = null;

  private List<String> arguments = new LinkedList<>();

  private int indexOfArguments = 0;

  private Map<String, String> environmentValues = new HashMap<>();

  @Autowired
  private RepositoriyMap repositoryMap;

  public final void execute(final Map<String, String> environmentValues, final String... arguments) throws Exception {
    if (arguments != null) {
      this.arguments.addAll(Arrays.asList(arguments));
    }
    if (environmentValues != null) {
      this.environmentValues.putAll(environmentValues);
    }
    String datetime = CommonUtils.getDateTime();
    System.out.println(this.getClass().getSimpleName() + " has stareted at " + CommonUtils.getDateTime() + ".");
    run();
    System.out.println(this.getClass().getSimpleName() + " has finished at " + CommonUtils.getDateTime() + ".");
    System.out.println(this.getClass().getSimpleName() + "'s Data Export has stareted at " + CommonUtils.getDateTime() + ".");
    export(datetime, RepositoryType.INPUT);
    export(datetime, RepositoryType.PARAMETER);
    export(datetime, RepositoryType.OUTPUT);
    export(datetime, RepositoryType.UNKNOWN);
    System.out.println(this.getClass().getSimpleName() + "'s Data Export has finished at " + CommonUtils.getDateTime() + ".");
  };

  public final List<Object> execute(final Map<String, String> environmentValues, final List<String> arguments, final int indexOfArguments, final List<Object> using_parameters) throws Exception {
    this.indexOfArguments = indexOfArguments;
    if (arguments != null) {
      this.arguments.addAll(arguments);
    }
    if (environmentValues != null) {
      this.environmentValues = environmentValues;
    }
    String datetime = CommonUtils.getDateTime();
    setUsingParameters(using_parameters);
    run();
    export(datetime, RepositoryType.INPUT);
    export(datetime, RepositoryType.PARAMETER);
    export(datetime, RepositoryType.OUTPUT);
    export(datetime, RepositoryType.UNKNOWN);
    return getUsingParameters();
  };

  protected abstract void run() throws Exception;

  protected void setUsingParameters(List<Object> using_parameters) throws Exception{
  }

  protected List<Object> getUsingParameters() throws Exception {
    List<Object> using_parameters = new LinkedList<>();
    return using_parameters;
   }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  protected final void export(String datetime, RepositoryType type) {
    try {
      if (Constants.TRUE.equals(PropertyUtils.get(Constants.PROP_KEY_DEBUG_VALID))) {
        String outputDir = CommonUtils.getFilePathString(
            PropertyUtils.get(Constants.PROP_KEY_DEBUG_DIR),
            "task",
            this.getClass().getSimpleName(),
            datetime,
            type.toString()
            );

        for (Field field : this.getClass().getSuperclass().getDeclaredFields()) {
          field.setAccessible(true);
          // SAM FILE
          if (field.get(this) instanceof RepositoryBase) {
            RepositoryBase repository = (RepositoryBase)field.get(this);
            if (repository.getRecordLength() <= 0) {
              continue;
            }
            RepositoryAnnotation repositoryAnnotation = field.getAnnotation(RepositoryAnnotation.class);
            if (repositoryAnnotation != null && type.equals(repositoryAnnotation.type())) {
              String repositoryName = repositoryAnnotation.name();
              if (repositoryName.isEmpty()) {
                repositoryName = field.getName();
              }
              CommonUtils.exportSamFile(CommonUtils.getFilePathString(outputDir, "FILE", repositoryName), repository);
            }
          }
          // DB
          if (field.get(this) instanceof CrudRepository) {
            CrudRepository repository = (CrudRepository)field.get(this);
            RepositoryAnnotation repositoryAnnotation = field.getAnnotation(RepositoryAnnotation.class);
            if (repositoryAnnotation != null && type.equals(repositoryAnnotation.type())) {
              String repositoryName = repositoryAnnotation.name();
              if (repositoryName.isEmpty()) {
                repositoryName = field.getName();
              }
              JsonDataUtils.exportJsonDataFile(CommonUtils.getFilePathString(outputDir, "DB", repositoryName + ".json"), repository.findAll());
            }
          }
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  protected final int getArgumentNumber() {
    return this.arguments.size();
  }

  protected final void setArgumentNumber(int index){
    this.indexOfArguments = index;
  }

  protected final String getArgumentValue() {
    String result = this.arguments.get(this.indexOfArguments);
    this.indexOfArguments++;
    return result;
  }

  protected final String getEnvironmentValue() {
    return environmentValues.get(environmentName);
  }

  protected final void setEnvironmentValue(String value) {
    environmentValues.put(environmentName, value);
  }

  protected final RepositoryBase getRepository(String key) {
    return this.repositoryMap.get(environmentValues.get("DD_" + key));
  }

  private String returnCode = StringUtils.repeat("0", 9);

  protected final long getReturnCode() {
    return Long.parseLong(returnCode);
  }

  protected final void setReturnCode(long arg) {
    returnCode = String.format("%09d", arg);
  }

  private String sqlcode = StringUtils.repeat("0", 9);

  protected final long getSqlcode() {
    return Long.parseLong(sqlcode);
  }

  protected final void setSqlcode(long arg) {
    sqlcode = String.format("%09d", arg);
  }

  protected final List<Object> call(final TaskBase subTask, final Object... args) throws Exception {
    List<Object> using_parameters = new LinkedList<>();
    for (Object arg : args) {
      using_parameters.add(arg);
    }
    return subTask.execute(this.environmentValues, this.arguments, this.indexOfArguments, using_parameters);
  }
}
