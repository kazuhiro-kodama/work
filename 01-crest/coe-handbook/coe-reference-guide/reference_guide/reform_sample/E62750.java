// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task;

import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hitachi.pcs.common.util.CommonUtils;
/* BEGIN: MANUAL INJECTION */
import com.hitachi.pcs.data.db.domain.Jikei184;
import com.hitachi.pcs.data.db.domain.Koutei185;
import com.hitachi.pcs.data.db.domain.Sequence180;
import com.hitachi.pcs.data.db.domain.Shakei183;
import com.hitachi.pcs.data.db.domain.Shiyou182;
import com.hitachi.pcs.data.db.domain.Status181;
/* END  : MANUAL INJECTION */
import com.hitachi.pcs.data.sam.repository.FileOpenMode;

@Component
@Scope("prototype")
public class E62750 extends E62750Base {

  @Override
  protected void _init() throws Exception {
    setResponseCodeopn(0);
    getMlsSysin().open(FileOpenMode.INPUT, getMlsSysinRec().length());
  }

  @Override
  protected void opicsSharyouDbDumpShori() throws Exception {
    kaishiShori();
    statusDbDumpShori();
    shiyouBetsuDbDumpShori();
    shakeiBetsuDbDumpShori();
    jikeiRetsuDbDumpShori();
    kouteiKeikakuDbDumpShori();
    sequenceDbDumpShori();
    shuryoShori();
    getMlsSysin().close();
    return;
  }

  @Override
  protected void kaishiShori() throws Exception {
    if (!(getMlsSysin().isEnd())) {
    setWkSysinParameter(getMlsSysin().read());
    } else {
    /* DO NOTHING */
    }
    setStoreCtr(1);
    while (!(getStoreCtr() > 5)) {
    parameterSakuseiLoop();
    }
    connectShori();
  }

