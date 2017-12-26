// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.data.db.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Table(
    indexes = {
      @Index(
        columnList = "KOUJOU_KUBUN,MODEL,LINE_TRIM,KOUTEI_ID,",
        unique = false,
        name = "SP_SHIYOU_KEY_1_182"
      ),
      @Index(
        columnList = "KOUJOU_KUBUN,LINE_TRIM,KOKUYU_KUBUN,MODEL,KOUTEI_ID,",
        unique = false,
        name = "SP_SHIYOU_KEY_2_182"
      ),
    },
    name = "SHIYOU_182")
/**
 * Shiyou182 is data-entity class.
 * (Codes in this class are automatic generated).
 */
public class Shiyou182 extends DomainBase {

  @Column(name = "KOUJOU_KUBUN", nullable = false, length = 1)
  private String koujouKubun = " ";

  @Column(name = "MODEL", nullable = false, length = 18)
  private String model = " ";

  @Column(name = "COLOR_UCHIBARI_EX", nullable = true, length = 9)
  private String colorUchibariEx = " ";

  @Column(name = "LINE_TRIM", nullable = false, length = 1)
  private String lineTrim = " ";

  @Column(name = "KOKUYU_KUBUN", nullable = false, length = 1)
  private String kokuyuKubun = " ";

  @Column(name = "YYMM", nullable = true, length = 4)
  private String yymm = " ";

  @Column(name = "KOUTEI_ID", nullable = false, length = 2)
  private String kouteiId = " ";

  @Column(name = "JISSEKI_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal jissekiZengetsu = new BigDecimal(0);

  @Column(name = "JISSEKI_TOUGETSU", nullable = true, length = 252)
  private String jissekiTougetsu = " ";

  @Column(name = "JISSEKI_JIGETSU", nullable = true, length = 164)
  private String jissekiJigetsu = " ";

  @Column(name = "RUISA_ZEN_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal ruisaZenZengetsu = new BigDecimal(0);

  @Column(name = "KEIKAKU_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal keikakuZengetsu = new BigDecimal(0);

  @Column(name = "RUISA_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal ruisaZengetsu = new BigDecimal(0);

  @Column(name = "KEIKAKU_TOUGETSU", nullable = true, length = 252)
  private String keikakuTougetsu = " ";

  @Column(name = "KEIKAKU_JIGETSU", nullable = true, length = 164)
  private String keikakuJigetsu = " ";

  @Column(name = "IKAN_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal ikanZengetsu = new BigDecimal(0);

  @Column(name = "IKAN_TOUGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal ikanTougetsu = new BigDecimal(0);

  @Column(name = "IKAN_JIGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal ikanJigetsu = new BigDecimal(0);

  @Column(name = "SHIKYUU_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal shikyuuZengetsu = new BigDecimal(0);

  @Column(name = "SHIKYUU_TOUGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal shikyuuTougetsu = new BigDecimal(0);

  @Column(name = "SHIKYUU_JIGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal shikyuuJigetsu = new BigDecimal(0);

  @Column(name = "MIKEN_ZEN_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal mikenZenZengetsu = new BigDecimal(0);

  @Column(name = "MIKEN_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal mikenZengetsu = new BigDecimal(0);

  @Column(name = "KANKEN_ZEN_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal kankenZenZengetsu = new BigDecimal(0);

  @Column(name = "KANKEN_ZENGETSU", nullable = true, precision = 5, scale = 0)
  private BigDecimal kankenZengetsu = new BigDecimal(0);

}
