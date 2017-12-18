// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.step.main;

import java.io.File;

import com.hitachi.pcs.func.step.StepBase;

public abstract class MainStepBase extends StepBase {

  protected final void init_sh() throws Exception {
    export("ORAUSER", getValue("ORA_USER") + "/" + getValue("ORA_PASS") + "@" + getValue("ORA_SID"));
    export("ORAUSERMCT", getValue("ORA_USERMCT") + "/" + getValue("ORA_PASSMCT") + "@" + getValue("ORA_SIDMCT"));
    export("ORAUSER15", getValue("ORA_USER") + "/" + getValue("ORA_PASS") + "@" + getValue("ORA_SID"));
    export("ORAUSER16", getValue("ORA_USER") + "/" + getValue("ORA_PASS") + "@" + getValue("ORA_SID"));
    export("ORAUSER23", getValue("ORA_USER") + "/" + getValue("ORA_PASS") + "@" + getValue("ORA_SID"));
    export("MSGLOC", getValue("ORA_USER") + "/CATS/PLOG/" + getValue("MODULENAME"));
    export("MDCDOWNLOAD", getValue("MCATS_SHARE") + "/download/" + getValue("CMNREGIONCD_PLANTCD") + "/" + getValue("MODULENAME"));
    export("MDCBACKUP", getValue("MCATS_SHARE") + "/download/" + getValue("CMNREGIONCD_PLANTCD") + "/" + getValue("MODULENAME") + "/backup");
  }

  protected final int CheckCondition(String arg1, String arg2) {
    if ("-n".equals(arg1)) {
      if (!arg2.isEmpty()) {
        return 0;
      } else {
        return 1;
      }
    }
    if ("-z".equals(arg1)) {
      if (arg2.isEmpty()) {
        return 0;
      } else {
        return 1;
      }
    }
    if ("-f".equals(arg1)) {
      File file = new File(arg2);
      if (!file.exists()) {
        return 1;
      }
      if (file.isFile()) {
        return 0;
      } else  {
        return 1;
      }
    }
    if ("-d".equals(arg1)) {
      File directory = new File(arg2);
      if (!directory.exists()) {
        return 1;
      }
      if (directory.isDirectory()) {
        return 0;
      } else  {
        return 1;
      }
    }
    return 1;
  }
}
