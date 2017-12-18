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
import com.hitachi.pcs.data.sam.repository.FileOpenMode;

@Component
@Scope("prototype")
public class E62x20 extends E62x20Base {

  @Override
  protected void _init() throws Exception {
  }

  @Override
  protected void mainShori() throws Exception {
    kaisiShori();
    setI1EofSw(getOffCode());
    seihanShiyouBetsuFlInshori();
    while (!(isI1Eof())) {
    catsShiyouBetsuFlSakusei();
    }
    shuryoShori();
    return;
  }

  @Override
  protected void kaisiShori() throws Exception {
    getI1SeihanShiyouBetsuFl().open(FileOpenMode.INPUT, getSys011Rec().length());
    getO1CatsShiyouBetsuFl().open(FileOpenMode.OUTPUT, getSys031Rec().length());
    setI1NseqKey(StringUtils.repeat("\u0000", getI1NseqKey().length()));
  }

  @Override
  protected void seihanShiyouBetsuFlInshori() throws Exception {
    if (!(getI1SeihanShiyouBetsuFl().isEnd())) {
    setI1SeihanShiyouBetsuRec(getI1SeihanShiyouBetsuFl().read());
    dcpenv.setRetcd1("NML");
    } else {
    dcpenv.setRetcd1("EOF ");
    }
    if (CommonUtils.compareString(dcpenv.getRetcd1(), "EOF") == 0) {
    setI1EofSw(getOnCode());
    }
    if (!( isI1Eof() )) {
    setI1OseqKey(getI1NseqKey());
    setI1NseqKojoKubun(getI1KoujouKubun());
    setI1NseqShashu(getI1Shashu());
    setI1NseqLine1keta(getI1Shimo1keta());
    setI1NseqToshoku(getI1Toshoku());
    setI1NseqUchibari(getI1Uchibari());
    setI1NseqExNo(getI1ExNo());
    setI1NseqKouteiShikibetsu(getI1KouteiShikibetsu());
    if (CommonUtils.compareString(getI1NseqKey(), getI1OseqKey()) <= 0) {
    /* System.out.println("ｾｲﾊﾝｼﾖｳﾍﾞﾂ ﾌｧｲﾙ ｼｰｹﾝｽﾀﾞｳﾝ"); */
    /* System.out.println("**OLD KEY = " + getI1OseqKey()); */
    /* System.out.println("**NEW KEY = " + getI1NseqKey()); */
    {
    call(termdump);
    }
    }
    }
    if (!( isI1Eof() )) {
    setI1NsamKoujouKubun(getI1KoujouKubun());
    setI1NsamShashu(getI1Shashu());
    setI1NsamLine1keta(getI1Shimo1keta());
    setI1NsamToshoku(getI1Toshoku());
    setI1NsamUchibari(getI1Uchibari());
    setI1NsamExNo(getI1ExNo());
    } else {
    setI1NsamKey(StringUtils.repeat("\uFFFF", getI1NsamKey().length()));
    }
  }

  @Override
  protected void catsShiyouBetsuFlSakusei() throws Exception {
    seihanShiyouShokiShori();
    setI1OsamKey(getI1NsamKey());
    while (!(CommonUtils.compareString(getI1NsamKey(), getI1OsamKey()) != 0)) {
    seihanSamShoriLoop();
    }
    o1RecOutShori();
  }

  @Override
  protected void seihanShiyouShokiShori() throws Exception {
    initO1CatsShiyouBetsuRec();
    setO1KoujouKubun(getI1KoujouKubun());
    setO1Shashu(getI1Shashu());
    setO1Toshoku(getI1Toshoku());
    setO1Uchibari(getI1Uchibari());
    setO1ExNo(getI1ExNo());
    setO1TrimLine(getI1Shimo1keta());
    setO1KokuyuKubun(getI1KokuyuKubun());
    setO1KeikakuNengetsu(getI1TaishouNengetsu());
  }

  @Override
  protected void seihanSamShoriLoop() throws Exception {
    seihanSamShori();
    seihanShiyouBetsuFlInshori();
  }

