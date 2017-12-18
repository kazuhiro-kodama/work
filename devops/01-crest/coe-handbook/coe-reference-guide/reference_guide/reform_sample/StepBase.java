// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.step;

import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hitachi.pcs.data.sam.repository.FileRepository;
import com.hitachi.pcs.data.sam.repository.MemoryRepository;
import com.hitachi.pcs.data.sam.repository.RepositoriyMap;
import com.hitachi.pcs.func.task.TaskBase;
import com.hitachi.pcs.func.task.sort.SortTaskBase;

import lombok.Getter;

public abstract class StepBase {

  private Map<String, String> environmentValues = new HashMap<>();

  private Map<String, String> localValues = new HashMap<>();

  @Autowired
  private RepositoriyMap repositoryMap;

  @Getter
  private String returnCode = null;

  public final int execute(final Map<String, String> environmentValues, final String... arguments) throws Exception {
    if (environmentValues != null) {
      this.environmentValues.putAll(environmentValues);
    }
    LinkedList<String> argumentList = new LinkedList<>();
    if (arguments != null) {
      argumentList = new LinkedList<>(Arrays.asList(arguments));
    }
    return Integer.parseInt(run(argumentList));
  }

  protected abstract String run(List<String> arguments) throws Exception;

  protected final String getValue(String key) {
    String result = "";
    if (this.localValues.get(key) != null) {
      result = this.localValues.get(key);
    } else if (this.environmentValues.get(key) != null) {
      result = this.environmentValues.get(key);
    }
    this.returnCode = "0";
    return result;
  }

  protected final void setValue(String key, String value) {
    this.localValues.put(key, value);
    if (this.environmentValues.get(key) != null) {
      this.environmentValues.put(key, value);
    }
    this.returnCode = "0";
  }

  protected final void export(String key) {
    if (this.localValues.get(key) != null) {
      this.environmentValues.put(key, this.localValues.get(key));
    }
    this.returnCode = "0";
  }

  protected final void export(String key, String value) {
    setValue(key, value);
    export(key);
  }

  protected void setMemoryRepository(String key) {
    MemoryRepository repository = new MemoryRepository();
    if (getValue(key) != null && repositoryMap.get(getValue(key)) == null) {
      repositoryMap.put(getValue(key), repository);
    }
  }

  protected void setFileRepository(String key) {
    FileRepository repository = new FileRepository(getValue(key));
    if (getValue(key) != null) {
      repositoryMap.put(getValue(key), repository);
    }
  }

