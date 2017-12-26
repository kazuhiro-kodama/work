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
        columnList = "PLNT_CD,END_ITM_CD,TRM_LINE_CLSS,STTS_PNT_CD,",
        unique = false,
        name = "SP_SHIYOU_KEY_1_182"
      ),
      @Index(
        columnList = "PLNT_CD,TRM_LINE_CLSS,DMSTC_EXPRT_CLSS,END_ITM_CD,STTS_PNT_CD,",
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

  @Column(name = "PLNT_CD", nullable = false, length = 1)
  private String plntCd = " ";

  @Column(name = "END_ITM_CD", nullable = false, length = 18)
  private String endItmCd = " ";

  @Column(name = "CLR_CD_EX_NO_CLMN", nullable = true, length = 9)
  private String clrCdExNoClmn = " ";

  @Column(name = "TRM_LINE_CLSS", nullable = false, length = 1)
  private String trmLineClss = " ";

  @Column(name = "DMSTC_EXPRT_CLSS", nullable = false, length = 1)
  private String dmstcExprtClss = " ";

  @Column(name = "TRGT_PRDTCN_YM", nullable = true, length = 4)
  private String trgtPrdtcnYm = " ";

  @Column(name = "STTS_PNT_CD", nullable = false, length = 2)
  private String sttsPntCd = " ";

  @Column(name = "ACTL_N_MNS1_MNTH_PRDCTN_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal actlNMns1MnthPrdctnQty = new BigDecimal(0);

  @Column(name = "ACTL_N_MNTH_PRDCTN_QTY", nullable = true, length = 252)
  private String actlNMnthPrdctnQty = " ";

  @Column(name = "ACTL_N_PLS1_MNTH_PRDCTN_QTY", nullable = true, length = 164)
  private String actlNPls1MnthPrdctnQty = " ";

  @Column(name = "N_MNS2_MNTH_TTL_VLNC_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns2MnthTtlVlncQty = new BigDecimal(0);

  @Column(name = "PLN_N_MNS1_MNTH_PRDCTN_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal plnNMns1MnthPrdctnQty = new BigDecimal(0);

  @Column(name = "N_MNS1_MNTH_TTL_VLNC_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns1MnthTtlVlncQty = new BigDecimal(0);

  @Column(name = "PLN_N_MNTH_PRDCTN_QTY", nullable = true, length = 252)
  private String plnNMnthPrdctnQty = " ";

  @Column(name = "PLN_N_PLS1_MNTH_PRDCTN_QTY", nullable = true, length = 164)
  private String plnNPls1MnthPrdctnQty = " ";

  @Column(name = "N_MNS1_MNTH_INTRNL_TRNSFR_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns1MnthIntrnlTrnsfrQty = new BigDecimal(0);

  @Column(name = "N_MNTH_INTRNL_TRNSFR_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmnthIntrnlTrnsfrQty = new BigDecimal(0);

  @Column(name = "N_PLS1_MNTH_INTRNL_TRNSFR_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal npls1MnthIntrnlTrnsfrQty = new BigDecimal(0);

  @Column(name = "N_MNS1_MNTH_CNSGN_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns1MnthCnsgnQty = new BigDecimal(0);

  @Column(name = "N_MNTH_CNSGN_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmnthCnsgnQty = new BigDecimal(0);

  @Column(name = "N_PLS1_MNTH_CNSGN_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal npls1MnthCnsgnQty = new BigDecimal(0);

  @Column(name = "N_MNS2_MNTH_BFR_FOK_STCK_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns2MnthBfrFokStckQty = new BigDecimal(0);

  @Column(name = "N_MNS1_MNTH_BFR_FOK_STCK_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns1MnthBfrFokStckQty = new BigDecimal(0);

  @Column(name = "N_MNS2_MNTH_FOK_STCK_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns2MnthFokStckQty = new BigDecimal(0);

  @Column(name = "N_MNS1_MNTH_FOK_STCK_QTY", nullable = true, precision = 5, scale = 0)
  private BigDecimal nmns1MnthFokStckQty = new BigDecimal(0);

}