  @Override
  protected void seihanSamShori() throws Exception {
    if (CommonUtils.compareString(getI1KouteiShikibetsu(), "10") == 0) {
    offLineShori();
    setO1OffGettoRuisa(getI1ZengetsuMatsuRuisa());
    } else {
    if (( CommonUtils.compareString(getI1KouteiShikibetsu(), "15") == 0 && CommonUtils.compareString(getI1KoujouKubun(), "?") == 0 ) || ( CommonUtils.compareString(getI1KouteiShikibetsu(), "20") == 0 && CommonUtils.compareString(getI1KoujouKubun(), "?") != 0 )) {
    finalShori();
    setO1FinGettoRuisa(getI1ZengetsuMatsuRuisa());
    } else {
    if (CommonUtils.compareString(getI1KouteiShikibetsu(), "30") == 0) {
    setO1MikenZaiko(getI1ZenGetsuMiken());
    setO1IkanShikyuTougetsu(getO1IkanShikyuTougetsu() + getI1TougetsuRuikeiIkan());
    setO1IkanShikyuJigetsu(getO1IkanShikyuJigetsu() + getI1JigetsuRuikeiIkan());
    setO1IkanShikyuTougetsu(getO1IkanShikyuTougetsu() + getI1TougetsuShikyu());
    setO1IkanShikyuJigetsu(getO1IkanShikyuJigetsu() + getI1ZigetsuShikyu());
    } else {
    if (CommonUtils.compareString(getI1KouteiShikibetsu(), "50") == 0) {
    shaukeShori();
    setO1KankenZaiko(getI1ZenGetsuKanken());
    }
    }
    }
    }
  }

  @Override
  protected void offLineShori() throws Exception {
    setO1OffJissekiTougetsuDaisu((int)(1 - 1), getI1TougetsuJisseki10() + getI1TougetsuJisseki1((int)(1 - 1)) + getI1TougetsuJisseki2((int)(1 - 1)));;
    setO1OffJissekiJigetsuDaisu((int)(1 - 1), getI1JigetsuJisseki10() + getI1JigetsuJisseki1((int)(1 - 1)) + getI1JigetsuJisseki2((int)(1 - 1)));;
    setO1OffKeikakuTougetsuDaisu((int)(1 - 1), getI1TougetsuKeikaku10() + getI1TougetsuKeikaku1((int)(1 - 1)) + getI1TougetsuKeikaku2((int)(1 - 1)));;
    setO1OffKeikakuJigetsuDaisu((int)(1 - 1), getI1JigetsuKeikaku10() + getI1JigetsuKeikaku1((int)(1 - 1)) + getI1JigetsuKeikaku2((int)(1 - 1)));;
    setI1Ctr(2);
    while (!(getI1Ctr() > 31)) {
    setO1OffJissekiTougetsuDaisu((int)(getI1Ctr() - 1), getI1TougetsuJisseki1((int)(getI1Ctr() - 1)) + getI1TougetsuJisseki2((int)(getI1Ctr() - 1)));;
    setO1OffKeikakuTougetsuDaisu((int)(getI1Ctr() - 1), getI1TougetsuKeikaku1((int)(getI1Ctr() - 1)) + getI1TougetsuKeikaku2((int)(getI1Ctr() - 1)));;
    setI1Ctr(getI1Ctr() + 1);
    }
    setI1Ctr(2);
    while (!(getI1Ctr() > 20)) {
    setO1OffJissekiJigetsuDaisu((int)(getI1Ctr() - 1), getI1JigetsuJisseki1((int)(getI1Ctr() - 1)) + getI1JigetsuJisseki2((int)(getI1Ctr() - 1)));;
    setO1OffKeikakuJigetsuDaisu((int)(getI1Ctr() - 1), getI1JigetsuKeikaku1((int)(getI1Ctr() - 1)) + getI1JigetsuKeikaku2((int)(getI1Ctr() - 1)));;
    setI1Ctr(getI1Ctr() + 1);
    }
  }