  protected final void executeOSCommand(String[] arg) throws Exception {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < arg.length; i++) {
      builder.append(arg[i]);
      builder.append(" ");
    }
    String[] command = new String[] { "/bin/sh", "-c", builder.toString()};
    ProcessBuilder processBuilder = new ProcessBuilder(command);
    Process process = processBuilder.start();
    returnCode = String.valueOf(process.waitFor());
  }

  protected final void executeOSCommand(String[] command, Redirect stdout) throws Exception {
    ProcessBuilder processBuilder = new ProcessBuilder(command);
    processBuilder.redirectOutput(stdout);
    Process process = processBuilder.start();
    returnCode = String.valueOf(process.waitFor());
  }

  protected final void executeOSCommand(String[] command, Redirect stdout, Redirect stderr) throws Exception {
    ProcessBuilder processBuilder = new ProcessBuilder(command);
    processBuilder.redirectOutput(stdout);
    processBuilder.redirectError(stderr);
    Process process = processBuilder.start();
    returnCode = String.valueOf(process.waitFor());
  }

  protected final void callStep(final StepBase step, final String... arguments) throws Exception {
    returnCode = String.valueOf(step.execute(environmentValues, arguments));
  }

  protected final void callTask(final TaskBase task, final String... arguments) throws Exception {
    task.execute(environmentValues, arguments);
    setValue("RetCod", "0");
  }

  protected final void callTask(final String jobName, final String stepName, final String taskName, final TaskBase task, final String... arguments) throws Exception {
    setValue("ERRJNAME", jobName);
    export("ERRJNAME");
    setValue("ERRSNAME", stepName);
    export("ERRSNAME");
    setValue("ERRPNAME", taskName);
    StringBuilder builder = new StringBuilder(taskName);
    for (int i = 0; i < arguments.length; i++) {
      builder.append(arguments[i]);
      if (i < arguments.length - 1) {
        builder.append(" ");
      }
    }
    setValue("ERRPNAME", builder.toString());
    export("ERRPNAME");
    task.execute(environmentValues, arguments);
    setValue("RetCod", "0");
  }

  protected final void callSortTask(final SortTaskBase task, final String... arguments) throws Exception {
    String retCod = String.valueOf(task.execute(environmentValues, arguments));
    setValue("RetCod", retCod);
  }

  protected final void MCATS_run_env() {
    export("CPFID", "ASP20002");
    export("MCATS_BASE", "/" + getValue("CPFID"));
    export("MCATS_BIN", getValue("MCATS_BASE") + "/APPL-PGM/bin");
    export("MCATS_DATA", getValue("MCATS_BASE") + "/APPL-DATA");
    export("MCATS_ETC", getValue("MCATS_BASE") + "/APPL-PGM/ETC");
    export("MCATS_LOG", getValue("MCATS_BASE") + "/APPL-LOG");
    export("MCATS_PARM", getValue("MCATS_BASE") + "/APPL-PGM/PARM");
    export("MCATS_SHELL", getValue("MCATS_BASE") + "/APPL-PGM/SHELL");
    export("MCATS_TEMP", getValue("MCATS_BASE") + "/APPL-TEMP");
    export("MCATS_TOOL", getValue("MCATS_BASE") + "/APPL-PGM/TOOL");
    export("MCATS_SHARE", getValue("MCATS_BASE") + "/APPL-SHARE");
    export("ORA_USER", "ASP20002_USR01");
    export("ORA_PASS", "Ldv2udVRY4CXEg");
    export("ORA_SID", "ASP20002XP");
    export("ORACLE_BASE", "/opt/app/oracle");
    export("ORACLE_HOME", getValue("ORACLE_BASE") + "/product/12.1.0/client_1");
    export("NLS_LANG", "Japanese_Japan.JA16SJISTILDE");
    export("MCT", "MCT");
    export("ORA_USER6", "ASP20002_USR01");
    export("ORA_PASS6", "Ldv2udVRY4CXEg");
    export("ORA_SID6", "ASP20002XP");
    export("ORA_USERMCT", "ASP20001_Country");
    export("ORA_PASSMCT", "Ldv2udVRY4CXEg");
    export("ORA_SIDMCT", "ASP20001XP");
    export("LIST_HOME", getValue("MCATS_ETC"));
    export("PATH", getValue("PATH") + ":" + getValue("ORACLE_BASE") + "/LIST");
    export("MACH_HOME", getValue("MCATS_ETC"));
    export("PATH", getValue("PATH") + ":" + getValue("MCATS_BIN") + "/MACH");
    export("MQTOOL", getValue("MCATS_TOOL") + "/MQ_TOOL");
    export("MQSERVER", "'PCSH.CLIENT.CH1/TCP/sj022167(1414)'");
    export("LD_LIBRARY_PATH", "/opt/mqm/lib64:/opt/app/oracle/product/12.1.0/client_1/lib:/opt/microfocus/VisualCOBOL/lib");
    export("PATH", getValue("PATH") + ":" + getValue("MQTOOL"));
    export("AMQTOOL_HOME", getValue("MQTOOL"));
    export("PL_HOME", getValue("MCATS_ETC"));
    export("PL_MSGTBL", getValue("PL_HOME") + "/n59_app_message");
    export("PL_APPTBL", getValue("PL_HOME") + "/n59_apptbl");
    export("PL_APPCTL_DIR", getValue("MCATS_PARM") + "/PIPELINE");
    export("PL_CODCHG_DIR", getValue("MCATS_PARM") + "/PIPELINE");
    export("PL_PLNTCD", "6");
    export("PL_WORK_DIR", getValue("MCATS_DATA") + "/work");
    export("PL_RCV_DIR", getValue("MCATS_DATA") + "/receive");
    export("PL_BACKUP_DIR", getValue("MCATS_DATA") + "/backup/mq_wk");
    export("PL_SEND_DIR", getValue("MCATS_DATA") + "/send");
    export("PL_APPLOG_DIR", getValue("MCATS_LOG") + "/PIPELINE.log");
    export("PL_TIVOLILOG", "/Teclog/Applinfo.log");
    export("PL_SYSNAME", "CPF00003");
    export("PL_LOCATION", "MX");
    export("PL_HOSTNAME", "SJ015728");
    export("PATH", getValue("PATH") + ":" + getValue("MCATS_BIN") + "/PIPELINE");
    export("JSSNET_HOME", getValue("MCATS_ETC"));
    export("TMPDIR", getValue("MCATS_TEMP"));
    export("TEMP", getValue("MCATS_TEMP") + "/CATS");
    export("DATA", getValue("MCATS_DATA") + "/batchdata");
    export("DATABACKUP", getValue("MCATS_DATA") + "/backup");
    export("DATABACKUPM", getValue("MCATS_DATA") + "/backup/monthly");
    export("DATABACKUPW", getValue("MCATS_DATA") + "/backup/weekly");
    export("DATABACKUPD", getValue("MCATS_DATA") + "/backup/daily");
    export("DATABACKUP_MQ", getValue("MCATS_DATA") + "/backup/mq");
    export("DATABACKUP_MQ_WK", getValue("MCATS_DATA") + "/backup/mq_wk");
    export("PARAM", getValue("MCATS_PARM") + "/common");
    export("PARAML", getValue("MCATS_PARM") + "/local");
    export("SORTSHELL", getValue("MCATS_SHELL") + "/SORTs");
    export("PLOGBU", getValue("MCATS_LOG"));
    export("COBPATH", getValue("COBPATH") + ":" + getValue("MCATS_BIN") + "/batch");
    export("MODULE_PATH", getValue("MCATS_SHELL") + "/MAIN");
    export("JOB_PATH", getValue("MCATS_SHELL") + "/SUB");
    export("DESDATA", getValue("MCATS_DATA") + "/receive");
    export("MDCUPLOAD", getValue("MCATS_SHARE") + "/upload/H6");
    export("CMNLANGCD", "E");
    export("CMNPLANTCD", "6");
    export("EXECENV", "P");
    export("CMNREGIONCD", "H");
    export("CMNREGIONCD_PLANTCD", getValue("CMNREGIONCD") + getValue("CMNPLANTCD"));
    export("WAITTIME", "180");
    export("CATS_QMNGER", "CATS");
    export("CATS_KONG_RMTQ", "ZZZ");
    export("CATS_KONG_APL_CLASS", "ZZZZZZZZ");
    export("CDNORMAL", "0");
    export("CDABNORMAL", "999");
    export("HELP_RECORD_SEPARATOR", "NO_SEPARATOR");
    export("HELPEXE", getValue("MCATS_TOOL") + "/HELP/bin");
    export("HLPMSG", getValue("MCATS_TOOL") + "/HELP/msg/helptool.msg");
    export("APOLO_RECORD_SEPARATOR", "NO_SEPARATOR");
    export("KAPROTEXE", getValue("MCATS_TOOL") + "/APOLO/bin");
    export("PATH", getValue("PATH") + ":" + getValue("MODULE_PATH") + ":" + getValue("JOB_PATH") + ":" + getValue("MCATS_BIN") + "/batch:" + getValue("KAPROTEXE") + ":" + getValue("HELPEXE") + ":/opt/microfocus/VisualCOBOL/bin");
    export("CMNSHUBETU", "D0");
    export("E62010LEN", "1524");
    export("E62010SUB", "E62SUB046");
    export("G2BDATA", getValue("DATA") + "/G2B_COMMON_WK");
    export("INTEGRATEDSTORAGE", getValue("MCATS_SHARE") + "/communication/" + getValue("CMNREGIONCD_PLANTCD"));
    export("INTEGRATEDSTORAGE_POST", getValue("MCATS_SHARE") + "/communication");
    export("CMNFTPIP", "10.14.96.14");
    export("CMNPLANTFTPUSER", "MCDES601");
    export("CMNPLANTFTPPASS", "MCDES601P");
    export("CMNPLANTTRANSORG", "MCTSEND000000006");
    export("CMNPLANTFTPUSER_POHUB", "esbftp016");
    export("CMNPLANTFTPPASS_POHUB", "pohub016");
    export("CMNPLANTTRANSORG_POHUB", "POHTH09000000001");
    export("CMNPLANTFTPUSER_PARTS_PIER", "esbsdh01");
    export("CMNPLANTFTPPASS_PARTS_PIER", "sdh1pass");
    export("CMNPLANTTRANSORG_PARTS_PIER", "MCTSEND000000006");
    export("LOCK_CHECK", "1");
    export("PVPT_CLASS", "PV");
    export("SANKI_FLG", "OFF");
    export("N6A700_IN_FMCON", "NOT_USE");
    export("ENG_TYPE_REFLECTION_SW", "N");
    export("E62360_IN_FMCON", "DOPS052_FROM_OTD_FMCON");
    export("E62010_SYS031_FMCON", "DOPR032_TO_OTD_FMCON");
    export("E62070_OUT_FMCON", "OPR032_TO_OTD_FMCON");
    export("E62370_OUT_FMCON", "OPR032_TO_OTD_FMCON");
    export("E62F60_OUT_FMCON", "OPR023_TO_OTD_FMCON");
    export("E62450_OUT_FMCON", "OPR023_TO_OTD_FMCON");
    export("E62A60_OUT_FMCON", "OPR022_TO_OTD_FMCON");
    export("E62400_OUT_FMCON", "DOPR022_TO_OTD_FMCON");
    export("E62430_OUT_FMCON", "OPR022_TO_OTD_FMCON");
    export("E62380_OUT_FMCON", "OPR072_TO_OTD_FMCON");
    export("E62030_OUT_FMCON", "OPR082_TO_OTD_FMCON");
    export("MCN_FLG", "NO");
    export("NO1GRS_FLG", "ALL");
    export("PARTNER_TYPE", "N");
    export("WEEKLY_FILLING_ORDER_FLG", "YES");
    export("ACT_SCH_LIST_FLG", "LOCAL");
    export("CHINA_SAP_FLG", "NO");
    export("ETL_CENTER", getValue("MCATS_BASE") + "/APPL-ETL/PowerCenter");
    export("ETL_BIN", getValue("ETL_CENTER") + "/server/bin");
    export("ETL_PM_DATA", "\\\\10.14.128.165/" + getValue("CPFID") + "/batchdata");
    export("APPL_ETL", "\\\\10.14.203.26/" + getValue("CPFID") + "_bat/APPL-ETL");
    export("ETL_PM_LOG", getValue("APPL_ETL") + getValue("MCATS_BASE") + "/ETL_LOG");
    export("ETL_DATA", "/" + getValue("CPFID") + "/APPL-ETL/" + getValue("CPFID"));
    export("ETL_LOG", getValue("ETL_DATA") + "/ETL_LOG");
    export("ETL_AREA", "//10.14.203.26/" + getValue("CPFID") + "_bat/APPL-ETL/" + getValue("CPFID"));
    export("INFA_HOME", getValue("ETL_CENTER") + "/");
    export("ETL_PM_DIR", getValue("APPL_ETL") + "/ETL/" + getValue("CPFID"));
    export("ETL_SERVICE", "IS_CPF00");
    export("ETL_DOMAIN", "Domain_CPF00");
    export("ETL_USER", "ASP20002_etl01");
    export("ETL_PASSWORD", "xxxxxxxx");
    export("ETL_FOLDER", "ASP20002");
    export("PATH", getValue("PATH") + ":" + getValue("ETL_BIN"));
    export("INDIA_SAP_FLG", "NO");
    export("LIBPATH", "/opt/mqm/lib:/opt/CA/SharedComponents/lib:/home/db2iadm1/sqllib/lib:/opt/app/oracle/product/12.1.0/client_1/lib:/opt/app/oracle/product/12.1.0/client_1/lib32:/usr/lib:/user/lib:/opt/microfocus/VisualCOBOL/lib:/opt/HISORTlib64/lib:/opt/app/oracle/product/12.1.0/client_1/precomp/lib:/" + getValue("CPFID") + "/APPL-PGM/bin/batch:/" + getValue("CPFID") + "/APPL-PGM/src:/opt/microfocus/VisualCOBOL/cpylib");
    export("PATH", getValue("PATH") + ":/opt/HISORTlib64/bin");
    export("LIBPATH", getValue("LIBPATH") + ":/opt/HISORTlib64/lib");
    export("NLSPATH", getValue("NLSPATH") + ":/opt/HISORTlib64/lib/nls/msg/%L/%N.cat");
    export("N_STOCK_COOPE_FLG", "N");
    export("shift", "Fullspec");
    export("PIPELINE_DATA_CD", "ASCII");
    export("HIBETSU_GROSS_TYPE", "POS");
    export("KONG_ARI", "NO");
    export("RTN_ATESAKI_GRPCD", "MCT6GG_DESZZ0200");
    export("HOZEI_FLG", "NO");
    export("ECO_FLG", "NO");
    export("THAI_FLG", "NO");
    export("DATASRVFTPUSER", "MCFTPA00");
    export("DATASRVFTPPASS", "MCFTPA00P");
    export("HOZEI_ABEND_FLG", "NO");
    export("IMP_HOZEI_FLG", "NO");
    export("ORDER_RANGE", "24");
    export("CONSIGNMENT_FLG", "NO");
    export("CATS_PARTNER_RMTQ", "EDIH.PCS.LQ1");
    export("ORA_COM_USER", "ASP20001_Common");
    export("ORA_COM_PASS", "Ldv2udVRY4CXEg");
    export("ORA_COM_SID", "ASP20001XP");
    export("MDCSTORAGE", getValue("MCATS_SHARE") + "/download/" + getValue("CMNREGIONCD_PLANTCD") + "/STORAGE");
  }
}
