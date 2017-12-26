// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.common.sort.rsum;

import lombok.Data;

@Data
public class RsumAggregateItem {

  private final RsumAggregateItemAttribute attribute;

  private final int offset;

  private final int length;
}
