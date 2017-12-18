// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hitachi.pcs.common.util.CommonUtils;
import com.hitachi.pcs.common.util.Constants;
import com.hitachi.pcs.common.util.PropertyUtils;
import com.hitachi.pcs.data.sam.repository.FileOpenMode;
import com.hitachi.pcs.data.sam.repository.RepositoriyMap;
import com.hitachi.pcs.data.sam.repository.RepositoryBase;

public abstract class SortTaskBase {

  private Map<String, String> environmentValues = new HashMap<>();

  private Map<String, String> localValues = new HashMap<>();

  @Autowired
  private RepositoriyMap repositoryMap;

  private static final String DD_SORTIN = "DD_SORTIN";

  private static final String DD_SORTOUT = "DD_SORTOUT";

  public final int execute(final Map<String, String> environmentValues, final String... arguments) throws Exception {
    if (environmentValues != null) {
      this.environmentValues.putAll(environmentValues);
    }
    LinkedList<String> argumentList = new LinkedList<>();
    if (arguments != null) {
      argumentList.addAll(Arrays.asList(arguments));
    }
    System.out.println(this.getClass().getSimpleName() + " has stareted at " + CommonUtils.getDateTime() + ".");
    String result = run(argumentList);
    System.out.println(this.getClass().getSimpleName() + " has finished at " + CommonUtils.getDateTime() + ".");
    System.out.println(this.getClass().getSimpleName() + "'s Data Export has started at " + CommonUtils.getDateTime() + ".");
    export();
    System.out.println(this.getClass().getSimpleName() + "'s Data Export has finished at " + CommonUtils.getDateTime() + ".");
    return Integer.parseInt(result);
  }

  protected abstract String run(List<String> arguments) throws Exception;

  protected final void export() {
    try {
      if (Constants.TRUE.equals(PropertyUtils.get(Constants.PROP_KEY_DEBUG_VALID))) {
        String outputDir = CommonUtils.getFilePathString(
            PropertyUtils.get(Constants.PROP_KEY_DEBUG_DIR),
            "task",
            "sort",
            this.getClass().getSimpleName(),
            CommonUtils.getDateTime()
            );
        CommonUtils.exportSamFile(CommonUtils.getFilePathString(outputDir, "INPUT", "FILE", DD_SORTIN), getRepository(DD_SORTIN));
        CommonUtils.exportSamFile(CommonUtils.getFilePathString(outputDir, "OUTPUT", "FILE", DD_SORTOUT), getRepository(DD_SORTOUT));
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  protected final String getValue(String key) {
    String result = "";
    if (this.localValues.get(key) != null) {
      result = this.localValues.get(key);
    } else if (this.environmentValues.get(key) != null) {
      result = this.environmentValues.get(key);
    }
    return result;
  }

  protected final void setValue(String key, String value) {
    this.localValues.put(key, value);
    if (this.environmentValues.get(key) != null) {
      this.environmentValues.put(key, value);
    }
  }

  protected final RepositoryBase getRepository(String key) {
    return this.repositoryMap.get(getValue(key));
  }

  protected final List<String> getDD_SORTIN(int recordLength) throws IOException {
    List<String> inputList = new ArrayList<>();

    RepositoryBase repository = getRepository(DD_SORTIN);
    repository.open(FileOpenMode.INPUT, recordLength);
    try {
      while (!repository.isEnd()) {
        inputList.add(repository.read());
      }
    } finally {
      repository.close();
    }

    return inputList;
  }

  protected final void setDD_SORTOUT(List<String> list, int recordLength) throws IOException {
    RepositoryBase repository = getRepository(DD_SORTOUT);
    repository.open(FileOpenMode.OUTPUT, recordLength);
    try {
      for (String line : list) {
        repository.write(line);
      }
    } finally {
      repository.close();
    }
  }

}
