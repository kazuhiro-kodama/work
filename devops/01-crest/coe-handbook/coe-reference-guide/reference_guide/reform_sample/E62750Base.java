// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task;

import java.util.ArrayList;
/* BEGIN: MANUAL INJECTION */
import java.util.Iterator;
/* END  : MANUAL INJECTION */
import java.util.List;
import java.nio.ByteBuffer;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.hitachi.pcs.common.RepositoryAnnotation;
import com.hitachi.pcs.common.util.CommonUtils;
/* BEGIN: MANUAL INJECTION */
import com.hitachi.pcs.data.db.domain.Status181;
import com.hitachi.pcs.data.db.domain.Shiyou182;
import com.hitachi.pcs.data.db.domain.Shakei183;
import com.hitachi.pcs.data.db.domain.Jikei184;
import com.hitachi.pcs.data.db.domain.Koutei185;
import com.hitachi.pcs.data.db.domain.Sequence180;
import com.hitachi.pcs.data.db.repository.Status181Repository;
import com.hitachi.pcs.data.db.repository.Shiyou182Repository;
import com.hitachi.pcs.data.db.repository.Shakei183Repository;
import com.hitachi.pcs.data.db.repository.Jikei184Repository;
import com.hitachi.pcs.data.db.repository.Koutei185Repository;
import com.hitachi.pcs.data.db.repository.Sequence180Repository;
/* END  : MANUAL INJECTION */
import com.hitachi.pcs.data.sam.repository.RepositoryBase;
  import com.hitachi.pcs.func.task.Ic7sub01;
  import com.hitachi.pcs.func.task.MapRetCode;
  import com.hitachi.pcs.func.task.Pack182;
  import com.hitachi.pcs.func.task.Pack183;
  import com.hitachi.pcs.func.task.Pack184;
  import com.hitachi.pcs.data.sam.domain.Dcpenv;
  import com.hitachi.pcs.data.sam.domain.Ic7adafl;
  import com.hitachi.pcs.data.sam.domain.E62001fl;
  import com.hitachi.pcs.data.sam.domain.E62002fl;
  import com.hitachi.pcs.data.sam.domain.E62003fl;
  import com.hitachi.pcs.data.sam.domain.E62004fl;
  import com.hitachi.pcs.data.sam.domain.E62005dl;
  import com.hitachi.pcs.data.sam.domain.E62010dl;
  import com.hitachi.pcs.data.sam.domain.Adafl181;
  import com.hitachi.pcs.data.sam.domain.Adafl182;
  import com.hitachi.pcs.data.sam.domain.Adafl183;
  import com.hitachi.pcs.data.sam.domain.Adafl184;
  import com.hitachi.pcs.data.sam.domain.Adadl185;
  import com.hitachi.pcs.data.sam.domain.Adadl180;
  import com.hitachi.pcs.data.sam.domain.Ic7sub01Cpy;

public abstract class E62750Base extends TaskBase {
  /* BEGIN: MANUAL INJECTION */
  @Autowired
  protected Status181Repository status181Repository;

  @Autowired
  protected Shiyou182Repository shiyou182Repository;

  @Autowired
  protected Shakei183Repository shakei183Repository;

  @Autowired
  protected Jikei184Repository jikei184Repository;

  @Autowired
  protected Koutei185Repository koutei185Repository;

  @Autowired
  protected Sequence180Repository sequence180Repository;

  protected Iterator<Status181> cr01;

  protected Iterator<Shiyou182> cr02;

  protected Iterator<Shakei183> cr03;

  protected Iterator<Jikei184> cr04;

  protected Iterator<Koutei185> cr05;

  protected Iterator<Sequence180> cr06;
  /* END  : MANUAL INJECTION */

  @Autowired
  Ic7sub01 ic7sub01;

  @Autowired
  MapRetCode mapRetCode;

  @Autowired
  Pack182 pack182;

  @Autowired
  Pack183 pack183;

  @Autowired
  Pack184 pack184;

  @RepositoryAnnotation(name="DD_SYS031")
  private RepositoryBase sys031;

  @RepositoryAnnotation(name="DD_SYS032")
  private RepositoryBase sys032;

  @RepositoryAnnotation(name="DD_SYS033")
  private RepositoryBase sys033;

  @RepositoryAnnotation(name="DD_SYS034")
  private RepositoryBase sys034;

  @RepositoryAnnotation(name="DD_SYS035")
  private RepositoryBase sys035;

  @RepositoryAnnotation(name="DD_SYS036")
  private RepositoryBase sys036;

  @RepositoryAnnotation(name="DD_SYSIN")
  private RepositoryBase sysin;

  protected final RepositoryBase getO1aStatusFl() {
  return sys031;
  }

  protected final RepositoryBase getO2aShiyouBetsuFl() {
  return sys032;
  }

  protected final RepositoryBase getO3aShakeiBetsuFl() {
  return sys033;
  }

  protected final RepositoryBase getO4aJikeiRetsuFl() {
  return sys034;
  }

  protected final RepositoryBase getO5aKouteiKeikakuFl() {
  return sys035;
  }

  protected final RepositoryBase getO6aSequenceFl() {
  return sys036;
  }

  protected final RepositoryBase getMlsSysin() {
  return sysin;
  }

  protected Dcpenv dcpenv = new Dcpenv();

  protected Ic7adafl ic7adafl = new Ic7adafl();

  protected E62001fl o1 = new E62001fl();

  protected E62002fl o2 = new E62002fl();

  protected E62003fl o3 = new E62003fl();

  protected E62004fl o4 = new E62004fl();

  protected E62005dl o5 = new E62005dl();

  protected E62010dl o6 = new E62010dl();

  protected Adafl181 s1811 = new Adafl181();

  protected Adafl182 s1821 = new Adafl182();

  protected Adafl183 s1831 = new Adafl183();

  protected Adafl184 s1841 = new Adafl184();

  protected Adadl185 s1851 = new Adadl185();

  protected Adadl180 s1801 = new Adadl180();

  protected Ic7sub01Cpy ic7sub01Cpy = new Ic7sub01Cpy();

  private byte[] sys031Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1030));

  private byte[] sys032Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 497));

  private byte[] sys033Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 717));

  private byte[] sys034Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));

  private byte[] sys035Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 154));

  private byte[] sys036Rec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 80));

  private byte[] mlsSysinRec = CommonUtils.stringToBytes(StringUtils.repeat(" ", 80));

  private byte[] responseCodeopn = CommonUtils.numberToBinary(0, 2);

  private byte[] responseCodecr01 = CommonUtils.numberToBinary(0, 2);

  private byte[] s181aKoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aKoujouControlNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] s181aModel = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] s181aColor = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] s181aUchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aExNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] s181aShimukechi = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] s181aLineMain = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aLineMetal = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aLinePaint = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aLineTrim = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aKokuyuKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aKijunShakei = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] s181aDakokuKatashiki = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] s181aChassisNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));

  private byte[] s181aEngKatashiki = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] s181aEngNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));

  private byte[] s181aOrgModel = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] s181aOrgColor = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] s181aOrgUchibari = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aOrgExNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] s181aOrgLineKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s181aShakeiCode = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s181aShameiCode = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s181aOrderKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aDealerNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s181aOrderNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s181aComfirmedOrderNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] s181aCustomerName = CommonUtils.stringToBytes(StringUtils.repeat(" ", 41));

  private byte[] s181aTenjiPryCode = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aStatusPoint = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[][] s181aJissekiJikoku = new byte[17][6];
  {
    for (int a = 0; a < 17; a++) {
  s181aJissekiJikoku[a]= CommonUtils.numberToPackedDecimal(0, 6);
    }
  }

  private byte[][] s181aOriginalKeikaku = new byte[17][6];
  {
    for (int a = 0; a < 17; a++) {
  s181aOriginalKeikaku[a]= CommonUtils.numberToPackedDecimal(0, 6);
    }
  }

  private byte[][] s181aRevised2Keikaku = new byte[17][6];
  {
    for (int a = 0; a < 17; a++) {
  s181aRevised2Keikaku[a]= CommonUtils.numberToPackedDecimal(0, 6);
    }
  }

  private byte[][] s181aRevised1Keikaku = new byte[17][6];
  {
    for (int a = 0; a < 17; a++) {
  s181aRevised1Keikaku[a]= CommonUtils.numberToPackedDecimal(0, 6);
    }
  }

  private byte[][] s181aIkkatsuSym2 = new byte[17][1];
  {
    for (int a = 0; a < 17; a++) {
  s181aIkkatsuSym2[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
    }
  }

  private byte[][] s181aIkkatsuSym1 = new byte[17][1];
  {
    for (int a = 0; a < 17; a++) {
  s181aIkkatsuSym1[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
    }
  }

  private byte[][] s181aYoteiInputJikoku = new byte[17][5];
  {
    for (int a = 0; a < 17; a++) {
  s181aYoteiInputJikoku[a]= CommonUtils.numberToPackedDecimal(0, 5);
    }
  }

  private byte[][] s181aHanedashiRiyuu1 = new byte[17][2];
  {
    for (int a = 0; a < 17; a++) {
  s181aHanedashiRiyuu1[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
    }
  }

  private byte[][] s181aHanedashiRiyuu2 = new byte[17][2];
  {
    for (int a = 0; a < 17; a++) {
  s181aHanedashiRiyuu2[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
    }
  }

  private byte[] s181aDeliveryLeadKotei = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s181aDeliveryLeadYoyuu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s181aIkansaki = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s181aKensaIkanShikibetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aKasoushaSym = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aKasouMaker = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s181aKasouKanryouLead = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s181aTokkiJikou = CommonUtils.stringToBytes(StringUtils.repeat(" ", 20));

  private byte[] s181aActSchKey = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aActSeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));

  private byte[] s181aShataiReActSeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] s181aFinalReActSeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] s181aTrimSeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s181aOfflineSeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s181aKankenYmd = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s181aMsOfflineYmd = CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));

  private byte[] s181aSymTokushusha = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymKouteiKeikakuGai = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymZaikoZumi = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymGyakubarashiGai = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymSenkouMiGai = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymSmDaihyou = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[][] s181aSymSmKoutei = new byte[17][1];
  {
    for (int a = 0; a < 17; a++) {
  s181aSymSmKoutei[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
    }
  }

  private byte[][] s181aSymZengetsuJisseki = new byte[17][1];
  {
    for (int a = 0; a < 17; a++) {
  s181aSymZengetsuJisseki[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
    }
  }

  private byte[] s181aSymTlMetal = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymTlShitaP = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymTlNakaP = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymTlPaint = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymTlFinal = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymTlDeliv = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymPipeLineGai = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymPipeLineZumi = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymKeikakuMitei = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSeisanHoushiki = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymShisakuSha = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSymGyakuYunyuu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aHyoujiGenzaichi = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSalesSpec10 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));

  private byte[] s181aLocalArea = CommonUtils.stringToBytes(StringUtils.repeat(" ", 50));

  private byte[] s181aTimeStamp = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] s181aDelivEigyouHizuke = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] s181aSymHanedashi = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s181aSeihinKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] responseCodecr02 = CommonUtils.numberToBinary(0, 2);

  private byte[] s182aKoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s182aModel = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] s182aColorUchibariEx = CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));

  private byte[] s182aLineTrim = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s182aKokuyuKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s182aYymm = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s182aKouteiId = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] s182aJissekiZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aJissekiTougetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));

  private byte[] s182aJissekiJigetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));

  private byte[] s182aRuisaZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aKeikakuZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aRuisaZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aKeikakuTougetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));

  private byte[] s182aKeikakuJigetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));

  private byte[] s182aIkanZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aIkanTougetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aIkanJigetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aShikyuuZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aShikyuuTougetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aShikyuuJigetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aMikenZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aMikenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aKankenZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s182aKankenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] responseCodecr03 = CommonUtils.numberToBinary(0, 2);

  private byte[] s183aKoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s183aShakeiCode = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s183aLineKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s183aYymm = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s183aKouteiId = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] s183aJissekiZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aJissekiTougetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));

  private byte[] s183aJissekiJigetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));

  private byte[] s183aRuisaZenZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aKeikakuZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aRuisaZengetsu = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aKeikakuTougetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));

  private byte[] s183aKeikakuJigetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));

  private byte[] s183aZenZenShift = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aZenShift = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aTouShift = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] s183aJiShift = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[][] s183aJissekiOhMetal1 = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhMetal1[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhMetal2 = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhMetal2[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhWbs = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhWbs[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhShitaP = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhShitaP[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhNakaP = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhNakaP[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhUwaP = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhUwaP[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhPbs = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhPbs[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJissekiOhPreTrim = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJissekiOhPreTrim[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJikkekiOhTrim = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJikkekiOhTrim[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJikkekiOhFinal = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJikkekiOhFinal[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJikkekiOhKasou = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJikkekiOhKasou[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJikkekiOhDeliv = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJikkekiOhDeliv[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aJikkekiOhUkeire = new byte[4][3];
  {
    for (int a = 0; a < 4; a++) {
  s183aJikkekiOhUkeire[a]= CommonUtils.numberToPackedDecimal(0, 3);
    }
  }

  private byte[][] s183aKeikakuOhMetal1 = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhMetal1[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhMetal2 = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhMetal2[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhWbs = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhWbs[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhShitaP = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhShitaP[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhNakaP = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhNakaP[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhUwaP = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhUwaP[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhPbs = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhPbs[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhPreTrim = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhPreTrim[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhTrim = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhTrim[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhFinal = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhFinal[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhKasou = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhKasou[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhDeliv = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhDeliv[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[][] s183aKeikakuOhUkeire = new byte[4][2];
  {
    for (int a = 0; a < 4; a++) {
  s183aKeikakuOhUkeire[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] responseCodecr04 = CommonUtils.numberToBinary(0, 2);

  private byte[] s184aKoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s184aShakeiCode = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s184aLineKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s184aShift = CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));

  private byte[] s184aKouteiId = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] s184aKaishiJikoku = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] s184aJissekiKaishiIzen = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] s184aJissekiHhTbl = CommonUtils.stringToBytes(StringUtils.repeat(" ", 48));

  private byte[] s184aJisseki12hIkou = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] s184aKeikakuKaishiIzen = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] s184aKeikakuHhTbl = CommonUtils.stringToBytes(StringUtils.repeat(" ", 48));

  private byte[] s184aKeikaku12hIkou = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] responseCodecr05 = CommonUtils.numberToBinary(0, 2);

  private byte[] s185aKoujouKubunFileId = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s185aActGroup = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s185aActLineCod = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s185aYyyymm = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s185aKouteiKeikakuId = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[][] s185aShiftDaisu = new byte[63][2];
  {
    for (int a = 0; a < 63; a++) {
  s185aShiftDaisu[a]= CommonUtils.numberToPackedDecimal(0, 2);
    }
  }

  private byte[] s185aTimeStamp = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] responseCodecr06 = CommonUtils.numberToBinary(0, 2);

  private byte[] s180aKoujouKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s180aKoujouControlNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] s180aActLineCode = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s180aPoint2SeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));

  private byte[] s180aPoint3SeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));

  private byte[] s180aPoint4SeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));

  private byte[] s180aTransportDirectionSym = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] s180aDoukiseisanSeqNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] s180aDeliveryPlanNonMargin = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] s180aProductionMonth = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] s180aMsNo = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] cr01Declared = CommonUtils.stringToBytes("N");

  private byte[] cr01CountDeclared = CommonUtils.stringToBytes("N");

  private byte[] cr01Opened = CommonUtils.stringToBytes("N");

  private byte[] cr01CountOpened = CommonUtils.stringToBytes("N");

  private byte[] cr02Declared = CommonUtils.stringToBytes("N");

  private byte[] cr02CountDeclared = CommonUtils.stringToBytes("N");

  private byte[] cr02Opened = CommonUtils.stringToBytes("N");

  private byte[] cr02CountOpened = CommonUtils.stringToBytes("N");

  private byte[] cr03Declared = CommonUtils.stringToBytes("N");

  private byte[] cr03CountDeclared = CommonUtils.stringToBytes("N");

  private byte[] cr03Opened = CommonUtils.stringToBytes("N");

  private byte[] cr03CountOpened = CommonUtils.stringToBytes("N");

  private byte[] cr04Declared = CommonUtils.stringToBytes("N");

  private byte[] cr04CountDeclared = CommonUtils.stringToBytes("N");

  private byte[] cr04Opened = CommonUtils.stringToBytes("N");

  private byte[] cr04CountOpened = CommonUtils.stringToBytes("N");

  private byte[] cr05Declared = CommonUtils.stringToBytes("N");

  private byte[] cr05CountDeclared = CommonUtils.stringToBytes("N");

  private byte[] cr05Opened = CommonUtils.stringToBytes("N");

  private byte[] cr05CountOpened = CommonUtils.stringToBytes("N");

  private byte[] cr06Declared = CommonUtils.stringToBytes("N");

  private byte[] cr06CountDeclared = CommonUtils.stringToBytes("N");

  private byte[] cr06Opened = CommonUtils.stringToBytes("N");

  private byte[] cr06CountOpened = CommonUtils.stringToBytes("N");

  private byte[] hKoujouKubun181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKoujouControlNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] hModel181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] hColor181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] hUchibari181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hExNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] hShimukechi181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] hLineMain181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hLineMetal181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hLinePaint181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hLineTrim181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKokuyuKubun181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKijunShakei181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] hDakokuKatashiki181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] hChassisNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));

  private byte[] hEngKatashiki181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] hEngNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));

  private byte[] hOrgModel181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] hOrgColor181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] hOrgUchibari181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hOrgExNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));

  private byte[] hOrgLineKubun181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hShakeiCode181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hShameiCode181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hOrderKubun181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hDealerNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hOrderNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hComfirmedOrderNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] hCustomerName181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 41));

  private byte[] hTenjiPryCode181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hStatusPoint181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hJissekiJikoku01181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku02181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku03181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku04181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku05181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku06181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku07181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku08181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku09181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku10181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku11181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku12181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku13181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku14181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku15181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku16181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hJissekiJikoku17181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku01181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku02181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku03181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku04181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku05181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku06181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku07181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku08181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku09181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku10181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku11181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku12181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku13181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku14181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku15181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku16181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hOriginalKeikaku17181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku01181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku02181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku03181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku04181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku05181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku06181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku07181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku08181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku09181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku10181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku11181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku12181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku13181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku14181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku15181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku16181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised2Keikaku17181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku01181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku02181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku03181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku04181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku05181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku06181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku07181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku08181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku09181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku10181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku11181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku12181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku13181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku14181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku15181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku16181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hRevised1Keikaku17181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hIkkatsuSym201181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym202181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym203181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym204181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym205181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym206181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym207181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym208181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym209181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym210181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym211181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym212181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym213181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym214181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym215181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym216181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym217181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym101181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym102181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym103181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym104181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym105181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym106181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym107181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym108181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym109181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym110181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym111181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym112181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym113181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym114181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym115181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym116181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hIkkatsuSym117181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hYoteiInputJikoku01181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku02181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku03181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku04181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku05181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku06181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku07181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku08181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku09181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku10181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku11181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku12181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku13181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku14181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku15181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku16181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hYoteiInputJikoku17181 = CommonUtils.numberToPackedDecimal(0, 5);

  private byte[] hHanedashiRiyuu101181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu102181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu103181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu104181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu105181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu106181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu107181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu108181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu109181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu110181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu111181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu112181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu113181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu114181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu115181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu116181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu117181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu201181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu202181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu203181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu204181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu205181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu206181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu207181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu208181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu209181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu210181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu211181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu212181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu213181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu214181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu215181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu216181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hHanedashiRiyuu217181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hDeliveryLeadKotei181 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hDeliveryLeadYoyuu181 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hIkansaki181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hKensaIkanShikibetsu181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKasoushaSym181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKasouMaker181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hKasouKanryouLead181 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hTokkiJikou181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 20));

  private byte[] hActSchKey181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hActSeqNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));

  private byte[] hShataiReActSeqNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] hFinalReActSeqNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] hTrimSeqNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hOfflineSeqNo181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hKankenYmd181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hMsOfflineYmd181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));

  private byte[] hSymTokushusha181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymKouteiKeikakuGai181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZaikoZumi181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymGyakubarashiGai181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSenkouMiGai181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmDaihyou181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei01181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei02181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei03181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei04181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei05181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei06181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei07181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei08181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei09181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei10181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei11181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei12181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei13181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei14181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei15181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei16181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymSmKoutei17181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki01181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki02181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki03181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki04181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki05181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki06181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki07181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki08181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki09181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki10181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki11181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki12181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki13181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki14181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki15181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki16181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymZengetsuJisseki17181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymTlMetal181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymTlShitaP181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymTlNakaP181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymTlPaint181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymTlFinal181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymTlDeliv181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymPipeLineGai181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymPipeLineZumi181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymKeikakuMitei181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSeisanHoushiki181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymShisakuSha181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSymGyakuYunyuu181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hHyoujiGenzaichi181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSalesSpec10181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));

  private byte[] hLocalArea181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 50));

  private byte[] hTimeStamp181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] hDelivEigyouHizuke181 = CommonUtils.numberToPackedDecimal(0, 6);

  private byte[] hSymHanedashi181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSeihinKubun181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hStatus181R = CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));

  private byte[] hKoujouControlNo19181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));

  private byte[] hKoujouControlNo49181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hKoujouControlNo13181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] hModel13181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] hChassisNo16181 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hKoujouKubun182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hModel182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));

  private byte[] hColorUchibariEx182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));

  private byte[] hLineTrim182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKokuyuKubun182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hYymm182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hKouteiId182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hJissekiZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiTougetsu182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));

  private byte[] hJissekiJigetsu182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));

  private byte[] hRuisaZenZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKeikakuZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hRuisaZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKeikakuTougetsu182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));

  private byte[] hKeikakuJigetsu182 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));

  private byte[] hIkanZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hIkanTougetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hIkanJigetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hShikyuuZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hShikyuuTougetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hShikyuuJigetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hMikenZenZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hMikenZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKankenZenZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKankenZengetsu182 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hShiyou182R = CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));

  private byte[] hKoujouKubun183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hShakeiCode183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hLineKubun183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hYymm183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hKouteiId183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hJissekiZengetsu183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiTougetsu183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));

  private byte[] hJissekiJigetsu183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));

  private byte[] hRuisaZenZengetsu183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKeikakuZengetsu183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hRuisaZengetsu183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKeikakuTougetsu183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));

  private byte[] hKeikakuJigetsu183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));

  private byte[] hZenZenShift183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hZenShift183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hTouShift183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJiShift183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal101183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal102183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal103183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal104183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal201183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal202183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal203183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhMetal204183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhWbs01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhWbs02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhWbs03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhWbs04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhShitaP01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhShitaP02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhShitaP03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhShitaP04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhNakaP01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhNakaP02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhNakaP03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhNakaP04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhUwaP01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhUwaP02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhUwaP03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhUwaP04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPbs01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPbs02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPbs03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPbs04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPreTrim01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPreTrim02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPreTrim03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJissekiOhPreTrim04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhTrim01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhTrim02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhTrim03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhTrim04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhFinal01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhFinal02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhFinal03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhFinal04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhKasou01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhKasou02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhKasou03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhKasou04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhDeliv01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhDeliv02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhDeliv03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhDeliv04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhUkeire01183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhUkeire02183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhUkeire03183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hJikkekiOhUkeire04183 = CommonUtils.numberToPackedDecimal(0, 3);

  private byte[] hKeikakuOhMetal101183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal102183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal103183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal104183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal201183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal202183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal203183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhMetal204183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhWbs01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhWbs02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhWbs03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhWbs04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhShitaP01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhShitaP02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhShitaP03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhShitaP04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhNakaP01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhNakaP02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhNakaP03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhNakaP04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUwaP01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUwaP02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUwaP03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUwaP04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPbs01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPbs02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPbs03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPbs04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPreTrim01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPreTrim02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPreTrim03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhPreTrim04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhTrim01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhTrim02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhTrim03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhTrim04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhFinal01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhFinal02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhFinal03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhFinal04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhKasou01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhKasou02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhKasou03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhKasou04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhDeliv01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhDeliv02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhDeliv03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhDeliv04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUkeire01183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUkeire02183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUkeire03183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuOhUkeire04183 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShakei183R = CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));

  private byte[] hShakeiCode36183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hShakeiCode12183 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hKoujouKubun184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hShakeiCode184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hLineKubun184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hShift184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));

  private byte[] hKouteiId184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hKaishiJikoku184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hJissekiKaishiIzen184 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hJissekiHhTbl184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 192));

  private byte[] hJisseki12hIkou184 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuKaishiIzen184 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hKeikakuHhTbl184 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 192));

  private byte[] hKeikaku12hIkou184 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hJikei184R = CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));

  private byte[] hKoujouKubunFileId185 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hActGroup185 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hActLineCod185 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hYyyymm185 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hKouteiKeikakuId185 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));

  private byte[] hShiftDaisu01185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu02185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu03185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu04185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu05185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu06185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu07185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu08185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu09185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu10185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu11185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu12185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu13185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu14185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu15185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu16185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu17185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu18185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu19185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu20185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu21185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu22185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu23185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu24185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu25185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu26185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu27185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu28185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu29185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu30185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu31185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu32185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu33185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu34185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu35185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu36185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu37185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu38185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu39185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu40185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu41185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu42185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu43185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu44185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu45185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu46185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu47185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu48185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu49185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu50185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu51185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu52185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu53185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu54185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu55185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu56185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu57185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu58185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu59185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu60185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu61185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu62185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hShiftDaisu63185 = CommonUtils.numberToPackedDecimal(0, 2);

  private byte[] hTimeStamp185 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));

  private byte[] hKoutei185R = CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));

  private byte[] hKoujouKubun180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hKoujouControlNo180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] hActLineCode180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hPoint2SeqNo180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));

  private byte[] hPoint3SeqNo180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));

  private byte[] hPoint4SeqNo180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));

  private byte[] hTransportDirectionMls233 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hDoukiseisanSeqNo180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[] hDeliveryPlanNonMMls234 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));

  private byte[] hProductionMonth180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));

  private byte[] hMsNo180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] hSequence180R = CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));

  private byte[] hKoujouControlNo19180 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));

  private byte[] wSwOn = CommonUtils.stringToBytes("Y");

  private byte[] wSwOff = CommonUtils.stringToBytes("N");

  private byte[] cMop7501 = CommonUtils.stringToBytes("MOP7501 ");

  private byte[] cLok1801 = CommonUtils.stringToBytes("LOK1801 ");

  private byte[] cSeq1801 = CommonUtils.stringToBytes("SEQ1801 ");

  private byte[] cLok1811 = CommonUtils.stringToBytes("LOK1811 ");

  private byte[] cSeq1811 = CommonUtils.stringToBytes("SEQ1811 ");

  private byte[] cLok1821 = CommonUtils.stringToBytes("LOK1821 ");

  private byte[] cSeq1821 = CommonUtils.stringToBytes("SEQ1821 ");

  private byte[] cLok1831 = CommonUtils.stringToBytes("LOK1831 ");

  private byte[] cSeq1831 = CommonUtils.stringToBytes("SEQ1831 ");

  private byte[] cLok1841 = CommonUtils.stringToBytes("LOK1841 ");

  private byte[] cSeq1841 = CommonUtils.stringToBytes("SEQ1841 ");

  private byte[] cLok1851 = CommonUtils.stringToBytes("LOK1851 ");

  private byte[] cSeq1851 = CommonUtils.stringToBytes("SEQ1851 ");

  private byte[] cMcl7501 = CommonUtils.stringToBytes("MCL7501 ");

  private byte[] wkStatusEofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] wkShiyouBetsuEofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] wkShakeiBetsuEofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] wkJikeiRetsuEofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] wkKouteiKeikakuEofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] wkSequenceEofSw = CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));

  private byte[] storeCtr = CommonUtils.numberToBinary(0, 2);

  private byte[] filler0001 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));

  private byte[][] wkParam = new byte[6][3];
  {
    for (int a = 0; a < 6; a++) {
  wkParam[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
    }
  }

  private byte[][] filler0002 = new byte[6][1];
  {
    for (int a = 0; a < 6; a++) {
  filler0002[a]= CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
    }
  }

  private byte[] filler0003 = CommonUtils.stringToBytes(StringUtils.repeat(" ", 56));

  private byte[] wkStatus = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkShiyouBetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkShakeiBetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkJikeiRetsu = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkKouteiKeikaku = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkSequence = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkKatashiki = CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));

  private byte[] wkKihon = CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));

  private byte[] wkKubun = CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));

  private byte[] cConnect = CommonUtils.stringToBytes("CONNECT ");

  private byte[] cDbclose = CommonUtils.stringToBytes("DBCLOSE ");

  private byte[] cOpencr01 = CommonUtils.stringToBytes("OPENCR01");

  private byte[] cOpencr02 = CommonUtils.stringToBytes("OPENCR02");

  private byte[] cOpencr03 = CommonUtils.stringToBytes("OPENCR03");

  private byte[] cOpencr04 = CommonUtils.stringToBytes("OPENCR04");

  private byte[] cOpencr05 = CommonUtils.stringToBytes("OPENCR05");

  private byte[] cOpencr06 = CommonUtils.stringToBytes("OPENCR06");

  private byte[] cFethcr01 = CommonUtils.stringToBytes("FETHCR01");

  private byte[] cFethcr02 = CommonUtils.stringToBytes("FETHCR02");

  private byte[] cFethcr03 = CommonUtils.stringToBytes("FETHCR03");

  private byte[] cFethcr04 = CommonUtils.stringToBytes("FETHCR04");

  private byte[] cFethcr05 = CommonUtils.stringToBytes("FETHCR05");

  private byte[] cFethcr06 = CommonUtils.stringToBytes("FETHCR06");

  private byte[] cCloscr01 = CommonUtils.stringToBytes("CLOSCR01");

  private byte[] cCloscr02 = CommonUtils.stringToBytes("CLOSCR02");

  private byte[] cCloscr03 = CommonUtils.stringToBytes("CLOSCR03");

  private byte[] cCloscr04 = CommonUtils.stringToBytes("CLOSCR04");

  private byte[] cCloscr05 = CommonUtils.stringToBytes("CLOSCR05");

  private byte[] cCloscr06 = CommonUtils.stringToBytes("CLOSCR05");

  public byte[] getSys031RecBytes() {
    return sys031Rec;
  }

  public void setSys031RecBytes(byte[] arg) {
    sys031Rec = ArrayUtils.clone(arg);
  }

  public void initSys031Rec() {
    sys031Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1030));
  }

  public String getSys031Rec() {
  return CommonUtils.bytesToString(getSys031RecBytes());
  }

  public void setSys031Rec(String arg) {
  final int trailing_length = 1030 - arg.length();
  if (trailing_length > 0) {
  setSys031RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys031RecBytes(CommonUtils.stringToBytes(arg.substring(0, 1030)));
  }
  }

  public byte[] getSys032RecBytes() {
    return sys032Rec;
  }

  public void setSys032RecBytes(byte[] arg) {
    sys032Rec = ArrayUtils.clone(arg);
  }

  public void initSys032Rec() {
    sys032Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 497));
  }

  public String getSys032Rec() {
  return CommonUtils.bytesToString(getSys032RecBytes());
  }

  public void setSys032Rec(String arg) {
  final int trailing_length = 497 - arg.length();
  if (trailing_length > 0) {
  setSys032RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys032RecBytes(CommonUtils.stringToBytes(arg.substring(0, 497)));
  }
  }

  public byte[] getSys033RecBytes() {
    return sys033Rec;
  }

  public void setSys033RecBytes(byte[] arg) {
    sys033Rec = ArrayUtils.clone(arg);
  }

  public void initSys033Rec() {
    sys033Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 717));
  }

  public String getSys033Rec() {
  return CommonUtils.bytesToString(getSys033RecBytes());
  }

  public void setSys033Rec(String arg) {
  final int trailing_length = 717 - arg.length();
  if (trailing_length > 0) {
  setSys033RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys033RecBytes(CommonUtils.stringToBytes(arg.substring(0, 717)));
  }
  }

  public byte[] getSys034RecBytes() {
    return sys034Rec;
  }

  public void setSys034RecBytes(byte[] arg) {
    sys034Rec = ArrayUtils.clone(arg);
  }

  public void initSys034Rec() {
    sys034Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));
  }

  public String getSys034Rec() {
  return CommonUtils.bytesToString(getSys034RecBytes());
  }

  public void setSys034Rec(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setSys034RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys034RecBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getSys035RecBytes() {
    return sys035Rec;
  }

  public void setSys035RecBytes(byte[] arg) {
    sys035Rec = ArrayUtils.clone(arg);
  }

  public void initSys035Rec() {
    sys035Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 154));
  }

  public String getSys035Rec() {
  return CommonUtils.bytesToString(getSys035RecBytes());
  }

  public void setSys035Rec(String arg) {
  final int trailing_length = 154 - arg.length();
  if (trailing_length > 0) {
  setSys035RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys035RecBytes(CommonUtils.stringToBytes(arg.substring(0, 154)));
  }
  }

  public byte[] getSys036RecBytes() {
    return sys036Rec;
  }

  public void setSys036RecBytes(byte[] arg) {
    sys036Rec = ArrayUtils.clone(arg);
  }

  public void initSys036Rec() {
    sys036Rec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 80));
  }

  public String getSys036Rec() {
  return CommonUtils.bytesToString(getSys036RecBytes());
  }

  public void setSys036Rec(String arg) {
  final int trailing_length = 80 - arg.length();
  if (trailing_length > 0) {
  setSys036RecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSys036RecBytes(CommonUtils.stringToBytes(arg.substring(0, 80)));
  }
  }

  public byte[] getMlsSysinRecBytes() {
    return mlsSysinRec;
  }

  public void setMlsSysinRecBytes(byte[] arg) {
    mlsSysinRec = ArrayUtils.clone(arg);
  }

  public void initMlsSysinRec() {
    mlsSysinRec =CommonUtils.stringToBytes(StringUtils.repeat(" ", 80));
  }

  public String getMlsSysinRec() {
  return CommonUtils.bytesToString(getMlsSysinRecBytes());
  }

  public void setMlsSysinRec(String arg) {
  final int trailing_length = 80 - arg.length();
  if (trailing_length > 0) {
  setMlsSysinRecBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setMlsSysinRecBytes(CommonUtils.stringToBytes(arg.substring(0, 80)));
  }
  }

  public byte[] getResponseCodeopnBytes() {
    return responseCodeopn;
  }

  public void setResponseCodeopnBytes(byte[] arg) {
    responseCodeopn = ArrayUtils.clone(arg);
  }

  public void initResponseCodeopn() {
    responseCodeopn =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodeopn() {
    return CommonUtils.binaryToNumber(getResponseCodeopnBytes());
  }

  public void setResponseCodeopn(long arg) {
  setResponseCodeopnBytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getStatus181Cr01Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(1032);
        buffer.put(getResponseCodecr01Bytes());
        buffer.put(getRecordBufcr01Bytes());
    return buffer.array();
  }

  public void setStatus181Cr01Bytes(byte[] arg) {
        setResponseCodecr01Bytes(ArrayUtils.subarray(arg, 0, 2));
        setRecordBufcr01Bytes(ArrayUtils.subarray(arg, 2, 1032));
  }

  public void initStatus181Cr01() {
        initResponseCodecr01();
        initRecordBufcr01();
  }

  public String getStatus181Cr01() {
  return CommonUtils.bytesToString(getStatus181Cr01Bytes());
  }

  public void setStatus181Cr01(String arg) {
  final int trailing_length = 1032 - arg.length();
  if (trailing_length > 0) {
  setStatus181Cr01Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setStatus181Cr01Bytes(CommonUtils.stringToBytes(arg.substring(0, 1032)));
  }
  }

  public byte[] getResponseCodecr01Bytes() {
    return responseCodecr01;
  }

  public void setResponseCodecr01Bytes(byte[] arg) {
    responseCodecr01 = ArrayUtils.clone(arg);
  }

  public void initResponseCodecr01() {
    responseCodecr01 =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodecr01() {
    return CommonUtils.binaryToNumber(getResponseCodecr01Bytes());
  }

  public void setResponseCodecr01(long arg) {
  setResponseCodecr01Bytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getRecordBufcr01Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(1030);
        buffer.put(getS181aStatusKeyBytes());
        buffer.put(getS181aModelBytes());
        buffer.put(getS181aColorBytes());
        buffer.put(getS181aUchibariBytes());
        buffer.put(getS181aExNoBytes());
        buffer.put(getS181aShimukechiBytes());
        buffer.put(getS181aLineKubunBytes());
        buffer.put(getS181aKokuyuKubunBytes());
        buffer.put(getS181aKijunShakeiBytes());
        buffer.put(getS181aShataiBangouKatashikiBytes());
        buffer.put(getS181aEngineBytes());
        buffer.put(getS181aOriginalInfoBytes());
        buffer.put(getS181aDealerInfoBytes());
        buffer.put(getS181aStatusPointBytes());
        buffer.put(getS181aGKouteiJissekiBytes());
        buffer.put(getS181aGKouteiKeikakuBytes());
        buffer.put(getS181aDeliveryLeadTimeBytes());
        buffer.put(getS181aIkanInfoBytes());
        buffer.put(getS181aKasouInfoBytes());
        buffer.put(getS181aTokkiJikouBytes());
        buffer.put(getS181aActSchKeyBytes());
        buffer.put(getS181aActSeqNoBytes());
        buffer.put(getS181aShataiReActSeqNoBytes());
        buffer.put(getS181aFinalReActSeqNoBytes());
        buffer.put(getS181aTrimSeqNoBytes());
        buffer.put(getS181aOfflineSeqNoBytes());
        buffer.put(getS181aKankenYmdBytes());
        buffer.put(getS181aMsOfflineYmdBytes());
        buffer.put(getS181aSymTokushushaBytes());
        buffer.put(getS181aSymKouteiKeikakuGaiBytes());
        buffer.put(getS181aSymZaikoZumiBytes());
        buffer.put(getS181aSymGyakubarashiGaiBytes());
        buffer.put(getS181aSymSenkouMiGaiBytes());
        buffer.put(getS181aSymGroupSenkouMiBytes());
        for (int x = 0; x < 17; x++) {
        buffer.put(getS181aSymZengetsuJissekiBytes(x));
        }
        buffer.put(getS181aSymTokkyuLabelBytes());
        buffer.put(getS181aPipeLineItemBytes());
        buffer.put(getS181aSymGyakuYunyuuBytes());
        buffer.put(getS181aHyoujiGenzaichiBytes());
        buffer.put(getS181aSalesSpec10Bytes());
        buffer.put(getS181aLocalAreaBytes());
        buffer.put(getS181aTimeStampBytes());
        buffer.put(getS181aDelivEigyouHizukeBytes());
        buffer.put(getS181aSymHanedashiBytes());
        buffer.put(getS181aSeihinKubunBytes());
    return buffer.array();
  }

  public void setRecordBufcr01Bytes(byte[] arg) {
        setS181aStatusKeyBytes(ArrayUtils.subarray(arg, 0, 12));
        setS181aModelBytes(ArrayUtils.subarray(arg, 12, 30));
        setS181aColorBytes(ArrayUtils.subarray(arg, 30, 33));
        setS181aUchibariBytes(ArrayUtils.subarray(arg, 33, 34));
        setS181aExNoBytes(ArrayUtils.subarray(arg, 34, 39));
        setS181aShimukechiBytes(ArrayUtils.subarray(arg, 39, 42));
        setS181aLineKubunBytes(ArrayUtils.subarray(arg, 42, 46));
        setS181aKokuyuKubunBytes(ArrayUtils.subarray(arg, 46, 47));
        setS181aKijunShakeiBytes(ArrayUtils.subarray(arg, 47, 52));
        setS181aShataiBangouKatashikiBytes(ArrayUtils.subarray(arg, 52, 72));
        setS181aEngineBytes(ArrayUtils.subarray(arg, 72, 92));
        setS181aOriginalInfoBytes(ArrayUtils.subarray(arg, 92, 135));
        setS181aDealerInfoBytes(ArrayUtils.subarray(arg, 135, 200));
        setS181aStatusPointBytes(ArrayUtils.subarray(arg, 200, 202));
        setS181aGKouteiJissekiBytes(ArrayUtils.subarray(arg, 202, 304));
        setS181aGKouteiKeikakuBytes(ArrayUtils.subarray(arg, 304, 797));
        setS181aDeliveryLeadTimeBytes(ArrayUtils.subarray(arg, 797, 803));
        setS181aIkanInfoBytes(ArrayUtils.subarray(arg, 803, 808));
        setS181aKasouInfoBytes(ArrayUtils.subarray(arg, 808, 816));
        setS181aTokkiJikouBytes(ArrayUtils.subarray(arg, 816, 836));
        setS181aActSchKeyBytes(ArrayUtils.subarray(arg, 836, 837));
        setS181aActSeqNoBytes(ArrayUtils.subarray(arg, 837, 847));
        setS181aShataiReActSeqNoBytes(ArrayUtils.subarray(arg, 847, 858));
        setS181aFinalReActSeqNoBytes(ArrayUtils.subarray(arg, 858, 869));
        setS181aTrimSeqNoBytes(ArrayUtils.subarray(arg, 869, 875));
        setS181aOfflineSeqNoBytes(ArrayUtils.subarray(arg, 875, 881));
        setS181aKankenYmdBytes(ArrayUtils.subarray(arg, 881, 887));
        setS181aMsOfflineYmdBytes(ArrayUtils.subarray(arg, 887, 897));
        setS181aSymTokushushaBytes(ArrayUtils.subarray(arg, 897, 898));
        setS181aSymKouteiKeikakuGaiBytes(ArrayUtils.subarray(arg, 898, 899));
        setS181aSymZaikoZumiBytes(ArrayUtils.subarray(arg, 899, 900));
        setS181aSymGyakubarashiGaiBytes(ArrayUtils.subarray(arg, 900, 901));
        setS181aSymSenkouMiGaiBytes(ArrayUtils.subarray(arg, 901, 902));
        setS181aSymGroupSenkouMiBytes(ArrayUtils.subarray(arg, 902, 920));
        for (int x = 0; x < 17; x++) {
        setS181aSymZengetsuJissekiBytes(x, ArrayUtils.subarray(arg, 920 + 1 * x, 920 + 1 * (x + 1)));
        }
        setS181aSymTokkyuLabelBytes(ArrayUtils.subarray(arg, 921, 927));
        setS181aPipeLineItemBytes(ArrayUtils.subarray(arg, 927, 932));
        setS181aSymGyakuYunyuuBytes(ArrayUtils.subarray(arg, 932, 933));
        setS181aHyoujiGenzaichiBytes(ArrayUtils.subarray(arg, 933, 934));
        setS181aSalesSpec10Bytes(ArrayUtils.subarray(arg, 934, 944));
        setS181aLocalAreaBytes(ArrayUtils.subarray(arg, 944, 994));
        setS181aTimeStampBytes(ArrayUtils.subarray(arg, 994, 1006));
        setS181aDelivEigyouHizukeBytes(ArrayUtils.subarray(arg, 1006, 1012));
        setS181aSymHanedashiBytes(ArrayUtils.subarray(arg, 1012, 1013));
        setS181aSeihinKubunBytes(ArrayUtils.subarray(arg, 1013, 1014));
  }

  public void initRecordBufcr01() {
        initS181aStatusKey();
        initS181aModel();
        initS181aColor();
        initS181aUchibari();
        initS181aExNo();
        initS181aShimukechi();
        initS181aLineKubun();
        initS181aKokuyuKubun();
        initS181aKijunShakei();
        initS181aShataiBangouKatashiki();
        initS181aEngine();
        initS181aOriginalInfo();
        initS181aDealerInfo();
        initS181aStatusPoint();
        initS181aGKouteiJisseki();
        initS181aGKouteiKeikaku();
        initS181aDeliveryLeadTime();
        initS181aIkanInfo();
        initS181aKasouInfo();
        initS181aTokkiJikou();
        initS181aActSchKey();
        initS181aActSeqNo();
        initS181aShataiReActSeqNo();
        initS181aFinalReActSeqNo();
        initS181aTrimSeqNo();
        initS181aOfflineSeqNo();
        initS181aKankenYmd();
        initS181aMsOfflineYmd();
        initS181aSymTokushusha();
        initS181aSymKouteiKeikakuGai();
        initS181aSymZaikoZumi();
        initS181aSymGyakubarashiGai();
        initS181aSymSenkouMiGai();
        initS181aSymGroupSenkouMi();
        for (int x = 0; x < 17; x++) {
        initS181aSymZengetsuJisseki(x);
        }
        initS181aSymTokkyuLabel();
        initS181aPipeLineItem();
        initS181aSymGyakuYunyuu();
        initS181aHyoujiGenzaichi();
        initS181aSalesSpec10();
        initS181aLocalArea();
        initS181aTimeStamp();
        initS181aDelivEigyouHizuke();
        initS181aSymHanedashi();
        initS181aSeihinKubun();
  }

  public String getRecordBufcr01() {
  return CommonUtils.bytesToString(getRecordBufcr01Bytes());
  }

  public void setRecordBufcr01(String arg) {
  final int trailing_length = 1030 - arg.length();
  if (trailing_length > 0) {
  setRecordBufcr01Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setRecordBufcr01Bytes(CommonUtils.stringToBytes(arg.substring(0, 1030)));
  }
  }

  public byte[] getS181aStatusKeyBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(12);
        buffer.put(getS181aKoujouKubunBytes());
        buffer.put(getS181aKoujouControlNoBytes());
    return buffer.array();
  }

  public void setS181aStatusKeyBytes(byte[] arg) {
        setS181aKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setS181aKoujouControlNoBytes(ArrayUtils.subarray(arg, 1, 12));
  }

  public void initS181aStatusKey() {
        initS181aKoujouKubun();
        initS181aKoujouControlNo();
  }

  public String getS181aStatusKey() {
  return CommonUtils.bytesToString(getS181aStatusKeyBytes());
  }

  public void setS181aStatusKey(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS181aStatusKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aStatusKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS181aKoujouKubunBytes() {
    return s181aKoujouKubun;
  }

  public void setS181aKoujouKubunBytes(byte[] arg) {
    s181aKoujouKubun = ArrayUtils.clone(arg);
  }

  public void initS181aKoujouKubun() {
    s181aKoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aKoujouKubun() {
  return CommonUtils.bytesToString(getS181aKoujouKubunBytes());
  }

  public void setS181aKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aKoujouControlNoBytes() {
    return s181aKoujouControlNo;
  }

  public void setS181aKoujouControlNoBytes(byte[] arg) {
    s181aKoujouControlNo = ArrayUtils.clone(arg);
  }

  public void initS181aKoujouControlNo() {
    s181aKoujouControlNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getS181aKoujouControlNo() {
  return CommonUtils.bytesToString(getS181aKoujouControlNoBytes());
  }

  public void setS181aKoujouControlNo(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setS181aKoujouControlNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKoujouControlNoBytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getS181aModelBytes() {
    return s181aModel;
  }

  public void setS181aModelBytes(byte[] arg) {
    s181aModel = ArrayUtils.clone(arg);
  }

  public void initS181aModel() {
    s181aModel =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getS181aModel() {
  return CommonUtils.bytesToString(getS181aModelBytes());
  }

  public void setS181aModel(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setS181aModelBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aModelBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getS181aColorBytes() {
    return s181aColor;
  }

  public void setS181aColorBytes(byte[] arg) {
    s181aColor = ArrayUtils.clone(arg);
  }

  public void initS181aColor() {
    s181aColor =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getS181aColor() {
  return CommonUtils.bytesToString(getS181aColorBytes());
  }

  public void setS181aColor(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setS181aColorBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aColorBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getS181aUchibariBytes() {
    return s181aUchibari;
  }

  public void setS181aUchibariBytes(byte[] arg) {
    s181aUchibari = ArrayUtils.clone(arg);
  }

  public void initS181aUchibari() {
    s181aUchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aUchibari() {
  return CommonUtils.bytesToString(getS181aUchibariBytes());
  }

  public void setS181aUchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aUchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aUchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aExNoBytes() {
    return s181aExNo;
  }

  public void setS181aExNoBytes(byte[] arg) {
    s181aExNo = ArrayUtils.clone(arg);
  }

  public void initS181aExNo() {
    s181aExNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getS181aExNo() {
  return CommonUtils.bytesToString(getS181aExNoBytes());
  }

  public void setS181aExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setS181aExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getS181aShimukechiBytes() {
    return s181aShimukechi;
  }

  public void setS181aShimukechiBytes(byte[] arg) {
    s181aShimukechi = ArrayUtils.clone(arg);
  }

  public void initS181aShimukechi() {
    s181aShimukechi =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getS181aShimukechi() {
  return CommonUtils.bytesToString(getS181aShimukechiBytes());
  }

  public void setS181aShimukechi(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setS181aShimukechiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aShimukechiBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getS181aLineKubunBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getS181aLineMainBytes());
        buffer.put(getS181aLineMetalBytes());
        buffer.put(getS181aLinePaintBytes());
        buffer.put(getS181aLineTrimBytes());
    return buffer.array();
  }

  public void setS181aLineKubunBytes(byte[] arg) {
        setS181aLineMainBytes(ArrayUtils.subarray(arg, 0, 1));
        setS181aLineMetalBytes(ArrayUtils.subarray(arg, 1, 2));
        setS181aLinePaintBytes(ArrayUtils.subarray(arg, 2, 3));
        setS181aLineTrimBytes(ArrayUtils.subarray(arg, 3, 4));
  }

  public void initS181aLineKubun() {
        initS181aLineMain();
        initS181aLineMetal();
        initS181aLinePaint();
        initS181aLineTrim();
  }

  public String getS181aLineKubun() {
  return CommonUtils.bytesToString(getS181aLineKubunBytes());
  }

  public void setS181aLineKubun(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS181aLineKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aLineKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS181aLineMainBytes() {
    return s181aLineMain;
  }

  public void setS181aLineMainBytes(byte[] arg) {
    s181aLineMain = ArrayUtils.clone(arg);
  }

  public void initS181aLineMain() {
    s181aLineMain =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aLineMain() {
  return CommonUtils.bytesToString(getS181aLineMainBytes());
  }

  public void setS181aLineMain(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aLineMainBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aLineMainBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aLineMetalBytes() {
    return s181aLineMetal;
  }

  public void setS181aLineMetalBytes(byte[] arg) {
    s181aLineMetal = ArrayUtils.clone(arg);
  }

  public void initS181aLineMetal() {
    s181aLineMetal =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aLineMetal() {
  return CommonUtils.bytesToString(getS181aLineMetalBytes());
  }

  public void setS181aLineMetal(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aLineMetalBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aLineMetalBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aLinePaintBytes() {
    return s181aLinePaint;
  }

  public void setS181aLinePaintBytes(byte[] arg) {
    s181aLinePaint = ArrayUtils.clone(arg);
  }

  public void initS181aLinePaint() {
    s181aLinePaint =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aLinePaint() {
  return CommonUtils.bytesToString(getS181aLinePaintBytes());
  }

  public void setS181aLinePaint(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aLinePaintBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aLinePaintBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aLineTrimBytes() {
    return s181aLineTrim;
  }

  public void setS181aLineTrimBytes(byte[] arg) {
    s181aLineTrim = ArrayUtils.clone(arg);
  }

  public void initS181aLineTrim() {
    s181aLineTrim =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aLineTrim() {
  return CommonUtils.bytesToString(getS181aLineTrimBytes());
  }

  public void setS181aLineTrim(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aLineTrimBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aLineTrimBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aKokuyuKubunBytes() {
    return s181aKokuyuKubun;
  }

  public void setS181aKokuyuKubunBytes(byte[] arg) {
    s181aKokuyuKubun = ArrayUtils.clone(arg);
  }

  public void initS181aKokuyuKubun() {
    s181aKokuyuKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aKokuyuKubun() {
  return CommonUtils.bytesToString(getS181aKokuyuKubunBytes());
  }

  public void setS181aKokuyuKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aKokuyuKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKokuyuKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aKijunShakeiBytes() {
    return s181aKijunShakei;
  }

  public void setS181aKijunShakeiBytes(byte[] arg) {
    s181aKijunShakei = ArrayUtils.clone(arg);
  }

  public void initS181aKijunShakei() {
    s181aKijunShakei =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getS181aKijunShakei() {
  return CommonUtils.bytesToString(getS181aKijunShakeiBytes());
  }

  public void setS181aKijunShakei(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setS181aKijunShakeiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKijunShakeiBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getS181aShataiBangouKatashikiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.put(getS181aDakokuKatashikiBytes());
        buffer.put(getS181aChassisNoBytes());
    return buffer.array();
  }

  public void setS181aShataiBangouKatashikiBytes(byte[] arg) {
        setS181aDakokuKatashikiBytes(ArrayUtils.subarray(arg, 0, 12));
        setS181aChassisNoBytes(ArrayUtils.subarray(arg, 12, 20));
  }

  public void initS181aShataiBangouKatashiki() {
        initS181aDakokuKatashiki();
        initS181aChassisNo();
  }

  public String getS181aShataiBangouKatashiki() {
  return CommonUtils.bytesToString(getS181aShataiBangouKatashikiBytes());
  }

  public void setS181aShataiBangouKatashiki(String arg) {
  final int trailing_length = 20 - arg.length();
  if (trailing_length > 0) {
  setS181aShataiBangouKatashikiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aShataiBangouKatashikiBytes(CommonUtils.stringToBytes(arg.substring(0, 20)));
  }
  }

  public byte[] getS181aDakokuKatashikiBytes() {
    return s181aDakokuKatashiki;
  }

  public void setS181aDakokuKatashikiBytes(byte[] arg) {
    s181aDakokuKatashiki = ArrayUtils.clone(arg);
  }

  public void initS181aDakokuKatashiki() {
    s181aDakokuKatashiki =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getS181aDakokuKatashiki() {
  return CommonUtils.bytesToString(getS181aDakokuKatashikiBytes());
  }

  public void setS181aDakokuKatashiki(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS181aDakokuKatashikiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aDakokuKatashikiBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS181aChassisNoBytes() {
    return s181aChassisNo;
  }

  public void setS181aChassisNoBytes(byte[] arg) {
    s181aChassisNo = ArrayUtils.clone(arg);
  }

  public void initS181aChassisNo() {
    s181aChassisNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getS181aChassisNo() {
  return CommonUtils.bytesToString(getS181aChassisNoBytes());
  }

  public void setS181aChassisNo(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setS181aChassisNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aChassisNoBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getS181aEngineBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.put(getS181aEngKatashikiBytes());
        buffer.put(getS181aEngNoBytes());
    return buffer.array();
  }

  public void setS181aEngineBytes(byte[] arg) {
        setS181aEngKatashikiBytes(ArrayUtils.subarray(arg, 0, 12));
        setS181aEngNoBytes(ArrayUtils.subarray(arg, 12, 20));
  }

  public void initS181aEngine() {
        initS181aEngKatashiki();
        initS181aEngNo();
  }

  public String getS181aEngine() {
  return CommonUtils.bytesToString(getS181aEngineBytes());
  }

  public void setS181aEngine(String arg) {
  final int trailing_length = 20 - arg.length();
  if (trailing_length > 0) {
  setS181aEngineBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aEngineBytes(CommonUtils.stringToBytes(arg.substring(0, 20)));
  }
  }

  public byte[] getS181aEngKatashikiBytes() {
    return s181aEngKatashiki;
  }

  public void setS181aEngKatashikiBytes(byte[] arg) {
    s181aEngKatashiki = ArrayUtils.clone(arg);
  }

  public void initS181aEngKatashiki() {
    s181aEngKatashiki =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getS181aEngKatashiki() {
  return CommonUtils.bytesToString(getS181aEngKatashikiBytes());
  }

  public void setS181aEngKatashiki(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS181aEngKatashikiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aEngKatashikiBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS181aEngNoBytes() {
    return s181aEngNo;
  }

  public void setS181aEngNoBytes(byte[] arg) {
    s181aEngNo = ArrayUtils.clone(arg);
  }

  public void initS181aEngNo() {
    s181aEngNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getS181aEngNo() {
  return CommonUtils.bytesToString(getS181aEngNoBytes());
  }

  public void setS181aEngNo(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setS181aEngNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aEngNoBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getS181aOriginalInfoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(43);
        buffer.put(getS181aOrgModelBytes());
        buffer.put(getS181aOrgColorBytes());
        buffer.put(getS181aOrgUchibariBytes());
        buffer.put(getS181aOrgExNoBytes());
        buffer.put(getS181aOrgLineKubunBytes());
        buffer.put(getS181aShakeiCodeBytes());
        buffer.put(getS181aShameiCodeBytes());
    return buffer.array();
  }

  public void setS181aOriginalInfoBytes(byte[] arg) {
        setS181aOrgModelBytes(ArrayUtils.subarray(arg, 0, 18));
        setS181aOrgColorBytes(ArrayUtils.subarray(arg, 18, 21));
        setS181aOrgUchibariBytes(ArrayUtils.subarray(arg, 21, 22));
        setS181aOrgExNoBytes(ArrayUtils.subarray(arg, 22, 27));
        setS181aOrgLineKubunBytes(ArrayUtils.subarray(arg, 27, 31));
        setS181aShakeiCodeBytes(ArrayUtils.subarray(arg, 31, 37));
        setS181aShameiCodeBytes(ArrayUtils.subarray(arg, 37, 43));
  }

  public void initS181aOriginalInfo() {
        initS181aOrgModel();
        initS181aOrgColor();
        initS181aOrgUchibari();
        initS181aOrgExNo();
        initS181aOrgLineKubun();
        initS181aShakeiCode();
        initS181aShameiCode();
  }

  public String getS181aOriginalInfo() {
  return CommonUtils.bytesToString(getS181aOriginalInfoBytes());
  }

  public void setS181aOriginalInfo(String arg) {
  final int trailing_length = 43 - arg.length();
  if (trailing_length > 0) {
  setS181aOriginalInfoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOriginalInfoBytes(CommonUtils.stringToBytes(arg.substring(0, 43)));
  }
  }

  public byte[] getS181aOrgModelBytes() {
    return s181aOrgModel;
  }

  public void setS181aOrgModelBytes(byte[] arg) {
    s181aOrgModel = ArrayUtils.clone(arg);
  }

  public void initS181aOrgModel() {
    s181aOrgModel =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getS181aOrgModel() {
  return CommonUtils.bytesToString(getS181aOrgModelBytes());
  }

  public void setS181aOrgModel(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setS181aOrgModelBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrgModelBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getS181aOrgColorBytes() {
    return s181aOrgColor;
  }

  public void setS181aOrgColorBytes(byte[] arg) {
    s181aOrgColor = ArrayUtils.clone(arg);
  }

  public void initS181aOrgColor() {
    s181aOrgColor =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getS181aOrgColor() {
  return CommonUtils.bytesToString(getS181aOrgColorBytes());
  }

  public void setS181aOrgColor(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setS181aOrgColorBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrgColorBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getS181aOrgUchibariBytes() {
    return s181aOrgUchibari;
  }

  public void setS181aOrgUchibariBytes(byte[] arg) {
    s181aOrgUchibari = ArrayUtils.clone(arg);
  }

  public void initS181aOrgUchibari() {
    s181aOrgUchibari =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aOrgUchibari() {
  return CommonUtils.bytesToString(getS181aOrgUchibariBytes());
  }

  public void setS181aOrgUchibari(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aOrgUchibariBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrgUchibariBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aOrgExNoBytes() {
    return s181aOrgExNo;
  }

  public void setS181aOrgExNoBytes(byte[] arg) {
    s181aOrgExNo = ArrayUtils.clone(arg);
  }

  public void initS181aOrgExNo() {
    s181aOrgExNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getS181aOrgExNo() {
  return CommonUtils.bytesToString(getS181aOrgExNoBytes());
  }

  public void setS181aOrgExNo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setS181aOrgExNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrgExNoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getS181aOrgLineKubunBytes() {
    return s181aOrgLineKubun;
  }

  public void setS181aOrgLineKubunBytes(byte[] arg) {
    s181aOrgLineKubun = ArrayUtils.clone(arg);
  }

  public void initS181aOrgLineKubun() {
    s181aOrgLineKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS181aOrgLineKubun() {
  return CommonUtils.bytesToString(getS181aOrgLineKubunBytes());
  }

  public void setS181aOrgLineKubun(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS181aOrgLineKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrgLineKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS181aShakeiCodeBytes() {
    return s181aShakeiCode;
  }

  public void setS181aShakeiCodeBytes(byte[] arg) {
    s181aShakeiCode = ArrayUtils.clone(arg);
  }

  public void initS181aShakeiCode() {
    s181aShakeiCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS181aShakeiCode() {
  return CommonUtils.bytesToString(getS181aShakeiCodeBytes());
  }

  public void setS181aShakeiCode(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aShakeiCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aShakeiCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aShameiCodeBytes() {
    return s181aShameiCode;
  }

  public void setS181aShameiCodeBytes(byte[] arg) {
    s181aShameiCode = ArrayUtils.clone(arg);
  }

  public void initS181aShameiCode() {
    s181aShameiCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS181aShameiCode() {
  return CommonUtils.bytesToString(getS181aShameiCodeBytes());
  }

  public void setS181aShameiCode(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aShameiCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aShameiCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aDealerInfoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(65);
        buffer.put(getS181aOrderKubunBytes());
        buffer.put(getS181aDealerNoBytes());
        buffer.put(getS181aOrderNoBytes());
        buffer.put(getS181aComfirmedOrderNoBytes());
        buffer.put(getS181aCustomerNameBytes());
        buffer.put(getS181aTenjiPryCodeBytes());
    return buffer.array();
  }

  public void setS181aDealerInfoBytes(byte[] arg) {
        setS181aOrderKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setS181aDealerNoBytes(ArrayUtils.subarray(arg, 1, 5));
        setS181aOrderNoBytes(ArrayUtils.subarray(arg, 5, 11));
        setS181aComfirmedOrderNoBytes(ArrayUtils.subarray(arg, 11, 23));
        setS181aCustomerNameBytes(ArrayUtils.subarray(arg, 23, 64));
        setS181aTenjiPryCodeBytes(ArrayUtils.subarray(arg, 64, 65));
  }

  public void initS181aDealerInfo() {
        initS181aOrderKubun();
        initS181aDealerNo();
        initS181aOrderNo();
        initS181aComfirmedOrderNo();
        initS181aCustomerName();
        initS181aTenjiPryCode();
  }

  public String getS181aDealerInfo() {
  return CommonUtils.bytesToString(getS181aDealerInfoBytes());
  }

  public void setS181aDealerInfo(String arg) {
  final int trailing_length = 65 - arg.length();
  if (trailing_length > 0) {
  setS181aDealerInfoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aDealerInfoBytes(CommonUtils.stringToBytes(arg.substring(0, 65)));
  }
  }

  public byte[] getS181aOrderKubunBytes() {
    return s181aOrderKubun;
  }

  public void setS181aOrderKubunBytes(byte[] arg) {
    s181aOrderKubun = ArrayUtils.clone(arg);
  }

  public void initS181aOrderKubun() {
    s181aOrderKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aOrderKubun() {
  return CommonUtils.bytesToString(getS181aOrderKubunBytes());
  }

  public void setS181aOrderKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aOrderKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrderKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aDealerNoBytes() {
    return s181aDealerNo;
  }

  public void setS181aDealerNoBytes(byte[] arg) {
    s181aDealerNo = ArrayUtils.clone(arg);
  }

  public void initS181aDealerNo() {
    s181aDealerNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS181aDealerNo() {
  return CommonUtils.bytesToString(getS181aDealerNoBytes());
  }

  public void setS181aDealerNo(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS181aDealerNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aDealerNoBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS181aOrderNoBytes() {
    return s181aOrderNo;
  }

  public void setS181aOrderNoBytes(byte[] arg) {
    s181aOrderNo = ArrayUtils.clone(arg);
  }

  public void initS181aOrderNo() {
    s181aOrderNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS181aOrderNo() {
  return CommonUtils.bytesToString(getS181aOrderNoBytes());
  }

  public void setS181aOrderNo(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aOrderNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOrderNoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aComfirmedOrderNoBytes() {
    return s181aComfirmedOrderNo;
  }

  public void setS181aComfirmedOrderNoBytes(byte[] arg) {
    s181aComfirmedOrderNo = ArrayUtils.clone(arg);
  }

  public void initS181aComfirmedOrderNo() {
    s181aComfirmedOrderNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getS181aComfirmedOrderNo() {
  return CommonUtils.bytesToString(getS181aComfirmedOrderNoBytes());
  }

  public void setS181aComfirmedOrderNo(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS181aComfirmedOrderNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aComfirmedOrderNoBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS181aCustomerNameBytes() {
    return s181aCustomerName;
  }

  public void setS181aCustomerNameBytes(byte[] arg) {
    s181aCustomerName = ArrayUtils.clone(arg);
  }

  public void initS181aCustomerName() {
    s181aCustomerName =CommonUtils.stringToBytes(StringUtils.repeat(" ", 41));
  }

  public String getS181aCustomerName() {
  return CommonUtils.bytesToString(getS181aCustomerNameBytes());
  }

  public void setS181aCustomerName(String arg) {
  final int trailing_length = 41 - arg.length();
  if (trailing_length > 0) {
  setS181aCustomerNameBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aCustomerNameBytes(CommonUtils.stringToBytes(arg.substring(0, 41)));
  }
  }

  public byte[] getS181aTenjiPryCodeBytes() {
    return s181aTenjiPryCode;
  }

  public void setS181aTenjiPryCodeBytes(byte[] arg) {
    s181aTenjiPryCode = ArrayUtils.clone(arg);
  }

  public void initS181aTenjiPryCode() {
    s181aTenjiPryCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aTenjiPryCode() {
  return CommonUtils.bytesToString(getS181aTenjiPryCodeBytes());
  }

  public void setS181aTenjiPryCode(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aTenjiPryCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aTenjiPryCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aStatusPointBytes() {
    return s181aStatusPoint;
  }

  public void setS181aStatusPointBytes(byte[] arg) {
    s181aStatusPoint = ArrayUtils.clone(arg);
  }

  public void initS181aStatusPoint() {
    s181aStatusPoint =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS181aStatusPoint() {
  return CommonUtils.bytesToString(getS181aStatusPointBytes());
  }

  public void setS181aStatusPoint(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS181aStatusPointBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aStatusPointBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS181aGKouteiJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(102);
        for (int x = 0; x < 17; x++) {
        buffer.put(getS181aKouteiJissekiBytes(x));
        }
    return buffer.array();
  }

  public void setS181aGKouteiJissekiBytes(byte[] arg) {
        for (int x = 0; x < 17; x++) {
        setS181aKouteiJissekiBytes(x, ArrayUtils.subarray(arg, 0 + 6 * x, 0 + 6 * (x + 1)));
        }
  }

  public void initS181aGKouteiJisseki() {
        for (int x = 0; x < 17; x++) {
        initS181aKouteiJisseki(x);
        }
  }

  public String getS181aGKouteiJisseki() {
  return CommonUtils.bytesToString(getS181aGKouteiJissekiBytes());
  }

  public void setS181aGKouteiJisseki(String arg) {
  final int trailing_length = 102 - arg.length();
  if (trailing_length > 0) {
  setS181aGKouteiJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aGKouteiJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 102)));
  }
  }

  public byte[] getS181aKouteiJissekiBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getS181aJissekiJikokuBytes(a));
    return buffer.array();
  }

  public void setS181aKouteiJissekiBytes(int a,byte[] arg) {
        setS181aJissekiJikokuBytes(a,ArrayUtils.subarray(arg, 0, 6));
  }

  public void initS181aKouteiJisseki(int a) {
        initS181aJissekiJikoku(a);
  }

  public String getS181aKouteiJisseki(int a) {
  return CommonUtils.bytesToString(getS181aKouteiJissekiBytes(a));
  }

  public void setS181aKouteiJisseki(int a,String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aKouteiJissekiBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKouteiJissekiBytes(a,CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aJissekiJikokuBytes(int a) {
    return s181aJissekiJikoku[a];
  }

  public void setS181aJissekiJikokuBytes(int a,byte[] arg) {
    s181aJissekiJikoku[a] = ArrayUtils.clone(arg);
  }

  public void initS181aJissekiJikoku(int a) {
    s181aJissekiJikoku[a] =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getS181aJissekiJikoku(int a) {
    return CommonUtils.packedDecimalToNumber(getS181aJissekiJikokuBytes(a));
  }

  public void setS181aJissekiJikoku(int a,long arg) {
  setS181aJissekiJikokuBytes(a,CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getS181aGKouteiKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(493);
        for (int x = 0; x < 17; x++) {
        buffer.put(getS181aKouteiKeikakuBytes(x));
        }
    return buffer.array();
  }

  public void setS181aGKouteiKeikakuBytes(byte[] arg) {
        for (int x = 0; x < 17; x++) {
        setS181aKouteiKeikakuBytes(x, ArrayUtils.subarray(arg, 0 + 29 * x, 0 + 29 * (x + 1)));
        }
  }

  public void initS181aGKouteiKeikaku() {
        for (int x = 0; x < 17; x++) {
        initS181aKouteiKeikaku(x);
        }
  }

  public String getS181aGKouteiKeikaku() {
  return CommonUtils.bytesToString(getS181aGKouteiKeikakuBytes());
  }

  public void setS181aGKouteiKeikaku(String arg) {
  final int trailing_length = 493 - arg.length();
  if (trailing_length > 0) {
  setS181aGKouteiKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aGKouteiKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 493)));
  }
  }

  public byte[] getS181aKouteiKeikakuBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(29);
        buffer.put(getS181aOriginalKeikakuBytes(a));
        buffer.put(getS181aRevised2KeikakuBytes(a));
        buffer.put(getS181aRevised1KeikakuBytes(a));
        buffer.put(getS181aIkkatsuSym2Bytes(a));
        buffer.put(getS181aIkkatsuSym1Bytes(a));
        buffer.put(getS181aYoteiInputJikokuBytes(a));
        buffer.put(getS181aHanedashiRiyuu1Bytes(a));
        buffer.put(getS181aHanedashiRiyuu2Bytes(a));
    return buffer.array();
  }

  public void setS181aKouteiKeikakuBytes(int a,byte[] arg) {
        setS181aOriginalKeikakuBytes(a,ArrayUtils.subarray(arg, 0, 6));
        setS181aRevised2KeikakuBytes(a,ArrayUtils.subarray(arg, 6, 12));
        setS181aRevised1KeikakuBytes(a,ArrayUtils.subarray(arg, 12, 18));
        setS181aIkkatsuSym2Bytes(a,ArrayUtils.subarray(arg, 18, 19));
        setS181aIkkatsuSym1Bytes(a,ArrayUtils.subarray(arg, 19, 20));
        setS181aYoteiInputJikokuBytes(a,ArrayUtils.subarray(arg, 20, 25));
        setS181aHanedashiRiyuu1Bytes(a,ArrayUtils.subarray(arg, 25, 27));
        setS181aHanedashiRiyuu2Bytes(a,ArrayUtils.subarray(arg, 27, 29));
  }

  public void initS181aKouteiKeikaku(int a) {
        initS181aOriginalKeikaku(a);
        initS181aRevised2Keikaku(a);
        initS181aRevised1Keikaku(a);
        initS181aIkkatsuSym2(a);
        initS181aIkkatsuSym1(a);
        initS181aYoteiInputJikoku(a);
        initS181aHanedashiRiyuu1(a);
        initS181aHanedashiRiyuu2(a);
  }

  public String getS181aKouteiKeikaku(int a) {
  return CommonUtils.bytesToString(getS181aKouteiKeikakuBytes(a));
  }

  public void setS181aKouteiKeikaku(int a,String arg) {
  final int trailing_length = 29 - arg.length();
  if (trailing_length > 0) {
  setS181aKouteiKeikakuBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKouteiKeikakuBytes(a,CommonUtils.stringToBytes(arg.substring(0, 29)));
  }
  }

  public byte[] getS181aOriginalKeikakuBytes(int a) {
    return s181aOriginalKeikaku[a];
  }

  public void setS181aOriginalKeikakuBytes(int a,byte[] arg) {
    s181aOriginalKeikaku[a] = ArrayUtils.clone(arg);
  }

  public void initS181aOriginalKeikaku(int a) {
    s181aOriginalKeikaku[a] =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getS181aOriginalKeikaku(int a) {
    return CommonUtils.packedDecimalToNumber(getS181aOriginalKeikakuBytes(a));
  }

  public void setS181aOriginalKeikaku(int a,long arg) {
  setS181aOriginalKeikakuBytes(a,CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getS181aRevised2KeikakuBytes(int a) {
    return s181aRevised2Keikaku[a];
  }

  public void setS181aRevised2KeikakuBytes(int a,byte[] arg) {
    s181aRevised2Keikaku[a] = ArrayUtils.clone(arg);
  }

  public void initS181aRevised2Keikaku(int a) {
    s181aRevised2Keikaku[a] =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getS181aRevised2Keikaku(int a) {
    return CommonUtils.packedDecimalToNumber(getS181aRevised2KeikakuBytes(a));
  }

  public void setS181aRevised2Keikaku(int a,long arg) {
  setS181aRevised2KeikakuBytes(a,CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getS181aRevised1KeikakuBytes(int a) {
    return s181aRevised1Keikaku[a];
  }

  public void setS181aRevised1KeikakuBytes(int a,byte[] arg) {
    s181aRevised1Keikaku[a] = ArrayUtils.clone(arg);
  }

  public void initS181aRevised1Keikaku(int a) {
    s181aRevised1Keikaku[a] =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getS181aRevised1Keikaku(int a) {
    return CommonUtils.packedDecimalToNumber(getS181aRevised1KeikakuBytes(a));
  }

  public void setS181aRevised1Keikaku(int a,long arg) {
  setS181aRevised1KeikakuBytes(a,CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getS181aIkkatsuSym2Bytes(int a) {
    return s181aIkkatsuSym2[a];
  }

  public void setS181aIkkatsuSym2Bytes(int a,byte[] arg) {
    s181aIkkatsuSym2[a] = ArrayUtils.clone(arg);
  }

  public void initS181aIkkatsuSym2(int a) {
    s181aIkkatsuSym2[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aIkkatsuSym2(int a) {
  return CommonUtils.bytesToString(getS181aIkkatsuSym2Bytes(a));
  }

  public void setS181aIkkatsuSym2(int a,String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aIkkatsuSym2Bytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aIkkatsuSym2Bytes(a,CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aIkkatsuSym1Bytes(int a) {
    return s181aIkkatsuSym1[a];
  }

  public void setS181aIkkatsuSym1Bytes(int a,byte[] arg) {
    s181aIkkatsuSym1[a] = ArrayUtils.clone(arg);
  }

  public void initS181aIkkatsuSym1(int a) {
    s181aIkkatsuSym1[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aIkkatsuSym1(int a) {
  return CommonUtils.bytesToString(getS181aIkkatsuSym1Bytes(a));
  }

  public void setS181aIkkatsuSym1(int a,String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aIkkatsuSym1Bytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aIkkatsuSym1Bytes(a,CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aYoteiInputJikokuBytes(int a) {
    return s181aYoteiInputJikoku[a];
  }

  public void setS181aYoteiInputJikokuBytes(int a,byte[] arg) {
    s181aYoteiInputJikoku[a] = ArrayUtils.clone(arg);
  }

  public void initS181aYoteiInputJikoku(int a) {
    s181aYoteiInputJikoku[a] =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getS181aYoteiInputJikoku(int a) {
    return CommonUtils.packedDecimalToNumber(getS181aYoteiInputJikokuBytes(a));
  }

  public void setS181aYoteiInputJikoku(int a,long arg) {
  setS181aYoteiInputJikokuBytes(a,CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getS181aHanedashiRiyuu1Bytes(int a) {
    return s181aHanedashiRiyuu1[a];
  }

  public void setS181aHanedashiRiyuu1Bytes(int a,byte[] arg) {
    s181aHanedashiRiyuu1[a] = ArrayUtils.clone(arg);
  }

  public void initS181aHanedashiRiyuu1(int a) {
    s181aHanedashiRiyuu1[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS181aHanedashiRiyuu1(int a) {
  return CommonUtils.bytesToString(getS181aHanedashiRiyuu1Bytes(a));
  }

  public void setS181aHanedashiRiyuu1(int a,String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS181aHanedashiRiyuu1Bytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aHanedashiRiyuu1Bytes(a,CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS181aHanedashiRiyuu2Bytes(int a) {
    return s181aHanedashiRiyuu2[a];
  }

  public void setS181aHanedashiRiyuu2Bytes(int a,byte[] arg) {
    s181aHanedashiRiyuu2[a] = ArrayUtils.clone(arg);
  }

  public void initS181aHanedashiRiyuu2(int a) {
    s181aHanedashiRiyuu2[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS181aHanedashiRiyuu2(int a) {
  return CommonUtils.bytesToString(getS181aHanedashiRiyuu2Bytes(a));
  }

  public void setS181aHanedashiRiyuu2(int a,String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS181aHanedashiRiyuu2Bytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aHanedashiRiyuu2Bytes(a,CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS181aDeliveryLeadTimeBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getS181aDeliveryLeadKoteiBytes());
        buffer.put(getS181aDeliveryLeadYoyuuBytes());
    return buffer.array();
  }

  public void setS181aDeliveryLeadTimeBytes(byte[] arg) {
        setS181aDeliveryLeadKoteiBytes(ArrayUtils.subarray(arg, 0, 3));
        setS181aDeliveryLeadYoyuuBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initS181aDeliveryLeadTime() {
        initS181aDeliveryLeadKotei();
        initS181aDeliveryLeadYoyuu();
  }

  public String getS181aDeliveryLeadTime() {
  return CommonUtils.bytesToString(getS181aDeliveryLeadTimeBytes());
  }

  public void setS181aDeliveryLeadTime(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aDeliveryLeadTimeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aDeliveryLeadTimeBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aDeliveryLeadKoteiBytes() {
    return s181aDeliveryLeadKotei;
  }

  public void setS181aDeliveryLeadKoteiBytes(byte[] arg) {
    s181aDeliveryLeadKotei = ArrayUtils.clone(arg);
  }

  public void initS181aDeliveryLeadKotei() {
    s181aDeliveryLeadKotei =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS181aDeliveryLeadKotei() {
    return CommonUtils.packedDecimalToNumber(getS181aDeliveryLeadKoteiBytes());
  }

  public void setS181aDeliveryLeadKotei(long arg) {
  setS181aDeliveryLeadKoteiBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS181aDeliveryLeadYoyuuBytes() {
    return s181aDeliveryLeadYoyuu;
  }

  public void setS181aDeliveryLeadYoyuuBytes(byte[] arg) {
    s181aDeliveryLeadYoyuu = ArrayUtils.clone(arg);
  }

  public void initS181aDeliveryLeadYoyuu() {
    s181aDeliveryLeadYoyuu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS181aDeliveryLeadYoyuu() {
    return CommonUtils.packedDecimalToNumber(getS181aDeliveryLeadYoyuuBytes());
  }

  public void setS181aDeliveryLeadYoyuu(long arg) {
  setS181aDeliveryLeadYoyuuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS181aIkanInfoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(5);
        buffer.put(getS181aIkansakiBytes());
        buffer.put(getS181aKensaIkanShikibetsuBytes());
    return buffer.array();
  }

  public void setS181aIkanInfoBytes(byte[] arg) {
        setS181aIkansakiBytes(ArrayUtils.subarray(arg, 0, 4));
        setS181aKensaIkanShikibetsuBytes(ArrayUtils.subarray(arg, 4, 5));
  }

  public void initS181aIkanInfo() {
        initS181aIkansaki();
        initS181aKensaIkanShikibetsu();
  }

  public String getS181aIkanInfo() {
  return CommonUtils.bytesToString(getS181aIkanInfoBytes());
  }

  public void setS181aIkanInfo(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setS181aIkanInfoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aIkanInfoBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getS181aIkansakiBytes() {
    return s181aIkansaki;
  }

  public void setS181aIkansakiBytes(byte[] arg) {
    s181aIkansaki = ArrayUtils.clone(arg);
  }

  public void initS181aIkansaki() {
    s181aIkansaki =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS181aIkansaki() {
  return CommonUtils.bytesToString(getS181aIkansakiBytes());
  }

  public void setS181aIkansaki(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS181aIkansakiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aIkansakiBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS181aKensaIkanShikibetsuBytes() {
    return s181aKensaIkanShikibetsu;
  }

  public void setS181aKensaIkanShikibetsuBytes(byte[] arg) {
    s181aKensaIkanShikibetsu = ArrayUtils.clone(arg);
  }

  public void initS181aKensaIkanShikibetsu() {
    s181aKensaIkanShikibetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aKensaIkanShikibetsu() {
  return CommonUtils.bytesToString(getS181aKensaIkanShikibetsuBytes());
  }

  public void setS181aKensaIkanShikibetsu(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aKensaIkanShikibetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKensaIkanShikibetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aKasouInfoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.put(getS181aKasoushaSymBytes());
        buffer.put(getS181aKasouMakerBytes());
        buffer.put(getS181aKasouKanryouLeadBytes());
    return buffer.array();
  }

  public void setS181aKasouInfoBytes(byte[] arg) {
        setS181aKasoushaSymBytes(ArrayUtils.subarray(arg, 0, 1));
        setS181aKasouMakerBytes(ArrayUtils.subarray(arg, 1, 5));
        setS181aKasouKanryouLeadBytes(ArrayUtils.subarray(arg, 5, 8));
  }

  public void initS181aKasouInfo() {
        initS181aKasoushaSym();
        initS181aKasouMaker();
        initS181aKasouKanryouLead();
  }

  public String getS181aKasouInfo() {
  return CommonUtils.bytesToString(getS181aKasouInfoBytes());
  }

  public void setS181aKasouInfo(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setS181aKasouInfoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKasouInfoBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getS181aKasoushaSymBytes() {
    return s181aKasoushaSym;
  }

  public void setS181aKasoushaSymBytes(byte[] arg) {
    s181aKasoushaSym = ArrayUtils.clone(arg);
  }

  public void initS181aKasoushaSym() {
    s181aKasoushaSym =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aKasoushaSym() {
  return CommonUtils.bytesToString(getS181aKasoushaSymBytes());
  }

  public void setS181aKasoushaSym(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aKasoushaSymBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKasoushaSymBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aKasouMakerBytes() {
    return s181aKasouMaker;
  }

  public void setS181aKasouMakerBytes(byte[] arg) {
    s181aKasouMaker = ArrayUtils.clone(arg);
  }

  public void initS181aKasouMaker() {
    s181aKasouMaker =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS181aKasouMaker() {
  return CommonUtils.bytesToString(getS181aKasouMakerBytes());
  }

  public void setS181aKasouMaker(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS181aKasouMakerBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKasouMakerBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS181aKasouKanryouLeadBytes() {
    return s181aKasouKanryouLead;
  }

  public void setS181aKasouKanryouLeadBytes(byte[] arg) {
    s181aKasouKanryouLead = ArrayUtils.clone(arg);
  }

  public void initS181aKasouKanryouLead() {
    s181aKasouKanryouLead =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS181aKasouKanryouLead() {
    return CommonUtils.packedDecimalToNumber(getS181aKasouKanryouLeadBytes());
  }

  public void setS181aKasouKanryouLead(long arg) {
  setS181aKasouKanryouLeadBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS181aTokkiJikouBytes() {
    return s181aTokkiJikou;
  }

  public void setS181aTokkiJikouBytes(byte[] arg) {
    s181aTokkiJikou = ArrayUtils.clone(arg);
  }

  public void initS181aTokkiJikou() {
    s181aTokkiJikou =CommonUtils.stringToBytes(StringUtils.repeat(" ", 20));
  }

  public String getS181aTokkiJikou() {
  return CommonUtils.bytesToString(getS181aTokkiJikouBytes());
  }

  public void setS181aTokkiJikou(String arg) {
  final int trailing_length = 20 - arg.length();
  if (trailing_length > 0) {
  setS181aTokkiJikouBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aTokkiJikouBytes(CommonUtils.stringToBytes(arg.substring(0, 20)));
  }
  }

  public byte[] getS181aActSchKeyBytes() {
    return s181aActSchKey;
  }

  public void setS181aActSchKeyBytes(byte[] arg) {
    s181aActSchKey = ArrayUtils.clone(arg);
  }

  public void initS181aActSchKey() {
    s181aActSchKey =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aActSchKey() {
  return CommonUtils.bytesToString(getS181aActSchKeyBytes());
  }

  public void setS181aActSchKey(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aActSchKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aActSchKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aActSeqNoBytes() {
    return s181aActSeqNo;
  }

  public void setS181aActSeqNoBytes(byte[] arg) {
    s181aActSeqNo = ArrayUtils.clone(arg);
  }

  public void initS181aActSeqNo() {
    s181aActSeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));
  }

  public String getS181aActSeqNo() {
  return CommonUtils.bytesToString(getS181aActSeqNoBytes());
  }

  public void setS181aActSeqNo(String arg) {
  final int trailing_length = 10 - arg.length();
  if (trailing_length > 0) {
  setS181aActSeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aActSeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 10)));
  }
  }

  public byte[] getS181aShataiReActSeqNoBytes() {
    return s181aShataiReActSeqNo;
  }

  public void setS181aShataiReActSeqNoBytes(byte[] arg) {
    s181aShataiReActSeqNo = ArrayUtils.clone(arg);
  }

  public void initS181aShataiReActSeqNo() {
    s181aShataiReActSeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getS181aShataiReActSeqNo() {
  return CommonUtils.bytesToString(getS181aShataiReActSeqNoBytes());
  }

  public void setS181aShataiReActSeqNo(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setS181aShataiReActSeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aShataiReActSeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getS181aFinalReActSeqNoBytes() {
    return s181aFinalReActSeqNo;
  }

  public void setS181aFinalReActSeqNoBytes(byte[] arg) {
    s181aFinalReActSeqNo = ArrayUtils.clone(arg);
  }

  public void initS181aFinalReActSeqNo() {
    s181aFinalReActSeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getS181aFinalReActSeqNo() {
  return CommonUtils.bytesToString(getS181aFinalReActSeqNoBytes());
  }

  public void setS181aFinalReActSeqNo(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setS181aFinalReActSeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aFinalReActSeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getS181aTrimSeqNoBytes() {
    return s181aTrimSeqNo;
  }

  public void setS181aTrimSeqNoBytes(byte[] arg) {
    s181aTrimSeqNo = ArrayUtils.clone(arg);
  }

  public void initS181aTrimSeqNo() {
    s181aTrimSeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS181aTrimSeqNo() {
  return CommonUtils.bytesToString(getS181aTrimSeqNoBytes());
  }

  public void setS181aTrimSeqNo(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aTrimSeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aTrimSeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aOfflineSeqNoBytes() {
    return s181aOfflineSeqNo;
  }

  public void setS181aOfflineSeqNoBytes(byte[] arg) {
    s181aOfflineSeqNo = ArrayUtils.clone(arg);
  }

  public void initS181aOfflineSeqNo() {
    s181aOfflineSeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS181aOfflineSeqNo() {
  return CommonUtils.bytesToString(getS181aOfflineSeqNoBytes());
  }

  public void setS181aOfflineSeqNo(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aOfflineSeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aOfflineSeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aKankenYmdBytes() {
    return s181aKankenYmd;
  }

  public void setS181aKankenYmdBytes(byte[] arg) {
    s181aKankenYmd = ArrayUtils.clone(arg);
  }

  public void initS181aKankenYmd() {
    s181aKankenYmd =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS181aKankenYmd() {
  return CommonUtils.bytesToString(getS181aKankenYmdBytes());
  }

  public void setS181aKankenYmd(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aKankenYmdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aKankenYmdBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aMsOfflineYmdBytes() {
    return s181aMsOfflineYmd;
  }

  public void setS181aMsOfflineYmdBytes(byte[] arg) {
    s181aMsOfflineYmd = ArrayUtils.clone(arg);
  }

  public void initS181aMsOfflineYmd() {
    s181aMsOfflineYmd =CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));
  }

  public String getS181aMsOfflineYmd() {
  return CommonUtils.bytesToString(getS181aMsOfflineYmdBytes());
  }

  public void setS181aMsOfflineYmd(String arg) {
  final int trailing_length = 10 - arg.length();
  if (trailing_length > 0) {
  setS181aMsOfflineYmdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aMsOfflineYmdBytes(CommonUtils.stringToBytes(arg.substring(0, 10)));
  }
  }

  public byte[] getS181aSymTokushushaBytes() {
    return s181aSymTokushusha;
  }

  public void setS181aSymTokushushaBytes(byte[] arg) {
    s181aSymTokushusha = ArrayUtils.clone(arg);
  }

  public void initS181aSymTokushusha() {
    s181aSymTokushusha =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTokushusha() {
  return CommonUtils.bytesToString(getS181aSymTokushushaBytes());
  }

  public void setS181aSymTokushusha(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTokushushaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTokushushaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymKouteiKeikakuGaiBytes() {
    return s181aSymKouteiKeikakuGai;
  }

  public void setS181aSymKouteiKeikakuGaiBytes(byte[] arg) {
    s181aSymKouteiKeikakuGai = ArrayUtils.clone(arg);
  }

  public void initS181aSymKouteiKeikakuGai() {
    s181aSymKouteiKeikakuGai =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymKouteiKeikakuGai() {
  return CommonUtils.bytesToString(getS181aSymKouteiKeikakuGaiBytes());
  }

  public void setS181aSymKouteiKeikakuGai(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymKouteiKeikakuGaiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymKouteiKeikakuGaiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymZaikoZumiBytes() {
    return s181aSymZaikoZumi;
  }

  public void setS181aSymZaikoZumiBytes(byte[] arg) {
    s181aSymZaikoZumi = ArrayUtils.clone(arg);
  }

  public void initS181aSymZaikoZumi() {
    s181aSymZaikoZumi =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymZaikoZumi() {
  return CommonUtils.bytesToString(getS181aSymZaikoZumiBytes());
  }

  public void setS181aSymZaikoZumi(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymZaikoZumiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymZaikoZumiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymGyakubarashiGaiBytes() {
    return s181aSymGyakubarashiGai;
  }

  public void setS181aSymGyakubarashiGaiBytes(byte[] arg) {
    s181aSymGyakubarashiGai = ArrayUtils.clone(arg);
  }

  public void initS181aSymGyakubarashiGai() {
    s181aSymGyakubarashiGai =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymGyakubarashiGai() {
  return CommonUtils.bytesToString(getS181aSymGyakubarashiGaiBytes());
  }

  public void setS181aSymGyakubarashiGai(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymGyakubarashiGaiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymGyakubarashiGaiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymSenkouMiGaiBytes() {
    return s181aSymSenkouMiGai;
  }

  public void setS181aSymSenkouMiGaiBytes(byte[] arg) {
    s181aSymSenkouMiGai = ArrayUtils.clone(arg);
  }

  public void initS181aSymSenkouMiGai() {
    s181aSymSenkouMiGai =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymSenkouMiGai() {
  return CommonUtils.bytesToString(getS181aSymSenkouMiGaiBytes());
  }

  public void setS181aSymSenkouMiGai(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymSenkouMiGaiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymSenkouMiGaiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymGroupSenkouMiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(18);
        buffer.put(getS181aSymSmDaihyouBytes());
        for (int x = 0; x < 17; x++) {
        buffer.put(getS181aSymSmKouteiBytes(x));
        }
    return buffer.array();
  }

  public void setS181aSymGroupSenkouMiBytes(byte[] arg) {
        setS181aSymSmDaihyouBytes(ArrayUtils.subarray(arg, 0, 1));
        for (int x = 0; x < 17; x++) {
        setS181aSymSmKouteiBytes(x, ArrayUtils.subarray(arg, 1 + 1 * x, 1 + 1 * (x + 1)));
        }
  }

  public void initS181aSymGroupSenkouMi() {
        initS181aSymSmDaihyou();
        for (int x = 0; x < 17; x++) {
        initS181aSymSmKoutei(x);
        }
  }

  public String getS181aSymGroupSenkouMi() {
  return CommonUtils.bytesToString(getS181aSymGroupSenkouMiBytes());
  }

  public void setS181aSymGroupSenkouMi(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setS181aSymGroupSenkouMiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymGroupSenkouMiBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getS181aSymSmDaihyouBytes() {
    return s181aSymSmDaihyou;
  }

  public void setS181aSymSmDaihyouBytes(byte[] arg) {
    s181aSymSmDaihyou = ArrayUtils.clone(arg);
  }

  public void initS181aSymSmDaihyou() {
    s181aSymSmDaihyou =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymSmDaihyou() {
  return CommonUtils.bytesToString(getS181aSymSmDaihyouBytes());
  }

  public void setS181aSymSmDaihyou(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymSmDaihyouBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymSmDaihyouBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymSmKouteiBytes(int a) {
    return s181aSymSmKoutei[a];
  }

  public void setS181aSymSmKouteiBytes(int a,byte[] arg) {
    s181aSymSmKoutei[a] = ArrayUtils.clone(arg);
  }

  public void initS181aSymSmKoutei(int a) {
    s181aSymSmKoutei[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymSmKoutei(int a) {
  return CommonUtils.bytesToString(getS181aSymSmKouteiBytes(a));
  }

  public void setS181aSymSmKoutei(int a,String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymSmKouteiBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymSmKouteiBytes(a,CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymZengetsuJissekiBytes(int a) {
    return s181aSymZengetsuJisseki[a];
  }

  public void setS181aSymZengetsuJissekiBytes(int a,byte[] arg) {
    s181aSymZengetsuJisseki[a] = ArrayUtils.clone(arg);
  }

  public void initS181aSymZengetsuJisseki(int a) {
    s181aSymZengetsuJisseki[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymZengetsuJisseki(int a) {
  return CommonUtils.bytesToString(getS181aSymZengetsuJissekiBytes(a));
  }

  public void setS181aSymZengetsuJisseki(int a,String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymZengetsuJissekiBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymZengetsuJissekiBytes(a,CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymTokkyuLabelBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getS181aSymTlMetalBytes());
        buffer.put(getS181aSymTlShitaPBytes());
        buffer.put(getS181aSymTlNakaPBytes());
        buffer.put(getS181aSymTlPaintBytes());
        buffer.put(getS181aSymTlFinalBytes());
        buffer.put(getS181aSymTlDelivBytes());
    return buffer.array();
  }

  public void setS181aSymTokkyuLabelBytes(byte[] arg) {
        setS181aSymTlMetalBytes(ArrayUtils.subarray(arg, 0, 1));
        setS181aSymTlShitaPBytes(ArrayUtils.subarray(arg, 1, 2));
        setS181aSymTlNakaPBytes(ArrayUtils.subarray(arg, 2, 3));
        setS181aSymTlPaintBytes(ArrayUtils.subarray(arg, 3, 4));
        setS181aSymTlFinalBytes(ArrayUtils.subarray(arg, 4, 5));
        setS181aSymTlDelivBytes(ArrayUtils.subarray(arg, 5, 6));
  }

  public void initS181aSymTokkyuLabel() {
        initS181aSymTlMetal();
        initS181aSymTlShitaP();
        initS181aSymTlNakaP();
        initS181aSymTlPaint();
        initS181aSymTlFinal();
        initS181aSymTlDeliv();
  }

  public String getS181aSymTokkyuLabel() {
  return CommonUtils.bytesToString(getS181aSymTokkyuLabelBytes());
  }

  public void setS181aSymTokkyuLabel(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTokkyuLabelBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTokkyuLabelBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS181aSymTlMetalBytes() {
    return s181aSymTlMetal;
  }

  public void setS181aSymTlMetalBytes(byte[] arg) {
    s181aSymTlMetal = ArrayUtils.clone(arg);
  }

  public void initS181aSymTlMetal() {
    s181aSymTlMetal =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTlMetal() {
  return CommonUtils.bytesToString(getS181aSymTlMetalBytes());
  }

  public void setS181aSymTlMetal(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTlMetalBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTlMetalBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymTlShitaPBytes() {
    return s181aSymTlShitaP;
  }

  public void setS181aSymTlShitaPBytes(byte[] arg) {
    s181aSymTlShitaP = ArrayUtils.clone(arg);
  }

  public void initS181aSymTlShitaP() {
    s181aSymTlShitaP =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTlShitaP() {
  return CommonUtils.bytesToString(getS181aSymTlShitaPBytes());
  }

  public void setS181aSymTlShitaP(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTlShitaPBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTlShitaPBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymTlNakaPBytes() {
    return s181aSymTlNakaP;
  }

  public void setS181aSymTlNakaPBytes(byte[] arg) {
    s181aSymTlNakaP = ArrayUtils.clone(arg);
  }

  public void initS181aSymTlNakaP() {
    s181aSymTlNakaP =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTlNakaP() {
  return CommonUtils.bytesToString(getS181aSymTlNakaPBytes());
  }

  public void setS181aSymTlNakaP(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTlNakaPBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTlNakaPBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymTlPaintBytes() {
    return s181aSymTlPaint;
  }

  public void setS181aSymTlPaintBytes(byte[] arg) {
    s181aSymTlPaint = ArrayUtils.clone(arg);
  }

  public void initS181aSymTlPaint() {
    s181aSymTlPaint =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTlPaint() {
  return CommonUtils.bytesToString(getS181aSymTlPaintBytes());
  }

  public void setS181aSymTlPaint(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTlPaintBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTlPaintBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymTlFinalBytes() {
    return s181aSymTlFinal;
  }

  public void setS181aSymTlFinalBytes(byte[] arg) {
    s181aSymTlFinal = ArrayUtils.clone(arg);
  }

  public void initS181aSymTlFinal() {
    s181aSymTlFinal =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTlFinal() {
  return CommonUtils.bytesToString(getS181aSymTlFinalBytes());
  }

  public void setS181aSymTlFinal(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTlFinalBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTlFinalBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymTlDelivBytes() {
    return s181aSymTlDeliv;
  }

  public void setS181aSymTlDelivBytes(byte[] arg) {
    s181aSymTlDeliv = ArrayUtils.clone(arg);
  }

  public void initS181aSymTlDeliv() {
    s181aSymTlDeliv =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymTlDeliv() {
  return CommonUtils.bytesToString(getS181aSymTlDelivBytes());
  }

  public void setS181aSymTlDeliv(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymTlDelivBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymTlDelivBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aPipeLineItemBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(5);
        buffer.put(getS181aSymPipeLineGaiBytes());
        buffer.put(getS181aSymPipeLineZumiBytes());
        buffer.put(getS181aSymKeikakuMiteiBytes());
        buffer.put(getS181aSeisanHoushikiBytes());
        buffer.put(getS181aSymShisakuShaBytes());
    return buffer.array();
  }

  public void setS181aPipeLineItemBytes(byte[] arg) {
        setS181aSymPipeLineGaiBytes(ArrayUtils.subarray(arg, 0, 1));
        setS181aSymPipeLineZumiBytes(ArrayUtils.subarray(arg, 1, 2));
        setS181aSymKeikakuMiteiBytes(ArrayUtils.subarray(arg, 2, 3));
        setS181aSeisanHoushikiBytes(ArrayUtils.subarray(arg, 3, 4));
        setS181aSymShisakuShaBytes(ArrayUtils.subarray(arg, 4, 5));
  }

  public void initS181aPipeLineItem() {
        initS181aSymPipeLineGai();
        initS181aSymPipeLineZumi();
        initS181aSymKeikakuMitei();
        initS181aSeisanHoushiki();
        initS181aSymShisakuSha();
  }

  public String getS181aPipeLineItem() {
  return CommonUtils.bytesToString(getS181aPipeLineItemBytes());
  }

  public void setS181aPipeLineItem(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setS181aPipeLineItemBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aPipeLineItemBytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getS181aSymPipeLineGaiBytes() {
    return s181aSymPipeLineGai;
  }

  public void setS181aSymPipeLineGaiBytes(byte[] arg) {
    s181aSymPipeLineGai = ArrayUtils.clone(arg);
  }

  public void initS181aSymPipeLineGai() {
    s181aSymPipeLineGai =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymPipeLineGai() {
  return CommonUtils.bytesToString(getS181aSymPipeLineGaiBytes());
  }

  public void setS181aSymPipeLineGai(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymPipeLineGaiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymPipeLineGaiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymPipeLineZumiBytes() {
    return s181aSymPipeLineZumi;
  }

  public void setS181aSymPipeLineZumiBytes(byte[] arg) {
    s181aSymPipeLineZumi = ArrayUtils.clone(arg);
  }

  public void initS181aSymPipeLineZumi() {
    s181aSymPipeLineZumi =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymPipeLineZumi() {
  return CommonUtils.bytesToString(getS181aSymPipeLineZumiBytes());
  }

  public void setS181aSymPipeLineZumi(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymPipeLineZumiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymPipeLineZumiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymKeikakuMiteiBytes() {
    return s181aSymKeikakuMitei;
  }

  public void setS181aSymKeikakuMiteiBytes(byte[] arg) {
    s181aSymKeikakuMitei = ArrayUtils.clone(arg);
  }

  public void initS181aSymKeikakuMitei() {
    s181aSymKeikakuMitei =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymKeikakuMitei() {
  return CommonUtils.bytesToString(getS181aSymKeikakuMiteiBytes());
  }

  public void setS181aSymKeikakuMitei(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymKeikakuMiteiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymKeikakuMiteiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSeisanHoushikiBytes() {
    return s181aSeisanHoushiki;
  }

  public void setS181aSeisanHoushikiBytes(byte[] arg) {
    s181aSeisanHoushiki = ArrayUtils.clone(arg);
  }

  public void initS181aSeisanHoushiki() {
    s181aSeisanHoushiki =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSeisanHoushiki() {
  return CommonUtils.bytesToString(getS181aSeisanHoushikiBytes());
  }

  public void setS181aSeisanHoushiki(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSeisanHoushikiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSeisanHoushikiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymShisakuShaBytes() {
    return s181aSymShisakuSha;
  }

  public void setS181aSymShisakuShaBytes(byte[] arg) {
    s181aSymShisakuSha = ArrayUtils.clone(arg);
  }

  public void initS181aSymShisakuSha() {
    s181aSymShisakuSha =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymShisakuSha() {
  return CommonUtils.bytesToString(getS181aSymShisakuShaBytes());
  }

  public void setS181aSymShisakuSha(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymShisakuShaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymShisakuShaBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSymGyakuYunyuuBytes() {
    return s181aSymGyakuYunyuu;
  }

  public void setS181aSymGyakuYunyuuBytes(byte[] arg) {
    s181aSymGyakuYunyuu = ArrayUtils.clone(arg);
  }

  public void initS181aSymGyakuYunyuu() {
    s181aSymGyakuYunyuu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymGyakuYunyuu() {
  return CommonUtils.bytesToString(getS181aSymGyakuYunyuuBytes());
  }

  public void setS181aSymGyakuYunyuu(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymGyakuYunyuuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymGyakuYunyuuBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aHyoujiGenzaichiBytes() {
    return s181aHyoujiGenzaichi;
  }

  public void setS181aHyoujiGenzaichiBytes(byte[] arg) {
    s181aHyoujiGenzaichi = ArrayUtils.clone(arg);
  }

  public void initS181aHyoujiGenzaichi() {
    s181aHyoujiGenzaichi =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aHyoujiGenzaichi() {
  return CommonUtils.bytesToString(getS181aHyoujiGenzaichiBytes());
  }

  public void setS181aHyoujiGenzaichi(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aHyoujiGenzaichiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aHyoujiGenzaichiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSalesSpec10Bytes() {
    return s181aSalesSpec10;
  }

  public void setS181aSalesSpec10Bytes(byte[] arg) {
    s181aSalesSpec10 = ArrayUtils.clone(arg);
  }

  public void initS181aSalesSpec10() {
    s181aSalesSpec10 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));
  }

  public String getS181aSalesSpec10() {
  return CommonUtils.bytesToString(getS181aSalesSpec10Bytes());
  }

  public void setS181aSalesSpec10(String arg) {
  final int trailing_length = 10 - arg.length();
  if (trailing_length > 0) {
  setS181aSalesSpec10Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSalesSpec10Bytes(CommonUtils.stringToBytes(arg.substring(0, 10)));
  }
  }

  public byte[] getS181aLocalAreaBytes() {
    return s181aLocalArea;
  }

  public void setS181aLocalAreaBytes(byte[] arg) {
    s181aLocalArea = ArrayUtils.clone(arg);
  }

  public void initS181aLocalArea() {
    s181aLocalArea =CommonUtils.stringToBytes(StringUtils.repeat(" ", 50));
  }

  public String getS181aLocalArea() {
  return CommonUtils.bytesToString(getS181aLocalAreaBytes());
  }

  public void setS181aLocalArea(String arg) {
  final int trailing_length = 50 - arg.length();
  if (trailing_length > 0) {
  setS181aLocalAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aLocalAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 50)));
  }
  }

  public byte[] getS181aTimeStampBytes() {
    return s181aTimeStamp;
  }

  public void setS181aTimeStampBytes(byte[] arg) {
    s181aTimeStamp = ArrayUtils.clone(arg);
  }

  public void initS181aTimeStamp() {
    s181aTimeStamp =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getS181aTimeStamp() {
  return CommonUtils.bytesToString(getS181aTimeStampBytes());
  }

  public void setS181aTimeStamp(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS181aTimeStampBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aTimeStampBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS181aDelivEigyouHizukeBytes() {
    return s181aDelivEigyouHizuke;
  }

  public void setS181aDelivEigyouHizukeBytes(byte[] arg) {
    s181aDelivEigyouHizuke = ArrayUtils.clone(arg);
  }

  public void initS181aDelivEigyouHizuke() {
    s181aDelivEigyouHizuke =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getS181aDelivEigyouHizuke() {
    return CommonUtils.packedDecimalToNumber(getS181aDelivEigyouHizukeBytes());
  }

  public void setS181aDelivEigyouHizuke(long arg) {
  setS181aDelivEigyouHizukeBytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getS181aSymHanedashiBytes() {
    return s181aSymHanedashi;
  }

  public void setS181aSymHanedashiBytes(byte[] arg) {
    s181aSymHanedashi = ArrayUtils.clone(arg);
  }

  public void initS181aSymHanedashi() {
    s181aSymHanedashi =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSymHanedashi() {
  return CommonUtils.bytesToString(getS181aSymHanedashiBytes());
  }

  public void setS181aSymHanedashi(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSymHanedashiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSymHanedashiBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS181aSeihinKubunBytes() {
    return s181aSeihinKubun;
  }

  public void setS181aSeihinKubunBytes(byte[] arg) {
    s181aSeihinKubun = ArrayUtils.clone(arg);
  }

  public void initS181aSeihinKubun() {
    s181aSeihinKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS181aSeihinKubun() {
  return CommonUtils.bytesToString(getS181aSeihinKubunBytes());
  }

  public void setS181aSeihinKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS181aSeihinKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS181aSeihinKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getShiyou182Cr02Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(496);
        buffer.put(getResponseCodecr02Bytes());
        buffer.put(getRecordBufcr02Bytes());
    return buffer.array();
  }

  public void setShiyou182Cr02Bytes(byte[] arg) {
        setResponseCodecr02Bytes(ArrayUtils.subarray(arg, 0, 2));
        setRecordBufcr02Bytes(ArrayUtils.subarray(arg, 2, 496));
  }

  public void initShiyou182Cr02() {
        initResponseCodecr02();
        initRecordBufcr02();
  }

  public String getShiyou182Cr02() {
  return CommonUtils.bytesToString(getShiyou182Cr02Bytes());
  }

  public void setShiyou182Cr02(String arg) {
  final int trailing_length = 496 - arg.length();
  if (trailing_length > 0) {
  setShiyou182Cr02Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setShiyou182Cr02Bytes(CommonUtils.stringToBytes(arg.substring(0, 496)));
  }
  }

  public byte[] getResponseCodecr02Bytes() {
    return responseCodecr02;
  }

  public void setResponseCodecr02Bytes(byte[] arg) {
    responseCodecr02 = ArrayUtils.clone(arg);
  }

  public void initResponseCodecr02() {
    responseCodecr02 =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodecr02() {
    return CommonUtils.binaryToNumber(getResponseCodecr02Bytes());
  }

  public void setResponseCodecr02(long arg) {
  setResponseCodecr02Bytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getRecordBufcr02Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(494);
        buffer.put(getS182aKoujouKubunBytes());
        buffer.put(getS182aModelBytes());
        buffer.put(getS182aColorUchibariExBytes());
        buffer.put(getS182aLineTrimBytes());
        buffer.put(getS182aKokuyuKubunBytes());
        buffer.put(getS182aYymmBytes());
        buffer.put(getS182aKouteiIdBytes());
        buffer.put(getS182aJissekiBytes());
        buffer.put(getS182aKeikakuBytes());
        buffer.put(getS182aIkanBytes());
        buffer.put(getS182aShikyuuBytes());
        buffer.put(getS182aMikenZaikoBytes());
        buffer.put(getS182aKankenZaikoBytes());
    return buffer.array();
  }

  public void setRecordBufcr02Bytes(byte[] arg) {
        setS182aKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setS182aModelBytes(ArrayUtils.subarray(arg, 1, 19));
        setS182aColorUchibariExBytes(ArrayUtils.subarray(arg, 19, 28));
        setS182aLineTrimBytes(ArrayUtils.subarray(arg, 28, 29));
        setS182aKokuyuKubunBytes(ArrayUtils.subarray(arg, 29, 30));
        setS182aYymmBytes(ArrayUtils.subarray(arg, 30, 34));
        setS182aKouteiIdBytes(ArrayUtils.subarray(arg, 34, 36));
        setS182aJissekiBytes(ArrayUtils.subarray(arg, 36, 247));
        setS182aKeikakuBytes(ArrayUtils.subarray(arg, 247, 464));
        setS182aIkanBytes(ArrayUtils.subarray(arg, 464, 473));
        setS182aShikyuuBytes(ArrayUtils.subarray(arg, 473, 482));
        setS182aMikenZaikoBytes(ArrayUtils.subarray(arg, 482, 488));
        setS182aKankenZaikoBytes(ArrayUtils.subarray(arg, 488, 494));
  }

  public void initRecordBufcr02() {
        initS182aKoujouKubun();
        initS182aModel();
        initS182aColorUchibariEx();
        initS182aLineTrim();
        initS182aKokuyuKubun();
        initS182aYymm();
        initS182aKouteiId();
        initS182aJisseki();
        initS182aKeikaku();
        initS182aIkan();
        initS182aShikyuu();
        initS182aMikenZaiko();
        initS182aKankenZaiko();
  }

  public String getRecordBufcr02() {
  return CommonUtils.bytesToString(getRecordBufcr02Bytes());
  }

  public void setRecordBufcr02(String arg) {
  final int trailing_length = 494 - arg.length();
  if (trailing_length > 0) {
  setRecordBufcr02Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setRecordBufcr02Bytes(CommonUtils.stringToBytes(arg.substring(0, 494)));
  }
  }

  public byte[] getS182aKoujouKubunBytes() {
    return s182aKoujouKubun;
  }

  public void setS182aKoujouKubunBytes(byte[] arg) {
    s182aKoujouKubun = ArrayUtils.clone(arg);
  }

  public void initS182aKoujouKubun() {
    s182aKoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS182aKoujouKubun() {
  return CommonUtils.bytesToString(getS182aKoujouKubunBytes());
  }

  public void setS182aKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS182aKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS182aModelBytes() {
    return s182aModel;
  }

  public void setS182aModelBytes(byte[] arg) {
    s182aModel = ArrayUtils.clone(arg);
  }

  public void initS182aModel() {
    s182aModel =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getS182aModel() {
  return CommonUtils.bytesToString(getS182aModelBytes());
  }

  public void setS182aModel(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setS182aModelBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aModelBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getS182aColorUchibariExBytes() {
    return s182aColorUchibariEx;
  }

  public void setS182aColorUchibariExBytes(byte[] arg) {
    s182aColorUchibariEx = ArrayUtils.clone(arg);
  }

  public void initS182aColorUchibariEx() {
    s182aColorUchibariEx =CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));
  }

  public String getS182aColorUchibariEx() {
  return CommonUtils.bytesToString(getS182aColorUchibariExBytes());
  }

  public void setS182aColorUchibariEx(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setS182aColorUchibariExBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aColorUchibariExBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getS182aLineTrimBytes() {
    return s182aLineTrim;
  }

  public void setS182aLineTrimBytes(byte[] arg) {
    s182aLineTrim = ArrayUtils.clone(arg);
  }

  public void initS182aLineTrim() {
    s182aLineTrim =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS182aLineTrim() {
  return CommonUtils.bytesToString(getS182aLineTrimBytes());
  }

  public void setS182aLineTrim(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS182aLineTrimBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aLineTrimBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS182aKokuyuKubunBytes() {
    return s182aKokuyuKubun;
  }

  public void setS182aKokuyuKubunBytes(byte[] arg) {
    s182aKokuyuKubun = ArrayUtils.clone(arg);
  }

  public void initS182aKokuyuKubun() {
    s182aKokuyuKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS182aKokuyuKubun() {
  return CommonUtils.bytesToString(getS182aKokuyuKubunBytes());
  }

  public void setS182aKokuyuKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS182aKokuyuKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKokuyuKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS182aYymmBytes() {
    return s182aYymm;
  }

  public void setS182aYymmBytes(byte[] arg) {
    s182aYymm = ArrayUtils.clone(arg);
  }

  public void initS182aYymm() {
    s182aYymm =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS182aYymm() {
  return CommonUtils.bytesToString(getS182aYymmBytes());
  }

  public void setS182aYymm(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS182aYymmBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aYymmBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS182aKouteiIdBytes() {
    return s182aKouteiId;
  }

  public void setS182aKouteiIdBytes(byte[] arg) {
    s182aKouteiId = ArrayUtils.clone(arg);
  }

  public void initS182aKouteiId() {
    s182aKouteiId =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS182aKouteiId() {
  return CommonUtils.bytesToString(getS182aKouteiIdBytes());
  }

  public void setS182aKouteiId(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS182aKouteiIdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKouteiIdBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS182aJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(211);
        buffer.put(getS182aJissekiZengetsuBytes());
        buffer.put(getS182aJissekiTougetsuBytes());
        buffer.put(getS182aJissekiJigetsuBytes());
    return buffer.array();
  }

  public void setS182aJissekiBytes(byte[] arg) {
        setS182aJissekiZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS182aJissekiTougetsuBytes(ArrayUtils.subarray(arg, 3, 129));
        setS182aJissekiJigetsuBytes(ArrayUtils.subarray(arg, 129, 211));
  }

  public void initS182aJisseki() {
        initS182aJissekiZengetsu();
        initS182aJissekiTougetsu();
        initS182aJissekiJigetsu();
  }

  public String getS182aJisseki() {
  return CommonUtils.bytesToString(getS182aJissekiBytes());
  }

  public void setS182aJisseki(String arg) {
  final int trailing_length = 211 - arg.length();
  if (trailing_length > 0) {
  setS182aJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 211)));
  }
  }

  public byte[] getS182aJissekiZengetsuBytes() {
    return s182aJissekiZengetsu;
  }

  public void setS182aJissekiZengetsuBytes(byte[] arg) {
    s182aJissekiZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aJissekiZengetsu() {
    s182aJissekiZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aJissekiZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aJissekiZengetsuBytes());
  }

  public void setS182aJissekiZengetsu(long arg) {
  setS182aJissekiZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aJissekiTougetsuBytes() {
    return s182aJissekiTougetsu;
  }

  public void setS182aJissekiTougetsuBytes(byte[] arg) {
    s182aJissekiTougetsu = ArrayUtils.clone(arg);
  }

  public void initS182aJissekiTougetsu() {
    s182aJissekiTougetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));
  }

  public String getS182aJissekiTougetsu() {
  return CommonUtils.bytesToString(getS182aJissekiTougetsuBytes());
  }

  public void setS182aJissekiTougetsu(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setS182aJissekiTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aJissekiTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getS182aJissekiJigetsuBytes() {
    return s182aJissekiJigetsu;
  }

  public void setS182aJissekiJigetsuBytes(byte[] arg) {
    s182aJissekiJigetsu = ArrayUtils.clone(arg);
  }

  public void initS182aJissekiJigetsu() {
    s182aJissekiJigetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));
  }

  public String getS182aJissekiJigetsu() {
  return CommonUtils.bytesToString(getS182aJissekiJigetsuBytes());
  }

  public void setS182aJissekiJigetsu(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setS182aJissekiJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aJissekiJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getS182aKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(217);
        buffer.put(getS182aRuisaZenZengetsuBytes());
        buffer.put(getS182aKeikakuZengetsuBytes());
        buffer.put(getS182aRuisaZengetsuBytes());
        buffer.put(getS182aKeikakuTougetsuBytes());
        buffer.put(getS182aKeikakuJigetsuBytes());
    return buffer.array();
  }

  public void setS182aKeikakuBytes(byte[] arg) {
        setS182aRuisaZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS182aKeikakuZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setS182aRuisaZengetsuBytes(ArrayUtils.subarray(arg, 6, 9));
        setS182aKeikakuTougetsuBytes(ArrayUtils.subarray(arg, 9, 135));
        setS182aKeikakuJigetsuBytes(ArrayUtils.subarray(arg, 135, 217));
  }

  public void initS182aKeikaku() {
        initS182aRuisaZenZengetsu();
        initS182aKeikakuZengetsu();
        initS182aRuisaZengetsu();
        initS182aKeikakuTougetsu();
        initS182aKeikakuJigetsu();
  }

  public String getS182aKeikaku() {
  return CommonUtils.bytesToString(getS182aKeikakuBytes());
  }

  public void setS182aKeikaku(String arg) {
  final int trailing_length = 217 - arg.length();
  if (trailing_length > 0) {
  setS182aKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 217)));
  }
  }

  public byte[] getS182aRuisaZenZengetsuBytes() {
    return s182aRuisaZenZengetsu;
  }

  public void setS182aRuisaZenZengetsuBytes(byte[] arg) {
    s182aRuisaZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aRuisaZenZengetsu() {
    s182aRuisaZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aRuisaZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aRuisaZenZengetsuBytes());
  }

  public void setS182aRuisaZenZengetsu(long arg) {
  setS182aRuisaZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aKeikakuZengetsuBytes() {
    return s182aKeikakuZengetsu;
  }

  public void setS182aKeikakuZengetsuBytes(byte[] arg) {
    s182aKeikakuZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aKeikakuZengetsu() {
    s182aKeikakuZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aKeikakuZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aKeikakuZengetsuBytes());
  }

  public void setS182aKeikakuZengetsu(long arg) {
  setS182aKeikakuZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aRuisaZengetsuBytes() {
    return s182aRuisaZengetsu;
  }

  public void setS182aRuisaZengetsuBytes(byte[] arg) {
    s182aRuisaZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aRuisaZengetsu() {
    s182aRuisaZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aRuisaZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aRuisaZengetsuBytes());
  }

  public void setS182aRuisaZengetsu(long arg) {
  setS182aRuisaZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aKeikakuTougetsuBytes() {
    return s182aKeikakuTougetsu;
  }

  public void setS182aKeikakuTougetsuBytes(byte[] arg) {
    s182aKeikakuTougetsu = ArrayUtils.clone(arg);
  }

  public void initS182aKeikakuTougetsu() {
    s182aKeikakuTougetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));
  }

  public String getS182aKeikakuTougetsu() {
  return CommonUtils.bytesToString(getS182aKeikakuTougetsuBytes());
  }

  public void setS182aKeikakuTougetsu(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setS182aKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getS182aKeikakuJigetsuBytes() {
    return s182aKeikakuJigetsu;
  }

  public void setS182aKeikakuJigetsuBytes(byte[] arg) {
    s182aKeikakuJigetsu = ArrayUtils.clone(arg);
  }

  public void initS182aKeikakuJigetsu() {
    s182aKeikakuJigetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));
  }

  public String getS182aKeikakuJigetsu() {
  return CommonUtils.bytesToString(getS182aKeikakuJigetsuBytes());
  }

  public void setS182aKeikakuJigetsu(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setS182aKeikakuJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKeikakuJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getS182aIkanBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getS182aIkanZengetsuBytes());
        buffer.put(getS182aIkanTougetsuBytes());
        buffer.put(getS182aIkanJigetsuBytes());
    return buffer.array();
  }

  public void setS182aIkanBytes(byte[] arg) {
        setS182aIkanZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS182aIkanTougetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setS182aIkanJigetsuBytes(ArrayUtils.subarray(arg, 6, 9));
  }

  public void initS182aIkan() {
        initS182aIkanZengetsu();
        initS182aIkanTougetsu();
        initS182aIkanJigetsu();
  }

  public String getS182aIkan() {
  return CommonUtils.bytesToString(getS182aIkanBytes());
  }

  public void setS182aIkan(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setS182aIkanBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aIkanBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getS182aIkanZengetsuBytes() {
    return s182aIkanZengetsu;
  }

  public void setS182aIkanZengetsuBytes(byte[] arg) {
    s182aIkanZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aIkanZengetsu() {
    s182aIkanZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aIkanZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aIkanZengetsuBytes());
  }

  public void setS182aIkanZengetsu(long arg) {
  setS182aIkanZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aIkanTougetsuBytes() {
    return s182aIkanTougetsu;
  }

  public void setS182aIkanTougetsuBytes(byte[] arg) {
    s182aIkanTougetsu = ArrayUtils.clone(arg);
  }

  public void initS182aIkanTougetsu() {
    s182aIkanTougetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aIkanTougetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aIkanTougetsuBytes());
  }

  public void setS182aIkanTougetsu(long arg) {
  setS182aIkanTougetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aIkanJigetsuBytes() {
    return s182aIkanJigetsu;
  }

  public void setS182aIkanJigetsuBytes(byte[] arg) {
    s182aIkanJigetsu = ArrayUtils.clone(arg);
  }

  public void initS182aIkanJigetsu() {
    s182aIkanJigetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aIkanJigetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aIkanJigetsuBytes());
  }

  public void setS182aIkanJigetsu(long arg) {
  setS182aIkanJigetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aShikyuuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(9);
        buffer.put(getS182aShikyuuZengetsuBytes());
        buffer.put(getS182aShikyuuTougetsuBytes());
        buffer.put(getS182aShikyuuJigetsuBytes());
    return buffer.array();
  }

  public void setS182aShikyuuBytes(byte[] arg) {
        setS182aShikyuuZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS182aShikyuuTougetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setS182aShikyuuJigetsuBytes(ArrayUtils.subarray(arg, 6, 9));
  }

  public void initS182aShikyuu() {
        initS182aShikyuuZengetsu();
        initS182aShikyuuTougetsu();
        initS182aShikyuuJigetsu();
  }

  public String getS182aShikyuu() {
  return CommonUtils.bytesToString(getS182aShikyuuBytes());
  }

  public void setS182aShikyuu(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setS182aShikyuuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aShikyuuBytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getS182aShikyuuZengetsuBytes() {
    return s182aShikyuuZengetsu;
  }

  public void setS182aShikyuuZengetsuBytes(byte[] arg) {
    s182aShikyuuZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aShikyuuZengetsu() {
    s182aShikyuuZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aShikyuuZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aShikyuuZengetsuBytes());
  }

  public void setS182aShikyuuZengetsu(long arg) {
  setS182aShikyuuZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aShikyuuTougetsuBytes() {
    return s182aShikyuuTougetsu;
  }

  public void setS182aShikyuuTougetsuBytes(byte[] arg) {
    s182aShikyuuTougetsu = ArrayUtils.clone(arg);
  }

  public void initS182aShikyuuTougetsu() {
    s182aShikyuuTougetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aShikyuuTougetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aShikyuuTougetsuBytes());
  }

  public void setS182aShikyuuTougetsu(long arg) {
  setS182aShikyuuTougetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aShikyuuJigetsuBytes() {
    return s182aShikyuuJigetsu;
  }

  public void setS182aShikyuuJigetsuBytes(byte[] arg) {
    s182aShikyuuJigetsu = ArrayUtils.clone(arg);
  }

  public void initS182aShikyuuJigetsu() {
    s182aShikyuuJigetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aShikyuuJigetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aShikyuuJigetsuBytes());
  }

  public void setS182aShikyuuJigetsu(long arg) {
  setS182aShikyuuJigetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aMikenZaikoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getS182aMikenZenZengetsuBytes());
        buffer.put(getS182aMikenZengetsuBytes());
    return buffer.array();
  }

  public void setS182aMikenZaikoBytes(byte[] arg) {
        setS182aMikenZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS182aMikenZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initS182aMikenZaiko() {
        initS182aMikenZenZengetsu();
        initS182aMikenZengetsu();
  }

  public String getS182aMikenZaiko() {
  return CommonUtils.bytesToString(getS182aMikenZaikoBytes());
  }

  public void setS182aMikenZaiko(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS182aMikenZaikoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aMikenZaikoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS182aMikenZenZengetsuBytes() {
    return s182aMikenZenZengetsu;
  }

  public void setS182aMikenZenZengetsuBytes(byte[] arg) {
    s182aMikenZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aMikenZenZengetsu() {
    s182aMikenZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aMikenZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aMikenZenZengetsuBytes());
  }

  public void setS182aMikenZenZengetsu(long arg) {
  setS182aMikenZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aMikenZengetsuBytes() {
    return s182aMikenZengetsu;
  }

  public void setS182aMikenZengetsuBytes(byte[] arg) {
    s182aMikenZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aMikenZengetsu() {
    s182aMikenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aMikenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aMikenZengetsuBytes());
  }

  public void setS182aMikenZengetsu(long arg) {
  setS182aMikenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aKankenZaikoBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getS182aKankenZenZengetsuBytes());
        buffer.put(getS182aKankenZengetsuBytes());
    return buffer.array();
  }

  public void setS182aKankenZaikoBytes(byte[] arg) {
        setS182aKankenZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS182aKankenZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
  }

  public void initS182aKankenZaiko() {
        initS182aKankenZenZengetsu();
        initS182aKankenZengetsu();
  }

  public String getS182aKankenZaiko() {
  return CommonUtils.bytesToString(getS182aKankenZaikoBytes());
  }

  public void setS182aKankenZaiko(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS182aKankenZaikoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS182aKankenZaikoBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS182aKankenZenZengetsuBytes() {
    return s182aKankenZenZengetsu;
  }

  public void setS182aKankenZenZengetsuBytes(byte[] arg) {
    s182aKankenZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aKankenZenZengetsu() {
    s182aKankenZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aKankenZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aKankenZenZengetsuBytes());
  }

  public void setS182aKankenZenZengetsu(long arg) {
  setS182aKankenZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS182aKankenZengetsuBytes() {
    return s182aKankenZengetsu;
  }

  public void setS182aKankenZengetsuBytes(byte[] arg) {
    s182aKankenZengetsu = ArrayUtils.clone(arg);
  }

  public void initS182aKankenZengetsu() {
    s182aKankenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS182aKankenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS182aKankenZengetsuBytes());
  }

  public void setS182aKankenZengetsu(long arg) {
  setS182aKankenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getShakei183Cr03Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(719);
        buffer.put(getResponseCodecr03Bytes());
        buffer.put(getRecordBufcr03Bytes());
    return buffer.array();
  }

  public void setShakei183Cr03Bytes(byte[] arg) {
        setResponseCodecr03Bytes(ArrayUtils.subarray(arg, 0, 2));
        setRecordBufcr03Bytes(ArrayUtils.subarray(arg, 2, 719));
  }

  public void initShakei183Cr03() {
        initResponseCodecr03();
        initRecordBufcr03();
  }

  public String getShakei183Cr03() {
  return CommonUtils.bytesToString(getShakei183Cr03Bytes());
  }

  public void setShakei183Cr03(String arg) {
  final int trailing_length = 719 - arg.length();
  if (trailing_length > 0) {
  setShakei183Cr03Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setShakei183Cr03Bytes(CommonUtils.stringToBytes(arg.substring(0, 719)));
  }
  }

  public byte[] getResponseCodecr03Bytes() {
    return responseCodecr03;
  }

  public void setResponseCodecr03Bytes(byte[] arg) {
    responseCodecr03 = ArrayUtils.clone(arg);
  }

  public void initResponseCodecr03() {
    responseCodecr03 =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodecr03() {
    return CommonUtils.binaryToNumber(getResponseCodecr03Bytes());
  }

  public void setResponseCodecr03(long arg) {
  setResponseCodecr03Bytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getRecordBufcr03Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(717);
        buffer.put(getS183aKoujouKubunBytes());
        buffer.put(getS183aShakeiCodeBytes());
        buffer.put(getS183aLineKubunBytes());
        buffer.put(getS183aYymmBytes());
        buffer.put(getS183aKouteiIdBytes());
        buffer.put(getS183aJissekiBytes());
        buffer.put(getS183aKeikakuBytes());
        buffer.put(getS183aOhTaishouShiftBytes());
        buffer.put(getS183aGJissekiOhBytes());
        buffer.put(getS183aGKeikakuOhBytes());
    return buffer.array();
  }

  public void setRecordBufcr03Bytes(byte[] arg) {
        setS183aKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setS183aShakeiCodeBytes(ArrayUtils.subarray(arg, 1, 7));
        setS183aLineKubunBytes(ArrayUtils.subarray(arg, 7, 11));
        setS183aYymmBytes(ArrayUtils.subarray(arg, 11, 15));
        setS183aKouteiIdBytes(ArrayUtils.subarray(arg, 15, 17));
        setS183aJissekiBytes(ArrayUtils.subarray(arg, 17, 228));
        setS183aKeikakuBytes(ArrayUtils.subarray(arg, 228, 445));
        setS183aOhTaishouShiftBytes(ArrayUtils.subarray(arg, 445, 457));
        setS183aGJissekiOhBytes(ArrayUtils.subarray(arg, 457, 613));
        setS183aGKeikakuOhBytes(ArrayUtils.subarray(arg, 613, 717));
  }

  public void initRecordBufcr03() {
        initS183aKoujouKubun();
        initS183aShakeiCode();
        initS183aLineKubun();
        initS183aYymm();
        initS183aKouteiId();
        initS183aJisseki();
        initS183aKeikaku();
        initS183aOhTaishouShift();
        initS183aGJissekiOh();
        initS183aGKeikakuOh();
  }

  public String getRecordBufcr03() {
  return CommonUtils.bytesToString(getRecordBufcr03Bytes());
  }

  public void setRecordBufcr03(String arg) {
  final int trailing_length = 717 - arg.length();
  if (trailing_length > 0) {
  setRecordBufcr03Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setRecordBufcr03Bytes(CommonUtils.stringToBytes(arg.substring(0, 717)));
  }
  }

  public byte[] getS183aKoujouKubunBytes() {
    return s183aKoujouKubun;
  }

  public void setS183aKoujouKubunBytes(byte[] arg) {
    s183aKoujouKubun = ArrayUtils.clone(arg);
  }

  public void initS183aKoujouKubun() {
    s183aKoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS183aKoujouKubun() {
  return CommonUtils.bytesToString(getS183aKoujouKubunBytes());
  }

  public void setS183aKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS183aKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS183aShakeiCodeBytes() {
    return s183aShakeiCode;
  }

  public void setS183aShakeiCodeBytes(byte[] arg) {
    s183aShakeiCode = ArrayUtils.clone(arg);
  }

  public void initS183aShakeiCode() {
    s183aShakeiCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS183aShakeiCode() {
  return CommonUtils.bytesToString(getS183aShakeiCodeBytes());
  }

  public void setS183aShakeiCode(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS183aShakeiCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aShakeiCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS183aLineKubunBytes() {
    return s183aLineKubun;
  }

  public void setS183aLineKubunBytes(byte[] arg) {
    s183aLineKubun = ArrayUtils.clone(arg);
  }

  public void initS183aLineKubun() {
    s183aLineKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS183aLineKubun() {
  return CommonUtils.bytesToString(getS183aLineKubunBytes());
  }

  public void setS183aLineKubun(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS183aLineKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aLineKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS183aYymmBytes() {
    return s183aYymm;
  }

  public void setS183aYymmBytes(byte[] arg) {
    s183aYymm = ArrayUtils.clone(arg);
  }

  public void initS183aYymm() {
    s183aYymm =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS183aYymm() {
  return CommonUtils.bytesToString(getS183aYymmBytes());
  }

  public void setS183aYymm(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS183aYymmBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aYymmBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS183aKouteiIdBytes() {
    return s183aKouteiId;
  }

  public void setS183aKouteiIdBytes(byte[] arg) {
    s183aKouteiId = ArrayUtils.clone(arg);
  }

  public void initS183aKouteiId() {
    s183aKouteiId =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS183aKouteiId() {
  return CommonUtils.bytesToString(getS183aKouteiIdBytes());
  }

  public void setS183aKouteiId(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS183aKouteiIdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aKouteiIdBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS183aJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(211);
        buffer.put(getS183aJissekiZengetsuBytes());
        buffer.put(getS183aJissekiTougetsuBytes());
        buffer.put(getS183aJissekiJigetsuBytes());
    return buffer.array();
  }

  public void setS183aJissekiBytes(byte[] arg) {
        setS183aJissekiZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS183aJissekiTougetsuBytes(ArrayUtils.subarray(arg, 3, 129));
        setS183aJissekiJigetsuBytes(ArrayUtils.subarray(arg, 129, 211));
  }

  public void initS183aJisseki() {
        initS183aJissekiZengetsu();
        initS183aJissekiTougetsu();
        initS183aJissekiJigetsu();
  }

  public String getS183aJisseki() {
  return CommonUtils.bytesToString(getS183aJissekiBytes());
  }

  public void setS183aJisseki(String arg) {
  final int trailing_length = 211 - arg.length();
  if (trailing_length > 0) {
  setS183aJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 211)));
  }
  }

  public byte[] getS183aJissekiZengetsuBytes() {
    return s183aJissekiZengetsu;
  }

  public void setS183aJissekiZengetsuBytes(byte[] arg) {
    s183aJissekiZengetsu = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiZengetsu() {
    s183aJissekiZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiZengetsuBytes());
  }

  public void setS183aJissekiZengetsu(long arg) {
  setS183aJissekiZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiTougetsuBytes() {
    return s183aJissekiTougetsu;
  }

  public void setS183aJissekiTougetsuBytes(byte[] arg) {
    s183aJissekiTougetsu = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiTougetsu() {
    s183aJissekiTougetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));
  }

  public String getS183aJissekiTougetsu() {
  return CommonUtils.bytesToString(getS183aJissekiTougetsuBytes());
  }

  public void setS183aJissekiTougetsu(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setS183aJissekiTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aJissekiTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getS183aJissekiJigetsuBytes() {
    return s183aJissekiJigetsu;
  }

  public void setS183aJissekiJigetsuBytes(byte[] arg) {
    s183aJissekiJigetsu = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiJigetsu() {
    s183aJissekiJigetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));
  }

  public String getS183aJissekiJigetsu() {
  return CommonUtils.bytesToString(getS183aJissekiJigetsuBytes());
  }

  public void setS183aJissekiJigetsu(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setS183aJissekiJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aJissekiJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getS183aKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(217);
        buffer.put(getS183aRuisaZenZengetsuBytes());
        buffer.put(getS183aKeikakuZengetsuBytes());
        buffer.put(getS183aRuisaZengetsuBytes());
        buffer.put(getS183aKeikakuTougetsuBytes());
        buffer.put(getS183aKeikakuJigetsuBytes());
    return buffer.array();
  }

  public void setS183aKeikakuBytes(byte[] arg) {
        setS183aRuisaZenZengetsuBytes(ArrayUtils.subarray(arg, 0, 3));
        setS183aKeikakuZengetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setS183aRuisaZengetsuBytes(ArrayUtils.subarray(arg, 6, 9));
        setS183aKeikakuTougetsuBytes(ArrayUtils.subarray(arg, 9, 135));
        setS183aKeikakuJigetsuBytes(ArrayUtils.subarray(arg, 135, 217));
  }

  public void initS183aKeikaku() {
        initS183aRuisaZenZengetsu();
        initS183aKeikakuZengetsu();
        initS183aRuisaZengetsu();
        initS183aKeikakuTougetsu();
        initS183aKeikakuJigetsu();
  }

  public String getS183aKeikaku() {
  return CommonUtils.bytesToString(getS183aKeikakuBytes());
  }

  public void setS183aKeikaku(String arg) {
  final int trailing_length = 217 - arg.length();
  if (trailing_length > 0) {
  setS183aKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 217)));
  }
  }

  public byte[] getS183aRuisaZenZengetsuBytes() {
    return s183aRuisaZenZengetsu;
  }

  public void setS183aRuisaZenZengetsuBytes(byte[] arg) {
    s183aRuisaZenZengetsu = ArrayUtils.clone(arg);
  }

  public void initS183aRuisaZenZengetsu() {
    s183aRuisaZenZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aRuisaZenZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS183aRuisaZenZengetsuBytes());
  }

  public void setS183aRuisaZenZengetsu(long arg) {
  setS183aRuisaZenZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aKeikakuZengetsuBytes() {
    return s183aKeikakuZengetsu;
  }

  public void setS183aKeikakuZengetsuBytes(byte[] arg) {
    s183aKeikakuZengetsu = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuZengetsu() {
    s183aKeikakuZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aKeikakuZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuZengetsuBytes());
  }

  public void setS183aKeikakuZengetsu(long arg) {
  setS183aKeikakuZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aRuisaZengetsuBytes() {
    return s183aRuisaZengetsu;
  }

  public void setS183aRuisaZengetsuBytes(byte[] arg) {
    s183aRuisaZengetsu = ArrayUtils.clone(arg);
  }

  public void initS183aRuisaZengetsu() {
    s183aRuisaZengetsu =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aRuisaZengetsu() {
    return CommonUtils.packedDecimalToNumber(getS183aRuisaZengetsuBytes());
  }

  public void setS183aRuisaZengetsu(long arg) {
  setS183aRuisaZengetsuBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aKeikakuTougetsuBytes() {
    return s183aKeikakuTougetsu;
  }

  public void setS183aKeikakuTougetsuBytes(byte[] arg) {
    s183aKeikakuTougetsu = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuTougetsu() {
    s183aKeikakuTougetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 126));
  }

  public String getS183aKeikakuTougetsu() {
  return CommonUtils.bytesToString(getS183aKeikakuTougetsuBytes());
  }

  public void setS183aKeikakuTougetsu(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setS183aKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aKeikakuTougetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getS183aKeikakuJigetsuBytes() {
    return s183aKeikakuJigetsu;
  }

  public void setS183aKeikakuJigetsuBytes(byte[] arg) {
    s183aKeikakuJigetsu = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuJigetsu() {
    s183aKeikakuJigetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 82));
  }

  public String getS183aKeikakuJigetsu() {
  return CommonUtils.bytesToString(getS183aKeikakuJigetsuBytes());
  }

  public void setS183aKeikakuJigetsu(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setS183aKeikakuJigetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aKeikakuJigetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getS183aOhTaishouShiftBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(12);
        buffer.put(getS183aZenZenShiftBytes());
        buffer.put(getS183aZenShiftBytes());
        buffer.put(getS183aTouShiftBytes());
        buffer.put(getS183aJiShiftBytes());
    return buffer.array();
  }

  public void setS183aOhTaishouShiftBytes(byte[] arg) {
        setS183aZenZenShiftBytes(ArrayUtils.subarray(arg, 0, 3));
        setS183aZenShiftBytes(ArrayUtils.subarray(arg, 3, 6));
        setS183aTouShiftBytes(ArrayUtils.subarray(arg, 6, 9));
        setS183aJiShiftBytes(ArrayUtils.subarray(arg, 9, 12));
  }

  public void initS183aOhTaishouShift() {
        initS183aZenZenShift();
        initS183aZenShift();
        initS183aTouShift();
        initS183aJiShift();
  }

  public String getS183aOhTaishouShift() {
  return CommonUtils.bytesToString(getS183aOhTaishouShiftBytes());
  }

  public void setS183aOhTaishouShift(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS183aOhTaishouShiftBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aOhTaishouShiftBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS183aZenZenShiftBytes() {
    return s183aZenZenShift;
  }

  public void setS183aZenZenShiftBytes(byte[] arg) {
    s183aZenZenShift = ArrayUtils.clone(arg);
  }

  public void initS183aZenZenShift() {
    s183aZenZenShift =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aZenZenShift() {
    return CommonUtils.packedDecimalToNumber(getS183aZenZenShiftBytes());
  }

  public void setS183aZenZenShift(long arg) {
  setS183aZenZenShiftBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aZenShiftBytes() {
    return s183aZenShift;
  }

  public void setS183aZenShiftBytes(byte[] arg) {
    s183aZenShift = ArrayUtils.clone(arg);
  }

  public void initS183aZenShift() {
    s183aZenShift =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aZenShift() {
    return CommonUtils.packedDecimalToNumber(getS183aZenShiftBytes());
  }

  public void setS183aZenShift(long arg) {
  setS183aZenShiftBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aTouShiftBytes() {
    return s183aTouShift;
  }

  public void setS183aTouShiftBytes(byte[] arg) {
    s183aTouShift = ArrayUtils.clone(arg);
  }

  public void initS183aTouShift() {
    s183aTouShift =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aTouShift() {
    return CommonUtils.packedDecimalToNumber(getS183aTouShiftBytes());
  }

  public void setS183aTouShift(long arg) {
  setS183aTouShiftBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJiShiftBytes() {
    return s183aJiShift;
  }

  public void setS183aJiShiftBytes(byte[] arg) {
    s183aJiShift = ArrayUtils.clone(arg);
  }

  public void initS183aJiShift() {
    s183aJiShift =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJiShift() {
    return CommonUtils.packedDecimalToNumber(getS183aJiShiftBytes());
  }

  public void setS183aJiShift(long arg) {
  setS183aJiShiftBytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aGJissekiOhBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(156);
        for (int x = 0; x < 4; x++) {
        buffer.put(getS183aJissekiOhBytes(x));
        }
    return buffer.array();
  }

  public void setS183aGJissekiOhBytes(byte[] arg) {
        for (int x = 0; x < 4; x++) {
        setS183aJissekiOhBytes(x, ArrayUtils.subarray(arg, 0 + 39 * x, 0 + 39 * (x + 1)));
        }
  }

  public void initS183aGJissekiOh() {
        for (int x = 0; x < 4; x++) {
        initS183aJissekiOh(x);
        }
  }

  public String getS183aGJissekiOh() {
  return CommonUtils.bytesToString(getS183aGJissekiOhBytes());
  }

  public void setS183aGJissekiOh(String arg) {
  final int trailing_length = 156 - arg.length();
  if (trailing_length > 0) {
  setS183aGJissekiOhBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aGJissekiOhBytes(CommonUtils.stringToBytes(arg.substring(0, 156)));
  }
  }

  public byte[] getS183aJissekiOhBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(39);
        buffer.put(getS183aJissekiOhMetal1Bytes(a));
        buffer.put(getS183aJissekiOhMetal2Bytes(a));
        buffer.put(getS183aJissekiOhWbsBytes(a));
        buffer.put(getS183aJissekiOhShitaPBytes(a));
        buffer.put(getS183aJissekiOhNakaPBytes(a));
        buffer.put(getS183aJissekiOhUwaPBytes(a));
        buffer.put(getS183aJissekiOhPbsBytes(a));
        buffer.put(getS183aJissekiOhPreTrimBytes(a));
        buffer.put(getS183aJikkekiOhTrimBytes(a));
        buffer.put(getS183aJikkekiOhFinalBytes(a));
        buffer.put(getS183aJikkekiOhKasouBytes(a));
        buffer.put(getS183aJikkekiOhDelivBytes(a));
        buffer.put(getS183aJikkekiOhUkeireBytes(a));
    return buffer.array();
  }

  public void setS183aJissekiOhBytes(int a,byte[] arg) {
        setS183aJissekiOhMetal1Bytes(a,ArrayUtils.subarray(arg, 0, 3));
        setS183aJissekiOhMetal2Bytes(a,ArrayUtils.subarray(arg, 3, 6));
        setS183aJissekiOhWbsBytes(a,ArrayUtils.subarray(arg, 6, 9));
        setS183aJissekiOhShitaPBytes(a,ArrayUtils.subarray(arg, 9, 12));
        setS183aJissekiOhNakaPBytes(a,ArrayUtils.subarray(arg, 12, 15));
        setS183aJissekiOhUwaPBytes(a,ArrayUtils.subarray(arg, 15, 18));
        setS183aJissekiOhPbsBytes(a,ArrayUtils.subarray(arg, 18, 21));
        setS183aJissekiOhPreTrimBytes(a,ArrayUtils.subarray(arg, 21, 24));
        setS183aJikkekiOhTrimBytes(a,ArrayUtils.subarray(arg, 24, 27));
        setS183aJikkekiOhFinalBytes(a,ArrayUtils.subarray(arg, 27, 30));
        setS183aJikkekiOhKasouBytes(a,ArrayUtils.subarray(arg, 30, 33));
        setS183aJikkekiOhDelivBytes(a,ArrayUtils.subarray(arg, 33, 36));
        setS183aJikkekiOhUkeireBytes(a,ArrayUtils.subarray(arg, 36, 39));
  }

  public void initS183aJissekiOh(int a) {
        initS183aJissekiOhMetal1(a);
        initS183aJissekiOhMetal2(a);
        initS183aJissekiOhWbs(a);
        initS183aJissekiOhShitaP(a);
        initS183aJissekiOhNakaP(a);
        initS183aJissekiOhUwaP(a);
        initS183aJissekiOhPbs(a);
        initS183aJissekiOhPreTrim(a);
        initS183aJikkekiOhTrim(a);
        initS183aJikkekiOhFinal(a);
        initS183aJikkekiOhKasou(a);
        initS183aJikkekiOhDeliv(a);
        initS183aJikkekiOhUkeire(a);
  }

  public String getS183aJissekiOh(int a) {
  return CommonUtils.bytesToString(getS183aJissekiOhBytes(a));
  }

  public void setS183aJissekiOh(int a,String arg) {
  final int trailing_length = 39 - arg.length();
  if (trailing_length > 0) {
  setS183aJissekiOhBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aJissekiOhBytes(a,CommonUtils.stringToBytes(arg.substring(0, 39)));
  }
  }

  public byte[] getS183aJissekiOhMetal1Bytes(int a) {
    return s183aJissekiOhMetal1[a];
  }

  public void setS183aJissekiOhMetal1Bytes(int a,byte[] arg) {
    s183aJissekiOhMetal1[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhMetal1(int a) {
    s183aJissekiOhMetal1[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhMetal1(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhMetal1Bytes(a));
  }

  public void setS183aJissekiOhMetal1(int a,long arg) {
  setS183aJissekiOhMetal1Bytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhMetal2Bytes(int a) {
    return s183aJissekiOhMetal2[a];
  }

  public void setS183aJissekiOhMetal2Bytes(int a,byte[] arg) {
    s183aJissekiOhMetal2[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhMetal2(int a) {
    s183aJissekiOhMetal2[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhMetal2(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhMetal2Bytes(a));
  }

  public void setS183aJissekiOhMetal2(int a,long arg) {
  setS183aJissekiOhMetal2Bytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhWbsBytes(int a) {
    return s183aJissekiOhWbs[a];
  }

  public void setS183aJissekiOhWbsBytes(int a,byte[] arg) {
    s183aJissekiOhWbs[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhWbs(int a) {
    s183aJissekiOhWbs[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhWbs(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhWbsBytes(a));
  }

  public void setS183aJissekiOhWbs(int a,long arg) {
  setS183aJissekiOhWbsBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhShitaPBytes(int a) {
    return s183aJissekiOhShitaP[a];
  }

  public void setS183aJissekiOhShitaPBytes(int a,byte[] arg) {
    s183aJissekiOhShitaP[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhShitaP(int a) {
    s183aJissekiOhShitaP[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhShitaP(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhShitaPBytes(a));
  }

  public void setS183aJissekiOhShitaP(int a,long arg) {
  setS183aJissekiOhShitaPBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhNakaPBytes(int a) {
    return s183aJissekiOhNakaP[a];
  }

  public void setS183aJissekiOhNakaPBytes(int a,byte[] arg) {
    s183aJissekiOhNakaP[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhNakaP(int a) {
    s183aJissekiOhNakaP[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhNakaP(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhNakaPBytes(a));
  }

  public void setS183aJissekiOhNakaP(int a,long arg) {
  setS183aJissekiOhNakaPBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhUwaPBytes(int a) {
    return s183aJissekiOhUwaP[a];
  }

  public void setS183aJissekiOhUwaPBytes(int a,byte[] arg) {
    s183aJissekiOhUwaP[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhUwaP(int a) {
    s183aJissekiOhUwaP[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhUwaP(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhUwaPBytes(a));
  }

  public void setS183aJissekiOhUwaP(int a,long arg) {
  setS183aJissekiOhUwaPBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhPbsBytes(int a) {
    return s183aJissekiOhPbs[a];
  }

  public void setS183aJissekiOhPbsBytes(int a,byte[] arg) {
    s183aJissekiOhPbs[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhPbs(int a) {
    s183aJissekiOhPbs[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhPbs(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhPbsBytes(a));
  }

  public void setS183aJissekiOhPbs(int a,long arg) {
  setS183aJissekiOhPbsBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJissekiOhPreTrimBytes(int a) {
    return s183aJissekiOhPreTrim[a];
  }

  public void setS183aJissekiOhPreTrimBytes(int a,byte[] arg) {
    s183aJissekiOhPreTrim[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJissekiOhPreTrim(int a) {
    s183aJissekiOhPreTrim[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJissekiOhPreTrim(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJissekiOhPreTrimBytes(a));
  }

  public void setS183aJissekiOhPreTrim(int a,long arg) {
  setS183aJissekiOhPreTrimBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJikkekiOhTrimBytes(int a) {
    return s183aJikkekiOhTrim[a];
  }

  public void setS183aJikkekiOhTrimBytes(int a,byte[] arg) {
    s183aJikkekiOhTrim[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJikkekiOhTrim(int a) {
    s183aJikkekiOhTrim[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJikkekiOhTrim(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJikkekiOhTrimBytes(a));
  }

  public void setS183aJikkekiOhTrim(int a,long arg) {
  setS183aJikkekiOhTrimBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJikkekiOhFinalBytes(int a) {
    return s183aJikkekiOhFinal[a];
  }

  public void setS183aJikkekiOhFinalBytes(int a,byte[] arg) {
    s183aJikkekiOhFinal[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJikkekiOhFinal(int a) {
    s183aJikkekiOhFinal[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJikkekiOhFinal(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJikkekiOhFinalBytes(a));
  }

  public void setS183aJikkekiOhFinal(int a,long arg) {
  setS183aJikkekiOhFinalBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJikkekiOhKasouBytes(int a) {
    return s183aJikkekiOhKasou[a];
  }

  public void setS183aJikkekiOhKasouBytes(int a,byte[] arg) {
    s183aJikkekiOhKasou[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJikkekiOhKasou(int a) {
    s183aJikkekiOhKasou[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJikkekiOhKasou(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJikkekiOhKasouBytes(a));
  }

  public void setS183aJikkekiOhKasou(int a,long arg) {
  setS183aJikkekiOhKasouBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJikkekiOhDelivBytes(int a) {
    return s183aJikkekiOhDeliv[a];
  }

  public void setS183aJikkekiOhDelivBytes(int a,byte[] arg) {
    s183aJikkekiOhDeliv[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJikkekiOhDeliv(int a) {
    s183aJikkekiOhDeliv[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJikkekiOhDeliv(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJikkekiOhDelivBytes(a));
  }

  public void setS183aJikkekiOhDeliv(int a,long arg) {
  setS183aJikkekiOhDelivBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aJikkekiOhUkeireBytes(int a) {
    return s183aJikkekiOhUkeire[a];
  }

  public void setS183aJikkekiOhUkeireBytes(int a,byte[] arg) {
    s183aJikkekiOhUkeire[a] = ArrayUtils.clone(arg);
  }

  public void initS183aJikkekiOhUkeire(int a) {
    s183aJikkekiOhUkeire[a] =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getS183aJikkekiOhUkeire(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aJikkekiOhUkeireBytes(a));
  }

  public void setS183aJikkekiOhUkeire(int a,long arg) {
  setS183aJikkekiOhUkeireBytes(a,CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getS183aGKeikakuOhBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(104);
        for (int x = 0; x < 4; x++) {
        buffer.put(getS183aKeikakuOhBytes(x));
        }
    return buffer.array();
  }

  public void setS183aGKeikakuOhBytes(byte[] arg) {
        for (int x = 0; x < 4; x++) {
        setS183aKeikakuOhBytes(x, ArrayUtils.subarray(arg, 0 + 26 * x, 0 + 26 * (x + 1)));
        }
  }

  public void initS183aGKeikakuOh() {
        for (int x = 0; x < 4; x++) {
        initS183aKeikakuOh(x);
        }
  }

  public String getS183aGKeikakuOh() {
  return CommonUtils.bytesToString(getS183aGKeikakuOhBytes());
  }

  public void setS183aGKeikakuOh(String arg) {
  final int trailing_length = 104 - arg.length();
  if (trailing_length > 0) {
  setS183aGKeikakuOhBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aGKeikakuOhBytes(CommonUtils.stringToBytes(arg.substring(0, 104)));
  }
  }

  public byte[] getS183aKeikakuOhBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(26);
        buffer.put(getS183aKeikakuOhMetal1Bytes(a));
        buffer.put(getS183aKeikakuOhMetal2Bytes(a));
        buffer.put(getS183aKeikakuOhWbsBytes(a));
        buffer.put(getS183aKeikakuOhShitaPBytes(a));
        buffer.put(getS183aKeikakuOhNakaPBytes(a));
        buffer.put(getS183aKeikakuOhUwaPBytes(a));
        buffer.put(getS183aKeikakuOhPbsBytes(a));
        buffer.put(getS183aKeikakuOhPreTrimBytes(a));
        buffer.put(getS183aKeikakuOhTrimBytes(a));
        buffer.put(getS183aKeikakuOhFinalBytes(a));
        buffer.put(getS183aKeikakuOhKasouBytes(a));
        buffer.put(getS183aKeikakuOhDelivBytes(a));
        buffer.put(getS183aKeikakuOhUkeireBytes(a));
    return buffer.array();
  }

  public void setS183aKeikakuOhBytes(int a,byte[] arg) {
        setS183aKeikakuOhMetal1Bytes(a,ArrayUtils.subarray(arg, 0, 2));
        setS183aKeikakuOhMetal2Bytes(a,ArrayUtils.subarray(arg, 2, 4));
        setS183aKeikakuOhWbsBytes(a,ArrayUtils.subarray(arg, 4, 6));
        setS183aKeikakuOhShitaPBytes(a,ArrayUtils.subarray(arg, 6, 8));
        setS183aKeikakuOhNakaPBytes(a,ArrayUtils.subarray(arg, 8, 10));
        setS183aKeikakuOhUwaPBytes(a,ArrayUtils.subarray(arg, 10, 12));
        setS183aKeikakuOhPbsBytes(a,ArrayUtils.subarray(arg, 12, 14));
        setS183aKeikakuOhPreTrimBytes(a,ArrayUtils.subarray(arg, 14, 16));
        setS183aKeikakuOhTrimBytes(a,ArrayUtils.subarray(arg, 16, 18));
        setS183aKeikakuOhFinalBytes(a,ArrayUtils.subarray(arg, 18, 20));
        setS183aKeikakuOhKasouBytes(a,ArrayUtils.subarray(arg, 20, 22));
        setS183aKeikakuOhDelivBytes(a,ArrayUtils.subarray(arg, 22, 24));
        setS183aKeikakuOhUkeireBytes(a,ArrayUtils.subarray(arg, 24, 26));
  }

  public void initS183aKeikakuOh(int a) {
        initS183aKeikakuOhMetal1(a);
        initS183aKeikakuOhMetal2(a);
        initS183aKeikakuOhWbs(a);
        initS183aKeikakuOhShitaP(a);
        initS183aKeikakuOhNakaP(a);
        initS183aKeikakuOhUwaP(a);
        initS183aKeikakuOhPbs(a);
        initS183aKeikakuOhPreTrim(a);
        initS183aKeikakuOhTrim(a);
        initS183aKeikakuOhFinal(a);
        initS183aKeikakuOhKasou(a);
        initS183aKeikakuOhDeliv(a);
        initS183aKeikakuOhUkeire(a);
  }

  public String getS183aKeikakuOh(int a) {
  return CommonUtils.bytesToString(getS183aKeikakuOhBytes(a));
  }

  public void setS183aKeikakuOh(int a,String arg) {
  final int trailing_length = 26 - arg.length();
  if (trailing_length > 0) {
  setS183aKeikakuOhBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS183aKeikakuOhBytes(a,CommonUtils.stringToBytes(arg.substring(0, 26)));
  }
  }

  public byte[] getS183aKeikakuOhMetal1Bytes(int a) {
    return s183aKeikakuOhMetal1[a];
  }

  public void setS183aKeikakuOhMetal1Bytes(int a,byte[] arg) {
    s183aKeikakuOhMetal1[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhMetal1(int a) {
    s183aKeikakuOhMetal1[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhMetal1(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhMetal1Bytes(a));
  }

  public void setS183aKeikakuOhMetal1(int a,long arg) {
  setS183aKeikakuOhMetal1Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhMetal2Bytes(int a) {
    return s183aKeikakuOhMetal2[a];
  }

  public void setS183aKeikakuOhMetal2Bytes(int a,byte[] arg) {
    s183aKeikakuOhMetal2[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhMetal2(int a) {
    s183aKeikakuOhMetal2[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhMetal2(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhMetal2Bytes(a));
  }

  public void setS183aKeikakuOhMetal2(int a,long arg) {
  setS183aKeikakuOhMetal2Bytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhWbsBytes(int a) {
    return s183aKeikakuOhWbs[a];
  }

  public void setS183aKeikakuOhWbsBytes(int a,byte[] arg) {
    s183aKeikakuOhWbs[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhWbs(int a) {
    s183aKeikakuOhWbs[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhWbs(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhWbsBytes(a));
  }

  public void setS183aKeikakuOhWbs(int a,long arg) {
  setS183aKeikakuOhWbsBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhShitaPBytes(int a) {
    return s183aKeikakuOhShitaP[a];
  }

  public void setS183aKeikakuOhShitaPBytes(int a,byte[] arg) {
    s183aKeikakuOhShitaP[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhShitaP(int a) {
    s183aKeikakuOhShitaP[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhShitaP(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhShitaPBytes(a));
  }

  public void setS183aKeikakuOhShitaP(int a,long arg) {
  setS183aKeikakuOhShitaPBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhNakaPBytes(int a) {
    return s183aKeikakuOhNakaP[a];
  }

  public void setS183aKeikakuOhNakaPBytes(int a,byte[] arg) {
    s183aKeikakuOhNakaP[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhNakaP(int a) {
    s183aKeikakuOhNakaP[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhNakaP(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhNakaPBytes(a));
  }

  public void setS183aKeikakuOhNakaP(int a,long arg) {
  setS183aKeikakuOhNakaPBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhUwaPBytes(int a) {
    return s183aKeikakuOhUwaP[a];
  }

  public void setS183aKeikakuOhUwaPBytes(int a,byte[] arg) {
    s183aKeikakuOhUwaP[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhUwaP(int a) {
    s183aKeikakuOhUwaP[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhUwaP(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhUwaPBytes(a));
  }

  public void setS183aKeikakuOhUwaP(int a,long arg) {
  setS183aKeikakuOhUwaPBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhPbsBytes(int a) {
    return s183aKeikakuOhPbs[a];
  }

  public void setS183aKeikakuOhPbsBytes(int a,byte[] arg) {
    s183aKeikakuOhPbs[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhPbs(int a) {
    s183aKeikakuOhPbs[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhPbs(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhPbsBytes(a));
  }

  public void setS183aKeikakuOhPbs(int a,long arg) {
  setS183aKeikakuOhPbsBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhPreTrimBytes(int a) {
    return s183aKeikakuOhPreTrim[a];
  }

  public void setS183aKeikakuOhPreTrimBytes(int a,byte[] arg) {
    s183aKeikakuOhPreTrim[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhPreTrim(int a) {
    s183aKeikakuOhPreTrim[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhPreTrim(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhPreTrimBytes(a));
  }

  public void setS183aKeikakuOhPreTrim(int a,long arg) {
  setS183aKeikakuOhPreTrimBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhTrimBytes(int a) {
    return s183aKeikakuOhTrim[a];
  }

  public void setS183aKeikakuOhTrimBytes(int a,byte[] arg) {
    s183aKeikakuOhTrim[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhTrim(int a) {
    s183aKeikakuOhTrim[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhTrim(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhTrimBytes(a));
  }

  public void setS183aKeikakuOhTrim(int a,long arg) {
  setS183aKeikakuOhTrimBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhFinalBytes(int a) {
    return s183aKeikakuOhFinal[a];
  }

  public void setS183aKeikakuOhFinalBytes(int a,byte[] arg) {
    s183aKeikakuOhFinal[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhFinal(int a) {
    s183aKeikakuOhFinal[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhFinal(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhFinalBytes(a));
  }

  public void setS183aKeikakuOhFinal(int a,long arg) {
  setS183aKeikakuOhFinalBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhKasouBytes(int a) {
    return s183aKeikakuOhKasou[a];
  }

  public void setS183aKeikakuOhKasouBytes(int a,byte[] arg) {
    s183aKeikakuOhKasou[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhKasou(int a) {
    s183aKeikakuOhKasou[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhKasou(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhKasouBytes(a));
  }

  public void setS183aKeikakuOhKasou(int a,long arg) {
  setS183aKeikakuOhKasouBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhDelivBytes(int a) {
    return s183aKeikakuOhDeliv[a];
  }

  public void setS183aKeikakuOhDelivBytes(int a,byte[] arg) {
    s183aKeikakuOhDeliv[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhDeliv(int a) {
    s183aKeikakuOhDeliv[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhDeliv(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhDelivBytes(a));
  }

  public void setS183aKeikakuOhDeliv(int a,long arg) {
  setS183aKeikakuOhDelivBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS183aKeikakuOhUkeireBytes(int a) {
    return s183aKeikakuOhUkeire[a];
  }

  public void setS183aKeikakuOhUkeireBytes(int a,byte[] arg) {
    s183aKeikakuOhUkeire[a] = ArrayUtils.clone(arg);
  }

  public void initS183aKeikakuOhUkeire(int a) {
    s183aKeikakuOhUkeire[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS183aKeikakuOhUkeire(int a) {
    return CommonUtils.packedDecimalToNumber(getS183aKeikakuOhUkeireBytes(a));
  }

  public void setS183aKeikakuOhUkeire(int a,long arg) {
  setS183aKeikakuOhUkeireBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getJikei184Cr04Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(128);
        buffer.put(getResponseCodecr04Bytes());
        buffer.put(getRecordBufcr04Bytes());
    return buffer.array();
  }

  public void setJikei184Cr04Bytes(byte[] arg) {
        setResponseCodecr04Bytes(ArrayUtils.subarray(arg, 0, 2));
        setRecordBufcr04Bytes(ArrayUtils.subarray(arg, 2, 128));
  }

  public void initJikei184Cr04() {
        initResponseCodecr04();
        initRecordBufcr04();
  }

  public String getJikei184Cr04() {
  return CommonUtils.bytesToString(getJikei184Cr04Bytes());
  }

  public void setJikei184Cr04(String arg) {
  final int trailing_length = 128 - arg.length();
  if (trailing_length > 0) {
  setJikei184Cr04Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setJikei184Cr04Bytes(CommonUtils.stringToBytes(arg.substring(0, 128)));
  }
  }

  public byte[] getResponseCodecr04Bytes() {
    return responseCodecr04;
  }

  public void setResponseCodecr04Bytes(byte[] arg) {
    responseCodecr04 = ArrayUtils.clone(arg);
  }

  public void initResponseCodecr04() {
    responseCodecr04 =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodecr04() {
    return CommonUtils.binaryToNumber(getResponseCodecr04Bytes());
  }

  public void setResponseCodecr04(long arg) {
  setResponseCodecr04Bytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getRecordBufcr04Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(126);
        buffer.put(getS184aKoujouKubunBytes());
        buffer.put(getS184aShakeiCodeBytes());
        buffer.put(getS184aLineKubunBytes());
        buffer.put(getS184aShiftBytes());
        buffer.put(getS184aKouteiIdBytes());
        buffer.put(getS184aKaishiJikokuBytes());
        buffer.put(getS184aJissekiBytes());
        buffer.put(getS184aKeikakuBytes());
    return buffer.array();
  }

  public void setRecordBufcr04Bytes(byte[] arg) {
        setS184aKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setS184aShakeiCodeBytes(ArrayUtils.subarray(arg, 1, 7));
        setS184aLineKubunBytes(ArrayUtils.subarray(arg, 7, 11));
        setS184aShiftBytes(ArrayUtils.subarray(arg, 11, 18));
        setS184aKouteiIdBytes(ArrayUtils.subarray(arg, 18, 20));
        setS184aKaishiJikokuBytes(ArrayUtils.subarray(arg, 20, 22));
        setS184aJissekiBytes(ArrayUtils.subarray(arg, 22, 74));
        setS184aKeikakuBytes(ArrayUtils.subarray(arg, 74, 126));
  }

  public void initRecordBufcr04() {
        initS184aKoujouKubun();
        initS184aShakeiCode();
        initS184aLineKubun();
        initS184aShift();
        initS184aKouteiId();
        initS184aKaishiJikoku();
        initS184aJisseki();
        initS184aKeikaku();
  }

  public String getRecordBufcr04() {
  return CommonUtils.bytesToString(getRecordBufcr04Bytes());
  }

  public void setRecordBufcr04(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setRecordBufcr04Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setRecordBufcr04Bytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getS184aKoujouKubunBytes() {
    return s184aKoujouKubun;
  }

  public void setS184aKoujouKubunBytes(byte[] arg) {
    s184aKoujouKubun = ArrayUtils.clone(arg);
  }

  public void initS184aKoujouKubun() {
    s184aKoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS184aKoujouKubun() {
  return CommonUtils.bytesToString(getS184aKoujouKubunBytes());
  }

  public void setS184aKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS184aKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS184aShakeiCodeBytes() {
    return s184aShakeiCode;
  }

  public void setS184aShakeiCodeBytes(byte[] arg) {
    s184aShakeiCode = ArrayUtils.clone(arg);
  }

  public void initS184aShakeiCode() {
    s184aShakeiCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS184aShakeiCode() {
  return CommonUtils.bytesToString(getS184aShakeiCodeBytes());
  }

  public void setS184aShakeiCode(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS184aShakeiCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aShakeiCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS184aLineKubunBytes() {
    return s184aLineKubun;
  }

  public void setS184aLineKubunBytes(byte[] arg) {
    s184aLineKubun = ArrayUtils.clone(arg);
  }

  public void initS184aLineKubun() {
    s184aLineKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS184aLineKubun() {
  return CommonUtils.bytesToString(getS184aLineKubunBytes());
  }

  public void setS184aLineKubun(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS184aLineKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aLineKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS184aShiftBytes() {
    return s184aShift;
  }

  public void setS184aShiftBytes(byte[] arg) {
    s184aShift = ArrayUtils.clone(arg);
  }

  public void initS184aShift() {
    s184aShift =CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));
  }

  public String getS184aShift() {
  return CommonUtils.bytesToString(getS184aShiftBytes());
  }

  public void setS184aShift(String arg) {
  final int trailing_length = 7 - arg.length();
  if (trailing_length > 0) {
  setS184aShiftBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aShiftBytes(CommonUtils.stringToBytes(arg.substring(0, 7)));
  }
  }

  public byte[] getS184aKouteiIdBytes() {
    return s184aKouteiId;
  }

  public void setS184aKouteiIdBytes(byte[] arg) {
    s184aKouteiId = ArrayUtils.clone(arg);
  }

  public void initS184aKouteiId() {
    s184aKouteiId =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS184aKouteiId() {
  return CommonUtils.bytesToString(getS184aKouteiIdBytes());
  }

  public void setS184aKouteiId(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS184aKouteiIdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aKouteiIdBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS184aKaishiJikokuBytes() {
    return s184aKaishiJikoku;
  }

  public void setS184aKaishiJikokuBytes(byte[] arg) {
    s184aKaishiJikoku = ArrayUtils.clone(arg);
  }

  public void initS184aKaishiJikoku() {
    s184aKaishiJikoku =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS184aKaishiJikoku() {
  return CommonUtils.bytesToString(getS184aKaishiJikokuBytes());
  }

  public void setS184aKaishiJikoku(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS184aKaishiJikokuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aKaishiJikokuBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS184aJissekiBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(52);
        buffer.put(getS184aJissekiKaishiIzenBytes());
        buffer.put(getS184aJissekiHhTblBytes());
        buffer.put(getS184aJisseki12hIkouBytes());
    return buffer.array();
  }

  public void setS184aJissekiBytes(byte[] arg) {
        setS184aJissekiKaishiIzenBytes(ArrayUtils.subarray(arg, 0, 2));
        setS184aJissekiHhTblBytes(ArrayUtils.subarray(arg, 2, 50));
        setS184aJisseki12hIkouBytes(ArrayUtils.subarray(arg, 50, 52));
  }

  public void initS184aJisseki() {
        initS184aJissekiKaishiIzen();
        initS184aJissekiHhTbl();
        initS184aJisseki12hIkou();
  }

  public String getS184aJisseki() {
  return CommonUtils.bytesToString(getS184aJissekiBytes());
  }

  public void setS184aJisseki(String arg) {
  final int trailing_length = 52 - arg.length();
  if (trailing_length > 0) {
  setS184aJissekiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aJissekiBytes(CommonUtils.stringToBytes(arg.substring(0, 52)));
  }
  }

  public byte[] getS184aJissekiKaishiIzenBytes() {
    return s184aJissekiKaishiIzen;
  }

  public void setS184aJissekiKaishiIzenBytes(byte[] arg) {
    s184aJissekiKaishiIzen = ArrayUtils.clone(arg);
  }

  public void initS184aJissekiKaishiIzen() {
    s184aJissekiKaishiIzen =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS184aJissekiKaishiIzen() {
    return CommonUtils.packedDecimalToNumber(getS184aJissekiKaishiIzenBytes());
  }

  public void setS184aJissekiKaishiIzen(long arg) {
  setS184aJissekiKaishiIzenBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS184aJissekiHhTblBytes() {
    return s184aJissekiHhTbl;
  }

  public void setS184aJissekiHhTblBytes(byte[] arg) {
    s184aJissekiHhTbl = ArrayUtils.clone(arg);
  }

  public void initS184aJissekiHhTbl() {
    s184aJissekiHhTbl =CommonUtils.stringToBytes(StringUtils.repeat(" ", 48));
  }

  public String getS184aJissekiHhTbl() {
  return CommonUtils.bytesToString(getS184aJissekiHhTblBytes());
  }

  public void setS184aJissekiHhTbl(String arg) {
  final int trailing_length = 48 - arg.length();
  if (trailing_length > 0) {
  setS184aJissekiHhTblBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aJissekiHhTblBytes(CommonUtils.stringToBytes(arg.substring(0, 48)));
  }
  }

  public byte[] getS184aJisseki12hIkouBytes() {
    return s184aJisseki12hIkou;
  }

  public void setS184aJisseki12hIkouBytes(byte[] arg) {
    s184aJisseki12hIkou = ArrayUtils.clone(arg);
  }

  public void initS184aJisseki12hIkou() {
    s184aJisseki12hIkou =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS184aJisseki12hIkou() {
    return CommonUtils.packedDecimalToNumber(getS184aJisseki12hIkouBytes());
  }

  public void setS184aJisseki12hIkou(long arg) {
  setS184aJisseki12hIkouBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS184aKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(52);
        buffer.put(getS184aKeikakuKaishiIzenBytes());
        buffer.put(getS184aKeikakuHhTblBytes());
        buffer.put(getS184aKeikaku12hIkouBytes());
    return buffer.array();
  }

  public void setS184aKeikakuBytes(byte[] arg) {
        setS184aKeikakuKaishiIzenBytes(ArrayUtils.subarray(arg, 0, 2));
        setS184aKeikakuHhTblBytes(ArrayUtils.subarray(arg, 2, 50));
        setS184aKeikaku12hIkouBytes(ArrayUtils.subarray(arg, 50, 52));
  }

  public void initS184aKeikaku() {
        initS184aKeikakuKaishiIzen();
        initS184aKeikakuHhTbl();
        initS184aKeikaku12hIkou();
  }

  public String getS184aKeikaku() {
  return CommonUtils.bytesToString(getS184aKeikakuBytes());
  }

  public void setS184aKeikaku(String arg) {
  final int trailing_length = 52 - arg.length();
  if (trailing_length > 0) {
  setS184aKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 52)));
  }
  }

  public byte[] getS184aKeikakuKaishiIzenBytes() {
    return s184aKeikakuKaishiIzen;
  }

  public void setS184aKeikakuKaishiIzenBytes(byte[] arg) {
    s184aKeikakuKaishiIzen = ArrayUtils.clone(arg);
  }

  public void initS184aKeikakuKaishiIzen() {
    s184aKeikakuKaishiIzen =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS184aKeikakuKaishiIzen() {
    return CommonUtils.packedDecimalToNumber(getS184aKeikakuKaishiIzenBytes());
  }

  public void setS184aKeikakuKaishiIzen(long arg) {
  setS184aKeikakuKaishiIzenBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS184aKeikakuHhTblBytes() {
    return s184aKeikakuHhTbl;
  }

  public void setS184aKeikakuHhTblBytes(byte[] arg) {
    s184aKeikakuHhTbl = ArrayUtils.clone(arg);
  }

  public void initS184aKeikakuHhTbl() {
    s184aKeikakuHhTbl =CommonUtils.stringToBytes(StringUtils.repeat(" ", 48));
  }

  public String getS184aKeikakuHhTbl() {
  return CommonUtils.bytesToString(getS184aKeikakuHhTblBytes());
  }

  public void setS184aKeikakuHhTbl(String arg) {
  final int trailing_length = 48 - arg.length();
  if (trailing_length > 0) {
  setS184aKeikakuHhTblBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS184aKeikakuHhTblBytes(CommonUtils.stringToBytes(arg.substring(0, 48)));
  }
  }

  public byte[] getS184aKeikaku12hIkouBytes() {
    return s184aKeikaku12hIkou;
  }

  public void setS184aKeikaku12hIkouBytes(byte[] arg) {
    s184aKeikaku12hIkou = ArrayUtils.clone(arg);
  }

  public void initS184aKeikaku12hIkou() {
    s184aKeikaku12hIkou =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS184aKeikaku12hIkou() {
    return CommonUtils.packedDecimalToNumber(getS184aKeikaku12hIkouBytes());
  }

  public void setS184aKeikaku12hIkou(long arg) {
  setS184aKeikaku12hIkouBytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getKoutei185Cr05Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(156);
        buffer.put(getResponseCodecr05Bytes());
        buffer.put(getRecordBufcr05Bytes());
    return buffer.array();
  }

  public void setKoutei185Cr05Bytes(byte[] arg) {
        setResponseCodecr05Bytes(ArrayUtils.subarray(arg, 0, 2));
        setRecordBufcr05Bytes(ArrayUtils.subarray(arg, 2, 156));
  }

  public void initKoutei185Cr05() {
        initResponseCodecr05();
        initRecordBufcr05();
  }

  public String getKoutei185Cr05() {
  return CommonUtils.bytesToString(getKoutei185Cr05Bytes());
  }

  public void setKoutei185Cr05(String arg) {
  final int trailing_length = 156 - arg.length();
  if (trailing_length > 0) {
  setKoutei185Cr05Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setKoutei185Cr05Bytes(CommonUtils.stringToBytes(arg.substring(0, 156)));
  }
  }

  public byte[] getResponseCodecr05Bytes() {
    return responseCodecr05;
  }

  public void setResponseCodecr05Bytes(byte[] arg) {
    responseCodecr05 = ArrayUtils.clone(arg);
  }

  public void initResponseCodecr05() {
    responseCodecr05 =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodecr05() {
    return CommonUtils.binaryToNumber(getResponseCodecr05Bytes());
  }

  public void setResponseCodecr05(long arg) {
  setResponseCodecr05Bytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getRecordBufcr05Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(154);
        buffer.put(getS185aKoujouKubunFileIdBytes());
        buffer.put(getS185aActGroupBytes());
        buffer.put(getS185aActLineCodBytes());
        buffer.put(getS185aYyyymmBytes());
        buffer.put(getS185aKouteiKeikakuIdBytes());
        buffer.put(getS185aGKeikakuBytes());
        buffer.put(getS185aTimeStampBytes());
    return buffer.array();
  }

  public void setRecordBufcr05Bytes(byte[] arg) {
        setS185aKoujouKubunFileIdBytes(ArrayUtils.subarray(arg, 0, 1));
        setS185aActGroupBytes(ArrayUtils.subarray(arg, 1, 2));
        setS185aActLineCodBytes(ArrayUtils.subarray(arg, 2, 8));
        setS185aYyyymmBytes(ArrayUtils.subarray(arg, 8, 14));
        setS185aKouteiKeikakuIdBytes(ArrayUtils.subarray(arg, 14, 16));
        setS185aGKeikakuBytes(ArrayUtils.subarray(arg, 16, 142));
        setS185aTimeStampBytes(ArrayUtils.subarray(arg, 142, 154));
  }

  public void initRecordBufcr05() {
        initS185aKoujouKubunFileId();
        initS185aActGroup();
        initS185aActLineCod();
        initS185aYyyymm();
        initS185aKouteiKeikakuId();
        initS185aGKeikaku();
        initS185aTimeStamp();
  }

  public String getRecordBufcr05() {
  return CommonUtils.bytesToString(getRecordBufcr05Bytes());
  }

  public void setRecordBufcr05(String arg) {
  final int trailing_length = 154 - arg.length();
  if (trailing_length > 0) {
  setRecordBufcr05Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setRecordBufcr05Bytes(CommonUtils.stringToBytes(arg.substring(0, 154)));
  }
  }

  public byte[] getS185aKoujouKubunFileIdBytes() {
    return s185aKoujouKubunFileId;
  }

  public void setS185aKoujouKubunFileIdBytes(byte[] arg) {
    s185aKoujouKubunFileId = ArrayUtils.clone(arg);
  }

  public void initS185aKoujouKubunFileId() {
    s185aKoujouKubunFileId =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS185aKoujouKubunFileId() {
  return CommonUtils.bytesToString(getS185aKoujouKubunFileIdBytes());
  }

  public void setS185aKoujouKubunFileId(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS185aKoujouKubunFileIdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aKoujouKubunFileIdBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS185aActGroupBytes() {
    return s185aActGroup;
  }

  public void setS185aActGroupBytes(byte[] arg) {
    s185aActGroup = ArrayUtils.clone(arg);
  }

  public void initS185aActGroup() {
    s185aActGroup =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS185aActGroup() {
  return CommonUtils.bytesToString(getS185aActGroupBytes());
  }

  public void setS185aActGroup(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS185aActGroupBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aActGroupBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS185aActLineCodBytes() {
    return s185aActLineCod;
  }

  public void setS185aActLineCodBytes(byte[] arg) {
    s185aActLineCod = ArrayUtils.clone(arg);
  }

  public void initS185aActLineCod() {
    s185aActLineCod =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS185aActLineCod() {
  return CommonUtils.bytesToString(getS185aActLineCodBytes());
  }

  public void setS185aActLineCod(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS185aActLineCodBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aActLineCodBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS185aYyyymmBytes() {
    return s185aYyyymm;
  }

  public void setS185aYyyymmBytes(byte[] arg) {
    s185aYyyymm = ArrayUtils.clone(arg);
  }

  public void initS185aYyyymm() {
    s185aYyyymm =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS185aYyyymm() {
  return CommonUtils.bytesToString(getS185aYyyymmBytes());
  }

  public void setS185aYyyymm(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS185aYyyymmBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aYyyymmBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS185aKouteiKeikakuIdBytes() {
    return s185aKouteiKeikakuId;
  }

  public void setS185aKouteiKeikakuIdBytes(byte[] arg) {
    s185aKouteiKeikakuId = ArrayUtils.clone(arg);
  }

  public void initS185aKouteiKeikakuId() {
    s185aKouteiKeikakuId =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getS185aKouteiKeikakuId() {
  return CommonUtils.bytesToString(getS185aKouteiKeikakuIdBytes());
  }

  public void setS185aKouteiKeikakuId(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS185aKouteiKeikakuIdBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aKouteiKeikakuIdBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS185aGKeikakuBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(126);
        for (int x = 0; x < 63; x++) {
        buffer.put(getS185aKeikakuBytes(x));
        }
    return buffer.array();
  }

  public void setS185aGKeikakuBytes(byte[] arg) {
        for (int x = 0; x < 63; x++) {
        setS185aKeikakuBytes(x, ArrayUtils.subarray(arg, 0 + 2 * x, 0 + 2 * (x + 1)));
        }
  }

  public void initS185aGKeikaku() {
        for (int x = 0; x < 63; x++) {
        initS185aKeikaku(x);
        }
  }

  public String getS185aGKeikaku() {
  return CommonUtils.bytesToString(getS185aGKeikakuBytes());
  }

  public void setS185aGKeikaku(String arg) {
  final int trailing_length = 126 - arg.length();
  if (trailing_length > 0) {
  setS185aGKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aGKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 126)));
  }
  }

  public byte[] getS185aKeikakuBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer.put(getS185aShiftDaisuBytes(a));
    return buffer.array();
  }

  public void setS185aKeikakuBytes(int a,byte[] arg) {
        setS185aShiftDaisuBytes(a,ArrayUtils.subarray(arg, 0, 2));
  }

  public void initS185aKeikaku(int a) {
        initS185aShiftDaisu(a);
  }

  public String getS185aKeikaku(int a) {
  return CommonUtils.bytesToString(getS185aKeikakuBytes(a));
  }

  public void setS185aKeikaku(int a,String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setS185aKeikakuBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aKeikakuBytes(a,CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getS185aShiftDaisuBytes(int a) {
    return s185aShiftDaisu[a];
  }

  public void setS185aShiftDaisuBytes(int a,byte[] arg) {
    s185aShiftDaisu[a] = ArrayUtils.clone(arg);
  }

  public void initS185aShiftDaisu(int a) {
    s185aShiftDaisu[a] =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getS185aShiftDaisu(int a) {
    return CommonUtils.packedDecimalToNumber(getS185aShiftDaisuBytes(a));
  }

  public void setS185aShiftDaisu(int a,long arg) {
  setS185aShiftDaisuBytes(a,CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getS185aTimeStampBytes() {
    return s185aTimeStamp;
  }

  public void setS185aTimeStampBytes(byte[] arg) {
    s185aTimeStamp = ArrayUtils.clone(arg);
  }

  public void initS185aTimeStamp() {
    s185aTimeStamp =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getS185aTimeStamp() {
  return CommonUtils.bytesToString(getS185aTimeStampBytes());
  }

  public void setS185aTimeStamp(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS185aTimeStampBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS185aTimeStampBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getSequence180Cr06Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(82);
        buffer.put(getResponseCodecr06Bytes());
        buffer.put(getRecordBufcr06Bytes());
    return buffer.array();
  }

  public void setSequence180Cr06Bytes(byte[] arg) {
        setResponseCodecr06Bytes(ArrayUtils.subarray(arg, 0, 2));
        setRecordBufcr06Bytes(ArrayUtils.subarray(arg, 2, 82));
  }

  public void initSequence180Cr06() {
        initResponseCodecr06();
        initRecordBufcr06();
  }

  public String getSequence180Cr06() {
  return CommonUtils.bytesToString(getSequence180Cr06Bytes());
  }

  public void setSequence180Cr06(String arg) {
  final int trailing_length = 82 - arg.length();
  if (trailing_length > 0) {
  setSequence180Cr06Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setSequence180Cr06Bytes(CommonUtils.stringToBytes(arg.substring(0, 82)));
  }
  }

  public byte[] getResponseCodecr06Bytes() {
    return responseCodecr06;
  }

  public void setResponseCodecr06Bytes(byte[] arg) {
    responseCodecr06 = ArrayUtils.clone(arg);
  }

  public void initResponseCodecr06() {
    responseCodecr06 =CommonUtils.numberToBinary(0, 2);
  }

  public long getResponseCodecr06() {
    return CommonUtils.binaryToNumber(getResponseCodecr06Bytes());
  }

  public void setResponseCodecr06(long arg) {
  setResponseCodecr06Bytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getRecordBufcr06Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(80);
        buffer.put(getS180aControlKeyBytes());
        buffer.put(getS180aActDetailBytes());
        buffer.put(getS180aMsDetailBytes());
    return buffer.array();
  }

  public void setRecordBufcr06Bytes(byte[] arg) {
        setS180aControlKeyBytes(ArrayUtils.subarray(arg, 0, 12));
        setS180aActDetailBytes(ArrayUtils.subarray(arg, 12, 73));
        setS180aMsDetailBytes(ArrayUtils.subarray(arg, 73, 80));
  }

  public void initRecordBufcr06() {
        initS180aControlKey();
        initS180aActDetail();
        initS180aMsDetail();
  }

  public String getRecordBufcr06() {
  return CommonUtils.bytesToString(getRecordBufcr06Bytes());
  }

  public void setRecordBufcr06(String arg) {
  final int trailing_length = 80 - arg.length();
  if (trailing_length > 0) {
  setRecordBufcr06Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setRecordBufcr06Bytes(CommonUtils.stringToBytes(arg.substring(0, 80)));
  }
  }

  public byte[] getS180aControlKeyBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(12);
        buffer.put(getS180aKoujouKubunBytes());
        buffer.put(getS180aKoujouControlNoBytes());
    return buffer.array();
  }

  public void setS180aControlKeyBytes(byte[] arg) {
        setS180aKoujouKubunBytes(ArrayUtils.subarray(arg, 0, 1));
        setS180aKoujouControlNoBytes(ArrayUtils.subarray(arg, 1, 12));
  }

  public void initS180aControlKey() {
        initS180aKoujouKubun();
        initS180aKoujouControlNo();
  }

  public String getS180aControlKey() {
  return CommonUtils.bytesToString(getS180aControlKeyBytes());
  }

  public void setS180aControlKey(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setS180aControlKeyBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aControlKeyBytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getS180aKoujouKubunBytes() {
    return s180aKoujouKubun;
  }

  public void setS180aKoujouKubunBytes(byte[] arg) {
    s180aKoujouKubun = ArrayUtils.clone(arg);
  }

  public void initS180aKoujouKubun() {
    s180aKoujouKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS180aKoujouKubun() {
  return CommonUtils.bytesToString(getS180aKoujouKubunBytes());
  }

  public void setS180aKoujouKubun(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS180aKoujouKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aKoujouKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS180aKoujouControlNoBytes() {
    return s180aKoujouControlNo;
  }

  public void setS180aKoujouControlNoBytes(byte[] arg) {
    s180aKoujouControlNo = ArrayUtils.clone(arg);
  }

  public void initS180aKoujouControlNo() {
    s180aKoujouControlNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getS180aKoujouControlNo() {
  return CommonUtils.bytesToString(getS180aKoujouControlNoBytes());
  }

  public void setS180aKoujouControlNo(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setS180aKoujouControlNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aKoujouControlNoBytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getS180aActDetailBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(61);
        buffer.put(getS180aActLineCodeBytes());
        buffer.put(getS180aPoint2SeqNoBytes());
        buffer.put(getS180aPoint3SeqNoBytes());
        buffer.put(getS180aPoint4SeqNoBytes());
        buffer.put(getS180aTransportDirectionSymBytes());
        buffer.put(getS180aDoukiseisanSeqNoBytes());
        buffer.put(getS180aDeliveryPlanNonMarginBytes());
    return buffer.array();
  }

  public void setS180aActDetailBytes(byte[] arg) {
        setS180aActLineCodeBytes(ArrayUtils.subarray(arg, 0, 6));
        setS180aPoint2SeqNoBytes(ArrayUtils.subarray(arg, 6, 19));
        setS180aPoint3SeqNoBytes(ArrayUtils.subarray(arg, 19, 32));
        setS180aPoint4SeqNoBytes(ArrayUtils.subarray(arg, 32, 45));
        setS180aTransportDirectionSymBytes(ArrayUtils.subarray(arg, 45, 46));
        setS180aDoukiseisanSeqNoBytes(ArrayUtils.subarray(arg, 46, 50));
        setS180aDeliveryPlanNonMarginBytes(ArrayUtils.subarray(arg, 50, 61));
  }

  public void initS180aActDetail() {
        initS180aActLineCode();
        initS180aPoint2SeqNo();
        initS180aPoint3SeqNo();
        initS180aPoint4SeqNo();
        initS180aTransportDirectionSym();
        initS180aDoukiseisanSeqNo();
        initS180aDeliveryPlanNonMargin();
  }

  public String getS180aActDetail() {
  return CommonUtils.bytesToString(getS180aActDetailBytes());
  }

  public void setS180aActDetail(String arg) {
  final int trailing_length = 61 - arg.length();
  if (trailing_length > 0) {
  setS180aActDetailBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aActDetailBytes(CommonUtils.stringToBytes(arg.substring(0, 61)));
  }
  }

  public byte[] getS180aActLineCodeBytes() {
    return s180aActLineCode;
  }

  public void setS180aActLineCodeBytes(byte[] arg) {
    s180aActLineCode = ArrayUtils.clone(arg);
  }

  public void initS180aActLineCode() {
    s180aActLineCode =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS180aActLineCode() {
  return CommonUtils.bytesToString(getS180aActLineCodeBytes());
  }

  public void setS180aActLineCode(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS180aActLineCodeBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aActLineCodeBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS180aPoint2SeqNoBytes() {
    return s180aPoint2SeqNo;
  }

  public void setS180aPoint2SeqNoBytes(byte[] arg) {
    s180aPoint2SeqNo = ArrayUtils.clone(arg);
  }

  public void initS180aPoint2SeqNo() {
    s180aPoint2SeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));
  }

  public String getS180aPoint2SeqNo() {
  return CommonUtils.bytesToString(getS180aPoint2SeqNoBytes());
  }

  public void setS180aPoint2SeqNo(String arg) {
  final int trailing_length = 13 - arg.length();
  if (trailing_length > 0) {
  setS180aPoint2SeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aPoint2SeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 13)));
  }
  }

  public byte[] getS180aPoint3SeqNoBytes() {
    return s180aPoint3SeqNo;
  }

  public void setS180aPoint3SeqNoBytes(byte[] arg) {
    s180aPoint3SeqNo = ArrayUtils.clone(arg);
  }

  public void initS180aPoint3SeqNo() {
    s180aPoint3SeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));
  }

  public String getS180aPoint3SeqNo() {
  return CommonUtils.bytesToString(getS180aPoint3SeqNoBytes());
  }

  public void setS180aPoint3SeqNo(String arg) {
  final int trailing_length = 13 - arg.length();
  if (trailing_length > 0) {
  setS180aPoint3SeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aPoint3SeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 13)));
  }
  }

  public byte[] getS180aPoint4SeqNoBytes() {
    return s180aPoint4SeqNo;
  }

  public void setS180aPoint4SeqNoBytes(byte[] arg) {
    s180aPoint4SeqNo = ArrayUtils.clone(arg);
  }

  public void initS180aPoint4SeqNo() {
    s180aPoint4SeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));
  }

  public String getS180aPoint4SeqNo() {
  return CommonUtils.bytesToString(getS180aPoint4SeqNoBytes());
  }

  public void setS180aPoint4SeqNo(String arg) {
  final int trailing_length = 13 - arg.length();
  if (trailing_length > 0) {
  setS180aPoint4SeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aPoint4SeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 13)));
  }
  }

  public byte[] getS180aTransportDirectionSymBytes() {
    return s180aTransportDirectionSym;
  }

  public void setS180aTransportDirectionSymBytes(byte[] arg) {
    s180aTransportDirectionSym = ArrayUtils.clone(arg);
  }

  public void initS180aTransportDirectionSym() {
    s180aTransportDirectionSym =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS180aTransportDirectionSym() {
  return CommonUtils.bytesToString(getS180aTransportDirectionSymBytes());
  }

  public void setS180aTransportDirectionSym(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS180aTransportDirectionSymBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aTransportDirectionSymBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getS180aDoukiseisanSeqNoBytes() {
    return s180aDoukiseisanSeqNo;
  }

  public void setS180aDoukiseisanSeqNoBytes(byte[] arg) {
    s180aDoukiseisanSeqNo = ArrayUtils.clone(arg);
  }

  public void initS180aDoukiseisanSeqNo() {
    s180aDoukiseisanSeqNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getS180aDoukiseisanSeqNo() {
  return CommonUtils.bytesToString(getS180aDoukiseisanSeqNoBytes());
  }

  public void setS180aDoukiseisanSeqNo(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setS180aDoukiseisanSeqNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aDoukiseisanSeqNoBytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getS180aDeliveryPlanNonMarginBytes() {
    return s180aDeliveryPlanNonMargin;
  }

  public void setS180aDeliveryPlanNonMarginBytes(byte[] arg) {
    s180aDeliveryPlanNonMargin = ArrayUtils.clone(arg);
  }

  public void initS180aDeliveryPlanNonMargin() {
    s180aDeliveryPlanNonMargin =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getS180aDeliveryPlanNonMargin() {
  return CommonUtils.bytesToString(getS180aDeliveryPlanNonMarginBytes());
  }

  public void setS180aDeliveryPlanNonMargin(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setS180aDeliveryPlanNonMarginBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aDeliveryPlanNonMarginBytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getS180aMsDetailBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(7);
        buffer.put(getS180aProductionMonthBytes());
        buffer.put(getS180aMsNoBytes());
    return buffer.array();
  }

  public void setS180aMsDetailBytes(byte[] arg) {
        setS180aProductionMonthBytes(ArrayUtils.subarray(arg, 0, 6));
        setS180aMsNoBytes(ArrayUtils.subarray(arg, 6, 7));
  }

  public void initS180aMsDetail() {
        initS180aProductionMonth();
        initS180aMsNo();
  }

  public String getS180aMsDetail() {
  return CommonUtils.bytesToString(getS180aMsDetailBytes());
  }

  public void setS180aMsDetail(String arg) {
  final int trailing_length = 7 - arg.length();
  if (trailing_length > 0) {
  setS180aMsDetailBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aMsDetailBytes(CommonUtils.stringToBytes(arg.substring(0, 7)));
  }
  }

  public byte[] getS180aProductionMonthBytes() {
    return s180aProductionMonth;
  }

  public void setS180aProductionMonthBytes(byte[] arg) {
    s180aProductionMonth = ArrayUtils.clone(arg);
  }

  public void initS180aProductionMonth() {
    s180aProductionMonth =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getS180aProductionMonth() {
  return CommonUtils.bytesToString(getS180aProductionMonthBytes());
  }

  public void setS180aProductionMonth(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setS180aProductionMonthBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aProductionMonthBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getS180aMsNoBytes() {
    return s180aMsNo;
  }

  public void setS180aMsNoBytes(byte[] arg) {
    s180aMsNo = ArrayUtils.clone(arg);
  }

  public void initS180aMsNo() {
    s180aMsNo =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getS180aMsNo() {
  return CommonUtils.bytesToString(getS180aMsNoBytes());
  }

  public void setS180aMsNo(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setS180aMsNoBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setS180aMsNoBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getAllCursorStatusFlagsBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(24);
        buffer.put(getCr01DeclaredBytes());
        buffer.put(getCr01CountDeclaredBytes());
        buffer.put(getCr01OpenedBytes());
        buffer.put(getCr01CountOpenedBytes());
        buffer.put(getCr02DeclaredBytes());
        buffer.put(getCr02CountDeclaredBytes());
        buffer.put(getCr02OpenedBytes());
        buffer.put(getCr02CountOpenedBytes());
        buffer.put(getCr03DeclaredBytes());
        buffer.put(getCr03CountDeclaredBytes());
        buffer.put(getCr03OpenedBytes());
        buffer.put(getCr03CountOpenedBytes());
        buffer.put(getCr04DeclaredBytes());
        buffer.put(getCr04CountDeclaredBytes());
        buffer.put(getCr04OpenedBytes());
        buffer.put(getCr04CountOpenedBytes());
        buffer.put(getCr05DeclaredBytes());
        buffer.put(getCr05CountDeclaredBytes());
        buffer.put(getCr05OpenedBytes());
        buffer.put(getCr05CountOpenedBytes());
        buffer.put(getCr06DeclaredBytes());
        buffer.put(getCr06CountDeclaredBytes());
        buffer.put(getCr06OpenedBytes());
        buffer.put(getCr06CountOpenedBytes());
    return buffer.array();
  }

  public void setAllCursorStatusFlagsBytes(byte[] arg) {
        setCr01DeclaredBytes(ArrayUtils.subarray(arg, 0, 1));
        setCr01CountDeclaredBytes(ArrayUtils.subarray(arg, 1, 2));
        setCr01OpenedBytes(ArrayUtils.subarray(arg, 2, 3));
        setCr01CountOpenedBytes(ArrayUtils.subarray(arg, 3, 4));
        setCr02DeclaredBytes(ArrayUtils.subarray(arg, 4, 5));
        setCr02CountDeclaredBytes(ArrayUtils.subarray(arg, 5, 6));
        setCr02OpenedBytes(ArrayUtils.subarray(arg, 6, 7));
        setCr02CountOpenedBytes(ArrayUtils.subarray(arg, 7, 8));
        setCr03DeclaredBytes(ArrayUtils.subarray(arg, 8, 9));
        setCr03CountDeclaredBytes(ArrayUtils.subarray(arg, 9, 10));
        setCr03OpenedBytes(ArrayUtils.subarray(arg, 10, 11));
        setCr03CountOpenedBytes(ArrayUtils.subarray(arg, 11, 12));
        setCr04DeclaredBytes(ArrayUtils.subarray(arg, 12, 13));
        setCr04CountDeclaredBytes(ArrayUtils.subarray(arg, 13, 14));
        setCr04OpenedBytes(ArrayUtils.subarray(arg, 14, 15));
        setCr04CountOpenedBytes(ArrayUtils.subarray(arg, 15, 16));
        setCr05DeclaredBytes(ArrayUtils.subarray(arg, 16, 17));
        setCr05CountDeclaredBytes(ArrayUtils.subarray(arg, 17, 18));
        setCr05OpenedBytes(ArrayUtils.subarray(arg, 18, 19));
        setCr05CountOpenedBytes(ArrayUtils.subarray(arg, 19, 20));
        setCr06DeclaredBytes(ArrayUtils.subarray(arg, 20, 21));
        setCr06CountDeclaredBytes(ArrayUtils.subarray(arg, 21, 22));
        setCr06OpenedBytes(ArrayUtils.subarray(arg, 22, 23));
        setCr06CountOpenedBytes(ArrayUtils.subarray(arg, 23, 24));
  }

  public void initAllCursorStatusFlags() {
        initCr01Declared();
        initCr01CountDeclared();
        initCr01Opened();
        initCr01CountOpened();
        initCr02Declared();
        initCr02CountDeclared();
        initCr02Opened();
        initCr02CountOpened();
        initCr03Declared();
        initCr03CountDeclared();
        initCr03Opened();
        initCr03CountOpened();
        initCr04Declared();
        initCr04CountDeclared();
        initCr04Opened();
        initCr04CountOpened();
        initCr05Declared();
        initCr05CountDeclared();
        initCr05Opened();
        initCr05CountOpened();
        initCr06Declared();
        initCr06CountDeclared();
        initCr06Opened();
        initCr06CountOpened();
  }

  public String getAllCursorStatusFlags() {
  return CommonUtils.bytesToString(getAllCursorStatusFlagsBytes());
  }

  public void setAllCursorStatusFlags(String arg) {
  final int trailing_length = 24 - arg.length();
  if (trailing_length > 0) {
  setAllCursorStatusFlagsBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setAllCursorStatusFlagsBytes(CommonUtils.stringToBytes(arg.substring(0, 24)));
  }
  }

  public byte[] getCr01DeclaredBytes() {
    return cr01Declared;
  }

  public void setCr01DeclaredBytes(byte[] arg) {
    cr01Declared = ArrayUtils.clone(arg);
  }

  public void initCr01Declared() {
    cr01Declared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr01Declared() {
  return CommonUtils.bytesToString(getCr01DeclaredBytes());
  }

  public void setCr01Declared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr01DeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr01DeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr01CountDeclaredBytes() {
    return cr01CountDeclared;
  }

  public void setCr01CountDeclaredBytes(byte[] arg) {
    cr01CountDeclared = ArrayUtils.clone(arg);
  }

  public void initCr01CountDeclared() {
    cr01CountDeclared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr01CountDeclared() {
  return CommonUtils.bytesToString(getCr01CountDeclaredBytes());
  }

  public void setCr01CountDeclared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr01CountDeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr01CountDeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr01OpenedBytes() {
    return cr01Opened;
  }

  public void setCr01OpenedBytes(byte[] arg) {
    cr01Opened = ArrayUtils.clone(arg);
  }

  public void initCr01Opened() {
    cr01Opened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr01Opened() {
  return CommonUtils.bytesToString(getCr01OpenedBytes());
  }

  public void setCr01Opened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr01OpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr01OpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr01CountOpenedBytes() {
    return cr01CountOpened;
  }

  public void setCr01CountOpenedBytes(byte[] arg) {
    cr01CountOpened = ArrayUtils.clone(arg);
  }

  public void initCr01CountOpened() {
    cr01CountOpened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr01CountOpened() {
  return CommonUtils.bytesToString(getCr01CountOpenedBytes());
  }

  public void setCr01CountOpened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr01CountOpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr01CountOpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr02DeclaredBytes() {
    return cr02Declared;
  }

  public void setCr02DeclaredBytes(byte[] arg) {
    cr02Declared = ArrayUtils.clone(arg);
  }

  public void initCr02Declared() {
    cr02Declared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr02Declared() {
  return CommonUtils.bytesToString(getCr02DeclaredBytes());
  }

  public void setCr02Declared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr02DeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr02DeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr02CountDeclaredBytes() {
    return cr02CountDeclared;
  }

  public void setCr02CountDeclaredBytes(byte[] arg) {
    cr02CountDeclared = ArrayUtils.clone(arg);
  }

  public void initCr02CountDeclared() {
    cr02CountDeclared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr02CountDeclared() {
  return CommonUtils.bytesToString(getCr02CountDeclaredBytes());
  }

  public void setCr02CountDeclared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr02CountDeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr02CountDeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr02OpenedBytes() {
    return cr02Opened;
  }

  public void setCr02OpenedBytes(byte[] arg) {
    cr02Opened = ArrayUtils.clone(arg);
  }

  public void initCr02Opened() {
    cr02Opened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr02Opened() {
  return CommonUtils.bytesToString(getCr02OpenedBytes());
  }

  public void setCr02Opened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr02OpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr02OpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr02CountOpenedBytes() {
    return cr02CountOpened;
  }

  public void setCr02CountOpenedBytes(byte[] arg) {
    cr02CountOpened = ArrayUtils.clone(arg);
  }

  public void initCr02CountOpened() {
    cr02CountOpened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr02CountOpened() {
  return CommonUtils.bytesToString(getCr02CountOpenedBytes());
  }

  public void setCr02CountOpened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr02CountOpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr02CountOpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr03DeclaredBytes() {
    return cr03Declared;
  }

  public void setCr03DeclaredBytes(byte[] arg) {
    cr03Declared = ArrayUtils.clone(arg);
  }

  public void initCr03Declared() {
    cr03Declared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr03Declared() {
  return CommonUtils.bytesToString(getCr03DeclaredBytes());
  }

  public void setCr03Declared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr03DeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr03DeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr03CountDeclaredBytes() {
    return cr03CountDeclared;
  }

  public void setCr03CountDeclaredBytes(byte[] arg) {
    cr03CountDeclared = ArrayUtils.clone(arg);
  }

  public void initCr03CountDeclared() {
    cr03CountDeclared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr03CountDeclared() {
  return CommonUtils.bytesToString(getCr03CountDeclaredBytes());
  }

  public void setCr03CountDeclared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr03CountDeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr03CountDeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr03OpenedBytes() {
    return cr03Opened;
  }

  public void setCr03OpenedBytes(byte[] arg) {
    cr03Opened = ArrayUtils.clone(arg);
  }

  public void initCr03Opened() {
    cr03Opened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr03Opened() {
  return CommonUtils.bytesToString(getCr03OpenedBytes());
  }

  public void setCr03Opened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr03OpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr03OpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr03CountOpenedBytes() {
    return cr03CountOpened;
  }

  public void setCr03CountOpenedBytes(byte[] arg) {
    cr03CountOpened = ArrayUtils.clone(arg);
  }

  public void initCr03CountOpened() {
    cr03CountOpened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr03CountOpened() {
  return CommonUtils.bytesToString(getCr03CountOpenedBytes());
  }

  public void setCr03CountOpened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr03CountOpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr03CountOpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr04DeclaredBytes() {
    return cr04Declared;
  }

  public void setCr04DeclaredBytes(byte[] arg) {
    cr04Declared = ArrayUtils.clone(arg);
  }

  public void initCr04Declared() {
    cr04Declared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr04Declared() {
  return CommonUtils.bytesToString(getCr04DeclaredBytes());
  }

  public void setCr04Declared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr04DeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr04DeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr04CountDeclaredBytes() {
    return cr04CountDeclared;
  }

  public void setCr04CountDeclaredBytes(byte[] arg) {
    cr04CountDeclared = ArrayUtils.clone(arg);
  }

  public void initCr04CountDeclared() {
    cr04CountDeclared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr04CountDeclared() {
  return CommonUtils.bytesToString(getCr04CountDeclaredBytes());
  }

  public void setCr04CountDeclared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr04CountDeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr04CountDeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr04OpenedBytes() {
    return cr04Opened;
  }

  public void setCr04OpenedBytes(byte[] arg) {
    cr04Opened = ArrayUtils.clone(arg);
  }

  public void initCr04Opened() {
    cr04Opened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr04Opened() {
  return CommonUtils.bytesToString(getCr04OpenedBytes());
  }

  public void setCr04Opened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr04OpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr04OpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr04CountOpenedBytes() {
    return cr04CountOpened;
  }

  public void setCr04CountOpenedBytes(byte[] arg) {
    cr04CountOpened = ArrayUtils.clone(arg);
  }

  public void initCr04CountOpened() {
    cr04CountOpened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr04CountOpened() {
  return CommonUtils.bytesToString(getCr04CountOpenedBytes());
  }

  public void setCr04CountOpened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr04CountOpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr04CountOpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr05DeclaredBytes() {
    return cr05Declared;
  }

  public void setCr05DeclaredBytes(byte[] arg) {
    cr05Declared = ArrayUtils.clone(arg);
  }

  public void initCr05Declared() {
    cr05Declared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr05Declared() {
  return CommonUtils.bytesToString(getCr05DeclaredBytes());
  }

  public void setCr05Declared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr05DeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr05DeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr05CountDeclaredBytes() {
    return cr05CountDeclared;
  }

  public void setCr05CountDeclaredBytes(byte[] arg) {
    cr05CountDeclared = ArrayUtils.clone(arg);
  }

  public void initCr05CountDeclared() {
    cr05CountDeclared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr05CountDeclared() {
  return CommonUtils.bytesToString(getCr05CountDeclaredBytes());
  }

  public void setCr05CountDeclared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr05CountDeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr05CountDeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr05OpenedBytes() {
    return cr05Opened;
  }

  public void setCr05OpenedBytes(byte[] arg) {
    cr05Opened = ArrayUtils.clone(arg);
  }

  public void initCr05Opened() {
    cr05Opened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr05Opened() {
  return CommonUtils.bytesToString(getCr05OpenedBytes());
  }

  public void setCr05Opened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr05OpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr05OpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr05CountOpenedBytes() {
    return cr05CountOpened;
  }

  public void setCr05CountOpenedBytes(byte[] arg) {
    cr05CountOpened = ArrayUtils.clone(arg);
  }

  public void initCr05CountOpened() {
    cr05CountOpened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr05CountOpened() {
  return CommonUtils.bytesToString(getCr05CountOpenedBytes());
  }

  public void setCr05CountOpened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr05CountOpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr05CountOpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr06DeclaredBytes() {
    return cr06Declared;
  }

  public void setCr06DeclaredBytes(byte[] arg) {
    cr06Declared = ArrayUtils.clone(arg);
  }

  public void initCr06Declared() {
    cr06Declared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr06Declared() {
  return CommonUtils.bytesToString(getCr06DeclaredBytes());
  }

  public void setCr06Declared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr06DeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr06DeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr06CountDeclaredBytes() {
    return cr06CountDeclared;
  }

  public void setCr06CountDeclaredBytes(byte[] arg) {
    cr06CountDeclared = ArrayUtils.clone(arg);
  }

  public void initCr06CountDeclared() {
    cr06CountDeclared =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr06CountDeclared() {
  return CommonUtils.bytesToString(getCr06CountDeclaredBytes());
  }

  public void setCr06CountDeclared(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr06CountDeclaredBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr06CountDeclaredBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr06OpenedBytes() {
    return cr06Opened;
  }

  public void setCr06OpenedBytes(byte[] arg) {
    cr06Opened = ArrayUtils.clone(arg);
  }

  public void initCr06Opened() {
    cr06Opened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr06Opened() {
  return CommonUtils.bytesToString(getCr06OpenedBytes());
  }

  public void setCr06Opened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr06OpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr06OpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCr06CountOpenedBytes() {
    return cr06CountOpened;
  }

  public void setCr06CountOpenedBytes(byte[] arg) {
    cr06CountOpened = ArrayUtils.clone(arg);
  }

  public void initCr06CountOpened() {
    cr06CountOpened =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getCr06CountOpened() {
  return CommonUtils.bytesToString(getCr06CountOpenedBytes());
  }

  public void setCr06CountOpened(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setCr06CountOpenedBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCr06CountOpenedBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHostForStatus181Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(1087);
        buffer.put(getHKoujouKubun181Bytes());
        buffer.put(getHKoujouControlNo181Bytes());
        buffer.put(getHModel181Bytes());
        buffer.put(getHColor181Bytes());
        buffer.put(getHUchibari181Bytes());
        buffer.put(getHExNo181Bytes());
        buffer.put(getHShimukechi181Bytes());
        buffer.put(getHLineMain181Bytes());
        buffer.put(getHLineMetal181Bytes());
        buffer.put(getHLinePaint181Bytes());
        buffer.put(getHLineTrim181Bytes());
        buffer.put(getHKokuyuKubun181Bytes());
        buffer.put(getHKijunShakei181Bytes());
        buffer.put(getHDakokuKatashiki181Bytes());
        buffer.put(getHChassisNo181Bytes());
        buffer.put(getHEngKatashiki181Bytes());
        buffer.put(getHEngNo181Bytes());
        buffer.put(getHOrgModel181Bytes());
        buffer.put(getHOrgColor181Bytes());
        buffer.put(getHOrgUchibari181Bytes());
        buffer.put(getHOrgExNo181Bytes());
        buffer.put(getHOrgLineKubun181Bytes());
        buffer.put(getHShakeiCode181Bytes());
        buffer.put(getHShameiCode181Bytes());
        buffer.put(getHOrderKubun181Bytes());
        buffer.put(getHDealerNo181Bytes());
        buffer.put(getHOrderNo181Bytes());
        buffer.put(getHComfirmedOrderNo181Bytes());
        buffer.put(getHCustomerName181Bytes());
        buffer.put(getHTenjiPryCode181Bytes());
        buffer.put(getHStatusPoint181Bytes());
        buffer.put(getHJissekiJikoku01181Bytes());
        buffer.put(getHJissekiJikoku02181Bytes());
        buffer.put(getHJissekiJikoku03181Bytes());
        buffer.put(getHJissekiJikoku04181Bytes());
        buffer.put(getHJissekiJikoku05181Bytes());
        buffer.put(getHJissekiJikoku06181Bytes());
        buffer.put(getHJissekiJikoku07181Bytes());
        buffer.put(getHJissekiJikoku08181Bytes());
        buffer.put(getHJissekiJikoku09181Bytes());
        buffer.put(getHJissekiJikoku10181Bytes());
        buffer.put(getHJissekiJikoku11181Bytes());
        buffer.put(getHJissekiJikoku12181Bytes());
        buffer.put(getHJissekiJikoku13181Bytes());
        buffer.put(getHJissekiJikoku14181Bytes());
        buffer.put(getHJissekiJikoku15181Bytes());
        buffer.put(getHJissekiJikoku16181Bytes());
        buffer.put(getHJissekiJikoku17181Bytes());
        buffer.put(getHOriginalKeikaku01181Bytes());
        buffer.put(getHOriginalKeikaku02181Bytes());
        buffer.put(getHOriginalKeikaku03181Bytes());
        buffer.put(getHOriginalKeikaku04181Bytes());
        buffer.put(getHOriginalKeikaku05181Bytes());
        buffer.put(getHOriginalKeikaku06181Bytes());
        buffer.put(getHOriginalKeikaku07181Bytes());
        buffer.put(getHOriginalKeikaku08181Bytes());
        buffer.put(getHOriginalKeikaku09181Bytes());
        buffer.put(getHOriginalKeikaku10181Bytes());
        buffer.put(getHOriginalKeikaku11181Bytes());
        buffer.put(getHOriginalKeikaku12181Bytes());
        buffer.put(getHOriginalKeikaku13181Bytes());
        buffer.put(getHOriginalKeikaku14181Bytes());
        buffer.put(getHOriginalKeikaku15181Bytes());
        buffer.put(getHOriginalKeikaku16181Bytes());
        buffer.put(getHOriginalKeikaku17181Bytes());
        buffer.put(getHRevised2Keikaku01181Bytes());
        buffer.put(getHRevised2Keikaku02181Bytes());
        buffer.put(getHRevised2Keikaku03181Bytes());
        buffer.put(getHRevised2Keikaku04181Bytes());
        buffer.put(getHRevised2Keikaku05181Bytes());
        buffer.put(getHRevised2Keikaku06181Bytes());
        buffer.put(getHRevised2Keikaku07181Bytes());
        buffer.put(getHRevised2Keikaku08181Bytes());
        buffer.put(getHRevised2Keikaku09181Bytes());
        buffer.put(getHRevised2Keikaku10181Bytes());
        buffer.put(getHRevised2Keikaku11181Bytes());
        buffer.put(getHRevised2Keikaku12181Bytes());
        buffer.put(getHRevised2Keikaku13181Bytes());
        buffer.put(getHRevised2Keikaku14181Bytes());
        buffer.put(getHRevised2Keikaku15181Bytes());
        buffer.put(getHRevised2Keikaku16181Bytes());
        buffer.put(getHRevised2Keikaku17181Bytes());
        buffer.put(getHRevised1Keikaku01181Bytes());
        buffer.put(getHRevised1Keikaku02181Bytes());
        buffer.put(getHRevised1Keikaku03181Bytes());
        buffer.put(getHRevised1Keikaku04181Bytes());
        buffer.put(getHRevised1Keikaku05181Bytes());
        buffer.put(getHRevised1Keikaku06181Bytes());
        buffer.put(getHRevised1Keikaku07181Bytes());
        buffer.put(getHRevised1Keikaku08181Bytes());
        buffer.put(getHRevised1Keikaku09181Bytes());
        buffer.put(getHRevised1Keikaku10181Bytes());
        buffer.put(getHRevised1Keikaku11181Bytes());
        buffer.put(getHRevised1Keikaku12181Bytes());
        buffer.put(getHRevised1Keikaku13181Bytes());
        buffer.put(getHRevised1Keikaku14181Bytes());
        buffer.put(getHRevised1Keikaku15181Bytes());
        buffer.put(getHRevised1Keikaku16181Bytes());
        buffer.put(getHRevised1Keikaku17181Bytes());
        buffer.put(getHIkkatsuSym201181Bytes());
        buffer.put(getHIkkatsuSym202181Bytes());
        buffer.put(getHIkkatsuSym203181Bytes());
        buffer.put(getHIkkatsuSym204181Bytes());
        buffer.put(getHIkkatsuSym205181Bytes());
        buffer.put(getHIkkatsuSym206181Bytes());
        buffer.put(getHIkkatsuSym207181Bytes());
        buffer.put(getHIkkatsuSym208181Bytes());
        buffer.put(getHIkkatsuSym209181Bytes());
        buffer.put(getHIkkatsuSym210181Bytes());
        buffer.put(getHIkkatsuSym211181Bytes());
        buffer.put(getHIkkatsuSym212181Bytes());
        buffer.put(getHIkkatsuSym213181Bytes());
        buffer.put(getHIkkatsuSym214181Bytes());
        buffer.put(getHIkkatsuSym215181Bytes());
        buffer.put(getHIkkatsuSym216181Bytes());
        buffer.put(getHIkkatsuSym217181Bytes());
        buffer.put(getHIkkatsuSym101181Bytes());
        buffer.put(getHIkkatsuSym102181Bytes());
        buffer.put(getHIkkatsuSym103181Bytes());
        buffer.put(getHIkkatsuSym104181Bytes());
        buffer.put(getHIkkatsuSym105181Bytes());
        buffer.put(getHIkkatsuSym106181Bytes());
        buffer.put(getHIkkatsuSym107181Bytes());
        buffer.put(getHIkkatsuSym108181Bytes());
        buffer.put(getHIkkatsuSym109181Bytes());
        buffer.put(getHIkkatsuSym110181Bytes());
        buffer.put(getHIkkatsuSym111181Bytes());
        buffer.put(getHIkkatsuSym112181Bytes());
        buffer.put(getHIkkatsuSym113181Bytes());
        buffer.put(getHIkkatsuSym114181Bytes());
        buffer.put(getHIkkatsuSym115181Bytes());
        buffer.put(getHIkkatsuSym116181Bytes());
        buffer.put(getHIkkatsuSym117181Bytes());
        buffer.put(getHYoteiInputJikoku01181Bytes());
        buffer.put(getHYoteiInputJikoku02181Bytes());
        buffer.put(getHYoteiInputJikoku03181Bytes());
        buffer.put(getHYoteiInputJikoku04181Bytes());
        buffer.put(getHYoteiInputJikoku05181Bytes());
        buffer.put(getHYoteiInputJikoku06181Bytes());
        buffer.put(getHYoteiInputJikoku07181Bytes());
        buffer.put(getHYoteiInputJikoku08181Bytes());
        buffer.put(getHYoteiInputJikoku09181Bytes());
        buffer.put(getHYoteiInputJikoku10181Bytes());
        buffer.put(getHYoteiInputJikoku11181Bytes());
        buffer.put(getHYoteiInputJikoku12181Bytes());
        buffer.put(getHYoteiInputJikoku13181Bytes());
        buffer.put(getHYoteiInputJikoku14181Bytes());
        buffer.put(getHYoteiInputJikoku15181Bytes());
        buffer.put(getHYoteiInputJikoku16181Bytes());
        buffer.put(getHYoteiInputJikoku17181Bytes());
        buffer.put(getHHanedashiRiyuu101181Bytes());
        buffer.put(getHHanedashiRiyuu102181Bytes());
        buffer.put(getHHanedashiRiyuu103181Bytes());
        buffer.put(getHHanedashiRiyuu104181Bytes());
        buffer.put(getHHanedashiRiyuu105181Bytes());
        buffer.put(getHHanedashiRiyuu106181Bytes());
        buffer.put(getHHanedashiRiyuu107181Bytes());
        buffer.put(getHHanedashiRiyuu108181Bytes());
        buffer.put(getHHanedashiRiyuu109181Bytes());
        buffer.put(getHHanedashiRiyuu110181Bytes());
        buffer.put(getHHanedashiRiyuu111181Bytes());
        buffer.put(getHHanedashiRiyuu112181Bytes());
        buffer.put(getHHanedashiRiyuu113181Bytes());
        buffer.put(getHHanedashiRiyuu114181Bytes());
        buffer.put(getHHanedashiRiyuu115181Bytes());
        buffer.put(getHHanedashiRiyuu116181Bytes());
        buffer.put(getHHanedashiRiyuu117181Bytes());
        buffer.put(getHHanedashiRiyuu201181Bytes());
        buffer.put(getHHanedashiRiyuu202181Bytes());
        buffer.put(getHHanedashiRiyuu203181Bytes());
        buffer.put(getHHanedashiRiyuu204181Bytes());
        buffer.put(getHHanedashiRiyuu205181Bytes());
        buffer.put(getHHanedashiRiyuu206181Bytes());
        buffer.put(getHHanedashiRiyuu207181Bytes());
        buffer.put(getHHanedashiRiyuu208181Bytes());
        buffer.put(getHHanedashiRiyuu209181Bytes());
        buffer.put(getHHanedashiRiyuu210181Bytes());
        buffer.put(getHHanedashiRiyuu211181Bytes());
        buffer.put(getHHanedashiRiyuu212181Bytes());
        buffer.put(getHHanedashiRiyuu213181Bytes());
        buffer.put(getHHanedashiRiyuu214181Bytes());
        buffer.put(getHHanedashiRiyuu215181Bytes());
        buffer.put(getHHanedashiRiyuu216181Bytes());
        buffer.put(getHHanedashiRiyuu217181Bytes());
        buffer.put(getHDeliveryLeadKotei181Bytes());
        buffer.put(getHDeliveryLeadYoyuu181Bytes());
        buffer.put(getHIkansaki181Bytes());
        buffer.put(getHKensaIkanShikibetsu181Bytes());
        buffer.put(getHKasoushaSym181Bytes());
        buffer.put(getHKasouMaker181Bytes());
        buffer.put(getHKasouKanryouLead181Bytes());
        buffer.put(getHTokkiJikou181Bytes());
        buffer.put(getHActSchKey181Bytes());
        buffer.put(getHActSeqNo181Bytes());
        buffer.put(getHShataiReActSeqNo181Bytes());
        buffer.put(getHFinalReActSeqNo181Bytes());
        buffer.put(getHTrimSeqNo181Bytes());
        buffer.put(getHOfflineSeqNo181Bytes());
        buffer.put(getHKankenYmd181Bytes());
        buffer.put(getHMsOfflineYmd181Bytes());
        buffer.put(getHSymTokushusha181Bytes());
        buffer.put(getHSymKouteiKeikakuGai181Bytes());
        buffer.put(getHSymZaikoZumi181Bytes());
        buffer.put(getHSymGyakubarashiGai181Bytes());
        buffer.put(getHSymSenkouMiGai181Bytes());
        buffer.put(getHSymSmDaihyou181Bytes());
        buffer.put(getHSymSmKoutei01181Bytes());
        buffer.put(getHSymSmKoutei02181Bytes());
        buffer.put(getHSymSmKoutei03181Bytes());
        buffer.put(getHSymSmKoutei04181Bytes());
        buffer.put(getHSymSmKoutei05181Bytes());
        buffer.put(getHSymSmKoutei06181Bytes());
        buffer.put(getHSymSmKoutei07181Bytes());
        buffer.put(getHSymSmKoutei08181Bytes());
        buffer.put(getHSymSmKoutei09181Bytes());
        buffer.put(getHSymSmKoutei10181Bytes());
        buffer.put(getHSymSmKoutei11181Bytes());
        buffer.put(getHSymSmKoutei12181Bytes());
        buffer.put(getHSymSmKoutei13181Bytes());
        buffer.put(getHSymSmKoutei14181Bytes());
        buffer.put(getHSymSmKoutei15181Bytes());
        buffer.put(getHSymSmKoutei16181Bytes());
        buffer.put(getHSymSmKoutei17181Bytes());
        buffer.put(getHSymZengetsuJisseki01181Bytes());
        buffer.put(getHSymZengetsuJisseki02181Bytes());
        buffer.put(getHSymZengetsuJisseki03181Bytes());
        buffer.put(getHSymZengetsuJisseki04181Bytes());
        buffer.put(getHSymZengetsuJisseki05181Bytes());
        buffer.put(getHSymZengetsuJisseki06181Bytes());
        buffer.put(getHSymZengetsuJisseki07181Bytes());
        buffer.put(getHSymZengetsuJisseki08181Bytes());
        buffer.put(getHSymZengetsuJisseki09181Bytes());
        buffer.put(getHSymZengetsuJisseki10181Bytes());
        buffer.put(getHSymZengetsuJisseki11181Bytes());
        buffer.put(getHSymZengetsuJisseki12181Bytes());
        buffer.put(getHSymZengetsuJisseki13181Bytes());
        buffer.put(getHSymZengetsuJisseki14181Bytes());
        buffer.put(getHSymZengetsuJisseki15181Bytes());
        buffer.put(getHSymZengetsuJisseki16181Bytes());
        buffer.put(getHSymZengetsuJisseki17181Bytes());
        buffer.put(getHSymTlMetal181Bytes());
        buffer.put(getHSymTlShitaP181Bytes());
        buffer.put(getHSymTlNakaP181Bytes());
        buffer.put(getHSymTlPaint181Bytes());
        buffer.put(getHSymTlFinal181Bytes());
        buffer.put(getHSymTlDeliv181Bytes());
        buffer.put(getHSymPipeLineGai181Bytes());
        buffer.put(getHSymPipeLineZumi181Bytes());
        buffer.put(getHSymKeikakuMitei181Bytes());
        buffer.put(getHSeisanHoushiki181Bytes());
        buffer.put(getHSymShisakuSha181Bytes());
        buffer.put(getHSymGyakuYunyuu181Bytes());
        buffer.put(getHHyoujiGenzaichi181Bytes());
        buffer.put(getHSalesSpec10181Bytes());
        buffer.put(getHLocalArea181Bytes());
        buffer.put(getHTimeStamp181Bytes());
        buffer.put(getHDelivEigyouHizuke181Bytes());
        buffer.put(getHSymHanedashi181Bytes());
        buffer.put(getHSeihinKubun181Bytes());
        buffer.put(getHStatus181RBytes());
        buffer.put(getHKoujouControlNo19181Bytes());
        buffer.put(getHKoujouControlNo49181Bytes());
        buffer.put(getHKoujouControlNo13181Bytes());
        buffer.put(getHModel13181Bytes());
        buffer.put(getHChassisNo16181Bytes());
    return buffer.array();
  }

  public void setHostForStatus181Bytes(byte[] arg) {
        setHKoujouKubun181Bytes(ArrayUtils.subarray(arg, 0, 1));
        setHKoujouControlNo181Bytes(ArrayUtils.subarray(arg, 1, 12));
        setHModel181Bytes(ArrayUtils.subarray(arg, 12, 30));
        setHColor181Bytes(ArrayUtils.subarray(arg, 30, 33));
        setHUchibari181Bytes(ArrayUtils.subarray(arg, 33, 34));
        setHExNo181Bytes(ArrayUtils.subarray(arg, 34, 39));
        setHShimukechi181Bytes(ArrayUtils.subarray(arg, 39, 42));
        setHLineMain181Bytes(ArrayUtils.subarray(arg, 42, 43));
        setHLineMetal181Bytes(ArrayUtils.subarray(arg, 43, 44));
        setHLinePaint181Bytes(ArrayUtils.subarray(arg, 44, 45));
        setHLineTrim181Bytes(ArrayUtils.subarray(arg, 45, 46));
        setHKokuyuKubun181Bytes(ArrayUtils.subarray(arg, 46, 47));
        setHKijunShakei181Bytes(ArrayUtils.subarray(arg, 47, 52));
        setHDakokuKatashiki181Bytes(ArrayUtils.subarray(arg, 52, 64));
        setHChassisNo181Bytes(ArrayUtils.subarray(arg, 64, 72));
        setHEngKatashiki181Bytes(ArrayUtils.subarray(arg, 72, 84));
        setHEngNo181Bytes(ArrayUtils.subarray(arg, 84, 92));
        setHOrgModel181Bytes(ArrayUtils.subarray(arg, 92, 110));
        setHOrgColor181Bytes(ArrayUtils.subarray(arg, 110, 113));
        setHOrgUchibari181Bytes(ArrayUtils.subarray(arg, 113, 114));
        setHOrgExNo181Bytes(ArrayUtils.subarray(arg, 114, 119));
        setHOrgLineKubun181Bytes(ArrayUtils.subarray(arg, 119, 123));
        setHShakeiCode181Bytes(ArrayUtils.subarray(arg, 123, 129));
        setHShameiCode181Bytes(ArrayUtils.subarray(arg, 129, 135));
        setHOrderKubun181Bytes(ArrayUtils.subarray(arg, 135, 136));
        setHDealerNo181Bytes(ArrayUtils.subarray(arg, 136, 140));
        setHOrderNo181Bytes(ArrayUtils.subarray(arg, 140, 146));
        setHComfirmedOrderNo181Bytes(ArrayUtils.subarray(arg, 146, 158));
        setHCustomerName181Bytes(ArrayUtils.subarray(arg, 158, 199));
        setHTenjiPryCode181Bytes(ArrayUtils.subarray(arg, 199, 200));
        setHStatusPoint181Bytes(ArrayUtils.subarray(arg, 200, 202));
        setHJissekiJikoku01181Bytes(ArrayUtils.subarray(arg, 202, 208));
        setHJissekiJikoku02181Bytes(ArrayUtils.subarray(arg, 208, 214));
        setHJissekiJikoku03181Bytes(ArrayUtils.subarray(arg, 214, 220));
        setHJissekiJikoku04181Bytes(ArrayUtils.subarray(arg, 220, 226));
        setHJissekiJikoku05181Bytes(ArrayUtils.subarray(arg, 226, 232));
        setHJissekiJikoku06181Bytes(ArrayUtils.subarray(arg, 232, 238));
        setHJissekiJikoku07181Bytes(ArrayUtils.subarray(arg, 238, 244));
        setHJissekiJikoku08181Bytes(ArrayUtils.subarray(arg, 244, 250));
        setHJissekiJikoku09181Bytes(ArrayUtils.subarray(arg, 250, 256));
        setHJissekiJikoku10181Bytes(ArrayUtils.subarray(arg, 256, 262));
        setHJissekiJikoku11181Bytes(ArrayUtils.subarray(arg, 262, 268));
        setHJissekiJikoku12181Bytes(ArrayUtils.subarray(arg, 268, 274));
        setHJissekiJikoku13181Bytes(ArrayUtils.subarray(arg, 274, 280));
        setHJissekiJikoku14181Bytes(ArrayUtils.subarray(arg, 280, 286));
        setHJissekiJikoku15181Bytes(ArrayUtils.subarray(arg, 286, 292));
        setHJissekiJikoku16181Bytes(ArrayUtils.subarray(arg, 292, 298));
        setHJissekiJikoku17181Bytes(ArrayUtils.subarray(arg, 298, 304));
        setHOriginalKeikaku01181Bytes(ArrayUtils.subarray(arg, 304, 310));
        setHOriginalKeikaku02181Bytes(ArrayUtils.subarray(arg, 310, 316));
        setHOriginalKeikaku03181Bytes(ArrayUtils.subarray(arg, 316, 322));
        setHOriginalKeikaku04181Bytes(ArrayUtils.subarray(arg, 322, 328));
        setHOriginalKeikaku05181Bytes(ArrayUtils.subarray(arg, 328, 334));
        setHOriginalKeikaku06181Bytes(ArrayUtils.subarray(arg, 334, 340));
        setHOriginalKeikaku07181Bytes(ArrayUtils.subarray(arg, 340, 346));
        setHOriginalKeikaku08181Bytes(ArrayUtils.subarray(arg, 346, 352));
        setHOriginalKeikaku09181Bytes(ArrayUtils.subarray(arg, 352, 358));
        setHOriginalKeikaku10181Bytes(ArrayUtils.subarray(arg, 358, 364));
        setHOriginalKeikaku11181Bytes(ArrayUtils.subarray(arg, 364, 370));
        setHOriginalKeikaku12181Bytes(ArrayUtils.subarray(arg, 370, 376));
        setHOriginalKeikaku13181Bytes(ArrayUtils.subarray(arg, 376, 382));
        setHOriginalKeikaku14181Bytes(ArrayUtils.subarray(arg, 382, 388));
        setHOriginalKeikaku15181Bytes(ArrayUtils.subarray(arg, 388, 394));
        setHOriginalKeikaku16181Bytes(ArrayUtils.subarray(arg, 394, 400));
        setHOriginalKeikaku17181Bytes(ArrayUtils.subarray(arg, 400, 406));
        setHRevised2Keikaku01181Bytes(ArrayUtils.subarray(arg, 406, 412));
        setHRevised2Keikaku02181Bytes(ArrayUtils.subarray(arg, 412, 418));
        setHRevised2Keikaku03181Bytes(ArrayUtils.subarray(arg, 418, 424));
        setHRevised2Keikaku04181Bytes(ArrayUtils.subarray(arg, 424, 430));
        setHRevised2Keikaku05181Bytes(ArrayUtils.subarray(arg, 430, 436));
        setHRevised2Keikaku06181Bytes(ArrayUtils.subarray(arg, 436, 442));
        setHRevised2Keikaku07181Bytes(ArrayUtils.subarray(arg, 442, 448));
        setHRevised2Keikaku08181Bytes(ArrayUtils.subarray(arg, 448, 454));
        setHRevised2Keikaku09181Bytes(ArrayUtils.subarray(arg, 454, 460));
        setHRevised2Keikaku10181Bytes(ArrayUtils.subarray(arg, 460, 466));
        setHRevised2Keikaku11181Bytes(ArrayUtils.subarray(arg, 466, 472));
        setHRevised2Keikaku12181Bytes(ArrayUtils.subarray(arg, 472, 478));
        setHRevised2Keikaku13181Bytes(ArrayUtils.subarray(arg, 478, 484));
        setHRevised2Keikaku14181Bytes(ArrayUtils.subarray(arg, 484, 490));
        setHRevised2Keikaku15181Bytes(ArrayUtils.subarray(arg, 490, 496));
        setHRevised2Keikaku16181Bytes(ArrayUtils.subarray(arg, 496, 502));
        setHRevised2Keikaku17181Bytes(ArrayUtils.subarray(arg, 502, 508));
        setHRevised1Keikaku01181Bytes(ArrayUtils.subarray(arg, 508, 514));
        setHRevised1Keikaku02181Bytes(ArrayUtils.subarray(arg, 514, 520));
        setHRevised1Keikaku03181Bytes(ArrayUtils.subarray(arg, 520, 526));
        setHRevised1Keikaku04181Bytes(ArrayUtils.subarray(arg, 526, 532));
        setHRevised1Keikaku05181Bytes(ArrayUtils.subarray(arg, 532, 538));
        setHRevised1Keikaku06181Bytes(ArrayUtils.subarray(arg, 538, 544));
        setHRevised1Keikaku07181Bytes(ArrayUtils.subarray(arg, 544, 550));
        setHRevised1Keikaku08181Bytes(ArrayUtils.subarray(arg, 550, 556));
        setHRevised1Keikaku09181Bytes(ArrayUtils.subarray(arg, 556, 562));
        setHRevised1Keikaku10181Bytes(ArrayUtils.subarray(arg, 562, 568));
        setHRevised1Keikaku11181Bytes(ArrayUtils.subarray(arg, 568, 574));
        setHRevised1Keikaku12181Bytes(ArrayUtils.subarray(arg, 574, 580));
        setHRevised1Keikaku13181Bytes(ArrayUtils.subarray(arg, 580, 586));
        setHRevised1Keikaku14181Bytes(ArrayUtils.subarray(arg, 586, 592));
        setHRevised1Keikaku15181Bytes(ArrayUtils.subarray(arg, 592, 598));
        setHRevised1Keikaku16181Bytes(ArrayUtils.subarray(arg, 598, 604));
        setHRevised1Keikaku17181Bytes(ArrayUtils.subarray(arg, 604, 610));
        setHIkkatsuSym201181Bytes(ArrayUtils.subarray(arg, 610, 611));
        setHIkkatsuSym202181Bytes(ArrayUtils.subarray(arg, 611, 612));
        setHIkkatsuSym203181Bytes(ArrayUtils.subarray(arg, 612, 613));
        setHIkkatsuSym204181Bytes(ArrayUtils.subarray(arg, 613, 614));
        setHIkkatsuSym205181Bytes(ArrayUtils.subarray(arg, 614, 615));
        setHIkkatsuSym206181Bytes(ArrayUtils.subarray(arg, 615, 616));
        setHIkkatsuSym207181Bytes(ArrayUtils.subarray(arg, 616, 617));
        setHIkkatsuSym208181Bytes(ArrayUtils.subarray(arg, 617, 618));
        setHIkkatsuSym209181Bytes(ArrayUtils.subarray(arg, 618, 619));
        setHIkkatsuSym210181Bytes(ArrayUtils.subarray(arg, 619, 620));
        setHIkkatsuSym211181Bytes(ArrayUtils.subarray(arg, 620, 621));
        setHIkkatsuSym212181Bytes(ArrayUtils.subarray(arg, 621, 622));
        setHIkkatsuSym213181Bytes(ArrayUtils.subarray(arg, 622, 623));
        setHIkkatsuSym214181Bytes(ArrayUtils.subarray(arg, 623, 624));
        setHIkkatsuSym215181Bytes(ArrayUtils.subarray(arg, 624, 625));
        setHIkkatsuSym216181Bytes(ArrayUtils.subarray(arg, 625, 626));
        setHIkkatsuSym217181Bytes(ArrayUtils.subarray(arg, 626, 627));
        setHIkkatsuSym101181Bytes(ArrayUtils.subarray(arg, 627, 628));
        setHIkkatsuSym102181Bytes(ArrayUtils.subarray(arg, 628, 629));
        setHIkkatsuSym103181Bytes(ArrayUtils.subarray(arg, 629, 630));
        setHIkkatsuSym104181Bytes(ArrayUtils.subarray(arg, 630, 631));
        setHIkkatsuSym105181Bytes(ArrayUtils.subarray(arg, 631, 632));
        setHIkkatsuSym106181Bytes(ArrayUtils.subarray(arg, 632, 633));
        setHIkkatsuSym107181Bytes(ArrayUtils.subarray(arg, 633, 634));
        setHIkkatsuSym108181Bytes(ArrayUtils.subarray(arg, 634, 635));
        setHIkkatsuSym109181Bytes(ArrayUtils.subarray(arg, 635, 636));
        setHIkkatsuSym110181Bytes(ArrayUtils.subarray(arg, 636, 637));
        setHIkkatsuSym111181Bytes(ArrayUtils.subarray(arg, 637, 638));
        setHIkkatsuSym112181Bytes(ArrayUtils.subarray(arg, 638, 639));
        setHIkkatsuSym113181Bytes(ArrayUtils.subarray(arg, 639, 640));
        setHIkkatsuSym114181Bytes(ArrayUtils.subarray(arg, 640, 641));
        setHIkkatsuSym115181Bytes(ArrayUtils.subarray(arg, 641, 642));
        setHIkkatsuSym116181Bytes(ArrayUtils.subarray(arg, 642, 643));
        setHIkkatsuSym117181Bytes(ArrayUtils.subarray(arg, 643, 644));
        setHYoteiInputJikoku01181Bytes(ArrayUtils.subarray(arg, 644, 649));
        setHYoteiInputJikoku02181Bytes(ArrayUtils.subarray(arg, 649, 654));
        setHYoteiInputJikoku03181Bytes(ArrayUtils.subarray(arg, 654, 659));
        setHYoteiInputJikoku04181Bytes(ArrayUtils.subarray(arg, 659, 664));
        setHYoteiInputJikoku05181Bytes(ArrayUtils.subarray(arg, 664, 669));
        setHYoteiInputJikoku06181Bytes(ArrayUtils.subarray(arg, 669, 674));
        setHYoteiInputJikoku07181Bytes(ArrayUtils.subarray(arg, 674, 679));
        setHYoteiInputJikoku08181Bytes(ArrayUtils.subarray(arg, 679, 684));
        setHYoteiInputJikoku09181Bytes(ArrayUtils.subarray(arg, 684, 689));
        setHYoteiInputJikoku10181Bytes(ArrayUtils.subarray(arg, 689, 694));
        setHYoteiInputJikoku11181Bytes(ArrayUtils.subarray(arg, 694, 699));
        setHYoteiInputJikoku12181Bytes(ArrayUtils.subarray(arg, 699, 704));
        setHYoteiInputJikoku13181Bytes(ArrayUtils.subarray(arg, 704, 709));
        setHYoteiInputJikoku14181Bytes(ArrayUtils.subarray(arg, 709, 714));
        setHYoteiInputJikoku15181Bytes(ArrayUtils.subarray(arg, 714, 719));
        setHYoteiInputJikoku16181Bytes(ArrayUtils.subarray(arg, 719, 724));
        setHYoteiInputJikoku17181Bytes(ArrayUtils.subarray(arg, 724, 729));
        setHHanedashiRiyuu101181Bytes(ArrayUtils.subarray(arg, 729, 731));
        setHHanedashiRiyuu102181Bytes(ArrayUtils.subarray(arg, 731, 733));
        setHHanedashiRiyuu103181Bytes(ArrayUtils.subarray(arg, 733, 735));
        setHHanedashiRiyuu104181Bytes(ArrayUtils.subarray(arg, 735, 737));
        setHHanedashiRiyuu105181Bytes(ArrayUtils.subarray(arg, 737, 739));
        setHHanedashiRiyuu106181Bytes(ArrayUtils.subarray(arg, 739, 741));
        setHHanedashiRiyuu107181Bytes(ArrayUtils.subarray(arg, 741, 743));
        setHHanedashiRiyuu108181Bytes(ArrayUtils.subarray(arg, 743, 745));
        setHHanedashiRiyuu109181Bytes(ArrayUtils.subarray(arg, 745, 747));
        setHHanedashiRiyuu110181Bytes(ArrayUtils.subarray(arg, 747, 749));
        setHHanedashiRiyuu111181Bytes(ArrayUtils.subarray(arg, 749, 751));
        setHHanedashiRiyuu112181Bytes(ArrayUtils.subarray(arg, 751, 753));
        setHHanedashiRiyuu113181Bytes(ArrayUtils.subarray(arg, 753, 755));
        setHHanedashiRiyuu114181Bytes(ArrayUtils.subarray(arg, 755, 757));
        setHHanedashiRiyuu115181Bytes(ArrayUtils.subarray(arg, 757, 759));
        setHHanedashiRiyuu116181Bytes(ArrayUtils.subarray(arg, 759, 761));
        setHHanedashiRiyuu117181Bytes(ArrayUtils.subarray(arg, 761, 763));
        setHHanedashiRiyuu201181Bytes(ArrayUtils.subarray(arg, 763, 765));
        setHHanedashiRiyuu202181Bytes(ArrayUtils.subarray(arg, 765, 767));
        setHHanedashiRiyuu203181Bytes(ArrayUtils.subarray(arg, 767, 769));
        setHHanedashiRiyuu204181Bytes(ArrayUtils.subarray(arg, 769, 771));
        setHHanedashiRiyuu205181Bytes(ArrayUtils.subarray(arg, 771, 773));
        setHHanedashiRiyuu206181Bytes(ArrayUtils.subarray(arg, 773, 775));
        setHHanedashiRiyuu207181Bytes(ArrayUtils.subarray(arg, 775, 777));
        setHHanedashiRiyuu208181Bytes(ArrayUtils.subarray(arg, 777, 779));
        setHHanedashiRiyuu209181Bytes(ArrayUtils.subarray(arg, 779, 781));
        setHHanedashiRiyuu210181Bytes(ArrayUtils.subarray(arg, 781, 783));
        setHHanedashiRiyuu211181Bytes(ArrayUtils.subarray(arg, 783, 785));
        setHHanedashiRiyuu212181Bytes(ArrayUtils.subarray(arg, 785, 787));
        setHHanedashiRiyuu213181Bytes(ArrayUtils.subarray(arg, 787, 789));
        setHHanedashiRiyuu214181Bytes(ArrayUtils.subarray(arg, 789, 791));
        setHHanedashiRiyuu215181Bytes(ArrayUtils.subarray(arg, 791, 793));
        setHHanedashiRiyuu216181Bytes(ArrayUtils.subarray(arg, 793, 795));
        setHHanedashiRiyuu217181Bytes(ArrayUtils.subarray(arg, 795, 797));
        setHDeliveryLeadKotei181Bytes(ArrayUtils.subarray(arg, 797, 800));
        setHDeliveryLeadYoyuu181Bytes(ArrayUtils.subarray(arg, 800, 803));
        setHIkansaki181Bytes(ArrayUtils.subarray(arg, 803, 807));
        setHKensaIkanShikibetsu181Bytes(ArrayUtils.subarray(arg, 807, 808));
        setHKasoushaSym181Bytes(ArrayUtils.subarray(arg, 808, 809));
        setHKasouMaker181Bytes(ArrayUtils.subarray(arg, 809, 813));
        setHKasouKanryouLead181Bytes(ArrayUtils.subarray(arg, 813, 816));
        setHTokkiJikou181Bytes(ArrayUtils.subarray(arg, 816, 836));
        setHActSchKey181Bytes(ArrayUtils.subarray(arg, 836, 837));
        setHActSeqNo181Bytes(ArrayUtils.subarray(arg, 837, 847));
        setHShataiReActSeqNo181Bytes(ArrayUtils.subarray(arg, 847, 858));
        setHFinalReActSeqNo181Bytes(ArrayUtils.subarray(arg, 858, 869));
        setHTrimSeqNo181Bytes(ArrayUtils.subarray(arg, 869, 875));
        setHOfflineSeqNo181Bytes(ArrayUtils.subarray(arg, 875, 881));
        setHKankenYmd181Bytes(ArrayUtils.subarray(arg, 881, 887));
        setHMsOfflineYmd181Bytes(ArrayUtils.subarray(arg, 887, 897));
        setHSymTokushusha181Bytes(ArrayUtils.subarray(arg, 897, 898));
        setHSymKouteiKeikakuGai181Bytes(ArrayUtils.subarray(arg, 898, 899));
        setHSymZaikoZumi181Bytes(ArrayUtils.subarray(arg, 899, 900));
        setHSymGyakubarashiGai181Bytes(ArrayUtils.subarray(arg, 900, 901));
        setHSymSenkouMiGai181Bytes(ArrayUtils.subarray(arg, 901, 902));
        setHSymSmDaihyou181Bytes(ArrayUtils.subarray(arg, 902, 903));
        setHSymSmKoutei01181Bytes(ArrayUtils.subarray(arg, 903, 904));
        setHSymSmKoutei02181Bytes(ArrayUtils.subarray(arg, 904, 905));
        setHSymSmKoutei03181Bytes(ArrayUtils.subarray(arg, 905, 906));
        setHSymSmKoutei04181Bytes(ArrayUtils.subarray(arg, 906, 907));
        setHSymSmKoutei05181Bytes(ArrayUtils.subarray(arg, 907, 908));
        setHSymSmKoutei06181Bytes(ArrayUtils.subarray(arg, 908, 909));
        setHSymSmKoutei07181Bytes(ArrayUtils.subarray(arg, 909, 910));
        setHSymSmKoutei08181Bytes(ArrayUtils.subarray(arg, 910, 911));
        setHSymSmKoutei09181Bytes(ArrayUtils.subarray(arg, 911, 912));
        setHSymSmKoutei10181Bytes(ArrayUtils.subarray(arg, 912, 913));
        setHSymSmKoutei11181Bytes(ArrayUtils.subarray(arg, 913, 914));
        setHSymSmKoutei12181Bytes(ArrayUtils.subarray(arg, 914, 915));
        setHSymSmKoutei13181Bytes(ArrayUtils.subarray(arg, 915, 916));
        setHSymSmKoutei14181Bytes(ArrayUtils.subarray(arg, 916, 917));
        setHSymSmKoutei15181Bytes(ArrayUtils.subarray(arg, 917, 918));
        setHSymSmKoutei16181Bytes(ArrayUtils.subarray(arg, 918, 919));
        setHSymSmKoutei17181Bytes(ArrayUtils.subarray(arg, 919, 920));
        setHSymZengetsuJisseki01181Bytes(ArrayUtils.subarray(arg, 920, 921));
        setHSymZengetsuJisseki02181Bytes(ArrayUtils.subarray(arg, 921, 922));
        setHSymZengetsuJisseki03181Bytes(ArrayUtils.subarray(arg, 922, 923));
        setHSymZengetsuJisseki04181Bytes(ArrayUtils.subarray(arg, 923, 924));
        setHSymZengetsuJisseki05181Bytes(ArrayUtils.subarray(arg, 924, 925));
        setHSymZengetsuJisseki06181Bytes(ArrayUtils.subarray(arg, 925, 926));
        setHSymZengetsuJisseki07181Bytes(ArrayUtils.subarray(arg, 926, 927));
        setHSymZengetsuJisseki08181Bytes(ArrayUtils.subarray(arg, 927, 928));
        setHSymZengetsuJisseki09181Bytes(ArrayUtils.subarray(arg, 928, 929));
        setHSymZengetsuJisseki10181Bytes(ArrayUtils.subarray(arg, 929, 930));
        setHSymZengetsuJisseki11181Bytes(ArrayUtils.subarray(arg, 930, 931));
        setHSymZengetsuJisseki12181Bytes(ArrayUtils.subarray(arg, 931, 932));
        setHSymZengetsuJisseki13181Bytes(ArrayUtils.subarray(arg, 932, 933));
        setHSymZengetsuJisseki14181Bytes(ArrayUtils.subarray(arg, 933, 934));
        setHSymZengetsuJisseki15181Bytes(ArrayUtils.subarray(arg, 934, 935));
        setHSymZengetsuJisseki16181Bytes(ArrayUtils.subarray(arg, 935, 936));
        setHSymZengetsuJisseki17181Bytes(ArrayUtils.subarray(arg, 936, 937));
        setHSymTlMetal181Bytes(ArrayUtils.subarray(arg, 937, 938));
        setHSymTlShitaP181Bytes(ArrayUtils.subarray(arg, 938, 939));
        setHSymTlNakaP181Bytes(ArrayUtils.subarray(arg, 939, 940));
        setHSymTlPaint181Bytes(ArrayUtils.subarray(arg, 940, 941));
        setHSymTlFinal181Bytes(ArrayUtils.subarray(arg, 941, 942));
        setHSymTlDeliv181Bytes(ArrayUtils.subarray(arg, 942, 943));
        setHSymPipeLineGai181Bytes(ArrayUtils.subarray(arg, 943, 944));
        setHSymPipeLineZumi181Bytes(ArrayUtils.subarray(arg, 944, 945));
        setHSymKeikakuMitei181Bytes(ArrayUtils.subarray(arg, 945, 946));
        setHSeisanHoushiki181Bytes(ArrayUtils.subarray(arg, 946, 947));
        setHSymShisakuSha181Bytes(ArrayUtils.subarray(arg, 947, 948));
        setHSymGyakuYunyuu181Bytes(ArrayUtils.subarray(arg, 948, 949));
        setHHyoujiGenzaichi181Bytes(ArrayUtils.subarray(arg, 949, 950));
        setHSalesSpec10181Bytes(ArrayUtils.subarray(arg, 950, 960));
        setHLocalArea181Bytes(ArrayUtils.subarray(arg, 960, 1010));
        setHTimeStamp181Bytes(ArrayUtils.subarray(arg, 1010, 1022));
        setHDelivEigyouHizuke181Bytes(ArrayUtils.subarray(arg, 1022, 1028));
        setHSymHanedashi181Bytes(ArrayUtils.subarray(arg, 1028, 1029));
        setHSeihinKubun181Bytes(ArrayUtils.subarray(arg, 1029, 1030));
        setHStatus181RBytes(ArrayUtils.subarray(arg, 1030, 1060));
        setHKoujouControlNo19181Bytes(ArrayUtils.subarray(arg, 1060, 1069));
        setHKoujouControlNo49181Bytes(ArrayUtils.subarray(arg, 1069, 1075));
        setHKoujouControlNo13181Bytes(ArrayUtils.subarray(arg, 1075, 1078));
        setHModel13181Bytes(ArrayUtils.subarray(arg, 1078, 1081));
        setHChassisNo16181Bytes(ArrayUtils.subarray(arg, 1081, 1087));
  }

  public void initHostForStatus181() {
        initHKoujouKubun181();
        initHKoujouControlNo181();
        initHModel181();
        initHColor181();
        initHUchibari181();
        initHExNo181();
        initHShimukechi181();
        initHLineMain181();
        initHLineMetal181();
        initHLinePaint181();
        initHLineTrim181();
        initHKokuyuKubun181();
        initHKijunShakei181();
        initHDakokuKatashiki181();
        initHChassisNo181();
        initHEngKatashiki181();
        initHEngNo181();
        initHOrgModel181();
        initHOrgColor181();
        initHOrgUchibari181();
        initHOrgExNo181();
        initHOrgLineKubun181();
        initHShakeiCode181();
        initHShameiCode181();
        initHOrderKubun181();
        initHDealerNo181();
        initHOrderNo181();
        initHComfirmedOrderNo181();
        initHCustomerName181();
        initHTenjiPryCode181();
        initHStatusPoint181();
        initHJissekiJikoku01181();
        initHJissekiJikoku02181();
        initHJissekiJikoku03181();
        initHJissekiJikoku04181();
        initHJissekiJikoku05181();
        initHJissekiJikoku06181();
        initHJissekiJikoku07181();
        initHJissekiJikoku08181();
        initHJissekiJikoku09181();
        initHJissekiJikoku10181();
        initHJissekiJikoku11181();
        initHJissekiJikoku12181();
        initHJissekiJikoku13181();
        initHJissekiJikoku14181();
        initHJissekiJikoku15181();
        initHJissekiJikoku16181();
        initHJissekiJikoku17181();
        initHOriginalKeikaku01181();
        initHOriginalKeikaku02181();
        initHOriginalKeikaku03181();
        initHOriginalKeikaku04181();
        initHOriginalKeikaku05181();
        initHOriginalKeikaku06181();
        initHOriginalKeikaku07181();
        initHOriginalKeikaku08181();
        initHOriginalKeikaku09181();
        initHOriginalKeikaku10181();
        initHOriginalKeikaku11181();
        initHOriginalKeikaku12181();
        initHOriginalKeikaku13181();
        initHOriginalKeikaku14181();
        initHOriginalKeikaku15181();
        initHOriginalKeikaku16181();
        initHOriginalKeikaku17181();
        initHRevised2Keikaku01181();
        initHRevised2Keikaku02181();
        initHRevised2Keikaku03181();
        initHRevised2Keikaku04181();
        initHRevised2Keikaku05181();
        initHRevised2Keikaku06181();
        initHRevised2Keikaku07181();
        initHRevised2Keikaku08181();
        initHRevised2Keikaku09181();
        initHRevised2Keikaku10181();
        initHRevised2Keikaku11181();
        initHRevised2Keikaku12181();
        initHRevised2Keikaku13181();
        initHRevised2Keikaku14181();
        initHRevised2Keikaku15181();
        initHRevised2Keikaku16181();
        initHRevised2Keikaku17181();
        initHRevised1Keikaku01181();
        initHRevised1Keikaku02181();
        initHRevised1Keikaku03181();
        initHRevised1Keikaku04181();
        initHRevised1Keikaku05181();
        initHRevised1Keikaku06181();
        initHRevised1Keikaku07181();
        initHRevised1Keikaku08181();
        initHRevised1Keikaku09181();
        initHRevised1Keikaku10181();
        initHRevised1Keikaku11181();
        initHRevised1Keikaku12181();
        initHRevised1Keikaku13181();
        initHRevised1Keikaku14181();
        initHRevised1Keikaku15181();
        initHRevised1Keikaku16181();
        initHRevised1Keikaku17181();
        initHIkkatsuSym201181();
        initHIkkatsuSym202181();
        initHIkkatsuSym203181();
        initHIkkatsuSym204181();
        initHIkkatsuSym205181();
        initHIkkatsuSym206181();
        initHIkkatsuSym207181();
        initHIkkatsuSym208181();
        initHIkkatsuSym209181();
        initHIkkatsuSym210181();
        initHIkkatsuSym211181();
        initHIkkatsuSym212181();
        initHIkkatsuSym213181();
        initHIkkatsuSym214181();
        initHIkkatsuSym215181();
        initHIkkatsuSym216181();
        initHIkkatsuSym217181();
        initHIkkatsuSym101181();
        initHIkkatsuSym102181();
        initHIkkatsuSym103181();
        initHIkkatsuSym104181();
        initHIkkatsuSym105181();
        initHIkkatsuSym106181();
        initHIkkatsuSym107181();
        initHIkkatsuSym108181();
        initHIkkatsuSym109181();
        initHIkkatsuSym110181();
        initHIkkatsuSym111181();
        initHIkkatsuSym112181();
        initHIkkatsuSym113181();
        initHIkkatsuSym114181();
        initHIkkatsuSym115181();
        initHIkkatsuSym116181();
        initHIkkatsuSym117181();
        initHYoteiInputJikoku01181();
        initHYoteiInputJikoku02181();
        initHYoteiInputJikoku03181();
        initHYoteiInputJikoku04181();
        initHYoteiInputJikoku05181();
        initHYoteiInputJikoku06181();
        initHYoteiInputJikoku07181();
        initHYoteiInputJikoku08181();
        initHYoteiInputJikoku09181();
        initHYoteiInputJikoku10181();
        initHYoteiInputJikoku11181();
        initHYoteiInputJikoku12181();
        initHYoteiInputJikoku13181();
        initHYoteiInputJikoku14181();
        initHYoteiInputJikoku15181();
        initHYoteiInputJikoku16181();
        initHYoteiInputJikoku17181();
        initHHanedashiRiyuu101181();
        initHHanedashiRiyuu102181();
        initHHanedashiRiyuu103181();
        initHHanedashiRiyuu104181();
        initHHanedashiRiyuu105181();
        initHHanedashiRiyuu106181();
        initHHanedashiRiyuu107181();
        initHHanedashiRiyuu108181();
        initHHanedashiRiyuu109181();
        initHHanedashiRiyuu110181();
        initHHanedashiRiyuu111181();
        initHHanedashiRiyuu112181();
        initHHanedashiRiyuu113181();
        initHHanedashiRiyuu114181();
        initHHanedashiRiyuu115181();
        initHHanedashiRiyuu116181();
        initHHanedashiRiyuu117181();
        initHHanedashiRiyuu201181();
        initHHanedashiRiyuu202181();
        initHHanedashiRiyuu203181();
        initHHanedashiRiyuu204181();
        initHHanedashiRiyuu205181();
        initHHanedashiRiyuu206181();
        initHHanedashiRiyuu207181();
        initHHanedashiRiyuu208181();
        initHHanedashiRiyuu209181();
        initHHanedashiRiyuu210181();
        initHHanedashiRiyuu211181();
        initHHanedashiRiyuu212181();
        initHHanedashiRiyuu213181();
        initHHanedashiRiyuu214181();
        initHHanedashiRiyuu215181();
        initHHanedashiRiyuu216181();
        initHHanedashiRiyuu217181();
        initHDeliveryLeadKotei181();
        initHDeliveryLeadYoyuu181();
        initHIkansaki181();
        initHKensaIkanShikibetsu181();
        initHKasoushaSym181();
        initHKasouMaker181();
        initHKasouKanryouLead181();
        initHTokkiJikou181();
        initHActSchKey181();
        initHActSeqNo181();
        initHShataiReActSeqNo181();
        initHFinalReActSeqNo181();
        initHTrimSeqNo181();
        initHOfflineSeqNo181();
        initHKankenYmd181();
        initHMsOfflineYmd181();
        initHSymTokushusha181();
        initHSymKouteiKeikakuGai181();
        initHSymZaikoZumi181();
        initHSymGyakubarashiGai181();
        initHSymSenkouMiGai181();
        initHSymSmDaihyou181();
        initHSymSmKoutei01181();
        initHSymSmKoutei02181();
        initHSymSmKoutei03181();
        initHSymSmKoutei04181();
        initHSymSmKoutei05181();
        initHSymSmKoutei06181();
        initHSymSmKoutei07181();
        initHSymSmKoutei08181();
        initHSymSmKoutei09181();
        initHSymSmKoutei10181();
        initHSymSmKoutei11181();
        initHSymSmKoutei12181();
        initHSymSmKoutei13181();
        initHSymSmKoutei14181();
        initHSymSmKoutei15181();
        initHSymSmKoutei16181();
        initHSymSmKoutei17181();
        initHSymZengetsuJisseki01181();
        initHSymZengetsuJisseki02181();
        initHSymZengetsuJisseki03181();
        initHSymZengetsuJisseki04181();
        initHSymZengetsuJisseki05181();
        initHSymZengetsuJisseki06181();
        initHSymZengetsuJisseki07181();
        initHSymZengetsuJisseki08181();
        initHSymZengetsuJisseki09181();
        initHSymZengetsuJisseki10181();
        initHSymZengetsuJisseki11181();
        initHSymZengetsuJisseki12181();
        initHSymZengetsuJisseki13181();
        initHSymZengetsuJisseki14181();
        initHSymZengetsuJisseki15181();
        initHSymZengetsuJisseki16181();
        initHSymZengetsuJisseki17181();
        initHSymTlMetal181();
        initHSymTlShitaP181();
        initHSymTlNakaP181();
        initHSymTlPaint181();
        initHSymTlFinal181();
        initHSymTlDeliv181();
        initHSymPipeLineGai181();
        initHSymPipeLineZumi181();
        initHSymKeikakuMitei181();
        initHSeisanHoushiki181();
        initHSymShisakuSha181();
        initHSymGyakuYunyuu181();
        initHHyoujiGenzaichi181();
        initHSalesSpec10181();
        initHLocalArea181();
        initHTimeStamp181();
        initHDelivEigyouHizuke181();
        initHSymHanedashi181();
        initHSeihinKubun181();
        initHStatus181R();
        initHKoujouControlNo19181();
        initHKoujouControlNo49181();
        initHKoujouControlNo13181();
        initHModel13181();
        initHChassisNo16181();
  }

  public String getHostForStatus181() {
  return CommonUtils.bytesToString(getHostForStatus181Bytes());
  }

  public void setHostForStatus181(String arg) {
  final int trailing_length = 1087 - arg.length();
  if (trailing_length > 0) {
  setHostForStatus181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHostForStatus181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1087)));
  }
  }

  public byte[] getHKoujouKubun181Bytes() {
    return hKoujouKubun181;
  }

  public void setHKoujouKubun181Bytes(byte[] arg) {
    hKoujouKubun181 = ArrayUtils.clone(arg);
  }

  public void initHKoujouKubun181() {
    hKoujouKubun181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKoujouKubun181() {
  return CommonUtils.bytesToString(getHKoujouKubun181Bytes());
  }

  public void setHKoujouKubun181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKoujouKubun181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouKubun181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKoujouControlNo181Bytes() {
    return hKoujouControlNo181;
  }

  public void setHKoujouControlNo181Bytes(byte[] arg) {
    hKoujouControlNo181 = ArrayUtils.clone(arg);
  }

  public void initHKoujouControlNo181() {
    hKoujouControlNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getHKoujouControlNo181() {
  return CommonUtils.bytesToString(getHKoujouControlNo181Bytes());
  }

  public void setHKoujouControlNo181(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setHKoujouControlNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouControlNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getHModel181Bytes() {
    return hModel181;
  }

  public void setHModel181Bytes(byte[] arg) {
    hModel181 = ArrayUtils.clone(arg);
  }

  public void initHModel181() {
    hModel181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getHModel181() {
  return CommonUtils.bytesToString(getHModel181Bytes());
  }

  public void setHModel181(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setHModel181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHModel181Bytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getHColor181Bytes() {
    return hColor181;
  }

  public void setHColor181Bytes(byte[] arg) {
    hColor181 = ArrayUtils.clone(arg);
  }

  public void initHColor181() {
    hColor181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getHColor181() {
  return CommonUtils.bytesToString(getHColor181Bytes());
  }

  public void setHColor181(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setHColor181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHColor181Bytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getHUchibari181Bytes() {
    return hUchibari181;
  }

  public void setHUchibari181Bytes(byte[] arg) {
    hUchibari181 = ArrayUtils.clone(arg);
  }

  public void initHUchibari181() {
    hUchibari181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHUchibari181() {
  return CommonUtils.bytesToString(getHUchibari181Bytes());
  }

  public void setHUchibari181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHUchibari181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHUchibari181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHExNo181Bytes() {
    return hExNo181;
  }

  public void setHExNo181Bytes(byte[] arg) {
    hExNo181 = ArrayUtils.clone(arg);
  }

  public void initHExNo181() {
    hExNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getHExNo181() {
  return CommonUtils.bytesToString(getHExNo181Bytes());
  }

  public void setHExNo181(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setHExNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHExNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getHShimukechi181Bytes() {
    return hShimukechi181;
  }

  public void setHShimukechi181Bytes(byte[] arg) {
    hShimukechi181 = ArrayUtils.clone(arg);
  }

  public void initHShimukechi181() {
    hShimukechi181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getHShimukechi181() {
  return CommonUtils.bytesToString(getHShimukechi181Bytes());
  }

  public void setHShimukechi181(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setHShimukechi181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShimukechi181Bytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getHLineMain181Bytes() {
    return hLineMain181;
  }

  public void setHLineMain181Bytes(byte[] arg) {
    hLineMain181 = ArrayUtils.clone(arg);
  }

  public void initHLineMain181() {
    hLineMain181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHLineMain181() {
  return CommonUtils.bytesToString(getHLineMain181Bytes());
  }

  public void setHLineMain181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHLineMain181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLineMain181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHLineMetal181Bytes() {
    return hLineMetal181;
  }

  public void setHLineMetal181Bytes(byte[] arg) {
    hLineMetal181 = ArrayUtils.clone(arg);
  }

  public void initHLineMetal181() {
    hLineMetal181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHLineMetal181() {
  return CommonUtils.bytesToString(getHLineMetal181Bytes());
  }

  public void setHLineMetal181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHLineMetal181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLineMetal181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHLinePaint181Bytes() {
    return hLinePaint181;
  }

  public void setHLinePaint181Bytes(byte[] arg) {
    hLinePaint181 = ArrayUtils.clone(arg);
  }

  public void initHLinePaint181() {
    hLinePaint181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHLinePaint181() {
  return CommonUtils.bytesToString(getHLinePaint181Bytes());
  }

  public void setHLinePaint181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHLinePaint181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLinePaint181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHLineTrim181Bytes() {
    return hLineTrim181;
  }

  public void setHLineTrim181Bytes(byte[] arg) {
    hLineTrim181 = ArrayUtils.clone(arg);
  }

  public void initHLineTrim181() {
    hLineTrim181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHLineTrim181() {
  return CommonUtils.bytesToString(getHLineTrim181Bytes());
  }

  public void setHLineTrim181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHLineTrim181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLineTrim181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKokuyuKubun181Bytes() {
    return hKokuyuKubun181;
  }

  public void setHKokuyuKubun181Bytes(byte[] arg) {
    hKokuyuKubun181 = ArrayUtils.clone(arg);
  }

  public void initHKokuyuKubun181() {
    hKokuyuKubun181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKokuyuKubun181() {
  return CommonUtils.bytesToString(getHKokuyuKubun181Bytes());
  }

  public void setHKokuyuKubun181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKokuyuKubun181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKokuyuKubun181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKijunShakei181Bytes() {
    return hKijunShakei181;
  }

  public void setHKijunShakei181Bytes(byte[] arg) {
    hKijunShakei181 = ArrayUtils.clone(arg);
  }

  public void initHKijunShakei181() {
    hKijunShakei181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getHKijunShakei181() {
  return CommonUtils.bytesToString(getHKijunShakei181Bytes());
  }

  public void setHKijunShakei181(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setHKijunShakei181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKijunShakei181Bytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getHDakokuKatashiki181Bytes() {
    return hDakokuKatashiki181;
  }

  public void setHDakokuKatashiki181Bytes(byte[] arg) {
    hDakokuKatashiki181 = ArrayUtils.clone(arg);
  }

  public void initHDakokuKatashiki181() {
    hDakokuKatashiki181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getHDakokuKatashiki181() {
  return CommonUtils.bytesToString(getHDakokuKatashiki181Bytes());
  }

  public void setHDakokuKatashiki181(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setHDakokuKatashiki181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHDakokuKatashiki181Bytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getHChassisNo181Bytes() {
    return hChassisNo181;
  }

  public void setHChassisNo181Bytes(byte[] arg) {
    hChassisNo181 = ArrayUtils.clone(arg);
  }

  public void initHChassisNo181() {
    hChassisNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getHChassisNo181() {
  return CommonUtils.bytesToString(getHChassisNo181Bytes());
  }

  public void setHChassisNo181(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setHChassisNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHChassisNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getHEngKatashiki181Bytes() {
    return hEngKatashiki181;
  }

  public void setHEngKatashiki181Bytes(byte[] arg) {
    hEngKatashiki181 = ArrayUtils.clone(arg);
  }

  public void initHEngKatashiki181() {
    hEngKatashiki181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getHEngKatashiki181() {
  return CommonUtils.bytesToString(getHEngKatashiki181Bytes());
  }

  public void setHEngKatashiki181(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setHEngKatashiki181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHEngKatashiki181Bytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getHEngNo181Bytes() {
    return hEngNo181;
  }

  public void setHEngNo181Bytes(byte[] arg) {
    hEngNo181 = ArrayUtils.clone(arg);
  }

  public void initHEngNo181() {
    hEngNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getHEngNo181() {
  return CommonUtils.bytesToString(getHEngNo181Bytes());
  }

  public void setHEngNo181(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setHEngNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHEngNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getHOrgModel181Bytes() {
    return hOrgModel181;
  }

  public void setHOrgModel181Bytes(byte[] arg) {
    hOrgModel181 = ArrayUtils.clone(arg);
  }

  public void initHOrgModel181() {
    hOrgModel181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getHOrgModel181() {
  return CommonUtils.bytesToString(getHOrgModel181Bytes());
  }

  public void setHOrgModel181(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setHOrgModel181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrgModel181Bytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getHOrgColor181Bytes() {
    return hOrgColor181;
  }

  public void setHOrgColor181Bytes(byte[] arg) {
    hOrgColor181 = ArrayUtils.clone(arg);
  }

  public void initHOrgColor181() {
    hOrgColor181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getHOrgColor181() {
  return CommonUtils.bytesToString(getHOrgColor181Bytes());
  }

  public void setHOrgColor181(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setHOrgColor181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrgColor181Bytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getHOrgUchibari181Bytes() {
    return hOrgUchibari181;
  }

  public void setHOrgUchibari181Bytes(byte[] arg) {
    hOrgUchibari181 = ArrayUtils.clone(arg);
  }

  public void initHOrgUchibari181() {
    hOrgUchibari181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHOrgUchibari181() {
  return CommonUtils.bytesToString(getHOrgUchibari181Bytes());
  }

  public void setHOrgUchibari181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHOrgUchibari181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrgUchibari181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHOrgExNo181Bytes() {
    return hOrgExNo181;
  }

  public void setHOrgExNo181Bytes(byte[] arg) {
    hOrgExNo181 = ArrayUtils.clone(arg);
  }

  public void initHOrgExNo181() {
    hOrgExNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 5));
  }

  public String getHOrgExNo181() {
  return CommonUtils.bytesToString(getHOrgExNo181Bytes());
  }

  public void setHOrgExNo181(String arg) {
  final int trailing_length = 5 - arg.length();
  if (trailing_length > 0) {
  setHOrgExNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrgExNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 5)));
  }
  }

  public byte[] getHOrgLineKubun181Bytes() {
    return hOrgLineKubun181;
  }

  public void setHOrgLineKubun181Bytes(byte[] arg) {
    hOrgLineKubun181 = ArrayUtils.clone(arg);
  }

  public void initHOrgLineKubun181() {
    hOrgLineKubun181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHOrgLineKubun181() {
  return CommonUtils.bytesToString(getHOrgLineKubun181Bytes());
  }

  public void setHOrgLineKubun181(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHOrgLineKubun181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrgLineKubun181Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHShakeiCode181Bytes() {
    return hShakeiCode181;
  }

  public void setHShakeiCode181Bytes(byte[] arg) {
    hShakeiCode181 = ArrayUtils.clone(arg);
  }

  public void initHShakeiCode181() {
    hShakeiCode181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHShakeiCode181() {
  return CommonUtils.bytesToString(getHShakeiCode181Bytes());
  }

  public void setHShakeiCode181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHShakeiCode181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShakeiCode181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHShameiCode181Bytes() {
    return hShameiCode181;
  }

  public void setHShameiCode181Bytes(byte[] arg) {
    hShameiCode181 = ArrayUtils.clone(arg);
  }

  public void initHShameiCode181() {
    hShameiCode181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHShameiCode181() {
  return CommonUtils.bytesToString(getHShameiCode181Bytes());
  }

  public void setHShameiCode181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHShameiCode181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShameiCode181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHOrderKubun181Bytes() {
    return hOrderKubun181;
  }

  public void setHOrderKubun181Bytes(byte[] arg) {
    hOrderKubun181 = ArrayUtils.clone(arg);
  }

  public void initHOrderKubun181() {
    hOrderKubun181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHOrderKubun181() {
  return CommonUtils.bytesToString(getHOrderKubun181Bytes());
  }

  public void setHOrderKubun181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHOrderKubun181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrderKubun181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHDealerNo181Bytes() {
    return hDealerNo181;
  }

  public void setHDealerNo181Bytes(byte[] arg) {
    hDealerNo181 = ArrayUtils.clone(arg);
  }

  public void initHDealerNo181() {
    hDealerNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHDealerNo181() {
  return CommonUtils.bytesToString(getHDealerNo181Bytes());
  }

  public void setHDealerNo181(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHDealerNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHDealerNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHOrderNo181Bytes() {
    return hOrderNo181;
  }

  public void setHOrderNo181Bytes(byte[] arg) {
    hOrderNo181 = ArrayUtils.clone(arg);
  }

  public void initHOrderNo181() {
    hOrderNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHOrderNo181() {
  return CommonUtils.bytesToString(getHOrderNo181Bytes());
  }

  public void setHOrderNo181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHOrderNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOrderNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHComfirmedOrderNo181Bytes() {
    return hComfirmedOrderNo181;
  }

  public void setHComfirmedOrderNo181Bytes(byte[] arg) {
    hComfirmedOrderNo181 = ArrayUtils.clone(arg);
  }

  public void initHComfirmedOrderNo181() {
    hComfirmedOrderNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getHComfirmedOrderNo181() {
  return CommonUtils.bytesToString(getHComfirmedOrderNo181Bytes());
  }

  public void setHComfirmedOrderNo181(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setHComfirmedOrderNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHComfirmedOrderNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getHCustomerName181Bytes() {
    return hCustomerName181;
  }

  public void setHCustomerName181Bytes(byte[] arg) {
    hCustomerName181 = ArrayUtils.clone(arg);
  }

  public void initHCustomerName181() {
    hCustomerName181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 41));
  }

  public String getHCustomerName181() {
  return CommonUtils.bytesToString(getHCustomerName181Bytes());
  }

  public void setHCustomerName181(String arg) {
  final int trailing_length = 41 - arg.length();
  if (trailing_length > 0) {
  setHCustomerName181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHCustomerName181Bytes(CommonUtils.stringToBytes(arg.substring(0, 41)));
  }
  }

  public byte[] getHTenjiPryCode181Bytes() {
    return hTenjiPryCode181;
  }

  public void setHTenjiPryCode181Bytes(byte[] arg) {
    hTenjiPryCode181 = ArrayUtils.clone(arg);
  }

  public void initHTenjiPryCode181() {
    hTenjiPryCode181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHTenjiPryCode181() {
  return CommonUtils.bytesToString(getHTenjiPryCode181Bytes());
  }

  public void setHTenjiPryCode181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHTenjiPryCode181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHTenjiPryCode181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHStatusPoint181Bytes() {
    return hStatusPoint181;
  }

  public void setHStatusPoint181Bytes(byte[] arg) {
    hStatusPoint181 = ArrayUtils.clone(arg);
  }

  public void initHStatusPoint181() {
    hStatusPoint181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHStatusPoint181() {
  return CommonUtils.bytesToString(getHStatusPoint181Bytes());
  }

  public void setHStatusPoint181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHStatusPoint181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHStatusPoint181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHJissekiJikoku01181Bytes() {
    return hJissekiJikoku01181;
  }

  public void setHJissekiJikoku01181Bytes(byte[] arg) {
    hJissekiJikoku01181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku01181() {
    hJissekiJikoku01181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku01181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku01181Bytes());
  }

  public void setHJissekiJikoku01181(long arg) {
  setHJissekiJikoku01181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku02181Bytes() {
    return hJissekiJikoku02181;
  }

  public void setHJissekiJikoku02181Bytes(byte[] arg) {
    hJissekiJikoku02181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku02181() {
    hJissekiJikoku02181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku02181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku02181Bytes());
  }

  public void setHJissekiJikoku02181(long arg) {
  setHJissekiJikoku02181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku03181Bytes() {
    return hJissekiJikoku03181;
  }

  public void setHJissekiJikoku03181Bytes(byte[] arg) {
    hJissekiJikoku03181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku03181() {
    hJissekiJikoku03181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku03181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku03181Bytes());
  }

  public void setHJissekiJikoku03181(long arg) {
  setHJissekiJikoku03181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku04181Bytes() {
    return hJissekiJikoku04181;
  }

  public void setHJissekiJikoku04181Bytes(byte[] arg) {
    hJissekiJikoku04181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku04181() {
    hJissekiJikoku04181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku04181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku04181Bytes());
  }

  public void setHJissekiJikoku04181(long arg) {
  setHJissekiJikoku04181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku05181Bytes() {
    return hJissekiJikoku05181;
  }

  public void setHJissekiJikoku05181Bytes(byte[] arg) {
    hJissekiJikoku05181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku05181() {
    hJissekiJikoku05181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku05181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku05181Bytes());
  }

  public void setHJissekiJikoku05181(long arg) {
  setHJissekiJikoku05181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku06181Bytes() {
    return hJissekiJikoku06181;
  }

  public void setHJissekiJikoku06181Bytes(byte[] arg) {
    hJissekiJikoku06181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku06181() {
    hJissekiJikoku06181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku06181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku06181Bytes());
  }

  public void setHJissekiJikoku06181(long arg) {
  setHJissekiJikoku06181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku07181Bytes() {
    return hJissekiJikoku07181;
  }

  public void setHJissekiJikoku07181Bytes(byte[] arg) {
    hJissekiJikoku07181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku07181() {
    hJissekiJikoku07181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku07181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku07181Bytes());
  }

  public void setHJissekiJikoku07181(long arg) {
  setHJissekiJikoku07181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku08181Bytes() {
    return hJissekiJikoku08181;
  }

  public void setHJissekiJikoku08181Bytes(byte[] arg) {
    hJissekiJikoku08181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku08181() {
    hJissekiJikoku08181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku08181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku08181Bytes());
  }

  public void setHJissekiJikoku08181(long arg) {
  setHJissekiJikoku08181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku09181Bytes() {
    return hJissekiJikoku09181;
  }

  public void setHJissekiJikoku09181Bytes(byte[] arg) {
    hJissekiJikoku09181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku09181() {
    hJissekiJikoku09181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku09181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku09181Bytes());
  }

  public void setHJissekiJikoku09181(long arg) {
  setHJissekiJikoku09181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku10181Bytes() {
    return hJissekiJikoku10181;
  }

  public void setHJissekiJikoku10181Bytes(byte[] arg) {
    hJissekiJikoku10181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku10181() {
    hJissekiJikoku10181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku10181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku10181Bytes());
  }

  public void setHJissekiJikoku10181(long arg) {
  setHJissekiJikoku10181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku11181Bytes() {
    return hJissekiJikoku11181;
  }

  public void setHJissekiJikoku11181Bytes(byte[] arg) {
    hJissekiJikoku11181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku11181() {
    hJissekiJikoku11181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku11181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku11181Bytes());
  }

  public void setHJissekiJikoku11181(long arg) {
  setHJissekiJikoku11181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku12181Bytes() {
    return hJissekiJikoku12181;
  }

  public void setHJissekiJikoku12181Bytes(byte[] arg) {
    hJissekiJikoku12181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku12181() {
    hJissekiJikoku12181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku12181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku12181Bytes());
  }

  public void setHJissekiJikoku12181(long arg) {
  setHJissekiJikoku12181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku13181Bytes() {
    return hJissekiJikoku13181;
  }

  public void setHJissekiJikoku13181Bytes(byte[] arg) {
    hJissekiJikoku13181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku13181() {
    hJissekiJikoku13181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku13181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku13181Bytes());
  }

  public void setHJissekiJikoku13181(long arg) {
  setHJissekiJikoku13181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku14181Bytes() {
    return hJissekiJikoku14181;
  }

  public void setHJissekiJikoku14181Bytes(byte[] arg) {
    hJissekiJikoku14181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku14181() {
    hJissekiJikoku14181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku14181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku14181Bytes());
  }

  public void setHJissekiJikoku14181(long arg) {
  setHJissekiJikoku14181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku15181Bytes() {
    return hJissekiJikoku15181;
  }

  public void setHJissekiJikoku15181Bytes(byte[] arg) {
    hJissekiJikoku15181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku15181() {
    hJissekiJikoku15181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku15181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku15181Bytes());
  }

  public void setHJissekiJikoku15181(long arg) {
  setHJissekiJikoku15181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku16181Bytes() {
    return hJissekiJikoku16181;
  }

  public void setHJissekiJikoku16181Bytes(byte[] arg) {
    hJissekiJikoku16181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku16181() {
    hJissekiJikoku16181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku16181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku16181Bytes());
  }

  public void setHJissekiJikoku16181(long arg) {
  setHJissekiJikoku16181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHJissekiJikoku17181Bytes() {
    return hJissekiJikoku17181;
  }

  public void setHJissekiJikoku17181Bytes(byte[] arg) {
    hJissekiJikoku17181 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJikoku17181() {
    hJissekiJikoku17181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHJissekiJikoku17181() {
    return CommonUtils.packedDecimalToNumber(getHJissekiJikoku17181Bytes());
  }

  public void setHJissekiJikoku17181(long arg) {
  setHJissekiJikoku17181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku01181Bytes() {
    return hOriginalKeikaku01181;
  }

  public void setHOriginalKeikaku01181Bytes(byte[] arg) {
    hOriginalKeikaku01181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku01181() {
    hOriginalKeikaku01181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku01181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku01181Bytes());
  }

  public void setHOriginalKeikaku01181(long arg) {
  setHOriginalKeikaku01181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku02181Bytes() {
    return hOriginalKeikaku02181;
  }

  public void setHOriginalKeikaku02181Bytes(byte[] arg) {
    hOriginalKeikaku02181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku02181() {
    hOriginalKeikaku02181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku02181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku02181Bytes());
  }

  public void setHOriginalKeikaku02181(long arg) {
  setHOriginalKeikaku02181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku03181Bytes() {
    return hOriginalKeikaku03181;
  }

  public void setHOriginalKeikaku03181Bytes(byte[] arg) {
    hOriginalKeikaku03181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku03181() {
    hOriginalKeikaku03181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku03181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku03181Bytes());
  }

  public void setHOriginalKeikaku03181(long arg) {
  setHOriginalKeikaku03181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku04181Bytes() {
    return hOriginalKeikaku04181;
  }

  public void setHOriginalKeikaku04181Bytes(byte[] arg) {
    hOriginalKeikaku04181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku04181() {
    hOriginalKeikaku04181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku04181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku04181Bytes());
  }

  public void setHOriginalKeikaku04181(long arg) {
  setHOriginalKeikaku04181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku05181Bytes() {
    return hOriginalKeikaku05181;
  }

  public void setHOriginalKeikaku05181Bytes(byte[] arg) {
    hOriginalKeikaku05181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku05181() {
    hOriginalKeikaku05181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku05181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku05181Bytes());
  }

  public void setHOriginalKeikaku05181(long arg) {
  setHOriginalKeikaku05181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku06181Bytes() {
    return hOriginalKeikaku06181;
  }

  public void setHOriginalKeikaku06181Bytes(byte[] arg) {
    hOriginalKeikaku06181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku06181() {
    hOriginalKeikaku06181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku06181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku06181Bytes());
  }

  public void setHOriginalKeikaku06181(long arg) {
  setHOriginalKeikaku06181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku07181Bytes() {
    return hOriginalKeikaku07181;
  }

  public void setHOriginalKeikaku07181Bytes(byte[] arg) {
    hOriginalKeikaku07181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku07181() {
    hOriginalKeikaku07181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku07181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku07181Bytes());
  }

  public void setHOriginalKeikaku07181(long arg) {
  setHOriginalKeikaku07181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku08181Bytes() {
    return hOriginalKeikaku08181;
  }

  public void setHOriginalKeikaku08181Bytes(byte[] arg) {
    hOriginalKeikaku08181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku08181() {
    hOriginalKeikaku08181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku08181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku08181Bytes());
  }

  public void setHOriginalKeikaku08181(long arg) {
  setHOriginalKeikaku08181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku09181Bytes() {
    return hOriginalKeikaku09181;
  }

  public void setHOriginalKeikaku09181Bytes(byte[] arg) {
    hOriginalKeikaku09181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku09181() {
    hOriginalKeikaku09181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku09181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku09181Bytes());
  }

  public void setHOriginalKeikaku09181(long arg) {
  setHOriginalKeikaku09181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku10181Bytes() {
    return hOriginalKeikaku10181;
  }

  public void setHOriginalKeikaku10181Bytes(byte[] arg) {
    hOriginalKeikaku10181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku10181() {
    hOriginalKeikaku10181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku10181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku10181Bytes());
  }

  public void setHOriginalKeikaku10181(long arg) {
  setHOriginalKeikaku10181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku11181Bytes() {
    return hOriginalKeikaku11181;
  }

  public void setHOriginalKeikaku11181Bytes(byte[] arg) {
    hOriginalKeikaku11181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku11181() {
    hOriginalKeikaku11181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku11181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku11181Bytes());
  }

  public void setHOriginalKeikaku11181(long arg) {
  setHOriginalKeikaku11181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku12181Bytes() {
    return hOriginalKeikaku12181;
  }

  public void setHOriginalKeikaku12181Bytes(byte[] arg) {
    hOriginalKeikaku12181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku12181() {
    hOriginalKeikaku12181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku12181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku12181Bytes());
  }

  public void setHOriginalKeikaku12181(long arg) {
  setHOriginalKeikaku12181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku13181Bytes() {
    return hOriginalKeikaku13181;
  }

  public void setHOriginalKeikaku13181Bytes(byte[] arg) {
    hOriginalKeikaku13181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku13181() {
    hOriginalKeikaku13181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku13181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku13181Bytes());
  }

  public void setHOriginalKeikaku13181(long arg) {
  setHOriginalKeikaku13181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku14181Bytes() {
    return hOriginalKeikaku14181;
  }

  public void setHOriginalKeikaku14181Bytes(byte[] arg) {
    hOriginalKeikaku14181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku14181() {
    hOriginalKeikaku14181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku14181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku14181Bytes());
  }

  public void setHOriginalKeikaku14181(long arg) {
  setHOriginalKeikaku14181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku15181Bytes() {
    return hOriginalKeikaku15181;
  }

  public void setHOriginalKeikaku15181Bytes(byte[] arg) {
    hOriginalKeikaku15181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku15181() {
    hOriginalKeikaku15181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku15181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku15181Bytes());
  }

  public void setHOriginalKeikaku15181(long arg) {
  setHOriginalKeikaku15181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku16181Bytes() {
    return hOriginalKeikaku16181;
  }

  public void setHOriginalKeikaku16181Bytes(byte[] arg) {
    hOriginalKeikaku16181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku16181() {
    hOriginalKeikaku16181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku16181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku16181Bytes());
  }

  public void setHOriginalKeikaku16181(long arg) {
  setHOriginalKeikaku16181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHOriginalKeikaku17181Bytes() {
    return hOriginalKeikaku17181;
  }

  public void setHOriginalKeikaku17181Bytes(byte[] arg) {
    hOriginalKeikaku17181 = ArrayUtils.clone(arg);
  }

  public void initHOriginalKeikaku17181() {
    hOriginalKeikaku17181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHOriginalKeikaku17181() {
    return CommonUtils.packedDecimalToNumber(getHOriginalKeikaku17181Bytes());
  }

  public void setHOriginalKeikaku17181(long arg) {
  setHOriginalKeikaku17181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku01181Bytes() {
    return hRevised2Keikaku01181;
  }

  public void setHRevised2Keikaku01181Bytes(byte[] arg) {
    hRevised2Keikaku01181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku01181() {
    hRevised2Keikaku01181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku01181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku01181Bytes());
  }

  public void setHRevised2Keikaku01181(long arg) {
  setHRevised2Keikaku01181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku02181Bytes() {
    return hRevised2Keikaku02181;
  }

  public void setHRevised2Keikaku02181Bytes(byte[] arg) {
    hRevised2Keikaku02181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku02181() {
    hRevised2Keikaku02181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku02181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku02181Bytes());
  }

  public void setHRevised2Keikaku02181(long arg) {
  setHRevised2Keikaku02181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku03181Bytes() {
    return hRevised2Keikaku03181;
  }

  public void setHRevised2Keikaku03181Bytes(byte[] arg) {
    hRevised2Keikaku03181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku03181() {
    hRevised2Keikaku03181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku03181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku03181Bytes());
  }

  public void setHRevised2Keikaku03181(long arg) {
  setHRevised2Keikaku03181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku04181Bytes() {
    return hRevised2Keikaku04181;
  }

  public void setHRevised2Keikaku04181Bytes(byte[] arg) {
    hRevised2Keikaku04181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku04181() {
    hRevised2Keikaku04181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku04181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku04181Bytes());
  }

  public void setHRevised2Keikaku04181(long arg) {
  setHRevised2Keikaku04181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku05181Bytes() {
    return hRevised2Keikaku05181;
  }

  public void setHRevised2Keikaku05181Bytes(byte[] arg) {
    hRevised2Keikaku05181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku05181() {
    hRevised2Keikaku05181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku05181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku05181Bytes());
  }

  public void setHRevised2Keikaku05181(long arg) {
  setHRevised2Keikaku05181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku06181Bytes() {
    return hRevised2Keikaku06181;
  }

  public void setHRevised2Keikaku06181Bytes(byte[] arg) {
    hRevised2Keikaku06181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku06181() {
    hRevised2Keikaku06181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku06181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku06181Bytes());
  }

  public void setHRevised2Keikaku06181(long arg) {
  setHRevised2Keikaku06181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku07181Bytes() {
    return hRevised2Keikaku07181;
  }

  public void setHRevised2Keikaku07181Bytes(byte[] arg) {
    hRevised2Keikaku07181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku07181() {
    hRevised2Keikaku07181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku07181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku07181Bytes());
  }

  public void setHRevised2Keikaku07181(long arg) {
  setHRevised2Keikaku07181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku08181Bytes() {
    return hRevised2Keikaku08181;
  }

  public void setHRevised2Keikaku08181Bytes(byte[] arg) {
    hRevised2Keikaku08181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku08181() {
    hRevised2Keikaku08181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku08181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku08181Bytes());
  }

  public void setHRevised2Keikaku08181(long arg) {
  setHRevised2Keikaku08181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku09181Bytes() {
    return hRevised2Keikaku09181;
  }

  public void setHRevised2Keikaku09181Bytes(byte[] arg) {
    hRevised2Keikaku09181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku09181() {
    hRevised2Keikaku09181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku09181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku09181Bytes());
  }

  public void setHRevised2Keikaku09181(long arg) {
  setHRevised2Keikaku09181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku10181Bytes() {
    return hRevised2Keikaku10181;
  }

  public void setHRevised2Keikaku10181Bytes(byte[] arg) {
    hRevised2Keikaku10181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku10181() {
    hRevised2Keikaku10181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku10181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku10181Bytes());
  }

  public void setHRevised2Keikaku10181(long arg) {
  setHRevised2Keikaku10181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku11181Bytes() {
    return hRevised2Keikaku11181;
  }

  public void setHRevised2Keikaku11181Bytes(byte[] arg) {
    hRevised2Keikaku11181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku11181() {
    hRevised2Keikaku11181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku11181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku11181Bytes());
  }

  public void setHRevised2Keikaku11181(long arg) {
  setHRevised2Keikaku11181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku12181Bytes() {
    return hRevised2Keikaku12181;
  }

  public void setHRevised2Keikaku12181Bytes(byte[] arg) {
    hRevised2Keikaku12181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku12181() {
    hRevised2Keikaku12181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku12181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku12181Bytes());
  }

  public void setHRevised2Keikaku12181(long arg) {
  setHRevised2Keikaku12181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku13181Bytes() {
    return hRevised2Keikaku13181;
  }

  public void setHRevised2Keikaku13181Bytes(byte[] arg) {
    hRevised2Keikaku13181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku13181() {
    hRevised2Keikaku13181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku13181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku13181Bytes());
  }

  public void setHRevised2Keikaku13181(long arg) {
  setHRevised2Keikaku13181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku14181Bytes() {
    return hRevised2Keikaku14181;
  }

  public void setHRevised2Keikaku14181Bytes(byte[] arg) {
    hRevised2Keikaku14181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku14181() {
    hRevised2Keikaku14181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku14181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku14181Bytes());
  }

  public void setHRevised2Keikaku14181(long arg) {
  setHRevised2Keikaku14181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku15181Bytes() {
    return hRevised2Keikaku15181;
  }

  public void setHRevised2Keikaku15181Bytes(byte[] arg) {
    hRevised2Keikaku15181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku15181() {
    hRevised2Keikaku15181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku15181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku15181Bytes());
  }

  public void setHRevised2Keikaku15181(long arg) {
  setHRevised2Keikaku15181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku16181Bytes() {
    return hRevised2Keikaku16181;
  }

  public void setHRevised2Keikaku16181Bytes(byte[] arg) {
    hRevised2Keikaku16181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku16181() {
    hRevised2Keikaku16181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku16181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku16181Bytes());
  }

  public void setHRevised2Keikaku16181(long arg) {
  setHRevised2Keikaku16181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised2Keikaku17181Bytes() {
    return hRevised2Keikaku17181;
  }

  public void setHRevised2Keikaku17181Bytes(byte[] arg) {
    hRevised2Keikaku17181 = ArrayUtils.clone(arg);
  }

  public void initHRevised2Keikaku17181() {
    hRevised2Keikaku17181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised2Keikaku17181() {
    return CommonUtils.packedDecimalToNumber(getHRevised2Keikaku17181Bytes());
  }

  public void setHRevised2Keikaku17181(long arg) {
  setHRevised2Keikaku17181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku01181Bytes() {
    return hRevised1Keikaku01181;
  }

  public void setHRevised1Keikaku01181Bytes(byte[] arg) {
    hRevised1Keikaku01181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku01181() {
    hRevised1Keikaku01181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku01181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku01181Bytes());
  }

  public void setHRevised1Keikaku01181(long arg) {
  setHRevised1Keikaku01181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku02181Bytes() {
    return hRevised1Keikaku02181;
  }

  public void setHRevised1Keikaku02181Bytes(byte[] arg) {
    hRevised1Keikaku02181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku02181() {
    hRevised1Keikaku02181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku02181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku02181Bytes());
  }

  public void setHRevised1Keikaku02181(long arg) {
  setHRevised1Keikaku02181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku03181Bytes() {
    return hRevised1Keikaku03181;
  }

  public void setHRevised1Keikaku03181Bytes(byte[] arg) {
    hRevised1Keikaku03181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku03181() {
    hRevised1Keikaku03181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku03181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku03181Bytes());
  }

  public void setHRevised1Keikaku03181(long arg) {
  setHRevised1Keikaku03181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku04181Bytes() {
    return hRevised1Keikaku04181;
  }

  public void setHRevised1Keikaku04181Bytes(byte[] arg) {
    hRevised1Keikaku04181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku04181() {
    hRevised1Keikaku04181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku04181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku04181Bytes());
  }

  public void setHRevised1Keikaku04181(long arg) {
  setHRevised1Keikaku04181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku05181Bytes() {
    return hRevised1Keikaku05181;
  }

  public void setHRevised1Keikaku05181Bytes(byte[] arg) {
    hRevised1Keikaku05181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku05181() {
    hRevised1Keikaku05181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku05181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku05181Bytes());
  }

  public void setHRevised1Keikaku05181(long arg) {
  setHRevised1Keikaku05181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku06181Bytes() {
    return hRevised1Keikaku06181;
  }

  public void setHRevised1Keikaku06181Bytes(byte[] arg) {
    hRevised1Keikaku06181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku06181() {
    hRevised1Keikaku06181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku06181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku06181Bytes());
  }

  public void setHRevised1Keikaku06181(long arg) {
  setHRevised1Keikaku06181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku07181Bytes() {
    return hRevised1Keikaku07181;
  }

  public void setHRevised1Keikaku07181Bytes(byte[] arg) {
    hRevised1Keikaku07181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku07181() {
    hRevised1Keikaku07181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku07181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku07181Bytes());
  }

  public void setHRevised1Keikaku07181(long arg) {
  setHRevised1Keikaku07181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku08181Bytes() {
    return hRevised1Keikaku08181;
  }

  public void setHRevised1Keikaku08181Bytes(byte[] arg) {
    hRevised1Keikaku08181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku08181() {
    hRevised1Keikaku08181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku08181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku08181Bytes());
  }

  public void setHRevised1Keikaku08181(long arg) {
  setHRevised1Keikaku08181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku09181Bytes() {
    return hRevised1Keikaku09181;
  }

  public void setHRevised1Keikaku09181Bytes(byte[] arg) {
    hRevised1Keikaku09181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku09181() {
    hRevised1Keikaku09181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku09181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku09181Bytes());
  }

  public void setHRevised1Keikaku09181(long arg) {
  setHRevised1Keikaku09181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku10181Bytes() {
    return hRevised1Keikaku10181;
  }

  public void setHRevised1Keikaku10181Bytes(byte[] arg) {
    hRevised1Keikaku10181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku10181() {
    hRevised1Keikaku10181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku10181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku10181Bytes());
  }

  public void setHRevised1Keikaku10181(long arg) {
  setHRevised1Keikaku10181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku11181Bytes() {
    return hRevised1Keikaku11181;
  }

  public void setHRevised1Keikaku11181Bytes(byte[] arg) {
    hRevised1Keikaku11181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku11181() {
    hRevised1Keikaku11181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku11181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku11181Bytes());
  }

  public void setHRevised1Keikaku11181(long arg) {
  setHRevised1Keikaku11181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku12181Bytes() {
    return hRevised1Keikaku12181;
  }

  public void setHRevised1Keikaku12181Bytes(byte[] arg) {
    hRevised1Keikaku12181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku12181() {
    hRevised1Keikaku12181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku12181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku12181Bytes());
  }

  public void setHRevised1Keikaku12181(long arg) {
  setHRevised1Keikaku12181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku13181Bytes() {
    return hRevised1Keikaku13181;
  }

  public void setHRevised1Keikaku13181Bytes(byte[] arg) {
    hRevised1Keikaku13181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku13181() {
    hRevised1Keikaku13181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku13181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku13181Bytes());
  }

  public void setHRevised1Keikaku13181(long arg) {
  setHRevised1Keikaku13181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku14181Bytes() {
    return hRevised1Keikaku14181;
  }

  public void setHRevised1Keikaku14181Bytes(byte[] arg) {
    hRevised1Keikaku14181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku14181() {
    hRevised1Keikaku14181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku14181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku14181Bytes());
  }

  public void setHRevised1Keikaku14181(long arg) {
  setHRevised1Keikaku14181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku15181Bytes() {
    return hRevised1Keikaku15181;
  }

  public void setHRevised1Keikaku15181Bytes(byte[] arg) {
    hRevised1Keikaku15181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku15181() {
    hRevised1Keikaku15181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku15181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku15181Bytes());
  }

  public void setHRevised1Keikaku15181(long arg) {
  setHRevised1Keikaku15181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku16181Bytes() {
    return hRevised1Keikaku16181;
  }

  public void setHRevised1Keikaku16181Bytes(byte[] arg) {
    hRevised1Keikaku16181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku16181() {
    hRevised1Keikaku16181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku16181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku16181Bytes());
  }

  public void setHRevised1Keikaku16181(long arg) {
  setHRevised1Keikaku16181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHRevised1Keikaku17181Bytes() {
    return hRevised1Keikaku17181;
  }

  public void setHRevised1Keikaku17181Bytes(byte[] arg) {
    hRevised1Keikaku17181 = ArrayUtils.clone(arg);
  }

  public void initHRevised1Keikaku17181() {
    hRevised1Keikaku17181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHRevised1Keikaku17181() {
    return CommonUtils.packedDecimalToNumber(getHRevised1Keikaku17181Bytes());
  }

  public void setHRevised1Keikaku17181(long arg) {
  setHRevised1Keikaku17181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHIkkatsuSym201181Bytes() {
    return hIkkatsuSym201181;
  }

  public void setHIkkatsuSym201181Bytes(byte[] arg) {
    hIkkatsuSym201181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym201181() {
    hIkkatsuSym201181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym201181() {
  return CommonUtils.bytesToString(getHIkkatsuSym201181Bytes());
  }

  public void setHIkkatsuSym201181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym201181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym201181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym202181Bytes() {
    return hIkkatsuSym202181;
  }

  public void setHIkkatsuSym202181Bytes(byte[] arg) {
    hIkkatsuSym202181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym202181() {
    hIkkatsuSym202181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym202181() {
  return CommonUtils.bytesToString(getHIkkatsuSym202181Bytes());
  }

  public void setHIkkatsuSym202181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym202181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym202181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym203181Bytes() {
    return hIkkatsuSym203181;
  }

  public void setHIkkatsuSym203181Bytes(byte[] arg) {
    hIkkatsuSym203181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym203181() {
    hIkkatsuSym203181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym203181() {
  return CommonUtils.bytesToString(getHIkkatsuSym203181Bytes());
  }

  public void setHIkkatsuSym203181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym203181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym203181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym204181Bytes() {
    return hIkkatsuSym204181;
  }

  public void setHIkkatsuSym204181Bytes(byte[] arg) {
    hIkkatsuSym204181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym204181() {
    hIkkatsuSym204181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym204181() {
  return CommonUtils.bytesToString(getHIkkatsuSym204181Bytes());
  }

  public void setHIkkatsuSym204181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym204181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym204181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym205181Bytes() {
    return hIkkatsuSym205181;
  }

  public void setHIkkatsuSym205181Bytes(byte[] arg) {
    hIkkatsuSym205181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym205181() {
    hIkkatsuSym205181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym205181() {
  return CommonUtils.bytesToString(getHIkkatsuSym205181Bytes());
  }

  public void setHIkkatsuSym205181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym205181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym205181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym206181Bytes() {
    return hIkkatsuSym206181;
  }

  public void setHIkkatsuSym206181Bytes(byte[] arg) {
    hIkkatsuSym206181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym206181() {
    hIkkatsuSym206181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym206181() {
  return CommonUtils.bytesToString(getHIkkatsuSym206181Bytes());
  }

  public void setHIkkatsuSym206181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym206181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym206181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym207181Bytes() {
    return hIkkatsuSym207181;
  }

  public void setHIkkatsuSym207181Bytes(byte[] arg) {
    hIkkatsuSym207181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym207181() {
    hIkkatsuSym207181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym207181() {
  return CommonUtils.bytesToString(getHIkkatsuSym207181Bytes());
  }

  public void setHIkkatsuSym207181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym207181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym207181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym208181Bytes() {
    return hIkkatsuSym208181;
  }

  public void setHIkkatsuSym208181Bytes(byte[] arg) {
    hIkkatsuSym208181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym208181() {
    hIkkatsuSym208181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym208181() {
  return CommonUtils.bytesToString(getHIkkatsuSym208181Bytes());
  }

  public void setHIkkatsuSym208181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym208181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym208181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym209181Bytes() {
    return hIkkatsuSym209181;
  }

  public void setHIkkatsuSym209181Bytes(byte[] arg) {
    hIkkatsuSym209181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym209181() {
    hIkkatsuSym209181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym209181() {
  return CommonUtils.bytesToString(getHIkkatsuSym209181Bytes());
  }

  public void setHIkkatsuSym209181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym209181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym209181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym210181Bytes() {
    return hIkkatsuSym210181;
  }

  public void setHIkkatsuSym210181Bytes(byte[] arg) {
    hIkkatsuSym210181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym210181() {
    hIkkatsuSym210181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym210181() {
  return CommonUtils.bytesToString(getHIkkatsuSym210181Bytes());
  }

  public void setHIkkatsuSym210181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym210181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym210181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym211181Bytes() {
    return hIkkatsuSym211181;
  }

  public void setHIkkatsuSym211181Bytes(byte[] arg) {
    hIkkatsuSym211181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym211181() {
    hIkkatsuSym211181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym211181() {
  return CommonUtils.bytesToString(getHIkkatsuSym211181Bytes());
  }

  public void setHIkkatsuSym211181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym211181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym211181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym212181Bytes() {
    return hIkkatsuSym212181;
  }

  public void setHIkkatsuSym212181Bytes(byte[] arg) {
    hIkkatsuSym212181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym212181() {
    hIkkatsuSym212181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym212181() {
  return CommonUtils.bytesToString(getHIkkatsuSym212181Bytes());
  }

  public void setHIkkatsuSym212181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym212181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym212181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym213181Bytes() {
    return hIkkatsuSym213181;
  }

  public void setHIkkatsuSym213181Bytes(byte[] arg) {
    hIkkatsuSym213181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym213181() {
    hIkkatsuSym213181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym213181() {
  return CommonUtils.bytesToString(getHIkkatsuSym213181Bytes());
  }

  public void setHIkkatsuSym213181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym213181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym213181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym214181Bytes() {
    return hIkkatsuSym214181;
  }

  public void setHIkkatsuSym214181Bytes(byte[] arg) {
    hIkkatsuSym214181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym214181() {
    hIkkatsuSym214181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym214181() {
  return CommonUtils.bytesToString(getHIkkatsuSym214181Bytes());
  }

  public void setHIkkatsuSym214181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym214181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym214181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym215181Bytes() {
    return hIkkatsuSym215181;
  }

  public void setHIkkatsuSym215181Bytes(byte[] arg) {
    hIkkatsuSym215181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym215181() {
    hIkkatsuSym215181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym215181() {
  return CommonUtils.bytesToString(getHIkkatsuSym215181Bytes());
  }

  public void setHIkkatsuSym215181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym215181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym215181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym216181Bytes() {
    return hIkkatsuSym216181;
  }

  public void setHIkkatsuSym216181Bytes(byte[] arg) {
    hIkkatsuSym216181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym216181() {
    hIkkatsuSym216181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym216181() {
  return CommonUtils.bytesToString(getHIkkatsuSym216181Bytes());
  }

  public void setHIkkatsuSym216181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym216181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym216181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym217181Bytes() {
    return hIkkatsuSym217181;
  }

  public void setHIkkatsuSym217181Bytes(byte[] arg) {
    hIkkatsuSym217181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym217181() {
    hIkkatsuSym217181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym217181() {
  return CommonUtils.bytesToString(getHIkkatsuSym217181Bytes());
  }

  public void setHIkkatsuSym217181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym217181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym217181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym101181Bytes() {
    return hIkkatsuSym101181;
  }

  public void setHIkkatsuSym101181Bytes(byte[] arg) {
    hIkkatsuSym101181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym101181() {
    hIkkatsuSym101181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym101181() {
  return CommonUtils.bytesToString(getHIkkatsuSym101181Bytes());
  }

  public void setHIkkatsuSym101181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym101181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym101181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym102181Bytes() {
    return hIkkatsuSym102181;
  }

  public void setHIkkatsuSym102181Bytes(byte[] arg) {
    hIkkatsuSym102181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym102181() {
    hIkkatsuSym102181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym102181() {
  return CommonUtils.bytesToString(getHIkkatsuSym102181Bytes());
  }

  public void setHIkkatsuSym102181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym102181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym102181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym103181Bytes() {
    return hIkkatsuSym103181;
  }

  public void setHIkkatsuSym103181Bytes(byte[] arg) {
    hIkkatsuSym103181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym103181() {
    hIkkatsuSym103181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym103181() {
  return CommonUtils.bytesToString(getHIkkatsuSym103181Bytes());
  }

  public void setHIkkatsuSym103181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym103181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym103181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym104181Bytes() {
    return hIkkatsuSym104181;
  }

  public void setHIkkatsuSym104181Bytes(byte[] arg) {
    hIkkatsuSym104181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym104181() {
    hIkkatsuSym104181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym104181() {
  return CommonUtils.bytesToString(getHIkkatsuSym104181Bytes());
  }

  public void setHIkkatsuSym104181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym104181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym104181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym105181Bytes() {
    return hIkkatsuSym105181;
  }

  public void setHIkkatsuSym105181Bytes(byte[] arg) {
    hIkkatsuSym105181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym105181() {
    hIkkatsuSym105181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym105181() {
  return CommonUtils.bytesToString(getHIkkatsuSym105181Bytes());
  }

  public void setHIkkatsuSym105181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym105181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym105181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym106181Bytes() {
    return hIkkatsuSym106181;
  }

  public void setHIkkatsuSym106181Bytes(byte[] arg) {
    hIkkatsuSym106181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym106181() {
    hIkkatsuSym106181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym106181() {
  return CommonUtils.bytesToString(getHIkkatsuSym106181Bytes());
  }

  public void setHIkkatsuSym106181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym106181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym106181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym107181Bytes() {
    return hIkkatsuSym107181;
  }

  public void setHIkkatsuSym107181Bytes(byte[] arg) {
    hIkkatsuSym107181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym107181() {
    hIkkatsuSym107181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym107181() {
  return CommonUtils.bytesToString(getHIkkatsuSym107181Bytes());
  }

  public void setHIkkatsuSym107181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym107181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym107181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym108181Bytes() {
    return hIkkatsuSym108181;
  }

  public void setHIkkatsuSym108181Bytes(byte[] arg) {
    hIkkatsuSym108181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym108181() {
    hIkkatsuSym108181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym108181() {
  return CommonUtils.bytesToString(getHIkkatsuSym108181Bytes());
  }

  public void setHIkkatsuSym108181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym108181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym108181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym109181Bytes() {
    return hIkkatsuSym109181;
  }

  public void setHIkkatsuSym109181Bytes(byte[] arg) {
    hIkkatsuSym109181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym109181() {
    hIkkatsuSym109181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym109181() {
  return CommonUtils.bytesToString(getHIkkatsuSym109181Bytes());
  }

  public void setHIkkatsuSym109181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym109181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym109181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym110181Bytes() {
    return hIkkatsuSym110181;
  }

  public void setHIkkatsuSym110181Bytes(byte[] arg) {
    hIkkatsuSym110181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym110181() {
    hIkkatsuSym110181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym110181() {
  return CommonUtils.bytesToString(getHIkkatsuSym110181Bytes());
  }

  public void setHIkkatsuSym110181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym110181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym110181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym111181Bytes() {
    return hIkkatsuSym111181;
  }

  public void setHIkkatsuSym111181Bytes(byte[] arg) {
    hIkkatsuSym111181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym111181() {
    hIkkatsuSym111181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym111181() {
  return CommonUtils.bytesToString(getHIkkatsuSym111181Bytes());
  }

  public void setHIkkatsuSym111181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym111181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym111181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym112181Bytes() {
    return hIkkatsuSym112181;
  }

  public void setHIkkatsuSym112181Bytes(byte[] arg) {
    hIkkatsuSym112181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym112181() {
    hIkkatsuSym112181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym112181() {
  return CommonUtils.bytesToString(getHIkkatsuSym112181Bytes());
  }

  public void setHIkkatsuSym112181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym112181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym112181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym113181Bytes() {
    return hIkkatsuSym113181;
  }

  public void setHIkkatsuSym113181Bytes(byte[] arg) {
    hIkkatsuSym113181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym113181() {
    hIkkatsuSym113181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym113181() {
  return CommonUtils.bytesToString(getHIkkatsuSym113181Bytes());
  }

  public void setHIkkatsuSym113181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym113181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym113181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym114181Bytes() {
    return hIkkatsuSym114181;
  }

  public void setHIkkatsuSym114181Bytes(byte[] arg) {
    hIkkatsuSym114181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym114181() {
    hIkkatsuSym114181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym114181() {
  return CommonUtils.bytesToString(getHIkkatsuSym114181Bytes());
  }

  public void setHIkkatsuSym114181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym114181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym114181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym115181Bytes() {
    return hIkkatsuSym115181;
  }

  public void setHIkkatsuSym115181Bytes(byte[] arg) {
    hIkkatsuSym115181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym115181() {
    hIkkatsuSym115181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym115181() {
  return CommonUtils.bytesToString(getHIkkatsuSym115181Bytes());
  }

  public void setHIkkatsuSym115181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym115181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym115181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym116181Bytes() {
    return hIkkatsuSym116181;
  }

  public void setHIkkatsuSym116181Bytes(byte[] arg) {
    hIkkatsuSym116181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym116181() {
    hIkkatsuSym116181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym116181() {
  return CommonUtils.bytesToString(getHIkkatsuSym116181Bytes());
  }

  public void setHIkkatsuSym116181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym116181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym116181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHIkkatsuSym117181Bytes() {
    return hIkkatsuSym117181;
  }

  public void setHIkkatsuSym117181Bytes(byte[] arg) {
    hIkkatsuSym117181 = ArrayUtils.clone(arg);
  }

  public void initHIkkatsuSym117181() {
    hIkkatsuSym117181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHIkkatsuSym117181() {
  return CommonUtils.bytesToString(getHIkkatsuSym117181Bytes());
  }

  public void setHIkkatsuSym117181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHIkkatsuSym117181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkkatsuSym117181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHYoteiInputJikoku01181Bytes() {
    return hYoteiInputJikoku01181;
  }

  public void setHYoteiInputJikoku01181Bytes(byte[] arg) {
    hYoteiInputJikoku01181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku01181() {
    hYoteiInputJikoku01181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku01181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku01181Bytes());
  }

  public void setHYoteiInputJikoku01181(long arg) {
  setHYoteiInputJikoku01181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku02181Bytes() {
    return hYoteiInputJikoku02181;
  }

  public void setHYoteiInputJikoku02181Bytes(byte[] arg) {
    hYoteiInputJikoku02181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku02181() {
    hYoteiInputJikoku02181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku02181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku02181Bytes());
  }

  public void setHYoteiInputJikoku02181(long arg) {
  setHYoteiInputJikoku02181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku03181Bytes() {
    return hYoteiInputJikoku03181;
  }

  public void setHYoteiInputJikoku03181Bytes(byte[] arg) {
    hYoteiInputJikoku03181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku03181() {
    hYoteiInputJikoku03181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku03181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku03181Bytes());
  }

  public void setHYoteiInputJikoku03181(long arg) {
  setHYoteiInputJikoku03181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku04181Bytes() {
    return hYoteiInputJikoku04181;
  }

  public void setHYoteiInputJikoku04181Bytes(byte[] arg) {
    hYoteiInputJikoku04181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku04181() {
    hYoteiInputJikoku04181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku04181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku04181Bytes());
  }

  public void setHYoteiInputJikoku04181(long arg) {
  setHYoteiInputJikoku04181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku05181Bytes() {
    return hYoteiInputJikoku05181;
  }

  public void setHYoteiInputJikoku05181Bytes(byte[] arg) {
    hYoteiInputJikoku05181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku05181() {
    hYoteiInputJikoku05181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku05181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku05181Bytes());
  }

  public void setHYoteiInputJikoku05181(long arg) {
  setHYoteiInputJikoku05181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku06181Bytes() {
    return hYoteiInputJikoku06181;
  }

  public void setHYoteiInputJikoku06181Bytes(byte[] arg) {
    hYoteiInputJikoku06181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku06181() {
    hYoteiInputJikoku06181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku06181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku06181Bytes());
  }

  public void setHYoteiInputJikoku06181(long arg) {
  setHYoteiInputJikoku06181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku07181Bytes() {
    return hYoteiInputJikoku07181;
  }

  public void setHYoteiInputJikoku07181Bytes(byte[] arg) {
    hYoteiInputJikoku07181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku07181() {
    hYoteiInputJikoku07181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku07181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku07181Bytes());
  }

  public void setHYoteiInputJikoku07181(long arg) {
  setHYoteiInputJikoku07181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku08181Bytes() {
    return hYoteiInputJikoku08181;
  }

  public void setHYoteiInputJikoku08181Bytes(byte[] arg) {
    hYoteiInputJikoku08181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku08181() {
    hYoteiInputJikoku08181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku08181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku08181Bytes());
  }

  public void setHYoteiInputJikoku08181(long arg) {
  setHYoteiInputJikoku08181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku09181Bytes() {
    return hYoteiInputJikoku09181;
  }

  public void setHYoteiInputJikoku09181Bytes(byte[] arg) {
    hYoteiInputJikoku09181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku09181() {
    hYoteiInputJikoku09181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku09181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku09181Bytes());
  }

  public void setHYoteiInputJikoku09181(long arg) {
  setHYoteiInputJikoku09181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku10181Bytes() {
    return hYoteiInputJikoku10181;
  }

  public void setHYoteiInputJikoku10181Bytes(byte[] arg) {
    hYoteiInputJikoku10181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku10181() {
    hYoteiInputJikoku10181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku10181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku10181Bytes());
  }

  public void setHYoteiInputJikoku10181(long arg) {
  setHYoteiInputJikoku10181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku11181Bytes() {
    return hYoteiInputJikoku11181;
  }

  public void setHYoteiInputJikoku11181Bytes(byte[] arg) {
    hYoteiInputJikoku11181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku11181() {
    hYoteiInputJikoku11181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku11181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku11181Bytes());
  }

  public void setHYoteiInputJikoku11181(long arg) {
  setHYoteiInputJikoku11181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku12181Bytes() {
    return hYoteiInputJikoku12181;
  }

  public void setHYoteiInputJikoku12181Bytes(byte[] arg) {
    hYoteiInputJikoku12181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku12181() {
    hYoteiInputJikoku12181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku12181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku12181Bytes());
  }

  public void setHYoteiInputJikoku12181(long arg) {
  setHYoteiInputJikoku12181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku13181Bytes() {
    return hYoteiInputJikoku13181;
  }

  public void setHYoteiInputJikoku13181Bytes(byte[] arg) {
    hYoteiInputJikoku13181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku13181() {
    hYoteiInputJikoku13181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku13181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku13181Bytes());
  }

  public void setHYoteiInputJikoku13181(long arg) {
  setHYoteiInputJikoku13181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku14181Bytes() {
    return hYoteiInputJikoku14181;
  }

  public void setHYoteiInputJikoku14181Bytes(byte[] arg) {
    hYoteiInputJikoku14181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku14181() {
    hYoteiInputJikoku14181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku14181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku14181Bytes());
  }

  public void setHYoteiInputJikoku14181(long arg) {
  setHYoteiInputJikoku14181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku15181Bytes() {
    return hYoteiInputJikoku15181;
  }

  public void setHYoteiInputJikoku15181Bytes(byte[] arg) {
    hYoteiInputJikoku15181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku15181() {
    hYoteiInputJikoku15181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku15181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku15181Bytes());
  }

  public void setHYoteiInputJikoku15181(long arg) {
  setHYoteiInputJikoku15181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku16181Bytes() {
    return hYoteiInputJikoku16181;
  }

  public void setHYoteiInputJikoku16181Bytes(byte[] arg) {
    hYoteiInputJikoku16181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku16181() {
    hYoteiInputJikoku16181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku16181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku16181Bytes());
  }

  public void setHYoteiInputJikoku16181(long arg) {
  setHYoteiInputJikoku16181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHYoteiInputJikoku17181Bytes() {
    return hYoteiInputJikoku17181;
  }

  public void setHYoteiInputJikoku17181Bytes(byte[] arg) {
    hYoteiInputJikoku17181 = ArrayUtils.clone(arg);
  }

  public void initHYoteiInputJikoku17181() {
    hYoteiInputJikoku17181 =CommonUtils.numberToPackedDecimal(0, 5);
  }

  public long getHYoteiInputJikoku17181() {
    return CommonUtils.packedDecimalToNumber(getHYoteiInputJikoku17181Bytes());
  }

  public void setHYoteiInputJikoku17181(long arg) {
  setHYoteiInputJikoku17181Bytes(CommonUtils.numberToPackedDecimal(arg, 5));
  }

  public byte[] getHHanedashiRiyuu101181Bytes() {
    return hHanedashiRiyuu101181;
  }

  public void setHHanedashiRiyuu101181Bytes(byte[] arg) {
    hHanedashiRiyuu101181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu101181() {
    hHanedashiRiyuu101181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu101181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu101181Bytes());
  }

  public void setHHanedashiRiyuu101181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu101181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu101181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu102181Bytes() {
    return hHanedashiRiyuu102181;
  }

  public void setHHanedashiRiyuu102181Bytes(byte[] arg) {
    hHanedashiRiyuu102181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu102181() {
    hHanedashiRiyuu102181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu102181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu102181Bytes());
  }

  public void setHHanedashiRiyuu102181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu102181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu102181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu103181Bytes() {
    return hHanedashiRiyuu103181;
  }

  public void setHHanedashiRiyuu103181Bytes(byte[] arg) {
    hHanedashiRiyuu103181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu103181() {
    hHanedashiRiyuu103181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu103181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu103181Bytes());
  }

  public void setHHanedashiRiyuu103181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu103181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu103181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu104181Bytes() {
    return hHanedashiRiyuu104181;
  }

  public void setHHanedashiRiyuu104181Bytes(byte[] arg) {
    hHanedashiRiyuu104181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu104181() {
    hHanedashiRiyuu104181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu104181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu104181Bytes());
  }

  public void setHHanedashiRiyuu104181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu104181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu104181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu105181Bytes() {
    return hHanedashiRiyuu105181;
  }

  public void setHHanedashiRiyuu105181Bytes(byte[] arg) {
    hHanedashiRiyuu105181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu105181() {
    hHanedashiRiyuu105181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu105181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu105181Bytes());
  }

  public void setHHanedashiRiyuu105181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu105181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu105181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu106181Bytes() {
    return hHanedashiRiyuu106181;
  }

  public void setHHanedashiRiyuu106181Bytes(byte[] arg) {
    hHanedashiRiyuu106181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu106181() {
    hHanedashiRiyuu106181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu106181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu106181Bytes());
  }

  public void setHHanedashiRiyuu106181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu106181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu106181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu107181Bytes() {
    return hHanedashiRiyuu107181;
  }

  public void setHHanedashiRiyuu107181Bytes(byte[] arg) {
    hHanedashiRiyuu107181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu107181() {
    hHanedashiRiyuu107181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu107181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu107181Bytes());
  }

  public void setHHanedashiRiyuu107181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu107181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu107181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu108181Bytes() {
    return hHanedashiRiyuu108181;
  }

  public void setHHanedashiRiyuu108181Bytes(byte[] arg) {
    hHanedashiRiyuu108181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu108181() {
    hHanedashiRiyuu108181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu108181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu108181Bytes());
  }

  public void setHHanedashiRiyuu108181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu108181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu108181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu109181Bytes() {
    return hHanedashiRiyuu109181;
  }

  public void setHHanedashiRiyuu109181Bytes(byte[] arg) {
    hHanedashiRiyuu109181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu109181() {
    hHanedashiRiyuu109181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu109181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu109181Bytes());
  }

  public void setHHanedashiRiyuu109181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu109181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu109181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu110181Bytes() {
    return hHanedashiRiyuu110181;
  }

  public void setHHanedashiRiyuu110181Bytes(byte[] arg) {
    hHanedashiRiyuu110181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu110181() {
    hHanedashiRiyuu110181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu110181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu110181Bytes());
  }

  public void setHHanedashiRiyuu110181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu110181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu110181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu111181Bytes() {
    return hHanedashiRiyuu111181;
  }

  public void setHHanedashiRiyuu111181Bytes(byte[] arg) {
    hHanedashiRiyuu111181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu111181() {
    hHanedashiRiyuu111181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu111181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu111181Bytes());
  }

  public void setHHanedashiRiyuu111181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu111181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu111181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu112181Bytes() {
    return hHanedashiRiyuu112181;
  }

  public void setHHanedashiRiyuu112181Bytes(byte[] arg) {
    hHanedashiRiyuu112181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu112181() {
    hHanedashiRiyuu112181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu112181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu112181Bytes());
  }

  public void setHHanedashiRiyuu112181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu112181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu112181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu113181Bytes() {
    return hHanedashiRiyuu113181;
  }

  public void setHHanedashiRiyuu113181Bytes(byte[] arg) {
    hHanedashiRiyuu113181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu113181() {
    hHanedashiRiyuu113181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu113181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu113181Bytes());
  }

  public void setHHanedashiRiyuu113181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu113181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu113181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu114181Bytes() {
    return hHanedashiRiyuu114181;
  }

  public void setHHanedashiRiyuu114181Bytes(byte[] arg) {
    hHanedashiRiyuu114181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu114181() {
    hHanedashiRiyuu114181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu114181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu114181Bytes());
  }

  public void setHHanedashiRiyuu114181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu114181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu114181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu115181Bytes() {
    return hHanedashiRiyuu115181;
  }

  public void setHHanedashiRiyuu115181Bytes(byte[] arg) {
    hHanedashiRiyuu115181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu115181() {
    hHanedashiRiyuu115181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu115181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu115181Bytes());
  }

  public void setHHanedashiRiyuu115181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu115181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu115181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu116181Bytes() {
    return hHanedashiRiyuu116181;
  }

  public void setHHanedashiRiyuu116181Bytes(byte[] arg) {
    hHanedashiRiyuu116181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu116181() {
    hHanedashiRiyuu116181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu116181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu116181Bytes());
  }

  public void setHHanedashiRiyuu116181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu116181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu116181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu117181Bytes() {
    return hHanedashiRiyuu117181;
  }

  public void setHHanedashiRiyuu117181Bytes(byte[] arg) {
    hHanedashiRiyuu117181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu117181() {
    hHanedashiRiyuu117181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu117181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu117181Bytes());
  }

  public void setHHanedashiRiyuu117181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu117181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu117181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu201181Bytes() {
    return hHanedashiRiyuu201181;
  }

  public void setHHanedashiRiyuu201181Bytes(byte[] arg) {
    hHanedashiRiyuu201181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu201181() {
    hHanedashiRiyuu201181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu201181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu201181Bytes());
  }

  public void setHHanedashiRiyuu201181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu201181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu201181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu202181Bytes() {
    return hHanedashiRiyuu202181;
  }

  public void setHHanedashiRiyuu202181Bytes(byte[] arg) {
    hHanedashiRiyuu202181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu202181() {
    hHanedashiRiyuu202181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu202181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu202181Bytes());
  }

  public void setHHanedashiRiyuu202181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu202181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu202181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu203181Bytes() {
    return hHanedashiRiyuu203181;
  }

  public void setHHanedashiRiyuu203181Bytes(byte[] arg) {
    hHanedashiRiyuu203181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu203181() {
    hHanedashiRiyuu203181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu203181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu203181Bytes());
  }

  public void setHHanedashiRiyuu203181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu203181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu203181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu204181Bytes() {
    return hHanedashiRiyuu204181;
  }

  public void setHHanedashiRiyuu204181Bytes(byte[] arg) {
    hHanedashiRiyuu204181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu204181() {
    hHanedashiRiyuu204181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu204181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu204181Bytes());
  }

  public void setHHanedashiRiyuu204181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu204181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu204181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu205181Bytes() {
    return hHanedashiRiyuu205181;
  }

  public void setHHanedashiRiyuu205181Bytes(byte[] arg) {
    hHanedashiRiyuu205181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu205181() {
    hHanedashiRiyuu205181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu205181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu205181Bytes());
  }

  public void setHHanedashiRiyuu205181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu205181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu205181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu206181Bytes() {
    return hHanedashiRiyuu206181;
  }

  public void setHHanedashiRiyuu206181Bytes(byte[] arg) {
    hHanedashiRiyuu206181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu206181() {
    hHanedashiRiyuu206181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu206181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu206181Bytes());
  }

  public void setHHanedashiRiyuu206181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu206181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu206181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu207181Bytes() {
    return hHanedashiRiyuu207181;
  }

  public void setHHanedashiRiyuu207181Bytes(byte[] arg) {
    hHanedashiRiyuu207181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu207181() {
    hHanedashiRiyuu207181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu207181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu207181Bytes());
  }

  public void setHHanedashiRiyuu207181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu207181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu207181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu208181Bytes() {
    return hHanedashiRiyuu208181;
  }

  public void setHHanedashiRiyuu208181Bytes(byte[] arg) {
    hHanedashiRiyuu208181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu208181() {
    hHanedashiRiyuu208181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu208181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu208181Bytes());
  }

  public void setHHanedashiRiyuu208181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu208181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu208181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu209181Bytes() {
    return hHanedashiRiyuu209181;
  }

  public void setHHanedashiRiyuu209181Bytes(byte[] arg) {
    hHanedashiRiyuu209181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu209181() {
    hHanedashiRiyuu209181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu209181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu209181Bytes());
  }

  public void setHHanedashiRiyuu209181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu209181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu209181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu210181Bytes() {
    return hHanedashiRiyuu210181;
  }

  public void setHHanedashiRiyuu210181Bytes(byte[] arg) {
    hHanedashiRiyuu210181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu210181() {
    hHanedashiRiyuu210181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu210181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu210181Bytes());
  }

  public void setHHanedashiRiyuu210181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu210181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu210181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu211181Bytes() {
    return hHanedashiRiyuu211181;
  }

  public void setHHanedashiRiyuu211181Bytes(byte[] arg) {
    hHanedashiRiyuu211181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu211181() {
    hHanedashiRiyuu211181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu211181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu211181Bytes());
  }

  public void setHHanedashiRiyuu211181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu211181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu211181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu212181Bytes() {
    return hHanedashiRiyuu212181;
  }

  public void setHHanedashiRiyuu212181Bytes(byte[] arg) {
    hHanedashiRiyuu212181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu212181() {
    hHanedashiRiyuu212181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu212181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu212181Bytes());
  }

  public void setHHanedashiRiyuu212181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu212181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu212181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu213181Bytes() {
    return hHanedashiRiyuu213181;
  }

  public void setHHanedashiRiyuu213181Bytes(byte[] arg) {
    hHanedashiRiyuu213181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu213181() {
    hHanedashiRiyuu213181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu213181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu213181Bytes());
  }

  public void setHHanedashiRiyuu213181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu213181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu213181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu214181Bytes() {
    return hHanedashiRiyuu214181;
  }

  public void setHHanedashiRiyuu214181Bytes(byte[] arg) {
    hHanedashiRiyuu214181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu214181() {
    hHanedashiRiyuu214181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu214181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu214181Bytes());
  }

  public void setHHanedashiRiyuu214181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu214181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu214181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu215181Bytes() {
    return hHanedashiRiyuu215181;
  }

  public void setHHanedashiRiyuu215181Bytes(byte[] arg) {
    hHanedashiRiyuu215181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu215181() {
    hHanedashiRiyuu215181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu215181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu215181Bytes());
  }

  public void setHHanedashiRiyuu215181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu215181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu215181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu216181Bytes() {
    return hHanedashiRiyuu216181;
  }

  public void setHHanedashiRiyuu216181Bytes(byte[] arg) {
    hHanedashiRiyuu216181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu216181() {
    hHanedashiRiyuu216181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu216181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu216181Bytes());
  }

  public void setHHanedashiRiyuu216181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu216181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu216181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHHanedashiRiyuu217181Bytes() {
    return hHanedashiRiyuu217181;
  }

  public void setHHanedashiRiyuu217181Bytes(byte[] arg) {
    hHanedashiRiyuu217181 = ArrayUtils.clone(arg);
  }

  public void initHHanedashiRiyuu217181() {
    hHanedashiRiyuu217181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHHanedashiRiyuu217181() {
  return CommonUtils.bytesToString(getHHanedashiRiyuu217181Bytes());
  }

  public void setHHanedashiRiyuu217181(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHHanedashiRiyuu217181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHanedashiRiyuu217181Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHDeliveryLeadKotei181Bytes() {
    return hDeliveryLeadKotei181;
  }

  public void setHDeliveryLeadKotei181Bytes(byte[] arg) {
    hDeliveryLeadKotei181 = ArrayUtils.clone(arg);
  }

  public void initHDeliveryLeadKotei181() {
    hDeliveryLeadKotei181 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHDeliveryLeadKotei181() {
    return CommonUtils.packedDecimalToNumber(getHDeliveryLeadKotei181Bytes());
  }

  public void setHDeliveryLeadKotei181(long arg) {
  setHDeliveryLeadKotei181Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHDeliveryLeadYoyuu181Bytes() {
    return hDeliveryLeadYoyuu181;
  }

  public void setHDeliveryLeadYoyuu181Bytes(byte[] arg) {
    hDeliveryLeadYoyuu181 = ArrayUtils.clone(arg);
  }

  public void initHDeliveryLeadYoyuu181() {
    hDeliveryLeadYoyuu181 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHDeliveryLeadYoyuu181() {
    return CommonUtils.packedDecimalToNumber(getHDeliveryLeadYoyuu181Bytes());
  }

  public void setHDeliveryLeadYoyuu181(long arg) {
  setHDeliveryLeadYoyuu181Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHIkansaki181Bytes() {
    return hIkansaki181;
  }

  public void setHIkansaki181Bytes(byte[] arg) {
    hIkansaki181 = ArrayUtils.clone(arg);
  }

  public void initHIkansaki181() {
    hIkansaki181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHIkansaki181() {
  return CommonUtils.bytesToString(getHIkansaki181Bytes());
  }

  public void setHIkansaki181(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHIkansaki181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHIkansaki181Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHKensaIkanShikibetsu181Bytes() {
    return hKensaIkanShikibetsu181;
  }

  public void setHKensaIkanShikibetsu181Bytes(byte[] arg) {
    hKensaIkanShikibetsu181 = ArrayUtils.clone(arg);
  }

  public void initHKensaIkanShikibetsu181() {
    hKensaIkanShikibetsu181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKensaIkanShikibetsu181() {
  return CommonUtils.bytesToString(getHKensaIkanShikibetsu181Bytes());
  }

  public void setHKensaIkanShikibetsu181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKensaIkanShikibetsu181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKensaIkanShikibetsu181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKasoushaSym181Bytes() {
    return hKasoushaSym181;
  }

  public void setHKasoushaSym181Bytes(byte[] arg) {
    hKasoushaSym181 = ArrayUtils.clone(arg);
  }

  public void initHKasoushaSym181() {
    hKasoushaSym181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKasoushaSym181() {
  return CommonUtils.bytesToString(getHKasoushaSym181Bytes());
  }

  public void setHKasoushaSym181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKasoushaSym181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKasoushaSym181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKasouMaker181Bytes() {
    return hKasouMaker181;
  }

  public void setHKasouMaker181Bytes(byte[] arg) {
    hKasouMaker181 = ArrayUtils.clone(arg);
  }

  public void initHKasouMaker181() {
    hKasouMaker181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHKasouMaker181() {
  return CommonUtils.bytesToString(getHKasouMaker181Bytes());
  }

  public void setHKasouMaker181(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHKasouMaker181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKasouMaker181Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHKasouKanryouLead181Bytes() {
    return hKasouKanryouLead181;
  }

  public void setHKasouKanryouLead181Bytes(byte[] arg) {
    hKasouKanryouLead181 = ArrayUtils.clone(arg);
  }

  public void initHKasouKanryouLead181() {
    hKasouKanryouLead181 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHKasouKanryouLead181() {
    return CommonUtils.packedDecimalToNumber(getHKasouKanryouLead181Bytes());
  }

  public void setHKasouKanryouLead181(long arg) {
  setHKasouKanryouLead181Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHTokkiJikou181Bytes() {
    return hTokkiJikou181;
  }

  public void setHTokkiJikou181Bytes(byte[] arg) {
    hTokkiJikou181 = ArrayUtils.clone(arg);
  }

  public void initHTokkiJikou181() {
    hTokkiJikou181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 20));
  }

  public String getHTokkiJikou181() {
  return CommonUtils.bytesToString(getHTokkiJikou181Bytes());
  }

  public void setHTokkiJikou181(String arg) {
  final int trailing_length = 20 - arg.length();
  if (trailing_length > 0) {
  setHTokkiJikou181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHTokkiJikou181Bytes(CommonUtils.stringToBytes(arg.substring(0, 20)));
  }
  }

  public byte[] getHActSchKey181Bytes() {
    return hActSchKey181;
  }

  public void setHActSchKey181Bytes(byte[] arg) {
    hActSchKey181 = ArrayUtils.clone(arg);
  }

  public void initHActSchKey181() {
    hActSchKey181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHActSchKey181() {
  return CommonUtils.bytesToString(getHActSchKey181Bytes());
  }

  public void setHActSchKey181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHActSchKey181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHActSchKey181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHActSeqNo181Bytes() {
    return hActSeqNo181;
  }

  public void setHActSeqNo181Bytes(byte[] arg) {
    hActSeqNo181 = ArrayUtils.clone(arg);
  }

  public void initHActSeqNo181() {
    hActSeqNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));
  }

  public String getHActSeqNo181() {
  return CommonUtils.bytesToString(getHActSeqNo181Bytes());
  }

  public void setHActSeqNo181(String arg) {
  final int trailing_length = 10 - arg.length();
  if (trailing_length > 0) {
  setHActSeqNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHActSeqNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 10)));
  }
  }

  public byte[] getHShataiReActSeqNo181Bytes() {
    return hShataiReActSeqNo181;
  }

  public void setHShataiReActSeqNo181Bytes(byte[] arg) {
    hShataiReActSeqNo181 = ArrayUtils.clone(arg);
  }

  public void initHShataiReActSeqNo181() {
    hShataiReActSeqNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getHShataiReActSeqNo181() {
  return CommonUtils.bytesToString(getHShataiReActSeqNo181Bytes());
  }

  public void setHShataiReActSeqNo181(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setHShataiReActSeqNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShataiReActSeqNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getHFinalReActSeqNo181Bytes() {
    return hFinalReActSeqNo181;
  }

  public void setHFinalReActSeqNo181Bytes(byte[] arg) {
    hFinalReActSeqNo181 = ArrayUtils.clone(arg);
  }

  public void initHFinalReActSeqNo181() {
    hFinalReActSeqNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getHFinalReActSeqNo181() {
  return CommonUtils.bytesToString(getHFinalReActSeqNo181Bytes());
  }

  public void setHFinalReActSeqNo181(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setHFinalReActSeqNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHFinalReActSeqNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getHTrimSeqNo181Bytes() {
    return hTrimSeqNo181;
  }

  public void setHTrimSeqNo181Bytes(byte[] arg) {
    hTrimSeqNo181 = ArrayUtils.clone(arg);
  }

  public void initHTrimSeqNo181() {
    hTrimSeqNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHTrimSeqNo181() {
  return CommonUtils.bytesToString(getHTrimSeqNo181Bytes());
  }

  public void setHTrimSeqNo181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHTrimSeqNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHTrimSeqNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHOfflineSeqNo181Bytes() {
    return hOfflineSeqNo181;
  }

  public void setHOfflineSeqNo181Bytes(byte[] arg) {
    hOfflineSeqNo181 = ArrayUtils.clone(arg);
  }

  public void initHOfflineSeqNo181() {
    hOfflineSeqNo181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHOfflineSeqNo181() {
  return CommonUtils.bytesToString(getHOfflineSeqNo181Bytes());
  }

  public void setHOfflineSeqNo181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHOfflineSeqNo181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHOfflineSeqNo181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHKankenYmd181Bytes() {
    return hKankenYmd181;
  }

  public void setHKankenYmd181Bytes(byte[] arg) {
    hKankenYmd181 = ArrayUtils.clone(arg);
  }

  public void initHKankenYmd181() {
    hKankenYmd181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHKankenYmd181() {
  return CommonUtils.bytesToString(getHKankenYmd181Bytes());
  }

  public void setHKankenYmd181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHKankenYmd181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKankenYmd181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHMsOfflineYmd181Bytes() {
    return hMsOfflineYmd181;
  }

  public void setHMsOfflineYmd181Bytes(byte[] arg) {
    hMsOfflineYmd181 = ArrayUtils.clone(arg);
  }

  public void initHMsOfflineYmd181() {
    hMsOfflineYmd181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));
  }

  public String getHMsOfflineYmd181() {
  return CommonUtils.bytesToString(getHMsOfflineYmd181Bytes());
  }

  public void setHMsOfflineYmd181(String arg) {
  final int trailing_length = 10 - arg.length();
  if (trailing_length > 0) {
  setHMsOfflineYmd181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHMsOfflineYmd181Bytes(CommonUtils.stringToBytes(arg.substring(0, 10)));
  }
  }

  public byte[] getHSymTokushusha181Bytes() {
    return hSymTokushusha181;
  }

  public void setHSymTokushusha181Bytes(byte[] arg) {
    hSymTokushusha181 = ArrayUtils.clone(arg);
  }

  public void initHSymTokushusha181() {
    hSymTokushusha181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTokushusha181() {
  return CommonUtils.bytesToString(getHSymTokushusha181Bytes());
  }

  public void setHSymTokushusha181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTokushusha181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTokushusha181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymKouteiKeikakuGai181Bytes() {
    return hSymKouteiKeikakuGai181;
  }

  public void setHSymKouteiKeikakuGai181Bytes(byte[] arg) {
    hSymKouteiKeikakuGai181 = ArrayUtils.clone(arg);
  }

  public void initHSymKouteiKeikakuGai181() {
    hSymKouteiKeikakuGai181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymKouteiKeikakuGai181() {
  return CommonUtils.bytesToString(getHSymKouteiKeikakuGai181Bytes());
  }

  public void setHSymKouteiKeikakuGai181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymKouteiKeikakuGai181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymKouteiKeikakuGai181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZaikoZumi181Bytes() {
    return hSymZaikoZumi181;
  }

  public void setHSymZaikoZumi181Bytes(byte[] arg) {
    hSymZaikoZumi181 = ArrayUtils.clone(arg);
  }

  public void initHSymZaikoZumi181() {
    hSymZaikoZumi181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZaikoZumi181() {
  return CommonUtils.bytesToString(getHSymZaikoZumi181Bytes());
  }

  public void setHSymZaikoZumi181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZaikoZumi181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZaikoZumi181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymGyakubarashiGai181Bytes() {
    return hSymGyakubarashiGai181;
  }

  public void setHSymGyakubarashiGai181Bytes(byte[] arg) {
    hSymGyakubarashiGai181 = ArrayUtils.clone(arg);
  }

  public void initHSymGyakubarashiGai181() {
    hSymGyakubarashiGai181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymGyakubarashiGai181() {
  return CommonUtils.bytesToString(getHSymGyakubarashiGai181Bytes());
  }

  public void setHSymGyakubarashiGai181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymGyakubarashiGai181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymGyakubarashiGai181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSenkouMiGai181Bytes() {
    return hSymSenkouMiGai181;
  }

  public void setHSymSenkouMiGai181Bytes(byte[] arg) {
    hSymSenkouMiGai181 = ArrayUtils.clone(arg);
  }

  public void initHSymSenkouMiGai181() {
    hSymSenkouMiGai181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSenkouMiGai181() {
  return CommonUtils.bytesToString(getHSymSenkouMiGai181Bytes());
  }

  public void setHSymSenkouMiGai181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSenkouMiGai181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSenkouMiGai181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmDaihyou181Bytes() {
    return hSymSmDaihyou181;
  }

  public void setHSymSmDaihyou181Bytes(byte[] arg) {
    hSymSmDaihyou181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmDaihyou181() {
    hSymSmDaihyou181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmDaihyou181() {
  return CommonUtils.bytesToString(getHSymSmDaihyou181Bytes());
  }

  public void setHSymSmDaihyou181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmDaihyou181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmDaihyou181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei01181Bytes() {
    return hSymSmKoutei01181;
  }

  public void setHSymSmKoutei01181Bytes(byte[] arg) {
    hSymSmKoutei01181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei01181() {
    hSymSmKoutei01181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei01181() {
  return CommonUtils.bytesToString(getHSymSmKoutei01181Bytes());
  }

  public void setHSymSmKoutei01181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei01181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei01181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei02181Bytes() {
    return hSymSmKoutei02181;
  }

  public void setHSymSmKoutei02181Bytes(byte[] arg) {
    hSymSmKoutei02181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei02181() {
    hSymSmKoutei02181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei02181() {
  return CommonUtils.bytesToString(getHSymSmKoutei02181Bytes());
  }

  public void setHSymSmKoutei02181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei02181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei02181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei03181Bytes() {
    return hSymSmKoutei03181;
  }

  public void setHSymSmKoutei03181Bytes(byte[] arg) {
    hSymSmKoutei03181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei03181() {
    hSymSmKoutei03181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei03181() {
  return CommonUtils.bytesToString(getHSymSmKoutei03181Bytes());
  }

  public void setHSymSmKoutei03181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei03181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei03181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei04181Bytes() {
    return hSymSmKoutei04181;
  }

  public void setHSymSmKoutei04181Bytes(byte[] arg) {
    hSymSmKoutei04181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei04181() {
    hSymSmKoutei04181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei04181() {
  return CommonUtils.bytesToString(getHSymSmKoutei04181Bytes());
  }

  public void setHSymSmKoutei04181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei04181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei04181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei05181Bytes() {
    return hSymSmKoutei05181;
  }

  public void setHSymSmKoutei05181Bytes(byte[] arg) {
    hSymSmKoutei05181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei05181() {
    hSymSmKoutei05181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei05181() {
  return CommonUtils.bytesToString(getHSymSmKoutei05181Bytes());
  }

  public void setHSymSmKoutei05181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei05181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei05181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei06181Bytes() {
    return hSymSmKoutei06181;
  }

  public void setHSymSmKoutei06181Bytes(byte[] arg) {
    hSymSmKoutei06181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei06181() {
    hSymSmKoutei06181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei06181() {
  return CommonUtils.bytesToString(getHSymSmKoutei06181Bytes());
  }

  public void setHSymSmKoutei06181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei06181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei06181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei07181Bytes() {
    return hSymSmKoutei07181;
  }

  public void setHSymSmKoutei07181Bytes(byte[] arg) {
    hSymSmKoutei07181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei07181() {
    hSymSmKoutei07181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei07181() {
  return CommonUtils.bytesToString(getHSymSmKoutei07181Bytes());
  }

  public void setHSymSmKoutei07181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei07181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei07181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei08181Bytes() {
    return hSymSmKoutei08181;
  }

  public void setHSymSmKoutei08181Bytes(byte[] arg) {
    hSymSmKoutei08181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei08181() {
    hSymSmKoutei08181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei08181() {
  return CommonUtils.bytesToString(getHSymSmKoutei08181Bytes());
  }

  public void setHSymSmKoutei08181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei08181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei08181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei09181Bytes() {
    return hSymSmKoutei09181;
  }

  public void setHSymSmKoutei09181Bytes(byte[] arg) {
    hSymSmKoutei09181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei09181() {
    hSymSmKoutei09181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei09181() {
  return CommonUtils.bytesToString(getHSymSmKoutei09181Bytes());
  }

  public void setHSymSmKoutei09181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei09181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei09181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei10181Bytes() {
    return hSymSmKoutei10181;
  }

  public void setHSymSmKoutei10181Bytes(byte[] arg) {
    hSymSmKoutei10181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei10181() {
    hSymSmKoutei10181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei10181() {
  return CommonUtils.bytesToString(getHSymSmKoutei10181Bytes());
  }

  public void setHSymSmKoutei10181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei10181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei10181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei11181Bytes() {
    return hSymSmKoutei11181;
  }

  public void setHSymSmKoutei11181Bytes(byte[] arg) {
    hSymSmKoutei11181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei11181() {
    hSymSmKoutei11181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei11181() {
  return CommonUtils.bytesToString(getHSymSmKoutei11181Bytes());
  }

  public void setHSymSmKoutei11181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei11181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei11181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei12181Bytes() {
    return hSymSmKoutei12181;
  }

  public void setHSymSmKoutei12181Bytes(byte[] arg) {
    hSymSmKoutei12181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei12181() {
    hSymSmKoutei12181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei12181() {
  return CommonUtils.bytesToString(getHSymSmKoutei12181Bytes());
  }

  public void setHSymSmKoutei12181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei12181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei12181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei13181Bytes() {
    return hSymSmKoutei13181;
  }

  public void setHSymSmKoutei13181Bytes(byte[] arg) {
    hSymSmKoutei13181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei13181() {
    hSymSmKoutei13181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei13181() {
  return CommonUtils.bytesToString(getHSymSmKoutei13181Bytes());
  }

  public void setHSymSmKoutei13181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei13181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei13181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei14181Bytes() {
    return hSymSmKoutei14181;
  }

  public void setHSymSmKoutei14181Bytes(byte[] arg) {
    hSymSmKoutei14181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei14181() {
    hSymSmKoutei14181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei14181() {
  return CommonUtils.bytesToString(getHSymSmKoutei14181Bytes());
  }

  public void setHSymSmKoutei14181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei14181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei14181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei15181Bytes() {
    return hSymSmKoutei15181;
  }

  public void setHSymSmKoutei15181Bytes(byte[] arg) {
    hSymSmKoutei15181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei15181() {
    hSymSmKoutei15181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei15181() {
  return CommonUtils.bytesToString(getHSymSmKoutei15181Bytes());
  }

  public void setHSymSmKoutei15181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei15181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei15181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei16181Bytes() {
    return hSymSmKoutei16181;
  }

  public void setHSymSmKoutei16181Bytes(byte[] arg) {
    hSymSmKoutei16181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei16181() {
    hSymSmKoutei16181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei16181() {
  return CommonUtils.bytesToString(getHSymSmKoutei16181Bytes());
  }

  public void setHSymSmKoutei16181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei16181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei16181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymSmKoutei17181Bytes() {
    return hSymSmKoutei17181;
  }

  public void setHSymSmKoutei17181Bytes(byte[] arg) {
    hSymSmKoutei17181 = ArrayUtils.clone(arg);
  }

  public void initHSymSmKoutei17181() {
    hSymSmKoutei17181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymSmKoutei17181() {
  return CommonUtils.bytesToString(getHSymSmKoutei17181Bytes());
  }

  public void setHSymSmKoutei17181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymSmKoutei17181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymSmKoutei17181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki01181Bytes() {
    return hSymZengetsuJisseki01181;
  }

  public void setHSymZengetsuJisseki01181Bytes(byte[] arg) {
    hSymZengetsuJisseki01181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki01181() {
    hSymZengetsuJisseki01181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki01181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki01181Bytes());
  }

  public void setHSymZengetsuJisseki01181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki01181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki01181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki02181Bytes() {
    return hSymZengetsuJisseki02181;
  }

  public void setHSymZengetsuJisseki02181Bytes(byte[] arg) {
    hSymZengetsuJisseki02181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki02181() {
    hSymZengetsuJisseki02181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki02181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki02181Bytes());
  }

  public void setHSymZengetsuJisseki02181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki02181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki02181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki03181Bytes() {
    return hSymZengetsuJisseki03181;
  }

  public void setHSymZengetsuJisseki03181Bytes(byte[] arg) {
    hSymZengetsuJisseki03181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki03181() {
    hSymZengetsuJisseki03181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki03181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki03181Bytes());
  }

  public void setHSymZengetsuJisseki03181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki03181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki03181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki04181Bytes() {
    return hSymZengetsuJisseki04181;
  }

  public void setHSymZengetsuJisseki04181Bytes(byte[] arg) {
    hSymZengetsuJisseki04181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki04181() {
    hSymZengetsuJisseki04181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki04181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki04181Bytes());
  }

  public void setHSymZengetsuJisseki04181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki04181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki04181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki05181Bytes() {
    return hSymZengetsuJisseki05181;
  }

  public void setHSymZengetsuJisseki05181Bytes(byte[] arg) {
    hSymZengetsuJisseki05181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki05181() {
    hSymZengetsuJisseki05181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki05181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki05181Bytes());
  }

  public void setHSymZengetsuJisseki05181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki05181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki05181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki06181Bytes() {
    return hSymZengetsuJisseki06181;
  }

  public void setHSymZengetsuJisseki06181Bytes(byte[] arg) {
    hSymZengetsuJisseki06181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki06181() {
    hSymZengetsuJisseki06181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki06181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki06181Bytes());
  }

  public void setHSymZengetsuJisseki06181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki06181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki06181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki07181Bytes() {
    return hSymZengetsuJisseki07181;
  }

  public void setHSymZengetsuJisseki07181Bytes(byte[] arg) {
    hSymZengetsuJisseki07181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki07181() {
    hSymZengetsuJisseki07181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki07181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki07181Bytes());
  }

  public void setHSymZengetsuJisseki07181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki07181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki07181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki08181Bytes() {
    return hSymZengetsuJisseki08181;
  }

  public void setHSymZengetsuJisseki08181Bytes(byte[] arg) {
    hSymZengetsuJisseki08181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki08181() {
    hSymZengetsuJisseki08181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki08181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki08181Bytes());
  }

  public void setHSymZengetsuJisseki08181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki08181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki08181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki09181Bytes() {
    return hSymZengetsuJisseki09181;
  }

  public void setHSymZengetsuJisseki09181Bytes(byte[] arg) {
    hSymZengetsuJisseki09181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki09181() {
    hSymZengetsuJisseki09181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki09181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki09181Bytes());
  }

  public void setHSymZengetsuJisseki09181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki09181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki09181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki10181Bytes() {
    return hSymZengetsuJisseki10181;
  }

  public void setHSymZengetsuJisseki10181Bytes(byte[] arg) {
    hSymZengetsuJisseki10181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki10181() {
    hSymZengetsuJisseki10181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki10181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki10181Bytes());
  }

  public void setHSymZengetsuJisseki10181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki10181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki10181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki11181Bytes() {
    return hSymZengetsuJisseki11181;
  }

  public void setHSymZengetsuJisseki11181Bytes(byte[] arg) {
    hSymZengetsuJisseki11181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki11181() {
    hSymZengetsuJisseki11181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki11181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki11181Bytes());
  }

  public void setHSymZengetsuJisseki11181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki11181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki11181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki12181Bytes() {
    return hSymZengetsuJisseki12181;
  }

  public void setHSymZengetsuJisseki12181Bytes(byte[] arg) {
    hSymZengetsuJisseki12181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki12181() {
    hSymZengetsuJisseki12181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki12181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki12181Bytes());
  }

  public void setHSymZengetsuJisseki12181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki12181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki12181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki13181Bytes() {
    return hSymZengetsuJisseki13181;
  }

  public void setHSymZengetsuJisseki13181Bytes(byte[] arg) {
    hSymZengetsuJisseki13181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki13181() {
    hSymZengetsuJisseki13181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki13181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki13181Bytes());
  }

  public void setHSymZengetsuJisseki13181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki13181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki13181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki14181Bytes() {
    return hSymZengetsuJisseki14181;
  }

  public void setHSymZengetsuJisseki14181Bytes(byte[] arg) {
    hSymZengetsuJisseki14181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki14181() {
    hSymZengetsuJisseki14181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki14181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki14181Bytes());
  }

  public void setHSymZengetsuJisseki14181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki14181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki14181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki15181Bytes() {
    return hSymZengetsuJisseki15181;
  }

  public void setHSymZengetsuJisseki15181Bytes(byte[] arg) {
    hSymZengetsuJisseki15181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki15181() {
    hSymZengetsuJisseki15181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki15181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki15181Bytes());
  }

  public void setHSymZengetsuJisseki15181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki15181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki15181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki16181Bytes() {
    return hSymZengetsuJisseki16181;
  }

  public void setHSymZengetsuJisseki16181Bytes(byte[] arg) {
    hSymZengetsuJisseki16181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki16181() {
    hSymZengetsuJisseki16181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki16181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki16181Bytes());
  }

  public void setHSymZengetsuJisseki16181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki16181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki16181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymZengetsuJisseki17181Bytes() {
    return hSymZengetsuJisseki17181;
  }

  public void setHSymZengetsuJisseki17181Bytes(byte[] arg) {
    hSymZengetsuJisseki17181 = ArrayUtils.clone(arg);
  }

  public void initHSymZengetsuJisseki17181() {
    hSymZengetsuJisseki17181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymZengetsuJisseki17181() {
  return CommonUtils.bytesToString(getHSymZengetsuJisseki17181Bytes());
  }

  public void setHSymZengetsuJisseki17181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymZengetsuJisseki17181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymZengetsuJisseki17181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymTlMetal181Bytes() {
    return hSymTlMetal181;
  }

  public void setHSymTlMetal181Bytes(byte[] arg) {
    hSymTlMetal181 = ArrayUtils.clone(arg);
  }

  public void initHSymTlMetal181() {
    hSymTlMetal181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTlMetal181() {
  return CommonUtils.bytesToString(getHSymTlMetal181Bytes());
  }

  public void setHSymTlMetal181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTlMetal181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTlMetal181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymTlShitaP181Bytes() {
    return hSymTlShitaP181;
  }

  public void setHSymTlShitaP181Bytes(byte[] arg) {
    hSymTlShitaP181 = ArrayUtils.clone(arg);
  }

  public void initHSymTlShitaP181() {
    hSymTlShitaP181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTlShitaP181() {
  return CommonUtils.bytesToString(getHSymTlShitaP181Bytes());
  }

  public void setHSymTlShitaP181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTlShitaP181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTlShitaP181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymTlNakaP181Bytes() {
    return hSymTlNakaP181;
  }

  public void setHSymTlNakaP181Bytes(byte[] arg) {
    hSymTlNakaP181 = ArrayUtils.clone(arg);
  }

  public void initHSymTlNakaP181() {
    hSymTlNakaP181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTlNakaP181() {
  return CommonUtils.bytesToString(getHSymTlNakaP181Bytes());
  }

  public void setHSymTlNakaP181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTlNakaP181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTlNakaP181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymTlPaint181Bytes() {
    return hSymTlPaint181;
  }

  public void setHSymTlPaint181Bytes(byte[] arg) {
    hSymTlPaint181 = ArrayUtils.clone(arg);
  }

  public void initHSymTlPaint181() {
    hSymTlPaint181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTlPaint181() {
  return CommonUtils.bytesToString(getHSymTlPaint181Bytes());
  }

  public void setHSymTlPaint181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTlPaint181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTlPaint181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymTlFinal181Bytes() {
    return hSymTlFinal181;
  }

  public void setHSymTlFinal181Bytes(byte[] arg) {
    hSymTlFinal181 = ArrayUtils.clone(arg);
  }

  public void initHSymTlFinal181() {
    hSymTlFinal181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTlFinal181() {
  return CommonUtils.bytesToString(getHSymTlFinal181Bytes());
  }

  public void setHSymTlFinal181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTlFinal181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTlFinal181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymTlDeliv181Bytes() {
    return hSymTlDeliv181;
  }

  public void setHSymTlDeliv181Bytes(byte[] arg) {
    hSymTlDeliv181 = ArrayUtils.clone(arg);
  }

  public void initHSymTlDeliv181() {
    hSymTlDeliv181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymTlDeliv181() {
  return CommonUtils.bytesToString(getHSymTlDeliv181Bytes());
  }

  public void setHSymTlDeliv181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymTlDeliv181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymTlDeliv181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymPipeLineGai181Bytes() {
    return hSymPipeLineGai181;
  }

  public void setHSymPipeLineGai181Bytes(byte[] arg) {
    hSymPipeLineGai181 = ArrayUtils.clone(arg);
  }

  public void initHSymPipeLineGai181() {
    hSymPipeLineGai181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymPipeLineGai181() {
  return CommonUtils.bytesToString(getHSymPipeLineGai181Bytes());
  }

  public void setHSymPipeLineGai181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymPipeLineGai181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymPipeLineGai181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymPipeLineZumi181Bytes() {
    return hSymPipeLineZumi181;
  }

  public void setHSymPipeLineZumi181Bytes(byte[] arg) {
    hSymPipeLineZumi181 = ArrayUtils.clone(arg);
  }

  public void initHSymPipeLineZumi181() {
    hSymPipeLineZumi181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymPipeLineZumi181() {
  return CommonUtils.bytesToString(getHSymPipeLineZumi181Bytes());
  }

  public void setHSymPipeLineZumi181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymPipeLineZumi181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymPipeLineZumi181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymKeikakuMitei181Bytes() {
    return hSymKeikakuMitei181;
  }

  public void setHSymKeikakuMitei181Bytes(byte[] arg) {
    hSymKeikakuMitei181 = ArrayUtils.clone(arg);
  }

  public void initHSymKeikakuMitei181() {
    hSymKeikakuMitei181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymKeikakuMitei181() {
  return CommonUtils.bytesToString(getHSymKeikakuMitei181Bytes());
  }

  public void setHSymKeikakuMitei181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymKeikakuMitei181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymKeikakuMitei181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSeisanHoushiki181Bytes() {
    return hSeisanHoushiki181;
  }

  public void setHSeisanHoushiki181Bytes(byte[] arg) {
    hSeisanHoushiki181 = ArrayUtils.clone(arg);
  }

  public void initHSeisanHoushiki181() {
    hSeisanHoushiki181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSeisanHoushiki181() {
  return CommonUtils.bytesToString(getHSeisanHoushiki181Bytes());
  }

  public void setHSeisanHoushiki181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSeisanHoushiki181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSeisanHoushiki181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymShisakuSha181Bytes() {
    return hSymShisakuSha181;
  }

  public void setHSymShisakuSha181Bytes(byte[] arg) {
    hSymShisakuSha181 = ArrayUtils.clone(arg);
  }

  public void initHSymShisakuSha181() {
    hSymShisakuSha181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymShisakuSha181() {
  return CommonUtils.bytesToString(getHSymShisakuSha181Bytes());
  }

  public void setHSymShisakuSha181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymShisakuSha181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymShisakuSha181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSymGyakuYunyuu181Bytes() {
    return hSymGyakuYunyuu181;
  }

  public void setHSymGyakuYunyuu181Bytes(byte[] arg) {
    hSymGyakuYunyuu181 = ArrayUtils.clone(arg);
  }

  public void initHSymGyakuYunyuu181() {
    hSymGyakuYunyuu181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymGyakuYunyuu181() {
  return CommonUtils.bytesToString(getHSymGyakuYunyuu181Bytes());
  }

  public void setHSymGyakuYunyuu181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymGyakuYunyuu181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymGyakuYunyuu181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHHyoujiGenzaichi181Bytes() {
    return hHyoujiGenzaichi181;
  }

  public void setHHyoujiGenzaichi181Bytes(byte[] arg) {
    hHyoujiGenzaichi181 = ArrayUtils.clone(arg);
  }

  public void initHHyoujiGenzaichi181() {
    hHyoujiGenzaichi181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHHyoujiGenzaichi181() {
  return CommonUtils.bytesToString(getHHyoujiGenzaichi181Bytes());
  }

  public void setHHyoujiGenzaichi181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHHyoujiGenzaichi181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHHyoujiGenzaichi181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSalesSpec10181Bytes() {
    return hSalesSpec10181;
  }

  public void setHSalesSpec10181Bytes(byte[] arg) {
    hSalesSpec10181 = ArrayUtils.clone(arg);
  }

  public void initHSalesSpec10181() {
    hSalesSpec10181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 10));
  }

  public String getHSalesSpec10181() {
  return CommonUtils.bytesToString(getHSalesSpec10181Bytes());
  }

  public void setHSalesSpec10181(String arg) {
  final int trailing_length = 10 - arg.length();
  if (trailing_length > 0) {
  setHSalesSpec10181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSalesSpec10181Bytes(CommonUtils.stringToBytes(arg.substring(0, 10)));
  }
  }

  public byte[] getHLocalArea181Bytes() {
    return hLocalArea181;
  }

  public void setHLocalArea181Bytes(byte[] arg) {
    hLocalArea181 = ArrayUtils.clone(arg);
  }

  public void initHLocalArea181() {
    hLocalArea181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 50));
  }

  public String getHLocalArea181() {
  return CommonUtils.bytesToString(getHLocalArea181Bytes());
  }

  public void setHLocalArea181(String arg) {
  final int trailing_length = 50 - arg.length();
  if (trailing_length > 0) {
  setHLocalArea181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLocalArea181Bytes(CommonUtils.stringToBytes(arg.substring(0, 50)));
  }
  }

  public byte[] getHTimeStamp181Bytes() {
    return hTimeStamp181;
  }

  public void setHTimeStamp181Bytes(byte[] arg) {
    hTimeStamp181 = ArrayUtils.clone(arg);
  }

  public void initHTimeStamp181() {
    hTimeStamp181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getHTimeStamp181() {
  return CommonUtils.bytesToString(getHTimeStamp181Bytes());
  }

  public void setHTimeStamp181(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setHTimeStamp181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHTimeStamp181Bytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getHDelivEigyouHizuke181Bytes() {
    return hDelivEigyouHizuke181;
  }

  public void setHDelivEigyouHizuke181Bytes(byte[] arg) {
    hDelivEigyouHizuke181 = ArrayUtils.clone(arg);
  }

  public void initHDelivEigyouHizuke181() {
    hDelivEigyouHizuke181 =CommonUtils.numberToPackedDecimal(0, 6);
  }

  public long getHDelivEigyouHizuke181() {
    return CommonUtils.packedDecimalToNumber(getHDelivEigyouHizuke181Bytes());
  }

  public void setHDelivEigyouHizuke181(long arg) {
  setHDelivEigyouHizuke181Bytes(CommonUtils.numberToPackedDecimal(arg, 6));
  }

  public byte[] getHSymHanedashi181Bytes() {
    return hSymHanedashi181;
  }

  public void setHSymHanedashi181Bytes(byte[] arg) {
    hSymHanedashi181 = ArrayUtils.clone(arg);
  }

  public void initHSymHanedashi181() {
    hSymHanedashi181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSymHanedashi181() {
  return CommonUtils.bytesToString(getHSymHanedashi181Bytes());
  }

  public void setHSymHanedashi181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSymHanedashi181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSymHanedashi181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSeihinKubun181Bytes() {
    return hSeihinKubun181;
  }

  public void setHSeihinKubun181Bytes(byte[] arg) {
    hSeihinKubun181 = ArrayUtils.clone(arg);
  }

  public void initHSeihinKubun181() {
    hSeihinKubun181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHSeihinKubun181() {
  return CommonUtils.bytesToString(getHSeihinKubun181Bytes());
  }

  public void setHSeihinKubun181(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHSeihinKubun181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSeihinKubun181Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHStatus181RBytes() {
    return hStatus181R;
  }

  public void setHStatus181RBytes(byte[] arg) {
    hStatus181R = ArrayUtils.clone(arg);
  }

  public void initHStatus181R() {
    hStatus181R =CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));
  }

  public String getHStatus181R() {
  return CommonUtils.bytesToString(getHStatus181RBytes());
  }

  public void setHStatus181R(String arg) {
  final int trailing_length = 30 - arg.length();
  if (trailing_length > 0) {
  setHStatus181RBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHStatus181RBytes(CommonUtils.stringToBytes(arg.substring(0, 30)));
  }
  }

  public byte[] getHKoujouControlNo19181Bytes() {
    return hKoujouControlNo19181;
  }

  public void setHKoujouControlNo19181Bytes(byte[] arg) {
    hKoujouControlNo19181 = ArrayUtils.clone(arg);
  }

  public void initHKoujouControlNo19181() {
    hKoujouControlNo19181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));
  }

  public String getHKoujouControlNo19181() {
  return CommonUtils.bytesToString(getHKoujouControlNo19181Bytes());
  }

  public void setHKoujouControlNo19181(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setHKoujouControlNo19181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouControlNo19181Bytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getHKoujouControlNo49181Bytes() {
    return hKoujouControlNo49181;
  }

  public void setHKoujouControlNo49181Bytes(byte[] arg) {
    hKoujouControlNo49181 = ArrayUtils.clone(arg);
  }

  public void initHKoujouControlNo49181() {
    hKoujouControlNo49181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHKoujouControlNo49181() {
  return CommonUtils.bytesToString(getHKoujouControlNo49181Bytes());
  }

  public void setHKoujouControlNo49181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHKoujouControlNo49181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouControlNo49181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHKoujouControlNo13181Bytes() {
    return hKoujouControlNo13181;
  }

  public void setHKoujouControlNo13181Bytes(byte[] arg) {
    hKoujouControlNo13181 = ArrayUtils.clone(arg);
  }

  public void initHKoujouControlNo13181() {
    hKoujouControlNo13181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getHKoujouControlNo13181() {
  return CommonUtils.bytesToString(getHKoujouControlNo13181Bytes());
  }

  public void setHKoujouControlNo13181(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setHKoujouControlNo13181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouControlNo13181Bytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getHModel13181Bytes() {
    return hModel13181;
  }

  public void setHModel13181Bytes(byte[] arg) {
    hModel13181 = ArrayUtils.clone(arg);
  }

  public void initHModel13181() {
    hModel13181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getHModel13181() {
  return CommonUtils.bytesToString(getHModel13181Bytes());
  }

  public void setHModel13181(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setHModel13181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHModel13181Bytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getHChassisNo16181Bytes() {
    return hChassisNo16181;
  }

  public void setHChassisNo16181Bytes(byte[] arg) {
    hChassisNo16181 = ArrayUtils.clone(arg);
  }

  public void initHChassisNo16181() {
    hChassisNo16181 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHChassisNo16181() {
  return CommonUtils.bytesToString(getHChassisNo16181Bytes());
  }

  public void setHChassisNo16181(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHChassisNo16181Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHChassisNo16181Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHostForShiyou182Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(940);
        buffer.put(getHKoujouKubun182Bytes());
        buffer.put(getHModel182Bytes());
        buffer.put(getHColorUchibariEx182Bytes());
        buffer.put(getHLineTrim182Bytes());
        buffer.put(getHKokuyuKubun182Bytes());
        buffer.put(getHYymm182Bytes());
        buffer.put(getHKouteiId182Bytes());
        buffer.put(getHJissekiZengetsu182Bytes());
        buffer.put(getHJissekiTougetsu182Bytes());
        buffer.put(getHJissekiJigetsu182Bytes());
        buffer.put(getHRuisaZenZengetsu182Bytes());
        buffer.put(getHKeikakuZengetsu182Bytes());
        buffer.put(getHRuisaZengetsu182Bytes());
        buffer.put(getHKeikakuTougetsu182Bytes());
        buffer.put(getHKeikakuJigetsu182Bytes());
        buffer.put(getHIkanZengetsu182Bytes());
        buffer.put(getHIkanTougetsu182Bytes());
        buffer.put(getHIkanJigetsu182Bytes());
        buffer.put(getHShikyuuZengetsu182Bytes());
        buffer.put(getHShikyuuTougetsu182Bytes());
        buffer.put(getHShikyuuJigetsu182Bytes());
        buffer.put(getHMikenZenZengetsu182Bytes());
        buffer.put(getHMikenZengetsu182Bytes());
        buffer.put(getHKankenZenZengetsu182Bytes());
        buffer.put(getHKankenZengetsu182Bytes());
        buffer.put(getHShiyou182RBytes());
    return buffer.array();
  }

  public void setHostForShiyou182Bytes(byte[] arg) {
        setHKoujouKubun182Bytes(ArrayUtils.subarray(arg, 0, 1));
        setHModel182Bytes(ArrayUtils.subarray(arg, 1, 19));
        setHColorUchibariEx182Bytes(ArrayUtils.subarray(arg, 19, 28));
        setHLineTrim182Bytes(ArrayUtils.subarray(arg, 28, 29));
        setHKokuyuKubun182Bytes(ArrayUtils.subarray(arg, 29, 30));
        setHYymm182Bytes(ArrayUtils.subarray(arg, 30, 34));
        setHKouteiId182Bytes(ArrayUtils.subarray(arg, 34, 36));
        setHJissekiZengetsu182Bytes(ArrayUtils.subarray(arg, 36, 39));
        setHJissekiTougetsu182Bytes(ArrayUtils.subarray(arg, 39, 291));
        setHJissekiJigetsu182Bytes(ArrayUtils.subarray(arg, 291, 455));
        setHRuisaZenZengetsu182Bytes(ArrayUtils.subarray(arg, 455, 458));
        setHKeikakuZengetsu182Bytes(ArrayUtils.subarray(arg, 458, 461));
        setHRuisaZengetsu182Bytes(ArrayUtils.subarray(arg, 461, 464));
        setHKeikakuTougetsu182Bytes(ArrayUtils.subarray(arg, 464, 716));
        setHKeikakuJigetsu182Bytes(ArrayUtils.subarray(arg, 716, 880));
        setHIkanZengetsu182Bytes(ArrayUtils.subarray(arg, 880, 883));
        setHIkanTougetsu182Bytes(ArrayUtils.subarray(arg, 883, 886));
        setHIkanJigetsu182Bytes(ArrayUtils.subarray(arg, 886, 889));
        setHShikyuuZengetsu182Bytes(ArrayUtils.subarray(arg, 889, 892));
        setHShikyuuTougetsu182Bytes(ArrayUtils.subarray(arg, 892, 895));
        setHShikyuuJigetsu182Bytes(ArrayUtils.subarray(arg, 895, 898));
        setHMikenZenZengetsu182Bytes(ArrayUtils.subarray(arg, 898, 901));
        setHMikenZengetsu182Bytes(ArrayUtils.subarray(arg, 901, 904));
        setHKankenZenZengetsu182Bytes(ArrayUtils.subarray(arg, 904, 907));
        setHKankenZengetsu182Bytes(ArrayUtils.subarray(arg, 907, 910));
        setHShiyou182RBytes(ArrayUtils.subarray(arg, 910, 940));
  }

  public void initHostForShiyou182() {
        initHKoujouKubun182();
        initHModel182();
        initHColorUchibariEx182();
        initHLineTrim182();
        initHKokuyuKubun182();
        initHYymm182();
        initHKouteiId182();
        initHJissekiZengetsu182();
        initHJissekiTougetsu182();
        initHJissekiJigetsu182();
        initHRuisaZenZengetsu182();
        initHKeikakuZengetsu182();
        initHRuisaZengetsu182();
        initHKeikakuTougetsu182();
        initHKeikakuJigetsu182();
        initHIkanZengetsu182();
        initHIkanTougetsu182();
        initHIkanJigetsu182();
        initHShikyuuZengetsu182();
        initHShikyuuTougetsu182();
        initHShikyuuJigetsu182();
        initHMikenZenZengetsu182();
        initHMikenZengetsu182();
        initHKankenZenZengetsu182();
        initHKankenZengetsu182();
        initHShiyou182R();
  }

  public String getHostForShiyou182() {
  return CommonUtils.bytesToString(getHostForShiyou182Bytes());
  }

  public void setHostForShiyou182(String arg) {
  final int trailing_length = 940 - arg.length();
  if (trailing_length > 0) {
  setHostForShiyou182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHostForShiyou182Bytes(CommonUtils.stringToBytes(arg.substring(0, 940)));
  }
  }

  public byte[] getHKoujouKubun182Bytes() {
    return hKoujouKubun182;
  }

  public void setHKoujouKubun182Bytes(byte[] arg) {
    hKoujouKubun182 = ArrayUtils.clone(arg);
  }

  public void initHKoujouKubun182() {
    hKoujouKubun182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKoujouKubun182() {
  return CommonUtils.bytesToString(getHKoujouKubun182Bytes());
  }

  public void setHKoujouKubun182(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKoujouKubun182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouKubun182Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHModel182Bytes() {
    return hModel182;
  }

  public void setHModel182Bytes(byte[] arg) {
    hModel182 = ArrayUtils.clone(arg);
  }

  public void initHModel182() {
    hModel182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 18));
  }

  public String getHModel182() {
  return CommonUtils.bytesToString(getHModel182Bytes());
  }

  public void setHModel182(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setHModel182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHModel182Bytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getHColorUchibariEx182Bytes() {
    return hColorUchibariEx182;
  }

  public void setHColorUchibariEx182Bytes(byte[] arg) {
    hColorUchibariEx182 = ArrayUtils.clone(arg);
  }

  public void initHColorUchibariEx182() {
    hColorUchibariEx182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));
  }

  public String getHColorUchibariEx182() {
  return CommonUtils.bytesToString(getHColorUchibariEx182Bytes());
  }

  public void setHColorUchibariEx182(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setHColorUchibariEx182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHColorUchibariEx182Bytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getHLineTrim182Bytes() {
    return hLineTrim182;
  }

  public void setHLineTrim182Bytes(byte[] arg) {
    hLineTrim182 = ArrayUtils.clone(arg);
  }

  public void initHLineTrim182() {
    hLineTrim182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHLineTrim182() {
  return CommonUtils.bytesToString(getHLineTrim182Bytes());
  }

  public void setHLineTrim182(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHLineTrim182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLineTrim182Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKokuyuKubun182Bytes() {
    return hKokuyuKubun182;
  }

  public void setHKokuyuKubun182Bytes(byte[] arg) {
    hKokuyuKubun182 = ArrayUtils.clone(arg);
  }

  public void initHKokuyuKubun182() {
    hKokuyuKubun182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKokuyuKubun182() {
  return CommonUtils.bytesToString(getHKokuyuKubun182Bytes());
  }

  public void setHKokuyuKubun182(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKokuyuKubun182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKokuyuKubun182Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHYymm182Bytes() {
    return hYymm182;
  }

  public void setHYymm182Bytes(byte[] arg) {
    hYymm182 = ArrayUtils.clone(arg);
  }

  public void initHYymm182() {
    hYymm182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHYymm182() {
  return CommonUtils.bytesToString(getHYymm182Bytes());
  }

  public void setHYymm182(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHYymm182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHYymm182Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHKouteiId182Bytes() {
    return hKouteiId182;
  }

  public void setHKouteiId182Bytes(byte[] arg) {
    hKouteiId182 = ArrayUtils.clone(arg);
  }

  public void initHKouteiId182() {
    hKouteiId182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHKouteiId182() {
  return CommonUtils.bytesToString(getHKouteiId182Bytes());
  }

  public void setHKouteiId182(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHKouteiId182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKouteiId182Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHJissekiZengetsu182Bytes() {
    return hJissekiZengetsu182;
  }

  public void setHJissekiZengetsu182Bytes(byte[] arg) {
    hJissekiZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHJissekiZengetsu182() {
    hJissekiZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHJissekiZengetsu182Bytes());
  }

  public void setHJissekiZengetsu182(long arg) {
  setHJissekiZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiTougetsu182Bytes() {
    return hJissekiTougetsu182;
  }

  public void setHJissekiTougetsu182Bytes(byte[] arg) {
    hJissekiTougetsu182 = ArrayUtils.clone(arg);
  }

  public void initHJissekiTougetsu182() {
    hJissekiTougetsu182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));
  }

  public String getHJissekiTougetsu182() {
  return CommonUtils.bytesToString(getHJissekiTougetsu182Bytes());
  }

  public void setHJissekiTougetsu182(String arg) {
  final int trailing_length = 252 - arg.length();
  if (trailing_length > 0) {
  setHJissekiTougetsu182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHJissekiTougetsu182Bytes(CommonUtils.stringToBytes(arg.substring(0, 252)));
  }
  }

  public byte[] getHJissekiJigetsu182Bytes() {
    return hJissekiJigetsu182;
  }

  public void setHJissekiJigetsu182Bytes(byte[] arg) {
    hJissekiJigetsu182 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJigetsu182() {
    hJissekiJigetsu182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));
  }

  public String getHJissekiJigetsu182() {
  return CommonUtils.bytesToString(getHJissekiJigetsu182Bytes());
  }

  public void setHJissekiJigetsu182(String arg) {
  final int trailing_length = 164 - arg.length();
  if (trailing_length > 0) {
  setHJissekiJigetsu182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHJissekiJigetsu182Bytes(CommonUtils.stringToBytes(arg.substring(0, 164)));
  }
  }

  public byte[] getHRuisaZenZengetsu182Bytes() {
    return hRuisaZenZengetsu182;
  }

  public void setHRuisaZenZengetsu182Bytes(byte[] arg) {
    hRuisaZenZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHRuisaZenZengetsu182() {
    hRuisaZenZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHRuisaZenZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHRuisaZenZengetsu182Bytes());
  }

  public void setHRuisaZenZengetsu182(long arg) {
  setHRuisaZenZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKeikakuZengetsu182Bytes() {
    return hKeikakuZengetsu182;
  }

  public void setHKeikakuZengetsu182Bytes(byte[] arg) {
    hKeikakuZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuZengetsu182() {
    hKeikakuZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHKeikakuZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuZengetsu182Bytes());
  }

  public void setHKeikakuZengetsu182(long arg) {
  setHKeikakuZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHRuisaZengetsu182Bytes() {
    return hRuisaZengetsu182;
  }

  public void setHRuisaZengetsu182Bytes(byte[] arg) {
    hRuisaZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHRuisaZengetsu182() {
    hRuisaZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHRuisaZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHRuisaZengetsu182Bytes());
  }

  public void setHRuisaZengetsu182(long arg) {
  setHRuisaZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKeikakuTougetsu182Bytes() {
    return hKeikakuTougetsu182;
  }

  public void setHKeikakuTougetsu182Bytes(byte[] arg) {
    hKeikakuTougetsu182 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuTougetsu182() {
    hKeikakuTougetsu182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));
  }

  public String getHKeikakuTougetsu182() {
  return CommonUtils.bytesToString(getHKeikakuTougetsu182Bytes());
  }

  public void setHKeikakuTougetsu182(String arg) {
  final int trailing_length = 252 - arg.length();
  if (trailing_length > 0) {
  setHKeikakuTougetsu182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKeikakuTougetsu182Bytes(CommonUtils.stringToBytes(arg.substring(0, 252)));
  }
  }

  public byte[] getHKeikakuJigetsu182Bytes() {
    return hKeikakuJigetsu182;
  }

  public void setHKeikakuJigetsu182Bytes(byte[] arg) {
    hKeikakuJigetsu182 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuJigetsu182() {
    hKeikakuJigetsu182 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));
  }

  public String getHKeikakuJigetsu182() {
  return CommonUtils.bytesToString(getHKeikakuJigetsu182Bytes());
  }

  public void setHKeikakuJigetsu182(String arg) {
  final int trailing_length = 164 - arg.length();
  if (trailing_length > 0) {
  setHKeikakuJigetsu182Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKeikakuJigetsu182Bytes(CommonUtils.stringToBytes(arg.substring(0, 164)));
  }
  }

  public byte[] getHIkanZengetsu182Bytes() {
    return hIkanZengetsu182;
  }

  public void setHIkanZengetsu182Bytes(byte[] arg) {
    hIkanZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHIkanZengetsu182() {
    hIkanZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHIkanZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHIkanZengetsu182Bytes());
  }

  public void setHIkanZengetsu182(long arg) {
  setHIkanZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHIkanTougetsu182Bytes() {
    return hIkanTougetsu182;
  }

  public void setHIkanTougetsu182Bytes(byte[] arg) {
    hIkanTougetsu182 = ArrayUtils.clone(arg);
  }

  public void initHIkanTougetsu182() {
    hIkanTougetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHIkanTougetsu182() {
    return CommonUtils.packedDecimalToNumber(getHIkanTougetsu182Bytes());
  }

  public void setHIkanTougetsu182(long arg) {
  setHIkanTougetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHIkanJigetsu182Bytes() {
    return hIkanJigetsu182;
  }

  public void setHIkanJigetsu182Bytes(byte[] arg) {
    hIkanJigetsu182 = ArrayUtils.clone(arg);
  }

  public void initHIkanJigetsu182() {
    hIkanJigetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHIkanJigetsu182() {
    return CommonUtils.packedDecimalToNumber(getHIkanJigetsu182Bytes());
  }

  public void setHIkanJigetsu182(long arg) {
  setHIkanJigetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHShikyuuZengetsu182Bytes() {
    return hShikyuuZengetsu182;
  }

  public void setHShikyuuZengetsu182Bytes(byte[] arg) {
    hShikyuuZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHShikyuuZengetsu182() {
    hShikyuuZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHShikyuuZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHShikyuuZengetsu182Bytes());
  }

  public void setHShikyuuZengetsu182(long arg) {
  setHShikyuuZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHShikyuuTougetsu182Bytes() {
    return hShikyuuTougetsu182;
  }

  public void setHShikyuuTougetsu182Bytes(byte[] arg) {
    hShikyuuTougetsu182 = ArrayUtils.clone(arg);
  }

  public void initHShikyuuTougetsu182() {
    hShikyuuTougetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHShikyuuTougetsu182() {
    return CommonUtils.packedDecimalToNumber(getHShikyuuTougetsu182Bytes());
  }

  public void setHShikyuuTougetsu182(long arg) {
  setHShikyuuTougetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHShikyuuJigetsu182Bytes() {
    return hShikyuuJigetsu182;
  }

  public void setHShikyuuJigetsu182Bytes(byte[] arg) {
    hShikyuuJigetsu182 = ArrayUtils.clone(arg);
  }

  public void initHShikyuuJigetsu182() {
    hShikyuuJigetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHShikyuuJigetsu182() {
    return CommonUtils.packedDecimalToNumber(getHShikyuuJigetsu182Bytes());
  }

  public void setHShikyuuJigetsu182(long arg) {
  setHShikyuuJigetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHMikenZenZengetsu182Bytes() {
    return hMikenZenZengetsu182;
  }

  public void setHMikenZenZengetsu182Bytes(byte[] arg) {
    hMikenZenZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHMikenZenZengetsu182() {
    hMikenZenZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHMikenZenZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHMikenZenZengetsu182Bytes());
  }

  public void setHMikenZenZengetsu182(long arg) {
  setHMikenZenZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHMikenZengetsu182Bytes() {
    return hMikenZengetsu182;
  }

  public void setHMikenZengetsu182Bytes(byte[] arg) {
    hMikenZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHMikenZengetsu182() {
    hMikenZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHMikenZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHMikenZengetsu182Bytes());
  }

  public void setHMikenZengetsu182(long arg) {
  setHMikenZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKankenZenZengetsu182Bytes() {
    return hKankenZenZengetsu182;
  }

  public void setHKankenZenZengetsu182Bytes(byte[] arg) {
    hKankenZenZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHKankenZenZengetsu182() {
    hKankenZenZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHKankenZenZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHKankenZenZengetsu182Bytes());
  }

  public void setHKankenZenZengetsu182(long arg) {
  setHKankenZenZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKankenZengetsu182Bytes() {
    return hKankenZengetsu182;
  }

  public void setHKankenZengetsu182Bytes(byte[] arg) {
    hKankenZengetsu182 = ArrayUtils.clone(arg);
  }

  public void initHKankenZengetsu182() {
    hKankenZengetsu182 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHKankenZengetsu182() {
    return CommonUtils.packedDecimalToNumber(getHKankenZengetsu182Bytes());
  }

  public void setHKankenZengetsu182(long arg) {
  setHKankenZengetsu182Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHShiyou182RBytes() {
    return hShiyou182R;
  }

  public void setHShiyou182RBytes(byte[] arg) {
    hShiyou182R = ArrayUtils.clone(arg);
  }

  public void initHShiyou182R() {
    hShiyou182R =CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));
  }

  public String getHShiyou182R() {
  return CommonUtils.bytesToString(getHShiyou182RBytes());
  }

  public void setHShiyou182R(String arg) {
  final int trailing_length = 30 - arg.length();
  if (trailing_length > 0) {
  setHShiyou182RBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShiyou182RBytes(CommonUtils.stringToBytes(arg.substring(0, 30)));
  }
  }

  public byte[] getHostForShakei183Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(1169);
        buffer.put(getHKoujouKubun183Bytes());
        buffer.put(getHShakeiCode183Bytes());
        buffer.put(getHLineKubun183Bytes());
        buffer.put(getHYymm183Bytes());
        buffer.put(getHKouteiId183Bytes());
        buffer.put(getHJissekiZengetsu183Bytes());
        buffer.put(getHJissekiTougetsu183Bytes());
        buffer.put(getHJissekiJigetsu183Bytes());
        buffer.put(getHRuisaZenZengetsu183Bytes());
        buffer.put(getHKeikakuZengetsu183Bytes());
        buffer.put(getHRuisaZengetsu183Bytes());
        buffer.put(getHKeikakuTougetsu183Bytes());
        buffer.put(getHKeikakuJigetsu183Bytes());
        buffer.put(getHZenZenShift183Bytes());
        buffer.put(getHZenShift183Bytes());
        buffer.put(getHTouShift183Bytes());
        buffer.put(getHJiShift183Bytes());
        buffer.put(getHJissekiOhMetal101183Bytes());
        buffer.put(getHJissekiOhMetal102183Bytes());
        buffer.put(getHJissekiOhMetal103183Bytes());
        buffer.put(getHJissekiOhMetal104183Bytes());
        buffer.put(getHJissekiOhMetal201183Bytes());
        buffer.put(getHJissekiOhMetal202183Bytes());
        buffer.put(getHJissekiOhMetal203183Bytes());
        buffer.put(getHJissekiOhMetal204183Bytes());
        buffer.put(getHJissekiOhWbs01183Bytes());
        buffer.put(getHJissekiOhWbs02183Bytes());
        buffer.put(getHJissekiOhWbs03183Bytes());
        buffer.put(getHJissekiOhWbs04183Bytes());
        buffer.put(getHJissekiOhShitaP01183Bytes());
        buffer.put(getHJissekiOhShitaP02183Bytes());
        buffer.put(getHJissekiOhShitaP03183Bytes());
        buffer.put(getHJissekiOhShitaP04183Bytes());
        buffer.put(getHJissekiOhNakaP01183Bytes());
        buffer.put(getHJissekiOhNakaP02183Bytes());
        buffer.put(getHJissekiOhNakaP03183Bytes());
        buffer.put(getHJissekiOhNakaP04183Bytes());
        buffer.put(getHJissekiOhUwaP01183Bytes());
        buffer.put(getHJissekiOhUwaP02183Bytes());
        buffer.put(getHJissekiOhUwaP03183Bytes());
        buffer.put(getHJissekiOhUwaP04183Bytes());
        buffer.put(getHJissekiOhPbs01183Bytes());
        buffer.put(getHJissekiOhPbs02183Bytes());
        buffer.put(getHJissekiOhPbs03183Bytes());
        buffer.put(getHJissekiOhPbs04183Bytes());
        buffer.put(getHJissekiOhPreTrim01183Bytes());
        buffer.put(getHJissekiOhPreTrim02183Bytes());
        buffer.put(getHJissekiOhPreTrim03183Bytes());
        buffer.put(getHJissekiOhPreTrim04183Bytes());
        buffer.put(getHJikkekiOhTrim01183Bytes());
        buffer.put(getHJikkekiOhTrim02183Bytes());
        buffer.put(getHJikkekiOhTrim03183Bytes());
        buffer.put(getHJikkekiOhTrim04183Bytes());
        buffer.put(getHJikkekiOhFinal01183Bytes());
        buffer.put(getHJikkekiOhFinal02183Bytes());
        buffer.put(getHJikkekiOhFinal03183Bytes());
        buffer.put(getHJikkekiOhFinal04183Bytes());
        buffer.put(getHJikkekiOhKasou01183Bytes());
        buffer.put(getHJikkekiOhKasou02183Bytes());
        buffer.put(getHJikkekiOhKasou03183Bytes());
        buffer.put(getHJikkekiOhKasou04183Bytes());
        buffer.put(getHJikkekiOhDeliv01183Bytes());
        buffer.put(getHJikkekiOhDeliv02183Bytes());
        buffer.put(getHJikkekiOhDeliv03183Bytes());
        buffer.put(getHJikkekiOhDeliv04183Bytes());
        buffer.put(getHJikkekiOhUkeire01183Bytes());
        buffer.put(getHJikkekiOhUkeire02183Bytes());
        buffer.put(getHJikkekiOhUkeire03183Bytes());
        buffer.put(getHJikkekiOhUkeire04183Bytes());
        buffer.put(getHKeikakuOhMetal101183Bytes());
        buffer.put(getHKeikakuOhMetal102183Bytes());
        buffer.put(getHKeikakuOhMetal103183Bytes());
        buffer.put(getHKeikakuOhMetal104183Bytes());
        buffer.put(getHKeikakuOhMetal201183Bytes());
        buffer.put(getHKeikakuOhMetal202183Bytes());
        buffer.put(getHKeikakuOhMetal203183Bytes());
        buffer.put(getHKeikakuOhMetal204183Bytes());
        buffer.put(getHKeikakuOhWbs01183Bytes());
        buffer.put(getHKeikakuOhWbs02183Bytes());
        buffer.put(getHKeikakuOhWbs03183Bytes());
        buffer.put(getHKeikakuOhWbs04183Bytes());
        buffer.put(getHKeikakuOhShitaP01183Bytes());
        buffer.put(getHKeikakuOhShitaP02183Bytes());
        buffer.put(getHKeikakuOhShitaP03183Bytes());
        buffer.put(getHKeikakuOhShitaP04183Bytes());
        buffer.put(getHKeikakuOhNakaP01183Bytes());
        buffer.put(getHKeikakuOhNakaP02183Bytes());
        buffer.put(getHKeikakuOhNakaP03183Bytes());
        buffer.put(getHKeikakuOhNakaP04183Bytes());
        buffer.put(getHKeikakuOhUwaP01183Bytes());
        buffer.put(getHKeikakuOhUwaP02183Bytes());
        buffer.put(getHKeikakuOhUwaP03183Bytes());
        buffer.put(getHKeikakuOhUwaP04183Bytes());
        buffer.put(getHKeikakuOhPbs01183Bytes());
        buffer.put(getHKeikakuOhPbs02183Bytes());
        buffer.put(getHKeikakuOhPbs03183Bytes());
        buffer.put(getHKeikakuOhPbs04183Bytes());
        buffer.put(getHKeikakuOhPreTrim01183Bytes());
        buffer.put(getHKeikakuOhPreTrim02183Bytes());
        buffer.put(getHKeikakuOhPreTrim03183Bytes());
        buffer.put(getHKeikakuOhPreTrim04183Bytes());
        buffer.put(getHKeikakuOhTrim01183Bytes());
        buffer.put(getHKeikakuOhTrim02183Bytes());
        buffer.put(getHKeikakuOhTrim03183Bytes());
        buffer.put(getHKeikakuOhTrim04183Bytes());
        buffer.put(getHKeikakuOhFinal01183Bytes());
        buffer.put(getHKeikakuOhFinal02183Bytes());
        buffer.put(getHKeikakuOhFinal03183Bytes());
        buffer.put(getHKeikakuOhFinal04183Bytes());
        buffer.put(getHKeikakuOhKasou01183Bytes());
        buffer.put(getHKeikakuOhKasou02183Bytes());
        buffer.put(getHKeikakuOhKasou03183Bytes());
        buffer.put(getHKeikakuOhKasou04183Bytes());
        buffer.put(getHKeikakuOhDeliv01183Bytes());
        buffer.put(getHKeikakuOhDeliv02183Bytes());
        buffer.put(getHKeikakuOhDeliv03183Bytes());
        buffer.put(getHKeikakuOhDeliv04183Bytes());
        buffer.put(getHKeikakuOhUkeire01183Bytes());
        buffer.put(getHKeikakuOhUkeire02183Bytes());
        buffer.put(getHKeikakuOhUkeire03183Bytes());
        buffer.put(getHKeikakuOhUkeire04183Bytes());
        buffer.put(getHShakei183RBytes());
        buffer.put(getHShakeiCode36183Bytes());
        buffer.put(getHShakeiCode12183Bytes());
    return buffer.array();
  }

  public void setHostForShakei183Bytes(byte[] arg) {
        setHKoujouKubun183Bytes(ArrayUtils.subarray(arg, 0, 1));
        setHShakeiCode183Bytes(ArrayUtils.subarray(arg, 1, 7));
        setHLineKubun183Bytes(ArrayUtils.subarray(arg, 7, 11));
        setHYymm183Bytes(ArrayUtils.subarray(arg, 11, 15));
        setHKouteiId183Bytes(ArrayUtils.subarray(arg, 15, 17));
        setHJissekiZengetsu183Bytes(ArrayUtils.subarray(arg, 17, 20));
        setHJissekiTougetsu183Bytes(ArrayUtils.subarray(arg, 20, 272));
        setHJissekiJigetsu183Bytes(ArrayUtils.subarray(arg, 272, 436));
        setHRuisaZenZengetsu183Bytes(ArrayUtils.subarray(arg, 436, 439));
        setHKeikakuZengetsu183Bytes(ArrayUtils.subarray(arg, 439, 442));
        setHRuisaZengetsu183Bytes(ArrayUtils.subarray(arg, 442, 445));
        setHKeikakuTougetsu183Bytes(ArrayUtils.subarray(arg, 445, 697));
        setHKeikakuJigetsu183Bytes(ArrayUtils.subarray(arg, 697, 861));
        setHZenZenShift183Bytes(ArrayUtils.subarray(arg, 861, 864));
        setHZenShift183Bytes(ArrayUtils.subarray(arg, 864, 867));
        setHTouShift183Bytes(ArrayUtils.subarray(arg, 867, 870));
        setHJiShift183Bytes(ArrayUtils.subarray(arg, 870, 873));
        setHJissekiOhMetal101183Bytes(ArrayUtils.subarray(arg, 873, 876));
        setHJissekiOhMetal102183Bytes(ArrayUtils.subarray(arg, 876, 879));
        setHJissekiOhMetal103183Bytes(ArrayUtils.subarray(arg, 879, 882));
        setHJissekiOhMetal104183Bytes(ArrayUtils.subarray(arg, 882, 885));
        setHJissekiOhMetal201183Bytes(ArrayUtils.subarray(arg, 885, 888));
        setHJissekiOhMetal202183Bytes(ArrayUtils.subarray(arg, 888, 891));
        setHJissekiOhMetal203183Bytes(ArrayUtils.subarray(arg, 891, 894));
        setHJissekiOhMetal204183Bytes(ArrayUtils.subarray(arg, 894, 897));
        setHJissekiOhWbs01183Bytes(ArrayUtils.subarray(arg, 897, 900));
        setHJissekiOhWbs02183Bytes(ArrayUtils.subarray(arg, 900, 903));
        setHJissekiOhWbs03183Bytes(ArrayUtils.subarray(arg, 903, 906));
        setHJissekiOhWbs04183Bytes(ArrayUtils.subarray(arg, 906, 909));
        setHJissekiOhShitaP01183Bytes(ArrayUtils.subarray(arg, 909, 912));
        setHJissekiOhShitaP02183Bytes(ArrayUtils.subarray(arg, 912, 915));
        setHJissekiOhShitaP03183Bytes(ArrayUtils.subarray(arg, 915, 918));
        setHJissekiOhShitaP04183Bytes(ArrayUtils.subarray(arg, 918, 921));
        setHJissekiOhNakaP01183Bytes(ArrayUtils.subarray(arg, 921, 924));
        setHJissekiOhNakaP02183Bytes(ArrayUtils.subarray(arg, 924, 927));
        setHJissekiOhNakaP03183Bytes(ArrayUtils.subarray(arg, 927, 930));
        setHJissekiOhNakaP04183Bytes(ArrayUtils.subarray(arg, 930, 933));
        setHJissekiOhUwaP01183Bytes(ArrayUtils.subarray(arg, 933, 936));
        setHJissekiOhUwaP02183Bytes(ArrayUtils.subarray(arg, 936, 939));
        setHJissekiOhUwaP03183Bytes(ArrayUtils.subarray(arg, 939, 942));
        setHJissekiOhUwaP04183Bytes(ArrayUtils.subarray(arg, 942, 945));
        setHJissekiOhPbs01183Bytes(ArrayUtils.subarray(arg, 945, 948));
        setHJissekiOhPbs02183Bytes(ArrayUtils.subarray(arg, 948, 951));
        setHJissekiOhPbs03183Bytes(ArrayUtils.subarray(arg, 951, 954));
        setHJissekiOhPbs04183Bytes(ArrayUtils.subarray(arg, 954, 957));
        setHJissekiOhPreTrim01183Bytes(ArrayUtils.subarray(arg, 957, 960));
        setHJissekiOhPreTrim02183Bytes(ArrayUtils.subarray(arg, 960, 963));
        setHJissekiOhPreTrim03183Bytes(ArrayUtils.subarray(arg, 963, 966));
        setHJissekiOhPreTrim04183Bytes(ArrayUtils.subarray(arg, 966, 969));
        setHJikkekiOhTrim01183Bytes(ArrayUtils.subarray(arg, 969, 972));
        setHJikkekiOhTrim02183Bytes(ArrayUtils.subarray(arg, 972, 975));
        setHJikkekiOhTrim03183Bytes(ArrayUtils.subarray(arg, 975, 978));
        setHJikkekiOhTrim04183Bytes(ArrayUtils.subarray(arg, 978, 981));
        setHJikkekiOhFinal01183Bytes(ArrayUtils.subarray(arg, 981, 984));
        setHJikkekiOhFinal02183Bytes(ArrayUtils.subarray(arg, 984, 987));
        setHJikkekiOhFinal03183Bytes(ArrayUtils.subarray(arg, 987, 990));
        setHJikkekiOhFinal04183Bytes(ArrayUtils.subarray(arg, 990, 993));
        setHJikkekiOhKasou01183Bytes(ArrayUtils.subarray(arg, 993, 996));
        setHJikkekiOhKasou02183Bytes(ArrayUtils.subarray(arg, 996, 999));
        setHJikkekiOhKasou03183Bytes(ArrayUtils.subarray(arg, 999, 1002));
        setHJikkekiOhKasou04183Bytes(ArrayUtils.subarray(arg, 1002, 1005));
        setHJikkekiOhDeliv01183Bytes(ArrayUtils.subarray(arg, 1005, 1008));
        setHJikkekiOhDeliv02183Bytes(ArrayUtils.subarray(arg, 1008, 1011));
        setHJikkekiOhDeliv03183Bytes(ArrayUtils.subarray(arg, 1011, 1014));
        setHJikkekiOhDeliv04183Bytes(ArrayUtils.subarray(arg, 1014, 1017));
        setHJikkekiOhUkeire01183Bytes(ArrayUtils.subarray(arg, 1017, 1020));
        setHJikkekiOhUkeire02183Bytes(ArrayUtils.subarray(arg, 1020, 1023));
        setHJikkekiOhUkeire03183Bytes(ArrayUtils.subarray(arg, 1023, 1026));
        setHJikkekiOhUkeire04183Bytes(ArrayUtils.subarray(arg, 1026, 1029));
        setHKeikakuOhMetal101183Bytes(ArrayUtils.subarray(arg, 1029, 1031));
        setHKeikakuOhMetal102183Bytes(ArrayUtils.subarray(arg, 1031, 1033));
        setHKeikakuOhMetal103183Bytes(ArrayUtils.subarray(arg, 1033, 1035));
        setHKeikakuOhMetal104183Bytes(ArrayUtils.subarray(arg, 1035, 1037));
        setHKeikakuOhMetal201183Bytes(ArrayUtils.subarray(arg, 1037, 1039));
        setHKeikakuOhMetal202183Bytes(ArrayUtils.subarray(arg, 1039, 1041));
        setHKeikakuOhMetal203183Bytes(ArrayUtils.subarray(arg, 1041, 1043));
        setHKeikakuOhMetal204183Bytes(ArrayUtils.subarray(arg, 1043, 1045));
        setHKeikakuOhWbs01183Bytes(ArrayUtils.subarray(arg, 1045, 1047));
        setHKeikakuOhWbs02183Bytes(ArrayUtils.subarray(arg, 1047, 1049));
        setHKeikakuOhWbs03183Bytes(ArrayUtils.subarray(arg, 1049, 1051));
        setHKeikakuOhWbs04183Bytes(ArrayUtils.subarray(arg, 1051, 1053));
        setHKeikakuOhShitaP01183Bytes(ArrayUtils.subarray(arg, 1053, 1055));
        setHKeikakuOhShitaP02183Bytes(ArrayUtils.subarray(arg, 1055, 1057));
        setHKeikakuOhShitaP03183Bytes(ArrayUtils.subarray(arg, 1057, 1059));
        setHKeikakuOhShitaP04183Bytes(ArrayUtils.subarray(arg, 1059, 1061));
        setHKeikakuOhNakaP01183Bytes(ArrayUtils.subarray(arg, 1061, 1063));
        setHKeikakuOhNakaP02183Bytes(ArrayUtils.subarray(arg, 1063, 1065));
        setHKeikakuOhNakaP03183Bytes(ArrayUtils.subarray(arg, 1065, 1067));
        setHKeikakuOhNakaP04183Bytes(ArrayUtils.subarray(arg, 1067, 1069));
        setHKeikakuOhUwaP01183Bytes(ArrayUtils.subarray(arg, 1069, 1071));
        setHKeikakuOhUwaP02183Bytes(ArrayUtils.subarray(arg, 1071, 1073));
        setHKeikakuOhUwaP03183Bytes(ArrayUtils.subarray(arg, 1073, 1075));
        setHKeikakuOhUwaP04183Bytes(ArrayUtils.subarray(arg, 1075, 1077));
        setHKeikakuOhPbs01183Bytes(ArrayUtils.subarray(arg, 1077, 1079));
        setHKeikakuOhPbs02183Bytes(ArrayUtils.subarray(arg, 1079, 1081));
        setHKeikakuOhPbs03183Bytes(ArrayUtils.subarray(arg, 1081, 1083));
        setHKeikakuOhPbs04183Bytes(ArrayUtils.subarray(arg, 1083, 1085));
        setHKeikakuOhPreTrim01183Bytes(ArrayUtils.subarray(arg, 1085, 1087));
        setHKeikakuOhPreTrim02183Bytes(ArrayUtils.subarray(arg, 1087, 1089));
        setHKeikakuOhPreTrim03183Bytes(ArrayUtils.subarray(arg, 1089, 1091));
        setHKeikakuOhPreTrim04183Bytes(ArrayUtils.subarray(arg, 1091, 1093));
        setHKeikakuOhTrim01183Bytes(ArrayUtils.subarray(arg, 1093, 1095));
        setHKeikakuOhTrim02183Bytes(ArrayUtils.subarray(arg, 1095, 1097));
        setHKeikakuOhTrim03183Bytes(ArrayUtils.subarray(arg, 1097, 1099));
        setHKeikakuOhTrim04183Bytes(ArrayUtils.subarray(arg, 1099, 1101));
        setHKeikakuOhFinal01183Bytes(ArrayUtils.subarray(arg, 1101, 1103));
        setHKeikakuOhFinal02183Bytes(ArrayUtils.subarray(arg, 1103, 1105));
        setHKeikakuOhFinal03183Bytes(ArrayUtils.subarray(arg, 1105, 1107));
        setHKeikakuOhFinal04183Bytes(ArrayUtils.subarray(arg, 1107, 1109));
        setHKeikakuOhKasou01183Bytes(ArrayUtils.subarray(arg, 1109, 1111));
        setHKeikakuOhKasou02183Bytes(ArrayUtils.subarray(arg, 1111, 1113));
        setHKeikakuOhKasou03183Bytes(ArrayUtils.subarray(arg, 1113, 1115));
        setHKeikakuOhKasou04183Bytes(ArrayUtils.subarray(arg, 1115, 1117));
        setHKeikakuOhDeliv01183Bytes(ArrayUtils.subarray(arg, 1117, 1119));
        setHKeikakuOhDeliv02183Bytes(ArrayUtils.subarray(arg, 1119, 1121));
        setHKeikakuOhDeliv03183Bytes(ArrayUtils.subarray(arg, 1121, 1123));
        setHKeikakuOhDeliv04183Bytes(ArrayUtils.subarray(arg, 1123, 1125));
        setHKeikakuOhUkeire01183Bytes(ArrayUtils.subarray(arg, 1125, 1127));
        setHKeikakuOhUkeire02183Bytes(ArrayUtils.subarray(arg, 1127, 1129));
        setHKeikakuOhUkeire03183Bytes(ArrayUtils.subarray(arg, 1129, 1131));
        setHKeikakuOhUkeire04183Bytes(ArrayUtils.subarray(arg, 1131, 1133));
        setHShakei183RBytes(ArrayUtils.subarray(arg, 1133, 1163));
        setHShakeiCode36183Bytes(ArrayUtils.subarray(arg, 1163, 1167));
        setHShakeiCode12183Bytes(ArrayUtils.subarray(arg, 1167, 1169));
  }

  public void initHostForShakei183() {
        initHKoujouKubun183();
        initHShakeiCode183();
        initHLineKubun183();
        initHYymm183();
        initHKouteiId183();
        initHJissekiZengetsu183();
        initHJissekiTougetsu183();
        initHJissekiJigetsu183();
        initHRuisaZenZengetsu183();
        initHKeikakuZengetsu183();
        initHRuisaZengetsu183();
        initHKeikakuTougetsu183();
        initHKeikakuJigetsu183();
        initHZenZenShift183();
        initHZenShift183();
        initHTouShift183();
        initHJiShift183();
        initHJissekiOhMetal101183();
        initHJissekiOhMetal102183();
        initHJissekiOhMetal103183();
        initHJissekiOhMetal104183();
        initHJissekiOhMetal201183();
        initHJissekiOhMetal202183();
        initHJissekiOhMetal203183();
        initHJissekiOhMetal204183();
        initHJissekiOhWbs01183();
        initHJissekiOhWbs02183();
        initHJissekiOhWbs03183();
        initHJissekiOhWbs04183();
        initHJissekiOhShitaP01183();
        initHJissekiOhShitaP02183();
        initHJissekiOhShitaP03183();
        initHJissekiOhShitaP04183();
        initHJissekiOhNakaP01183();
        initHJissekiOhNakaP02183();
        initHJissekiOhNakaP03183();
        initHJissekiOhNakaP04183();
        initHJissekiOhUwaP01183();
        initHJissekiOhUwaP02183();
        initHJissekiOhUwaP03183();
        initHJissekiOhUwaP04183();
        initHJissekiOhPbs01183();
        initHJissekiOhPbs02183();
        initHJissekiOhPbs03183();
        initHJissekiOhPbs04183();
        initHJissekiOhPreTrim01183();
        initHJissekiOhPreTrim02183();
        initHJissekiOhPreTrim03183();
        initHJissekiOhPreTrim04183();
        initHJikkekiOhTrim01183();
        initHJikkekiOhTrim02183();
        initHJikkekiOhTrim03183();
        initHJikkekiOhTrim04183();
        initHJikkekiOhFinal01183();
        initHJikkekiOhFinal02183();
        initHJikkekiOhFinal03183();
        initHJikkekiOhFinal04183();
        initHJikkekiOhKasou01183();
        initHJikkekiOhKasou02183();
        initHJikkekiOhKasou03183();
        initHJikkekiOhKasou04183();
        initHJikkekiOhDeliv01183();
        initHJikkekiOhDeliv02183();
        initHJikkekiOhDeliv03183();
        initHJikkekiOhDeliv04183();
        initHJikkekiOhUkeire01183();
        initHJikkekiOhUkeire02183();
        initHJikkekiOhUkeire03183();
        initHJikkekiOhUkeire04183();
        initHKeikakuOhMetal101183();
        initHKeikakuOhMetal102183();
        initHKeikakuOhMetal103183();
        initHKeikakuOhMetal104183();
        initHKeikakuOhMetal201183();
        initHKeikakuOhMetal202183();
        initHKeikakuOhMetal203183();
        initHKeikakuOhMetal204183();
        initHKeikakuOhWbs01183();
        initHKeikakuOhWbs02183();
        initHKeikakuOhWbs03183();
        initHKeikakuOhWbs04183();
        initHKeikakuOhShitaP01183();
        initHKeikakuOhShitaP02183();
        initHKeikakuOhShitaP03183();
        initHKeikakuOhShitaP04183();
        initHKeikakuOhNakaP01183();
        initHKeikakuOhNakaP02183();
        initHKeikakuOhNakaP03183();
        initHKeikakuOhNakaP04183();
        initHKeikakuOhUwaP01183();
        initHKeikakuOhUwaP02183();
        initHKeikakuOhUwaP03183();
        initHKeikakuOhUwaP04183();
        initHKeikakuOhPbs01183();
        initHKeikakuOhPbs02183();
        initHKeikakuOhPbs03183();
        initHKeikakuOhPbs04183();
        initHKeikakuOhPreTrim01183();
        initHKeikakuOhPreTrim02183();
        initHKeikakuOhPreTrim03183();
        initHKeikakuOhPreTrim04183();
        initHKeikakuOhTrim01183();
        initHKeikakuOhTrim02183();
        initHKeikakuOhTrim03183();
        initHKeikakuOhTrim04183();
        initHKeikakuOhFinal01183();
        initHKeikakuOhFinal02183();
        initHKeikakuOhFinal03183();
        initHKeikakuOhFinal04183();
        initHKeikakuOhKasou01183();
        initHKeikakuOhKasou02183();
        initHKeikakuOhKasou03183();
        initHKeikakuOhKasou04183();
        initHKeikakuOhDeliv01183();
        initHKeikakuOhDeliv02183();
        initHKeikakuOhDeliv03183();
        initHKeikakuOhDeliv04183();
        initHKeikakuOhUkeire01183();
        initHKeikakuOhUkeire02183();
        initHKeikakuOhUkeire03183();
        initHKeikakuOhUkeire04183();
        initHShakei183R();
        initHShakeiCode36183();
        initHShakeiCode12183();
  }

  public String getHostForShakei183() {
  return CommonUtils.bytesToString(getHostForShakei183Bytes());
  }

  public void setHostForShakei183(String arg) {
  final int trailing_length = 1169 - arg.length();
  if (trailing_length > 0) {
  setHostForShakei183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHostForShakei183Bytes(CommonUtils.stringToBytes(arg.substring(0, 1169)));
  }
  }

  public byte[] getHKoujouKubun183Bytes() {
    return hKoujouKubun183;
  }

  public void setHKoujouKubun183Bytes(byte[] arg) {
    hKoujouKubun183 = ArrayUtils.clone(arg);
  }

  public void initHKoujouKubun183() {
    hKoujouKubun183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKoujouKubun183() {
  return CommonUtils.bytesToString(getHKoujouKubun183Bytes());
  }

  public void setHKoujouKubun183(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKoujouKubun183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouKubun183Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHShakeiCode183Bytes() {
    return hShakeiCode183;
  }

  public void setHShakeiCode183Bytes(byte[] arg) {
    hShakeiCode183 = ArrayUtils.clone(arg);
  }

  public void initHShakeiCode183() {
    hShakeiCode183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHShakeiCode183() {
  return CommonUtils.bytesToString(getHShakeiCode183Bytes());
  }

  public void setHShakeiCode183(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHShakeiCode183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShakeiCode183Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHLineKubun183Bytes() {
    return hLineKubun183;
  }

  public void setHLineKubun183Bytes(byte[] arg) {
    hLineKubun183 = ArrayUtils.clone(arg);
  }

  public void initHLineKubun183() {
    hLineKubun183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHLineKubun183() {
  return CommonUtils.bytesToString(getHLineKubun183Bytes());
  }

  public void setHLineKubun183(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHLineKubun183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLineKubun183Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHYymm183Bytes() {
    return hYymm183;
  }

  public void setHYymm183Bytes(byte[] arg) {
    hYymm183 = ArrayUtils.clone(arg);
  }

  public void initHYymm183() {
    hYymm183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHYymm183() {
  return CommonUtils.bytesToString(getHYymm183Bytes());
  }

  public void setHYymm183(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHYymm183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHYymm183Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHKouteiId183Bytes() {
    return hKouteiId183;
  }

  public void setHKouteiId183Bytes(byte[] arg) {
    hKouteiId183 = ArrayUtils.clone(arg);
  }

  public void initHKouteiId183() {
    hKouteiId183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHKouteiId183() {
  return CommonUtils.bytesToString(getHKouteiId183Bytes());
  }

  public void setHKouteiId183(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHKouteiId183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKouteiId183Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHJissekiZengetsu183Bytes() {
    return hJissekiZengetsu183;
  }

  public void setHJissekiZengetsu183Bytes(byte[] arg) {
    hJissekiZengetsu183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiZengetsu183() {
    hJissekiZengetsu183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiZengetsu183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiZengetsu183Bytes());
  }

  public void setHJissekiZengetsu183(long arg) {
  setHJissekiZengetsu183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiTougetsu183Bytes() {
    return hJissekiTougetsu183;
  }

  public void setHJissekiTougetsu183Bytes(byte[] arg) {
    hJissekiTougetsu183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiTougetsu183() {
    hJissekiTougetsu183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));
  }

  public String getHJissekiTougetsu183() {
  return CommonUtils.bytesToString(getHJissekiTougetsu183Bytes());
  }

  public void setHJissekiTougetsu183(String arg) {
  final int trailing_length = 252 - arg.length();
  if (trailing_length > 0) {
  setHJissekiTougetsu183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHJissekiTougetsu183Bytes(CommonUtils.stringToBytes(arg.substring(0, 252)));
  }
  }

  public byte[] getHJissekiJigetsu183Bytes() {
    return hJissekiJigetsu183;
  }

  public void setHJissekiJigetsu183Bytes(byte[] arg) {
    hJissekiJigetsu183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiJigetsu183() {
    hJissekiJigetsu183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));
  }

  public String getHJissekiJigetsu183() {
  return CommonUtils.bytesToString(getHJissekiJigetsu183Bytes());
  }

  public void setHJissekiJigetsu183(String arg) {
  final int trailing_length = 164 - arg.length();
  if (trailing_length > 0) {
  setHJissekiJigetsu183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHJissekiJigetsu183Bytes(CommonUtils.stringToBytes(arg.substring(0, 164)));
  }
  }

  public byte[] getHRuisaZenZengetsu183Bytes() {
    return hRuisaZenZengetsu183;
  }

  public void setHRuisaZenZengetsu183Bytes(byte[] arg) {
    hRuisaZenZengetsu183 = ArrayUtils.clone(arg);
  }

  public void initHRuisaZenZengetsu183() {
    hRuisaZenZengetsu183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHRuisaZenZengetsu183() {
    return CommonUtils.packedDecimalToNumber(getHRuisaZenZengetsu183Bytes());
  }

  public void setHRuisaZenZengetsu183(long arg) {
  setHRuisaZenZengetsu183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKeikakuZengetsu183Bytes() {
    return hKeikakuZengetsu183;
  }

  public void setHKeikakuZengetsu183Bytes(byte[] arg) {
    hKeikakuZengetsu183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuZengetsu183() {
    hKeikakuZengetsu183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHKeikakuZengetsu183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuZengetsu183Bytes());
  }

  public void setHKeikakuZengetsu183(long arg) {
  setHKeikakuZengetsu183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHRuisaZengetsu183Bytes() {
    return hRuisaZengetsu183;
  }

  public void setHRuisaZengetsu183Bytes(byte[] arg) {
    hRuisaZengetsu183 = ArrayUtils.clone(arg);
  }

  public void initHRuisaZengetsu183() {
    hRuisaZengetsu183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHRuisaZengetsu183() {
    return CommonUtils.packedDecimalToNumber(getHRuisaZengetsu183Bytes());
  }

  public void setHRuisaZengetsu183(long arg) {
  setHRuisaZengetsu183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKeikakuTougetsu183Bytes() {
    return hKeikakuTougetsu183;
  }

  public void setHKeikakuTougetsu183Bytes(byte[] arg) {
    hKeikakuTougetsu183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuTougetsu183() {
    hKeikakuTougetsu183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 252));
  }

  public String getHKeikakuTougetsu183() {
  return CommonUtils.bytesToString(getHKeikakuTougetsu183Bytes());
  }

  public void setHKeikakuTougetsu183(String arg) {
  final int trailing_length = 252 - arg.length();
  if (trailing_length > 0) {
  setHKeikakuTougetsu183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKeikakuTougetsu183Bytes(CommonUtils.stringToBytes(arg.substring(0, 252)));
  }
  }

  public byte[] getHKeikakuJigetsu183Bytes() {
    return hKeikakuJigetsu183;
  }

  public void setHKeikakuJigetsu183Bytes(byte[] arg) {
    hKeikakuJigetsu183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuJigetsu183() {
    hKeikakuJigetsu183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 164));
  }

  public String getHKeikakuJigetsu183() {
  return CommonUtils.bytesToString(getHKeikakuJigetsu183Bytes());
  }

  public void setHKeikakuJigetsu183(String arg) {
  final int trailing_length = 164 - arg.length();
  if (trailing_length > 0) {
  setHKeikakuJigetsu183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKeikakuJigetsu183Bytes(CommonUtils.stringToBytes(arg.substring(0, 164)));
  }
  }

  public byte[] getHZenZenShift183Bytes() {
    return hZenZenShift183;
  }

  public void setHZenZenShift183Bytes(byte[] arg) {
    hZenZenShift183 = ArrayUtils.clone(arg);
  }

  public void initHZenZenShift183() {
    hZenZenShift183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHZenZenShift183() {
    return CommonUtils.packedDecimalToNumber(getHZenZenShift183Bytes());
  }

  public void setHZenZenShift183(long arg) {
  setHZenZenShift183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHZenShift183Bytes() {
    return hZenShift183;
  }

  public void setHZenShift183Bytes(byte[] arg) {
    hZenShift183 = ArrayUtils.clone(arg);
  }

  public void initHZenShift183() {
    hZenShift183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHZenShift183() {
    return CommonUtils.packedDecimalToNumber(getHZenShift183Bytes());
  }

  public void setHZenShift183(long arg) {
  setHZenShift183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHTouShift183Bytes() {
    return hTouShift183;
  }

  public void setHTouShift183Bytes(byte[] arg) {
    hTouShift183 = ArrayUtils.clone(arg);
  }

  public void initHTouShift183() {
    hTouShift183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHTouShift183() {
    return CommonUtils.packedDecimalToNumber(getHTouShift183Bytes());
  }

  public void setHTouShift183(long arg) {
  setHTouShift183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJiShift183Bytes() {
    return hJiShift183;
  }

  public void setHJiShift183Bytes(byte[] arg) {
    hJiShift183 = ArrayUtils.clone(arg);
  }

  public void initHJiShift183() {
    hJiShift183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJiShift183() {
    return CommonUtils.packedDecimalToNumber(getHJiShift183Bytes());
  }

  public void setHJiShift183(long arg) {
  setHJiShift183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal101183Bytes() {
    return hJissekiOhMetal101183;
  }

  public void setHJissekiOhMetal101183Bytes(byte[] arg) {
    hJissekiOhMetal101183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal101183() {
    hJissekiOhMetal101183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal101183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal101183Bytes());
  }

  public void setHJissekiOhMetal101183(long arg) {
  setHJissekiOhMetal101183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal102183Bytes() {
    return hJissekiOhMetal102183;
  }

  public void setHJissekiOhMetal102183Bytes(byte[] arg) {
    hJissekiOhMetal102183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal102183() {
    hJissekiOhMetal102183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal102183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal102183Bytes());
  }

  public void setHJissekiOhMetal102183(long arg) {
  setHJissekiOhMetal102183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal103183Bytes() {
    return hJissekiOhMetal103183;
  }

  public void setHJissekiOhMetal103183Bytes(byte[] arg) {
    hJissekiOhMetal103183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal103183() {
    hJissekiOhMetal103183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal103183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal103183Bytes());
  }

  public void setHJissekiOhMetal103183(long arg) {
  setHJissekiOhMetal103183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal104183Bytes() {
    return hJissekiOhMetal104183;
  }

  public void setHJissekiOhMetal104183Bytes(byte[] arg) {
    hJissekiOhMetal104183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal104183() {
    hJissekiOhMetal104183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal104183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal104183Bytes());
  }

  public void setHJissekiOhMetal104183(long arg) {
  setHJissekiOhMetal104183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal201183Bytes() {
    return hJissekiOhMetal201183;
  }

  public void setHJissekiOhMetal201183Bytes(byte[] arg) {
    hJissekiOhMetal201183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal201183() {
    hJissekiOhMetal201183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal201183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal201183Bytes());
  }

  public void setHJissekiOhMetal201183(long arg) {
  setHJissekiOhMetal201183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal202183Bytes() {
    return hJissekiOhMetal202183;
  }

  public void setHJissekiOhMetal202183Bytes(byte[] arg) {
    hJissekiOhMetal202183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal202183() {
    hJissekiOhMetal202183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal202183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal202183Bytes());
  }

  public void setHJissekiOhMetal202183(long arg) {
  setHJissekiOhMetal202183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal203183Bytes() {
    return hJissekiOhMetal203183;
  }

  public void setHJissekiOhMetal203183Bytes(byte[] arg) {
    hJissekiOhMetal203183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal203183() {
    hJissekiOhMetal203183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal203183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal203183Bytes());
  }

  public void setHJissekiOhMetal203183(long arg) {
  setHJissekiOhMetal203183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhMetal204183Bytes() {
    return hJissekiOhMetal204183;
  }

  public void setHJissekiOhMetal204183Bytes(byte[] arg) {
    hJissekiOhMetal204183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhMetal204183() {
    hJissekiOhMetal204183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhMetal204183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhMetal204183Bytes());
  }

  public void setHJissekiOhMetal204183(long arg) {
  setHJissekiOhMetal204183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhWbs01183Bytes() {
    return hJissekiOhWbs01183;
  }

  public void setHJissekiOhWbs01183Bytes(byte[] arg) {
    hJissekiOhWbs01183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhWbs01183() {
    hJissekiOhWbs01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhWbs01183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhWbs01183Bytes());
  }

  public void setHJissekiOhWbs01183(long arg) {
  setHJissekiOhWbs01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhWbs02183Bytes() {
    return hJissekiOhWbs02183;
  }

  public void setHJissekiOhWbs02183Bytes(byte[] arg) {
    hJissekiOhWbs02183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhWbs02183() {
    hJissekiOhWbs02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhWbs02183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhWbs02183Bytes());
  }

  public void setHJissekiOhWbs02183(long arg) {
  setHJissekiOhWbs02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhWbs03183Bytes() {
    return hJissekiOhWbs03183;
  }

  public void setHJissekiOhWbs03183Bytes(byte[] arg) {
    hJissekiOhWbs03183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhWbs03183() {
    hJissekiOhWbs03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhWbs03183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhWbs03183Bytes());
  }

  public void setHJissekiOhWbs03183(long arg) {
  setHJissekiOhWbs03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhWbs04183Bytes() {
    return hJissekiOhWbs04183;
  }

  public void setHJissekiOhWbs04183Bytes(byte[] arg) {
    hJissekiOhWbs04183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhWbs04183() {
    hJissekiOhWbs04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhWbs04183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhWbs04183Bytes());
  }

  public void setHJissekiOhWbs04183(long arg) {
  setHJissekiOhWbs04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhShitaP01183Bytes() {
    return hJissekiOhShitaP01183;
  }

  public void setHJissekiOhShitaP01183Bytes(byte[] arg) {
    hJissekiOhShitaP01183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhShitaP01183() {
    hJissekiOhShitaP01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhShitaP01183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhShitaP01183Bytes());
  }

  public void setHJissekiOhShitaP01183(long arg) {
  setHJissekiOhShitaP01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhShitaP02183Bytes() {
    return hJissekiOhShitaP02183;
  }

  public void setHJissekiOhShitaP02183Bytes(byte[] arg) {
    hJissekiOhShitaP02183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhShitaP02183() {
    hJissekiOhShitaP02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhShitaP02183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhShitaP02183Bytes());
  }

  public void setHJissekiOhShitaP02183(long arg) {
  setHJissekiOhShitaP02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhShitaP03183Bytes() {
    return hJissekiOhShitaP03183;
  }

  public void setHJissekiOhShitaP03183Bytes(byte[] arg) {
    hJissekiOhShitaP03183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhShitaP03183() {
    hJissekiOhShitaP03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhShitaP03183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhShitaP03183Bytes());
  }

  public void setHJissekiOhShitaP03183(long arg) {
  setHJissekiOhShitaP03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhShitaP04183Bytes() {
    return hJissekiOhShitaP04183;
  }

  public void setHJissekiOhShitaP04183Bytes(byte[] arg) {
    hJissekiOhShitaP04183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhShitaP04183() {
    hJissekiOhShitaP04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhShitaP04183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhShitaP04183Bytes());
  }

  public void setHJissekiOhShitaP04183(long arg) {
  setHJissekiOhShitaP04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhNakaP01183Bytes() {
    return hJissekiOhNakaP01183;
  }

  public void setHJissekiOhNakaP01183Bytes(byte[] arg) {
    hJissekiOhNakaP01183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhNakaP01183() {
    hJissekiOhNakaP01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhNakaP01183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhNakaP01183Bytes());
  }

  public void setHJissekiOhNakaP01183(long arg) {
  setHJissekiOhNakaP01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhNakaP02183Bytes() {
    return hJissekiOhNakaP02183;
  }

  public void setHJissekiOhNakaP02183Bytes(byte[] arg) {
    hJissekiOhNakaP02183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhNakaP02183() {
    hJissekiOhNakaP02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhNakaP02183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhNakaP02183Bytes());
  }

  public void setHJissekiOhNakaP02183(long arg) {
  setHJissekiOhNakaP02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhNakaP03183Bytes() {
    return hJissekiOhNakaP03183;
  }

  public void setHJissekiOhNakaP03183Bytes(byte[] arg) {
    hJissekiOhNakaP03183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhNakaP03183() {
    hJissekiOhNakaP03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhNakaP03183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhNakaP03183Bytes());
  }

  public void setHJissekiOhNakaP03183(long arg) {
  setHJissekiOhNakaP03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhNakaP04183Bytes() {
    return hJissekiOhNakaP04183;
  }

  public void setHJissekiOhNakaP04183Bytes(byte[] arg) {
    hJissekiOhNakaP04183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhNakaP04183() {
    hJissekiOhNakaP04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhNakaP04183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhNakaP04183Bytes());
  }

  public void setHJissekiOhNakaP04183(long arg) {
  setHJissekiOhNakaP04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhUwaP01183Bytes() {
    return hJissekiOhUwaP01183;
  }

  public void setHJissekiOhUwaP01183Bytes(byte[] arg) {
    hJissekiOhUwaP01183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhUwaP01183() {
    hJissekiOhUwaP01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhUwaP01183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhUwaP01183Bytes());
  }

  public void setHJissekiOhUwaP01183(long arg) {
  setHJissekiOhUwaP01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhUwaP02183Bytes() {
    return hJissekiOhUwaP02183;
  }

  public void setHJissekiOhUwaP02183Bytes(byte[] arg) {
    hJissekiOhUwaP02183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhUwaP02183() {
    hJissekiOhUwaP02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhUwaP02183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhUwaP02183Bytes());
  }

  public void setHJissekiOhUwaP02183(long arg) {
  setHJissekiOhUwaP02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhUwaP03183Bytes() {
    return hJissekiOhUwaP03183;
  }

  public void setHJissekiOhUwaP03183Bytes(byte[] arg) {
    hJissekiOhUwaP03183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhUwaP03183() {
    hJissekiOhUwaP03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhUwaP03183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhUwaP03183Bytes());
  }

  public void setHJissekiOhUwaP03183(long arg) {
  setHJissekiOhUwaP03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhUwaP04183Bytes() {
    return hJissekiOhUwaP04183;
  }

  public void setHJissekiOhUwaP04183Bytes(byte[] arg) {
    hJissekiOhUwaP04183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhUwaP04183() {
    hJissekiOhUwaP04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhUwaP04183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhUwaP04183Bytes());
  }

  public void setHJissekiOhUwaP04183(long arg) {
  setHJissekiOhUwaP04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPbs01183Bytes() {
    return hJissekiOhPbs01183;
  }

  public void setHJissekiOhPbs01183Bytes(byte[] arg) {
    hJissekiOhPbs01183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPbs01183() {
    hJissekiOhPbs01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPbs01183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPbs01183Bytes());
  }

  public void setHJissekiOhPbs01183(long arg) {
  setHJissekiOhPbs01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPbs02183Bytes() {
    return hJissekiOhPbs02183;
  }

  public void setHJissekiOhPbs02183Bytes(byte[] arg) {
    hJissekiOhPbs02183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPbs02183() {
    hJissekiOhPbs02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPbs02183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPbs02183Bytes());
  }

  public void setHJissekiOhPbs02183(long arg) {
  setHJissekiOhPbs02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPbs03183Bytes() {
    return hJissekiOhPbs03183;
  }

  public void setHJissekiOhPbs03183Bytes(byte[] arg) {
    hJissekiOhPbs03183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPbs03183() {
    hJissekiOhPbs03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPbs03183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPbs03183Bytes());
  }

  public void setHJissekiOhPbs03183(long arg) {
  setHJissekiOhPbs03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPbs04183Bytes() {
    return hJissekiOhPbs04183;
  }

  public void setHJissekiOhPbs04183Bytes(byte[] arg) {
    hJissekiOhPbs04183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPbs04183() {
    hJissekiOhPbs04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPbs04183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPbs04183Bytes());
  }

  public void setHJissekiOhPbs04183(long arg) {
  setHJissekiOhPbs04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPreTrim01183Bytes() {
    return hJissekiOhPreTrim01183;
  }

  public void setHJissekiOhPreTrim01183Bytes(byte[] arg) {
    hJissekiOhPreTrim01183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPreTrim01183() {
    hJissekiOhPreTrim01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPreTrim01183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPreTrim01183Bytes());
  }

  public void setHJissekiOhPreTrim01183(long arg) {
  setHJissekiOhPreTrim01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPreTrim02183Bytes() {
    return hJissekiOhPreTrim02183;
  }

  public void setHJissekiOhPreTrim02183Bytes(byte[] arg) {
    hJissekiOhPreTrim02183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPreTrim02183() {
    hJissekiOhPreTrim02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPreTrim02183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPreTrim02183Bytes());
  }

  public void setHJissekiOhPreTrim02183(long arg) {
  setHJissekiOhPreTrim02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPreTrim03183Bytes() {
    return hJissekiOhPreTrim03183;
  }

  public void setHJissekiOhPreTrim03183Bytes(byte[] arg) {
    hJissekiOhPreTrim03183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPreTrim03183() {
    hJissekiOhPreTrim03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPreTrim03183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPreTrim03183Bytes());
  }

  public void setHJissekiOhPreTrim03183(long arg) {
  setHJissekiOhPreTrim03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJissekiOhPreTrim04183Bytes() {
    return hJissekiOhPreTrim04183;
  }

  public void setHJissekiOhPreTrim04183Bytes(byte[] arg) {
    hJissekiOhPreTrim04183 = ArrayUtils.clone(arg);
  }

  public void initHJissekiOhPreTrim04183() {
    hJissekiOhPreTrim04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJissekiOhPreTrim04183() {
    return CommonUtils.packedDecimalToNumber(getHJissekiOhPreTrim04183Bytes());
  }

  public void setHJissekiOhPreTrim04183(long arg) {
  setHJissekiOhPreTrim04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhTrim01183Bytes() {
    return hJikkekiOhTrim01183;
  }

  public void setHJikkekiOhTrim01183Bytes(byte[] arg) {
    hJikkekiOhTrim01183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhTrim01183() {
    hJikkekiOhTrim01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhTrim01183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhTrim01183Bytes());
  }

  public void setHJikkekiOhTrim01183(long arg) {
  setHJikkekiOhTrim01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhTrim02183Bytes() {
    return hJikkekiOhTrim02183;
  }

  public void setHJikkekiOhTrim02183Bytes(byte[] arg) {
    hJikkekiOhTrim02183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhTrim02183() {
    hJikkekiOhTrim02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhTrim02183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhTrim02183Bytes());
  }

  public void setHJikkekiOhTrim02183(long arg) {
  setHJikkekiOhTrim02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhTrim03183Bytes() {
    return hJikkekiOhTrim03183;
  }

  public void setHJikkekiOhTrim03183Bytes(byte[] arg) {
    hJikkekiOhTrim03183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhTrim03183() {
    hJikkekiOhTrim03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhTrim03183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhTrim03183Bytes());
  }

  public void setHJikkekiOhTrim03183(long arg) {
  setHJikkekiOhTrim03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhTrim04183Bytes() {
    return hJikkekiOhTrim04183;
  }

  public void setHJikkekiOhTrim04183Bytes(byte[] arg) {
    hJikkekiOhTrim04183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhTrim04183() {
    hJikkekiOhTrim04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhTrim04183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhTrim04183Bytes());
  }

  public void setHJikkekiOhTrim04183(long arg) {
  setHJikkekiOhTrim04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhFinal01183Bytes() {
    return hJikkekiOhFinal01183;
  }

  public void setHJikkekiOhFinal01183Bytes(byte[] arg) {
    hJikkekiOhFinal01183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhFinal01183() {
    hJikkekiOhFinal01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhFinal01183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhFinal01183Bytes());
  }

  public void setHJikkekiOhFinal01183(long arg) {
  setHJikkekiOhFinal01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhFinal02183Bytes() {
    return hJikkekiOhFinal02183;
  }

  public void setHJikkekiOhFinal02183Bytes(byte[] arg) {
    hJikkekiOhFinal02183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhFinal02183() {
    hJikkekiOhFinal02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhFinal02183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhFinal02183Bytes());
  }

  public void setHJikkekiOhFinal02183(long arg) {
  setHJikkekiOhFinal02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhFinal03183Bytes() {
    return hJikkekiOhFinal03183;
  }

  public void setHJikkekiOhFinal03183Bytes(byte[] arg) {
    hJikkekiOhFinal03183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhFinal03183() {
    hJikkekiOhFinal03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhFinal03183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhFinal03183Bytes());
  }

  public void setHJikkekiOhFinal03183(long arg) {
  setHJikkekiOhFinal03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhFinal04183Bytes() {
    return hJikkekiOhFinal04183;
  }

  public void setHJikkekiOhFinal04183Bytes(byte[] arg) {
    hJikkekiOhFinal04183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhFinal04183() {
    hJikkekiOhFinal04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhFinal04183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhFinal04183Bytes());
  }

  public void setHJikkekiOhFinal04183(long arg) {
  setHJikkekiOhFinal04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhKasou01183Bytes() {
    return hJikkekiOhKasou01183;
  }

  public void setHJikkekiOhKasou01183Bytes(byte[] arg) {
    hJikkekiOhKasou01183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhKasou01183() {
    hJikkekiOhKasou01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhKasou01183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhKasou01183Bytes());
  }

  public void setHJikkekiOhKasou01183(long arg) {
  setHJikkekiOhKasou01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhKasou02183Bytes() {
    return hJikkekiOhKasou02183;
  }

  public void setHJikkekiOhKasou02183Bytes(byte[] arg) {
    hJikkekiOhKasou02183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhKasou02183() {
    hJikkekiOhKasou02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhKasou02183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhKasou02183Bytes());
  }

  public void setHJikkekiOhKasou02183(long arg) {
  setHJikkekiOhKasou02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhKasou03183Bytes() {
    return hJikkekiOhKasou03183;
  }

  public void setHJikkekiOhKasou03183Bytes(byte[] arg) {
    hJikkekiOhKasou03183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhKasou03183() {
    hJikkekiOhKasou03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhKasou03183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhKasou03183Bytes());
  }

  public void setHJikkekiOhKasou03183(long arg) {
  setHJikkekiOhKasou03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhKasou04183Bytes() {
    return hJikkekiOhKasou04183;
  }

  public void setHJikkekiOhKasou04183Bytes(byte[] arg) {
    hJikkekiOhKasou04183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhKasou04183() {
    hJikkekiOhKasou04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhKasou04183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhKasou04183Bytes());
  }

  public void setHJikkekiOhKasou04183(long arg) {
  setHJikkekiOhKasou04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhDeliv01183Bytes() {
    return hJikkekiOhDeliv01183;
  }

  public void setHJikkekiOhDeliv01183Bytes(byte[] arg) {
    hJikkekiOhDeliv01183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhDeliv01183() {
    hJikkekiOhDeliv01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhDeliv01183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhDeliv01183Bytes());
  }

  public void setHJikkekiOhDeliv01183(long arg) {
  setHJikkekiOhDeliv01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhDeliv02183Bytes() {
    return hJikkekiOhDeliv02183;
  }

  public void setHJikkekiOhDeliv02183Bytes(byte[] arg) {
    hJikkekiOhDeliv02183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhDeliv02183() {
    hJikkekiOhDeliv02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhDeliv02183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhDeliv02183Bytes());
  }

  public void setHJikkekiOhDeliv02183(long arg) {
  setHJikkekiOhDeliv02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhDeliv03183Bytes() {
    return hJikkekiOhDeliv03183;
  }

  public void setHJikkekiOhDeliv03183Bytes(byte[] arg) {
    hJikkekiOhDeliv03183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhDeliv03183() {
    hJikkekiOhDeliv03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhDeliv03183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhDeliv03183Bytes());
  }

  public void setHJikkekiOhDeliv03183(long arg) {
  setHJikkekiOhDeliv03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhDeliv04183Bytes() {
    return hJikkekiOhDeliv04183;
  }

  public void setHJikkekiOhDeliv04183Bytes(byte[] arg) {
    hJikkekiOhDeliv04183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhDeliv04183() {
    hJikkekiOhDeliv04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhDeliv04183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhDeliv04183Bytes());
  }

  public void setHJikkekiOhDeliv04183(long arg) {
  setHJikkekiOhDeliv04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhUkeire01183Bytes() {
    return hJikkekiOhUkeire01183;
  }

  public void setHJikkekiOhUkeire01183Bytes(byte[] arg) {
    hJikkekiOhUkeire01183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhUkeire01183() {
    hJikkekiOhUkeire01183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhUkeire01183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhUkeire01183Bytes());
  }

  public void setHJikkekiOhUkeire01183(long arg) {
  setHJikkekiOhUkeire01183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhUkeire02183Bytes() {
    return hJikkekiOhUkeire02183;
  }

  public void setHJikkekiOhUkeire02183Bytes(byte[] arg) {
    hJikkekiOhUkeire02183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhUkeire02183() {
    hJikkekiOhUkeire02183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhUkeire02183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhUkeire02183Bytes());
  }

  public void setHJikkekiOhUkeire02183(long arg) {
  setHJikkekiOhUkeire02183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhUkeire03183Bytes() {
    return hJikkekiOhUkeire03183;
  }

  public void setHJikkekiOhUkeire03183Bytes(byte[] arg) {
    hJikkekiOhUkeire03183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhUkeire03183() {
    hJikkekiOhUkeire03183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhUkeire03183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhUkeire03183Bytes());
  }

  public void setHJikkekiOhUkeire03183(long arg) {
  setHJikkekiOhUkeire03183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHJikkekiOhUkeire04183Bytes() {
    return hJikkekiOhUkeire04183;
  }

  public void setHJikkekiOhUkeire04183Bytes(byte[] arg) {
    hJikkekiOhUkeire04183 = ArrayUtils.clone(arg);
  }

  public void initHJikkekiOhUkeire04183() {
    hJikkekiOhUkeire04183 =CommonUtils.numberToPackedDecimal(0, 3);
  }

  public long getHJikkekiOhUkeire04183() {
    return CommonUtils.packedDecimalToNumber(getHJikkekiOhUkeire04183Bytes());
  }

  public void setHJikkekiOhUkeire04183(long arg) {
  setHJikkekiOhUkeire04183Bytes(CommonUtils.numberToPackedDecimal(arg, 3));
  }

  public byte[] getHKeikakuOhMetal101183Bytes() {
    return hKeikakuOhMetal101183;
  }

  public void setHKeikakuOhMetal101183Bytes(byte[] arg) {
    hKeikakuOhMetal101183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal101183() {
    hKeikakuOhMetal101183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal101183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal101183Bytes());
  }

  public void setHKeikakuOhMetal101183(long arg) {
  setHKeikakuOhMetal101183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal102183Bytes() {
    return hKeikakuOhMetal102183;
  }

  public void setHKeikakuOhMetal102183Bytes(byte[] arg) {
    hKeikakuOhMetal102183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal102183() {
    hKeikakuOhMetal102183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal102183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal102183Bytes());
  }

  public void setHKeikakuOhMetal102183(long arg) {
  setHKeikakuOhMetal102183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal103183Bytes() {
    return hKeikakuOhMetal103183;
  }

  public void setHKeikakuOhMetal103183Bytes(byte[] arg) {
    hKeikakuOhMetal103183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal103183() {
    hKeikakuOhMetal103183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal103183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal103183Bytes());
  }

  public void setHKeikakuOhMetal103183(long arg) {
  setHKeikakuOhMetal103183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal104183Bytes() {
    return hKeikakuOhMetal104183;
  }

  public void setHKeikakuOhMetal104183Bytes(byte[] arg) {
    hKeikakuOhMetal104183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal104183() {
    hKeikakuOhMetal104183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal104183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal104183Bytes());
  }

  public void setHKeikakuOhMetal104183(long arg) {
  setHKeikakuOhMetal104183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal201183Bytes() {
    return hKeikakuOhMetal201183;
  }

  public void setHKeikakuOhMetal201183Bytes(byte[] arg) {
    hKeikakuOhMetal201183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal201183() {
    hKeikakuOhMetal201183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal201183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal201183Bytes());
  }

  public void setHKeikakuOhMetal201183(long arg) {
  setHKeikakuOhMetal201183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal202183Bytes() {
    return hKeikakuOhMetal202183;
  }

  public void setHKeikakuOhMetal202183Bytes(byte[] arg) {
    hKeikakuOhMetal202183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal202183() {
    hKeikakuOhMetal202183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal202183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal202183Bytes());
  }

  public void setHKeikakuOhMetal202183(long arg) {
  setHKeikakuOhMetal202183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal203183Bytes() {
    return hKeikakuOhMetal203183;
  }

  public void setHKeikakuOhMetal203183Bytes(byte[] arg) {
    hKeikakuOhMetal203183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal203183() {
    hKeikakuOhMetal203183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal203183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal203183Bytes());
  }

  public void setHKeikakuOhMetal203183(long arg) {
  setHKeikakuOhMetal203183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhMetal204183Bytes() {
    return hKeikakuOhMetal204183;
  }

  public void setHKeikakuOhMetal204183Bytes(byte[] arg) {
    hKeikakuOhMetal204183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhMetal204183() {
    hKeikakuOhMetal204183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhMetal204183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhMetal204183Bytes());
  }

  public void setHKeikakuOhMetal204183(long arg) {
  setHKeikakuOhMetal204183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhWbs01183Bytes() {
    return hKeikakuOhWbs01183;
  }

  public void setHKeikakuOhWbs01183Bytes(byte[] arg) {
    hKeikakuOhWbs01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhWbs01183() {
    hKeikakuOhWbs01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhWbs01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhWbs01183Bytes());
  }

  public void setHKeikakuOhWbs01183(long arg) {
  setHKeikakuOhWbs01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhWbs02183Bytes() {
    return hKeikakuOhWbs02183;
  }

  public void setHKeikakuOhWbs02183Bytes(byte[] arg) {
    hKeikakuOhWbs02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhWbs02183() {
    hKeikakuOhWbs02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhWbs02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhWbs02183Bytes());
  }

  public void setHKeikakuOhWbs02183(long arg) {
  setHKeikakuOhWbs02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhWbs03183Bytes() {
    return hKeikakuOhWbs03183;
  }

  public void setHKeikakuOhWbs03183Bytes(byte[] arg) {
    hKeikakuOhWbs03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhWbs03183() {
    hKeikakuOhWbs03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhWbs03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhWbs03183Bytes());
  }

  public void setHKeikakuOhWbs03183(long arg) {
  setHKeikakuOhWbs03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhWbs04183Bytes() {
    return hKeikakuOhWbs04183;
  }

  public void setHKeikakuOhWbs04183Bytes(byte[] arg) {
    hKeikakuOhWbs04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhWbs04183() {
    hKeikakuOhWbs04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhWbs04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhWbs04183Bytes());
  }

  public void setHKeikakuOhWbs04183(long arg) {
  setHKeikakuOhWbs04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhShitaP01183Bytes() {
    return hKeikakuOhShitaP01183;
  }

  public void setHKeikakuOhShitaP01183Bytes(byte[] arg) {
    hKeikakuOhShitaP01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhShitaP01183() {
    hKeikakuOhShitaP01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhShitaP01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhShitaP01183Bytes());
  }

  public void setHKeikakuOhShitaP01183(long arg) {
  setHKeikakuOhShitaP01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhShitaP02183Bytes() {
    return hKeikakuOhShitaP02183;
  }

  public void setHKeikakuOhShitaP02183Bytes(byte[] arg) {
    hKeikakuOhShitaP02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhShitaP02183() {
    hKeikakuOhShitaP02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhShitaP02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhShitaP02183Bytes());
  }

  public void setHKeikakuOhShitaP02183(long arg) {
  setHKeikakuOhShitaP02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhShitaP03183Bytes() {
    return hKeikakuOhShitaP03183;
  }

  public void setHKeikakuOhShitaP03183Bytes(byte[] arg) {
    hKeikakuOhShitaP03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhShitaP03183() {
    hKeikakuOhShitaP03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhShitaP03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhShitaP03183Bytes());
  }

  public void setHKeikakuOhShitaP03183(long arg) {
  setHKeikakuOhShitaP03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhShitaP04183Bytes() {
    return hKeikakuOhShitaP04183;
  }

  public void setHKeikakuOhShitaP04183Bytes(byte[] arg) {
    hKeikakuOhShitaP04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhShitaP04183() {
    hKeikakuOhShitaP04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhShitaP04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhShitaP04183Bytes());
  }

  public void setHKeikakuOhShitaP04183(long arg) {
  setHKeikakuOhShitaP04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhNakaP01183Bytes() {
    return hKeikakuOhNakaP01183;
  }

  public void setHKeikakuOhNakaP01183Bytes(byte[] arg) {
    hKeikakuOhNakaP01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhNakaP01183() {
    hKeikakuOhNakaP01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhNakaP01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhNakaP01183Bytes());
  }

  public void setHKeikakuOhNakaP01183(long arg) {
  setHKeikakuOhNakaP01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhNakaP02183Bytes() {
    return hKeikakuOhNakaP02183;
  }

  public void setHKeikakuOhNakaP02183Bytes(byte[] arg) {
    hKeikakuOhNakaP02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhNakaP02183() {
    hKeikakuOhNakaP02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhNakaP02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhNakaP02183Bytes());
  }

  public void setHKeikakuOhNakaP02183(long arg) {
  setHKeikakuOhNakaP02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhNakaP03183Bytes() {
    return hKeikakuOhNakaP03183;
  }

  public void setHKeikakuOhNakaP03183Bytes(byte[] arg) {
    hKeikakuOhNakaP03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhNakaP03183() {
    hKeikakuOhNakaP03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhNakaP03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhNakaP03183Bytes());
  }

  public void setHKeikakuOhNakaP03183(long arg) {
  setHKeikakuOhNakaP03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhNakaP04183Bytes() {
    return hKeikakuOhNakaP04183;
  }

  public void setHKeikakuOhNakaP04183Bytes(byte[] arg) {
    hKeikakuOhNakaP04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhNakaP04183() {
    hKeikakuOhNakaP04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhNakaP04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhNakaP04183Bytes());
  }

  public void setHKeikakuOhNakaP04183(long arg) {
  setHKeikakuOhNakaP04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUwaP01183Bytes() {
    return hKeikakuOhUwaP01183;
  }

  public void setHKeikakuOhUwaP01183Bytes(byte[] arg) {
    hKeikakuOhUwaP01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUwaP01183() {
    hKeikakuOhUwaP01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUwaP01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUwaP01183Bytes());
  }

  public void setHKeikakuOhUwaP01183(long arg) {
  setHKeikakuOhUwaP01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUwaP02183Bytes() {
    return hKeikakuOhUwaP02183;
  }

  public void setHKeikakuOhUwaP02183Bytes(byte[] arg) {
    hKeikakuOhUwaP02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUwaP02183() {
    hKeikakuOhUwaP02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUwaP02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUwaP02183Bytes());
  }

  public void setHKeikakuOhUwaP02183(long arg) {
  setHKeikakuOhUwaP02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUwaP03183Bytes() {
    return hKeikakuOhUwaP03183;
  }

  public void setHKeikakuOhUwaP03183Bytes(byte[] arg) {
    hKeikakuOhUwaP03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUwaP03183() {
    hKeikakuOhUwaP03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUwaP03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUwaP03183Bytes());
  }

  public void setHKeikakuOhUwaP03183(long arg) {
  setHKeikakuOhUwaP03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUwaP04183Bytes() {
    return hKeikakuOhUwaP04183;
  }

  public void setHKeikakuOhUwaP04183Bytes(byte[] arg) {
    hKeikakuOhUwaP04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUwaP04183() {
    hKeikakuOhUwaP04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUwaP04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUwaP04183Bytes());
  }

  public void setHKeikakuOhUwaP04183(long arg) {
  setHKeikakuOhUwaP04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPbs01183Bytes() {
    return hKeikakuOhPbs01183;
  }

  public void setHKeikakuOhPbs01183Bytes(byte[] arg) {
    hKeikakuOhPbs01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPbs01183() {
    hKeikakuOhPbs01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPbs01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPbs01183Bytes());
  }

  public void setHKeikakuOhPbs01183(long arg) {
  setHKeikakuOhPbs01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPbs02183Bytes() {
    return hKeikakuOhPbs02183;
  }

  public void setHKeikakuOhPbs02183Bytes(byte[] arg) {
    hKeikakuOhPbs02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPbs02183() {
    hKeikakuOhPbs02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPbs02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPbs02183Bytes());
  }

  public void setHKeikakuOhPbs02183(long arg) {
  setHKeikakuOhPbs02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPbs03183Bytes() {
    return hKeikakuOhPbs03183;
  }

  public void setHKeikakuOhPbs03183Bytes(byte[] arg) {
    hKeikakuOhPbs03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPbs03183() {
    hKeikakuOhPbs03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPbs03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPbs03183Bytes());
  }

  public void setHKeikakuOhPbs03183(long arg) {
  setHKeikakuOhPbs03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPbs04183Bytes() {
    return hKeikakuOhPbs04183;
  }

  public void setHKeikakuOhPbs04183Bytes(byte[] arg) {
    hKeikakuOhPbs04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPbs04183() {
    hKeikakuOhPbs04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPbs04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPbs04183Bytes());
  }

  public void setHKeikakuOhPbs04183(long arg) {
  setHKeikakuOhPbs04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPreTrim01183Bytes() {
    return hKeikakuOhPreTrim01183;
  }

  public void setHKeikakuOhPreTrim01183Bytes(byte[] arg) {
    hKeikakuOhPreTrim01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPreTrim01183() {
    hKeikakuOhPreTrim01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPreTrim01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPreTrim01183Bytes());
  }

  public void setHKeikakuOhPreTrim01183(long arg) {
  setHKeikakuOhPreTrim01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPreTrim02183Bytes() {
    return hKeikakuOhPreTrim02183;
  }

  public void setHKeikakuOhPreTrim02183Bytes(byte[] arg) {
    hKeikakuOhPreTrim02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPreTrim02183() {
    hKeikakuOhPreTrim02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPreTrim02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPreTrim02183Bytes());
  }

  public void setHKeikakuOhPreTrim02183(long arg) {
  setHKeikakuOhPreTrim02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPreTrim03183Bytes() {
    return hKeikakuOhPreTrim03183;
  }

  public void setHKeikakuOhPreTrim03183Bytes(byte[] arg) {
    hKeikakuOhPreTrim03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPreTrim03183() {
    hKeikakuOhPreTrim03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPreTrim03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPreTrim03183Bytes());
  }

  public void setHKeikakuOhPreTrim03183(long arg) {
  setHKeikakuOhPreTrim03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhPreTrim04183Bytes() {
    return hKeikakuOhPreTrim04183;
  }

  public void setHKeikakuOhPreTrim04183Bytes(byte[] arg) {
    hKeikakuOhPreTrim04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhPreTrim04183() {
    hKeikakuOhPreTrim04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhPreTrim04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhPreTrim04183Bytes());
  }

  public void setHKeikakuOhPreTrim04183(long arg) {
  setHKeikakuOhPreTrim04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhTrim01183Bytes() {
    return hKeikakuOhTrim01183;
  }

  public void setHKeikakuOhTrim01183Bytes(byte[] arg) {
    hKeikakuOhTrim01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhTrim01183() {
    hKeikakuOhTrim01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhTrim01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhTrim01183Bytes());
  }

  public void setHKeikakuOhTrim01183(long arg) {
  setHKeikakuOhTrim01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhTrim02183Bytes() {
    return hKeikakuOhTrim02183;
  }

  public void setHKeikakuOhTrim02183Bytes(byte[] arg) {
    hKeikakuOhTrim02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhTrim02183() {
    hKeikakuOhTrim02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhTrim02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhTrim02183Bytes());
  }

  public void setHKeikakuOhTrim02183(long arg) {
  setHKeikakuOhTrim02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhTrim03183Bytes() {
    return hKeikakuOhTrim03183;
  }

  public void setHKeikakuOhTrim03183Bytes(byte[] arg) {
    hKeikakuOhTrim03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhTrim03183() {
    hKeikakuOhTrim03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhTrim03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhTrim03183Bytes());
  }

  public void setHKeikakuOhTrim03183(long arg) {
  setHKeikakuOhTrim03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhTrim04183Bytes() {
    return hKeikakuOhTrim04183;
  }

  public void setHKeikakuOhTrim04183Bytes(byte[] arg) {
    hKeikakuOhTrim04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhTrim04183() {
    hKeikakuOhTrim04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhTrim04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhTrim04183Bytes());
  }

  public void setHKeikakuOhTrim04183(long arg) {
  setHKeikakuOhTrim04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhFinal01183Bytes() {
    return hKeikakuOhFinal01183;
  }

  public void setHKeikakuOhFinal01183Bytes(byte[] arg) {
    hKeikakuOhFinal01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhFinal01183() {
    hKeikakuOhFinal01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhFinal01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhFinal01183Bytes());
  }

  public void setHKeikakuOhFinal01183(long arg) {
  setHKeikakuOhFinal01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhFinal02183Bytes() {
    return hKeikakuOhFinal02183;
  }

  public void setHKeikakuOhFinal02183Bytes(byte[] arg) {
    hKeikakuOhFinal02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhFinal02183() {
    hKeikakuOhFinal02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhFinal02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhFinal02183Bytes());
  }

  public void setHKeikakuOhFinal02183(long arg) {
  setHKeikakuOhFinal02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhFinal03183Bytes() {
    return hKeikakuOhFinal03183;
  }

  public void setHKeikakuOhFinal03183Bytes(byte[] arg) {
    hKeikakuOhFinal03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhFinal03183() {
    hKeikakuOhFinal03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhFinal03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhFinal03183Bytes());
  }

  public void setHKeikakuOhFinal03183(long arg) {
  setHKeikakuOhFinal03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhFinal04183Bytes() {
    return hKeikakuOhFinal04183;
  }

  public void setHKeikakuOhFinal04183Bytes(byte[] arg) {
    hKeikakuOhFinal04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhFinal04183() {
    hKeikakuOhFinal04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhFinal04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhFinal04183Bytes());
  }

  public void setHKeikakuOhFinal04183(long arg) {
  setHKeikakuOhFinal04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhKasou01183Bytes() {
    return hKeikakuOhKasou01183;
  }

  public void setHKeikakuOhKasou01183Bytes(byte[] arg) {
    hKeikakuOhKasou01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhKasou01183() {
    hKeikakuOhKasou01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhKasou01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhKasou01183Bytes());
  }

  public void setHKeikakuOhKasou01183(long arg) {
  setHKeikakuOhKasou01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhKasou02183Bytes() {
    return hKeikakuOhKasou02183;
  }

  public void setHKeikakuOhKasou02183Bytes(byte[] arg) {
    hKeikakuOhKasou02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhKasou02183() {
    hKeikakuOhKasou02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhKasou02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhKasou02183Bytes());
  }

  public void setHKeikakuOhKasou02183(long arg) {
  setHKeikakuOhKasou02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhKasou03183Bytes() {
    return hKeikakuOhKasou03183;
  }

  public void setHKeikakuOhKasou03183Bytes(byte[] arg) {
    hKeikakuOhKasou03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhKasou03183() {
    hKeikakuOhKasou03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhKasou03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhKasou03183Bytes());
  }

  public void setHKeikakuOhKasou03183(long arg) {
  setHKeikakuOhKasou03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhKasou04183Bytes() {
    return hKeikakuOhKasou04183;
  }

  public void setHKeikakuOhKasou04183Bytes(byte[] arg) {
    hKeikakuOhKasou04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhKasou04183() {
    hKeikakuOhKasou04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhKasou04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhKasou04183Bytes());
  }

  public void setHKeikakuOhKasou04183(long arg) {
  setHKeikakuOhKasou04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhDeliv01183Bytes() {
    return hKeikakuOhDeliv01183;
  }

  public void setHKeikakuOhDeliv01183Bytes(byte[] arg) {
    hKeikakuOhDeliv01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhDeliv01183() {
    hKeikakuOhDeliv01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhDeliv01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhDeliv01183Bytes());
  }

  public void setHKeikakuOhDeliv01183(long arg) {
  setHKeikakuOhDeliv01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhDeliv02183Bytes() {
    return hKeikakuOhDeliv02183;
  }

  public void setHKeikakuOhDeliv02183Bytes(byte[] arg) {
    hKeikakuOhDeliv02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhDeliv02183() {
    hKeikakuOhDeliv02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhDeliv02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhDeliv02183Bytes());
  }

  public void setHKeikakuOhDeliv02183(long arg) {
  setHKeikakuOhDeliv02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhDeliv03183Bytes() {
    return hKeikakuOhDeliv03183;
  }

  public void setHKeikakuOhDeliv03183Bytes(byte[] arg) {
    hKeikakuOhDeliv03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhDeliv03183() {
    hKeikakuOhDeliv03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhDeliv03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhDeliv03183Bytes());
  }

  public void setHKeikakuOhDeliv03183(long arg) {
  setHKeikakuOhDeliv03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhDeliv04183Bytes() {
    return hKeikakuOhDeliv04183;
  }

  public void setHKeikakuOhDeliv04183Bytes(byte[] arg) {
    hKeikakuOhDeliv04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhDeliv04183() {
    hKeikakuOhDeliv04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhDeliv04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhDeliv04183Bytes());
  }

  public void setHKeikakuOhDeliv04183(long arg) {
  setHKeikakuOhDeliv04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUkeire01183Bytes() {
    return hKeikakuOhUkeire01183;
  }

  public void setHKeikakuOhUkeire01183Bytes(byte[] arg) {
    hKeikakuOhUkeire01183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUkeire01183() {
    hKeikakuOhUkeire01183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUkeire01183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUkeire01183Bytes());
  }

  public void setHKeikakuOhUkeire01183(long arg) {
  setHKeikakuOhUkeire01183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUkeire02183Bytes() {
    return hKeikakuOhUkeire02183;
  }

  public void setHKeikakuOhUkeire02183Bytes(byte[] arg) {
    hKeikakuOhUkeire02183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUkeire02183() {
    hKeikakuOhUkeire02183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUkeire02183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUkeire02183Bytes());
  }

  public void setHKeikakuOhUkeire02183(long arg) {
  setHKeikakuOhUkeire02183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUkeire03183Bytes() {
    return hKeikakuOhUkeire03183;
  }

  public void setHKeikakuOhUkeire03183Bytes(byte[] arg) {
    hKeikakuOhUkeire03183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUkeire03183() {
    hKeikakuOhUkeire03183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUkeire03183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUkeire03183Bytes());
  }

  public void setHKeikakuOhUkeire03183(long arg) {
  setHKeikakuOhUkeire03183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuOhUkeire04183Bytes() {
    return hKeikakuOhUkeire04183;
  }

  public void setHKeikakuOhUkeire04183Bytes(byte[] arg) {
    hKeikakuOhUkeire04183 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuOhUkeire04183() {
    hKeikakuOhUkeire04183 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuOhUkeire04183() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuOhUkeire04183Bytes());
  }

  public void setHKeikakuOhUkeire04183(long arg) {
  setHKeikakuOhUkeire04183Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShakei183RBytes() {
    return hShakei183R;
  }

  public void setHShakei183RBytes(byte[] arg) {
    hShakei183R = ArrayUtils.clone(arg);
  }

  public void initHShakei183R() {
    hShakei183R =CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));
  }

  public String getHShakei183R() {
  return CommonUtils.bytesToString(getHShakei183RBytes());
  }

  public void setHShakei183R(String arg) {
  final int trailing_length = 30 - arg.length();
  if (trailing_length > 0) {
  setHShakei183RBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShakei183RBytes(CommonUtils.stringToBytes(arg.substring(0, 30)));
  }
  }

  public byte[] getHShakeiCode36183Bytes() {
    return hShakeiCode36183;
  }

  public void setHShakeiCode36183Bytes(byte[] arg) {
    hShakeiCode36183 = ArrayUtils.clone(arg);
  }

  public void initHShakeiCode36183() {
    hShakeiCode36183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHShakeiCode36183() {
  return CommonUtils.bytesToString(getHShakeiCode36183Bytes());
  }

  public void setHShakeiCode36183(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHShakeiCode36183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShakeiCode36183Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHShakeiCode12183Bytes() {
    return hShakeiCode12183;
  }

  public void setHShakeiCode12183Bytes(byte[] arg) {
    hShakeiCode12183 = ArrayUtils.clone(arg);
  }

  public void initHShakeiCode12183() {
    hShakeiCode12183 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHShakeiCode12183() {
  return CommonUtils.bytesToString(getHShakeiCode12183Bytes());
  }

  public void setHShakeiCode12183(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHShakeiCode12183Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShakeiCode12183Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHostForJikei184Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(444);
        buffer.put(getHKoujouKubun184Bytes());
        buffer.put(getHShakeiCode184Bytes());
        buffer.put(getHLineKubun184Bytes());
        buffer.put(getHShift184Bytes());
        buffer.put(getHKouteiId184Bytes());
        buffer.put(getHKaishiJikoku184Bytes());
        buffer.put(getHJissekiKaishiIzen184Bytes());
        buffer.put(getHJissekiHhTbl184Bytes());
        buffer.put(getHJisseki12hIkou184Bytes());
        buffer.put(getHKeikakuKaishiIzen184Bytes());
        buffer.put(getHKeikakuHhTbl184Bytes());
        buffer.put(getHKeikaku12hIkou184Bytes());
        buffer.put(getHJikei184RBytes());
    return buffer.array();
  }

  public void setHostForJikei184Bytes(byte[] arg) {
        setHKoujouKubun184Bytes(ArrayUtils.subarray(arg, 0, 1));
        setHShakeiCode184Bytes(ArrayUtils.subarray(arg, 1, 7));
        setHLineKubun184Bytes(ArrayUtils.subarray(arg, 7, 11));
        setHShift184Bytes(ArrayUtils.subarray(arg, 11, 18));
        setHKouteiId184Bytes(ArrayUtils.subarray(arg, 18, 20));
        setHKaishiJikoku184Bytes(ArrayUtils.subarray(arg, 20, 22));
        setHJissekiKaishiIzen184Bytes(ArrayUtils.subarray(arg, 22, 24));
        setHJissekiHhTbl184Bytes(ArrayUtils.subarray(arg, 24, 216));
        setHJisseki12hIkou184Bytes(ArrayUtils.subarray(arg, 216, 218));
        setHKeikakuKaishiIzen184Bytes(ArrayUtils.subarray(arg, 218, 220));
        setHKeikakuHhTbl184Bytes(ArrayUtils.subarray(arg, 220, 412));
        setHKeikaku12hIkou184Bytes(ArrayUtils.subarray(arg, 412, 414));
        setHJikei184RBytes(ArrayUtils.subarray(arg, 414, 444));
  }

  public void initHostForJikei184() {
        initHKoujouKubun184();
        initHShakeiCode184();
        initHLineKubun184();
        initHShift184();
        initHKouteiId184();
        initHKaishiJikoku184();
        initHJissekiKaishiIzen184();
        initHJissekiHhTbl184();
        initHJisseki12hIkou184();
        initHKeikakuKaishiIzen184();
        initHKeikakuHhTbl184();
        initHKeikaku12hIkou184();
        initHJikei184R();
  }

  public String getHostForJikei184() {
  return CommonUtils.bytesToString(getHostForJikei184Bytes());
  }

  public void setHostForJikei184(String arg) {
  final int trailing_length = 444 - arg.length();
  if (trailing_length > 0) {
  setHostForJikei184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHostForJikei184Bytes(CommonUtils.stringToBytes(arg.substring(0, 444)));
  }
  }

  public byte[] getHKoujouKubun184Bytes() {
    return hKoujouKubun184;
  }

  public void setHKoujouKubun184Bytes(byte[] arg) {
    hKoujouKubun184 = ArrayUtils.clone(arg);
  }

  public void initHKoujouKubun184() {
    hKoujouKubun184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKoujouKubun184() {
  return CommonUtils.bytesToString(getHKoujouKubun184Bytes());
  }

  public void setHKoujouKubun184(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKoujouKubun184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouKubun184Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHShakeiCode184Bytes() {
    return hShakeiCode184;
  }

  public void setHShakeiCode184Bytes(byte[] arg) {
    hShakeiCode184 = ArrayUtils.clone(arg);
  }

  public void initHShakeiCode184() {
    hShakeiCode184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHShakeiCode184() {
  return CommonUtils.bytesToString(getHShakeiCode184Bytes());
  }

  public void setHShakeiCode184(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHShakeiCode184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShakeiCode184Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHLineKubun184Bytes() {
    return hLineKubun184;
  }

  public void setHLineKubun184Bytes(byte[] arg) {
    hLineKubun184 = ArrayUtils.clone(arg);
  }

  public void initHLineKubun184() {
    hLineKubun184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHLineKubun184() {
  return CommonUtils.bytesToString(getHLineKubun184Bytes());
  }

  public void setHLineKubun184(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHLineKubun184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHLineKubun184Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHShift184Bytes() {
    return hShift184;
  }

  public void setHShift184Bytes(byte[] arg) {
    hShift184 = ArrayUtils.clone(arg);
  }

  public void initHShift184() {
    hShift184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));
  }

  public String getHShift184() {
  return CommonUtils.bytesToString(getHShift184Bytes());
  }

  public void setHShift184(String arg) {
  final int trailing_length = 7 - arg.length();
  if (trailing_length > 0) {
  setHShift184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHShift184Bytes(CommonUtils.stringToBytes(arg.substring(0, 7)));
  }
  }

  public byte[] getHKouteiId184Bytes() {
    return hKouteiId184;
  }

  public void setHKouteiId184Bytes(byte[] arg) {
    hKouteiId184 = ArrayUtils.clone(arg);
  }

  public void initHKouteiId184() {
    hKouteiId184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHKouteiId184() {
  return CommonUtils.bytesToString(getHKouteiId184Bytes());
  }

  public void setHKouteiId184(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHKouteiId184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKouteiId184Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHKaishiJikoku184Bytes() {
    return hKaishiJikoku184;
  }

  public void setHKaishiJikoku184Bytes(byte[] arg) {
    hKaishiJikoku184 = ArrayUtils.clone(arg);
  }

  public void initHKaishiJikoku184() {
    hKaishiJikoku184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHKaishiJikoku184() {
  return CommonUtils.bytesToString(getHKaishiJikoku184Bytes());
  }

  public void setHKaishiJikoku184(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHKaishiJikoku184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKaishiJikoku184Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHJissekiKaishiIzen184Bytes() {
    return hJissekiKaishiIzen184;
  }

  public void setHJissekiKaishiIzen184Bytes(byte[] arg) {
    hJissekiKaishiIzen184 = ArrayUtils.clone(arg);
  }

  public void initHJissekiKaishiIzen184() {
    hJissekiKaishiIzen184 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHJissekiKaishiIzen184() {
    return CommonUtils.packedDecimalToNumber(getHJissekiKaishiIzen184Bytes());
  }

  public void setHJissekiKaishiIzen184(long arg) {
  setHJissekiKaishiIzen184Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHJissekiHhTbl184Bytes() {
    return hJissekiHhTbl184;
  }

  public void setHJissekiHhTbl184Bytes(byte[] arg) {
    hJissekiHhTbl184 = ArrayUtils.clone(arg);
  }

  public void initHJissekiHhTbl184() {
    hJissekiHhTbl184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 192));
  }

  public String getHJissekiHhTbl184() {
  return CommonUtils.bytesToString(getHJissekiHhTbl184Bytes());
  }

  public void setHJissekiHhTbl184(String arg) {
  final int trailing_length = 192 - arg.length();
  if (trailing_length > 0) {
  setHJissekiHhTbl184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHJissekiHhTbl184Bytes(CommonUtils.stringToBytes(arg.substring(0, 192)));
  }
  }

  public byte[] getHJisseki12hIkou184Bytes() {
    return hJisseki12hIkou184;
  }

  public void setHJisseki12hIkou184Bytes(byte[] arg) {
    hJisseki12hIkou184 = ArrayUtils.clone(arg);
  }

  public void initHJisseki12hIkou184() {
    hJisseki12hIkou184 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHJisseki12hIkou184() {
    return CommonUtils.packedDecimalToNumber(getHJisseki12hIkou184Bytes());
  }

  public void setHJisseki12hIkou184(long arg) {
  setHJisseki12hIkou184Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuKaishiIzen184Bytes() {
    return hKeikakuKaishiIzen184;
  }

  public void setHKeikakuKaishiIzen184Bytes(byte[] arg) {
    hKeikakuKaishiIzen184 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuKaishiIzen184() {
    hKeikakuKaishiIzen184 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikakuKaishiIzen184() {
    return CommonUtils.packedDecimalToNumber(getHKeikakuKaishiIzen184Bytes());
  }

  public void setHKeikakuKaishiIzen184(long arg) {
  setHKeikakuKaishiIzen184Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHKeikakuHhTbl184Bytes() {
    return hKeikakuHhTbl184;
  }

  public void setHKeikakuHhTbl184Bytes(byte[] arg) {
    hKeikakuHhTbl184 = ArrayUtils.clone(arg);
  }

  public void initHKeikakuHhTbl184() {
    hKeikakuHhTbl184 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 192));
  }

  public String getHKeikakuHhTbl184() {
  return CommonUtils.bytesToString(getHKeikakuHhTbl184Bytes());
  }

  public void setHKeikakuHhTbl184(String arg) {
  final int trailing_length = 192 - arg.length();
  if (trailing_length > 0) {
  setHKeikakuHhTbl184Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKeikakuHhTbl184Bytes(CommonUtils.stringToBytes(arg.substring(0, 192)));
  }
  }

  public byte[] getHKeikaku12hIkou184Bytes() {
    return hKeikaku12hIkou184;
  }

  public void setHKeikaku12hIkou184Bytes(byte[] arg) {
    hKeikaku12hIkou184 = ArrayUtils.clone(arg);
  }

  public void initHKeikaku12hIkou184() {
    hKeikaku12hIkou184 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHKeikaku12hIkou184() {
    return CommonUtils.packedDecimalToNumber(getHKeikaku12hIkou184Bytes());
  }

  public void setHKeikaku12hIkou184(long arg) {
  setHKeikaku12hIkou184Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHJikei184RBytes() {
    return hJikei184R;
  }

  public void setHJikei184RBytes(byte[] arg) {
    hJikei184R = ArrayUtils.clone(arg);
  }

  public void initHJikei184R() {
    hJikei184R =CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));
  }

  public String getHJikei184R() {
  return CommonUtils.bytesToString(getHJikei184RBytes());
  }

  public void setHJikei184R(String arg) {
  final int trailing_length = 30 - arg.length();
  if (trailing_length > 0) {
  setHJikei184RBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHJikei184RBytes(CommonUtils.stringToBytes(arg.substring(0, 30)));
  }
  }

  public byte[] getHostForKoutei185Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(184);
        buffer.put(getHKoujouKubunFileId185Bytes());
        buffer.put(getHActGroup185Bytes());
        buffer.put(getHActLineCod185Bytes());
        buffer.put(getHYyyymm185Bytes());
        buffer.put(getHKouteiKeikakuId185Bytes());
        buffer.put(getHShiftDaisu01185Bytes());
        buffer.put(getHShiftDaisu02185Bytes());
        buffer.put(getHShiftDaisu03185Bytes());
        buffer.put(getHShiftDaisu04185Bytes());
        buffer.put(getHShiftDaisu05185Bytes());
        buffer.put(getHShiftDaisu06185Bytes());
        buffer.put(getHShiftDaisu07185Bytes());
        buffer.put(getHShiftDaisu08185Bytes());
        buffer.put(getHShiftDaisu09185Bytes());
        buffer.put(getHShiftDaisu10185Bytes());
        buffer.put(getHShiftDaisu11185Bytes());
        buffer.put(getHShiftDaisu12185Bytes());
        buffer.put(getHShiftDaisu13185Bytes());
        buffer.put(getHShiftDaisu14185Bytes());
        buffer.put(getHShiftDaisu15185Bytes());
        buffer.put(getHShiftDaisu16185Bytes());
        buffer.put(getHShiftDaisu17185Bytes());
        buffer.put(getHShiftDaisu18185Bytes());
        buffer.put(getHShiftDaisu19185Bytes());
        buffer.put(getHShiftDaisu20185Bytes());
        buffer.put(getHShiftDaisu21185Bytes());
        buffer.put(getHShiftDaisu22185Bytes());
        buffer.put(getHShiftDaisu23185Bytes());
        buffer.put(getHShiftDaisu24185Bytes());
        buffer.put(getHShiftDaisu25185Bytes());
        buffer.put(getHShiftDaisu26185Bytes());
        buffer.put(getHShiftDaisu27185Bytes());
        buffer.put(getHShiftDaisu28185Bytes());
        buffer.put(getHShiftDaisu29185Bytes());
        buffer.put(getHShiftDaisu30185Bytes());
        buffer.put(getHShiftDaisu31185Bytes());
        buffer.put(getHShiftDaisu32185Bytes());
        buffer.put(getHShiftDaisu33185Bytes());
        buffer.put(getHShiftDaisu34185Bytes());
        buffer.put(getHShiftDaisu35185Bytes());
        buffer.put(getHShiftDaisu36185Bytes());
        buffer.put(getHShiftDaisu37185Bytes());
        buffer.put(getHShiftDaisu38185Bytes());
        buffer.put(getHShiftDaisu39185Bytes());
        buffer.put(getHShiftDaisu40185Bytes());
        buffer.put(getHShiftDaisu41185Bytes());
        buffer.put(getHShiftDaisu42185Bytes());
        buffer.put(getHShiftDaisu43185Bytes());
        buffer.put(getHShiftDaisu44185Bytes());
        buffer.put(getHShiftDaisu45185Bytes());
        buffer.put(getHShiftDaisu46185Bytes());
        buffer.put(getHShiftDaisu47185Bytes());
        buffer.put(getHShiftDaisu48185Bytes());
        buffer.put(getHShiftDaisu49185Bytes());
        buffer.put(getHShiftDaisu50185Bytes());
        buffer.put(getHShiftDaisu51185Bytes());
        buffer.put(getHShiftDaisu52185Bytes());
        buffer.put(getHShiftDaisu53185Bytes());
        buffer.put(getHShiftDaisu54185Bytes());
        buffer.put(getHShiftDaisu55185Bytes());
        buffer.put(getHShiftDaisu56185Bytes());
        buffer.put(getHShiftDaisu57185Bytes());
        buffer.put(getHShiftDaisu58185Bytes());
        buffer.put(getHShiftDaisu59185Bytes());
        buffer.put(getHShiftDaisu60185Bytes());
        buffer.put(getHShiftDaisu61185Bytes());
        buffer.put(getHShiftDaisu62185Bytes());
        buffer.put(getHShiftDaisu63185Bytes());
        buffer.put(getHTimeStamp185Bytes());
        buffer.put(getHKoutei185RBytes());
    return buffer.array();
  }

  public void setHostForKoutei185Bytes(byte[] arg) {
        setHKoujouKubunFileId185Bytes(ArrayUtils.subarray(arg, 0, 1));
        setHActGroup185Bytes(ArrayUtils.subarray(arg, 1, 2));
        setHActLineCod185Bytes(ArrayUtils.subarray(arg, 2, 8));
        setHYyyymm185Bytes(ArrayUtils.subarray(arg, 8, 14));
        setHKouteiKeikakuId185Bytes(ArrayUtils.subarray(arg, 14, 16));
        setHShiftDaisu01185Bytes(ArrayUtils.subarray(arg, 16, 18));
        setHShiftDaisu02185Bytes(ArrayUtils.subarray(arg, 18, 20));
        setHShiftDaisu03185Bytes(ArrayUtils.subarray(arg, 20, 22));
        setHShiftDaisu04185Bytes(ArrayUtils.subarray(arg, 22, 24));
        setHShiftDaisu05185Bytes(ArrayUtils.subarray(arg, 24, 26));
        setHShiftDaisu06185Bytes(ArrayUtils.subarray(arg, 26, 28));
        setHShiftDaisu07185Bytes(ArrayUtils.subarray(arg, 28, 30));
        setHShiftDaisu08185Bytes(ArrayUtils.subarray(arg, 30, 32));
        setHShiftDaisu09185Bytes(ArrayUtils.subarray(arg, 32, 34));
        setHShiftDaisu10185Bytes(ArrayUtils.subarray(arg, 34, 36));
        setHShiftDaisu11185Bytes(ArrayUtils.subarray(arg, 36, 38));
        setHShiftDaisu12185Bytes(ArrayUtils.subarray(arg, 38, 40));
        setHShiftDaisu13185Bytes(ArrayUtils.subarray(arg, 40, 42));
        setHShiftDaisu14185Bytes(ArrayUtils.subarray(arg, 42, 44));
        setHShiftDaisu15185Bytes(ArrayUtils.subarray(arg, 44, 46));
        setHShiftDaisu16185Bytes(ArrayUtils.subarray(arg, 46, 48));
        setHShiftDaisu17185Bytes(ArrayUtils.subarray(arg, 48, 50));
        setHShiftDaisu18185Bytes(ArrayUtils.subarray(arg, 50, 52));
        setHShiftDaisu19185Bytes(ArrayUtils.subarray(arg, 52, 54));
        setHShiftDaisu20185Bytes(ArrayUtils.subarray(arg, 54, 56));
        setHShiftDaisu21185Bytes(ArrayUtils.subarray(arg, 56, 58));
        setHShiftDaisu22185Bytes(ArrayUtils.subarray(arg, 58, 60));
        setHShiftDaisu23185Bytes(ArrayUtils.subarray(arg, 60, 62));
        setHShiftDaisu24185Bytes(ArrayUtils.subarray(arg, 62, 64));
        setHShiftDaisu25185Bytes(ArrayUtils.subarray(arg, 64, 66));
        setHShiftDaisu26185Bytes(ArrayUtils.subarray(arg, 66, 68));
        setHShiftDaisu27185Bytes(ArrayUtils.subarray(arg, 68, 70));
        setHShiftDaisu28185Bytes(ArrayUtils.subarray(arg, 70, 72));
        setHShiftDaisu29185Bytes(ArrayUtils.subarray(arg, 72, 74));
        setHShiftDaisu30185Bytes(ArrayUtils.subarray(arg, 74, 76));
        setHShiftDaisu31185Bytes(ArrayUtils.subarray(arg, 76, 78));
        setHShiftDaisu32185Bytes(ArrayUtils.subarray(arg, 78, 80));
        setHShiftDaisu33185Bytes(ArrayUtils.subarray(arg, 80, 82));
        setHShiftDaisu34185Bytes(ArrayUtils.subarray(arg, 82, 84));
        setHShiftDaisu35185Bytes(ArrayUtils.subarray(arg, 84, 86));
        setHShiftDaisu36185Bytes(ArrayUtils.subarray(arg, 86, 88));
        setHShiftDaisu37185Bytes(ArrayUtils.subarray(arg, 88, 90));
        setHShiftDaisu38185Bytes(ArrayUtils.subarray(arg, 90, 92));
        setHShiftDaisu39185Bytes(ArrayUtils.subarray(arg, 92, 94));
        setHShiftDaisu40185Bytes(ArrayUtils.subarray(arg, 94, 96));
        setHShiftDaisu41185Bytes(ArrayUtils.subarray(arg, 96, 98));
        setHShiftDaisu42185Bytes(ArrayUtils.subarray(arg, 98, 100));
        setHShiftDaisu43185Bytes(ArrayUtils.subarray(arg, 100, 102));
        setHShiftDaisu44185Bytes(ArrayUtils.subarray(arg, 102, 104));
        setHShiftDaisu45185Bytes(ArrayUtils.subarray(arg, 104, 106));
        setHShiftDaisu46185Bytes(ArrayUtils.subarray(arg, 106, 108));
        setHShiftDaisu47185Bytes(ArrayUtils.subarray(arg, 108, 110));
        setHShiftDaisu48185Bytes(ArrayUtils.subarray(arg, 110, 112));
        setHShiftDaisu49185Bytes(ArrayUtils.subarray(arg, 112, 114));
        setHShiftDaisu50185Bytes(ArrayUtils.subarray(arg, 114, 116));
        setHShiftDaisu51185Bytes(ArrayUtils.subarray(arg, 116, 118));
        setHShiftDaisu52185Bytes(ArrayUtils.subarray(arg, 118, 120));
        setHShiftDaisu53185Bytes(ArrayUtils.subarray(arg, 120, 122));
        setHShiftDaisu54185Bytes(ArrayUtils.subarray(arg, 122, 124));
        setHShiftDaisu55185Bytes(ArrayUtils.subarray(arg, 124, 126));
        setHShiftDaisu56185Bytes(ArrayUtils.subarray(arg, 126, 128));
        setHShiftDaisu57185Bytes(ArrayUtils.subarray(arg, 128, 130));
        setHShiftDaisu58185Bytes(ArrayUtils.subarray(arg, 130, 132));
        setHShiftDaisu59185Bytes(ArrayUtils.subarray(arg, 132, 134));
        setHShiftDaisu60185Bytes(ArrayUtils.subarray(arg, 134, 136));
        setHShiftDaisu61185Bytes(ArrayUtils.subarray(arg, 136, 138));
        setHShiftDaisu62185Bytes(ArrayUtils.subarray(arg, 138, 140));
        setHShiftDaisu63185Bytes(ArrayUtils.subarray(arg, 140, 142));
        setHTimeStamp185Bytes(ArrayUtils.subarray(arg, 142, 154));
        setHKoutei185RBytes(ArrayUtils.subarray(arg, 154, 184));
  }

  public void initHostForKoutei185() {
        initHKoujouKubunFileId185();
        initHActGroup185();
        initHActLineCod185();
        initHYyyymm185();
        initHKouteiKeikakuId185();
        initHShiftDaisu01185();
        initHShiftDaisu02185();
        initHShiftDaisu03185();
        initHShiftDaisu04185();
        initHShiftDaisu05185();
        initHShiftDaisu06185();
        initHShiftDaisu07185();
        initHShiftDaisu08185();
        initHShiftDaisu09185();
        initHShiftDaisu10185();
        initHShiftDaisu11185();
        initHShiftDaisu12185();
        initHShiftDaisu13185();
        initHShiftDaisu14185();
        initHShiftDaisu15185();
        initHShiftDaisu16185();
        initHShiftDaisu17185();
        initHShiftDaisu18185();
        initHShiftDaisu19185();
        initHShiftDaisu20185();
        initHShiftDaisu21185();
        initHShiftDaisu22185();
        initHShiftDaisu23185();
        initHShiftDaisu24185();
        initHShiftDaisu25185();
        initHShiftDaisu26185();
        initHShiftDaisu27185();
        initHShiftDaisu28185();
        initHShiftDaisu29185();
        initHShiftDaisu30185();
        initHShiftDaisu31185();
        initHShiftDaisu32185();
        initHShiftDaisu33185();
        initHShiftDaisu34185();
        initHShiftDaisu35185();
        initHShiftDaisu36185();
        initHShiftDaisu37185();
        initHShiftDaisu38185();
        initHShiftDaisu39185();
        initHShiftDaisu40185();
        initHShiftDaisu41185();
        initHShiftDaisu42185();
        initHShiftDaisu43185();
        initHShiftDaisu44185();
        initHShiftDaisu45185();
        initHShiftDaisu46185();
        initHShiftDaisu47185();
        initHShiftDaisu48185();
        initHShiftDaisu49185();
        initHShiftDaisu50185();
        initHShiftDaisu51185();
        initHShiftDaisu52185();
        initHShiftDaisu53185();
        initHShiftDaisu54185();
        initHShiftDaisu55185();
        initHShiftDaisu56185();
        initHShiftDaisu57185();
        initHShiftDaisu58185();
        initHShiftDaisu59185();
        initHShiftDaisu60185();
        initHShiftDaisu61185();
        initHShiftDaisu62185();
        initHShiftDaisu63185();
        initHTimeStamp185();
        initHKoutei185R();
  }

  public String getHostForKoutei185() {
  return CommonUtils.bytesToString(getHostForKoutei185Bytes());
  }

  public void setHostForKoutei185(String arg) {
  final int trailing_length = 184 - arg.length();
  if (trailing_length > 0) {
  setHostForKoutei185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHostForKoutei185Bytes(CommonUtils.stringToBytes(arg.substring(0, 184)));
  }
  }

  public byte[] getHKoujouKubunFileId185Bytes() {
    return hKoujouKubunFileId185;
  }

  public void setHKoujouKubunFileId185Bytes(byte[] arg) {
    hKoujouKubunFileId185 = ArrayUtils.clone(arg);
  }

  public void initHKoujouKubunFileId185() {
    hKoujouKubunFileId185 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKoujouKubunFileId185() {
  return CommonUtils.bytesToString(getHKoujouKubunFileId185Bytes());
  }

  public void setHKoujouKubunFileId185(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKoujouKubunFileId185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouKubunFileId185Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHActGroup185Bytes() {
    return hActGroup185;
  }

  public void setHActGroup185Bytes(byte[] arg) {
    hActGroup185 = ArrayUtils.clone(arg);
  }

  public void initHActGroup185() {
    hActGroup185 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHActGroup185() {
  return CommonUtils.bytesToString(getHActGroup185Bytes());
  }

  public void setHActGroup185(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHActGroup185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHActGroup185Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHActLineCod185Bytes() {
    return hActLineCod185;
  }

  public void setHActLineCod185Bytes(byte[] arg) {
    hActLineCod185 = ArrayUtils.clone(arg);
  }

  public void initHActLineCod185() {
    hActLineCod185 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHActLineCod185() {
  return CommonUtils.bytesToString(getHActLineCod185Bytes());
  }

  public void setHActLineCod185(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHActLineCod185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHActLineCod185Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHYyyymm185Bytes() {
    return hYyyymm185;
  }

  public void setHYyyymm185Bytes(byte[] arg) {
    hYyyymm185 = ArrayUtils.clone(arg);
  }

  public void initHYyyymm185() {
    hYyyymm185 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHYyyymm185() {
  return CommonUtils.bytesToString(getHYyyymm185Bytes());
  }

  public void setHYyyymm185(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHYyyymm185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHYyyymm185Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHKouteiKeikakuId185Bytes() {
    return hKouteiKeikakuId185;
  }

  public void setHKouteiKeikakuId185Bytes(byte[] arg) {
    hKouteiKeikakuId185 = ArrayUtils.clone(arg);
  }

  public void initHKouteiKeikakuId185() {
    hKouteiKeikakuId185 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 2));
  }

  public String getHKouteiKeikakuId185() {
  return CommonUtils.bytesToString(getHKouteiKeikakuId185Bytes());
  }

  public void setHKouteiKeikakuId185(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setHKouteiKeikakuId185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKouteiKeikakuId185Bytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getHShiftDaisu01185Bytes() {
    return hShiftDaisu01185;
  }

  public void setHShiftDaisu01185Bytes(byte[] arg) {
    hShiftDaisu01185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu01185() {
    hShiftDaisu01185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu01185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu01185Bytes());
  }

  public void setHShiftDaisu01185(long arg) {
  setHShiftDaisu01185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu02185Bytes() {
    return hShiftDaisu02185;
  }

  public void setHShiftDaisu02185Bytes(byte[] arg) {
    hShiftDaisu02185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu02185() {
    hShiftDaisu02185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu02185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu02185Bytes());
  }

  public void setHShiftDaisu02185(long arg) {
  setHShiftDaisu02185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu03185Bytes() {
    return hShiftDaisu03185;
  }

  public void setHShiftDaisu03185Bytes(byte[] arg) {
    hShiftDaisu03185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu03185() {
    hShiftDaisu03185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu03185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu03185Bytes());
  }

  public void setHShiftDaisu03185(long arg) {
  setHShiftDaisu03185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu04185Bytes() {
    return hShiftDaisu04185;
  }

  public void setHShiftDaisu04185Bytes(byte[] arg) {
    hShiftDaisu04185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu04185() {
    hShiftDaisu04185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu04185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu04185Bytes());
  }

  public void setHShiftDaisu04185(long arg) {
  setHShiftDaisu04185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu05185Bytes() {
    return hShiftDaisu05185;
  }

  public void setHShiftDaisu05185Bytes(byte[] arg) {
    hShiftDaisu05185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu05185() {
    hShiftDaisu05185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu05185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu05185Bytes());
  }

  public void setHShiftDaisu05185(long arg) {
  setHShiftDaisu05185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu06185Bytes() {
    return hShiftDaisu06185;
  }

  public void setHShiftDaisu06185Bytes(byte[] arg) {
    hShiftDaisu06185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu06185() {
    hShiftDaisu06185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu06185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu06185Bytes());
  }

  public void setHShiftDaisu06185(long arg) {
  setHShiftDaisu06185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu07185Bytes() {
    return hShiftDaisu07185;
  }

  public void setHShiftDaisu07185Bytes(byte[] arg) {
    hShiftDaisu07185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu07185() {
    hShiftDaisu07185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu07185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu07185Bytes());
  }

  public void setHShiftDaisu07185(long arg) {
  setHShiftDaisu07185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu08185Bytes() {
    return hShiftDaisu08185;
  }

  public void setHShiftDaisu08185Bytes(byte[] arg) {
    hShiftDaisu08185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu08185() {
    hShiftDaisu08185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu08185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu08185Bytes());
  }

  public void setHShiftDaisu08185(long arg) {
  setHShiftDaisu08185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu09185Bytes() {
    return hShiftDaisu09185;
  }

  public void setHShiftDaisu09185Bytes(byte[] arg) {
    hShiftDaisu09185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu09185() {
    hShiftDaisu09185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu09185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu09185Bytes());
  }

  public void setHShiftDaisu09185(long arg) {
  setHShiftDaisu09185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu10185Bytes() {
    return hShiftDaisu10185;
  }

  public void setHShiftDaisu10185Bytes(byte[] arg) {
    hShiftDaisu10185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu10185() {
    hShiftDaisu10185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu10185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu10185Bytes());
  }

  public void setHShiftDaisu10185(long arg) {
  setHShiftDaisu10185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu11185Bytes() {
    return hShiftDaisu11185;
  }

  public void setHShiftDaisu11185Bytes(byte[] arg) {
    hShiftDaisu11185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu11185() {
    hShiftDaisu11185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu11185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu11185Bytes());
  }

  public void setHShiftDaisu11185(long arg) {
  setHShiftDaisu11185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu12185Bytes() {
    return hShiftDaisu12185;
  }

  public void setHShiftDaisu12185Bytes(byte[] arg) {
    hShiftDaisu12185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu12185() {
    hShiftDaisu12185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu12185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu12185Bytes());
  }

  public void setHShiftDaisu12185(long arg) {
  setHShiftDaisu12185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu13185Bytes() {
    return hShiftDaisu13185;
  }

  public void setHShiftDaisu13185Bytes(byte[] arg) {
    hShiftDaisu13185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu13185() {
    hShiftDaisu13185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu13185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu13185Bytes());
  }

  public void setHShiftDaisu13185(long arg) {
  setHShiftDaisu13185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu14185Bytes() {
    return hShiftDaisu14185;
  }

  public void setHShiftDaisu14185Bytes(byte[] arg) {
    hShiftDaisu14185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu14185() {
    hShiftDaisu14185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu14185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu14185Bytes());
  }

  public void setHShiftDaisu14185(long arg) {
  setHShiftDaisu14185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu15185Bytes() {
    return hShiftDaisu15185;
  }

  public void setHShiftDaisu15185Bytes(byte[] arg) {
    hShiftDaisu15185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu15185() {
    hShiftDaisu15185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu15185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu15185Bytes());
  }

  public void setHShiftDaisu15185(long arg) {
  setHShiftDaisu15185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu16185Bytes() {
    return hShiftDaisu16185;
  }

  public void setHShiftDaisu16185Bytes(byte[] arg) {
    hShiftDaisu16185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu16185() {
    hShiftDaisu16185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu16185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu16185Bytes());
  }

  public void setHShiftDaisu16185(long arg) {
  setHShiftDaisu16185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu17185Bytes() {
    return hShiftDaisu17185;
  }

  public void setHShiftDaisu17185Bytes(byte[] arg) {
    hShiftDaisu17185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu17185() {
    hShiftDaisu17185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu17185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu17185Bytes());
  }

  public void setHShiftDaisu17185(long arg) {
  setHShiftDaisu17185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu18185Bytes() {
    return hShiftDaisu18185;
  }

  public void setHShiftDaisu18185Bytes(byte[] arg) {
    hShiftDaisu18185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu18185() {
    hShiftDaisu18185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu18185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu18185Bytes());
  }

  public void setHShiftDaisu18185(long arg) {
  setHShiftDaisu18185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu19185Bytes() {
    return hShiftDaisu19185;
  }

  public void setHShiftDaisu19185Bytes(byte[] arg) {
    hShiftDaisu19185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu19185() {
    hShiftDaisu19185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu19185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu19185Bytes());
  }

  public void setHShiftDaisu19185(long arg) {
  setHShiftDaisu19185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu20185Bytes() {
    return hShiftDaisu20185;
  }

  public void setHShiftDaisu20185Bytes(byte[] arg) {
    hShiftDaisu20185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu20185() {
    hShiftDaisu20185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu20185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu20185Bytes());
  }

  public void setHShiftDaisu20185(long arg) {
  setHShiftDaisu20185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu21185Bytes() {
    return hShiftDaisu21185;
  }

  public void setHShiftDaisu21185Bytes(byte[] arg) {
    hShiftDaisu21185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu21185() {
    hShiftDaisu21185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu21185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu21185Bytes());
  }

  public void setHShiftDaisu21185(long arg) {
  setHShiftDaisu21185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu22185Bytes() {
    return hShiftDaisu22185;
  }

  public void setHShiftDaisu22185Bytes(byte[] arg) {
    hShiftDaisu22185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu22185() {
    hShiftDaisu22185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu22185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu22185Bytes());
  }

  public void setHShiftDaisu22185(long arg) {
  setHShiftDaisu22185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu23185Bytes() {
    return hShiftDaisu23185;
  }

  public void setHShiftDaisu23185Bytes(byte[] arg) {
    hShiftDaisu23185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu23185() {
    hShiftDaisu23185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu23185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu23185Bytes());
  }

  public void setHShiftDaisu23185(long arg) {
  setHShiftDaisu23185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu24185Bytes() {
    return hShiftDaisu24185;
  }

  public void setHShiftDaisu24185Bytes(byte[] arg) {
    hShiftDaisu24185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu24185() {
    hShiftDaisu24185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu24185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu24185Bytes());
  }

  public void setHShiftDaisu24185(long arg) {
  setHShiftDaisu24185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu25185Bytes() {
    return hShiftDaisu25185;
  }

  public void setHShiftDaisu25185Bytes(byte[] arg) {
    hShiftDaisu25185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu25185() {
    hShiftDaisu25185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu25185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu25185Bytes());
  }

  public void setHShiftDaisu25185(long arg) {
  setHShiftDaisu25185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu26185Bytes() {
    return hShiftDaisu26185;
  }

  public void setHShiftDaisu26185Bytes(byte[] arg) {
    hShiftDaisu26185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu26185() {
    hShiftDaisu26185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu26185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu26185Bytes());
  }

  public void setHShiftDaisu26185(long arg) {
  setHShiftDaisu26185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu27185Bytes() {
    return hShiftDaisu27185;
  }

  public void setHShiftDaisu27185Bytes(byte[] arg) {
    hShiftDaisu27185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu27185() {
    hShiftDaisu27185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu27185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu27185Bytes());
  }

  public void setHShiftDaisu27185(long arg) {
  setHShiftDaisu27185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu28185Bytes() {
    return hShiftDaisu28185;
  }

  public void setHShiftDaisu28185Bytes(byte[] arg) {
    hShiftDaisu28185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu28185() {
    hShiftDaisu28185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu28185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu28185Bytes());
  }

  public void setHShiftDaisu28185(long arg) {
  setHShiftDaisu28185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu29185Bytes() {
    return hShiftDaisu29185;
  }

  public void setHShiftDaisu29185Bytes(byte[] arg) {
    hShiftDaisu29185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu29185() {
    hShiftDaisu29185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu29185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu29185Bytes());
  }

  public void setHShiftDaisu29185(long arg) {
  setHShiftDaisu29185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu30185Bytes() {
    return hShiftDaisu30185;
  }

  public void setHShiftDaisu30185Bytes(byte[] arg) {
    hShiftDaisu30185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu30185() {
    hShiftDaisu30185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu30185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu30185Bytes());
  }

  public void setHShiftDaisu30185(long arg) {
  setHShiftDaisu30185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu31185Bytes() {
    return hShiftDaisu31185;
  }

  public void setHShiftDaisu31185Bytes(byte[] arg) {
    hShiftDaisu31185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu31185() {
    hShiftDaisu31185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu31185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu31185Bytes());
  }

  public void setHShiftDaisu31185(long arg) {
  setHShiftDaisu31185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu32185Bytes() {
    return hShiftDaisu32185;
  }

  public void setHShiftDaisu32185Bytes(byte[] arg) {
    hShiftDaisu32185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu32185() {
    hShiftDaisu32185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu32185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu32185Bytes());
  }

  public void setHShiftDaisu32185(long arg) {
  setHShiftDaisu32185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu33185Bytes() {
    return hShiftDaisu33185;
  }

  public void setHShiftDaisu33185Bytes(byte[] arg) {
    hShiftDaisu33185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu33185() {
    hShiftDaisu33185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu33185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu33185Bytes());
  }

  public void setHShiftDaisu33185(long arg) {
  setHShiftDaisu33185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu34185Bytes() {
    return hShiftDaisu34185;
  }

  public void setHShiftDaisu34185Bytes(byte[] arg) {
    hShiftDaisu34185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu34185() {
    hShiftDaisu34185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu34185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu34185Bytes());
  }

  public void setHShiftDaisu34185(long arg) {
  setHShiftDaisu34185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu35185Bytes() {
    return hShiftDaisu35185;
  }

  public void setHShiftDaisu35185Bytes(byte[] arg) {
    hShiftDaisu35185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu35185() {
    hShiftDaisu35185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu35185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu35185Bytes());
  }

  public void setHShiftDaisu35185(long arg) {
  setHShiftDaisu35185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu36185Bytes() {
    return hShiftDaisu36185;
  }

  public void setHShiftDaisu36185Bytes(byte[] arg) {
    hShiftDaisu36185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu36185() {
    hShiftDaisu36185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu36185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu36185Bytes());
  }

  public void setHShiftDaisu36185(long arg) {
  setHShiftDaisu36185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu37185Bytes() {
    return hShiftDaisu37185;
  }

  public void setHShiftDaisu37185Bytes(byte[] arg) {
    hShiftDaisu37185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu37185() {
    hShiftDaisu37185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu37185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu37185Bytes());
  }

  public void setHShiftDaisu37185(long arg) {
  setHShiftDaisu37185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu38185Bytes() {
    return hShiftDaisu38185;
  }

  public void setHShiftDaisu38185Bytes(byte[] arg) {
    hShiftDaisu38185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu38185() {
    hShiftDaisu38185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu38185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu38185Bytes());
  }

  public void setHShiftDaisu38185(long arg) {
  setHShiftDaisu38185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu39185Bytes() {
    return hShiftDaisu39185;
  }

  public void setHShiftDaisu39185Bytes(byte[] arg) {
    hShiftDaisu39185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu39185() {
    hShiftDaisu39185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu39185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu39185Bytes());
  }

  public void setHShiftDaisu39185(long arg) {
  setHShiftDaisu39185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu40185Bytes() {
    return hShiftDaisu40185;
  }

  public void setHShiftDaisu40185Bytes(byte[] arg) {
    hShiftDaisu40185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu40185() {
    hShiftDaisu40185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu40185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu40185Bytes());
  }

  public void setHShiftDaisu40185(long arg) {
  setHShiftDaisu40185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu41185Bytes() {
    return hShiftDaisu41185;
  }

  public void setHShiftDaisu41185Bytes(byte[] arg) {
    hShiftDaisu41185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu41185() {
    hShiftDaisu41185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu41185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu41185Bytes());
  }

  public void setHShiftDaisu41185(long arg) {
  setHShiftDaisu41185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu42185Bytes() {
    return hShiftDaisu42185;
  }

  public void setHShiftDaisu42185Bytes(byte[] arg) {
    hShiftDaisu42185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu42185() {
    hShiftDaisu42185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu42185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu42185Bytes());
  }

  public void setHShiftDaisu42185(long arg) {
  setHShiftDaisu42185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu43185Bytes() {
    return hShiftDaisu43185;
  }

  public void setHShiftDaisu43185Bytes(byte[] arg) {
    hShiftDaisu43185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu43185() {
    hShiftDaisu43185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu43185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu43185Bytes());
  }

  public void setHShiftDaisu43185(long arg) {
  setHShiftDaisu43185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu44185Bytes() {
    return hShiftDaisu44185;
  }

  public void setHShiftDaisu44185Bytes(byte[] arg) {
    hShiftDaisu44185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu44185() {
    hShiftDaisu44185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu44185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu44185Bytes());
  }

  public void setHShiftDaisu44185(long arg) {
  setHShiftDaisu44185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu45185Bytes() {
    return hShiftDaisu45185;
  }

  public void setHShiftDaisu45185Bytes(byte[] arg) {
    hShiftDaisu45185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu45185() {
    hShiftDaisu45185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu45185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu45185Bytes());
  }

  public void setHShiftDaisu45185(long arg) {
  setHShiftDaisu45185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu46185Bytes() {
    return hShiftDaisu46185;
  }

  public void setHShiftDaisu46185Bytes(byte[] arg) {
    hShiftDaisu46185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu46185() {
    hShiftDaisu46185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu46185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu46185Bytes());
  }

  public void setHShiftDaisu46185(long arg) {
  setHShiftDaisu46185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu47185Bytes() {
    return hShiftDaisu47185;
  }

  public void setHShiftDaisu47185Bytes(byte[] arg) {
    hShiftDaisu47185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu47185() {
    hShiftDaisu47185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu47185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu47185Bytes());
  }

  public void setHShiftDaisu47185(long arg) {
  setHShiftDaisu47185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu48185Bytes() {
    return hShiftDaisu48185;
  }

  public void setHShiftDaisu48185Bytes(byte[] arg) {
    hShiftDaisu48185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu48185() {
    hShiftDaisu48185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu48185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu48185Bytes());
  }

  public void setHShiftDaisu48185(long arg) {
  setHShiftDaisu48185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu49185Bytes() {
    return hShiftDaisu49185;
  }

  public void setHShiftDaisu49185Bytes(byte[] arg) {
    hShiftDaisu49185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu49185() {
    hShiftDaisu49185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu49185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu49185Bytes());
  }

  public void setHShiftDaisu49185(long arg) {
  setHShiftDaisu49185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu50185Bytes() {
    return hShiftDaisu50185;
  }

  public void setHShiftDaisu50185Bytes(byte[] arg) {
    hShiftDaisu50185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu50185() {
    hShiftDaisu50185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu50185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu50185Bytes());
  }

  public void setHShiftDaisu50185(long arg) {
  setHShiftDaisu50185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu51185Bytes() {
    return hShiftDaisu51185;
  }

  public void setHShiftDaisu51185Bytes(byte[] arg) {
    hShiftDaisu51185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu51185() {
    hShiftDaisu51185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu51185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu51185Bytes());
  }

  public void setHShiftDaisu51185(long arg) {
  setHShiftDaisu51185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu52185Bytes() {
    return hShiftDaisu52185;
  }

  public void setHShiftDaisu52185Bytes(byte[] arg) {
    hShiftDaisu52185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu52185() {
    hShiftDaisu52185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu52185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu52185Bytes());
  }

  public void setHShiftDaisu52185(long arg) {
  setHShiftDaisu52185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu53185Bytes() {
    return hShiftDaisu53185;
  }

  public void setHShiftDaisu53185Bytes(byte[] arg) {
    hShiftDaisu53185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu53185() {
    hShiftDaisu53185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu53185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu53185Bytes());
  }

  public void setHShiftDaisu53185(long arg) {
  setHShiftDaisu53185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu54185Bytes() {
    return hShiftDaisu54185;
  }

  public void setHShiftDaisu54185Bytes(byte[] arg) {
    hShiftDaisu54185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu54185() {
    hShiftDaisu54185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu54185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu54185Bytes());
  }

  public void setHShiftDaisu54185(long arg) {
  setHShiftDaisu54185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu55185Bytes() {
    return hShiftDaisu55185;
  }

  public void setHShiftDaisu55185Bytes(byte[] arg) {
    hShiftDaisu55185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu55185() {
    hShiftDaisu55185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu55185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu55185Bytes());
  }

  public void setHShiftDaisu55185(long arg) {
  setHShiftDaisu55185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu56185Bytes() {
    return hShiftDaisu56185;
  }

  public void setHShiftDaisu56185Bytes(byte[] arg) {
    hShiftDaisu56185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu56185() {
    hShiftDaisu56185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu56185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu56185Bytes());
  }

  public void setHShiftDaisu56185(long arg) {
  setHShiftDaisu56185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu57185Bytes() {
    return hShiftDaisu57185;
  }

  public void setHShiftDaisu57185Bytes(byte[] arg) {
    hShiftDaisu57185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu57185() {
    hShiftDaisu57185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu57185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu57185Bytes());
  }

  public void setHShiftDaisu57185(long arg) {
  setHShiftDaisu57185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu58185Bytes() {
    return hShiftDaisu58185;
  }

  public void setHShiftDaisu58185Bytes(byte[] arg) {
    hShiftDaisu58185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu58185() {
    hShiftDaisu58185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu58185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu58185Bytes());
  }

  public void setHShiftDaisu58185(long arg) {
  setHShiftDaisu58185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu59185Bytes() {
    return hShiftDaisu59185;
  }

  public void setHShiftDaisu59185Bytes(byte[] arg) {
    hShiftDaisu59185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu59185() {
    hShiftDaisu59185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu59185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu59185Bytes());
  }

  public void setHShiftDaisu59185(long arg) {
  setHShiftDaisu59185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu60185Bytes() {
    return hShiftDaisu60185;
  }

  public void setHShiftDaisu60185Bytes(byte[] arg) {
    hShiftDaisu60185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu60185() {
    hShiftDaisu60185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu60185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu60185Bytes());
  }

  public void setHShiftDaisu60185(long arg) {
  setHShiftDaisu60185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu61185Bytes() {
    return hShiftDaisu61185;
  }

  public void setHShiftDaisu61185Bytes(byte[] arg) {
    hShiftDaisu61185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu61185() {
    hShiftDaisu61185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu61185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu61185Bytes());
  }

  public void setHShiftDaisu61185(long arg) {
  setHShiftDaisu61185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu62185Bytes() {
    return hShiftDaisu62185;
  }

  public void setHShiftDaisu62185Bytes(byte[] arg) {
    hShiftDaisu62185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu62185() {
    hShiftDaisu62185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu62185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu62185Bytes());
  }

  public void setHShiftDaisu62185(long arg) {
  setHShiftDaisu62185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHShiftDaisu63185Bytes() {
    return hShiftDaisu63185;
  }

  public void setHShiftDaisu63185Bytes(byte[] arg) {
    hShiftDaisu63185 = ArrayUtils.clone(arg);
  }

  public void initHShiftDaisu63185() {
    hShiftDaisu63185 =CommonUtils.numberToPackedDecimal(0, 2);
  }

  public long getHShiftDaisu63185() {
    return CommonUtils.packedDecimalToNumber(getHShiftDaisu63185Bytes());
  }

  public void setHShiftDaisu63185(long arg) {
  setHShiftDaisu63185Bytes(CommonUtils.numberToPackedDecimal(arg, 2));
  }

  public byte[] getHTimeStamp185Bytes() {
    return hTimeStamp185;
  }

  public void setHTimeStamp185Bytes(byte[] arg) {
    hTimeStamp185 = ArrayUtils.clone(arg);
  }

  public void initHTimeStamp185() {
    hTimeStamp185 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 12));
  }

  public String getHTimeStamp185() {
  return CommonUtils.bytesToString(getHTimeStamp185Bytes());
  }

  public void setHTimeStamp185(String arg) {
  final int trailing_length = 12 - arg.length();
  if (trailing_length > 0) {
  setHTimeStamp185Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHTimeStamp185Bytes(CommonUtils.stringToBytes(arg.substring(0, 12)));
  }
  }

  public byte[] getHKoutei185RBytes() {
    return hKoutei185R;
  }

  public void setHKoutei185RBytes(byte[] arg) {
    hKoutei185R = ArrayUtils.clone(arg);
  }

  public void initHKoutei185R() {
    hKoutei185R =CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));
  }

  public String getHKoutei185R() {
  return CommonUtils.bytesToString(getHKoutei185RBytes());
  }

  public void setHKoutei185R(String arg) {
  final int trailing_length = 30 - arg.length();
  if (trailing_length > 0) {
  setHKoutei185RBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoutei185RBytes(CommonUtils.stringToBytes(arg.substring(0, 30)));
  }
  }

  public byte[] getHostForSequence180Bytes() {
    ByteBuffer buffer = ByteBuffer.allocate(119);
        buffer.put(getHKoujouKubun180Bytes());
        buffer.put(getHKoujouControlNo180Bytes());
        buffer.put(getHActLineCode180Bytes());
        buffer.put(getHPoint2SeqNo180Bytes());
        buffer.put(getHPoint3SeqNo180Bytes());
        buffer.put(getHPoint4SeqNo180Bytes());
        buffer.put(getHTransportDirectionMls233Bytes());
        buffer.put(getHDoukiseisanSeqNo180Bytes());
        buffer.put(getHDeliveryPlanNonMMls234Bytes());
        buffer.put(getHProductionMonth180Bytes());
        buffer.put(getHMsNo180Bytes());
        buffer.put(getHSequence180RBytes());
        buffer.put(getHKoujouControlNo19180Bytes());
    return buffer.array();
  }

  public void setHostForSequence180Bytes(byte[] arg) {
        setHKoujouKubun180Bytes(ArrayUtils.subarray(arg, 0, 1));
        setHKoujouControlNo180Bytes(ArrayUtils.subarray(arg, 1, 12));
        setHActLineCode180Bytes(ArrayUtils.subarray(arg, 12, 18));
        setHPoint2SeqNo180Bytes(ArrayUtils.subarray(arg, 18, 31));
        setHPoint3SeqNo180Bytes(ArrayUtils.subarray(arg, 31, 44));
        setHPoint4SeqNo180Bytes(ArrayUtils.subarray(arg, 44, 57));
        setHTransportDirectionMls233Bytes(ArrayUtils.subarray(arg, 57, 58));
        setHDoukiseisanSeqNo180Bytes(ArrayUtils.subarray(arg, 58, 62));
        setHDeliveryPlanNonMMls234Bytes(ArrayUtils.subarray(arg, 62, 73));
        setHProductionMonth180Bytes(ArrayUtils.subarray(arg, 73, 79));
        setHMsNo180Bytes(ArrayUtils.subarray(arg, 79, 80));
        setHSequence180RBytes(ArrayUtils.subarray(arg, 80, 110));
        setHKoujouControlNo19180Bytes(ArrayUtils.subarray(arg, 110, 119));
  }

  public void initHostForSequence180() {
        initHKoujouKubun180();
        initHKoujouControlNo180();
        initHActLineCode180();
        initHPoint2SeqNo180();
        initHPoint3SeqNo180();
        initHPoint4SeqNo180();
        initHTransportDirectionMls233();
        initHDoukiseisanSeqNo180();
        initHDeliveryPlanNonMMls234();
        initHProductionMonth180();
        initHMsNo180();
        initHSequence180R();
        initHKoujouControlNo19180();
  }

  public String getHostForSequence180() {
  return CommonUtils.bytesToString(getHostForSequence180Bytes());
  }

  public void setHostForSequence180(String arg) {
  final int trailing_length = 119 - arg.length();
  if (trailing_length > 0) {
  setHostForSequence180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHostForSequence180Bytes(CommonUtils.stringToBytes(arg.substring(0, 119)));
  }
  }

  public byte[] getHKoujouKubun180Bytes() {
    return hKoujouKubun180;
  }

  public void setHKoujouKubun180Bytes(byte[] arg) {
    hKoujouKubun180 = ArrayUtils.clone(arg);
  }

  public void initHKoujouKubun180() {
    hKoujouKubun180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHKoujouKubun180() {
  return CommonUtils.bytesToString(getHKoujouKubun180Bytes());
  }

  public void setHKoujouKubun180(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHKoujouKubun180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouKubun180Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHKoujouControlNo180Bytes() {
    return hKoujouControlNo180;
  }

  public void setHKoujouControlNo180Bytes(byte[] arg) {
    hKoujouControlNo180 = ArrayUtils.clone(arg);
  }

  public void initHKoujouControlNo180() {
    hKoujouControlNo180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getHKoujouControlNo180() {
  return CommonUtils.bytesToString(getHKoujouControlNo180Bytes());
  }

  public void setHKoujouControlNo180(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setHKoujouControlNo180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouControlNo180Bytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getHActLineCode180Bytes() {
    return hActLineCode180;
  }

  public void setHActLineCode180Bytes(byte[] arg) {
    hActLineCode180 = ArrayUtils.clone(arg);
  }

  public void initHActLineCode180() {
    hActLineCode180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHActLineCode180() {
  return CommonUtils.bytesToString(getHActLineCode180Bytes());
  }

  public void setHActLineCode180(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHActLineCode180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHActLineCode180Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHPoint2SeqNo180Bytes() {
    return hPoint2SeqNo180;
  }

  public void setHPoint2SeqNo180Bytes(byte[] arg) {
    hPoint2SeqNo180 = ArrayUtils.clone(arg);
  }

  public void initHPoint2SeqNo180() {
    hPoint2SeqNo180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));
  }

  public String getHPoint2SeqNo180() {
  return CommonUtils.bytesToString(getHPoint2SeqNo180Bytes());
  }

  public void setHPoint2SeqNo180(String arg) {
  final int trailing_length = 13 - arg.length();
  if (trailing_length > 0) {
  setHPoint2SeqNo180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHPoint2SeqNo180Bytes(CommonUtils.stringToBytes(arg.substring(0, 13)));
  }
  }

  public byte[] getHPoint3SeqNo180Bytes() {
    return hPoint3SeqNo180;
  }

  public void setHPoint3SeqNo180Bytes(byte[] arg) {
    hPoint3SeqNo180 = ArrayUtils.clone(arg);
  }

  public void initHPoint3SeqNo180() {
    hPoint3SeqNo180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));
  }

  public String getHPoint3SeqNo180() {
  return CommonUtils.bytesToString(getHPoint3SeqNo180Bytes());
  }

  public void setHPoint3SeqNo180(String arg) {
  final int trailing_length = 13 - arg.length();
  if (trailing_length > 0) {
  setHPoint3SeqNo180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHPoint3SeqNo180Bytes(CommonUtils.stringToBytes(arg.substring(0, 13)));
  }
  }

  public byte[] getHPoint4SeqNo180Bytes() {
    return hPoint4SeqNo180;
  }

  public void setHPoint4SeqNo180Bytes(byte[] arg) {
    hPoint4SeqNo180 = ArrayUtils.clone(arg);
  }

  public void initHPoint4SeqNo180() {
    hPoint4SeqNo180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 13));
  }

  public String getHPoint4SeqNo180() {
  return CommonUtils.bytesToString(getHPoint4SeqNo180Bytes());
  }

  public void setHPoint4SeqNo180(String arg) {
  final int trailing_length = 13 - arg.length();
  if (trailing_length > 0) {
  setHPoint4SeqNo180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHPoint4SeqNo180Bytes(CommonUtils.stringToBytes(arg.substring(0, 13)));
  }
  }

  public byte[] getHTransportDirectionMls233Bytes() {
    return hTransportDirectionMls233;
  }

  public void setHTransportDirectionMls233Bytes(byte[] arg) {
    hTransportDirectionMls233 = ArrayUtils.clone(arg);
  }

  public void initHTransportDirectionMls233() {
    hTransportDirectionMls233 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHTransportDirectionMls233() {
  return CommonUtils.bytesToString(getHTransportDirectionMls233Bytes());
  }

  public void setHTransportDirectionMls233(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHTransportDirectionMls233Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHTransportDirectionMls233Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHDoukiseisanSeqNo180Bytes() {
    return hDoukiseisanSeqNo180;
  }

  public void setHDoukiseisanSeqNo180Bytes(byte[] arg) {
    hDoukiseisanSeqNo180 = ArrayUtils.clone(arg);
  }

  public void initHDoukiseisanSeqNo180() {
    hDoukiseisanSeqNo180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getHDoukiseisanSeqNo180() {
  return CommonUtils.bytesToString(getHDoukiseisanSeqNo180Bytes());
  }

  public void setHDoukiseisanSeqNo180(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setHDoukiseisanSeqNo180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHDoukiseisanSeqNo180Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getHDeliveryPlanNonMMls234Bytes() {
    return hDeliveryPlanNonMMls234;
  }

  public void setHDeliveryPlanNonMMls234Bytes(byte[] arg) {
    hDeliveryPlanNonMMls234 = ArrayUtils.clone(arg);
  }

  public void initHDeliveryPlanNonMMls234() {
    hDeliveryPlanNonMMls234 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 11));
  }

  public String getHDeliveryPlanNonMMls234() {
  return CommonUtils.bytesToString(getHDeliveryPlanNonMMls234Bytes());
  }

  public void setHDeliveryPlanNonMMls234(String arg) {
  final int trailing_length = 11 - arg.length();
  if (trailing_length > 0) {
  setHDeliveryPlanNonMMls234Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHDeliveryPlanNonMMls234Bytes(CommonUtils.stringToBytes(arg.substring(0, 11)));
  }
  }

  public byte[] getHProductionMonth180Bytes() {
    return hProductionMonth180;
  }

  public void setHProductionMonth180Bytes(byte[] arg) {
    hProductionMonth180 = ArrayUtils.clone(arg);
  }

  public void initHProductionMonth180() {
    hProductionMonth180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 6));
  }

  public String getHProductionMonth180() {
  return CommonUtils.bytesToString(getHProductionMonth180Bytes());
  }

  public void setHProductionMonth180(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setHProductionMonth180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHProductionMonth180Bytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getHMsNo180Bytes() {
    return hMsNo180;
  }

  public void setHMsNo180Bytes(byte[] arg) {
    hMsNo180 = ArrayUtils.clone(arg);
  }

  public void initHMsNo180() {
    hMsNo180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getHMsNo180() {
  return CommonUtils.bytesToString(getHMsNo180Bytes());
  }

  public void setHMsNo180(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setHMsNo180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHMsNo180Bytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getHSequence180RBytes() {
    return hSequence180R;
  }

  public void setHSequence180RBytes(byte[] arg) {
    hSequence180R = ArrayUtils.clone(arg);
  }

  public void initHSequence180R() {
    hSequence180R =CommonUtils.stringToBytes(StringUtils.repeat(" ", 30));
  }

  public String getHSequence180R() {
  return CommonUtils.bytesToString(getHSequence180RBytes());
  }

  public void setHSequence180R(String arg) {
  final int trailing_length = 30 - arg.length();
  if (trailing_length > 0) {
  setHSequence180RBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHSequence180RBytes(CommonUtils.stringToBytes(arg.substring(0, 30)));
  }
  }

  public byte[] getHKoujouControlNo19180Bytes() {
    return hKoujouControlNo19180;
  }

  public void setHKoujouControlNo19180Bytes(byte[] arg) {
    hKoujouControlNo19180 = ArrayUtils.clone(arg);
  }

  public void initHKoujouControlNo19180() {
    hKoujouControlNo19180 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 9));
  }

  public String getHKoujouControlNo19180() {
  return CommonUtils.bytesToString(getHKoujouControlNo19180Bytes());
  }

  public void setHKoujouControlNo19180(String arg) {
  final int trailing_length = 9 - arg.length();
  if (trailing_length > 0) {
  setHKoujouControlNo19180Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setHKoujouControlNo19180Bytes(CommonUtils.stringToBytes(arg.substring(0, 9)));
  }
  }

  public byte[] getWcConAreaBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(114);
        buffer.put(getWSwOnBytes());
        buffer.put(getWSwOffBytes());
        buffer.put(getCMop7501Bytes());
        buffer.put(getCLok1801Bytes());
        buffer.put(getCSeq1801Bytes());
        buffer.put(getCLok1811Bytes());
        buffer.put(getCSeq1811Bytes());
        buffer.put(getCLok1821Bytes());
        buffer.put(getCSeq1821Bytes());
        buffer.put(getCLok1831Bytes());
        buffer.put(getCSeq1831Bytes());
        buffer.put(getCLok1841Bytes());
        buffer.put(getCSeq1841Bytes());
        buffer.put(getCLok1851Bytes());
        buffer.put(getCSeq1851Bytes());
        buffer.put(getCMcl7501Bytes());
    return buffer.array();
  }

  public void setWcConAreaBytes(byte[] arg) {
        setWSwOnBytes(ArrayUtils.subarray(arg, 0, 1));
        setWSwOffBytes(ArrayUtils.subarray(arg, 1, 2));
        setCMop7501Bytes(ArrayUtils.subarray(arg, 2, 10));
        setCLok1801Bytes(ArrayUtils.subarray(arg, 10, 18));
        setCSeq1801Bytes(ArrayUtils.subarray(arg, 18, 26));
        setCLok1811Bytes(ArrayUtils.subarray(arg, 26, 34));
        setCSeq1811Bytes(ArrayUtils.subarray(arg, 34, 42));
        setCLok1821Bytes(ArrayUtils.subarray(arg, 42, 50));
        setCSeq1821Bytes(ArrayUtils.subarray(arg, 50, 58));
        setCLok1831Bytes(ArrayUtils.subarray(arg, 58, 66));
        setCSeq1831Bytes(ArrayUtils.subarray(arg, 66, 74));
        setCLok1841Bytes(ArrayUtils.subarray(arg, 74, 82));
        setCSeq1841Bytes(ArrayUtils.subarray(arg, 82, 90));
        setCLok1851Bytes(ArrayUtils.subarray(arg, 90, 98));
        setCSeq1851Bytes(ArrayUtils.subarray(arg, 98, 106));
        setCMcl7501Bytes(ArrayUtils.subarray(arg, 106, 114));
  }

  public void initWcConArea() {
        initWSwOn();
        initWSwOff();
        initCMop7501();
        initCLok1801();
        initCSeq1801();
        initCLok1811();
        initCSeq1811();
        initCLok1821();
        initCSeq1821();
        initCLok1831();
        initCSeq1831();
        initCLok1841();
        initCSeq1841();
        initCLok1851();
        initCSeq1851();
        initCMcl7501();
  }

  public String getWcConArea() {
  return CommonUtils.bytesToString(getWcConAreaBytes());
  }

  public void setWcConArea(String arg) {
  final int trailing_length = 114 - arg.length();
  if (trailing_length > 0) {
  setWcConAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWcConAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 114)));
  }
  }

  public byte[] getWSwOnBytes() {
    return wSwOn;
  }

  public void setWSwOnBytes(byte[] arg) {
    wSwOn = ArrayUtils.clone(arg);
  }

  public void initWSwOn() {
    wSwOn =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWSwOn() {
  return CommonUtils.bytesToString(getWSwOnBytes());
  }

  public void setWSwOn(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWSwOnBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWSwOnBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getWSwOffBytes() {
    return wSwOff;
  }

  public void setWSwOffBytes(byte[] arg) {
    wSwOff = ArrayUtils.clone(arg);
  }

  public void initWSwOff() {
    wSwOff =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWSwOff() {
  return CommonUtils.bytesToString(getWSwOffBytes());
  }

  public void setWSwOff(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWSwOffBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWSwOffBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getCMop7501Bytes() {
    return cMop7501;
  }

  public void setCMop7501Bytes(byte[] arg) {
    cMop7501 = ArrayUtils.clone(arg);
  }

  public void initCMop7501() {
    cMop7501 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCMop7501() {
  return CommonUtils.bytesToString(getCMop7501Bytes());
  }

  public void setCMop7501(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCMop7501Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCMop7501Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCLok1801Bytes() {
    return cLok1801;
  }

  public void setCLok1801Bytes(byte[] arg) {
    cLok1801 = ArrayUtils.clone(arg);
  }

  public void initCLok1801() {
    cLok1801 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCLok1801() {
  return CommonUtils.bytesToString(getCLok1801Bytes());
  }

  public void setCLok1801(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCLok1801Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCLok1801Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCSeq1801Bytes() {
    return cSeq1801;
  }

  public void setCSeq1801Bytes(byte[] arg) {
    cSeq1801 = ArrayUtils.clone(arg);
  }

  public void initCSeq1801() {
    cSeq1801 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCSeq1801() {
  return CommonUtils.bytesToString(getCSeq1801Bytes());
  }

  public void setCSeq1801(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCSeq1801Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCSeq1801Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCLok1811Bytes() {
    return cLok1811;
  }

  public void setCLok1811Bytes(byte[] arg) {
    cLok1811 = ArrayUtils.clone(arg);
  }

  public void initCLok1811() {
    cLok1811 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCLok1811() {
  return CommonUtils.bytesToString(getCLok1811Bytes());
  }

  public void setCLok1811(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCLok1811Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCLok1811Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCSeq1811Bytes() {
    return cSeq1811;
  }

  public void setCSeq1811Bytes(byte[] arg) {
    cSeq1811 = ArrayUtils.clone(arg);
  }

  public void initCSeq1811() {
    cSeq1811 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCSeq1811() {
  return CommonUtils.bytesToString(getCSeq1811Bytes());
  }

  public void setCSeq1811(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCSeq1811Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCSeq1811Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCLok1821Bytes() {
    return cLok1821;
  }

  public void setCLok1821Bytes(byte[] arg) {
    cLok1821 = ArrayUtils.clone(arg);
  }

  public void initCLok1821() {
    cLok1821 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCLok1821() {
  return CommonUtils.bytesToString(getCLok1821Bytes());
  }

  public void setCLok1821(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCLok1821Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCLok1821Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCSeq1821Bytes() {
    return cSeq1821;
  }

  public void setCSeq1821Bytes(byte[] arg) {
    cSeq1821 = ArrayUtils.clone(arg);
  }

  public void initCSeq1821() {
    cSeq1821 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCSeq1821() {
  return CommonUtils.bytesToString(getCSeq1821Bytes());
  }

  public void setCSeq1821(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCSeq1821Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCSeq1821Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCLok1831Bytes() {
    return cLok1831;
  }

  public void setCLok1831Bytes(byte[] arg) {
    cLok1831 = ArrayUtils.clone(arg);
  }

  public void initCLok1831() {
    cLok1831 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCLok1831() {
  return CommonUtils.bytesToString(getCLok1831Bytes());
  }

  public void setCLok1831(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCLok1831Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCLok1831Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCSeq1831Bytes() {
    return cSeq1831;
  }

  public void setCSeq1831Bytes(byte[] arg) {
    cSeq1831 = ArrayUtils.clone(arg);
  }

  public void initCSeq1831() {
    cSeq1831 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCSeq1831() {
  return CommonUtils.bytesToString(getCSeq1831Bytes());
  }

  public void setCSeq1831(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCSeq1831Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCSeq1831Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCLok1841Bytes() {
    return cLok1841;
  }

  public void setCLok1841Bytes(byte[] arg) {
    cLok1841 = ArrayUtils.clone(arg);
  }

  public void initCLok1841() {
    cLok1841 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCLok1841() {
  return CommonUtils.bytesToString(getCLok1841Bytes());
  }

  public void setCLok1841(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCLok1841Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCLok1841Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCSeq1841Bytes() {
    return cSeq1841;
  }

  public void setCSeq1841Bytes(byte[] arg) {
    cSeq1841 = ArrayUtils.clone(arg);
  }

  public void initCSeq1841() {
    cSeq1841 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCSeq1841() {
  return CommonUtils.bytesToString(getCSeq1841Bytes());
  }

  public void setCSeq1841(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCSeq1841Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCSeq1841Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCLok1851Bytes() {
    return cLok1851;
  }

  public void setCLok1851Bytes(byte[] arg) {
    cLok1851 = ArrayUtils.clone(arg);
  }

  public void initCLok1851() {
    cLok1851 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCLok1851() {
  return CommonUtils.bytesToString(getCLok1851Bytes());
  }

  public void setCLok1851(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCLok1851Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCLok1851Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCSeq1851Bytes() {
    return cSeq1851;
  }

  public void setCSeq1851Bytes(byte[] arg) {
    cSeq1851 = ArrayUtils.clone(arg);
  }

  public void initCSeq1851() {
    cSeq1851 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCSeq1851() {
  return CommonUtils.bytesToString(getCSeq1851Bytes());
  }

  public void setCSeq1851(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCSeq1851Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCSeq1851Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCMcl7501Bytes() {
    return cMcl7501;
  }

  public void setCMcl7501Bytes(byte[] arg) {
    cMcl7501 = ArrayUtils.clone(arg);
  }

  public void initCMcl7501() {
    cMcl7501 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCMcl7501() {
  return CommonUtils.bytesToString(getCMcl7501Bytes());
  }

  public void setCMcl7501(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCMcl7501Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCMcl7501Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getWkSwAreaBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.put(getWkStatusEofSwBytes());
        buffer.put(getWkShiyouBetsuEofSwBytes());
        buffer.put(getWkShakeiBetsuEofSwBytes());
        buffer.put(getWkJikeiRetsuEofSwBytes());
        buffer.put(getWkKouteiKeikakuEofSwBytes());
        buffer.put(getWkSequenceEofSwBytes());
    return buffer.array();
  }

  public void setWkSwAreaBytes(byte[] arg) {
        setWkStatusEofSwBytes(ArrayUtils.subarray(arg, 0, 1));
        setWkShiyouBetsuEofSwBytes(ArrayUtils.subarray(arg, 1, 2));
        setWkShakeiBetsuEofSwBytes(ArrayUtils.subarray(arg, 2, 3));
        setWkJikeiRetsuEofSwBytes(ArrayUtils.subarray(arg, 3, 4));
        setWkKouteiKeikakuEofSwBytes(ArrayUtils.subarray(arg, 4, 5));
        setWkSequenceEofSwBytes(ArrayUtils.subarray(arg, 5, 6));
  }

  public void initWkSwArea() {
        initWkStatusEofSw();
        initWkShiyouBetsuEofSw();
        initWkShakeiBetsuEofSw();
        initWkJikeiRetsuEofSw();
        initWkKouteiKeikakuEofSw();
        initWkSequenceEofSw();
  }

  public String getWkSwArea() {
  return CommonUtils.bytesToString(getWkSwAreaBytes());
  }

  public void setWkSwArea(String arg) {
  final int trailing_length = 6 - arg.length();
  if (trailing_length > 0) {
  setWkSwAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkSwAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 6)));
  }
  }

  public byte[] getWkStatusEofSwBytes() {
    return wkStatusEofSw;
  }

  public void setWkStatusEofSwBytes(byte[] arg) {
    wkStatusEofSw = ArrayUtils.clone(arg);
  }

  public void initWkStatusEofSw() {
    wkStatusEofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWkStatusEofSw() {
  return CommonUtils.bytesToString(getWkStatusEofSwBytes());
  }

  public void setWkStatusEofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWkStatusEofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkStatusEofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isWkStatusDbEof() {
boolean result =
        getWkStatusEofSw().equals("Y");

return result;
}

  public byte[] getWkShiyouBetsuEofSwBytes() {
    return wkShiyouBetsuEofSw;
  }

  public void setWkShiyouBetsuEofSwBytes(byte[] arg) {
    wkShiyouBetsuEofSw = ArrayUtils.clone(arg);
  }

  public void initWkShiyouBetsuEofSw() {
    wkShiyouBetsuEofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWkShiyouBetsuEofSw() {
  return CommonUtils.bytesToString(getWkShiyouBetsuEofSwBytes());
  }

  public void setWkShiyouBetsuEofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWkShiyouBetsuEofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkShiyouBetsuEofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isWkShiyouBetsuDbEof() {
boolean result =
        getWkShiyouBetsuEofSw().equals("Y");

return result;
}

  public byte[] getWkShakeiBetsuEofSwBytes() {
    return wkShakeiBetsuEofSw;
  }

  public void setWkShakeiBetsuEofSwBytes(byte[] arg) {
    wkShakeiBetsuEofSw = ArrayUtils.clone(arg);
  }

  public void initWkShakeiBetsuEofSw() {
    wkShakeiBetsuEofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWkShakeiBetsuEofSw() {
  return CommonUtils.bytesToString(getWkShakeiBetsuEofSwBytes());
  }

  public void setWkShakeiBetsuEofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWkShakeiBetsuEofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkShakeiBetsuEofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isWkShakeiBetsuDbEof() {
boolean result =
        getWkShakeiBetsuEofSw().equals("Y");

return result;
}

  public byte[] getWkJikeiRetsuEofSwBytes() {
    return wkJikeiRetsuEofSw;
  }

  public void setWkJikeiRetsuEofSwBytes(byte[] arg) {
    wkJikeiRetsuEofSw = ArrayUtils.clone(arg);
  }

  public void initWkJikeiRetsuEofSw() {
    wkJikeiRetsuEofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWkJikeiRetsuEofSw() {
  return CommonUtils.bytesToString(getWkJikeiRetsuEofSwBytes());
  }

  public void setWkJikeiRetsuEofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWkJikeiRetsuEofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkJikeiRetsuEofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isWkJikeiRetsuDbEof() {
boolean result =
        getWkJikeiRetsuEofSw().equals("Y");

return result;
}

  public byte[] getWkKouteiKeikakuEofSwBytes() {
    return wkKouteiKeikakuEofSw;
  }

  public void setWkKouteiKeikakuEofSwBytes(byte[] arg) {
    wkKouteiKeikakuEofSw = ArrayUtils.clone(arg);
  }

  public void initWkKouteiKeikakuEofSw() {
    wkKouteiKeikakuEofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWkKouteiKeikakuEofSw() {
  return CommonUtils.bytesToString(getWkKouteiKeikakuEofSwBytes());
  }

  public void setWkKouteiKeikakuEofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWkKouteiKeikakuEofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkKouteiKeikakuEofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isWkKouteiKeikakuDbEof() {
boolean result =
        getWkKouteiKeikakuEofSw().equals("Y");

return result;
}

  public byte[] getWkSequenceEofSwBytes() {
    return wkSequenceEofSw;
  }

  public void setWkSequenceEofSwBytes(byte[] arg) {
    wkSequenceEofSw = ArrayUtils.clone(arg);
  }

  public void initWkSequenceEofSw() {
    wkSequenceEofSw =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getWkSequenceEofSw() {
  return CommonUtils.bytesToString(getWkSequenceEofSwBytes());
  }

  public void setWkSequenceEofSw(String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setWkSequenceEofSwBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkSequenceEofSwBytes(CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }
public boolean isWkSequenceDbEof() {
boolean result =
        getWkSequenceEofSw().equals("Y");

return result;
}

  public byte[] getWkCtrAreaBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer.put(getStoreCtrBytes());
    return buffer.array();
  }

  public void setWkCtrAreaBytes(byte[] arg) {
        setStoreCtrBytes(ArrayUtils.subarray(arg, 0, 2));
  }

  public void initWkCtrArea() {
        initStoreCtr();
  }

  public String getWkCtrArea() {
  return CommonUtils.bytesToString(getWkCtrAreaBytes());
  }

  public void setWkCtrArea(String arg) {
  final int trailing_length = 2 - arg.length();
  if (trailing_length > 0) {
  setWkCtrAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkCtrAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 2)));
  }
  }

  public byte[] getStoreCtrBytes() {
    return storeCtr;
  }

  public void setStoreCtrBytes(byte[] arg) {
    storeCtr = ArrayUtils.clone(arg);
  }

  public void initStoreCtr() {
    storeCtr =CommonUtils.numberToBinary(0, 2);
  }

  public long getStoreCtr() {
    return CommonUtils.binaryToNumber(getStoreCtrBytes());
  }

  public void setStoreCtr(long arg) {
  setStoreCtrBytes(CommonUtils.numberToBinary(arg, 2));
  }

  public byte[] getWkAreaBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(120);
        buffer.put(getWkSysinParameterBytes());
        buffer.put(getWkParameterTableBytes());
        buffer.put(getWkModelBytes());
    return buffer.array();
  }

  public void setWkAreaBytes(byte[] arg) {
        setWkSysinParameterBytes(ArrayUtils.subarray(arg, 0, 84));
        setWkParameterTableBytes(ArrayUtils.subarray(arg, 84, 102));
        setWkModelBytes(ArrayUtils.subarray(arg, 102, 120));
  }

  public void initWkArea() {
        initWkSysinParameter();
        initWkParameterTable();
        initWkModel();
  }

  public String getWkArea() {
  return CommonUtils.bytesToString(getWkAreaBytes());
  }

  public void setWkArea(String arg) {
  final int trailing_length = 120 - arg.length();
  if (trailing_length > 0) {
  setWkAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 120)));
  }
  }

  public byte[] getWkSysinParameterBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(84);
        buffer.put(getFiller0001Bytes());
        for (int x = 0; x < 6; x++) {
        buffer.put(getWkSysinBytes(x));
        }
        buffer.put(getFiller0003Bytes());
    return buffer.array();
  }

  public void setWkSysinParameterBytes(byte[] arg) {
        setFiller0001Bytes(ArrayUtils.subarray(arg, 0, 4));
        for (int x = 0; x < 6; x++) {
        setWkSysinBytes(x, ArrayUtils.subarray(arg, 4 + 4 * x, 4 + 4 * (x + 1)));
        }
        setFiller0003Bytes(ArrayUtils.subarray(arg, 8, 64));
  }

  public void initWkSysinParameter() {
        initFiller0001();
        for (int x = 0; x < 6; x++) {
        initWkSysin(x);
        }
        initFiller0003();
  }

  public String getWkSysinParameter() {
  return CommonUtils.bytesToString(getWkSysinParameterBytes());
  }

  public void setWkSysinParameter(String arg) {
  final int trailing_length = 84 - arg.length();
  if (trailing_length > 0) {
  setWkSysinParameterBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkSysinParameterBytes(CommonUtils.stringToBytes(arg.substring(0, 84)));
  }
  }

  public byte[] getFiller0001Bytes() {
    return filler0001;
  }

  public void setFiller0001Bytes(byte[] arg) {
    filler0001 = ArrayUtils.clone(arg);
  }

  public void initFiller0001() {
    filler0001 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 4));
  }

  public String getFiller0001() {
  return CommonUtils.bytesToString(getFiller0001Bytes());
  }

  public void setFiller0001(String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setFiller0001Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setFiller0001Bytes(CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getWkSysinBytes(int a) {
    ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.put(getWkParamBytes(a));
        buffer.put(getFiller0002Bytes(a));
    return buffer.array();
  }

  public void setWkSysinBytes(int a,byte[] arg) {
        setWkParamBytes(a,ArrayUtils.subarray(arg, 0, 3));
        setFiller0002Bytes(a,ArrayUtils.subarray(arg, 3, 4));
  }

  public void initWkSysin(int a) {
        initWkParam(a);
        initFiller0002(a);
  }

  public String getWkSysin(int a) {
  return CommonUtils.bytesToString(getWkSysinBytes(a));
  }

  public void setWkSysin(int a,String arg) {
  final int trailing_length = 4 - arg.length();
  if (trailing_length > 0) {
  setWkSysinBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkSysinBytes(a,CommonUtils.stringToBytes(arg.substring(0, 4)));
  }
  }

  public byte[] getWkParamBytes(int a) {
    return wkParam[a];
  }

  public void setWkParamBytes(int a,byte[] arg) {
    wkParam[a] = ArrayUtils.clone(arg);
  }

  public void initWkParam(int a) {
    wkParam[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkParam(int a) {
  return CommonUtils.bytesToString(getWkParamBytes(a));
  }

  public void setWkParam(int a,String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkParamBytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkParamBytes(a,CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getFiller0002Bytes(int a) {
    return filler0002[a];
  }

  public void setFiller0002Bytes(int a,byte[] arg) {
    filler0002[a] = ArrayUtils.clone(arg);
  }

  public void initFiller0002(int a) {
    filler0002[a] =CommonUtils.stringToBytes(StringUtils.repeat(" ", 1));
  }

  public String getFiller0002(int a) {
  return CommonUtils.bytesToString(getFiller0002Bytes(a));
  }

  public void setFiller0002(int a,String arg) {
  final int trailing_length = 1 - arg.length();
  if (trailing_length > 0) {
  setFiller0002Bytes(a,CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setFiller0002Bytes(a,CommonUtils.stringToBytes(arg.substring(0, 1)));
  }
  }

  public byte[] getFiller0003Bytes() {
    return filler0003;
  }

  public void setFiller0003Bytes(byte[] arg) {
    filler0003 = ArrayUtils.clone(arg);
  }

  public void initFiller0003() {
    filler0003 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 56));
  }

  public String getFiller0003() {
  return CommonUtils.bytesToString(getFiller0003Bytes());
  }

  public void setFiller0003(String arg) {
  final int trailing_length = 56 - arg.length();
  if (trailing_length > 0) {
  setFiller0003Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setFiller0003Bytes(CommonUtils.stringToBytes(arg.substring(0, 56)));
  }
  }

  public byte[] getWkParameterTableBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(18);
        buffer.put(getWkStatusBytes());
        buffer.put(getWkShiyouBetsuBytes());
        buffer.put(getWkShakeiBetsuBytes());
        buffer.put(getWkJikeiRetsuBytes());
        buffer.put(getWkKouteiKeikakuBytes());
        buffer.put(getWkSequenceBytes());
    return buffer.array();
  }

  public void setWkParameterTableBytes(byte[] arg) {
        setWkStatusBytes(ArrayUtils.subarray(arg, 0, 3));
        setWkShiyouBetsuBytes(ArrayUtils.subarray(arg, 3, 6));
        setWkShakeiBetsuBytes(ArrayUtils.subarray(arg, 6, 9));
        setWkJikeiRetsuBytes(ArrayUtils.subarray(arg, 9, 12));
        setWkKouteiKeikakuBytes(ArrayUtils.subarray(arg, 12, 15));
        setWkSequenceBytes(ArrayUtils.subarray(arg, 15, 18));
  }

  public void initWkParameterTable() {
        initWkStatus();
        initWkShiyouBetsu();
        initWkShakeiBetsu();
        initWkJikeiRetsu();
        initWkKouteiKeikaku();
        initWkSequence();
  }

  public String getWkParameterTable() {
  return CommonUtils.bytesToString(getWkParameterTableBytes());
  }

  public void setWkParameterTable(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setWkParameterTableBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkParameterTableBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getWkStatusBytes() {
    return wkStatus;
  }

  public void setWkStatusBytes(byte[] arg) {
    wkStatus = ArrayUtils.clone(arg);
  }

  public void initWkStatus() {
    wkStatus =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkStatus() {
  return CommonUtils.bytesToString(getWkStatusBytes());
  }

  public void setWkStatus(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkStatusBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkStatusBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkShiyouBetsuBytes() {
    return wkShiyouBetsu;
  }

  public void setWkShiyouBetsuBytes(byte[] arg) {
    wkShiyouBetsu = ArrayUtils.clone(arg);
  }

  public void initWkShiyouBetsu() {
    wkShiyouBetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkShiyouBetsu() {
  return CommonUtils.bytesToString(getWkShiyouBetsuBytes());
  }

  public void setWkShiyouBetsu(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkShiyouBetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkShiyouBetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkShakeiBetsuBytes() {
    return wkShakeiBetsu;
  }

  public void setWkShakeiBetsuBytes(byte[] arg) {
    wkShakeiBetsu = ArrayUtils.clone(arg);
  }

  public void initWkShakeiBetsu() {
    wkShakeiBetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkShakeiBetsu() {
  return CommonUtils.bytesToString(getWkShakeiBetsuBytes());
  }

  public void setWkShakeiBetsu(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkShakeiBetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkShakeiBetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkJikeiRetsuBytes() {
    return wkJikeiRetsu;
  }

  public void setWkJikeiRetsuBytes(byte[] arg) {
    wkJikeiRetsu = ArrayUtils.clone(arg);
  }

  public void initWkJikeiRetsu() {
    wkJikeiRetsu =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkJikeiRetsu() {
  return CommonUtils.bytesToString(getWkJikeiRetsuBytes());
  }

  public void setWkJikeiRetsu(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkJikeiRetsuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkJikeiRetsuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkKouteiKeikakuBytes() {
    return wkKouteiKeikaku;
  }

  public void setWkKouteiKeikakuBytes(byte[] arg) {
    wkKouteiKeikaku = ArrayUtils.clone(arg);
  }

  public void initWkKouteiKeikaku() {
    wkKouteiKeikaku =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkKouteiKeikaku() {
  return CommonUtils.bytesToString(getWkKouteiKeikakuBytes());
  }

  public void setWkKouteiKeikaku(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkKouteiKeikakuBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkKouteiKeikakuBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkSequenceBytes() {
    return wkSequence;
  }

  public void setWkSequenceBytes(byte[] arg) {
    wkSequence = ArrayUtils.clone(arg);
  }

  public void initWkSequence() {
    wkSequence =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkSequence() {
  return CommonUtils.bytesToString(getWkSequenceBytes());
  }

  public void setWkSequence(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkSequenceBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkSequenceBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkModelBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(18);
        buffer.put(getWkKatashikiBytes());
        buffer.put(getWkKihonBytes());
        buffer.put(getWkKubunBytes());
    return buffer.array();
  }

  public void setWkModelBytes(byte[] arg) {
        setWkKatashikiBytes(ArrayUtils.subarray(arg, 0, 7));
        setWkKihonBytes(ArrayUtils.subarray(arg, 7, 10));
        setWkKubunBytes(ArrayUtils.subarray(arg, 10, 18));
  }

  public void initWkModel() {
        initWkKatashiki();
        initWkKihon();
        initWkKubun();
  }

  public String getWkModel() {
  return CommonUtils.bytesToString(getWkModelBytes());
  }

  public void setWkModel(String arg) {
  final int trailing_length = 18 - arg.length();
  if (trailing_length > 0) {
  setWkModelBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkModelBytes(CommonUtils.stringToBytes(arg.substring(0, 18)));
  }
  }

  public byte[] getWkKatashikiBytes() {
    return wkKatashiki;
  }

  public void setWkKatashikiBytes(byte[] arg) {
    wkKatashiki = ArrayUtils.clone(arg);
  }

  public void initWkKatashiki() {
    wkKatashiki =CommonUtils.stringToBytes(StringUtils.repeat(" ", 7));
  }

  public String getWkKatashiki() {
  return CommonUtils.bytesToString(getWkKatashikiBytes());
  }

  public void setWkKatashiki(String arg) {
  final int trailing_length = 7 - arg.length();
  if (trailing_length > 0) {
  setWkKatashikiBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkKatashikiBytes(CommonUtils.stringToBytes(arg.substring(0, 7)));
  }
  }

  public byte[] getWkKihonBytes() {
    return wkKihon;
  }

  public void setWkKihonBytes(byte[] arg) {
    wkKihon = ArrayUtils.clone(arg);
  }

  public void initWkKihon() {
    wkKihon =CommonUtils.stringToBytes(StringUtils.repeat(" ", 3));
  }

  public String getWkKihon() {
  return CommonUtils.bytesToString(getWkKihonBytes());
  }

  public void setWkKihon(String arg) {
  final int trailing_length = 3 - arg.length();
  if (trailing_length > 0) {
  setWkKihonBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkKihonBytes(CommonUtils.stringToBytes(arg.substring(0, 3)));
  }
  }

  public byte[] getWkKubunBytes() {
    return wkKubun;
  }

  public void setWkKubunBytes(byte[] arg) {
    wkKubun = ArrayUtils.clone(arg);
  }

  public void initWkKubun() {
    wkKubun =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getWkKubun() {
  return CommonUtils.bytesToString(getWkKubunBytes());
  }

  public void setWkKubun(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setWkKubunBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setWkKubunBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getConsAreaBytes() {
    ByteBuffer buffer = ByteBuffer.allocate(160);
        buffer.put(getCConnectBytes());
        buffer.put(getCDbcloseBytes());
        buffer.put(getCOpencr01Bytes());
        buffer.put(getCOpencr02Bytes());
        buffer.put(getCOpencr03Bytes());
        buffer.put(getCOpencr04Bytes());
        buffer.put(getCOpencr05Bytes());
        buffer.put(getCOpencr06Bytes());
        buffer.put(getCFethcr01Bytes());
        buffer.put(getCFethcr02Bytes());
        buffer.put(getCFethcr03Bytes());
        buffer.put(getCFethcr04Bytes());
        buffer.put(getCFethcr05Bytes());
        buffer.put(getCFethcr06Bytes());
        buffer.put(getCCloscr01Bytes());
        buffer.put(getCCloscr02Bytes());
        buffer.put(getCCloscr03Bytes());
        buffer.put(getCCloscr04Bytes());
        buffer.put(getCCloscr05Bytes());
        buffer.put(getCCloscr06Bytes());
    return buffer.array();
  }

  public void setConsAreaBytes(byte[] arg) {
        setCConnectBytes(ArrayUtils.subarray(arg, 0, 8));
        setCDbcloseBytes(ArrayUtils.subarray(arg, 8, 16));
        setCOpencr01Bytes(ArrayUtils.subarray(arg, 16, 24));
        setCOpencr02Bytes(ArrayUtils.subarray(arg, 24, 32));
        setCOpencr03Bytes(ArrayUtils.subarray(arg, 32, 40));
        setCOpencr04Bytes(ArrayUtils.subarray(arg, 40, 48));
        setCOpencr05Bytes(ArrayUtils.subarray(arg, 48, 56));
        setCOpencr06Bytes(ArrayUtils.subarray(arg, 56, 64));
        setCFethcr01Bytes(ArrayUtils.subarray(arg, 64, 72));
        setCFethcr02Bytes(ArrayUtils.subarray(arg, 72, 80));
        setCFethcr03Bytes(ArrayUtils.subarray(arg, 80, 88));
        setCFethcr04Bytes(ArrayUtils.subarray(arg, 88, 96));
        setCFethcr05Bytes(ArrayUtils.subarray(arg, 96, 104));
        setCFethcr06Bytes(ArrayUtils.subarray(arg, 104, 112));
        setCCloscr01Bytes(ArrayUtils.subarray(arg, 112, 120));
        setCCloscr02Bytes(ArrayUtils.subarray(arg, 120, 128));
        setCCloscr03Bytes(ArrayUtils.subarray(arg, 128, 136));
        setCCloscr04Bytes(ArrayUtils.subarray(arg, 136, 144));
        setCCloscr05Bytes(ArrayUtils.subarray(arg, 144, 152));
        setCCloscr06Bytes(ArrayUtils.subarray(arg, 152, 160));
  }

  public void initConsArea() {
        initCConnect();
        initCDbclose();
        initCOpencr01();
        initCOpencr02();
        initCOpencr03();
        initCOpencr04();
        initCOpencr05();
        initCOpencr06();
        initCFethcr01();
        initCFethcr02();
        initCFethcr03();
        initCFethcr04();
        initCFethcr05();
        initCFethcr06();
        initCCloscr01();
        initCCloscr02();
        initCCloscr03();
        initCCloscr04();
        initCCloscr05();
        initCCloscr06();
  }

  public String getConsArea() {
  return CommonUtils.bytesToString(getConsAreaBytes());
  }

  public void setConsArea(String arg) {
  final int trailing_length = 160 - arg.length();
  if (trailing_length > 0) {
  setConsAreaBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setConsAreaBytes(CommonUtils.stringToBytes(arg.substring(0, 160)));
  }
  }

  public byte[] getCConnectBytes() {
    return cConnect;
  }

  public void setCConnectBytes(byte[] arg) {
    cConnect = ArrayUtils.clone(arg);
  }

  public void initCConnect() {
    cConnect =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCConnect() {
  return CommonUtils.bytesToString(getCConnectBytes());
  }

  public void setCConnect(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCConnectBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCConnectBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCDbcloseBytes() {
    return cDbclose;
  }

  public void setCDbcloseBytes(byte[] arg) {
    cDbclose = ArrayUtils.clone(arg);
  }

  public void initCDbclose() {
    cDbclose =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCDbclose() {
  return CommonUtils.bytesToString(getCDbcloseBytes());
  }

  public void setCDbclose(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCDbcloseBytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCDbcloseBytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCOpencr01Bytes() {
    return cOpencr01;
  }

  public void setCOpencr01Bytes(byte[] arg) {
    cOpencr01 = ArrayUtils.clone(arg);
  }

  public void initCOpencr01() {
    cOpencr01 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCOpencr01() {
  return CommonUtils.bytesToString(getCOpencr01Bytes());
  }

  public void setCOpencr01(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCOpencr01Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCOpencr01Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCOpencr02Bytes() {
    return cOpencr02;
  }

  public void setCOpencr02Bytes(byte[] arg) {
    cOpencr02 = ArrayUtils.clone(arg);
  }

  public void initCOpencr02() {
    cOpencr02 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCOpencr02() {
  return CommonUtils.bytesToString(getCOpencr02Bytes());
  }

  public void setCOpencr02(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCOpencr02Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCOpencr02Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCOpencr03Bytes() {
    return cOpencr03;
  }

  public void setCOpencr03Bytes(byte[] arg) {
    cOpencr03 = ArrayUtils.clone(arg);
  }

  public void initCOpencr03() {
    cOpencr03 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCOpencr03() {
  return CommonUtils.bytesToString(getCOpencr03Bytes());
  }

  public void setCOpencr03(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCOpencr03Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCOpencr03Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCOpencr04Bytes() {
    return cOpencr04;
  }

  public void setCOpencr04Bytes(byte[] arg) {
    cOpencr04 = ArrayUtils.clone(arg);
  }

  public void initCOpencr04() {
    cOpencr04 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCOpencr04() {
  return CommonUtils.bytesToString(getCOpencr04Bytes());
  }

  public void setCOpencr04(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCOpencr04Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCOpencr04Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCOpencr05Bytes() {
    return cOpencr05;
  }

  public void setCOpencr05Bytes(byte[] arg) {
    cOpencr05 = ArrayUtils.clone(arg);
  }

  public void initCOpencr05() {
    cOpencr05 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCOpencr05() {
  return CommonUtils.bytesToString(getCOpencr05Bytes());
  }

  public void setCOpencr05(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCOpencr05Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCOpencr05Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCOpencr06Bytes() {
    return cOpencr06;
  }

  public void setCOpencr06Bytes(byte[] arg) {
    cOpencr06 = ArrayUtils.clone(arg);
  }

  public void initCOpencr06() {
    cOpencr06 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCOpencr06() {
  return CommonUtils.bytesToString(getCOpencr06Bytes());
  }

  public void setCOpencr06(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCOpencr06Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCOpencr06Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCFethcr01Bytes() {
    return cFethcr01;
  }

  public void setCFethcr01Bytes(byte[] arg) {
    cFethcr01 = ArrayUtils.clone(arg);
  }

  public void initCFethcr01() {
    cFethcr01 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCFethcr01() {
  return CommonUtils.bytesToString(getCFethcr01Bytes());
  }

  public void setCFethcr01(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCFethcr01Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCFethcr01Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCFethcr02Bytes() {
    return cFethcr02;
  }

  public void setCFethcr02Bytes(byte[] arg) {
    cFethcr02 = ArrayUtils.clone(arg);
  }

  public void initCFethcr02() {
    cFethcr02 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCFethcr02() {
  return CommonUtils.bytesToString(getCFethcr02Bytes());
  }

  public void setCFethcr02(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCFethcr02Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCFethcr02Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCFethcr03Bytes() {
    return cFethcr03;
  }

  public void setCFethcr03Bytes(byte[] arg) {
    cFethcr03 = ArrayUtils.clone(arg);
  }

  public void initCFethcr03() {
    cFethcr03 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCFethcr03() {
  return CommonUtils.bytesToString(getCFethcr03Bytes());
  }

  public void setCFethcr03(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCFethcr03Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCFethcr03Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCFethcr04Bytes() {
    return cFethcr04;
  }

  public void setCFethcr04Bytes(byte[] arg) {
    cFethcr04 = ArrayUtils.clone(arg);
  }

  public void initCFethcr04() {
    cFethcr04 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCFethcr04() {
  return CommonUtils.bytesToString(getCFethcr04Bytes());
  }

  public void setCFethcr04(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCFethcr04Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCFethcr04Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCFethcr05Bytes() {
    return cFethcr05;
  }

  public void setCFethcr05Bytes(byte[] arg) {
    cFethcr05 = ArrayUtils.clone(arg);
  }

  public void initCFethcr05() {
    cFethcr05 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCFethcr05() {
  return CommonUtils.bytesToString(getCFethcr05Bytes());
  }

  public void setCFethcr05(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCFethcr05Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCFethcr05Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCFethcr06Bytes() {
    return cFethcr06;
  }

  public void setCFethcr06Bytes(byte[] arg) {
    cFethcr06 = ArrayUtils.clone(arg);
  }

  public void initCFethcr06() {
    cFethcr06 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCFethcr06() {
  return CommonUtils.bytesToString(getCFethcr06Bytes());
  }

  public void setCFethcr06(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCFethcr06Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCFethcr06Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCCloscr01Bytes() {
    return cCloscr01;
  }

  public void setCCloscr01Bytes(byte[] arg) {
    cCloscr01 = ArrayUtils.clone(arg);
  }

  public void initCCloscr01() {
    cCloscr01 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCCloscr01() {
  return CommonUtils.bytesToString(getCCloscr01Bytes());
  }

  public void setCCloscr01(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCCloscr01Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCCloscr01Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCCloscr02Bytes() {
    return cCloscr02;
  }

  public void setCCloscr02Bytes(byte[] arg) {
    cCloscr02 = ArrayUtils.clone(arg);
  }

  public void initCCloscr02() {
    cCloscr02 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCCloscr02() {
  return CommonUtils.bytesToString(getCCloscr02Bytes());
  }

  public void setCCloscr02(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCCloscr02Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCCloscr02Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCCloscr03Bytes() {
    return cCloscr03;
  }

  public void setCCloscr03Bytes(byte[] arg) {
    cCloscr03 = ArrayUtils.clone(arg);
  }

  public void initCCloscr03() {
    cCloscr03 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCCloscr03() {
  return CommonUtils.bytesToString(getCCloscr03Bytes());
  }

  public void setCCloscr03(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCCloscr03Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCCloscr03Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCCloscr04Bytes() {
    return cCloscr04;
  }

  public void setCCloscr04Bytes(byte[] arg) {
    cCloscr04 = ArrayUtils.clone(arg);
  }

  public void initCCloscr04() {
    cCloscr04 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCCloscr04() {
  return CommonUtils.bytesToString(getCCloscr04Bytes());
  }

  public void setCCloscr04(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCCloscr04Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCCloscr04Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCCloscr05Bytes() {
    return cCloscr05;
  }

  public void setCCloscr05Bytes(byte[] arg) {
    cCloscr05 = ArrayUtils.clone(arg);
  }

  public void initCCloscr05() {
    cCloscr05 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCCloscr05() {
  return CommonUtils.bytesToString(getCCloscr05Bytes());
  }

  public void setCCloscr05(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCCloscr05Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCCloscr05Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
  }
  }

  public byte[] getCCloscr06Bytes() {
    return cCloscr06;
  }

  public void setCCloscr06Bytes(byte[] arg) {
    cCloscr06 = ArrayUtils.clone(arg);
  }

  public void initCCloscr06() {
    cCloscr06 =CommonUtils.stringToBytes(StringUtils.repeat(" ", 8));
  }

  public String getCCloscr06() {
  return CommonUtils.bytesToString(getCCloscr06Bytes());
  }

  public void setCCloscr06(String arg) {
  final int trailing_length = 8 - arg.length();
  if (trailing_length > 0) {
  setCCloscr06Bytes(CommonUtils.stringToBytes(arg + StringUtils.repeat(" ", trailing_length)));
  } else {
  setCCloscr06Bytes(CommonUtils.stringToBytes(arg.substring(0, 8)));
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
  sys031 = getRepository("SYS031");
  sys032 = getRepository("SYS032");
  sys033 = getRepository("SYS033");
  sys034 = getRepository("SYS034");
  sys035 = getRepository("SYS035");
  sys036 = getRepository("SYS036");
  sysin = getRepository("SYSIN");

_init();
  opicsSharyouDbDumpShori();
}

  protected abstract void _init() throws Exception;

  protected abstract void opicsSharyouDbDumpShori() throws Exception;

  protected abstract void kaishiShori() throws Exception;

  protected abstract void parameterSakuseiLoop() throws Exception;

  protected abstract void statusDbDumpShori() throws Exception;

  protected abstract void statusDbDumpLoop() throws Exception;

  protected abstract void statusDbLocateShori() throws Exception;

  protected abstract void statusDbInputShori() throws Exception;

  protected abstract void statusFlHenshuOutShori() throws Exception;

  protected abstract void shiyouBetsuDbDumpShori() throws Exception;

  protected abstract void shiyouBetsuDbDumpLoop() throws Exception;

  protected abstract void shiyouBetsuDbLocateShori() throws Exception;

  protected abstract void shiyouBetsuDbInputShori() throws Exception;

  protected abstract void shiyouBetsuHenshuOutShori() throws Exception;

  protected abstract void shakeiBetsuDbDumpShori() throws Exception;

  protected abstract void shakeiBetsuDbDumpLoop() throws Exception;

  protected abstract void shakeiBetsuDbLocateShori() throws Exception;

  protected abstract void shakeiBetsuDbInputShori() throws Exception;

  protected abstract void shakeiBetsuHenshuOutShori() throws Exception;

  protected abstract void jikeiRetsuDbDumpShori() throws Exception;

  protected abstract void jikeiRetsuDbDumpLoop() throws Exception;

  protected abstract void jikeiRetsuDbLocateShori() throws Exception;

  protected abstract void jikeiRetsuDbInputShori() throws Exception;

  protected abstract void jikeiRetsuHenshuOutShori() throws Exception;

  protected abstract void kouteiKeikakuDbDumpShori() throws Exception;

  protected abstract void kouteiKeikakuDbDumpLoop() throws Exception;

  protected abstract void kouteiKeikakuDbLocateShori() throws Exception;

  protected abstract void kouteiKeikakuDbInputShori() throws Exception;

  protected abstract void kouteikeikakuHenshuOutShori() throws Exception;

  protected abstract void sequenceDbDumpShori() throws Exception;

  protected abstract void sequenceDbDumpLoop() throws Exception;

  protected abstract void sequenceDbLocateShori() throws Exception;

  protected abstract void sequenceDbInputShori() throws Exception;

  protected abstract void sequenceHenshuOutShori() throws Exception;

  protected abstract void shuryoShori() throws Exception;

  protected abstract void connectShori() throws Exception;

  protected abstract void _181Closcr01Shori() throws Exception;

  protected abstract void _181Opencr01Shori() throws Exception;

  protected abstract void _181Fethcr01Shori() throws Exception;

  protected abstract void _182Closcr02Shori() throws Exception;

  protected abstract void _182Opencr02Shori() throws Exception;

  protected abstract void _182Fethcr02Shori() throws Exception;

  protected abstract void _183Closcr03Shori() throws Exception;

  protected abstract void _183Opencr03Shori() throws Exception;

  protected abstract void _183Fethcr03Shori() throws Exception;

  protected abstract void _184Closcr04Shori() throws Exception;

  protected abstract void _184Opencr04Shori() throws Exception;

  protected abstract void _184Fethcr04Shori() throws Exception;

  protected abstract void _185Closcr05Shori() throws Exception;

  protected abstract void _185Opencr05Shori() throws Exception;

  protected abstract void _185Fethcr05Shori() throws Exception;

  protected abstract void _180Closcr06Shori() throws Exception;

  protected abstract void _180Opencr06Shori() throws Exception;

  protected abstract void _180Fethcr06Shori() throws Exception;

  protected abstract void dbCloseShori() throws Exception;

  protected abstract void adabasErrorShori() throws Exception;

  protected abstract void openCr01() throws Exception;

  protected abstract void eOpenCr01() throws Exception;

  protected abstract void fetchCr01() throws Exception;

  protected abstract void eFetchCr01() throws Exception;

  protected abstract void closeCr01() throws Exception;

  protected abstract void eCloseCr01() throws Exception;

  protected abstract void openCr02() throws Exception;

  protected abstract void eOpenCr02() throws Exception;

  protected abstract void fetchCr02() throws Exception;

  protected abstract void eFetchCr02() throws Exception;

  protected abstract void closeCr02() throws Exception;

  protected abstract void eCloseCr02() throws Exception;

  protected abstract void openCr03() throws Exception;

  protected abstract void eOpenCr03() throws Exception;

  protected abstract void fetchCr03() throws Exception;

  protected abstract void eFetchCr03() throws Exception;

  protected abstract void closeCr03() throws Exception;

  protected abstract void eCloseCr03() throws Exception;

  protected abstract void openCr04() throws Exception;

  protected abstract void eOpenCr04() throws Exception;

  protected abstract void fetchCr04() throws Exception;

  protected abstract void eFetchCr04() throws Exception;

  protected abstract void closeCr04() throws Exception;

  protected abstract void eCloseCr04() throws Exception;

  protected abstract void openCr05() throws Exception;

  protected abstract void eOpenCr05() throws Exception;

  protected abstract void fetchCr05() throws Exception;

  protected abstract void eFetchCr05() throws Exception;

  protected abstract void closeCr05() throws Exception;

  protected abstract void eCloseCr05() throws Exception;

  protected abstract void openCr06() throws Exception;

  protected abstract void eOpenCr06() throws Exception;

  protected abstract void fetchCr06() throws Exception;

  protected abstract void eFetchCr06() throws Exception;

  protected abstract void closeCr06() throws Exception;

  protected abstract void eCloseCr06() throws Exception;
}
