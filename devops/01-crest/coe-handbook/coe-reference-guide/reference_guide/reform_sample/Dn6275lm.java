// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.step.sub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hitachi.pcs.func.task.E62750;
import com.hitachi.pcs.func.task.E62x10;
import com.hitachi.pcs.func.task.E62x20;
import com.hitachi.pcs.func.task.sort.A562061s;

@Service
@Scope("prototype")
public final class Dn6275lm extends SubStepBase {

  @Autowired
  private E62750 E62750;

  @Autowired
  private E62x10 E62X10;

  @Autowired
  private E62x20 E62X20;

  @Autowired
  private A562061s A562061S;

  @Override
  protected String run(List<String> arguments) throws Exception {
    FUNCLIB_sh();
    init_sh();
    setValue("JCLNAME", getValue("CMNPLANTCD") + "DN6275LM");
    export("JCLNAME");
//    echo "Job ${JCLNAME} submitted. PID = $$"
//    trap 'ABORTHANDLER ${NOTIFY} ${JCLNAME} $$' 1 2 3 6 15
    JOBINIT_sh();
//  STRT_MSGLG ${JCLNAME} ${NOTIFY} ${PID}
    setValue("DD_SUBDAT", getValue("DATA") + "/SYSTEM.SUBDAT");
    export("DD_SUBDAT");
    setFileRepository("DD_SUBDAT");
    setValue("DD_SYSDATE", getValue("DATA") + "/SYSTEM.SYSDATE");
    export("DD_SYSDATE");
    setFileRepository("DD_SYSDATE");
    if ("0".equals(getValue("COND_CODE"))) {
//    STRTLOG ${NOTIFY} "${JCLNAME}" "S010"
      setValue("DD_SYSIN", getValue("PARAM") + "/BN62W10G");
      export("DD_SYSIN");
      setFileRepository("DD_SYSIN");

      setValue("DD_SYS031", getValue("DATA") + "/" + getValue("PID") + ".S010.SYS031");
      export("DD_SYS031");
      setMemoryRepository("DD_SYS031");

      setValue("DD_SYS032", getValue("DATA") + "/" + getValue("PID") + ".S010.SYS032");
      export("DD_SYS032");
      setMemoryRepository("DD_SYS032");

      callTask(getValue("JCLNAME"), "S010", "E62750", E62750);
      setValue("COND_CODE", getValue("RetCod"));
//    EXEC_PROC  ${NOTIFY} "${JCLNAME}" S010
//    ENDLOG ${NOTIFY} "${JCLNAME}" "S010" ${COND_CODE} "PROC"
    }
    if ("0".equals(getValue("COND_CODE"))) {
//    STRTLOG ${NOTIFY} "${JCLNAME}" "S015"
      setValue("DD_SYS011", getValue("DATA") + "/" + getValue("PID") + ".S010.SYS031");
      export("DD_SYS011");
      setMemoryRepository("DD_SYS011");

      setValue("DD_SYS031", getValue("DATA") + "/" + getValue("MODULENAME") + "." + getValue("JCLNAME") + ".STATUS");
      export("DD_SYS031");
      setFileRepository("DD_SYS031");

      callTask(getValue("JCLNAME"), "S015", "E62X10", E62X10);
      setValue("COND_CODE", getValue("RetCod"));
//    EXEC_PROC  ${NOTIFY} "${JCLNAME}" S015
//    ENDLOG ${NOTIFY} "${JCLNAME}" "S015" ${COND_CODE} "PROC"
    }
    if ("0".equals(getValue("COND_CODE"))) {
//    STRTLOG ${NOTIFY} "${JCLNAME}" "S056"
      setValue("DD_SORTIN", getValue("DATA") + "/" + getValue("PID") + ".S010.SYS032");
      export("DD_SORTIN");
      setMemoryRepository("DD_SORTIN");

      setValue("DD_SORTOUT", getValue("DATA") + "/" + getValue("PID") + ".S056.SORTOUT");
      export("DD_SORTOUT");
      setMemoryRepository("DD_SORTOUT");

      setValue("DD_SORTPARM", getValue("SORTSHELL") + "/A562061S");
      export("DD_SORTPARM");
      setFileRepository("DD_SORTPARM");

      setValue("DD_SYSOUT", getValue("DATA") + "/" + getValue("PID") + ".S056.SYSOUT");
      export("DD_SYSOUT");
      setMemoryRepository("DD_SYSOUT");

      callSortTask(A562061S);
//    SORTFILE ${NOTIFY} "${JCLNAME}" S056 ${DD_SORTIN} ${DD_SORTOUT}
      setValue("COND_CODE", getValue("RetCod"));
//    EXEC_UTILS ${NOTIFY} "${JCLNAME}" S056
//    ENDLOG ${NOTIFY} "${JCLNAME}" "S056" ${COND_CODE} "UTILS"
    }
    if ("0".equals(getValue("COND_CODE"))) {
//    STRTLOG ${NOTIFY} "${JCLNAME}" "S057"

      setValue("DD_SYS011", getValue("DATA") + "/" + getValue("PID") + ".S056.SORTOUT");
      export("DD_SYS011");
      setMemoryRepository("DD_SYS011");

      setValue("DD_SYS031", getValue("DATA") + "/" + getValue("MODULENAME") + "." + getValue("JCLNAME") + ".SHIYOU");
      export("DD_SYS031");
      setFileRepository("DD_SYS031");

      callTask(getValue("JCLNAME"), "S057", "E62X20", E62X20);
      setValue("COND_CODE", getValue("RetCod"));
//    EXEC_PROC  ${NOTIFY} "${JCLNAME}" S057
//    ENDLOG ${NOTIFY} "${JCLNAME}" "S057" ${COND_CODE} "PROC"
    }
    if ("0".equals(getValue("COND_CODE"))) {
//    if ( CheckCondition "-f" "${DATA}/${PID}.*" )
//    then
//       rm ${DATA}/${PID}.*
//    fi
//    if ( CheckCondition "-f" "${TEMP}/${PID}.*" )
//    then
//       rm ${TEMP}/${PID}.*
//    fi
//    if ( CheckCondition "-f" "${TEMP}/*_${PID}" )
//    then
//       rm ${TEMP}/*_${PID}
//    fi
    }
//    END_MSGLG ${JCLNAME} ${NOTIFY} ${PID}
    return getValue("COND_CODE");
  }
}
