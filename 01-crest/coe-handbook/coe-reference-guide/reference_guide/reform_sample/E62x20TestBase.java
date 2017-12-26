// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class E62x20TestBase extends TaskTestBase {

  /** The task instance. */
  @Autowired
  private E62x20 task;

  @Before
  public final void initTestTargetName() throws Exception {
    this.testTargetName = task.getClass().getSimpleName();
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
      importInputData(testCaseName);
      importOutputData(testCaseName);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Some import data are missing.");
    }
  }

  private void importInputData(String testCaseName) throws Exception {
    // DD_SYS011 START
    setInputRepository("DD_SYS011");
    // DD_SYS011 END
  }

  private void importOutputData(String testCaseName) throws Exception {
    // DD_SYS031 START
    setOutputRepository("DD_SYS031");
    // DD_SYS031 END
  }

  private void execute() {
    try {
      // ENVIRONMENT VALUES FOR TERMDUMP
      environmentValues.put("ERRJNAME", "");//TODO
      environmentValues.put("ERRSNAME", "");//TODO
      environmentValues.put("ERRPNAME", "E62X20");
      task.execute(environmentValues);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("An exception has ocurred in executed task.");
    }
  }

  private void validateResult() {
    try {
      // DD_SYS031 START
      assertTrue(compareOutputFile("DD_SYS031"));
      // DD_SYS031 END
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Some output data are incorrect.");
    }
  }
}
