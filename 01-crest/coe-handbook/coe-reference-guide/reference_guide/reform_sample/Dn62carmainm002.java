// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.step.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hitachi.pcs.func.step.sub.Dn6275lm;
import com.hitachi.pcs.func.step.sub.Dn6275lo;

@Service
@Scope("prototype")
public final class Dn62carmainm002 extends MainStepBase {

  @Autowired
  Dn6275lm DN6275LM;
  @Autowired
  Dn6275lo DN6275LO;

  @Override
  protected String run(List<String> arguments) throws Exception {

    MCATS_run_env();
    setValue("MODULENAME", "DN62CARMAINM002");
    export("MODULENAME");
    init_sh();
    setValue("NOTIFY", "@USER@");
    setValue("PID", "@PID@");
    setValue("CDT", "@DATE@_" + getValue("PID") + "");
    setValue("MSGLG", "" + getValue("MSGLOC") + "/" + getValue("NOTIFY") + "_DN62CARMAINM002_MSGLG_" + getValue("CDT") + "");
    setValue("MODULE_RSP", "0");
    export("MODULE_RSP");
    callStep(DN6275LM);
    setValue("MODULE_RSP", getReturnCode());
    callStep(DN6275LO);
    setValue("MODULE_RSP", getReturnCode());
    return getValue("MODULE_RSP");

  }
}