  @Override
  protected void parameterSakuseiLoop() throws Exception {
    if (!( CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), StringUtils.repeat(" ", getWkParam((int)(getStoreCtr() - 1)).length())) == 0 )) {
    if (CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), "181") == 0) {
    setWkStatus("181");
    } else {
    if (CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), "182") == 0) {
    setWkShiyouBetsu("182");
    } else {
    if (CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), "183") == 0) {
    setWkShakeiBetsu("183");
    } else {
    if (CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), "184") == 0) {
    setWkJikeiRetsu("184");
    } else {
    if (CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), "185") == 0) {
    setWkKouteiKeikaku("185");
    } else {
    if (CommonUtils.compareString(getWkParam((int)(getStoreCtr() - 1)), "180") == 0) {
    setWkSequence("180");
    }
    }
    }
    }
    }
    }
    }
    setStoreCtr(getStoreCtr() + 1);
  }

  @Override
  protected void statusDbDumpShori() throws Exception {
    if (!( CommonUtils.compareString(getWkStatus(), StringUtils.repeat(" ", getWkStatus().length())) == 0 )) {
    getO1aStatusFl().open(FileOpenMode.OUTPUT, getSys031Rec().length());
    setWkStatusEofSw(getWSwOff());
    statusDbLocateShori();
    statusDbInputShori();
    while (!(isWkStatusDbEof())) {
    statusDbDumpLoop();
    }
    getO1aStatusFl().close();
    }
  }

  @Override
  protected void statusDbDumpLoop() throws Exception {
    statusFlHenshuOutShori();
    statusDbInputShori();
  }

  @Override
  protected void statusDbLocateShori() throws Exception {
    _181Closcr01Shori();
    _181Opencr01Shori();
  }

  @Override
  protected void statusDbInputShori() throws Exception {
    _181Fethcr01Shori();
    if (ic7adafl.isAdaReadNormal()) {
    if (ic7adafl.isAdaEof1()) {
    setWkStatusEofSw(getWSwOn());
    } else {
    }
    }
  }

  @Override
  protected void statusFlHenshuOutShori() throws Exception {
    o1.initAStatusRec();
    o1.setAStatusRec(s1811.getArea());
    setWkKihon(s1811.getModelKihon());
    setWkKatashiki(s1811.getModelKatashiki());
    setWkKubun(s1811.getModelKubun());
    o1.setAModel(getWkModel());
    setWkKatashiki(s1811.getOrgKatashiki());
    setWkKihon(s1811.getOrgKihon());
    setWkKubun(s1811.getOrgKubun());
    o1.setAOrgModel(getWkModel());
    getO1aStatusFl().write(o1.getAStatusRec());
  }

  @Override
  protected void shiyouBetsuDbDumpShori() throws Exception {
    if (!( CommonUtils.compareString(getWkShiyouBetsu(), StringUtils.repeat(" ", getWkShiyouBetsu().length())) == 0 )) {
    getO2aShiyouBetsuFl().open(FileOpenMode.OUTPUT, getSys032Rec().length());
    setWkShiyouBetsuEofSw(getWSwOff());
    shiyouBetsuDbLocateShori();
    shiyouBetsuDbInputShori();
    while (!(isWkShiyouBetsuDbEof())) {
    shiyouBetsuDbDumpLoop();
    }
    getO2aShiyouBetsuFl().close();
    }
  }

  @Override
  protected void shiyouBetsuDbDumpLoop() throws Exception {
    shiyouBetsuHenshuOutShori();
    shiyouBetsuDbInputShori();
  }

  @Override
  protected void shiyouBetsuDbLocateShori() throws Exception {
    _182Closcr02Shori();
    _182Opencr02Shori();
  }

  @Override
  protected void shiyouBetsuDbInputShori() throws Exception {
    _182Fethcr02Shori();
    if (ic7adafl.isAdaReadNormal()) {
    if (ic7adafl.isAdaEof1()) {
    setWkShiyouBetsuEofSw(getWSwOn());
    } else {
    }
    }
  }

  @Override
  protected void shiyouBetsuHenshuOutShori() throws Exception {
    o2.initAShiyouBetsuRec();
    setWkKihon(s1821.getModelKihon());
    setWkKatashiki(s1821.getModelKatashiki());
    setWkKubun(s1821.getModelKubun());
    o2.setAModel(getWkModel());
    o2.setAKoujouKubun(s1821.getKoujouKubun());
    o2.setAColorUchibariEx(s1821.getColorUchibariEx());
    o2.setALineTrim(s1821.getLineTrim());
    o2.setAKokuyuKubun(s1821.getKokuyuKubun());
    o2.setAYymm(s1821.getYymm());
    o2.setAKouteiId(s1821.getKouteiId());
    o2.setAJisseki(s1821.getJisseki());
    o2.setAKeikaku(s1821.getKeikaku());
    o2.setAIkan(s1821.getIkan());
    o2.setAShikyuu(s1821.getShikyuu());
    o2.setAMikenZaiko(s1821.getMikenZaiko());
    o2.setAKankenZaiko(s1821.getKankenZaiko());
    getO2aShiyouBetsuFl().write(o2.getAShiyouBetsuRec());
  }

  @Override
  protected void shakeiBetsuDbDumpShori() throws Exception {
    if (!( CommonUtils.compareString(getWkShakeiBetsu(), StringUtils.repeat(" ", getWkShakeiBetsu().length())) == 0 )) {
    getO3aShakeiBetsuFl().open(FileOpenMode.OUTPUT, getSys033Rec().length());
    setWkShakeiBetsuEofSw(getWSwOff());
    shakeiBetsuDbLocateShori();
    shakeiBetsuDbInputShori();
    while (!(isWkShakeiBetsuDbEof())) {
    shakeiBetsuDbDumpLoop();
    }
    getO3aShakeiBetsuFl().close();
    }
  }

  @Override
  protected void shakeiBetsuDbDumpLoop() throws Exception {
    shakeiBetsuHenshuOutShori();
    shakeiBetsuDbInputShori();
  }

  @Override
  protected void shakeiBetsuDbLocateShori() throws Exception {
    _183Closcr03Shori();
    _183Opencr03Shori();
  }

  @Override
  protected void shakeiBetsuDbInputShori() throws Exception {
    _183Fethcr03Shori();
    if (ic7adafl.isAdaReadNormal()) {
    if (ic7adafl.isAdaEof1()) {
    setWkShakeiBetsuEofSw(getWSwOn());
    } else {
    }
    }
  }

  @Override
  protected void shakeiBetsuHenshuOutShori() throws Exception {
    o3.initAShakeiBetsuRec();
    o3.setAShakeiBetsuRec(s1831.getArea());
    getO3aShakeiBetsuFl().write(o3.getAShakeiBetsuRec());
  }

  @Override
  protected void jikeiRetsuDbDumpShori() throws Exception {
    if (!( CommonUtils.compareString(getWkJikeiRetsu(), StringUtils.repeat(" ", getWkJikeiRetsu().length())) == 0 )) {
    getO4aJikeiRetsuFl().open(FileOpenMode.OUTPUT, getSys034Rec().length());
    setWkJikeiRetsuEofSw(getWSwOff());
    jikeiRetsuDbLocateShori();
    jikeiRetsuDbInputShori();
    while (!(isWkJikeiRetsuDbEof())) {
    jikeiRetsuDbDumpLoop();
    }
    getO4aJikeiRetsuFl().close();
    }
  }

  @Override
  protected void jikeiRetsuDbDumpLoop() throws Exception {
    jikeiRetsuHenshuOutShori();
    jikeiRetsuDbInputShori();
  }

  @Override
  protected void jikeiRetsuDbLocateShori() throws Exception {
    _184Closcr04Shori();
    _184Opencr04Shori();
  }

  @Override
  protected void jikeiRetsuDbInputShori() throws Exception {
    _184Fethcr04Shori();
    if (ic7adafl.isAdaReadNormal()) {
    if (ic7adafl.isAdaEof1()) {
    setWkJikeiRetsuEofSw(getWSwOn());
    } else {
    }
    }
  }

  @Override
  protected void jikeiRetsuHenshuOutShori() throws Exception {
    o4.initAJikeiRetsuRec();
    o4.setAJikeiRetsuRec(s1841.getArea());
    getO4aJikeiRetsuFl().write(o4.getAJikeiRetsuRec());
  }

  @Override
  protected void kouteiKeikakuDbDumpShori() throws Exception {
    if (!( CommonUtils.compareString(getWkKouteiKeikaku(), StringUtils.repeat(" ", getWkKouteiKeikaku().length())) == 0 )) {
    getO5aKouteiKeikakuFl().open(FileOpenMode.OUTPUT, getSys035Rec().length());
    setWkKouteiKeikakuEofSw(getWSwOff());
    kouteiKeikakuDbLocateShori();
    kouteiKeikakuDbInputShori();
    while (!(isWkKouteiKeikakuDbEof())) {
    kouteiKeikakuDbDumpLoop();
    }
    getO5aKouteiKeikakuFl().close();
    }
  }

  @Override
  protected void kouteiKeikakuDbDumpLoop() throws Exception {
    kouteikeikakuHenshuOutShori();
    kouteiKeikakuDbInputShori();
  }

  @Override
  protected void kouteiKeikakuDbLocateShori() throws Exception {
    _185Closcr05Shori();
    _185Opencr05Shori();
  }

  @Override
  protected void kouteiKeikakuDbInputShori() throws Exception {
    _185Fethcr05Shori();
    if (ic7adafl.isAdaReadNormal()) {
    if (ic7adafl.isAdaEof1()) {
    setWkKouteiKeikakuEofSw(getWSwOn());
    } else {
    }
    }
  }

  @Override
  protected void kouteikeikakuHenshuOutShori() throws Exception {
    o5.initAKouteiKeikakuRec();
    o5.setAKouteiKeikakuRec(s1851.getArea());
    getO5aKouteiKeikakuFl().write(o5.getAKouteiKeikakuRec());
  }

  @Override
  protected void sequenceDbDumpShori() throws Exception {
    if (!( CommonUtils.compareString(getWkSequence(), StringUtils.repeat(" ", getWkSequence().length())) == 0 )) {
    getO6aSequenceFl().open(FileOpenMode.OUTPUT, getSys036Rec().length());
    setWkSequenceEofSw(getWSwOff());
    sequenceDbLocateShori();
    sequenceDbInputShori();
    while (!(isWkSequenceDbEof())) {
    sequenceDbDumpLoop();
    }
    getO6aSequenceFl().close();
    }
  }

  @Override
  protected void sequenceDbDumpLoop() throws Exception {
    sequenceHenshuOutShori();
    sequenceDbInputShori();
  }

  @Override
  protected void sequenceDbLocateShori() throws Exception {
    _180Closcr06Shori();
    _180Opencr06Shori();
  }

  @Override
  protected void sequenceDbInputShori() throws Exception {
    _180Fethcr06Shori();
    if (ic7adafl.isAdaReadNormal()) {
    if (ic7adafl.isAdaEof1()) {
    setWkSequenceEofSw(getWSwOn());
    } else {
    }
    }
  }

  @Override
  protected void sequenceHenshuOutShori() throws Exception {
    o6.initASequenceRec();
    o6.setASequenceRec(s1801.getArea());
    getO6aSequenceFl().write(o6.getASequenceRec());
  }

  @Override
  protected void shuryoShori() throws Exception {
    dbCloseShori();
  }

  @Override
  protected void connectShori() throws Exception {
    ic7adafl.setAdaRsp(getResponseCodeopn());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCConnect());
    adabasErrorShori();
    }
  }

  @Override
  protected void _181Closcr01Shori() throws Exception {
    closeCr01();
    ic7adafl.setAdaRsp(getResponseCodecr01());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCCloscr01());
    adabasErrorShori();
    }
  }

  @Override
  protected void _181Opencr01Shori() throws Exception {
    openCr01();
    ic7adafl.setAdaRsp(getResponseCodecr01());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCOpencr01());
    adabasErrorShori();
    }
  }

  @Override
  protected void _181Fethcr01Shori() throws Exception {
    fetchCr01();
    ic7adafl.setAdaRsp(getResponseCodecr01());
    if (!( ic7adafl.isAdaReadNormal() )) {
    ic7adafl.setCommandCode(getCFethcr01());
    adabasErrorShori();
    }
    s1811.setArea(getRecordBufcr01());
  }

  @Override
  protected void _182Closcr02Shori() throws Exception {
    closeCr02();
    ic7adafl.setAdaRsp(getResponseCodecr02());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCCloscr02());
    adabasErrorShori();
    }
  }

  @Override
  protected void _182Opencr02Shori() throws Exception {
    openCr02();
    ic7adafl.setAdaRsp(getResponseCodecr02());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCOpencr02());
    adabasErrorShori();
    }
  }

  @Override
  protected void _182Fethcr02Shori() throws Exception {
    fetchCr02();
    ic7adafl.setAdaRsp(getResponseCodecr02());
    if (!( ic7adafl.isAdaReadNormal() )) {
    ic7adafl.setCommandCode(getCFethcr02());
    adabasErrorShori();
    }
    s1821.setArea(getRecordBufcr02());
  }

  @Override
  protected void _183Closcr03Shori() throws Exception {
    closeCr03();
    ic7adafl.setAdaRsp(getResponseCodecr03());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCCloscr03());
    adabasErrorShori();
    }
  }

  @Override
  protected void _183Opencr03Shori() throws Exception {
    openCr03();
    ic7adafl.setAdaRsp(getResponseCodecr03());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCOpencr03());
    adabasErrorShori();
    }
  }

  @Override
  protected void _183Fethcr03Shori() throws Exception {
    fetchCr03();
    ic7adafl.setAdaRsp(getResponseCodecr03());
    if (!( ic7adafl.isAdaReadNormal() )) {
    ic7adafl.setCommandCode(getCFethcr03());
    adabasErrorShori();
    }
    s1831.setArea(getRecordBufcr03());
  }

  @Override
  protected void _184Closcr04Shori() throws Exception {
    closeCr04();
    ic7adafl.setAdaRsp(getResponseCodecr04());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCCloscr04());
    adabasErrorShori();
    }
  }

  @Override
  protected void _184Opencr04Shori() throws Exception {
    openCr04();
    ic7adafl.setAdaRsp(getResponseCodecr04());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCOpencr04());
    adabasErrorShori();
    }
  }

  @Override
  protected void _184Fethcr04Shori() throws Exception {
    fetchCr04();
    ic7adafl.setAdaRsp(getResponseCodecr04());
    if (!( ic7adafl.isAdaReadNormal() )) {
    ic7adafl.setCommandCode(getCFethcr04());
    adabasErrorShori();
    }
    s1841.setArea(getRecordBufcr04());
  }

  @Override
  protected void _185Closcr05Shori() throws Exception {
    closeCr05();
    ic7adafl.setAdaRsp(getResponseCodecr05());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCCloscr05());
    adabasErrorShori();
    }
  }

  @Override
  protected void _185Opencr05Shori() throws Exception {
    openCr05();
    ic7adafl.setAdaRsp(getResponseCodecr05());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCOpencr05());
    adabasErrorShori();
    }
  }

  @Override
  protected void _185Fethcr05Shori() throws Exception {
    fetchCr05();
    ic7adafl.setAdaRsp(getResponseCodecr05());
    if (!( ic7adafl.isAdaReadNormal() )) {
    ic7adafl.setCommandCode(getCFethcr05());
    adabasErrorShori();
    }
    s1851.setArea(getRecordBufcr05());
  }

  @Override
  protected void _180Closcr06Shori() throws Exception {
    closeCr06();
    ic7adafl.setAdaRsp(getResponseCodecr06());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCCloscr06());
    adabasErrorShori();
    }
  }

  @Override
  protected void _180Opencr06Shori() throws Exception {
    openCr06();
    ic7adafl.setAdaRsp(getResponseCodecr06());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCOpencr06());
    adabasErrorShori();
    }
  }

  @Override
  protected void _180Fethcr06Shori() throws Exception {
    fetchCr06();
    ic7adafl.setAdaRsp(getResponseCodecr06());
    if (!( ic7adafl.isAdaReadNormal() )) {
    ic7adafl.setCommandCode(getCFethcr06());
    adabasErrorShori();
    }
    s1801.setArea(getRecordBufcr06());
  }

  @Override
  protected void dbCloseShori() throws Exception {
    ic7adafl.setAdaRsp(getResponseCodeopn());
    if (!( ic7adafl.isAdaNormalRsp() )) {
    ic7adafl.setCommandCode(getCDbclose());
    adabasErrorShori();
    }
  }

  @Override
  protected void adabasErrorShori() throws Exception {
    ic7adafl.setEditErrCode(getSqlcode());
    {
    List<Object> results = call(ic7sub01, ic7adafl.getAdaErrMsg(), ic7adafl.getCommandCode(), ic7adafl.getEditErrCode(), ic7sub01Cpy.getWkIc7sub01Link4(), ic7sub01Cpy.getWkIc7sub01Link5());
    ic7adafl.setAdaErrMsg(results.get(0).toString());
    ic7adafl.setCommandCode(results.get(1).toString());
    ic7adafl.setEditErrCode(Long.parseLong(results.get(2).toString()));
    ic7sub01Cpy.setWkIc7sub01Link4(results.get(3).toString());
    ic7sub01Cpy.setWkIc7sub01Link5(results.get(4).toString());
    }
  }

  @Override
  protected void openCr01() throws Exception {
    if (CommonUtils.compareString(getCr01Opened(), "Y") == 0) {
    }
    setCr01Opened("Y");
    /* BEGIN: MANUAL INJECTION */
    cr01 = status181Repository.findAllByOrderByKoujouKubunAscKoujouControlNoAsc().iterator();
    if (cr01 != null) {
      setSqlcode(0);
    } else {
      setSqlcode(-1);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr01(), getSqlcode());
    setResponseCodecr01(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
  }

  @Override
  protected void eOpenCr01() throws Exception {
    return;
  }

  @Override
  protected void fetchCr01() throws Exception {
    /* BEGIN: MANUAL INJECTION */
    if (cr01.hasNext()) {
      Status181 status181 = cr01.next();
      setHKoujouKubun181(status181.getKoujouKubun());
      setHKoujouControlNo181(status181.getKoujouControlNo());
      setHModel181(status181.getModel());
      setHColor181(status181.getColor());
      setHUchibari181(status181.getUchibari());
      setHExNo181(status181.getExNo());
      setHShimukechi181(status181.getShimukechi());
      setHLineMain181(status181.getLineMain());
      setHLineMetal181(status181.getLineMetal());
      setHLinePaint181(status181.getLinePaint());
      setHLineTrim181(status181.getLineTrim());
      setHKokuyuKubun181(status181.getKokuyuKubun());
      setHKijunShakei181(status181.getKijunShakei());
      setHDakokuKatashiki181(status181.getDakokuKatashiki());
      setHChassisNo181(status181.getChassisNo());
      setHEngKatashiki181(status181.getEngKatashiki());
      setHEngNo181(status181.getEngNo());
      setHOrgModel181(status181.getOrgModel());
      setHOrgColor181(status181.getOrgColor());
      setHOrgUchibari181(status181.getOrgUchibari());
      setHOrgExNo181(status181.getOrgExNo());
      setHOrgLineKubun181(status181.getOrgLineKubun());
      setHShakeiCode181(status181.getShakeiCode());
      setHShameiCode181(status181.getShameiCode());
      setHOrderKubun181(status181.getOrderKubun());
      setHDealerNo181(status181.getDealerNo());
      setHOrderNo181(status181.getOrderNo());
      setHComfirmedOrderNo181(status181.getComfirmedOrderNo());
      setHCustomerName181(status181.getCustomerName());
      setHTenjiPryCode181(status181.getTenjiPryCode());
      setHStatusPoint181(status181.getStatusPoint());
      setHJissekiJikoku01181(status181.getJissekiJikoku01().longValue());
      setHJissekiJikoku02181(status181.getJissekiJikoku02().longValue());
      setHJissekiJikoku03181(status181.getJissekiJikoku03().longValue());
      setHJissekiJikoku04181(status181.getJissekiJikoku04().longValue());
      setHJissekiJikoku05181(status181.getJissekiJikoku05().longValue());
      setHJissekiJikoku06181(status181.getJissekiJikoku06().longValue());
      setHJissekiJikoku07181(status181.getJissekiJikoku07().longValue());
      setHJissekiJikoku08181(status181.getJissekiJikoku08().longValue());
      setHJissekiJikoku09181(status181.getJissekiJikoku09().longValue());
      setHJissekiJikoku10181(status181.getJissekiJikoku10().longValue());
      setHJissekiJikoku11181(status181.getJissekiJikoku11().longValue());
      setHJissekiJikoku12181(status181.getJissekiJikoku12().longValue());
      setHJissekiJikoku13181(status181.getJissekiJikoku13().longValue());
      setHJissekiJikoku14181(status181.getJissekiJikoku14().longValue());
      setHJissekiJikoku15181(status181.getJissekiJikoku15().longValue());
      setHJissekiJikoku16181(status181.getJissekiJikoku16().longValue());
      setHJissekiJikoku17181(status181.getJissekiJikoku17().longValue());
      setHOriginalKeikaku01181(status181.getOriginalKeikaku01().longValue());
      setHOriginalKeikaku02181(status181.getOriginalKeikaku02().longValue());
      setHOriginalKeikaku03181(status181.getOriginalKeikaku03().longValue());
      setHOriginalKeikaku04181(status181.getOriginalKeikaku04().longValue());
      setHOriginalKeikaku05181(status181.getOriginalKeikaku05().longValue());
      setHOriginalKeikaku06181(status181.getOriginalKeikaku06().longValue());
      setHOriginalKeikaku07181(status181.getOriginalKeikaku07().longValue());
      setHOriginalKeikaku08181(status181.getOriginalKeikaku08().longValue());
      setHOriginalKeikaku09181(status181.getOriginalKeikaku09().longValue());
      setHOriginalKeikaku10181(status181.getOriginalKeikaku10().longValue());
      setHOriginalKeikaku11181(status181.getOriginalKeikaku11().longValue());
      setHOriginalKeikaku12181(status181.getOriginalKeikaku12().longValue());
      setHOriginalKeikaku13181(status181.getOriginalKeikaku13().longValue());
      setHOriginalKeikaku14181(status181.getOriginalKeikaku14().longValue());
      setHOriginalKeikaku15181(status181.getOriginalKeikaku15().longValue());
      setHOriginalKeikaku16181(status181.getOriginalKeikaku16().longValue());
      setHOriginalKeikaku17181(status181.getOriginalKeikaku17().longValue());
      setHRevised2Keikaku01181(status181.getRevised2Keikaku01().longValue());
      setHRevised2Keikaku02181(status181.getRevised2Keikaku02().longValue());
      setHRevised2Keikaku03181(status181.getRevised2Keikaku03().longValue());
      setHRevised2Keikaku04181(status181.getRevised2Keikaku04().longValue());
      setHRevised2Keikaku05181(status181.getRevised2Keikaku05().longValue());
      setHRevised2Keikaku06181(status181.getRevised2Keikaku06().longValue());
      setHRevised2Keikaku07181(status181.getRevised2Keikaku07().longValue());
      setHRevised2Keikaku08181(status181.getRevised2Keikaku08().longValue());
      setHRevised2Keikaku09181(status181.getRevised2Keikaku09().longValue());
      setHRevised2Keikaku10181(status181.getRevised2Keikaku10().longValue());
      setHRevised2Keikaku11181(status181.getRevised2Keikaku11().longValue());
      setHRevised2Keikaku12181(status181.getRevised2Keikaku12().longValue());
      setHRevised2Keikaku13181(status181.getRevised2Keikaku13().longValue());
      setHRevised2Keikaku14181(status181.getRevised2Keikaku14().longValue());
      setHRevised2Keikaku15181(status181.getRevised2Keikaku15().longValue());
      setHRevised2Keikaku16181(status181.getRevised2Keikaku16().longValue());
      setHRevised2Keikaku17181(status181.getRevised2Keikaku17().longValue());
      setHRevised1Keikaku01181(status181.getRevised1Keikaku01().longValue());
      setHRevised1Keikaku02181(status181.getRevised1Keikaku02().longValue());
      setHRevised1Keikaku03181(status181.getRevised1Keikaku03().longValue());
      setHRevised1Keikaku04181(status181.getRevised1Keikaku04().longValue());
      setHRevised1Keikaku05181(status181.getRevised1Keikaku05().longValue());
      setHRevised1Keikaku06181(status181.getRevised1Keikaku06().longValue());
      setHRevised1Keikaku07181(status181.getRevised1Keikaku07().longValue());
      setHRevised1Keikaku08181(status181.getRevised1Keikaku08().longValue());
      setHRevised1Keikaku09181(status181.getRevised1Keikaku09().longValue());
      setHRevised1Keikaku10181(status181.getRevised1Keikaku10().longValue());
      setHRevised1Keikaku11181(status181.getRevised1Keikaku11().longValue());
      setHRevised1Keikaku12181(status181.getRevised1Keikaku12().longValue());
      setHRevised1Keikaku13181(status181.getRevised1Keikaku13().longValue());
      setHRevised1Keikaku14181(status181.getRevised1Keikaku14().longValue());
      setHRevised1Keikaku15181(status181.getRevised1Keikaku15().longValue());
      setHRevised1Keikaku16181(status181.getRevised1Keikaku16().longValue());
      setHRevised1Keikaku17181(status181.getRevised1Keikaku17().longValue());
      setHIkkatsuSym201181(status181.getIkkatsuSym201());
      setHIkkatsuSym202181(status181.getIkkatsuSym202());
      setHIkkatsuSym203181(status181.getIkkatsuSym203());
      setHIkkatsuSym204181(status181.getIkkatsuSym204());
      setHIkkatsuSym205181(status181.getIkkatsuSym205());
      setHIkkatsuSym206181(status181.getIkkatsuSym206());
      setHIkkatsuSym207181(status181.getIkkatsuSym207());
      setHIkkatsuSym208181(status181.getIkkatsuSym208());
      setHIkkatsuSym209181(status181.getIkkatsuSym209());
      setHIkkatsuSym210181(status181.getIkkatsuSym210());
      setHIkkatsuSym211181(status181.getIkkatsuSym211());
      setHIkkatsuSym212181(status181.getIkkatsuSym212());
      setHIkkatsuSym213181(status181.getIkkatsuSym213());
      setHIkkatsuSym214181(status181.getIkkatsuSym214());
      setHIkkatsuSym215181(status181.getIkkatsuSym215());
      setHIkkatsuSym216181(status181.getIkkatsuSym216());
      setHIkkatsuSym217181(status181.getIkkatsuSym217());
      setHIkkatsuSym101181(status181.getIkkatsuSym101());
      setHIkkatsuSym102181(status181.getIkkatsuSym102());
      setHIkkatsuSym103181(status181.getIkkatsuSym103());
      setHIkkatsuSym104181(status181.getIkkatsuSym104());
      setHIkkatsuSym105181(status181.getIkkatsuSym105());
      setHIkkatsuSym106181(status181.getIkkatsuSym106());
      setHIkkatsuSym107181(status181.getIkkatsuSym107());
      setHIkkatsuSym108181(status181.getIkkatsuSym108());
      setHIkkatsuSym109181(status181.getIkkatsuSym109());
      setHIkkatsuSym110181(status181.getIkkatsuSym110());
      setHIkkatsuSym111181(status181.getIkkatsuSym111());
      setHIkkatsuSym112181(status181.getIkkatsuSym112());
      setHIkkatsuSym113181(status181.getIkkatsuSym113());
      setHIkkatsuSym114181(status181.getIkkatsuSym114());
      setHIkkatsuSym115181(status181.getIkkatsuSym115());
      setHIkkatsuSym116181(status181.getIkkatsuSym116());
      setHIkkatsuSym117181(status181.getIkkatsuSym117());
      setHYoteiInputJikoku01181(status181.getYoteiInputJikoku01().longValue());
      setHYoteiInputJikoku02181(status181.getYoteiInputJikoku02().longValue());
      setHYoteiInputJikoku03181(status181.getYoteiInputJikoku03().longValue());
      setHYoteiInputJikoku04181(status181.getYoteiInputJikoku04().longValue());
      setHYoteiInputJikoku05181(status181.getYoteiInputJikoku05().longValue());
      setHYoteiInputJikoku06181(status181.getYoteiInputJikoku06().longValue());
      setHYoteiInputJikoku07181(status181.getYoteiInputJikoku07().longValue());
      setHYoteiInputJikoku08181(status181.getYoteiInputJikoku08().longValue());
      setHYoteiInputJikoku09181(status181.getYoteiInputJikoku09().longValue());
      setHYoteiInputJikoku10181(status181.getYoteiInputJikoku10().longValue());
      setHYoteiInputJikoku11181(status181.getYoteiInputJikoku11().longValue());
      setHYoteiInputJikoku12181(status181.getYoteiInputJikoku12().longValue());
      setHYoteiInputJikoku13181(status181.getYoteiInputJikoku13().longValue());
      setHYoteiInputJikoku14181(status181.getYoteiInputJikoku14().longValue());
      setHYoteiInputJikoku15181(status181.getYoteiInputJikoku15().longValue());
      setHYoteiInputJikoku16181(status181.getYoteiInputJikoku16().longValue());
      setHYoteiInputJikoku17181(status181.getYoteiInputJikoku17().longValue());
      setHHanedashiRiyuu101181(status181.getHanedashiRiyuu101());
      setHHanedashiRiyuu102181(status181.getHanedashiRiyuu102());
      setHHanedashiRiyuu103181(status181.getHanedashiRiyuu103());
      setHHanedashiRiyuu104181(status181.getHanedashiRiyuu104());
      setHHanedashiRiyuu105181(status181.getHanedashiRiyuu105());
      setHHanedashiRiyuu106181(status181.getHanedashiRiyuu106());
      setHHanedashiRiyuu107181(status181.getHanedashiRiyuu107());
      setHHanedashiRiyuu108181(status181.getHanedashiRiyuu108());
      setHHanedashiRiyuu109181(status181.getHanedashiRiyuu109());
      setHHanedashiRiyuu110181(status181.getHanedashiRiyuu110());
      setHHanedashiRiyuu111181(status181.getHanedashiRiyuu111());
      setHHanedashiRiyuu112181(status181.getHanedashiRiyuu112());
      setHHanedashiRiyuu113181(status181.getHanedashiRiyuu113());
      setHHanedashiRiyuu114181(status181.getHanedashiRiyuu114());
      setHHanedashiRiyuu115181(status181.getHanedashiRiyuu115());
      setHHanedashiRiyuu116181(status181.getHanedashiRiyuu116());
      setHHanedashiRiyuu117181(status181.getHanedashiRiyuu117());
      setHHanedashiRiyuu201181(status181.getHanedashiRiyuu201());
      setHHanedashiRiyuu202181(status181.getHanedashiRiyuu202());
      setHHanedashiRiyuu203181(status181.getHanedashiRiyuu203());
      setHHanedashiRiyuu204181(status181.getHanedashiRiyuu204());
      setHHanedashiRiyuu205181(status181.getHanedashiRiyuu205());
      setHHanedashiRiyuu206181(status181.getHanedashiRiyuu206());
      setHHanedashiRiyuu207181(status181.getHanedashiRiyuu207());
      setHHanedashiRiyuu208181(status181.getHanedashiRiyuu208());
      setHHanedashiRiyuu209181(status181.getHanedashiRiyuu209());
      setHHanedashiRiyuu210181(status181.getHanedashiRiyuu210());
      setHHanedashiRiyuu211181(status181.getHanedashiRiyuu211());
      setHHanedashiRiyuu212181(status181.getHanedashiRiyuu212());
      setHHanedashiRiyuu213181(status181.getHanedashiRiyuu213());
      setHHanedashiRiyuu214181(status181.getHanedashiRiyuu214());
      setHHanedashiRiyuu215181(status181.getHanedashiRiyuu215());
      setHHanedashiRiyuu216181(status181.getHanedashiRiyuu216());
      setHHanedashiRiyuu217181(status181.getHanedashiRiyuu217());
      setHDeliveryLeadKotei181(status181.getDeliveryLeadKotei().longValue());
      setHDeliveryLeadYoyuu181(status181.getDeliveryLeadYoyuu().longValue());
      setHIkansaki181(status181.getIkansaki());
      setHKensaIkanShikibetsu181(status181.getKensaIkanShikibetsu());
      setHKasoushaSym181(status181.getKasoushaSym());
      setHKasouMaker181(status181.getKasouMaker());
      setHKasouKanryouLead181(status181.getKasouKanryouLead().longValue());
      setHTokkiJikou181(status181.getTokkiJikou());
      setHActSchKey181(status181.getActSchKey());
      setHActSeqNo181(status181.getActSeqNo());
      setHShataiReActSeqNo181(status181.getShataiReActSeqNo());
      setHFinalReActSeqNo181(status181.getFinalReActSeqNo());
      setHTrimSeqNo181(status181.getTrimSeqNo());
      setHOfflineSeqNo181(status181.getOfflineSeqNo());
      setHKankenYmd181(status181.getKankenYmd());
      setHMsOfflineYmd181(status181.getMsOfflineYmd());
      setHSymTokushusha181(status181.getSymTokushusha());
      setHSymKouteiKeikakuGai181(status181.getSymKouteiKeikakuGai());
      setHSymZaikoZumi181(status181.getSymZaikoZumi());
      setHSymGyakubarashiGai181(status181.getSymGyakubarashiGai());
      setHSymSenkouMiGai181(status181.getSymSenkouMiGai());
      setHSymSmDaihyou181(status181.getSymSmDaihyou());
      setHSymSmKoutei01181(status181.getSymSmKoutei01());
      setHSymSmKoutei02181(status181.getSymSmKoutei02());
      setHSymSmKoutei03181(status181.getSymSmKoutei03());
      setHSymSmKoutei04181(status181.getSymSmKoutei04());
      setHSymSmKoutei05181(status181.getSymSmKoutei05());
      setHSymSmKoutei06181(status181.getSymSmKoutei06());
      setHSymSmKoutei07181(status181.getSymSmKoutei07());
      setHSymSmKoutei08181(status181.getSymSmKoutei08());
      setHSymSmKoutei09181(status181.getSymSmKoutei09());
      setHSymSmKoutei10181(status181.getSymSmKoutei10());
      setHSymSmKoutei11181(status181.getSymSmKoutei11());
      setHSymSmKoutei12181(status181.getSymSmKoutei12());
      setHSymSmKoutei13181(status181.getSymSmKoutei13());
      setHSymSmKoutei14181(status181.getSymSmKoutei14());
      setHSymSmKoutei15181(status181.getSymSmKoutei15());
      setHSymSmKoutei16181(status181.getSymSmKoutei16());
      setHSymSmKoutei17181(status181.getSymSmKoutei17());
      setHSymZengetsuJisseki01181(status181.getSymZengetsuJisseki01());
      setHSymZengetsuJisseki02181(status181.getSymZengetsuJisseki02());
      setHSymZengetsuJisseki03181(status181.getSymZengetsuJisseki03());
      setHSymZengetsuJisseki04181(status181.getSymZengetsuJisseki04());
      setHSymZengetsuJisseki05181(status181.getSymZengetsuJisseki05());
      setHSymZengetsuJisseki06181(status181.getSymZengetsuJisseki06());
      setHSymZengetsuJisseki07181(status181.getSymZengetsuJisseki07());
      setHSymZengetsuJisseki08181(status181.getSymZengetsuJisseki08());
      setHSymZengetsuJisseki09181(status181.getSymZengetsuJisseki09());
      setHSymZengetsuJisseki10181(status181.getSymZengetsuJisseki10());
      setHSymZengetsuJisseki11181(status181.getSymZengetsuJisseki11());
      setHSymZengetsuJisseki12181(status181.getSymZengetsuJisseki12());
      setHSymZengetsuJisseki13181(status181.getSymZengetsuJisseki13());
      setHSymZengetsuJisseki14181(status181.getSymZengetsuJisseki14());
      setHSymZengetsuJisseki15181(status181.getSymZengetsuJisseki15());
      setHSymZengetsuJisseki16181(status181.getSymZengetsuJisseki16());
      setHSymZengetsuJisseki17181(status181.getSymZengetsuJisseki17());
      setHSymTlMetal181(status181.getSymTlMetal());
      setHSymTlShitaP181(status181.getSymTlShitaP());
      setHSymTlNakaP181(status181.getSymTlNakaP());
      setHSymTlPaint181(status181.getSymTlPaint());
      setHSymTlFinal181(status181.getSymTlFinal());
      setHSymTlDeliv181(status181.getSymTlDeliv());
      setHSymPipeLineGai181(status181.getSymPipeLineGai());
      setHSymPipeLineZumi181(status181.getSymPipeLineZumi());
      setHSymKeikakuMitei181(status181.getSymKeikakuMitei());
      setHSeisanHoushiki181(status181.getSeisanHoushiki());
      setHSymShisakuSha181(status181.getSymShisakuSha());
      setHSymGyakuYunyuu181(status181.getSymGyakuYunyuu());
      setHHyoujiGenzaichi181(status181.getHyoujiGenzaichi());
      setHSalesSpec10181(status181.getSalesSpec10());
      setHLocalArea181(status181.getLocalArea());
      setHTimeStamp181(status181.getTimeStamp());
      setHDelivEigyouHizuke181(status181.getDelivEigyouHizuke().longValue());
      setHSymHanedashi181(status181.getSymHanedashi());
      setHSeihinKubun181(status181.getSeihinKubun());
      setHStatus181R(status181.getRowid());

      setSqlcode(0);
    } else {
      setSqlcode(1403);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr01(), getSqlcode());
    setResponseCodecr01(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    if (getSqlcode() == 0) {
    setS181aKoujouKubun(getHKoujouKubun181());
    setS181aKoujouControlNo(getHKoujouControlNo181());
    setS181aModel(getHModel181());
    setS181aColor(getHColor181());
    setS181aUchibari(getHUchibari181());
    setS181aExNo(getHExNo181());
    setS181aShimukechi(getHShimukechi181());
    setS181aLineMain(getHLineMain181());
    setS181aLineMetal(getHLineMetal181());
    setS181aLinePaint(getHLinePaint181());
    setS181aLineTrim(getHLineTrim181());
    setS181aKokuyuKubun(getHKokuyuKubun181());
    setS181aKijunShakei(getHKijunShakei181());
    setS181aDakokuKatashiki(getHDakokuKatashiki181());
    setS181aChassisNo(getHChassisNo181());
    setS181aEngKatashiki(getHEngKatashiki181());
    setS181aEngNo(getHEngNo181());
    setS181aOrgModel(getHOrgModel181());
    setS181aOrgColor(getHOrgColor181());
    setS181aOrgUchibari(getHOrgUchibari181());
    setS181aOrgExNo(getHOrgExNo181());
    setS181aOrgLineKubun(getHOrgLineKubun181());
    setS181aShakeiCode(getHShakeiCode181());
    setS181aShameiCode(getHShameiCode181());
    setS181aOrderKubun(getHOrderKubun181());
    setS181aDealerNo(getHDealerNo181());
    setS181aOrderNo(getHOrderNo181());
    setS181aComfirmedOrderNo(getHComfirmedOrderNo181());
    setS181aCustomerName(getHCustomerName181());
    setS181aTenjiPryCode(getHTenjiPryCode181());
    setS181aStatusPoint(getHStatusPoint181());
    setS181aJissekiJikoku((int)(1 - 1), getHJissekiJikoku01181());
    setS181aJissekiJikoku((int)(2 - 1), getHJissekiJikoku02181());
    setS181aJissekiJikoku((int)(3 - 1), getHJissekiJikoku03181());
    setS181aJissekiJikoku((int)(4 - 1), getHJissekiJikoku04181());
    setS181aJissekiJikoku((int)(5 - 1), getHJissekiJikoku05181());
    setS181aJissekiJikoku((int)(6 - 1), getHJissekiJikoku06181());
    setS181aJissekiJikoku((int)(7 - 1), getHJissekiJikoku07181());
    setS181aJissekiJikoku((int)(8 - 1), getHJissekiJikoku08181());
    setS181aJissekiJikoku((int)(9 - 1), getHJissekiJikoku09181());
    setS181aJissekiJikoku((int)(10 - 1), getHJissekiJikoku10181());
    setS181aJissekiJikoku((int)(11 - 1), getHJissekiJikoku11181());
    setS181aJissekiJikoku((int)(12 - 1), getHJissekiJikoku12181());
    setS181aJissekiJikoku((int)(13 - 1), getHJissekiJikoku13181());
    setS181aJissekiJikoku((int)(14 - 1), getHJissekiJikoku14181());
    setS181aJissekiJikoku((int)(15 - 1), getHJissekiJikoku15181());
    setS181aJissekiJikoku((int)(16 - 1), getHJissekiJikoku16181());
    setS181aJissekiJikoku((int)(17 - 1), getHJissekiJikoku17181());
    setS181aOriginalKeikaku((int)(1 - 1), getHOriginalKeikaku01181());
    setS181aOriginalKeikaku((int)(2 - 1), getHOriginalKeikaku02181());
    setS181aOriginalKeikaku((int)(3 - 1), getHOriginalKeikaku03181());
    setS181aOriginalKeikaku((int)(4 - 1), getHOriginalKeikaku04181());
    setS181aOriginalKeikaku((int)(5 - 1), getHOriginalKeikaku05181());
    setS181aOriginalKeikaku((int)(6 - 1), getHOriginalKeikaku06181());
    setS181aOriginalKeikaku((int)(7 - 1), getHOriginalKeikaku07181());
    setS181aOriginalKeikaku((int)(8 - 1), getHOriginalKeikaku08181());
    setS181aOriginalKeikaku((int)(9 - 1), getHOriginalKeikaku09181());
    setS181aOriginalKeikaku((int)(10 - 1), getHOriginalKeikaku10181());
    setS181aOriginalKeikaku((int)(11 - 1), getHOriginalKeikaku11181());
    setS181aOriginalKeikaku((int)(12 - 1), getHOriginalKeikaku12181());
    setS181aOriginalKeikaku((int)(13 - 1), getHOriginalKeikaku13181());
    setS181aOriginalKeikaku((int)(14 - 1), getHOriginalKeikaku14181());
    setS181aOriginalKeikaku((int)(15 - 1), getHOriginalKeikaku15181());
    setS181aOriginalKeikaku((int)(16 - 1), getHOriginalKeikaku16181());
    setS181aOriginalKeikaku((int)(17 - 1), getHOriginalKeikaku17181());
    setS181aRevised2Keikaku((int)(1 - 1), getHRevised2Keikaku01181());
    setS181aRevised2Keikaku((int)(2 - 1), getHRevised2Keikaku02181());
    setS181aRevised2Keikaku((int)(3 - 1), getHRevised2Keikaku03181());
    setS181aRevised2Keikaku((int)(4 - 1), getHRevised2Keikaku04181());
    setS181aRevised2Keikaku((int)(5 - 1), getHRevised2Keikaku05181());
    setS181aRevised2Keikaku((int)(6 - 1), getHRevised2Keikaku06181());
    setS181aRevised2Keikaku((int)(7 - 1), getHRevised2Keikaku07181());
    setS181aRevised2Keikaku((int)(8 - 1), getHRevised2Keikaku08181());
    setS181aRevised2Keikaku((int)(9 - 1), getHRevised2Keikaku09181());
    setS181aRevised2Keikaku((int)(10 - 1), getHRevised2Keikaku10181());
    setS181aRevised2Keikaku((int)(11 - 1), getHRevised2Keikaku11181());
    setS181aRevised2Keikaku((int)(12 - 1), getHRevised2Keikaku12181());
    setS181aRevised2Keikaku((int)(13 - 1), getHRevised2Keikaku13181());
    setS181aRevised2Keikaku((int)(14 - 1), getHRevised2Keikaku14181());
    setS181aRevised2Keikaku((int)(15 - 1), getHRevised2Keikaku15181());
    setS181aRevised2Keikaku((int)(16 - 1), getHRevised2Keikaku16181());
    setS181aRevised2Keikaku((int)(17 - 1), getHRevised2Keikaku17181());
    setS181aRevised1Keikaku((int)(1 - 1), getHRevised1Keikaku01181());
    setS181aRevised1Keikaku((int)(2 - 1), getHRevised1Keikaku02181());
    setS181aRevised1Keikaku((int)(3 - 1), getHRevised1Keikaku03181());
    setS181aRevised1Keikaku((int)(4 - 1), getHRevised1Keikaku04181());
    setS181aRevised1Keikaku((int)(5 - 1), getHRevised1Keikaku05181());
    setS181aRevised1Keikaku((int)(6 - 1), getHRevised1Keikaku06181());
    setS181aRevised1Keikaku((int)(7 - 1), getHRevised1Keikaku07181());
    setS181aRevised1Keikaku((int)(8 - 1), getHRevised1Keikaku08181());
    setS181aRevised1Keikaku((int)(9 - 1), getHRevised1Keikaku09181());
    setS181aRevised1Keikaku((int)(10 - 1), getHRevised1Keikaku10181());
    setS181aRevised1Keikaku((int)(11 - 1), getHRevised1Keikaku11181());
    setS181aRevised1Keikaku((int)(12 - 1), getHRevised1Keikaku12181());
    setS181aRevised1Keikaku((int)(13 - 1), getHRevised1Keikaku13181());
    setS181aRevised1Keikaku((int)(14 - 1), getHRevised1Keikaku14181());
    setS181aRevised1Keikaku((int)(15 - 1), getHRevised1Keikaku15181());
    setS181aRevised1Keikaku((int)(16 - 1), getHRevised1Keikaku16181());
    setS181aRevised1Keikaku((int)(17 - 1), getHRevised1Keikaku17181());
    setS181aIkkatsuSym2((int)(1 - 1), getHIkkatsuSym201181());
    setS181aIkkatsuSym2((int)(2 - 1), getHIkkatsuSym202181());
    setS181aIkkatsuSym2((int)(3 - 1), getHIkkatsuSym203181());
    setS181aIkkatsuSym2((int)(4 - 1), getHIkkatsuSym204181());
    setS181aIkkatsuSym2((int)(5 - 1), getHIkkatsuSym205181());
    setS181aIkkatsuSym2((int)(6 - 1), getHIkkatsuSym206181());
    setS181aIkkatsuSym2((int)(7 - 1), getHIkkatsuSym207181());
    setS181aIkkatsuSym2((int)(8 - 1), getHIkkatsuSym208181());
    setS181aIkkatsuSym2((int)(9 - 1), getHIkkatsuSym209181());
    setS181aIkkatsuSym2((int)(10 - 1), getHIkkatsuSym210181());
    setS181aIkkatsuSym2((int)(11 - 1), getHIkkatsuSym211181());
    setS181aIkkatsuSym2((int)(12 - 1), getHIkkatsuSym212181());
    setS181aIkkatsuSym2((int)(13 - 1), getHIkkatsuSym213181());
    setS181aIkkatsuSym2((int)(14 - 1), getHIkkatsuSym214181());
    setS181aIkkatsuSym2((int)(15 - 1), getHIkkatsuSym215181());
    setS181aIkkatsuSym2((int)(16 - 1), getHIkkatsuSym216181());
    setS181aIkkatsuSym2((int)(17 - 1), getHIkkatsuSym217181());
    setS181aIkkatsuSym1((int)(1 - 1), getHIkkatsuSym101181());
    setS181aIkkatsuSym1((int)(2 - 1), getHIkkatsuSym102181());
    setS181aIkkatsuSym1((int)(3 - 1), getHIkkatsuSym103181());
    setS181aIkkatsuSym1((int)(4 - 1), getHIkkatsuSym104181());
    setS181aIkkatsuSym1((int)(5 - 1), getHIkkatsuSym105181());
    setS181aIkkatsuSym1((int)(6 - 1), getHIkkatsuSym106181());
    setS181aIkkatsuSym1((int)(7 - 1), getHIkkatsuSym107181());
    setS181aIkkatsuSym1((int)(8 - 1), getHIkkatsuSym108181());
    setS181aIkkatsuSym1((int)(9 - 1), getHIkkatsuSym109181());
    setS181aIkkatsuSym1((int)(10 - 1), getHIkkatsuSym110181());
    setS181aIkkatsuSym1((int)(11 - 1), getHIkkatsuSym111181());
    setS181aIkkatsuSym1((int)(12 - 1), getHIkkatsuSym112181());
    setS181aIkkatsuSym1((int)(13 - 1), getHIkkatsuSym113181());
    setS181aIkkatsuSym1((int)(14 - 1), getHIkkatsuSym114181());
    setS181aIkkatsuSym1((int)(15 - 1), getHIkkatsuSym115181());
    setS181aIkkatsuSym1((int)(16 - 1), getHIkkatsuSym116181());
    setS181aIkkatsuSym1((int)(17 - 1), getHIkkatsuSym117181());
    setS181aYoteiInputJikoku((int)(1 - 1), getHYoteiInputJikoku01181());
    setS181aYoteiInputJikoku((int)(2 - 1), getHYoteiInputJikoku02181());
    setS181aYoteiInputJikoku((int)(3 - 1), getHYoteiInputJikoku03181());
    setS181aYoteiInputJikoku((int)(4 - 1), getHYoteiInputJikoku04181());
    setS181aYoteiInputJikoku((int)(5 - 1), getHYoteiInputJikoku05181());
    setS181aYoteiInputJikoku((int)(6 - 1), getHYoteiInputJikoku06181());
    setS181aYoteiInputJikoku((int)(7 - 1), getHYoteiInputJikoku07181());
    setS181aYoteiInputJikoku((int)(8 - 1), getHYoteiInputJikoku08181());
    setS181aYoteiInputJikoku((int)(9 - 1), getHYoteiInputJikoku09181());
    setS181aYoteiInputJikoku((int)(10 - 1), getHYoteiInputJikoku10181());
    setS181aYoteiInputJikoku((int)(11 - 1), getHYoteiInputJikoku11181());
    setS181aYoteiInputJikoku((int)(12 - 1), getHYoteiInputJikoku12181());
    setS181aYoteiInputJikoku((int)(13 - 1), getHYoteiInputJikoku13181());
    setS181aYoteiInputJikoku((int)(14 - 1), getHYoteiInputJikoku14181());
    setS181aYoteiInputJikoku((int)(15 - 1), getHYoteiInputJikoku15181());
    setS181aYoteiInputJikoku((int)(16 - 1), getHYoteiInputJikoku16181());
    setS181aYoteiInputJikoku((int)(17 - 1), getHYoteiInputJikoku17181());
    setS181aHanedashiRiyuu1((int)(1 - 1), getHHanedashiRiyuu101181());
    setS181aHanedashiRiyuu1((int)(2 - 1), getHHanedashiRiyuu102181());
    setS181aHanedashiRiyuu1((int)(3 - 1), getHHanedashiRiyuu103181());
    setS181aHanedashiRiyuu1((int)(4 - 1), getHHanedashiRiyuu104181());
    setS181aHanedashiRiyuu1((int)(5 - 1), getHHanedashiRiyuu105181());
    setS181aHanedashiRiyuu1((int)(6 - 1), getHHanedashiRiyuu106181());
    setS181aHanedashiRiyuu1((int)(7 - 1), getHHanedashiRiyuu107181());
    setS181aHanedashiRiyuu1((int)(8 - 1), getHHanedashiRiyuu108181());
    setS181aHanedashiRiyuu1((int)(9 - 1), getHHanedashiRiyuu109181());
    setS181aHanedashiRiyuu1((int)(10 - 1), getHHanedashiRiyuu110181());
    setS181aHanedashiRiyuu1((int)(11 - 1), getHHanedashiRiyuu111181());
    setS181aHanedashiRiyuu1((int)(12 - 1), getHHanedashiRiyuu112181());
    setS181aHanedashiRiyuu1((int)(13 - 1), getHHanedashiRiyuu113181());
    setS181aHanedashiRiyuu1((int)(14 - 1), getHHanedashiRiyuu114181());
    setS181aHanedashiRiyuu1((int)(15 - 1), getHHanedashiRiyuu115181());
    setS181aHanedashiRiyuu1((int)(16 - 1), getHHanedashiRiyuu116181());
    setS181aHanedashiRiyuu1((int)(17 - 1), getHHanedashiRiyuu117181());
    setS181aHanedashiRiyuu2((int)(1 - 1), getHHanedashiRiyuu201181());
    setS181aHanedashiRiyuu2((int)(2 - 1), getHHanedashiRiyuu202181());
    setS181aHanedashiRiyuu2((int)(3 - 1), getHHanedashiRiyuu203181());
    setS181aHanedashiRiyuu2((int)(4 - 1), getHHanedashiRiyuu204181());
    setS181aHanedashiRiyuu2((int)(5 - 1), getHHanedashiRiyuu205181());
    setS181aHanedashiRiyuu2((int)(6 - 1), getHHanedashiRiyuu206181());
    setS181aHanedashiRiyuu2((int)(7 - 1), getHHanedashiRiyuu207181());
    setS181aHanedashiRiyuu2((int)(8 - 1), getHHanedashiRiyuu208181());
    setS181aHanedashiRiyuu2((int)(9 - 1), getHHanedashiRiyuu209181());
    setS181aHanedashiRiyuu2((int)(10 - 1), getHHanedashiRiyuu210181());
    setS181aHanedashiRiyuu2((int)(11 - 1), getHHanedashiRiyuu211181());
    setS181aHanedashiRiyuu2((int)(12 - 1), getHHanedashiRiyuu212181());
    setS181aHanedashiRiyuu2((int)(13 - 1), getHHanedashiRiyuu213181());
    setS181aHanedashiRiyuu2((int)(14 - 1), getHHanedashiRiyuu214181());
    setS181aHanedashiRiyuu2((int)(15 - 1), getHHanedashiRiyuu215181());
    setS181aHanedashiRiyuu2((int)(16 - 1), getHHanedashiRiyuu216181());
    setS181aHanedashiRiyuu2((int)(17 - 1), getHHanedashiRiyuu217181());
    setS181aDeliveryLeadKotei(getHDeliveryLeadKotei181());
    setS181aDeliveryLeadYoyuu(getHDeliveryLeadYoyuu181());
    setS181aIkansaki(getHIkansaki181());
    setS181aKensaIkanShikibetsu(getHKensaIkanShikibetsu181());
    setS181aKasoushaSym(getHKasoushaSym181());
    setS181aKasouMaker(getHKasouMaker181());
    setS181aKasouKanryouLead(getHKasouKanryouLead181());
    setS181aTokkiJikou(getHTokkiJikou181());
    setS181aActSchKey(getHActSchKey181());
    setS181aActSeqNo(getHActSeqNo181());
    setS181aShataiReActSeqNo(getHShataiReActSeqNo181());
    setS181aFinalReActSeqNo(getHFinalReActSeqNo181());
    setS181aTrimSeqNo(getHTrimSeqNo181());
    setS181aOfflineSeqNo(getHOfflineSeqNo181());
    setS181aKankenYmd(getHKankenYmd181());
    setS181aMsOfflineYmd(getHMsOfflineYmd181());
    setS181aSymTokushusha(getHSymTokushusha181());
    setS181aSymKouteiKeikakuGai(getHSymKouteiKeikakuGai181());
    setS181aSymZaikoZumi(getHSymZaikoZumi181());
    setS181aSymGyakubarashiGai(getHSymGyakubarashiGai181());
    setS181aSymSenkouMiGai(getHSymSenkouMiGai181());
    setS181aSymSmDaihyou(getHSymSmDaihyou181());
    setS181aSymSmKoutei((int)(1 - 1), getHSymSmKoutei01181());
    setS181aSymSmKoutei((int)(2 - 1), getHSymSmKoutei02181());
    setS181aSymSmKoutei((int)(3 - 1), getHSymSmKoutei03181());
    setS181aSymSmKoutei((int)(4 - 1), getHSymSmKoutei04181());
    setS181aSymSmKoutei((int)(5 - 1), getHSymSmKoutei05181());
    setS181aSymSmKoutei((int)(6 - 1), getHSymSmKoutei06181());
    setS181aSymSmKoutei((int)(7 - 1), getHSymSmKoutei07181());
    setS181aSymSmKoutei((int)(8 - 1), getHSymSmKoutei08181());
    setS181aSymSmKoutei((int)(9 - 1), getHSymSmKoutei09181());
    setS181aSymSmKoutei((int)(10 - 1), getHSymSmKoutei10181());
    setS181aSymSmKoutei((int)(11 - 1), getHSymSmKoutei11181());
    setS181aSymSmKoutei((int)(12 - 1), getHSymSmKoutei12181());
    setS181aSymSmKoutei((int)(13 - 1), getHSymSmKoutei13181());
    setS181aSymSmKoutei((int)(14 - 1), getHSymSmKoutei14181());
    setS181aSymSmKoutei((int)(15 - 1), getHSymSmKoutei15181());
    setS181aSymSmKoutei((int)(16 - 1), getHSymSmKoutei16181());
    setS181aSymSmKoutei((int)(17 - 1), getHSymSmKoutei17181());
    setS181aSymZengetsuJisseki((int)(1 - 1), getHSymZengetsuJisseki01181());
    setS181aSymZengetsuJisseki((int)(2 - 1), getHSymZengetsuJisseki02181());
    setS181aSymZengetsuJisseki((int)(3 - 1), getHSymZengetsuJisseki03181());
    setS181aSymZengetsuJisseki((int)(4 - 1), getHSymZengetsuJisseki04181());
    setS181aSymZengetsuJisseki((int)(5 - 1), getHSymZengetsuJisseki05181());
    setS181aSymZengetsuJisseki((int)(6 - 1), getHSymZengetsuJisseki06181());
    setS181aSymZengetsuJisseki((int)(7 - 1), getHSymZengetsuJisseki07181());
    setS181aSymZengetsuJisseki((int)(8 - 1), getHSymZengetsuJisseki08181());
    setS181aSymZengetsuJisseki((int)(9 - 1), getHSymZengetsuJisseki09181());
    setS181aSymZengetsuJisseki((int)(10 - 1), getHSymZengetsuJisseki10181());
    setS181aSymZengetsuJisseki((int)(11 - 1), getHSymZengetsuJisseki11181());
    setS181aSymZengetsuJisseki((int)(12 - 1), getHSymZengetsuJisseki12181());
    setS181aSymZengetsuJisseki((int)(13 - 1), getHSymZengetsuJisseki13181());
    setS181aSymZengetsuJisseki((int)(14 - 1), getHSymZengetsuJisseki14181());
    setS181aSymZengetsuJisseki((int)(15 - 1), getHSymZengetsuJisseki15181());
    setS181aSymZengetsuJisseki((int)(16 - 1), getHSymZengetsuJisseki16181());
    setS181aSymZengetsuJisseki((int)(17 - 1), getHSymZengetsuJisseki17181());
    setS181aSymTlMetal(getHSymTlMetal181());
    setS181aSymTlShitaP(getHSymTlShitaP181());
    setS181aSymTlNakaP(getHSymTlNakaP181());
    setS181aSymTlPaint(getHSymTlPaint181());
    setS181aSymTlFinal(getHSymTlFinal181());
    setS181aSymTlDeliv(getHSymTlDeliv181());
    setS181aSymPipeLineGai(getHSymPipeLineGai181());
    setS181aSymPipeLineZumi(getHSymPipeLineZumi181());
    setS181aSymKeikakuMitei(getHSymKeikakuMitei181());
    setS181aSeisanHoushiki(getHSeisanHoushiki181());
    setS181aSymShisakuSha(getHSymShisakuSha181());
    setS181aSymGyakuYunyuu(getHSymGyakuYunyuu181());
    setS181aHyoujiGenzaichi(getHHyoujiGenzaichi181());
    setS181aSalesSpec10(getHSalesSpec10181());
    setS181aLocalArea(getHLocalArea181());
    setS181aTimeStamp(getHTimeStamp181());
    setS181aDelivEigyouHizuke(getHDelivEigyouHizuke181());
    setS181aSymHanedashi(getHSymHanedashi181());
    setS181aSeihinKubun(getHSeihinKubun181());
    }
  }

  @Override
  protected void eFetchCr01() throws Exception {
    return;
  }

  @Override
  protected void closeCr01() throws Exception {
    if (CommonUtils.compareString(getCr01Opened(), "Y") == 0) {
    /* BEGIN: MANUAL INJECTION */
    setSqlcode(0);
    /* END : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr01(), getSqlcode());
    setResponseCodecr01(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    }
    setCr01Opened("N");
  }

  @Override
  protected void eCloseCr01() throws Exception {
    return;
  }

  @Override
  protected void openCr02() throws Exception {
    if (CommonUtils.compareString(getCr02Opened(), "Y") == 0) {
    }
    setCr02Opened("Y");
    /* BEGIN: MANUAL INJECTION */
    cr02 = shiyou182Repository.findAll().iterator();
    if (cr02 != null) {
      setSqlcode(0);
    } else {
      setSqlcode(-1);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr02(), getSqlcode());
    setResponseCodecr02(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
  }

  @Override
  protected void eOpenCr02() throws Exception {
    return;
  }

  @Override
  protected void fetchCr02() throws Exception {
    /* BEGIN: MANUAL INJECTION */
    if (cr02.hasNext()) {
      Shiyou182 shiyou182 = cr02.next();
      setHKoujouKubun182(shiyou182.getKoujouKubun());
      setHModel182(shiyou182.getModel());
      setHColorUchibariEx182(shiyou182.getColorUchibariEx());
      setHLineTrim182(shiyou182.getLineTrim());
      setHKokuyuKubun182(shiyou182.getKokuyuKubun());
      setHYymm182(shiyou182.getYymm());
      setHKouteiId182(shiyou182.getKouteiId());
      setHJissekiZengetsu182(shiyou182.getJissekiZengetsu().longValue());
      setHJissekiTougetsu182(shiyou182.getJissekiTougetsu());
      setHJissekiJigetsu182(shiyou182.getJissekiJigetsu());
      setHRuisaZenZengetsu182(shiyou182.getRuisaZenZengetsu().longValue());
      setHKeikakuZengetsu182(shiyou182.getKeikakuZengetsu().longValue());
      setHRuisaZengetsu182(shiyou182.getRuisaZengetsu().longValue());
      setHKeikakuTougetsu182(shiyou182.getKeikakuTougetsu());
      setHKeikakuJigetsu182(shiyou182.getKeikakuJigetsu());
      setHIkanZengetsu182(shiyou182.getIkanZengetsu().longValue());
      setHIkanTougetsu182(shiyou182.getIkanTougetsu().longValue());
      setHIkanJigetsu182(shiyou182.getIkanJigetsu().longValue());
      setHShikyuuZengetsu182(shiyou182.getShikyuuZengetsu().longValue());
      setHShikyuuTougetsu182(shiyou182.getShikyuuTougetsu().longValue());
      setHShikyuuJigetsu182(shiyou182.getShikyuuJigetsu().longValue());
      setHMikenZenZengetsu182(shiyou182.getMikenZenZengetsu().longValue());
      setHMikenZengetsu182(shiyou182.getMikenZengetsu().longValue());
      setHKankenZenZengetsu182(shiyou182.getKankenZenZengetsu().longValue());
      setHKankenZengetsu182(shiyou182.getKankenZengetsu().longValue());
      setHShiyou182R(shiyou182.getRowid());

      setSqlcode(0);
    } else {
      setSqlcode(1403);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr02(), getSqlcode());
    setResponseCodecr02(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    if (getSqlcode() == 0) {
    setS182aKoujouKubun(getHKoujouKubun182());
    setS182aModel(getHModel182());
    setS182aColorUchibariEx(getHColorUchibariEx182());
    setS182aLineTrim(getHLineTrim182());
    setS182aKokuyuKubun(getHKokuyuKubun182());
    setS182aYymm(getHYymm182());
    setS182aKouteiId(getHKouteiId182());
    setS182aJissekiZengetsu(getHJissekiZengetsu182());
    {
    List<Object> results = call(pack182, getHJissekiTougetsu182(), getS182aJissekiTougetsu(), 63);
    setHJissekiTougetsu182(results.get(0).toString());
    setS182aJissekiTougetsu(results.get(1).toString());
    }
    {
    List<Object> results = call(pack182, getHJissekiJigetsu182(), getS182aJissekiJigetsu(), 41);
    setHJissekiJigetsu182(results.get(0).toString());
    setS182aJissekiJigetsu(results.get(1).toString());
    }
    setS182aRuisaZenZengetsu(getHRuisaZenZengetsu182());
    setS182aKeikakuZengetsu(getHKeikakuZengetsu182());
    setS182aRuisaZengetsu(getHRuisaZengetsu182());
    {
    List<Object> results = call(pack182, getHKeikakuTougetsu182(), getS182aKeikakuTougetsu(), 63);
    setHKeikakuTougetsu182(results.get(0).toString());
    setS182aKeikakuTougetsu(results.get(1).toString());
    }
    {
    List<Object> results = call(pack182, getHKeikakuJigetsu182(), getS182aKeikakuJigetsu(), 41);
    setHKeikakuJigetsu182(results.get(0).toString());
    setS182aKeikakuJigetsu(results.get(1).toString());
    }
    setS182aIkanZengetsu(getHIkanZengetsu182());
    setS182aIkanTougetsu(getHIkanTougetsu182());
    setS182aIkanJigetsu(getHIkanJigetsu182());
    setS182aShikyuuZengetsu(getHShikyuuZengetsu182());
    setS182aShikyuuTougetsu(getHShikyuuTougetsu182());
    setS182aShikyuuJigetsu(getHShikyuuJigetsu182());
    setS182aMikenZenZengetsu(getHMikenZenZengetsu182());
    setS182aMikenZengetsu(getHMikenZengetsu182());
    setS182aKankenZenZengetsu(getHKankenZenZengetsu182());
    setS182aKankenZengetsu(getHKankenZengetsu182());
    }
  }

  @Override
  protected void eFetchCr02() throws Exception {
    return;
  }

  @Override
  protected void closeCr02() throws Exception {
    if (CommonUtils.compareString(getCr02Opened(), "Y") == 0) {
    /* BEGIN: MANUAL INJECTION */
    setSqlcode(0);
    /* END : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr02(), getSqlcode());
    setResponseCodecr02(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    }
    setCr02Opened("N");
  }

  @Override
  protected void eCloseCr02() throws Exception {
    return;
  }

  @Override
  protected void openCr03() throws Exception {
    if (CommonUtils.compareString(getCr03Opened(), "Y") == 0) {
    }
    setCr03Opened("Y");
    /* BEGIN: MANUAL INJECTION */
    cr03 = shakei183Repository.findAll().iterator();
    if (cr03 != null) {
      setSqlcode(0);
    } else {
      setSqlcode(-1);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr03(), getSqlcode());
    setResponseCodecr03(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
  }

  @Override
  protected void eOpenCr03() throws Exception {
    return;
  }

  @Override
  protected void fetchCr03() throws Exception {
    /* BEGIN: MANUAL INJECTION */
    if (cr03.hasNext()) {
      Shakei183 shakei183 = cr03.next();
      setHKoujouKubun183(shakei183.getKoujouKubun());
      setHShakeiCode183(shakei183.getShakeiCode());
      setHLineKubun183(shakei183.getLineKubun());
      setHYymm183(shakei183.getYymm());
      setHKouteiId183(shakei183.getKouteiId());
      setHJissekiZengetsu183(shakei183.getJissekiZengetsu().longValue());
      setHJissekiTougetsu183(shakei183.getJissekiTougetsu());
      setHJissekiJigetsu183(shakei183.getJissekiJigetsu());
      setHRuisaZenZengetsu183(shakei183.getRuisaZenZengetsu().longValue());
      setHKeikakuZengetsu183(shakei183.getKeikakuZengetsu().longValue());
      setHRuisaZengetsu183(shakei183.getRuisaZengetsu().longValue());
      setHKeikakuTougetsu183(shakei183.getKeikakuTougetsu());
      setHKeikakuJigetsu183(shakei183.getKeikakuJigetsu());
      setHZenZenShift183(shakei183.getZenZenShift().longValue());
      setHZenShift183(shakei183.getZenShift().longValue());
      setHTouShift183(shakei183.getTouShift().longValue());
      setHJiShift183(shakei183.getJiShift().longValue());
      setHJissekiOhMetal101183(shakei183.getJissekiOhMetal101().longValue());
      setHJissekiOhMetal102183(shakei183.getJissekiOhMetal102().longValue());
      setHJissekiOhMetal103183(shakei183.getJissekiOhMetal103().longValue());
      setHJissekiOhMetal104183(shakei183.getJissekiOhMetal104().longValue());
      setHJissekiOhMetal201183(shakei183.getJissekiOhMetal201().longValue());
      setHJissekiOhMetal202183(shakei183.getJissekiOhMetal202().longValue());
      setHJissekiOhMetal203183(shakei183.getJissekiOhMetal203().longValue());
      setHJissekiOhMetal204183(shakei183.getJissekiOhMetal204().longValue());
      setHJissekiOhWbs01183(shakei183.getJissekiOhWbs01().longValue());
      setHJissekiOhWbs02183(shakei183.getJissekiOhWbs02().longValue());
      setHJissekiOhWbs03183(shakei183.getJissekiOhWbs03().longValue());
      setHJissekiOhWbs04183(shakei183.getJissekiOhWbs04().longValue());
      setHJissekiOhShitaP01183(shakei183.getJissekiOhShitaP01().longValue());
      setHJissekiOhShitaP02183(shakei183.getJissekiOhShitaP02().longValue());
      setHJissekiOhShitaP03183(shakei183.getJissekiOhShitaP03().longValue());
      setHJissekiOhShitaP04183(shakei183.getJissekiOhShitaP04().longValue());
      setHJissekiOhNakaP01183(shakei183.getJissekiOhNakaP01().longValue());
      setHJissekiOhNakaP02183(shakei183.getJissekiOhNakaP02().longValue());
      setHJissekiOhNakaP03183(shakei183.getJissekiOhNakaP03().longValue());
      setHJissekiOhNakaP04183(shakei183.getJissekiOhNakaP04().longValue());
      setHJissekiOhUwaP01183(shakei183.getJissekiOhUwaP01().longValue());
      setHJissekiOhUwaP02183(shakei183.getJissekiOhUwaP02().longValue());
      setHJissekiOhUwaP03183(shakei183.getJissekiOhUwaP03().longValue());
      setHJissekiOhUwaP04183(shakei183.getJissekiOhUwaP04().longValue());
      setHJissekiOhPbs01183(shakei183.getJissekiOhPbs01().longValue());
      setHJissekiOhPbs02183(shakei183.getJissekiOhPbs02().longValue());
      setHJissekiOhPbs03183(shakei183.getJissekiOhPbs03().longValue());
      setHJissekiOhPbs04183(shakei183.getJissekiOhPbs04().longValue());
      setHJissekiOhPreTrim01183(shakei183.getJissekiOhPreTrim01().longValue());
      setHJissekiOhPreTrim02183(shakei183.getJissekiOhPreTrim02().longValue());
      setHJissekiOhPreTrim03183(shakei183.getJissekiOhPreTrim03().longValue());
      setHJissekiOhPreTrim04183(shakei183.getJissekiOhPreTrim04().longValue());
      setHJikkekiOhTrim01183(shakei183.getJikkekiOhTrim01().longValue());
      setHJikkekiOhTrim02183(shakei183.getJikkekiOhTrim02().longValue());
      setHJikkekiOhTrim03183(shakei183.getJikkekiOhTrim03().longValue());
      setHJikkekiOhTrim04183(shakei183.getJikkekiOhTrim04().longValue());
      setHJikkekiOhFinal01183(shakei183.getJikkekiOhFinal01().longValue());
      setHJikkekiOhFinal02183(shakei183.getJikkekiOhFinal02().longValue());
      setHJikkekiOhFinal03183(shakei183.getJikkekiOhFinal03().longValue());
      setHJikkekiOhFinal04183(shakei183.getJikkekiOhFinal04().longValue());
      setHJikkekiOhKasou01183(shakei183.getJikkekiOhKasou01().longValue());
      setHJikkekiOhKasou02183(shakei183.getJikkekiOhKasou02().longValue());
      setHJikkekiOhKasou03183(shakei183.getJikkekiOhKasou03().longValue());
      setHJikkekiOhKasou04183(shakei183.getJikkekiOhKasou04().longValue());
      setHJikkekiOhDeliv01183(shakei183.getJikkekiOhDeliv01().longValue());
      setHJikkekiOhDeliv02183(shakei183.getJikkekiOhDeliv02().longValue());
      setHJikkekiOhDeliv03183(shakei183.getJikkekiOhDeliv03().longValue());
      setHJikkekiOhDeliv04183(shakei183.getJikkekiOhDeliv04().longValue());
      setHJikkekiOhUkeire01183(shakei183.getJikkekiOhUkeire01().longValue());
      setHJikkekiOhUkeire02183(shakei183.getJikkekiOhUkeire02().longValue());
      setHJikkekiOhUkeire03183(shakei183.getJikkekiOhUkeire03().longValue());
      setHJikkekiOhUkeire04183(shakei183.getJikkekiOhUkeire04().longValue());
      setHKeikakuOhMetal101183(shakei183.getKeikakuOhMetal101().longValue());
      setHKeikakuOhMetal102183(shakei183.getKeikakuOhMetal102().longValue());
      setHKeikakuOhMetal103183(shakei183.getKeikakuOhMetal103().longValue());
      setHKeikakuOhMetal104183(shakei183.getKeikakuOhMetal104().longValue());
      setHKeikakuOhMetal201183(shakei183.getKeikakuOhMetal201().longValue());
      setHKeikakuOhMetal202183(shakei183.getKeikakuOhMetal202().longValue());
      setHKeikakuOhMetal203183(shakei183.getKeikakuOhMetal203().longValue());
      setHKeikakuOhMetal204183(shakei183.getKeikakuOhMetal204().longValue());
      setHKeikakuOhWbs01183(shakei183.getKeikakuOhWbs01().longValue());
      setHKeikakuOhWbs02183(shakei183.getKeikakuOhWbs02().longValue());
      setHKeikakuOhWbs03183(shakei183.getKeikakuOhWbs03().longValue());
      setHKeikakuOhWbs04183(shakei183.getKeikakuOhWbs04().longValue());
      setHKeikakuOhShitaP01183(shakei183.getKeikakuOhShitaP01().longValue());
      setHKeikakuOhShitaP02183(shakei183.getKeikakuOhShitaP02().longValue());
      setHKeikakuOhShitaP03183(shakei183.getKeikakuOhShitaP03().longValue());
      setHKeikakuOhShitaP04183(shakei183.getKeikakuOhShitaP04().longValue());
      setHKeikakuOhNakaP01183(shakei183.getKeikakuOhNakaP01().longValue());
      setHKeikakuOhNakaP02183(shakei183.getKeikakuOhNakaP02().longValue());
      setHKeikakuOhNakaP03183(shakei183.getKeikakuOhNakaP03().longValue());
      setHKeikakuOhNakaP04183(shakei183.getKeikakuOhNakaP04().longValue());
      setHKeikakuOhUwaP01183(shakei183.getKeikakuOhUwaP01().longValue());
      setHKeikakuOhUwaP02183(shakei183.getKeikakuOhUwaP02().longValue());
      setHKeikakuOhUwaP03183(shakei183.getKeikakuOhUwaP03().longValue());
      setHKeikakuOhUwaP04183(shakei183.getKeikakuOhUwaP04().longValue());
      setHKeikakuOhPbs01183(shakei183.getKeikakuOhPbs01().longValue());
      setHKeikakuOhPbs02183(shakei183.getKeikakuOhPbs02().longValue());
      setHKeikakuOhPbs03183(shakei183.getKeikakuOhPbs03().longValue());
      setHKeikakuOhPbs04183(shakei183.getKeikakuOhPbs04().longValue());
      setHKeikakuOhPreTrim01183(shakei183.getKeikakuOhPreTrim01().longValue());
      setHKeikakuOhPreTrim02183(shakei183.getKeikakuOhPreTrim02().longValue());
      setHKeikakuOhPreTrim03183(shakei183.getKeikakuOhPreTrim03().longValue());
      setHKeikakuOhPreTrim04183(shakei183.getKeikakuOhPreTrim04().longValue());
      setHKeikakuOhTrim01183(shakei183.getKeikakuOhTrim01().longValue());
      setHKeikakuOhTrim02183(shakei183.getKeikakuOhTrim02().longValue());
      setHKeikakuOhTrim03183(shakei183.getKeikakuOhTrim03().longValue());
      setHKeikakuOhTrim04183(shakei183.getKeikakuOhTrim04().longValue());
      setHKeikakuOhFinal01183(shakei183.getKeikakuOhFinal01().longValue());
      setHKeikakuOhFinal02183(shakei183.getKeikakuOhFinal02().longValue());
      setHKeikakuOhFinal03183(shakei183.getKeikakuOhFinal03().longValue());
      setHKeikakuOhFinal04183(shakei183.getKeikakuOhFinal04().longValue());
      setHKeikakuOhKasou01183(shakei183.getKeikakuOhKasou01().longValue());
      setHKeikakuOhKasou02183(shakei183.getKeikakuOhKasou02().longValue());
      setHKeikakuOhKasou03183(shakei183.getKeikakuOhKasou03().longValue());
      setHKeikakuOhKasou04183(shakei183.getKeikakuOhKasou04().longValue());
      setHKeikakuOhDeliv01183(shakei183.getKeikakuOhDeliv01().longValue());
      setHKeikakuOhDeliv02183(shakei183.getKeikakuOhDeliv02().longValue());
      setHKeikakuOhDeliv03183(shakei183.getKeikakuOhDeliv03().longValue());
      setHKeikakuOhDeliv04183(shakei183.getKeikakuOhDeliv04().longValue());
      setHKeikakuOhUkeire01183(shakei183.getKeikakuOhUkeire01().longValue());
      setHKeikakuOhUkeire02183(shakei183.getKeikakuOhUkeire02().longValue());
      setHKeikakuOhUkeire03183(shakei183.getKeikakuOhUkeire03().longValue());
      setHKeikakuOhUkeire04183(shakei183.getKeikakuOhUkeire04().longValue());
      setHShakei183R(shakei183.getRowid());

      setSqlcode(0);
    } else {
      setSqlcode(1403);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr03(), getSqlcode());
    setResponseCodecr03(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    if (getSqlcode() == 0) {
    setS183aKoujouKubun(getHKoujouKubun183());
    setS183aShakeiCode(getHShakeiCode183());
    setS183aLineKubun(getHLineKubun183());
    setS183aYymm(getHYymm183());
    setS183aKouteiId(getHKouteiId183());
    setS183aJissekiZengetsu(getHJissekiZengetsu183());
    {
    List<Object> results = call(pack183, getHJissekiTougetsu183(), getS183aJissekiTougetsu(), 63);
    setHJissekiTougetsu183(results.get(0).toString());
    setS183aJissekiTougetsu(results.get(1).toString());
    }
    {
    List<Object> results = call(pack183, getHJissekiJigetsu183(), getS183aJissekiJigetsu(), 41);
    setHJissekiJigetsu183(results.get(0).toString());
    setS183aJissekiJigetsu(results.get(1).toString());
    }
    setS183aRuisaZenZengetsu(getHRuisaZenZengetsu183());
    setS183aKeikakuZengetsu(getHKeikakuZengetsu183());
    setS183aRuisaZengetsu(getHRuisaZengetsu183());
    {
    List<Object> results = call(pack183, getHKeikakuTougetsu183(), getS183aKeikakuTougetsu(), 63);
    setHKeikakuTougetsu183(results.get(0).toString());
    setS183aKeikakuTougetsu(results.get(1).toString());
    }
    {
    List<Object> results = call(pack183, getHKeikakuJigetsu183(), getS183aKeikakuJigetsu(), 41);
    setHKeikakuJigetsu183(results.get(0).toString());
    setS183aKeikakuJigetsu(results.get(1).toString());
    }
    setS183aZenZenShift(getHZenZenShift183());
    setS183aZenShift(getHZenShift183());
    setS183aTouShift(getHTouShift183());
    setS183aJiShift(getHJiShift183());
    setS183aJissekiOhMetal1((int)(1 - 1), getHJissekiOhMetal101183());
    setS183aJissekiOhMetal1((int)(2 - 1), getHJissekiOhMetal102183());
    setS183aJissekiOhMetal1((int)(3 - 1), getHJissekiOhMetal103183());
    setS183aJissekiOhMetal1((int)(4 - 1), getHJissekiOhMetal104183());
    setS183aJissekiOhMetal2((int)(1 - 1), getHJissekiOhMetal201183());
    setS183aJissekiOhMetal2((int)(2 - 1), getHJissekiOhMetal202183());
    setS183aJissekiOhMetal2((int)(3 - 1), getHJissekiOhMetal203183());
    setS183aJissekiOhMetal2((int)(4 - 1), getHJissekiOhMetal204183());
    setS183aJissekiOhWbs((int)(1 - 1), getHJissekiOhWbs01183());
    setS183aJissekiOhWbs((int)(2 - 1), getHJissekiOhWbs02183());
    setS183aJissekiOhWbs((int)(3 - 1), getHJissekiOhWbs03183());
    setS183aJissekiOhWbs((int)(4 - 1), getHJissekiOhWbs04183());
    setS183aJissekiOhShitaP((int)(1 - 1), getHJissekiOhShitaP01183());
    setS183aJissekiOhShitaP((int)(2 - 1), getHJissekiOhShitaP02183());
    setS183aJissekiOhShitaP((int)(3 - 1), getHJissekiOhShitaP03183());
    setS183aJissekiOhShitaP((int)(4 - 1), getHJissekiOhShitaP04183());
    setS183aJissekiOhNakaP((int)(1 - 1), getHJissekiOhNakaP01183());
    setS183aJissekiOhNakaP((int)(2 - 1), getHJissekiOhNakaP02183());
    setS183aJissekiOhNakaP((int)(3 - 1), getHJissekiOhNakaP03183());
    setS183aJissekiOhNakaP((int)(4 - 1), getHJissekiOhNakaP04183());
    setS183aJissekiOhUwaP((int)(1 - 1), getHJissekiOhUwaP01183());
    setS183aJissekiOhUwaP((int)(2 - 1), getHJissekiOhUwaP02183());
    setS183aJissekiOhUwaP((int)(3 - 1), getHJissekiOhUwaP03183());
    setS183aJissekiOhUwaP((int)(4 - 1), getHJissekiOhUwaP04183());
    setS183aJissekiOhPbs((int)(1 - 1), getHJissekiOhPbs01183());
    setS183aJissekiOhPbs((int)(2 - 1), getHJissekiOhPbs02183());
    setS183aJissekiOhPbs((int)(3 - 1), getHJissekiOhPbs03183());
    setS183aJissekiOhPbs((int)(4 - 1), getHJissekiOhPbs04183());
    setS183aJissekiOhPreTrim((int)(1 - 1), getHJissekiOhPreTrim01183());
    setS183aJissekiOhPreTrim((int)(2 - 1), getHJissekiOhPreTrim02183());
    setS183aJissekiOhPreTrim((int)(3 - 1), getHJissekiOhPreTrim03183());
    setS183aJissekiOhPreTrim((int)(4 - 1), getHJissekiOhPreTrim04183());
    setS183aJikkekiOhTrim((int)(1 - 1), getHJikkekiOhTrim01183());
    setS183aJikkekiOhTrim((int)(2 - 1), getHJikkekiOhTrim02183());
    setS183aJikkekiOhTrim((int)(3 - 1), getHJikkekiOhTrim03183());
    setS183aJikkekiOhTrim((int)(4 - 1), getHJikkekiOhTrim04183());
    setS183aJikkekiOhFinal((int)(1 - 1), getHJikkekiOhFinal01183());
    setS183aJikkekiOhFinal((int)(2 - 1), getHJikkekiOhFinal02183());
    setS183aJikkekiOhFinal((int)(3 - 1), getHJikkekiOhFinal03183());
    setS183aJikkekiOhFinal((int)(4 - 1), getHJikkekiOhFinal04183());
    setS183aJikkekiOhKasou((int)(1 - 1), getHJikkekiOhKasou01183());
    setS183aJikkekiOhKasou((int)(2 - 1), getHJikkekiOhKasou02183());
    setS183aJikkekiOhKasou((int)(3 - 1), getHJikkekiOhKasou03183());
    setS183aJikkekiOhKasou((int)(4 - 1), getHJikkekiOhKasou04183());
    setS183aJikkekiOhDeliv((int)(1 - 1), getHJikkekiOhDeliv01183());
    setS183aJikkekiOhDeliv((int)(2 - 1), getHJikkekiOhDeliv02183());
    setS183aJikkekiOhDeliv((int)(3 - 1), getHJikkekiOhDeliv03183());
    setS183aJikkekiOhDeliv((int)(4 - 1), getHJikkekiOhDeliv04183());
    setS183aJikkekiOhUkeire((int)(1 - 1), getHJikkekiOhUkeire01183());
    setS183aJikkekiOhUkeire((int)(2 - 1), getHJikkekiOhUkeire02183());
    setS183aJikkekiOhUkeire((int)(3 - 1), getHJikkekiOhUkeire03183());
    setS183aJikkekiOhUkeire((int)(4 - 1), getHJikkekiOhUkeire04183());
    setS183aKeikakuOhMetal1((int)(1 - 1), getHKeikakuOhMetal101183());
    setS183aKeikakuOhMetal1((int)(2 - 1), getHKeikakuOhMetal102183());
    setS183aKeikakuOhMetal1((int)(3 - 1), getHKeikakuOhMetal103183());
    setS183aKeikakuOhMetal1((int)(4 - 1), getHKeikakuOhMetal104183());
    setS183aKeikakuOhMetal2((int)(1 - 1), getHKeikakuOhMetal201183());
    setS183aKeikakuOhMetal2((int)(2 - 1), getHKeikakuOhMetal202183());
    setS183aKeikakuOhMetal2((int)(3 - 1), getHKeikakuOhMetal203183());
    setS183aKeikakuOhMetal2((int)(4 - 1), getHKeikakuOhMetal204183());
    setS183aKeikakuOhWbs((int)(1 - 1), getHKeikakuOhWbs01183());
    setS183aKeikakuOhWbs((int)(2 - 1), getHKeikakuOhWbs02183());
    setS183aKeikakuOhWbs((int)(3 - 1), getHKeikakuOhWbs03183());
    setS183aKeikakuOhWbs((int)(4 - 1), getHKeikakuOhWbs04183());
    setS183aKeikakuOhShitaP((int)(1 - 1), getHKeikakuOhShitaP01183());
    setS183aKeikakuOhShitaP((int)(2 - 1), getHKeikakuOhShitaP02183());
    setS183aKeikakuOhShitaP((int)(3 - 1), getHKeikakuOhShitaP03183());
    setS183aKeikakuOhShitaP((int)(4 - 1), getHKeikakuOhShitaP04183());
    setS183aKeikakuOhNakaP((int)(1 - 1), getHKeikakuOhNakaP01183());
    setS183aKeikakuOhNakaP((int)(2 - 1), getHKeikakuOhNakaP02183());
    setS183aKeikakuOhNakaP((int)(3 - 1), getHKeikakuOhNakaP03183());
    setS183aKeikakuOhNakaP((int)(4 - 1), getHKeikakuOhNakaP04183());
    setS183aKeikakuOhUwaP((int)(1 - 1), getHKeikakuOhUwaP01183());
    setS183aKeikakuOhUwaP((int)(2 - 1), getHKeikakuOhUwaP02183());
    setS183aKeikakuOhUwaP((int)(3 - 1), getHKeikakuOhUwaP03183());
    setS183aKeikakuOhUwaP((int)(4 - 1), getHKeikakuOhUwaP04183());
    setS183aKeikakuOhPbs((int)(1 - 1), getHKeikakuOhPbs01183());
    setS183aKeikakuOhPbs((int)(2 - 1), getHKeikakuOhPbs02183());
    setS183aKeikakuOhPbs((int)(3 - 1), getHKeikakuOhPbs03183());
    setS183aKeikakuOhPbs((int)(4 - 1), getHKeikakuOhPbs04183());
    setS183aKeikakuOhPreTrim((int)(1 - 1), getHKeikakuOhPreTrim01183());
    setS183aKeikakuOhPreTrim((int)(2 - 1), getHKeikakuOhPreTrim02183());
    setS183aKeikakuOhPreTrim((int)(3 - 1), getHKeikakuOhPreTrim03183());
    setS183aKeikakuOhPreTrim((int)(4 - 1), getHKeikakuOhPreTrim04183());
    setS183aKeikakuOhTrim((int)(1 - 1), getHKeikakuOhTrim01183());
    setS183aKeikakuOhTrim((int)(2 - 1), getHKeikakuOhTrim02183());
    setS183aKeikakuOhTrim((int)(3 - 1), getHKeikakuOhTrim03183());
    setS183aKeikakuOhTrim((int)(4 - 1), getHKeikakuOhTrim04183());
    setS183aKeikakuOhFinal((int)(1 - 1), getHKeikakuOhFinal01183());
    setS183aKeikakuOhFinal((int)(2 - 1), getHKeikakuOhFinal02183());
    setS183aKeikakuOhFinal((int)(3 - 1), getHKeikakuOhFinal03183());
    setS183aKeikakuOhFinal((int)(4 - 1), getHKeikakuOhFinal04183());
    setS183aKeikakuOhKasou((int)(1 - 1), getHKeikakuOhKasou01183());
    setS183aKeikakuOhKasou((int)(2 - 1), getHKeikakuOhKasou02183());
    setS183aKeikakuOhKasou((int)(3 - 1), getHKeikakuOhKasou03183());
    setS183aKeikakuOhKasou((int)(4 - 1), getHKeikakuOhKasou04183());
    setS183aKeikakuOhDeliv((int)(1 - 1), getHKeikakuOhDeliv01183());
    setS183aKeikakuOhDeliv((int)(2 - 1), getHKeikakuOhDeliv02183());
    setS183aKeikakuOhDeliv((int)(3 - 1), getHKeikakuOhDeliv03183());
    setS183aKeikakuOhDeliv((int)(4 - 1), getHKeikakuOhDeliv04183());
    setS183aKeikakuOhUkeire((int)(1 - 1), getHKeikakuOhUkeire01183());
    setS183aKeikakuOhUkeire((int)(2 - 1), getHKeikakuOhUkeire02183());
    setS183aKeikakuOhUkeire((int)(3 - 1), getHKeikakuOhUkeire03183());
    setS183aKeikakuOhUkeire((int)(4 - 1), getHKeikakuOhUkeire04183());
    }
  }

  @Override
  protected void eFetchCr03() throws Exception {
    return;
  }

  @Override
  protected void closeCr03() throws Exception {
    if (CommonUtils.compareString(getCr03Opened(), "Y") == 0) {
    {
    /* BEGIN: MANUAL INJECTION */
    setSqlcode(0);
    /* END : MANUAL INJECTION */
    List<Object> results = call(mapRetCode, getResponseCodecr03(), getSqlcode());
    setResponseCodecr03(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    }
    setCr03Opened("N");
  }

  @Override
  protected void eCloseCr03() throws Exception {
    return;
  }

  @Override
  protected void openCr04() throws Exception {
    if (CommonUtils.compareString(getCr04Opened(), "Y") == 0) {
    }
    setCr04Opened("Y");
    /* BEGIN: MANUAL INJECTION */
    cr04 = jikei184Repository.findAll().iterator();
    if (cr04 != null) {
      setSqlcode(0);
    } else {
      setSqlcode(-1);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr04(), getSqlcode());
    setResponseCodecr04(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
  }

  @Override
  protected void eOpenCr04() throws Exception {
    return;
  }

  @Override
  protected void fetchCr04() throws Exception {
    /* BEGIN: MANUAL INJECTION */
    if (cr04.hasNext()) {
      Jikei184 jikei184 = cr04.next();
      setHKoujouKubun184(jikei184.getKoujouKubun());
      setHShakeiCode184(jikei184.getShakeiCode());
      setHLineKubun184(jikei184.getLineKubun());
      setHShift184(jikei184.getShift());
      setHKouteiId184(jikei184.getKouteiId());
      setHKaishiJikoku184(jikei184.getKaishiJikoku());
      setHJissekiKaishiIzen184(jikei184.getJissekiKaishiIzen().longValue());
      setHJissekiHhTbl184(jikei184.getJissekiHhTbl());
      setHJisseki12hIkou184(jikei184.getJisseki12hIkou().longValue());
      setHKeikakuKaishiIzen184(jikei184.getKeikakuKaishiIzen().longValue());
      setHKeikakuHhTbl184(jikei184.getKeikakuHhTbl());
      setHKeikaku12hIkou184(jikei184.getKeikaku12hIkou().longValue());
      setHJikei184R(jikei184.getRowid());

      setSqlcode(0);
    } else {
      setSqlcode(1403);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr04(), getSqlcode());
    setResponseCodecr04(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    if (getSqlcode() == 0) {
    setS184aKoujouKubun(getHKoujouKubun184());
    setS184aShakeiCode(getHShakeiCode184());
    setS184aLineKubun(getHLineKubun184());
    setS184aShift(getHShift184());
    setS184aKouteiId(getHKouteiId184());
    setS184aKaishiJikoku(getHKaishiJikoku184());
    setS184aJissekiKaishiIzen(getHJissekiKaishiIzen184());
    {
    List<Object> results = call(pack184, getHJissekiHhTbl184(), getS184aJissekiHhTbl(), 24);
    setHJissekiHhTbl184(results.get(0).toString());
    setS184aJissekiHhTbl(results.get(1).toString());
    }
    setS184aJisseki12hIkou(getHJisseki12hIkou184());
    setS184aKeikakuKaishiIzen(getHKeikakuKaishiIzen184());
    {
    List<Object> results = call(pack184, getHKeikakuHhTbl184(), getS184aKeikakuHhTbl(), 24);
    setHKeikakuHhTbl184(results.get(0).toString());
    setS184aKeikakuHhTbl(results.get(1).toString());
    }
    setS184aKeikaku12hIkou(getHKeikaku12hIkou184());
    }
  }

  @Override
  protected void eFetchCr04() throws Exception {
    return;
  }

  @Override
  protected void closeCr04() throws Exception {
    if (CommonUtils.compareString(getCr04Opened(), "Y") == 0) {
    /* BEGIN: MANUAL INJECTION */
    setSqlcode(0);
    /* END : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr04(), getSqlcode());
    setResponseCodecr04(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    }
    setCr04Opened("N");
  }

  @Override
  protected void eCloseCr04() throws Exception {
    return;
  }

  @Override
  protected void openCr05() throws Exception {
    if (CommonUtils.compareString(getCr05Opened(), "Y") == 0) {
    }
    setCr05Opened("Y");
    /* BEGIN: MANUAL INJECTION */
    cr05 = koutei185Repository.findAll().iterator();
    if (cr05 != null) {
      setSqlcode(0);
    } else {
      setSqlcode(-1);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr05(), getSqlcode());
    setResponseCodecr05(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
  }

  @Override
  protected void eOpenCr05() throws Exception {
    return;
  }

  @Override
  protected void fetchCr05() throws Exception {
    /* BEGIN: MANUAL INJECTION */
    if (cr05.hasNext()) {
      Koutei185 koutei185 = cr05.next();
      setHKoujouKubunFileId185(koutei185.getKoujouKubunFileId());
      setHActGroup185(koutei185.getActGroup());
      setHActLineCod185(koutei185.getActLineCod());
      setHYyyymm185(koutei185.getYyyymm());
      setHKouteiKeikakuId185(koutei185.getKouteiKeikakuId());
      setHShiftDaisu01185(koutei185.getShiftDaisu01().longValue());
      setHShiftDaisu02185(koutei185.getShiftDaisu02().longValue());
      setHShiftDaisu03185(koutei185.getShiftDaisu03().longValue());
      setHShiftDaisu04185(koutei185.getShiftDaisu04().longValue());
      setHShiftDaisu05185(koutei185.getShiftDaisu05().longValue());
      setHShiftDaisu06185(koutei185.getShiftDaisu06().longValue());
      setHShiftDaisu07185(koutei185.getShiftDaisu07().longValue());
      setHShiftDaisu08185(koutei185.getShiftDaisu08().longValue());
      setHShiftDaisu09185(koutei185.getShiftDaisu09().longValue());
      setHShiftDaisu10185(koutei185.getShiftDaisu10().longValue());
      setHShiftDaisu11185(koutei185.getShiftDaisu11().longValue());
      setHShiftDaisu12185(koutei185.getShiftDaisu12().longValue());
      setHShiftDaisu13185(koutei185.getShiftDaisu13().longValue());
      setHShiftDaisu14185(koutei185.getShiftDaisu14().longValue());
      setHShiftDaisu15185(koutei185.getShiftDaisu15().longValue());
      setHShiftDaisu16185(koutei185.getShiftDaisu16().longValue());
      setHShiftDaisu17185(koutei185.getShiftDaisu17().longValue());
      setHShiftDaisu18185(koutei185.getShiftDaisu18().longValue());
      setHShiftDaisu19185(koutei185.getShiftDaisu19().longValue());
      setHShiftDaisu20185(koutei185.getShiftDaisu20().longValue());
      setHShiftDaisu21185(koutei185.getShiftDaisu21().longValue());
      setHShiftDaisu22185(koutei185.getShiftDaisu22().longValue());
      setHShiftDaisu23185(koutei185.getShiftDaisu23().longValue());
      setHShiftDaisu24185(koutei185.getShiftDaisu24().longValue());
      setHShiftDaisu25185(koutei185.getShiftDaisu25().longValue());
      setHShiftDaisu26185(koutei185.getShiftDaisu26().longValue());
      setHShiftDaisu27185(koutei185.getShiftDaisu27().longValue());
      setHShiftDaisu28185(koutei185.getShiftDaisu28().longValue());
      setHShiftDaisu29185(koutei185.getShiftDaisu29().longValue());
      setHShiftDaisu30185(koutei185.getShiftDaisu30().longValue());
      setHShiftDaisu31185(koutei185.getShiftDaisu31().longValue());
      setHShiftDaisu32185(koutei185.getShiftDaisu32().longValue());
      setHShiftDaisu33185(koutei185.getShiftDaisu33().longValue());
      setHShiftDaisu34185(koutei185.getShiftDaisu34().longValue());
      setHShiftDaisu35185(koutei185.getShiftDaisu35().longValue());
      setHShiftDaisu36185(koutei185.getShiftDaisu36().longValue());
      setHShiftDaisu37185(koutei185.getShiftDaisu37().longValue());
      setHShiftDaisu38185(koutei185.getShiftDaisu38().longValue());
      setHShiftDaisu39185(koutei185.getShiftDaisu39().longValue());
      setHShiftDaisu40185(koutei185.getShiftDaisu40().longValue());
      setHShiftDaisu41185(koutei185.getShiftDaisu41().longValue());
      setHShiftDaisu42185(koutei185.getShiftDaisu42().longValue());
      setHShiftDaisu43185(koutei185.getShiftDaisu43().longValue());
      setHShiftDaisu44185(koutei185.getShiftDaisu44().longValue());
      setHShiftDaisu45185(koutei185.getShiftDaisu45().longValue());
      setHShiftDaisu46185(koutei185.getShiftDaisu46().longValue());
      setHShiftDaisu47185(koutei185.getShiftDaisu47().longValue());
      setHShiftDaisu48185(koutei185.getShiftDaisu48().longValue());
      setHShiftDaisu49185(koutei185.getShiftDaisu49().longValue());
      setHShiftDaisu50185(koutei185.getShiftDaisu50().longValue());
      setHShiftDaisu51185(koutei185.getShiftDaisu51().longValue());
      setHShiftDaisu52185(koutei185.getShiftDaisu52().longValue());
      setHShiftDaisu53185(koutei185.getShiftDaisu53().longValue());
      setHShiftDaisu54185(koutei185.getShiftDaisu54().longValue());
      setHShiftDaisu55185(koutei185.getShiftDaisu55().longValue());
      setHShiftDaisu56185(koutei185.getShiftDaisu56().longValue());
      setHShiftDaisu57185(koutei185.getShiftDaisu57().longValue());
      setHShiftDaisu58185(koutei185.getShiftDaisu58().longValue());
      setHShiftDaisu59185(koutei185.getShiftDaisu59().longValue());
      setHShiftDaisu60185(koutei185.getShiftDaisu60().longValue());
      setHShiftDaisu61185(koutei185.getShiftDaisu61().longValue());
      setHShiftDaisu62185(koutei185.getShiftDaisu62().longValue());
      setHShiftDaisu63185(koutei185.getShiftDaisu63().longValue());
      setHTimeStamp185(koutei185.getTimeStamp());
      setHKoutei185R(koutei185.getRowid());

      setSqlcode(0);
    } else {
      setSqlcode(1403);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr05(), getSqlcode());
    setResponseCodecr05(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    if (getSqlcode() == 0) {
    setS185aKoujouKubunFileId(getHKoujouKubunFileId185());
    setS185aActGroup(getHActGroup185());
    setS185aActLineCod(getHActLineCod185());
    setS185aYyyymm(getHYyyymm185());
    setS185aKouteiKeikakuId(getHKouteiKeikakuId185());
    setS185aShiftDaisu((int)(1 - 1), getHShiftDaisu01185());
    setS185aShiftDaisu((int)(2 - 1), getHShiftDaisu02185());
    setS185aShiftDaisu((int)(3 - 1), getHShiftDaisu03185());
    setS185aShiftDaisu((int)(4 - 1), getHShiftDaisu04185());
    setS185aShiftDaisu((int)(5 - 1), getHShiftDaisu05185());
    setS185aShiftDaisu((int)(6 - 1), getHShiftDaisu06185());
    setS185aShiftDaisu((int)(7 - 1), getHShiftDaisu07185());
    setS185aShiftDaisu((int)(8 - 1), getHShiftDaisu08185());
    setS185aShiftDaisu((int)(9 - 1), getHShiftDaisu09185());
    setS185aShiftDaisu((int)(10 - 1), getHShiftDaisu10185());
    setS185aShiftDaisu((int)(11 - 1), getHShiftDaisu11185());
    setS185aShiftDaisu((int)(12 - 1), getHShiftDaisu12185());
    setS185aShiftDaisu((int)(13 - 1), getHShiftDaisu13185());
    setS185aShiftDaisu((int)(14 - 1), getHShiftDaisu14185());
    setS185aShiftDaisu((int)(15 - 1), getHShiftDaisu15185());
    setS185aShiftDaisu((int)(16 - 1), getHShiftDaisu16185());
    setS185aShiftDaisu((int)(17 - 1), getHShiftDaisu17185());
    setS185aShiftDaisu((int)(18 - 1), getHShiftDaisu18185());
    setS185aShiftDaisu((int)(19 - 1), getHShiftDaisu19185());
    setS185aShiftDaisu((int)(20 - 1), getHShiftDaisu20185());
    setS185aShiftDaisu((int)(21 - 1), getHShiftDaisu21185());
    setS185aShiftDaisu((int)(22 - 1), getHShiftDaisu22185());
    setS185aShiftDaisu((int)(23 - 1), getHShiftDaisu23185());
    setS185aShiftDaisu((int)(24 - 1), getHShiftDaisu24185());
    setS185aShiftDaisu((int)(25 - 1), getHShiftDaisu25185());
    setS185aShiftDaisu((int)(26 - 1), getHShiftDaisu26185());
    setS185aShiftDaisu((int)(27 - 1), getHShiftDaisu27185());
    setS185aShiftDaisu((int)(28 - 1), getHShiftDaisu28185());
    setS185aShiftDaisu((int)(29 - 1), getHShiftDaisu29185());
    setS185aShiftDaisu((int)(30 - 1), getHShiftDaisu30185());
    setS185aShiftDaisu((int)(31 - 1), getHShiftDaisu31185());
    setS185aShiftDaisu((int)(32 - 1), getHShiftDaisu32185());
    setS185aShiftDaisu((int)(33 - 1), getHShiftDaisu33185());
    setS185aShiftDaisu((int)(34 - 1), getHShiftDaisu34185());
    setS185aShiftDaisu((int)(35 - 1), getHShiftDaisu35185());
    setS185aShiftDaisu((int)(36 - 1), getHShiftDaisu36185());
    setS185aShiftDaisu((int)(37 - 1), getHShiftDaisu37185());
    setS185aShiftDaisu((int)(38 - 1), getHShiftDaisu38185());
    setS185aShiftDaisu((int)(39 - 1), getHShiftDaisu39185());
    setS185aShiftDaisu((int)(40 - 1), getHShiftDaisu40185());
    setS185aShiftDaisu((int)(41 - 1), getHShiftDaisu41185());
    setS185aShiftDaisu((int)(42 - 1), getHShiftDaisu42185());
    setS185aShiftDaisu((int)(43 - 1), getHShiftDaisu43185());
    setS185aShiftDaisu((int)(44 - 1), getHShiftDaisu44185());
    setS185aShiftDaisu((int)(45 - 1), getHShiftDaisu45185());
    setS185aShiftDaisu((int)(46 - 1), getHShiftDaisu46185());
    setS185aShiftDaisu((int)(47 - 1), getHShiftDaisu47185());
    setS185aShiftDaisu((int)(48 - 1), getHShiftDaisu48185());
    setS185aShiftDaisu((int)(49 - 1), getHShiftDaisu49185());
    setS185aShiftDaisu((int)(50 - 1), getHShiftDaisu50185());
    setS185aShiftDaisu((int)(51 - 1), getHShiftDaisu51185());
    setS185aShiftDaisu((int)(52 - 1), getHShiftDaisu52185());
    setS185aShiftDaisu((int)(53 - 1), getHShiftDaisu53185());
    setS185aShiftDaisu((int)(54 - 1), getHShiftDaisu54185());
    setS185aShiftDaisu((int)(55 - 1), getHShiftDaisu55185());
    setS185aShiftDaisu((int)(56 - 1), getHShiftDaisu56185());
    setS185aShiftDaisu((int)(57 - 1), getHShiftDaisu57185());
    setS185aShiftDaisu((int)(58 - 1), getHShiftDaisu58185());
    setS185aShiftDaisu((int)(59 - 1), getHShiftDaisu59185());
    setS185aShiftDaisu((int)(60 - 1), getHShiftDaisu60185());
    setS185aShiftDaisu((int)(61 - 1), getHShiftDaisu61185());
    setS185aShiftDaisu((int)(62 - 1), getHShiftDaisu62185());
    setS185aShiftDaisu((int)(63 - 1), getHShiftDaisu63185());
    setS185aTimeStamp(getHTimeStamp185());
    }
  }

  @Override
  protected void eFetchCr05() throws Exception {
    return;
  }

  @Override
  protected void closeCr05() throws Exception {
    if (CommonUtils.compareString(getCr05Opened(), "Y") == 0) {
    /* BEGIN: MANUAL INJECTION */
    setSqlcode(0);
    /* END: MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr05(), getSqlcode());
    setResponseCodecr05(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    }
    setCr05Opened("N");
  }

  @Override
  protected void eCloseCr05() throws Exception {
    return;
  }

  @Override
  protected void openCr06() throws Exception {
    if (CommonUtils.compareString(getCr06Opened(), "Y") == 0) {
    }
    setCr06Opened("Y");
    /* BEGIN: MANUAL INJECTION */
    cr06 = sequence180Repository.findAllByOrderByKoujouKubunAscKoujouControlNoAsc().iterator();
    if (cr06 != null) {
      setSqlcode(0);
    } else {
      setSqlcode(-1);
    }
    /* END: MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr06(), getSqlcode());
    setResponseCodecr06(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
  }

  @Override
  protected void eOpenCr06() throws Exception {
    return;
  }

  @Override
  protected void fetchCr06() throws Exception {
    /* BEGIN: MANUAL INJECTION */
    if (cr06.hasNext()) {
      Sequence180 sequence180 = cr06.next();
      setHKoujouKubun180(sequence180.getKoujouKubun());
      setHKoujouControlNo180(sequence180.getKoujouControlNo());
      setHActLineCode180(sequence180.getActLineCode());
      setHPoint2SeqNo180(sequence180.getPoint2SeqNo());
      setHPoint3SeqNo180(sequence180.getPoint3SeqNo());
      setHPoint4SeqNo180(sequence180.getPoint4SeqNo());
      setHTransportDirectionMls233(sequence180.getTransportDirectionSymbol());
      setHDoukiseisanSeqNo180(sequence180.getDoukiseisanSeqNo());
      setHDeliveryPlanNonMMls234(sequence180.getDeliveryPlanNonMargin());
      setHProductionMonth180(sequence180.getProductionMonth());
      setHMsNo180(sequence180.getMsNo());
      setHSequence180R(sequence180.getRowid());

      setSqlcode(0);
    } else {
      setSqlcode(1403);
    }
    /* END  : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr06(), getSqlcode());
    setResponseCodecr06(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    if (getSqlcode() == 0) {
    setS180aKoujouKubun(getHKoujouKubun180());
    setS180aKoujouControlNo(getHKoujouControlNo180());
    setS180aActLineCode(getHActLineCode180());
    setS180aPoint2SeqNo(getHPoint2SeqNo180());
    setS180aPoint3SeqNo(getHPoint3SeqNo180());
    setS180aPoint4SeqNo(getHPoint4SeqNo180());
    setS180aTransportDirectionSym(getHTransportDirectionMls233());
    setS180aDoukiseisanSeqNo(getHDoukiseisanSeqNo180());
    setS180aDeliveryPlanNonMargin(getHDeliveryPlanNonMMls234());
    setS180aProductionMonth(getHProductionMonth180());
    setS180aMsNo(getHMsNo180());
    }
  }

  @Override
  protected void eFetchCr06() throws Exception {
    return;
  }

  @Override
  protected void closeCr06() throws Exception {
    if (CommonUtils.compareString(getCr06Opened(), "Y") == 0) {
    /* BEGIN: MANUAL INJECTION */
    setSqlcode(0);
    /* END : MANUAL INJECTION */
    {
    List<Object> results = call(mapRetCode, getResponseCodecr06(), getSqlcode());
    setResponseCodecr06(Long.parseLong(results.get(0).toString()));
    setSqlcode(Long.parseLong(results.get(1).toString()));
    }
    }
    setCr06Opened("N");
  }

  @Override
  protected void eCloseCr06() throws Exception {
    return;
  }
}