  @Override
  protected void finalShori() throws Exception {
    setO1FinJissekiTougetsuDaisu((int)(1 - 1), getI1TougetsuJisseki10() + getI1TougetsuJisseki1((int)(1 - 1)) + getI1TougetsuJisseki2((int)(1 - 1)));;
    setO1FinJissekiJigetsuDaisu((int)(1 - 1), getI1JigetsuJisseki10() + getI1JigetsuJisseki1((int)(1 - 1)) + getI1JigetsuJisseki2((int)(1 - 1)));;
    setO1FinKeikakuTougetsuDaisu((int)(1 - 1), getI1TougetsuKeikaku10() + getI1TougetsuKeikaku1((int)(1 - 1)) + getI1TougetsuKeikaku2((int)(1 - 1)));;
    setO1FinKeikakuJigetsuDaisu((int)(1 - 1), getI1JigetsuKeikaku10() + getI1JigetsuKeikaku1((int)(1 - 1)) + getI1JigetsuKeikaku2((int)(1 - 1)));;
    setI1Ctr(2);
    while (!(getI1Ctr() > 31)) {
    setO1FinJissekiTougetsuDaisu((int)(getI1Ctr() - 1), getI1TougetsuJisseki1((int)(getI1Ctr() - 1)) + getI1TougetsuJisseki2((int)(getI1Ctr() - 1)));;
    setO1FinKeikakuTougetsuDaisu((int)(getI1Ctr() - 1), getI1TougetsuKeikaku1((int)(getI1Ctr() - 1)) + getI1TougetsuKeikaku2((int)(getI1Ctr() - 1)));;
    setI1Ctr(getI1Ctr() + 1);
    }
    setI1Ctr(2);
    while (!(getI1Ctr() > 20)) {
    setO1FinJissekiJigetsuDaisu((int)(getI1Ctr() - 1), getI1JigetsuJisseki1((int)(getI1Ctr() - 1)) + getI1JigetsuJisseki2((int)(getI1Ctr() - 1)));;
    setO1FinKeikakuJigetsuDaisu((int)(getI1Ctr() - 1), getI1JigetsuKeikaku1((int)(getI1Ctr() - 1)) + getI1JigetsuKeikaku2((int)(getI1Ctr() - 1)));;
    setI1Ctr(getI1Ctr() + 1);
    }
  }

  @Override
  protected void tsukiBetsuShori() throws Exception {
    setO1IkanShikyuTougetsu(getI1TougetsuJisseki10());
    setI1Ctr(1);
    while (!(getI1Ctr() > 31)) {
    setO1IkanShikyuTougetsu(getI1TougetsuJisseki1((int)(getI1Ctr() - 1)) + getI1TougetsuJisseki2((int)(getI1Ctr() - 1)) + getO1IkanShikyuTougetsu());;
    setI1Ctr(getI1Ctr() + 1);
    }
    setO1IkanShikyuJigetsu(getI1JigetsuJisseki10());
    setI1Ctr(1);
    while (!(getI1Ctr() > 20)) {
    setO1IkanShikyuJigetsu(getI1JigetsuJisseki1((int)(getI1Ctr() - 1)) + getI1JigetsuJisseki2((int)(getI1Ctr() - 1)) + getO1IkanShikyuJigetsu());;
    setI1Ctr(getI1Ctr() + 1);
    }
  }

  @Override
  protected void shaukeShori() throws Exception {
    setO1ShaukeTougetsuDaisu((int)(1 - 1), getI1TougetsuJisseki10() + getI1TougetsuJisseki1((int)(1 - 1)) + getI1TougetsuJisseki2((int)(1 - 1)));;
    setI1Ctr(2);
    while (!(getI1Ctr() > 31)) {
    setO1ShaukeTougetsuDaisu((int)(getI1Ctr() - 1), getI1TougetsuJisseki1((int)(getI1Ctr() - 1)) + getI1TougetsuJisseki2((int)(getI1Ctr() - 1)));;
    setI1Ctr(getI1Ctr() + 1);
    }
    setO1ShaukeJigetsuDaisu((int)(1 - 1), getI1JigetsuJisseki10() + getI1JigetsuJisseki1((int)(1 - 1)) + getI1JigetsuJisseki2((int)(1 - 1)));;
    setI1Ctr(2);
    while (!(getI1Ctr() > 20)) {
    setO1ShaukeJigetsuDaisu((int)(getI1Ctr() - 1), getI1JigetsuJisseki1((int)(getI1Ctr() - 1)) + getI1JigetsuJisseki2((int)(getI1Ctr() - 1)));;
    setI1Ctr(getI1Ctr() + 1);
    }
  }

  @Override
  protected void o1RecOutShori() throws Exception {
    getO1CatsShiyouBetsuFl().write(getO1CatsShiyouBetsuRec());
  }

  @Override
  protected void shuryoShori() throws Exception {
    getI1SeihanShiyouBetsuFl().close();
    getO1CatsShiyouBetsuFl().close();
  }
}
