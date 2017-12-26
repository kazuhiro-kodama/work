// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.hitachi.pcs.common.RepositoryAnnotation;
import com.hitachi.pcs.common.util.CommonUtils;
import com.hitachi.pcs.data.sam.repository.RepositoryBase;
import com.hitachi.pcs.func.task.Termdump;
import com.hitachi.pcs.data.sam.domain.Dcpenv;

public abstract class E62x20Base extends TaskBase {

  @Autowired
  Termdump termdump;

  @RepositoryAnnotation(name="DD_SYS011")
  private RepositoryBase sys011;

  @RepositoryAnnotation(name="DD_SYS031")
  private RepositoryBase sys031;

  protected final RepositoryBase getI1SeihanShiyouBetsuFl() {
  return sys011;
  }

  protected final RepositoryBase getO1CatsShiyouBetsuFl() {
  return sys031;
  }

  protected Dcpenv dcpenv = new Dcpenv();

  private byte[] sys011Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 497));

  private byte[] sys031Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 580));

  private byte[] i1KoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1Shashu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] i1Toshoku = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] i1Uchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1ExNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] i1Filler = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] i1Shimo1keta = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1KokuyuKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1TaishouNengetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] i1KouteiShikibetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] i1ZengetsuJissekiRuikei = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1TougetsuJisseki10 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] i1TougetsuJisseki1 = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  i1TougetsuJisseki1[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] i1TougetsuJisseki2 = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  i1TougetsuJisseki2[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] i1JigetsuJisseki10 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] i1JigetsuJisseki1 = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  i1JigetsuJisseki1[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] i1JigetsuJisseki2 = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  i1JigetsuJisseki2[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] i1ZenzenGetsuMatsuRuisa = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZengetsuKeikakuRuikei = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZengetsuMatsuRuisa = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1TougetsuKeikaku10 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] i1TougetsuKeikaku1 = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  i1TougetsuKeikaku1[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] i1TougetsuKeikaku2 = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  i1TougetsuKeikaku2[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] i1JigetsuKeikaku10 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] i1JigetsuKeikaku1 = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  i1JigetsuKeikaku1[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] i1JigetsuKeikaku2 = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  i1JigetsuKeikaku2[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] i1ZengetsuRuikeiIkan = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1TougetsuRuikeiIkan = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1JigetsuRuikeiIkan = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZengetsuShikyu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1TougetsuShikyu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZigetsuShikyu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZenzenGetsuMike = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZenGetsuMiken = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZenzenGetsuKanken = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] i1ZenGetsuKanken = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] filler0004 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] o1Shashu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] o1ExNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] o1Toshoku = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] o1Uchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] o1TrimLine = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] o1KokuyuKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] o1Shimukechi = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] o1Kami1keta = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] o1Shimo1keta = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] o1ListJun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] o1KijunShakei = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] o1KeikakuNengetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] o1OffGettoRuisa = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] o1OffKeikakuTougetsuDaisu = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  o1OffKeikakuTougetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1OffKeikakuJigetsuDaisu = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  o1OffKeikakuJigetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1OffJissekiTougetsuDaisu = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  o1OffJissekiTougetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1OffJissekiJigetsuDaisu = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  o1OffJissekiJigetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] o1FinGettoRuisa = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] o1FinKeikakuTougetsuDaisu = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  o1FinKeikakuTougetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1FinKeikakuJigetsuDaisu = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  o1FinKeikakuJigetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1FinJissekiTougetsuDaisu = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  o1FinJissekiTougetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1FinJissekiJigetsuDaisu = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  o1FinJissekiJigetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] o1MikenZaiko = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] o1KankenZaiko = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[][] o1ShaukeTougetsuDaisu = new byte[31][2];
  {
    for (int a = 0; a < 31; a++) {
  o1ShaukeTougetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] o1ShaukeJigetsuDaisu = new byte[20][2];
  {
    for (int a = 0; a < 20; a++) {
  o1ShaukeJigetsuDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] o1IkanShikyuTougetsu = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] o1IkanShikyuJigetsu = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] o1TimeStamp = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] i1EofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NseqKojoKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NseqShashu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] i1NseqLine1keta = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NseqToshoku = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] i1NseqUchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NseqExNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] i1NseqKouteiShikibetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] i1OseqKey = CommonUtils.stringToBytes(StringUtils.repeat(" ", 31));

  private byte[] i1NsamKoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NsamShashu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] i1NsamLine1keta = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NsamToshoku = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] i1NsamUchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] i1NsamExNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] i1OsamKey = CommonUtils.stringToBytes(StringUtils.repeat(" ", 29));

  private byte[] i1Ctr = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] onCode = CommonUtils.stringToBytes("Y");

  private byte[] offCode = CommonUtils.stringToBytes("N");

  public byte[] getSys011RecBytes() {
    return sys011Rec;
  }

  public void setSys011RecBytes(byte[] arg) {
    sys011Rec = ArrayUtils.clone(arg);
  }

  public void initSys011Rec() {
    sys011Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 497));
  }

  public String getSys011Rec() {
  return CommonUtils.bytesToString(getSys011RecBytes());
  }

  public void setSys011Rec(String arg) {
  final int trailing_length = 497 - arg.length();
  if (trailing_length > 0) {
  setSys011RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys011RecBytes(CommonUtils.stringToBytes(arg.substring(0, 497)));
  }
  }

  public byte[] getSys031RecBytes() {
    return sys031Rec;
  }

  public void setSys031RecBytes(byte[] arg) {
    sys031Rec = ArrayUtils.clone(arg);
  }

  public void initSys031Rec() {
    sys031Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 580));
  }

  public String getSys031Rec() {
  return CommonUtils.bytesToString(getSys031RecBytes());
  }

  public void setSys031Rec(String arg) {
  final int trailing_length = 580 - arg.length();
  if (trailing_length > 0) {
  setSys031RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys031RecBytes(CommonUtils.stringToBytes(arg.substring(0, 580)));
  }
  }

  public byte[] getI1SeihanShiyouBetsuRecBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(497);
        buffer.put(getI1KoujouKubunBytes());
        buffer.put(getI1ShashuBytes());
        buffer.put(getI1ToshokuBytes());
        buffer.put(getI1UchibariBytes());
        buffer.put(getI1ExNoBytes());
        buffer.put(getI1LineKubunBytes());
        buffer.put(getI1KokuyuKubunBytes());
        buffer.put(getI1TaishouNengetsuBytes());
        buffer.put(getI1KouteiShikibetsuBytes());
        buffer.put(getI1JissekiDaisuBytes());
        buffer.put(getI1KeikakuDaisuBytes());
        buffer.put(getI1IkanDaisuBytes());
        buffer.put(getI1ShikyuDaisuBytes());
        buffer.put(getI1MikenBytes());
        buffer.put(getI1KankenBytes());
    return buffer.array();
  }

  public void setI1SeihanShiyouBetsuRecBytes(byte[] arg) {
        setI1KoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setI1ShashuBytes(ArrayUtils.subarray(arg, 1, 19));
        setI1ToshokuBytes(ArrayUtils.subarray(arg, 19, 22));
        setI1UchibariBytes(ArrayUtils.subarray(arg, 22, 23));
        setI1ExNoBytes(ArrayUtils.subarray(arg, 23, 28));
        setI1LineKubunBytes(ArrayUtils.subarray(arg, 28, 32));
        setI1KokuyuKubunBytes(ArrayUtils.subarray(arg, 32, 33));
        setI1TaishouNengetsuBytes(ArrayUtils.subarray(arg, 33, 37));
        setI1KouteiShikibetsuBytes(ArrayUtils.subarray(arg, 37, 39));
        setI1JissekiDaisuBytes(ArrayUtils.subarray(arg, 39, 250));
        setI1KeikakuDaisuBytes(ArrayUtils.subarray(arg, 250, 467));
        setI1IkanDaisuBytes(ArrayUtils.subarray(arg, 467, 476));
        setI1ShikyuDaisuBytes(ArrayUtils.subarray(arg, 476, 485));
        setI1MikenBytes(ArrayUtils.subarray(arg, 485, 491));
        setI1KankenBytes(ArrayUtils.subarray(arg, 491, 497));
  }

  public void initI1SeihanShiyouBetsuRec() {
        initI1KoujouKubun();
        initI1Shashu();
        initI1Toshoku();
        initI1Uchibari();
        initI1ExNo();
        initI1LineKubun();
        initI1KokuyuKubun();
        initI1TaishouNengetsu();
        initI1KouteiShikibetsu();
        initI1JissekiDaisu();
        initI1KeikakuDaisu();
        initI1IkanDaisu();
        initI1ShikyuDaisu();
        initI1Miken();
        initI1Kanken();
  }

  public String getI1SeihanShiyouBetsuRec() {
  return CommonUtils.bytesToString(getI1SeihanShiyouBetsuRecBytes());
  }

  public void setI1SeihanShiyouBetsuRec(String arg) {
  final int trailing_length = 497 - arg.length();
  if (trailing_length > 0) {
  setI1SeihanShiyouBetsuRecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1SeihanShiyouBetsuRecBytes(CommonUtils.stringToBytes(arg.substring(0, 497)));
  }
  }

  public byte[] getI1KoujouKubunBytes() {
    return i1KoujouKubun;
  }

  public void setI1KoujouKubunBytes(byte[] arg) {
    i1KoujouKubun = ArrayUtils.clone(arg);
  }

  public void initI1KoujouKubun() {
    i1KoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1KoujouKubun() {
  return CommonUtils.bytesToString(getI1KoujouKubunBytes());
  }

  public void setI1KoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1KoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1KoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1ShashuBytes() {
    return i1Shashu;
  }

  public void setI1ShashuBytes(byte[] arg) {
    i1Shashu = ArrayUtils.clone(arg);
  }

  public void initI1Shashu() {
    i1Shashu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getI1Shashu() {
  return CommonUtils.bytesToString(getI1ShashuBytes());
  }

  public void setI1Shashu(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setI1ShashuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1ShashuBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getI1ToshokuBytes() {
    return i1Toshoku;
  }

  public void setI1ToshokuBytes(byte[] arg) {
    i1Toshoku = ArrayUtils.clone(arg);
  }

  public void initI1Toshoku() {
    i1Toshoku =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getI1Toshoku() {
  return CommonUtils.bytesToString(getI1ToshokuBytes());
  }

  public void setI1Toshoku(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setI1ToshokuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1ToshokuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getI1UchibariBytes() {
    return i1Uchibari;
  }

  public void setI1UchibariBytes(byte[] arg) {
    i1Uchibari = ArrayUtils.clone(arg);
  }

  public void initI1Uchibari() {
    i1Uchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1Uchibari() {
  return CommonUtils.bytesToString(getI1UchibariBytes());
  }

  public void setI1Uchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1UchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1UchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1ExNoBytes() {
    return i1ExNo;
  }

  public void setI1ExNoBytes(byte[] arg) {
    i1ExNo = ArrayUtils.clone(arg);
  }

  public void initI1ExNo() {
    i1ExNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getI1ExNo() {
  return CommonUtils.bytesToString(getI1ExNoBytes());
  }

  public void setI1ExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setI1ExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1ExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getI1LineKubunBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getI1FillerBytes());
        buffer.put(getI1Shimo1ketaBytes());
    return buffer.array();
  }

  public void setI1LineKubunBytes(byte[] arg) {
        setI1FillerBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1Shimo1ketaBytes(ArrayUtils.subarray(arg, 3, 4));
  }

  public void initI1LineKubun() {
        initI1Filler();
        initI1Shimo1keta();
  }

  public String getI1LineKubun() {
  return CommonUtils.bytesToString(getI1LineKubunBytes());
  }

  public void setI1LineKubun(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setI1LineKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1LineKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getI1FillerBytes() {
    return i1Filler;
  }

  public void setI1FillerBytes(byte[] arg) {
    i1Filler = ArrayUtils.clone(arg);
  }

  public void initI1Filler() {
    i1Filler =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getI1Filler() {
  return CommonUtils.bytesToString(getI1FillerBytes());
  }

  public void setI1Filler(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setI1FillerBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1FillerBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getI1Shimo1ketaBytes() {
    return i1Shimo1keta;
  }

  public void setI1Shimo1ketaBytes(byte[] arg) {
    i1Shimo1keta = ArrayUtils.clone(arg);
  }

  public void initI1Shimo1keta() {
    i1Shimo1keta =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1Shimo1keta() {
  return CommonUtils.bytesToString(getI1Shimo1ketaBytes());
  }

  public void setI1Shimo1keta(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1Shimo1ketaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1Shimo1ketaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1KokuyuKubunBytes() {
    return i1KokuyuKubun;
  }

  public void setI1KokuyuKubunBytes(byte[] arg) {
    i1KokuyuKubun = ArrayUtils.clone(arg);
  }

  public void initI1KokuyuKubun() {
    i1KokuyuKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1KokuyuKubun() {
  return CommonUtils.bytesToString(getI1KokuyuKubunBytes());
  }

  public void setI1KokuyuKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1KokuyuKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1KokuyuKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1TaishouNengetsuBytes() {
    return i1TaishouNengetsu;
  }

  public void setI1TaishouNengetsuBytes(byte[] arg) {
    i1TaishouNengetsu = ArrayUtils.clone(arg);
  }

  public void initI1TaishouNengetsu() {
    i1TaishouNengetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getI1TaishouNengetsu() {
  return CommonUtils.bytesToString(getI1TaishouNengetsuBytes());
  }

  public void setI1TaishouNengetsu(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setI1TaishouNengetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1TaishouNengetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getI1KouteiShikibetsuBytes() {
    return i1KouteiShikibetsu;
  }

  public void setI1KouteiShikibetsuBytes(byte[] arg) {
    i1KouteiShikibetsu = ArrayUtils.clone(arg);
  }

  public void initI1KouteiShikibetsu() {
    i1KouteiShikibetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getI1KouteiShikibetsu() {
  return CommonUtils.bytesToString(getI1KouteiShikibetsuBytes());
  }

  public void setI1KouteiShikibetsu(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setI1KouteiShikibetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1KouteiShikibetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getI1JissekiDaisuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(211);
        buffer.put(getI1ZengetsuJissekiRuikeiBytes());
        buffer.put(getI1TougetsuJissekiBytes());
        buffer.put(getI1JigetsuJissekiBytes());
    return buffer.array();
  }

  public void setI1JissekiDaisuBytes(byte[] arg) {
        setI1ZengetsuJissekiRuikeiBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1TougetsuJissekiBytes(ArrayUtils.subarray(arg, 3, 129));
        setI1JigetsuJissekiBytes(ArrayUtils.subarray(arg, 129, 211));
  }

  public void initI1JissekiDaisu() {
        initI1ZengetsuJissekiRuikei();
        initI1TougetsuJisseki();
        initI1JigetsuJisseki();
  }

  public String getI1JissekiDaisu() {
  return CommonUtils.bytesToString(getI1JissekiDaisuBytes());
  }

  public void setI1JissekiDaisu(String arg) {
  final int trailing_length = 211 - arg.length();
  if (trailing_length > 0) {
  setI1JissekiDaisuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1JissekiDaisuBytes(CommonUtils.stringToBytes(arg.substring(0, 211)));
  }
  }

  public byte[] getI1ZengetsuJissekiRuikeiBytes() {
    return i1ZengetsuJissekiRuikei;
  }

  public void setI1ZengetsuJissekiRuikeiBytes(byte[] arg) {
    i1ZengetsuJissekiRuikei = ArrayUtils.clone(arg);
  }

  public void initI1ZengetsuJissekiRuikei() {
    i1ZengetsuJissekiRuikei =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZengetsuJissekiRuikei() {
    return CommonUtils.packedDecimalToNumber(getI1ZengetsuJissekiRuikeiBytes());
  }

  public void setI1ZengetsuJissekiRuikei(long arg) {
  setI1ZengetsuJissekiRuikeiBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1TougetsuJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(126);
        buffer.put(getI1TougetsuJisseki10Bytes());
        for (int x = 0; x < 31; x++) {
        buffer.put(getI1TougetsuJissekiBytes(x));
        }
    return buffer.array();
  }

  public void setI1TougetsuJissekiBytes(byte[] arg) {
        setI1TougetsuJisseki10Bytes(ArrayUtils.subarray(arg, 0, 2));
        for (int x = 0; x < 31; x++) {
        setI1TougetsuJissekiBytes(x, ArrayUtils.subarray(arg, 2 + 4 * x, 2 + 4 * (x + 1)));
        }
  }

  public void initI1TougetsuJisseki() {
        initI1TougetsuJisseki10();
        for (int x = 0; x < 31; x++) {
        initI1TougetsuJisseki(x);
        }
  }

  public String getI1TougetsuJisseki() {
  return CommonUtils.bytesToString(getI1TougetsuJissekiBytes());
  }

  public void setI1TougetsuJisseki(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setI1TougetsuJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1TougetsuJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getI1TougetsuJisseki10Bytes() {
    return i1TougetsuJisseki10;
  }

  public void setI1TougetsuJisseki10Bytes(byte[] arg) {
    i1TougetsuJisseki10 = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuJisseki10() {
    i1TougetsuJisseki10 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1TougetsuJisseki10() {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuJisseki10Bytes());
  }

  public void setI1TougetsuJisseki10(long arg) {
  setI1TougetsuJisseki10Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1TougetsuJissekiBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getI1TougetsuJisseki1Bytes(a));
        buffer.put(getI1TougetsuJisseki2Bytes(a));
    return buffer.array();
  }

  public void setI1TougetsuJissekiBytes(int a,byte[] arg) {
        setI1TougetsuJisseki1Bytes(a,ArrayUtils.subarray(arg, 0, 2));
        setI1TougetsuJisseki2Bytes(a,ArrayUtils.subarray(arg, 2, 4));
  }

  public void initI1TougetsuJisseki(int a) {
        initI1TougetsuJisseki1(a);
        initI1TougetsuJisseki2(a);
  }

  public String getI1TougetsuJisseki(int a) {
  return CommonUtils.bytesToString(getI1TougetsuJissekiBytes(a));
  }

  public void setI1TougetsuJisseki(int a,String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setI1TougetsuJissekiBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1TougetsuJissekiBytes(a,CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getI1TougetsuJisseki1Bytes(int a) {
    return i1TougetsuJisseki1[a];
  }

  public void setI1TougetsuJisseki1Bytes(int a,byte[] arg) {
    i1TougetsuJisseki1[a] = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuJisseki1(int a) {
    i1TougetsuJisseki1[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1TougetsuJisseki1(int a) {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuJisseki1Bytes(a));
  }

  public void setI1TougetsuJisseki1(int a,long arg) {
  setI1TougetsuJisseki1Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1TougetsuJisseki2Bytes(int a) {
    return i1TougetsuJisseki2[a];
  }

  public void setI1TougetsuJisseki2Bytes(int a,byte[] arg) {
    i1TougetsuJisseki2[a] = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuJisseki2(int a) {
    i1TougetsuJisseki2[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1TougetsuJisseki2(int a) {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuJisseki2Bytes(a));
  }

  public void setI1TougetsuJisseki2(int a,long arg) {
  setI1TougetsuJisseki2Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1JigetsuJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(82);
        buffer.put(getI1JigetsuJisseki10Bytes());
        for (int x = 0; x < 20; x++) {
        buffer.put(getI1JigetsuJissekiBytes(x));
        }
    return buffer.array();
  }

  public void setI1JigetsuJissekiBytes(byte[] arg) {
        setI1JigetsuJisseki10Bytes(ArrayUtils.subarray(arg, 0, 2));
        for (int x = 0; x < 20; x++) {
        setI1JigetsuJissekiBytes(x, ArrayUtils.subarray(arg, 2 + 4 * x, 2 + 4 * (x + 1)));
        }
  }

  public void initI1JigetsuJisseki() {
        initI1JigetsuJisseki10();
        for (int x = 0; x < 20; x++) {
        initI1JigetsuJisseki(x);
        }
  }

  public String getI1JigetsuJisseki() {
  return CommonUtils.bytesToString(getI1JigetsuJissekiBytes());
  }

  public void setI1JigetsuJisseki(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setI1JigetsuJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1JigetsuJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getI1JigetsuJisseki10Bytes() {
    return i1JigetsuJisseki10;
  }

  public void setI1JigetsuJisseki10Bytes(byte[] arg) {
    i1JigetsuJisseki10 = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuJisseki10() {
    i1JigetsuJisseki10 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1JigetsuJisseki10() {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuJisseki10Bytes());
  }

  public void setI1JigetsuJisseki10(long arg) {
  setI1JigetsuJisseki10Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1JigetsuJissekiBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getI1JigetsuJisseki1Bytes(a));
        buffer.put(getI1JigetsuJisseki2Bytes(a));
    return buffer.array();
  }

  public void setI1JigetsuJissekiBytes(int a,byte[] arg) {
        setI1JigetsuJisseki1Bytes(a,ArrayUtils.subarray(arg, 0, 2));
        setI1JigetsuJisseki2Bytes(a,ArrayUtils.subarray(arg, 2, 4));
  }

  public void initI1JigetsuJisseki(int a) {
        initI1JigetsuJisseki1(a);
        initI1JigetsuJisseki2(a);
  }

  public String getI1JigetsuJisseki(int a) {
  return CommonUtils.bytesToString(getI1JigetsuJissekiBytes(a));
  }

  public void setI1JigetsuJisseki(int a,String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setI1JigetsuJissekiBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1JigetsuJissekiBytes(a,CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getI1JigetsuJisseki1Bytes(int a) {
    return i1JigetsuJisseki1[a];
  }

  public void setI1JigetsuJisseki1Bytes(int a,byte[] arg) {
    i1JigetsuJisseki1[a] = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuJisseki1(int a) {
    i1JigetsuJisseki1[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1JigetsuJisseki1(int a) {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuJisseki1Bytes(a));
  }

  public void setI1JigetsuJisseki1(int a,long arg) {
  setI1JigetsuJisseki1Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1JigetsuJisseki2Bytes(int a) {
    return i1JigetsuJisseki2[a];
  }

  public void setI1JigetsuJisseki2Bytes(int a,byte[] arg) {
    i1JigetsuJisseki2[a] = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuJisseki2(int a) {
    i1JigetsuJisseki2[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1JigetsuJisseki2(int a) {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuJisseki2Bytes(a));
  }

  public void setI1JigetsuJisseki2(int a,long arg) {
  setI1JigetsuJisseki2Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1KeikakuDaisuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(217);
        buffer.put(getI1ZenzenGetsuMatsuRuisaBytes());
        buffer.put(getI1ZengetsuKeikakuRuikeiBytes());
        buffer.put(getI1ZengetsuMatsuRuisaBytes());
        buffer.put(getI1TougetsuKeikakuBytes());
        buffer.put(getI1JigetsuKeikakuBytes());
    return buffer.array();
  }

  public void setI1KeikakuDaisuBytes(byte[] arg) {
        setI1ZenzenGetsuMatsuRuisaBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1ZengetsuKeikakuRuikeiBytes(ArrayUtils.subarray(arg, 3, 6));
        setI1ZengetsuMatsuRuisaBytes(ArrayUtils.subarray(arg, 6, 9));
        setI1TougetsuKeikakuBytes(ArrayUtils.subarray(arg, 9, 135));
        setI1JigetsuKeikakuBytes(ArrayUtils.subarray(arg, 135, 217));
  }

  public void initI1KeikakuDaisu() {
        initI1ZenzenGetsuMatsuRuisa();
        initI1ZengetsuKeikakuRuikei();
        initI1ZengetsuMatsuRuisa();
        initI1TougetsuKeikaku();
        initI1JigetsuKeikaku();
  }

  public String getI1KeikakuDaisu() {
  return CommonUtils.bytesToString(getI1KeikakuDaisuBytes());
  }

  public void setI1KeikakuDaisu(String arg) {
  final int trailing_length = 217 - arg.length();
  if (trailing_length > 0) {
  setI1KeikakuDaisuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1KeikakuDaisuBytes(CommonUtils.stringToBytes(arg.substring(0, 217)));
  }
  }

  public byte[] getI1ZenzenGetsuMatsuRuisaBytes() {
    return i1ZenzenGetsuMatsuRuisa;
  }

  public void setI1ZenzenGetsuMatsuRuisaBytes(byte[] arg) {
    i1ZenzenGetsuMatsuRuisa = ArrayUtils.clone(arg);
  }

  public void initI1ZenzenGetsuMatsuRuisa() {
    i1ZenzenGetsuMatsuRuisa =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZenzenGetsuMatsuRuisa() {
    return CommonUtils.packedDecimalToNumber(getI1ZenzenGetsuMatsuRuisaBytes());
  }

  public void setI1ZenzenGetsuMatsuRuisa(long arg) {
  setI1ZenzenGetsuMatsuRuisaBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1ZengetsuKeikakuRuikeiBytes() {
    return i1ZengetsuKeikakuRuikei;
  }

  public void setI1ZengetsuKeikakuRuikeiBytes(byte[] arg) {
    i1ZengetsuKeikakuRuikei = ArrayUtils.clone(arg);
  }

  public void initI1ZengetsuKeikakuRuikei() {
    i1ZengetsuKeikakuRuikei =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZengetsuKeikakuRuikei() {
    return CommonUtils.packedDecimalToNumber(getI1ZengetsuKeikakuRuikeiBytes());
  }

  public void setI1ZengetsuKeikakuRuikei(long arg) {
  setI1ZengetsuKeikakuRuikeiBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1ZengetsuMatsuRuisaBytes() {
    return i1ZengetsuMatsuRuisa;
  }

  public void setI1ZengetsuMatsuRuisaBytes(byte[] arg) {
    i1ZengetsuMatsuRuisa = ArrayUtils.clone(arg);
  }

  public void initI1ZengetsuMatsuRuisa() {
    i1ZengetsuMatsuRuisa =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZengetsuMatsuRuisa() {
    return CommonUtils.packedDecimalToNumber(getI1ZengetsuMatsuRuisaBytes());
  }

  public void setI1ZengetsuMatsuRuisa(long arg) {
  setI1ZengetsuMatsuRuisaBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1TougetsuKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(126);
        buffer.put(getI1TougetsuKeikaku10Bytes());
        for (int x = 0; x < 31; x++) {
        buffer.put(getI1TougetsuKeikakuBytes(x));
        }
    return buffer.array();
  }

  public void setI1TougetsuKeikakuBytes(byte[] arg) {
        setI1TougetsuKeikaku10Bytes(ArrayUtils.subarray(arg, 0, 2));
        for (int x = 0; x < 31; x++) {
        setI1TougetsuKeikakuBytes(x, ArrayUtils.subarray(arg, 2 + 4 * x, 2 + 4 * (x + 1)));
        }
  }

  public void initI1TougetsuKeikaku() {
        initI1TougetsuKeikaku10();
        for (int x = 0; x < 31; x++) {
        initI1TougetsuKeikaku(x);
        }
  }

  public String getI1TougetsuKeikaku() {
  return CommonUtils.bytesToString(getI1TougetsuKeikakuBytes());
  }

  public void setI1TougetsuKeikaku(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setI1TougetsuKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1TougetsuKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getI1TougetsuKeikaku10Bytes() {
    return i1TougetsuKeikaku10;
  }

  public void setI1TougetsuKeikaku10Bytes(byte[] arg) {
    i1TougetsuKeikaku10 = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuKeikaku10() {
    i1TougetsuKeikaku10 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1TougetsuKeikaku10() {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuKeikaku10Bytes());
  }

  public void setI1TougetsuKeikaku10(long arg) {
  setI1TougetsuKeikaku10Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1TougetsuKeikakuBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getI1TougetsuKeikaku1Bytes(a));
        buffer.put(getI1TougetsuKeikaku2Bytes(a));
    return buffer.array();
  }

  public void setI1TougetsuKeikakuBytes(int a,byte[] arg) {
        setI1TougetsuKeikaku1Bytes(a,ArrayUtils.subarray(arg, 0, 2));
        setI1TougetsuKeikaku2Bytes(a,ArrayUtils.subarray(arg, 2, 4));
  }

  public void initI1TougetsuKeikaku(int a) {
        initI1TougetsuKeikaku1(a);
        initI1TougetsuKeikaku2(a);
  }

  public String getI1TougetsuKeikaku(int a) {
  return CommonUtils.bytesToString(getI1TougetsuKeikakuBytes(a));
  }

  public void setI1TougetsuKeikaku(int a,String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setI1TougetsuKeikakuBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1TougetsuKeikakuBytes(a,CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getI1TougetsuKeikaku1Bytes(int a) {
    return i1TougetsuKeikaku1[a];
  }

  public void setI1TougetsuKeikaku1Bytes(int a,byte[] arg) {
    i1TougetsuKeikaku1[a] = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuKeikaku1(int a) {
    i1TougetsuKeikaku1[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1TougetsuKeikaku1(int a) {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuKeikaku1Bytes(a));
  }

  public void setI1TougetsuKeikaku1(int a,long arg) {
  setI1TougetsuKeikaku1Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1TougetsuKeikaku2Bytes(int a) {
    return i1TougetsuKeikaku2[a];
  }

  public void setI1TougetsuKeikaku2Bytes(int a,byte[] arg) {
    i1TougetsuKeikaku2[a] = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuKeikaku2(int a) {
    i1TougetsuKeikaku2[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1TougetsuKeikaku2(int a) {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuKeikaku2Bytes(a));
  }

  public void setI1TougetsuKeikaku2(int a,long arg) {
  setI1TougetsuKeikaku2Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1JigetsuKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(82);
        buffer.put(getI1JigetsuKeikaku10Bytes());
        for (int x = 0; x < 20; x++) {
        buffer.put(getI1JigetsuKeikakuBytes(x));
        }
    return buffer.array();
  }

  public void setI1JigetsuKeikakuBytes(byte[] arg) {
        setI1JigetsuKeikaku10Bytes(ArrayUtils.subarray(arg, 0, 2));
        for (int x = 0; x < 20; x++) {
        setI1JigetsuKeikakuBytes(x, ArrayUtils.subarray(arg, 2 + 4 * x, 2 + 4 * (x + 1)));
        }
  }

  public void initI1JigetsuKeikaku() {
        initI1JigetsuKeikaku10();
        for (int x = 0; x < 20; x++) {
        initI1JigetsuKeikaku(x);
        }
  }

  public String getI1JigetsuKeikaku() {
  return CommonUtils.bytesToString(getI1JigetsuKeikakuBytes());
  }

  public void setI1JigetsuKeikaku(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setI1JigetsuKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1JigetsuKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getI1JigetsuKeikaku10Bytes() {
    return i1JigetsuKeikaku10;
  }

  public void setI1JigetsuKeikaku10Bytes(byte[] arg) {
    i1JigetsuKeikaku10 = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuKeikaku10() {
    i1JigetsuKeikaku10 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1JigetsuKeikaku10() {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuKeikaku10Bytes());
  }

  public void setI1JigetsuKeikaku10(long arg) {
  setI1JigetsuKeikaku10Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1JigetsuKeikakuBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getI1JigetsuKeikaku1Bytes(a));
        buffer.put(getI1JigetsuKeikaku2Bytes(a));
    return buffer.array();
  }

  public void setI1JigetsuKeikakuBytes(int a,byte[] arg) {
        setI1JigetsuKeikaku1Bytes(a,ArrayUtils.subarray(arg, 0, 2));
        setI1JigetsuKeikaku2Bytes(a,ArrayUtils.subarray(arg, 2, 4));
  }

  public void initI1JigetsuKeikaku(int a) {
        initI1JigetsuKeikaku1(a);
        initI1JigetsuKeikaku2(a);
  }

  public String getI1JigetsuKeikaku(int a) {
  return CommonUtils.bytesToString(getI1JigetsuKeikakuBytes(a));
  }

  public void setI1JigetsuKeikaku(int a,String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setI1JigetsuKeikakuBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1JigetsuKeikakuBytes(a,CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getI1JigetsuKeikaku1Bytes(int a) {
    return i1JigetsuKeikaku1[a];
  }

  public void setI1JigetsuKeikaku1Bytes(int a,byte[] arg) {
    i1JigetsuKeikaku1[a] = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuKeikaku1(int a) {
    i1JigetsuKeikaku1[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1JigetsuKeikaku1(int a) {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuKeikaku1Bytes(a));
  }

  public void setI1JigetsuKeikaku1(int a,long arg) {
  setI1JigetsuKeikaku1Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1JigetsuKeikaku2Bytes(int a) {
    return i1JigetsuKeikaku2[a];
  }

  public void setI1JigetsuKeikaku2Bytes(int a,byte[] arg) {
    i1JigetsuKeikaku2[a] = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuKeikaku2(int a) {
    i1JigetsuKeikaku2[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1JigetsuKeikaku2(int a) {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuKeikaku2Bytes(a));
  }

  public void setI1JigetsuKeikaku2(int a,long arg) {
  setI1JigetsuKeikaku2Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getI1IkanDaisuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getI1ZengetsuRuikeiIkanBytes());
        buffer.put(getI1TougetsuRuikeiIkanBytes());
        buffer.put(getI1JigetsuRuikeiIkanBytes());
    return buffer.array();
  }

  public void setI1IkanDaisuBytes(byte[] arg) {
        setI1ZengetsuRuikeiIkanBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1TougetsuRuikeiIkanBytes(ArrayUtils.subarray(arg, 3, 6));
        setI1JigetsuRuikeiIkanBytes(ArrayUtils.subarray(arg, 6, 9));
  }

  public void initI1IkanDaisu() {
        initI1ZengetsuRuikeiIkan();
        initI1TougetsuRuikeiIkan();
        initI1JigetsuRuikeiIkan();
  }

  public String getI1IkanDaisu() {
  return CommonUtils.bytesToString(getI1IkanDaisuBytes());
  }

  public void setI1IkanDaisu(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setI1IkanDaisuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1IkanDaisuBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getI1ZengetsuRuikeiIkanBytes() {
    return i1ZengetsuRuikeiIkan;
  }

  public void setI1ZengetsuRuikeiIkanBytes(byte[] arg) {
    i1ZengetsuRuikeiIkan = ArrayUtils.clone(arg);
  }

  public void initI1ZengetsuRuikeiIkan() {
    i1ZengetsuRuikeiIkan =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZengetsuRuikeiIkan() {
    return CommonUtils.packedDecimalToNumber(getI1ZengetsuRuikeiIkanBytes());
  }

  public void setI1ZengetsuRuikeiIkan(long arg) {
  setI1ZengetsuRuikeiIkanBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1TougetsuRuikeiIkanBytes() {
    return i1TougetsuRuikeiIkan;
  }

  public void setI1TougetsuRuikeiIkanBytes(byte[] arg) {
    i1TougetsuRuikeiIkan = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuRuikeiIkan() {
    i1TougetsuRuikeiIkan =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1TougetsuRuikeiIkan() {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuRuikeiIkanBytes());
  }

  public void setI1TougetsuRuikeiIkan(long arg) {
  setI1TougetsuRuikeiIkanBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1JigetsuRuikeiIkanBytes() {
    return i1JigetsuRuikeiIkan;
  }

  public void setI1JigetsuRuikeiIkanBytes(byte[] arg) {
    i1JigetsuRuikeiIkan = ArrayUtils.clone(arg);
  }

  public void initI1JigetsuRuikeiIkan() {
    i1JigetsuRuikeiIkan =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1JigetsuRuikeiIkan() {
    return CommonUtils.packedDecimalToNumber(getI1JigetsuRuikeiIkanBytes());
  }

  public void setI1JigetsuRuikeiIkan(long arg) {
  setI1JigetsuRuikeiIkanBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1ShikyuDaisuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getI1ZengetsuShikyuBytes());
        buffer.put(getI1TougetsuShikyuBytes());
        buffer.put(getI1ZigetsuShikyuBytes());
    return buffer.array();
  }

  public void setI1ShikyuDaisuBytes(byte[] arg) {
        setI1ZengetsuShikyuBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1TougetsuShikyuBytes(ArrayUtils.subarray(arg, 3, 6));
        setI1ZigetsuShikyuBytes(ArrayUtils.subarray(arg, 6, 9));
  }

  public void initI1ShikyuDaisu() {
        initI1ZengetsuShikyu();
        initI1TougetsuShikyu();
        initI1ZigetsuShikyu();
  }

  public String getI1ShikyuDaisu() {
  return CommonUtils.bytesToString(getI1ShikyuDaisuBytes());
  }

  public void setI1ShikyuDaisu(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setI1ShikyuDaisuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1ShikyuDaisuBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getI1ZengetsuShikyuBytes() {
    return i1ZengetsuShikyu;
  }

  public void setI1ZengetsuShikyuBytes(byte[] arg) {
    i1ZengetsuShikyu = ArrayUtils.clone(arg);
  }

  public void initI1ZengetsuShikyu() {
    i1ZengetsuShikyu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZengetsuShikyu() {
    return CommonUtils.packedDecimalToNumber(getI1ZengetsuShikyuBytes());
  }

  public void setI1ZengetsuShikyu(long arg) {
  setI1ZengetsuShikyuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1TougetsuShikyuBytes() {
    return i1TougetsuShikyu;
  }

  public void setI1TougetsuShikyuBytes(byte[] arg) {
    i1TougetsuShikyu = ArrayUtils.clone(arg);
  }

  public void initI1TougetsuShikyu() {
    i1TougetsuShikyu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1TougetsuShikyu() {
    return CommonUtils.packedDecimalToNumber(getI1TougetsuShikyuBytes());
  }

  public void setI1TougetsuShikyu(long arg) {
  setI1TougetsuShikyuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1ZigetsuShikyuBytes() {
    return i1ZigetsuShikyu;
  }

  public void setI1ZigetsuShikyuBytes(byte[] arg) {
    i1ZigetsuShikyu = ArrayUtils.clone(arg);
  }

  public void initI1ZigetsuShikyu() {
    i1ZigetsuShikyu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZigetsuShikyu() {
    return CommonUtils.packedDecimalToNumber(getI1ZigetsuShikyuBytes());
  }

  public void setI1ZigetsuShikyu(long arg) {
  setI1ZigetsuShikyuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1MikenBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getI1ZenzenGetsuMikeBytes());
        buffer.put(getI1ZenGetsuMikenBytes());
    return buffer.array();
  }

  public void setI1MikenBytes(byte[] arg) {
        setI1ZenzenGetsuMikeBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1ZenGetsuMikenBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initI1Miken() {
        initI1ZenzenGetsuMike();
        initI1ZenGetsuMiken();
  }

  public String getI1Miken() {
  return CommonUtils.bytesToString(getI1MikenBytes());
  }

  public void setI1Miken(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setI1MikenBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1MikenBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getI1ZenzenGetsuMikeBytes() {
    return i1ZenzenGetsuMike;
  }

  public void setI1ZenzenGetsuMikeBytes(byte[] arg) {
    i1ZenzenGetsuMike = ArrayUtils.clone(arg);
  }

  public void initI1ZenzenGetsuMike() {
    i1ZenzenGetsuMike =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZenzenGetsuMike() {
    return CommonUtils.packedDecimalToNumber(getI1ZenzenGetsuMikeBytes());
  }

  public void setI1ZenzenGetsuMike(long arg) {
  setI1ZenzenGetsuMikeBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1ZenGetsuMikenBytes() {
    return i1ZenGetsuMiken;
  }

  public void setI1ZenGetsuMikenBytes(byte[] arg) {
    i1ZenGetsuMiken = ArrayUtils.clone(arg);
  }

  public void initI1ZenGetsuMiken() {
    i1ZenGetsuMiken =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZenGetsuMiken() {
    return CommonUtils.packedDecimalToNumber(getI1ZenGetsuMikenBytes());
  }

  public void setI1ZenGetsuMiken(long arg) {
  setI1ZenGetsuMikenBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1KankenBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getI1ZenzenGetsuKankenBytes());
        buffer.put(getI1ZenGetsuKankenBytes());
    return buffer.array();
  }

  public void setI1KankenBytes(byte[] arg) {
        setI1ZenzenGetsuKankenBytes(ArrayUtils.subarray(arg, 0, 3));
        setI1ZenGetsuKankenBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initI1Kanken() {
        initI1ZenzenGetsuKanken();
        initI1ZenGetsuKanken();
  }

  public String getI1Kanken() {
  return CommonUtils.bytesToString(getI1KankenBytes());
  }

  public void setI1Kanken(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setI1KankenBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1KankenBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getI1ZenzenGetsuKankenBytes() {
    return i1ZenzenGetsuKanken;
  }

  public void setI1ZenzenGetsuKankenBytes(byte[] arg) {
    i1ZenzenGetsuKanken = ArrayUtils.clone(arg);
  }

  public void initI1ZenzenGetsuKanken() {
    i1ZenzenGetsuKanken =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZenzenGetsuKanken() {
    return CommonUtils.packedDecimalToNumber(getI1ZenzenGetsuKankenBytes());
  }

  public void setI1ZenzenGetsuKanken(long arg) {
  setI1ZenzenGetsuKankenBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getI1ZenGetsuKankenBytes() {
    return i1ZenGetsuKanken;
  }

  public void setI1ZenGetsuKankenBytes(byte[] arg) {
    i1ZenGetsuKanken = ArrayUtils.clone(arg);
  }

  public void initI1ZenGetsuKanken() {
    i1ZenGetsuKanken =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getI1ZenGetsuKanken() {
    return CommonUtils.packedDecimalToNumber(getI1ZenGetsuKankenBytes());
  }

  public void setI1ZenGetsuKanken(long arg) {
  setI1ZenGetsuKankenBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getFiller0004Bytes() {
    return filler0004;
  }

  public void setFiller0004Bytes(byte[] arg) {
    filler0004 = ArrayUtils.clone(arg);
  }

  public void initFiller0004() {
    filler0004 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getFiller0004() {
  return CommonUtils.bytesToString(getFiller0004Bytes());
  }

  public void setFiller0004(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setFiller0004Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setFiller0004Bytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getO1CatsShiyouBetsuRecBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(580);
        buffer.put(getO1ControlKeyBytes());
        buffer.put(getO1KokuyuKubunBytes());
        buffer.put(getO1ShimukechiBytes());
        buffer.put(getO1KoujouKubunBytes());
        buffer.put(getO1ListJunBytes());
        buffer.put(getO1KijunShakeiBytes());
        buffer.put(getO1KeikakuNengetsuBytes());
        buffer.put(getO1OffLineKeikakuTougetsuBytes());
        buffer.put(getO1OffLineKeikakuGigetsuBytes());
        buffer.put(getO1OffLineJissekiTougetsuBytes());
        buffer.put(getO1OffLineJissekiJigetsuBytes());
        buffer.put(getO1FinalKeikakuTougetsuBytes());
        buffer.put(getO1FinalKeikakuJigetsuBytes());
        buffer.put(getO1FinalJissekiTougetsuBytes());
        buffer.put(getO1FinalJissekiJigetsuBytes());
        buffer.put(getO1ShaukeTougetsuBytes());
        buffer.put(getO1ShaukeJigetsuBytes());
        buffer.put(getO1IkanShikyuTougetsuBytes());
        buffer.put(getO1IkanShikyuJigetsuBytes());
        buffer.put(getO1TimeStampBytes());
    return buffer.array();
  }

  public void setO1CatsShiyouBetsuRecBytes(byte[] arg) {
        setO1ControlKeyBytes(ArrayUtils.subarray(arg, 0, 28));
        setO1KokuyuKubunBytes(ArrayUtils.subarray(arg, 28, 29));
        setO1ShimukechiBytes(ArrayUtils.subarray(arg, 29, 32));
        setO1KoujouKubunBytes(ArrayUtils.subarray(arg, 32, 34));
        setO1ListJunBytes(ArrayUtils.subarray(arg, 34, 37));
        setO1KijunShakeiBytes(ArrayUtils.subarray(arg, 37, 42));
        setO1KeikakuNengetsuBytes(ArrayUtils.subarray(arg, 42, 46));
        setO1OffLineKeikakuTougetsuBytes(ArrayUtils.subarray(arg, 46, 110));
        setO1OffLineKeikakuGigetsuBytes(ArrayUtils.subarray(arg, 110, 150));
        setO1OffLineJissekiTougetsuBytes(ArrayUtils.subarray(arg, 150, 212));
        setO1OffLineJissekiJigetsuBytes(ArrayUtils.subarray(arg, 212, 252));
        setO1FinalKeikakuTougetsuBytes(ArrayUtils.subarray(arg, 252, 316));
        setO1FinalKeikakuJigetsuBytes(ArrayUtils.subarray(arg, 316, 356));
        setO1FinalJissekiTougetsuBytes(ArrayUtils.subarray(arg, 356, 418));
        setO1FinalJissekiJigetsuBytes(ArrayUtils.subarray(arg, 418, 458));
        setO1ShaukeTougetsuBytes(ArrayUtils.subarray(arg, 458, 524));
        setO1ShaukeJigetsuBytes(ArrayUtils.subarray(arg, 524, 564));
        setO1IkanShikyuTougetsuBytes(ArrayUtils.subarray(arg, 564, 566));
        setO1IkanShikyuJigetsuBytes(ArrayUtils.subarray(arg, 566, 568));
        setO1TimeStampBytes(ArrayUtils.subarray(arg, 568, 580));
  }

  public void initO1CatsShiyouBetsuRec() {
        initO1ControlKey();
        initO1KokuyuKubun();
        initO1Shimukechi();
        initO1KoujouKubun();
        initO1ListJun();
        initO1KijunShakei();
        initO1KeikakuNengetsu();
        initO1OffLineKeikakuTougetsu();
        initO1OffLineKeikakuGigetsu();
        initO1OffLineJissekiTougetsu();
        initO1OffLineJissekiJigetsu();
        initO1FinalKeikakuTougetsu();
        initO1FinalKeikakuJigetsu();
        initO1FinalJissekiTougetsu();
        initO1FinalJissekiJigetsu();
        initO1ShaukeTougetsu();
        initO1ShaukeJigetsu();
        initO1IkanShikyuTougetsu();
        initO1IkanShikyuJigetsu();
        initO1TimeStamp();
  }

  public String getO1CatsShiyouBetsuRec() {
  return CommonUtils.bytesToString(getO1CatsShiyouBetsuRecBytes());
  }

  public void setO1CatsShiyouBetsuRec(String arg) {
  final int trailing_length = 580 - arg.length();
  if (trailing_length > 0) {
  setO1CatsShiyouBetsuRecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1CatsShiyouBetsuRecBytes(CommonUtils.stringToBytes(arg.substring(0, 580)));
  }
  }

  public byte[] getO1ControlKeyBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(28);
        buffer.put(getO1ShashuBytes());
        buffer.put(getO1ExNoBytes());
        buffer.put(getO1ToshokuBytes());
        buffer.put(getO1UchibariBytes());
        buffer.put(getO1TrimLineBytes());
    return buffer.array();
  }

  public void setO1ControlKeyBytes(byte[] arg) {
        setO1ShashuBytes(ArrayUtils.subarray(arg, 0, 18));
        setO1ExNoBytes(ArrayUtils.subarray(arg, 18, 23));
        setO1ToshokuBytes(ArrayUtils.subarray(arg, 23, 26));
        setO1UchibariBytes(ArrayUtils.subarray(arg, 26, 27));
        setO1TrimLineBytes(ArrayUtils.subarray(arg, 27, 28));
  }

  public void initO1ControlKey() {
        initO1Shashu();
        initO1ExNo();
        initO1Toshoku();
        initO1Uchibari();
        initO1TrimLine();
  }

  public String getO1ControlKey() {
  return CommonUtils.bytesToString(getO1ControlKeyBytes());
  }

  public void setO1ControlKey(String arg) {
  final int trailing_length = 28 - arg.length();
  if (trailing_length > 0) {
  setO1ControlKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ControlKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 28)));
  }
  }

  public byte[] getO1ShashuBytes() {
    return o1Shashu;
  }

  public void setO1ShashuBytes(byte[] arg) {
    o1Shashu = ArrayUtils.clone(arg);
  }

  public void initO1Shashu() {
    o1Shashu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getO1Shashu() {
  return CommonUtils.bytesToString(getO1ShashuBytes());
  }

  public void setO1Shashu(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setO1ShashuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ShashuBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getO1ExNoBytes() {
    return o1ExNo;
  }

  public void setO1ExNoBytes(byte[] arg) {
    o1ExNo = ArrayUtils.clone(arg);
  }

  public void initO1ExNo() {
    o1ExNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getO1ExNo() {
  return CommonUtils.bytesToString(getO1ExNoBytes());
  }

  public void setO1ExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setO1ExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getO1ToshokuBytes() {
    return o1Toshoku;
  }

  public void setO1ToshokuBytes(byte[] arg) {
    o1Toshoku = ArrayUtils.clone(arg);
  }

  public void initO1Toshoku() {
    o1Toshoku =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getO1Toshoku() {
  return CommonUtils.bytesToString(getO1ToshokuBytes());
  }

  public void setO1Toshoku(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setO1ToshokuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ToshokuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getO1UchibariBytes() {
    return o1Uchibari;
  }

  public void setO1UchibariBytes(byte[] arg) {
    o1Uchibari = ArrayUtils.clone(arg);
  }

  public void initO1Uchibari() {
    o1Uchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getO1Uchibari() {
  return CommonUtils.bytesToString(getO1UchibariBytes());
  }

  public void setO1Uchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setO1UchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1UchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getO1TrimLineBytes() {
    return o1TrimLine;
  }

  public void setO1TrimLineBytes(byte[] arg) {
    o1TrimLine = ArrayUtils.clone(arg);
  }

  public void initO1TrimLine() {
    o1TrimLine =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getO1TrimLine() {
  return CommonUtils.bytesToString(getO1TrimLineBytes());
  }

  public void setO1TrimLine(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setO1TrimLineBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1TrimLineBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getO1KokuyuKubunBytes() {
    return o1KokuyuKubun;
  }

  public void setO1KokuyuKubunBytes(byte[] arg) {
    o1KokuyuKubun = ArrayUtils.clone(arg);
  }

  public void initO1KokuyuKubun() {
    o1KokuyuKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getO1KokuyuKubun() {
  return CommonUtils.bytesToString(getO1KokuyuKubunBytes());
  }

  public void setO1KokuyuKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setO1KokuyuKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1KokuyuKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getO1ShimukechiBytes() {
    return o1Shimukechi;
  }

  public void setO1ShimukechiBytes(byte[] arg) {
    o1Shimukechi = ArrayUtils.clone(arg);
  }

  public void initO1Shimukechi() {
    o1Shimukechi =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getO1Shimukechi() {
  return CommonUtils.bytesToString(getO1ShimukechiBytes());
  }

  public void setO1Shimukechi(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setO1ShimukechiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ShimukechiBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getO1KoujouKubunBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer.put(getO1Kami1ketaBytes());
        buffer.put(getO1Shimo1ketaBytes());
    return buffer.array();
  }

  public void setO1KoujouKubunBytes(byte[] arg) {
        setO1Kami1ketaBytes(ArrayUtils.subarray(arg, 0, 1));
        setO1Shimo1ketaBytes(ArrayUtils.subarray(arg, 1, 2));
  }

  public void initO1KoujouKubun() {
        initO1Kami1keta();
        initO1Shimo1keta();
  }

  public String getO1KoujouKubun() {
  return CommonUtils.bytesToString(getO1KoujouKubunBytes());
  }

  public void setO1KoujouKubun(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setO1KoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1KoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getO1Kami1ketaBytes() {
    return o1Kami1keta;
  }

  public void setO1Kami1ketaBytes(byte[] arg) {
    o1Kami1keta = ArrayUtils.clone(arg);
  }

  public void initO1Kami1keta() {
    o1Kami1keta =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getO1Kami1keta() {
  return CommonUtils.bytesToString(getO1Kami1ketaBytes());
  }

  public void setO1Kami1keta(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setO1Kami1ketaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1Kami1ketaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getO1Shimo1ketaBytes() {
    return o1Shimo1keta;
  }

  public void setO1Shimo1ketaBytes(byte[] arg) {
    o1Shimo1keta = ArrayUtils.clone(arg);
  }

  public void initO1Shimo1keta() {
    o1Shimo1keta =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getO1Shimo1keta() {
  return CommonUtils.bytesToString(getO1Shimo1ketaBytes());
  }

  public void setO1Shimo1keta(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setO1Shimo1ketaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1Shimo1ketaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getO1ListJunBytes() {
    return o1ListJun;
  }

  public void setO1ListJunBytes(byte[] arg) {
    o1ListJun = ArrayUtils.clone(arg);
  }

  public void initO1ListJun() {
    o1ListJun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getO1ListJun() {
  return CommonUtils.bytesToString(getO1ListJunBytes());
  }

  public void setO1ListJun(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setO1ListJunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ListJunBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getO1KijunShakeiBytes() {
    return o1KijunShakei;
  }

  public void setO1KijunShakeiBytes(byte[] arg) {
    o1KijunShakei = ArrayUtils.clone(arg);
  }

  public void initO1KijunShakei() {
    o1KijunShakei =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getO1KijunShakei() {
  return CommonUtils.bytesToString(getO1KijunShakeiBytes());
  }

  public void setO1KijunShakei(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setO1KijunShakeiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1KijunShakeiBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getO1KeikakuNengetsuBytes() {
    return o1KeikakuNengetsu;
  }

  public void setO1KeikakuNengetsuBytes(byte[] arg) {
    o1KeikakuNengetsu = ArrayUtils.clone(arg);
  }

  public void initO1KeikakuNengetsu() {
    o1KeikakuNengetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getO1KeikakuNengetsu() {
  return CommonUtils.bytesToString(getO1KeikakuNengetsuBytes());
  }

  public void setO1KeikakuNengetsu(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setO1KeikakuNengetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1KeikakuNengetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getO1OffLineKeikakuTougetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(64);
        buffer.put(getO1OffGettoRuisaBytes());
        for (int x = 0; x < 31; x++) {
        buffer.put(getO1OffKeikakuTougetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1OffLineKeikakuTougetsuBytes(byte[] arg) {
        setO1OffGettoRuisaBytes(ArrayUtils.subarray(arg, 0, 2));
        for (int x = 0; x < 31; x++) {
        setO1OffKeikakuTougetsuDaisuBytes(x, ArrayUtils.subarray(arg, 2 + 2 * x, 2 + 2 * (x + 1)));
        }
  }

  public void initO1OffLineKeikakuTougetsu() {
        initO1OffGettoRuisa();
        for (int x = 0; x < 31; x++) {
        initO1OffKeikakuTougetsuDaisu(x);
        }
  }

  public String getO1OffLineKeikakuTougetsu() {
  return CommonUtils.bytesToString(getO1OffLineKeikakuTougetsuBytes());
  }

  public void setO1OffLineKeikakuTougetsu(String arg) {
  final int trailing_length = 64 - arg.length();
  if (trailing_length > 0) {
  setO1OffLineKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1OffLineKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 64)));
  }
  }

  public byte[] getO1OffGettoRuisaBytes() {
    return o1OffGettoRuisa;
  }

  public void setO1OffGettoRuisaBytes(byte[] arg) {
    o1OffGettoRuisa = ArrayUtils.clone(arg);
  }

  public void initO1OffGettoRuisa() {
    o1OffGettoRuisa =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1OffGettoRuisa() {
    return CommonUtils.packedDecimalToNumber(getO1OffGettoRuisaBytes());
  }

  public void setO1OffGettoRuisa(long arg) {
  setO1OffGettoRuisaBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1OffKeikakuTougetsuDaisuBytes(int a) {
    return o1OffKeikakuTougetsuDaisu[a];
  }

  public void setO1OffKeikakuTougetsuDaisuBytes(int a,byte[] arg) {
    o1OffKeikakuTougetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1OffKeikakuTougetsuDaisu(int a) {
    o1OffKeikakuTougetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1OffKeikakuTougetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1OffKeikakuTougetsuDaisuBytes(a));
  }

  public void setO1OffKeikakuTougetsuDaisu(int a,long arg) {
  setO1OffKeikakuTougetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1OffLineKeikakuGigetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(40);
        for (int x = 0; x < 20; x++) {
        buffer.put(getO1OffKeikakuJigetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1OffLineKeikakuGigetsuBytes(byte[] arg) {
        for (int x = 0; x < 20; x++) {
        setO1OffKeikakuJigetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1OffLineKeikakuGigetsu() {
        for (int x = 0; x < 20; x++) {
        initO1OffKeikakuJigetsuDaisu(x);
        }
  }

  public String getO1OffLineKeikakuGigetsu() {
  return CommonUtils.bytesToString(getO1OffLineKeikakuGigetsuBytes());
  }

  public void setO1OffLineKeikakuGigetsu(String arg) {
  final int trailing_length = 40 - arg.length();
  if (trailing_length > 0) {
  setO1OffLineKeikakuGigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1OffLineKeikakuGigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 40)));
  }
  }

  public byte[] getO1OffKeikakuJigetsuDaisuBytes(int a) {
    return o1OffKeikakuJigetsuDaisu[a];
  }

  public void setO1OffKeikakuJigetsuDaisuBytes(int a,byte[] arg) {
    o1OffKeikakuJigetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1OffKeikakuJigetsuDaisu(int a) {
    o1OffKeikakuJigetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1OffKeikakuJigetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1OffKeikakuJigetsuDaisuBytes(a));
  }

  public void setO1OffKeikakuJigetsuDaisu(int a,long arg) {
  setO1OffKeikakuJigetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1OffLineJissekiTougetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(62);
        for (int x = 0; x < 31; x++) {
        buffer.put(getO1OffJissekiTougetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1OffLineJissekiTougetsuBytes(byte[] arg) {
        for (int x = 0; x < 31; x++) {
        setO1OffJissekiTougetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1OffLineJissekiTougetsu() {
        for (int x = 0; x < 31; x++) {
        initO1OffJissekiTougetsuDaisu(x);
        }
  }

  public String getO1OffLineJissekiTougetsu() {
  return CommonUtils.bytesToString(getO1OffLineJissekiTougetsuBytes());
  }

  public void setO1OffLineJissekiTougetsu(String arg) {
  final int trailing_length = 62 - arg.length();
  if (trailing_length > 0) {
  setO1OffLineJissekiTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1OffLineJissekiTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 62)));
  }
  }

  public byte[] getO1OffJissekiTougetsuDaisuBytes(int a) {
    return o1OffJissekiTougetsuDaisu[a];
  }

  public void setO1OffJissekiTougetsuDaisuBytes(int a,byte[] arg) {
    o1OffJissekiTougetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1OffJissekiTougetsuDaisu(int a) {
    o1OffJissekiTougetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1OffJissekiTougetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1OffJissekiTougetsuDaisuBytes(a));
  }

  public void setO1OffJissekiTougetsuDaisu(int a,long arg) {
  setO1OffJissekiTougetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1OffLineJissekiJigetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(40);
        for (int x = 0; x < 20; x++) {
        buffer.put(getO1OffJissekiJigetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1OffLineJissekiJigetsuBytes(byte[] arg) {
        for (int x = 0; x < 20; x++) {
        setO1OffJissekiJigetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1OffLineJissekiJigetsu() {
        for (int x = 0; x < 20; x++) {
        initO1OffJissekiJigetsuDaisu(x);
        }
  }

  public String getO1OffLineJissekiJigetsu() {
  return CommonUtils.bytesToString(getO1OffLineJissekiJigetsuBytes());
  }

  public void setO1OffLineJissekiJigetsu(String arg) {
  final int trailing_length = 40 - arg.length();
  if (trailing_length > 0) {
  setO1OffLineJissekiJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1OffLineJissekiJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 40)));
  }
  }

  public byte[] getO1OffJissekiJigetsuDaisuBytes(int a) {
    return o1OffJissekiJigetsuDaisu[a];
  }

  public void setO1OffJissekiJigetsuDaisuBytes(int a,byte[] arg) {
    o1OffJissekiJigetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1OffJissekiJigetsuDaisu(int a) {
    o1OffJissekiJigetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1OffJissekiJigetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1OffJissekiJigetsuDaisuBytes(a));
  }

  public void setO1OffJissekiJigetsuDaisu(int a,long arg) {
  setO1OffJissekiJigetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1FinalKeikakuTougetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(64);
        buffer.put(getO1FinGettoRuisaBytes());
        for (int x = 0; x < 31; x++) {
        buffer.put(getO1FinKeikakuTougetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1FinalKeikakuTougetsuBytes(byte[] arg) {
        setO1FinGettoRuisaBytes(ArrayUtils.subarray(arg, 0, 2));
        for (int x = 0; x < 31; x++) {
        setO1FinKeikakuTougetsuDaisuBytes(x, ArrayUtils.subarray(arg, 2 + 2 * x, 2 + 2 * (x + 1)));
        }
  }

  public void initO1FinalKeikakuTougetsu() {
        initO1FinGettoRuisa();
        for (int x = 0; x < 31; x++) {
        initO1FinKeikakuTougetsuDaisu(x);
        }
  }

  public String getO1FinalKeikakuTougetsu() {
  return CommonUtils.bytesToString(getO1FinalKeikakuTougetsuBytes());
  }

  public void setO1FinalKeikakuTougetsu(String arg) {
  final int trailing_length = 64 - arg.length();
  if (trailing_length > 0) {
  setO1FinalKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1FinalKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 64)));
  }
  }

  public byte[] getO1FinGettoRuisaBytes() {
    return o1FinGettoRuisa;
  }

  public void setO1FinGettoRuisaBytes(byte[] arg) {
    o1FinGettoRuisa = ArrayUtils.clone(arg);
  }

  public void initO1FinGettoRuisa() {
    o1FinGettoRuisa =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1FinGettoRuisa() {
    return CommonUtils.packedDecimalToNumber(getO1FinGettoRuisaBytes());
  }

  public void setO1FinGettoRuisa(long arg) {
  setO1FinGettoRuisaBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1FinKeikakuTougetsuDaisuBytes(int a) {
    return o1FinKeikakuTougetsuDaisu[a];
  }

  public void setO1FinKeikakuTougetsuDaisuBytes(int a,byte[] arg) {
    o1FinKeikakuTougetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1FinKeikakuTougetsuDaisu(int a) {
    o1FinKeikakuTougetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1FinKeikakuTougetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1FinKeikakuTougetsuDaisuBytes(a));
  }

  public void setO1FinKeikakuTougetsuDaisu(int a,long arg) {
  setO1FinKeikakuTougetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1FinalKeikakuJigetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(40);
        for (int x = 0; x < 20; x++) {
        buffer.put(getO1FinKeikakuJigetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1FinalKeikakuJigetsuBytes(byte[] arg) {
        for (int x = 0; x < 20; x++) {
        setO1FinKeikakuJigetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1FinalKeikakuJigetsu() {
        for (int x = 0; x < 20; x++) {
        initO1FinKeikakuJigetsuDaisu(x);
        }
  }

  public String getO1FinalKeikakuJigetsu() {
  return CommonUtils.bytesToString(getO1FinalKeikakuJigetsuBytes());
  }

  public void setO1FinalKeikakuJigetsu(String arg) {
  final int trailing_length = 40 - arg.length();
  if (trailing_length > 0) {
  setO1FinalKeikakuJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1FinalKeikakuJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 40)));
  }
  }

  public byte[] getO1FinKeikakuJigetsuDaisuBytes(int a) {
    return o1FinKeikakuJigetsuDaisu[a];
  }

  public void setO1FinKeikakuJigetsuDaisuBytes(int a,byte[] arg) {
    o1FinKeikakuJigetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1FinKeikakuJigetsuDaisu(int a) {
    o1FinKeikakuJigetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1FinKeikakuJigetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1FinKeikakuJigetsuDaisuBytes(a));
  }

  public void setO1FinKeikakuJigetsuDaisu(int a,long arg) {
  setO1FinKeikakuJigetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1FinalJissekiTougetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(62);
        for (int x = 0; x < 31; x++) {
        buffer.put(getO1FinJissekiTougetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1FinalJissekiTougetsuBytes(byte[] arg) {
        for (int x = 0; x < 31; x++) {
        setO1FinJissekiTougetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1FinalJissekiTougetsu() {
        for (int x = 0; x < 31; x++) {
        initO1FinJissekiTougetsuDaisu(x);
        }
  }

  public String getO1FinalJissekiTougetsu() {
  return CommonUtils.bytesToString(getO1FinalJissekiTougetsuBytes());
  }

  public void setO1FinalJissekiTougetsu(String arg) {
  final int trailing_length = 62 - arg.length();
  if (trailing_length > 0) {
  setO1FinalJissekiTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1FinalJissekiTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 62)));
  }
  }

  public byte[] getO1FinJissekiTougetsuDaisuBytes(int a) {
    return o1FinJissekiTougetsuDaisu[a];
  }

  public void setO1FinJissekiTougetsuDaisuBytes(int a,byte[] arg) {
    o1FinJissekiTougetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1FinJissekiTougetsuDaisu(int a) {
    o1FinJissekiTougetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1FinJissekiTougetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1FinJissekiTougetsuDaisuBytes(a));
  }

  public void setO1FinJissekiTougetsuDaisu(int a,long arg) {
  setO1FinJissekiTougetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1FinalJissekiJigetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(40);
        for (int x = 0; x < 20; x++) {
        buffer.put(getO1FinJissekiJigetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1FinalJissekiJigetsuBytes(byte[] arg) {
        for (int x = 0; x < 20; x++) {
        setO1FinJissekiJigetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1FinalJissekiJigetsu() {
        for (int x = 0; x < 20; x++) {
        initO1FinJissekiJigetsuDaisu(x);
        }
  }

  public String getO1FinalJissekiJigetsu() {
  return CommonUtils.bytesToString(getO1FinalJissekiJigetsuBytes());
  }

  public void setO1FinalJissekiJigetsu(String arg) {
  final int trailing_length = 40 - arg.length();
  if (trailing_length > 0) {
  setO1FinalJissekiJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1FinalJissekiJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 40)));
  }
  }

  public byte[] getO1FinJissekiJigetsuDaisuBytes(int a) {
    return o1FinJissekiJigetsuDaisu[a];
  }

  public void setO1FinJissekiJigetsuDaisuBytes(int a,byte[] arg) {
    o1FinJissekiJigetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1FinJissekiJigetsuDaisu(int a) {
    o1FinJissekiJigetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1FinJissekiJigetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1FinJissekiJigetsuDaisuBytes(a));
  }

  public void setO1FinJissekiJigetsuDaisu(int a,long arg) {
  setO1FinJissekiJigetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1ShaukeTougetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(66);
        buffer.put(getO1MikenZaikoBytes());
        buffer.put(getO1KankenZaikoBytes());
        for (int x = 0; x < 31; x++) {
        buffer.put(getO1ShaukeTougetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1ShaukeTougetsuBytes(byte[] arg) {
        setO1MikenZaikoBytes(ArrayUtils.subarray(arg, 0, 2));
        setO1KankenZaikoBytes(ArrayUtils.subarray(arg, 2, 4));
        for (int x = 0; x < 31; x++) {
        setO1ShaukeTougetsuDaisuBytes(x, ArrayUtils.subarray(arg, 4 + 2 * x, 4 + 2 * (x + 1)));
        }
  }

  public void initO1ShaukeTougetsu() {
        initO1MikenZaiko();
        initO1KankenZaiko();
        for (int x = 0; x < 31; x++) {
        initO1ShaukeTougetsuDaisu(x);
        }
  }

  public String getO1ShaukeTougetsu() {
  return CommonUtils.bytesToString(getO1ShaukeTougetsuBytes());
  }

  public void setO1ShaukeTougetsu(String arg) {
  final int trailing_length = 66 - arg.length();
  if (trailing_length > 0) {
  setO1ShaukeTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ShaukeTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 66)));
  }
  }

  public byte[] getO1MikenZaikoBytes() {
    return o1MikenZaiko;
  }

  public void setO1MikenZaikoBytes(byte[] arg) {
    o1MikenZaiko = ArrayUtils.clone(arg);
  }

  public void initO1MikenZaiko() {
    o1MikenZaiko =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1MikenZaiko() {
    return CommonUtils.packedDecimalToNumber(getO1MikenZaikoBytes());
  }

  public void setO1MikenZaiko(long arg) {
  setO1MikenZaikoBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1KankenZaikoBytes() {
    return o1KankenZaiko;
  }

  public void setO1KankenZaikoBytes(byte[] arg) {
    o1KankenZaiko = ArrayUtils.clone(arg);
  }

  public void initO1KankenZaiko() {
    o1KankenZaiko =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1KankenZaiko() {
    return CommonUtils.packedDecimalToNumber(getO1KankenZaikoBytes());
  }

  public void setO1KankenZaiko(long arg) {
  setO1KankenZaikoBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1ShaukeTougetsuDaisuBytes(int a) {
    return o1ShaukeTougetsuDaisu[a];
  }

  public void setO1ShaukeTougetsuDaisuBytes(int a,byte[] arg) {
    o1ShaukeTougetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1ShaukeTougetsuDaisu(int a) {
    o1ShaukeTougetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1ShaukeTougetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1ShaukeTougetsuDaisuBytes(a));
  }

  public void setO1ShaukeTougetsuDaisu(int a,long arg) {
  setO1ShaukeTougetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1ShaukeJigetsuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(40);
        for (int x = 0; x < 20; x++) {
        buffer.put(getO1ShaukeJigetsuDaisuBytes(x));
        }
    return buffer.array();
  }

  public void setO1ShaukeJigetsuBytes(byte[] arg) {
        for (int x = 0; x < 20; x++) {
        setO1ShaukeJigetsuDaisuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initO1ShaukeJigetsu() {
        for (int x = 0; x < 20; x++) {
        initO1ShaukeJigetsuDaisu(x);
        }
  }

  public String getO1ShaukeJigetsu() {
  return CommonUtils.bytesToString(getO1ShaukeJigetsuBytes());
  }

  public void setO1ShaukeJigetsu(String arg) {
  final int trailing_length = 40 - arg.length();
  if (trailing_length > 0) {
  setO1ShaukeJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1ShaukeJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 40)));
  }
  }

  public byte[] getO1ShaukeJigetsuDaisuBytes(int a) {
    return o1ShaukeJigetsuDaisu[a];
  }

  public void setO1ShaukeJigetsuDaisuBytes(int a,byte[] arg) {
    o1ShaukeJigetsuDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initO1ShaukeJigetsuDaisu(int a) {
    o1ShaukeJigetsuDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1ShaukeJigetsuDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getO1ShaukeJigetsuDaisuBytes(a));
  }

  public void setO1ShaukeJigetsuDaisu(int a,long arg) {
  setO1ShaukeJigetsuDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1IkanShikyuTougetsuBytes() {
    return o1IkanShikyuTougetsu;
  }

  public void setO1IkanShikyuTougetsuBytes(byte[] arg) {
    o1IkanShikyuTougetsu = ArrayUtils.clone(arg);
  }

  public void initO1IkanShikyuTougetsu() {
    o1IkanShikyuTougetsu =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1IkanShikyuTougetsu() {
    return CommonUtils.packedDecimalToNumber(getO1IkanShikyuTougetsuBytes());
  }

  public void setO1IkanShikyuTougetsu(long arg) {
  setO1IkanShikyuTougetsuBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1IkanShikyuJigetsuBytes() {
    return o1IkanShikyuJigetsu;
  }

  public void setO1IkanShikyuJigetsuBytes(byte[] arg) {
    o1IkanShikyuJigetsu = ArrayUtils.clone(arg);
  }

  public void initO1IkanShikyuJigetsu() {
    o1IkanShikyuJigetsu =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getO1IkanShikyuJigetsu() {
    return CommonUtils.packedDecimalToNumber(getO1IkanShikyuJigetsuBytes());
  }

  public void setO1IkanShikyuJigetsu(long arg) {
  setO1IkanShikyuJigetsuBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getO1TimeStampBytes() {
    return o1TimeStamp;
  }

  public void setO1TimeStampBytes(byte[] arg) {
    o1TimeStamp = ArrayUtils.clone(arg);
  }

  public void initO1TimeStamp() {
    o1TimeStamp =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getO1TimeStamp() {
  return CommonUtils.bytesToString(getO1TimeStampBytes());
  }

  public void setO1TimeStamp(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setO1TimeStampBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setO1TimeStampBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getI1FlControlBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(121);
        buffer.put(getI1EofSwBytes());
        buffer.put(getI1NseqKeyBytes());
        buffer.put(getI1OseqKeyBytes());
        buffer.put(getI1NsamKeyBytes());
        buffer.put(getI1OsamKeyBytes());
    return buffer.array();
  }

  public void setI1FlControlBytes(byte[] arg) {
        setI1EofSwBytes(ArrayUtils.subarray(arg, 0, 1));
        setI1NseqKeyBytes(ArrayUtils.subarray(arg, 1, 32));
        setI1OseqKeyBytes(ArrayUtils.subarray(arg, 32, 63));
        setI1NsamKeyBytes(ArrayUtils.subarray(arg, 63, 92));
        setI1OsamKeyBytes(ArrayUtils.subarray(arg, 92, 121));
  }

  public void initI1FlControl() {
        initI1EofSw();
        initI1NseqKey();
        initI1OseqKey();
        initI1NsamKey();
        initI1OsamKey();
  }

  public String getI1FlControl() {
  return CommonUtils.bytesToString(getI1FlControlBytes());
  }

  public void setI1FlControl(String arg) {
  final int trailing_length = 121 - arg.length();
  if (trailing_length > 0) {
  setI1FlControlBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1FlControlBytes(CommonUtils.stringToBytes(arg.substring(0, 121)));
  }
  }

  public byte[] getI1EofSwBytes() {
    return i1EofSw;
  }

  public void setI1EofSwBytes(byte[] arg) {
    i1EofSw = ArrayUtils.clone(arg);
  }

  public void initI1EofSw() {
    i1EofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1EofSw() {
  return CommonUtils.bytesToString(getI1EofSwBytes());
  }

  public void setI1EofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1EofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1EofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isI1Eof() {
boolean result =
        getI1EofSw().equals("Y");

return result;
}

  public byte[] getI1NseqKeyBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(31);
        buffer.put(getI1NseqKojoKubunBytes());
        buffer.put(getI1NseqShashuBytes());
        buffer.put(getI1NseqLine1ketaBytes());
        buffer.put(getI1NseqToshokuBytes());
        buffer.put(getI1NseqUchibariBytes());
        buffer.put(getI1NseqExNoBytes());
        buffer.put(getI1NseqKouteiShikibetsuBytes());
    return buffer.array();
  }

  public void setI1NseqKeyBytes(byte[] arg) {
        setI1NseqKojoKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setI1NseqShashuBytes(ArrayUtils.subarray(arg, 1, 19));
        setI1NseqLine1ketaBytes(ArrayUtils.subarray(arg, 19, 20));
        setI1NseqToshokuBytes(ArrayUtils.subarray(arg, 20, 23));
        setI1NseqUchibariBytes(ArrayUtils.subarray(arg, 23, 24));
        setI1NseqExNoBytes(ArrayUtils.subarray(arg, 24, 29));
        setI1NseqKouteiShikibetsuBytes(ArrayUtils.subarray(arg, 29, 31));
  }

  public void initI1NseqKey() {
        initI1NseqKojoKubun();
        initI1NseqShashu();
        initI1NseqLine1keta();
        initI1NseqToshoku();
        initI1NseqUchibari();
        initI1NseqExNo();
        initI1NseqKouteiShikibetsu();
  }

  public String getI1NseqKey() {
  return CommonUtils.bytesToString(getI1NseqKeyBytes());
  }

  public void setI1NseqKey(String arg) {
  final int trailing_length = 31 - arg.length();
  if (trailing_length > 0) {
  setI1NseqKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 31)));
  }
  }

  public byte[] getI1NseqKojoKubunBytes() {
    return i1NseqKojoKubun;
  }

  public void setI1NseqKojoKubunBytes(byte[] arg) {
    i1NseqKojoKubun = ArrayUtils.clone(arg);
  }

  public void initI1NseqKojoKubun() {
    i1NseqKojoKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1NseqKojoKubun() {
  return CommonUtils.bytesToString(getI1NseqKojoKubunBytes());
  }

  public void setI1NseqKojoKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1NseqKojoKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqKojoKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1NseqShashuBytes() {
    return i1NseqShashu;
  }

  public void setI1NseqShashuBytes(byte[] arg) {
    i1NseqShashu = ArrayUtils.clone(arg);
  }

  public void initI1NseqShashu() {
    i1NseqShashu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getI1NseqShashu() {
  return CommonUtils.bytesToString(getI1NseqShashuBytes());
  }

  public void setI1NseqShashu(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setI1NseqShashuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqShashuBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getI1NseqLine1ketaBytes() {
    return i1NseqLine1keta;
  }

  public void setI1NseqLine1ketaBytes(byte[] arg) {
    i1NseqLine1keta = ArrayUtils.clone(arg);
  }

  public void initI1NseqLine1keta() {
    i1NseqLine1keta =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1NseqLine1keta() {
  return CommonUtils.bytesToString(getI1NseqLine1ketaBytes());
  }

  public void setI1NseqLine1keta(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1NseqLine1ketaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqLine1ketaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1NseqToshokuBytes() {
    return i1NseqToshoku;
  }

  public void setI1NseqToshokuBytes(byte[] arg) {
    i1NseqToshoku = ArrayUtils.clone(arg);
  }

  public void initI1NseqToshoku() {
    i1NseqToshoku =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getI1NseqToshoku() {
  return CommonUtils.bytesToString(getI1NseqToshokuBytes());
  }

  public void setI1NseqToshoku(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setI1NseqToshokuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqToshokuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getI1NseqUchibariBytes() {
    return i1NseqUchibari;
  }

  public void setI1NseqUchibariBytes(byte[] arg) {
    i1NseqUchibari = ArrayUtils.clone(arg);
  }

  public void initI1NseqUchibari() {
    i1NseqUchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1NseqUchibari() {
  return CommonUtils.bytesToString(getI1NseqUchibariBytes());
  }

  public void setI1NseqUchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1NseqUchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqUchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1NseqExNoBytes() {
    return i1NseqExNo;
  }

  public void setI1NseqExNoBytes(byte[] arg) {
    i1NseqExNo = ArrayUtils.clone(arg);
  }

  public void initI1NseqExNo() {
    i1NseqExNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getI1NseqExNo() {
  return CommonUtils.bytesToString(getI1NseqExNoBytes());
  }

  public void setI1NseqExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setI1NseqExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getI1NseqKouteiShikibetsuBytes() {
    return i1NseqKouteiShikibetsu;
  }

  public void setI1NseqKouteiShikibetsuBytes(byte[] arg) {
    i1NseqKouteiShikibetsu = ArrayUtils.clone(arg);
  }

  public void initI1NseqKouteiShikibetsu() {
    i1NseqKouteiShikibetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getI1NseqKouteiShikibetsu() {
  return CommonUtils.bytesToString(getI1NseqKouteiShikibetsuBytes());
  }

  public void setI1NseqKouteiShikibetsu(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setI1NseqKouteiShikibetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NseqKouteiShikibetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getI1OseqKeyBytes() {
    return i1OseqKey;
  }

  public void setI1OseqKeyBytes(byte[] arg) {
    i1OseqKey = ArrayUtils.clone(arg);
  }

  public void initI1OseqKey() {
    i1OseqKey =CommonUtils.stringToBytes(StringUtils.repeat(" ", 31));
  }

  public String getI1OseqKey() {
  return CommonUtils.bytesToString(getI1OseqKeyBytes());
  }

  public void setI1OseqKey(String arg) {
  final int trailing_length = 31 - arg.length();
  if (trailing_length > 0) {
  setI1OseqKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1OseqKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 31)));
  }
  }

  public byte[] getI1NsamKeyBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(29);
        buffer.put(getI1NsamKoujouKubunBytes());
        buffer.put(getI1NsamShashuBytes());
        buffer.put(getI1NsamLine1ketaBytes());
        buffer.put(getI1NsamToshokuBytes());
        buffer.put(getI1NsamUchibariBytes());
        buffer.put(getI1NsamExNoBytes());
    return buffer.array();
  }

  public void setI1NsamKeyBytes(byte[] arg) {
        setI1NsamKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setI1NsamShashuBytes(ArrayUtils.subarray(arg, 1, 19));
        setI1NsamLine1ketaBytes(ArrayUtils.subarray(arg, 19, 20));
        setI1NsamToshokuBytes(ArrayUtils.subarray(arg, 20, 23));
        setI1NsamUchibariBytes(ArrayUtils.subarray(arg, 23, 24));
        setI1NsamExNoBytes(ArrayUtils.subarray(arg, 24, 29));
  }

  public void initI1NsamKey() {
        initI1NsamKoujouKubun();
        initI1NsamShashu();
        initI1NsamLine1keta();
        initI1NsamToshoku();
        initI1NsamUchibari();
        initI1NsamExNo();
  }

  public String getI1NsamKey() {
  return CommonUtils.bytesToString(getI1NsamKeyBytes());
  }

  public void setI1NsamKey(String arg) {
  final int trailing_length = 29 - arg.length();
  if (trailing_length > 0) {
  setI1NsamKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 29)));
  }
  }

  public byte[] getI1NsamKoujouKubunBytes() {
    return i1NsamKoujouKubun;
  }

  public void setI1NsamKoujouKubunBytes(byte[] arg) {
    i1NsamKoujouKubun = ArrayUtils.clone(arg);
  }

  public void initI1NsamKoujouKubun() {
    i1NsamKoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1NsamKoujouKubun() {
  return CommonUtils.bytesToString(getI1NsamKoujouKubunBytes());
  }

  public void setI1NsamKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1NsamKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1NsamShashuBytes() {
    return i1NsamShashu;
  }

  public void setI1NsamShashuBytes(byte[] arg) {
    i1NsamShashu = ArrayUtils.clone(arg);
  }

  public void initI1NsamShashu() {
    i1NsamShashu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getI1NsamShashu() {
  return CommonUtils.bytesToString(getI1NsamShashuBytes());
  }

  public void setI1NsamShashu(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setI1NsamShashuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamShashuBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getI1NsamLine1ketaBytes() {
    return i1NsamLine1keta;
  }

  public void setI1NsamLine1ketaBytes(byte[] arg) {
    i1NsamLine1keta = ArrayUtils.clone(arg);
  }

  public void initI1NsamLine1keta() {
    i1NsamLine1keta =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1NsamLine1keta() {
  return CommonUtils.bytesToString(getI1NsamLine1ketaBytes());
  }

  public void setI1NsamLine1keta(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1NsamLine1ketaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamLine1ketaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1NsamToshokuBytes() {
    return i1NsamToshoku;
  }

  public void setI1NsamToshokuBytes(byte[] arg) {
    i1NsamToshoku = ArrayUtils.clone(arg);
  }

  public void initI1NsamToshoku() {
    i1NsamToshoku =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getI1NsamToshoku() {
  return CommonUtils.bytesToString(getI1NsamToshokuBytes());
  }

  public void setI1NsamToshoku(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setI1NsamToshokuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamToshokuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getI1NsamUchibariBytes() {
    return i1NsamUchibari;
  }

  public void setI1NsamUchibariBytes(byte[] arg) {
    i1NsamUchibari = ArrayUtils.clone(arg);
  }

  public void initI1NsamUchibari() {
    i1NsamUchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getI1NsamUchibari() {
  return CommonUtils.bytesToString(getI1NsamUchibariBytes());
  }

  public void setI1NsamUchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setI1NsamUchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamUchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getI1NsamExNoBytes() {
    return i1NsamExNo;
  }

  public void setI1NsamExNoBytes(byte[] arg) {
    i1NsamExNo = ArrayUtils.clone(arg);
  }

  public void initI1NsamExNo() {
    i1NsamExNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getI1NsamExNo() {
  return CommonUtils.bytesToString(getI1NsamExNoBytes());
  }

  public void setI1NsamExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setI1NsamExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1NsamExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getI1OsamKeyBytes() {
    return i1OsamKey;
  }

  public void setI1OsamKeyBytes(byte[] arg) {
    i1OsamKey = ArrayUtils.clone(arg);
  }

  public void initI1OsamKey() {
    i1OsamKey =CommonUtils.stringToBytes(StringUtils.repeat(" ", 29));
  }

  public String getI1OsamKey() {
  return CommonUtils.bytesToString(getI1OsamKeyBytes());
  }

  public void setI1OsamKey(String arg) {
  final int trailing_length = 29 - arg.length();
  if (trailing_length > 0) {
  setI1OsamKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setI1OsamKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 29)));
  }
  }

  public byte[] getI1CtrBytes() {
    return i1Ctr;
  }

  public void setI1CtrBytes(byte[] arg) {
    i1Ctr = ArrayUtils.clone(arg);
  }

  public void initI1Ctr() {
    i1Ctr =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getI1Ctr() {
    return CommonUtils.packedDecimalToNumber(getI1CtrBytes());
  }

  public void setI1Ctr(long arg) {
  setI1CtrBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getSwOnOffCodoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer.put(getOnCodeBytes());
        buffer.put(getOffCodeBytes());
    return buffer.array();
  }

  public void setSwOnOffCodoBytes(byte[] arg) {
        setOnCodeBytes(ArrayUtils.subarray(arg, 0, 1));
        setOffCodeBytes(ArrayUtils.subarray(arg, 1, 2));
  }

  public void initSwOnOffCodo() {
        initOnCode();
        initOffCode();
  }

  public String getSwOnOffCodo() {
  return CommonUtils.bytesToString(getSwOnOffCodoBytes());
  }

  public void setSwOnOffCodo(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setSwOnOffCodoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSwOnOffCodoBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getOnCodeBytes() {
    return onCode;
  }

  public void setOnCodeBytes(byte[] arg) {
    onCode = ArrayUtils.clone(arg);
  }

  public void initOnCode() {
    onCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getOnCode() {
  return CommonUtils.bytesToString(getOnCodeBytes());
  }

  public void setOnCode(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setOnCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setOnCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getOffCodeBytes() {
    return offCode;
  }

  public void setOffCodeBytes(byte[] arg) {
    offCode = ArrayUtils.clone(arg);
  }

  public void initOffCode() {
    offCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getOffCode() {
  return CommonUtils.bytesToString(getOffCodeBytes());
  }

  public void setOffCode(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setOffCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setOffCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

@Override
protected final void setUsingParameters(List<Object> using_parameters) throws Exception {
}

@Override
protected final List<Object> getUsingParameters() throws Exception {
List<Object> using_parameters = new ArrayList<>();

return using_parameters;
}

@Override
protected void run() throws Exception {
  sys011 = getRepository("SYS011");
  sys031 = getRepository("SYS031");

_init();
  mainShori();
}

  protected abstract void _init() throws Exception;

  protected abstract void mainShori() throws Exception;

  protected abstract void kaisiShori() throws Exception;

  protected abstract void seihanShiyouBetsuFlInshori() throws Exception;

  protected abstract void catsShiyouBetsuFlSakusei() throws Exception;

  protected abstract void seihanShiyouShokiShori() throws Exception;

  protected abstract void seihanSamShoriLoop() throws Exception;

  protected abstract void seihanSamShori() throws Exception;

  protected abstract void offLineShori() throws Exception;

  protected abstract void finalShori() throws Exception;

  protected abstract void tsukiBetsuShori() throws Exception;

  protected abstract void shaukeShori() throws Exception;

  protected abstract void o1RecOutShori() throws Exception;

  protected abstract void shuryoShori() throws Exception;
}
