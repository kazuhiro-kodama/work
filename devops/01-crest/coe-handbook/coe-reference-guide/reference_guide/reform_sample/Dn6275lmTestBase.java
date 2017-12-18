// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.step.sub;

import java.io.File;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import com.hitachi.pcs.common.util.CommonUtils;
import com.hitachi.pcs.common.util.JsonDataUtils;
import com.hitachi.pcs.data.db.domain.DomainBase;
import com.hitachi.pcs.data.db.domain.Jikei184;
import com.hitachi.pcs.data.db.domain.Koutei185;
import com.hitachi.pcs.data.db.domain.LocalParamDb;
import com.hitachi.pcs.data.db.domain.LocalParamUsePgmDb;
import com.hitachi.pcs.data.db.domain.Sequence180;
import com.hitachi.pcs.data.db.domain.Shakei183;
import com.hitachi.pcs.data.db.domain.Shiyou182;
import com.hitachi.pcs.data.db.domain.Status181;
import com.hitachi.pcs.data.db.repository.Jikei184Repository;
import com.hitachi.pcs.data.db.repository.Koutei185Repository;
import com.hitachi.pcs.data.db.repository.LocalParamDbRepository;
import com.hitachi.pcs.data.db.repository.LocalParamUsePgmDbRepository;
import com.hitachi.pcs.data.db.repository.Sequence180Repository;
import com.hitachi.pcs.data.db.repository.Shakei183Repository;
import com.hitachi.pcs.data.db.repository.Shiyou182Repository;
import com.hitachi.pcs.data.db.repository.Status181Repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Dn6275lmTestBase extends SubStepTestBase {

  @Autowired
  private Dn6275lm subStep;

  private static final String CMNPLANTCD = "6";
  private static final String DATA = "/ASP20002/APPL-DATA/batchdata";
  private static final String PARAM = "/ASP20002/APPL-PGM/PARM/common";
  private static final String MODULENAME = "DN62CARMAINM002";

  private static final String JCLNAME = CMNPLANTCD + "DN6275LM";

  /** The status181 repository. */
  @Autowired
  private Status181Repository status181Repository;

  /** The shiyou182 repository. */
  @Autowired
  private Shiyou182Repository shiyou182Repository;

  /** The shakei183 repository. */
  @Autowired
  private Shakei183Repository shakei183Repository;

  /** The jikei184 repository. */
  @Autowired
  private Jikei184Repository jikei184Repository;

  /** The koutei185 repository. */
  @Autowired
  private Koutei185Repository koutei185Repository;

  /** The sequence180 repository. */
  @Autowired
  private Sequence180Repository sequence180Repository;

  @Autowired
  private LocalParamDbRepository localParamDbRepository;

  @Autowired
  private LocalParamUsePgmDbRepository localParamUsePgmDbRepository;

  @Before
  public final void initTestTargetName() throws Exception {
    this.testTargetName = subStep.getClass().getSimpleName();
  }

  @Before
  public void setUp() throws Exception {
    FileUtils.deleteDirectory(new File(DATA));
    FileUtils.deleteDirectory(new File(PARAM));
    new File(DATA).mkdirs();
    new File(PARAM).mkdirs();

    status181Repository.deleteAll();
    shiyou182Repository.deleteAll();
    shakei183Repository.deleteAll();
    jikei184Repository.deleteAll();
    koutei185Repository.deleteAll();
    sequence180Repository.deleteAll();
    localParamDbRepository.deleteAll();
    localParamUsePgmDbRepository.deleteAll();
  }

  @Override
  protected final void runTest(String arg) {
    // Set test case name
    this.testCaseName = arg;
    // Import data
    importData();
    // Execute task
    execute();
    // Validate result
    validateResult();
  }

  private void importData() {
    try {
      CommonUtils.copyFile(
          CommonUtils.getFilePath(getInputFileDirPath(), "PARAM", "BN62W10G"),
          CommonUtils.getFilePath(PARAM, "BN62W10G")
          );
      // STATUS_181 START
      String filePathSTATUS_181 = CommonUtils.getFilePathString(getInputDBDirPath(), "STATUS_181.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathSTATUS_181, Status181.class)) {
        status181Repository.save((Status181) entity);
      }
      // STATUS_181 END
      // SHIYOU_182 START
      String filePathSHIYOU_182 = CommonUtils.getFilePathString(getInputDBDirPath(), "SHIYOU_182.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathSHIYOU_182, Shiyou182.class)) {
        shiyou182Repository.save((Shiyou182) entity);
      }
      // SHIYOU_182 END
      // SHAKEI_183 START
      String filePathSHAKEI_183 = CommonUtils.getFilePathString(getInputDBDirPath(), "SHAKEI_183.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathSHAKEI_183, Shakei183.class)) {
        shakei183Repository.save((Shakei183) entity);
      }
      // SHAKEI_183 END
      // JIKEI_184 START
      String filePathJIKEI_184 = CommonUtils.getFilePathString(getInputDBDirPath(), "JIKEI_184.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathJIKEI_184, Jikei184.class)) {
        jikei184Repository.save((Jikei184) entity);
      }
      // JIKEI_184 END
      // KOUTEI_185 START
      String filePathKOUTEI_185 = CommonUtils.getFilePathString(getInputDBDirPath(), "KOUTEI_185.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathKOUTEI_185, Koutei185.class)) {
        koutei185Repository.save((Koutei185) entity);
      }
      // KOUTEI_185 END
      // SEQUENCE_180 START
      String filePathSEQUENCE_180 = CommonUtils.getFilePathString(getInputDBDirPath(), "SEQUENCE_180.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathSEQUENCE_180, Sequence180.class)) {
        sequence180Repository.save((Sequence180) entity);
      }
      // SEQUENCE_180 END
      // LOCAL_PARAM_DB START
      String filePathLOCAL_PARAM_DB = CommonUtils.getFilePathString(getInputDBDirPath(), "LOCAL_PARAM_DB.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathLOCAL_PARAM_DB, LocalParamDb.class)) {
        localParamDbRepository.save((LocalParamDb)entity);
      }
      // LOCAL_PARAM_DB END

      // LOCAL_PARAM_USE_PGM_DB START
      String filePathLOCAL_PARAM_USE_PGM_DB = CommonUtils.getFilePathString(getInputDBDirPath(), "LOCAL_PARAM_USE_PGM_DB.json");
      for (DomainBase entity : JsonDataUtils.importJsonDataFile(filePathLOCAL_PARAM_USE_PGM_DB, LocalParamUsePgmDb.class)) {
        localParamUsePgmDbRepository.save((LocalParamUsePgmDb)entity);
      }
      // LOCAL_PARAM_USE_PGM_DB END
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Some import data are missing.");
    }
  }

  private void execute() {
    try {
      // DEFINED IN DN62CARMAINM002.sh
      environmentValues.put("MODULENAME", MODULENAME);
      int result = subStep.execute(environmentValues);
      assertEquals(0, result);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("An exception has ocurred in executed task.");
    }
  }

  private void validateResult() {
    try {
      assertTrue(CommonUtils.compareFiles(
          CommonUtils.getFilePath(getOutputFileDirPath(), "DATA", MODULENAME + "." + JCLNAME + ".STATUS"),
          CommonUtils.getFilePath(DATA, MODULENAME + "." + JCLNAME + ".STATUS")
          ));
      assertTrue(CommonUtils.compareFiles(
          CommonUtils.getFilePath(getOutputFileDirPath(), "DATA", MODULENAME + "." + JCLNAME + ".SHIYOU"),
          CommonUtils.getFilePath(DATA, MODULENAME + "." + JCLNAME + ".SHIYOU")
          ));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Some output data are incorrect.");
    }
  }
}
