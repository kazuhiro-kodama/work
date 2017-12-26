// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.common.sort.rsort;

import lombok.Data;

@Data
public class RsortKey {

  private final RsortKeyAttribute attribute;

  private final int offset;

  private final int length;
}
