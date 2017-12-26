// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.data.sam.domain;

import java.util.Arrays;
import java.nio.ByteBuffer;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.hitachi.pcs.common.util.CommonUtils;

public class Adafl182 {

  private byte[] koujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] modelKihon = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] modelKatashiki = CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));

  private byte[] modelKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));

  private byte[] color = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] uchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] exNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] lineTrim = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] kokuyuKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] yy = CommonUtils.numberToUnsignedZoneDecimal(0, 2);

  private byte[] mm = CommonUtils.numberToUnsignedZoneDecimal(0, 2);

  private byte[] kouteiId = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] jissekiZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[][] jissekiTougetsu = new byte[63][2];
  {
    for (int a = 0; a < 63; a++) {
  jissekiTougetsu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] jissekiJigetsu = new byte[41][2];
  {
    for (int a = 0; a < 41; a++) {
  jissekiJigetsu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] ruisaZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] keikakuZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] ruisaZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[][] keikakuTougetsu = new byte[63][2];
  {
    for (int a = 0; a < 63; a++) {
  keikakuTougetsu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] keikakuJigetsu = new byte[41][2];
  {
    for (int a = 0; a < 41; a++) {
  keikakuJigetsu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] ikanZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] ikanTougetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] ikanJigetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] shikyuuZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] shikyuuTougetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] shikyuuJigetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] mikenZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] mikenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] kankenZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] kankenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  public byte[] getAreaBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(494);
        buffer.put(getKoujouKubunBytes());
        buffer.put(getModelBytes());
        buffer.put(getColorUchibariExBytes());
        buffer.put(getLineTrimBytes());
        buffer.put(getKokuyuKubunBytes());
        buffer.put(getYymmBytes());
        buffer.put(getKouteiIdBytes());
        buffer.put(getJissekiBytes());
        buffer.put(getKeikakuBytes());
        buffer.put(getIkanBytes());
        buffer.put(getShikyuuBytes());
        buffer.put(getMikenZaikoBytes());
        buffer.put(getKankenZaikoBytes());
    return buffer.array();
  }

  public void setAreaBytes(byte[] arg) {
        setKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setModelBytes(ArrayUtils.subarray(arg, 1, 19));
        setColorUchibariExBytes(ArrayUtils.subarray(arg, 19, 28));
        setLineTrimBytes(ArrayUtils.subarray(arg, 28, 29));
        setKokuyuKubunBytes(ArrayUtils.subarray(arg, 29, 30));
        setYymmBytes(ArrayUtils.subarray(arg, 30, 34));
        setKouteiIdBytes(ArrayUtils.subarray(arg, 34, 36));
        setJissekiBytes(ArrayUtils.subarray(arg, 36, 247));
        setKeikakuBytes(ArrayUtils.subarray(arg, 247, 464));
        setIkanBytes(ArrayUtils.subarray(arg, 464, 473));
        setShikyuuBytes(ArrayUtils.subarray(arg, 473, 482));
        setMikenZaikoBytes(ArrayUtils.subarray(arg, 482, 488));
        setKankenZaikoBytes(ArrayUtils.subarray(arg, 488, 494));
  }

  public void initArea() {
        initKoujouKubun();
        initModel();
        initColorUchibariEx();
        initLineTrim();
        initKokuyuKubun();
        initYymm();
        initKouteiId();
        initJisseki();
        initKeikaku();
        initIkan();
        initShikyuu();
        initMikenZaiko();
        initKankenZaiko();
  }

  public String getArea() {
  return CommonUtils.bytesToString(getAreaBytes());
  }

  public void setArea(String arg) {
  final int trailing_length = 494 - arg.length();
  if (trailing_length > 0) {
  setAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 494)));
  }
  }

  public byte[] getKoujouKubunBytes() {
    return koujouKubun;
  }

  public void setKoujouKubunBytes(byte[] arg) {
    koujouKubun = ArrayUtils.clone(arg);
  }

  public void initKoujouKubun() {
    koujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getKoujouKubun() {
  return CommonUtils.bytesToString(getKoujouKubunBytes());
  }

  public void setKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getModelBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(18);
        buffer.put(getModelKihonBytes());
        buffer.put(getModelKatashikiBytes());
        buffer.put(getModelKubunBytes());
    return buffer.array();
  }

  public void setModelBytes(byte[] arg) {
        setModelKihonBytes(ArrayUtils.subarray(arg, 0, 3));
        setModelKatashikiBytes(ArrayUtils.subarray(arg, 3, 10));
        setModelKubunBytes(ArrayUtils.subarray(arg, 10, 18));
  }

  public void initModel() {
        initModelKihon();
        initModelKatashiki();
        initModelKubun();
  }

  public String getModel() {
  return CommonUtils.bytesToString(getModelBytes());
  }

  public void setModel(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setModelBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setModelBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getModelKihonBytes() {
    return modelKihon;
  }

  public void setModelKihonBytes(byte[] arg) {
    modelKihon = ArrayUtils.clone(arg);
  }

  public void initModelKihon() {
    modelKihon =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getModelKihon() {
  return CommonUtils.bytesToString(getModelKihonBytes());
  }

  public void setModelKihon(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setModelKihonBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setModelKihonBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getModelKatashikiBytes() {
    return modelKatashiki;
  }

  public void setModelKatashikiBytes(byte[] arg) {
    modelKatashiki = ArrayUtils.clone(arg);
  }

  public void initModelKatashiki() {
    modelKatashiki =CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));
  }

  public String getModelKatashiki() {
  return CommonUtils.bytesToString(getModelKatashikiBytes());
  }

  public void setModelKatashiki(String arg) {
  final int trailing_length = 7 - arg.length();
  if (trailing_length > 0) {
  setModelKatashikiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setModelKatashikiBytes(CommonUtils.stringToBytes(arg.substring(0, 7)));
  }
  }

  public byte[] getModelKubunBytes() {
    return modelKubun;
  }

  public void setModelKubunBytes(byte[] arg) {
    modelKubun = ArrayUtils.clone(arg);
  }

  public void initModelKubun() {
    modelKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getModelKubun() {
  return CommonUtils.bytesToString(getModelKubunBytes());
  }

  public void setModelKubun(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setModelKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setModelKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getColorUchibariExBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getColorBytes());
        buffer.put(getUchibariBytes());
        buffer.put(getExNoBytes());
    return buffer.array();
  }

  public void setColorUchibariExBytes(byte[] arg) {
        setColorBytes(ArrayUtils.subarray(arg, 0, 3));
        setUchibariBytes(ArrayUtils.subarray(arg, 3, 4));
        setExNoBytes(ArrayUtils.subarray(arg, 4, 9));
  }

  public void initColorUchibariEx() {
        initColor();
        initUchibari();
        initExNo();
  }

  public String getColorUchibariEx() {
  return CommonUtils.bytesToString(getColorUchibariExBytes());
  }

  public void setColorUchibariEx(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setColorUchibariExBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setColorUchibariExBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getColorBytes() {
    return color;
  }

  public void setColorBytes(byte[] arg) {
    color = ArrayUtils.clone(arg);
  }

  public void initColor() {
    color =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getColor() {
  return CommonUtils.bytesToString(getColorBytes());
  }

  public void setColor(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setColorBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setColorBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getUchibariBytes() {
    return uchibari;
  }

  public void setUchibariBytes(byte[] arg) {
    uchibari = ArrayUtils.clone(arg);
  }

  public void initUchibari() {
    uchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getUchibari() {
  return CommonUtils.bytesToString(getUchibariBytes());
  }

  public void setUchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setUchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setUchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getExNoBytes() {
    return exNo;
  }

  public void setExNoBytes(byte[] arg) {
    exNo = ArrayUtils.clone(arg);
  }

  public void initExNo() {
    exNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getExNo() {
  return CommonUtils.bytesToString(getExNoBytes());
  }

  public void setExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getLineTrimBytes() {
    return lineTrim;
  }

  public void setLineTrimBytes(byte[] arg) {
    lineTrim = ArrayUtils.clone(arg);
  }

  public void initLineTrim() {
    lineTrim =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getLineTrim() {
  return CommonUtils.bytesToString(getLineTrimBytes());
  }

  public void setLineTrim(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setLineTrimBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setLineTrimBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getKokuyuKubunBytes() {
    return kokuyuKubun;
  }

  public void setKokuyuKubunBytes(byte[] arg) {
    kokuyuKubun = ArrayUtils.clone(arg);
  }

  public void initKokuyuKubun() {
    kokuyuKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getKokuyuKubun() {
  return CommonUtils.bytesToString(getKokuyuKubunBytes());
  }

  public void setKokuyuKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setKokuyuKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKokuyuKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getYymmBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getYyBytes());
        buffer.put(getMmBytes());
    return buffer.array();
  }

  public void setYymmBytes(byte[] arg) {
        setYyBytes(ArrayUtils.subarray(arg, 0, 2));
        setMmBytes(ArrayUtils.subarray(arg, 2, 4));
  }

  public void initYymm() {
        initYy();
        initMm();
  }

  public String getYymm() {
  return CommonUtils.bytesToString(getYymmBytes());
  }

  public void setYymm(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setYymmBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setYymmBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getYyBytes() {
    return yy;
  }

  public void setYyBytes(byte[] arg) {
    yy = ArrayUtils.clone(arg);
  }

  public void initYy() {
    yy =CommonUtils.numberToUnsignedZoneDecimal(0, 2);
  }

  public long getYy() {
    return CommonUtils.unsignedZoneDecimalToNumber(getYyBytes());
  }

  public void setYy(long arg) {
  setYyBytes(CommonUtils.numberToUnsignedZoneDecimal(arg, 2));
  }

  public byte[] getMmBytes() {
    return mm;
  }

  public void setMmBytes(byte[] arg) {
    mm = ArrayUtils.clone(arg);
  }

  public void initMm() {
    mm =CommonUtils.numberToUnsignedZoneDecimal(0, 2);
  }

  public long getMm() {
    return CommonUtils.unsignedZoneDecimalToNumber(getMmBytes());
  }

  public void setMm(long arg) {
  setMmBytes(CommonUtils.numberToUnsignedZoneDecimal(arg, 2));
  }

  public byte[] getKouteiIdBytes() {
    return kouteiId;
  }

  public void setKouteiIdBytes(byte[] arg) {
    kouteiId = ArrayUtils.clone(arg);
  }

  public void initKouteiId() {
    kouteiId =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getKouteiId() {
  return CommonUtils.bytesToString(getKouteiIdBytes());
  }

  public void setKouteiId(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setKouteiIdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKouteiIdBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(211);
        buffer.put(getJissekiZengetsuBytes());
        buffer.put(getJissekiTougetsuTblBytes());
        buffer.put(getJissekiJigetsuTblBytes());
    return buffer.array();
  }

  public void setJissekiBytes(byte[] arg) {
        setJissekiZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setJissekiTougetsuTblBytes(ArrayUtils.subarray(arg, 3, 129));
        setJissekiJigetsuTblBytes(ArrayUtils.subarray(arg, 129, 211));
  }

  public void initJisseki() {
        initJissekiZengetsu();
        initJissekiTougetsuTbl();
        initJissekiJigetsuTbl();
  }

  public String getJisseki() {
  return CommonUtils.bytesToString(getJissekiBytes());
  }

  public void setJisseki(String arg) {
  final int trailing_length = 211 - arg.length();
  if (trailing_length > 0) {
  setJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 211)));
  }
  }

  public byte[] getJissekiZengetsuBytes() {
    return jissekiZengetsu;
  }

  public void setJissekiZengetsuBytes(byte[] arg) {
    jissekiZengetsu = ArrayUtils.clone(arg);
  }

  public void initJissekiZengetsu() {
    jissekiZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getJissekiZengetsu() {
    return CommonUtils.packedDecimalToNumber(getJissekiZengetsuBytes());
  }

  public void setJissekiZengetsu(long arg) {
  setJissekiZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getJissekiTougetsuTblBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(126);
        for (int x = 0; x < 63; x++) {
        buffer.put(getJissekiTougetsuBytes(x));
        }
    return buffer.array();
  }

  public void setJissekiTougetsuTblBytes(byte[] arg) {
        for (int x = 0; x < 63; x++) {
        setJissekiTougetsuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initJissekiTougetsuTbl() {
        for (int x = 0; x < 63; x++) {
        initJissekiTougetsu(x);
        }
  }

  public String getJissekiTougetsuTbl() {
  return CommonUtils.bytesToString(getJissekiTougetsuTblBytes());
  }

  public void setJissekiTougetsuTbl(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setJissekiTougetsuTblBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setJissekiTougetsuTblBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getJissekiTougetsuBytes(int a) {
    return jissekiTougetsu[a];
  }

  public void setJissekiTougetsuBytes(int a,byte[] arg) {
    jissekiTougetsu[a] = ArrayUtils.clone(arg);
  }

  public void initJissekiTougetsu(int a) {
    jissekiTougetsu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getJissekiTougetsu(int a) {
    return CommonUtils.packedDecimalToNumber(getJissekiTougetsuBytes(a));
  }

  public void setJissekiTougetsu(int a,long arg) {
  setJissekiTougetsuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getJissekiJigetsuTblBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(82);
        for (int x = 0; x < 41; x++) {
        buffer.put(getJissekiJigetsuBytes(x));
        }
    return buffer.array();
  }

  public void setJissekiJigetsuTblBytes(byte[] arg) {
        for (int x = 0; x < 41; x++) {
        setJissekiJigetsuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initJissekiJigetsuTbl() {
        for (int x = 0; x < 41; x++) {
        initJissekiJigetsu(x);
        }
  }

  public String getJissekiJigetsuTbl() {
  return CommonUtils.bytesToString(getJissekiJigetsuTblBytes());
  }

  public void setJissekiJigetsuTbl(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setJissekiJigetsuTblBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setJissekiJigetsuTblBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getJissekiJigetsuBytes(int a) {
    return jissekiJigetsu[a];
  }

  public void setJissekiJigetsuBytes(int a,byte[] arg) {
    jissekiJigetsu[a] = ArrayUtils.clone(arg);
  }

  public void initJissekiJigetsu(int a) {
    jissekiJigetsu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getJissekiJigetsu(int a) {
    return CommonUtils.packedDecimalToNumber(getJissekiJigetsuBytes(a));
  }

  public void setJissekiJigetsu(int a,long arg) {
  setJissekiJigetsuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(217);
        buffer.put(getRuisaZenZengetsuBytes());
        buffer.put(getKeikakuZengetsuBytes());
        buffer.put(getRuisaZengetsuBytes());
        buffer.put(getKeikakuTougetsuTblBytes());
        buffer.put(getKeikakuJigetsuTblBytes());
    return buffer.array();
  }

  public void setKeikakuBytes(byte[] arg) {
        setRuisaZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setKeikakuZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setRuisaZengetsuBytes(ArrayUtils.subarray(arg, 6, 9));
        setKeikakuTougetsuTblBytes(ArrayUtils.subarray(arg, 9, 135));
        setKeikakuJigetsuTblBytes(ArrayUtils.subarray(arg, 135, 217));
  }

  public void initKeikaku() {
        initRuisaZenZengetsu();
        initKeikakuZengetsu();
        initRuisaZengetsu();
        initKeikakuTougetsuTbl();
        initKeikakuJigetsuTbl();
  }

  public String getKeikaku() {
  return CommonUtils.bytesToString(getKeikakuBytes());
  }

  public void setKeikaku(String arg) {
  final int trailing_length = 217 - arg.length();
  if (trailing_length > 0) {
  setKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 217)));
  }
  }

  public byte[] getRuisaZenZengetsuBytes() {
    return ruisaZenZengetsu;
  }

  public void setRuisaZenZengetsuBytes(byte[] arg) {
    ruisaZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initRuisaZenZengetsu() {
    ruisaZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getRuisaZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getRuisaZenZengetsuBytes());
  }

  public void setRuisaZenZengetsu(long arg) {
  setRuisaZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getKeikakuZengetsuBytes() {
    return keikakuZengetsu;
  }

  public void setKeikakuZengetsuBytes(byte[] arg) {
    keikakuZengetsu = ArrayUtils.clone(arg);
  }

  public void initKeikakuZengetsu() {
    keikakuZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getKeikakuZengetsu() {
    return CommonUtils.packedDecimalToNumber(getKeikakuZengetsuBytes());
  }

  public void setKeikakuZengetsu(long arg) {
  setKeikakuZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getRuisaZengetsuBytes() {
    return ruisaZengetsu;
  }

  public void setRuisaZengetsuBytes(byte[] arg) {
    ruisaZengetsu = ArrayUtils.clone(arg);
  }

  public void initRuisaZengetsu() {
    ruisaZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getRuisaZengetsu() {
    return CommonUtils.packedDecimalToNumber(getRuisaZengetsuBytes());
  }

  public void setRuisaZengetsu(long arg) {
  setRuisaZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getKeikakuTougetsuTblBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(126);
        for (int x = 0; x < 63; x++) {
        buffer.put(getKeikakuTougetsuBytes(x));
        }
    return buffer.array();
  }

  public void setKeikakuTougetsuTblBytes(byte[] arg) {
        for (int x = 0; x < 63; x++) {
        setKeikakuTougetsuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initKeikakuTougetsuTbl() {
        for (int x = 0; x < 63; x++) {
        initKeikakuTougetsu(x);
        }
  }

  public String getKeikakuTougetsuTbl() {
  return CommonUtils.bytesToString(getKeikakuTougetsuTblBytes());
  }

  public void setKeikakuTougetsuTbl(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setKeikakuTougetsuTblBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKeikakuTougetsuTblBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getKeikakuTougetsuBytes(int a) {
    return keikakuTougetsu[a];
  }

  public void setKeikakuTougetsuBytes(int a,byte[] arg) {
    keikakuTougetsu[a] = ArrayUtils.clone(arg);
  }

  public void initKeikakuTougetsu(int a) {
    keikakuTougetsu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getKeikakuTougetsu(int a) {
    return CommonUtils.packedDecimalToNumber(getKeikakuTougetsuBytes(a));
  }

  public void setKeikakuTougetsu(int a,long arg) {
  setKeikakuTougetsuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getKeikakuJigetsuTblBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(82);
        for (int x = 0; x < 41; x++) {
        buffer.put(getKeikakuJigetsuBytes(x));
        }
    return buffer.array();
  }

  public void setKeikakuJigetsuTblBytes(byte[] arg) {
        for (int x = 0; x < 41; x++) {
        setKeikakuJigetsuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initKeikakuJigetsuTbl() {
        for (int x = 0; x < 41; x++) {
        initKeikakuJigetsu(x);
        }
  }

  public String getKeikakuJigetsuTbl() {
  return CommonUtils.bytesToString(getKeikakuJigetsuTblBytes());
  }

  public void setKeikakuJigetsuTbl(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setKeikakuJigetsuTblBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKeikakuJigetsuTblBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getKeikakuJigetsuBytes(int a) {
    return keikakuJigetsu[a];
  }

  public void setKeikakuJigetsuBytes(int a,byte[] arg) {
    keikakuJigetsu[a] = ArrayUtils.clone(arg);
  }

  public void initKeikakuJigetsu(int a) {
    keikakuJigetsu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getKeikakuJigetsu(int a) {
    return CommonUtils.packedDecimalToNumber(getKeikakuJigetsuBytes(a));
  }

  public void setKeikakuJigetsu(int a,long arg) {
  setKeikakuJigetsuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getIkanBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getIkanZengetsuBytes());
        buffer.put(getIkanTougetsuBytes());
        buffer.put(getIkanJigetsuBytes());
    return buffer.array();
  }

  public void setIkanBytes(byte[] arg) {
        setIkanZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setIkanTougetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setIkanJigetsuBytes(ArrayUtils.subarray(arg, 6, 9));
  }

  public void initIkan() {
        initIkanZengetsu();
        initIkanTougetsu();
        initIkanJigetsu();
  }

  public String getIkan() {
  return CommonUtils.bytesToString(getIkanBytes());
  }

  public void setIkan(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setIkanBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setIkanBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getIkanZengetsuBytes() {
    return ikanZengetsu;
  }

  public void setIkanZengetsuBytes(byte[] arg) {
    ikanZengetsu = ArrayUtils.clone(arg);
  }

  public void initIkanZengetsu() {
    ikanZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getIkanZengetsu() {
    return CommonUtils.packedDecimalToNumber(getIkanZengetsuBytes());
  }

  public void setIkanZengetsu(long arg) {
  setIkanZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getIkanTougetsuBytes() {
    return ikanTougetsu;
  }

  public void setIkanTougetsuBytes(byte[] arg) {
    ikanTougetsu = ArrayUtils.clone(arg);
  }

  public void initIkanTougetsu() {
    ikanTougetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getIkanTougetsu() {
    return CommonUtils.packedDecimalToNumber(getIkanTougetsuBytes());
  }

  public void setIkanTougetsu(long arg) {
  setIkanTougetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getIkanJigetsuBytes() {
    return ikanJigetsu;
  }

  public void setIkanJigetsuBytes(byte[] arg) {
    ikanJigetsu = ArrayUtils.clone(arg);
  }

  public void initIkanJigetsu() {
    ikanJigetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getIkanJigetsu() {
    return CommonUtils.packedDecimalToNumber(getIkanJigetsuBytes());
  }

  public void setIkanJigetsu(long arg) {
  setIkanJigetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getShikyuuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getShikyuuZengetsuBytes());
        buffer.put(getShikyuuTougetsuBytes());
        buffer.put(getShikyuuJigetsuBytes());
    return buffer.array();
  }

  public void setShikyuuBytes(byte[] arg) {
        setShikyuuZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setShikyuuTougetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setShikyuuJigetsuBytes(ArrayUtils.subarray(arg, 6, 9));
  }

  public void initShikyuu() {
        initShikyuuZengetsu();
        initShikyuuTougetsu();
        initShikyuuJigetsu();
  }

  public String getShikyuu() {
  return CommonUtils.bytesToString(getShikyuuBytes());
  }

  public void setShikyuu(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setShikyuuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setShikyuuBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getShikyuuZengetsuBytes() {
    return shikyuuZengetsu;
  }

  public void setShikyuuZengetsuBytes(byte[] arg) {
    shikyuuZengetsu = ArrayUtils.clone(arg);
  }

  public void initShikyuuZengetsu() {
    shikyuuZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getShikyuuZengetsu() {
    return CommonUtils.packedDecimalToNumber(getShikyuuZengetsuBytes());
  }

  public void setShikyuuZengetsu(long arg) {
  setShikyuuZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getShikyuuTougetsuBytes() {
    return shikyuuTougetsu;
  }

  public void setShikyuuTougetsuBytes(byte[] arg) {
    shikyuuTougetsu = ArrayUtils.clone(arg);
  }

  public void initShikyuuTougetsu() {
    shikyuuTougetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getShikyuuTougetsu() {
    return CommonUtils.packedDecimalToNumber(getShikyuuTougetsuBytes());
  }

  public void setShikyuuTougetsu(long arg) {
  setShikyuuTougetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getShikyuuJigetsuBytes() {
    return shikyuuJigetsu;
  }

  public void setShikyuuJigetsuBytes(byte[] arg) {
    shikyuuJigetsu = ArrayUtils.clone(arg);
  }

  public void initShikyuuJigetsu() {
    shikyuuJigetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getShikyuuJigetsu() {
    return CommonUtils.packedDecimalToNumber(getShikyuuJigetsuBytes());
  }

  public void setShikyuuJigetsu(long arg) {
  setShikyuuJigetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getMikenZaikoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getMikenZenZengetsuBytes());
        buffer.put(getMikenZengetsuBytes());
    return buffer.array();
  }

  public void setMikenZaikoBytes(byte[] arg) {
        setMikenZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setMikenZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initMikenZaiko() {
        initMikenZenZengetsu();
        initMikenZengetsu();
  }

  public String getMikenZaiko() {
  return CommonUtils.bytesToString(getMikenZaikoBytes());
  }

  public void setMikenZaiko(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setMikenZaikoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setMikenZaikoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getMikenZenZengetsuBytes() {
    return mikenZenZengetsu;
  }

  public void setMikenZenZengetsuBytes(byte[] arg) {
    mikenZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initMikenZenZengetsu() {
    mikenZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getMikenZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getMikenZenZengetsuBytes());
  }

  public void setMikenZenZengetsu(long arg) {
  setMikenZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getMikenZengetsuBytes() {
    return mikenZengetsu;
  }

  public void setMikenZengetsuBytes(byte[] arg) {
    mikenZengetsu = ArrayUtils.clone(arg);
  }

  public void initMikenZengetsu() {
    mikenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getMikenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getMikenZengetsuBytes());
  }

  public void setMikenZengetsu(long arg) {
  setMikenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getKankenZaikoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getKankenZenZengetsuBytes());
        buffer.put(getKankenZengetsuBytes());
    return buffer.array();
  }

  public void setKankenZaikoBytes(byte[] arg) {
        setKankenZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setKankenZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initKankenZaiko() {
        initKankenZenZengetsu();
        initKankenZengetsu();
  }

  public String getKankenZaiko() {
  return CommonUtils.bytesToString(getKankenZaikoBytes());
  }

  public void setKankenZaiko(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setKankenZaikoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKankenZaikoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getKankenZenZengetsuBytes() {
    return kankenZenZengetsu;
  }

  public void setKankenZenZengetsuBytes(byte[] arg) {
    kankenZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initKankenZenZengetsu() {
    kankenZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getKankenZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getKankenZenZengetsuBytes());
  }

  public void setKankenZenZengetsu(long arg) {
  setKankenZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getKankenZengetsuBytes() {
    return kankenZengetsu;
  }

  public void setKankenZengetsuBytes(byte[] arg) {
    kankenZengetsu = ArrayUtils.clone(arg);
  }

  public void initKankenZengetsu() {
    kankenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getKankenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getKankenZengetsuBytes());
  }

  public void setKankenZengetsu(long arg) {
  setKankenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }
}
