// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.common.sort.rsort;

import java.util.Comparator;
import java.util.List;

public class RsortComparator implements Comparator<String> {

  private List<RsortKey> parameters;

  public RsortComparator(List<RsortKey> parameters) {
    this.parameters = parameters;
  }

  @Override
  public int compare(String o1, String o2) {
    for (RsortKey parameter: parameters) {
      final int begin = parameter.getOffset();
      final int end = parameter.getOffset() + parameter.getLength();

      final String lhs = o1.substring(begin, end);
      final String rhs = o2.substring(begin, end);

      int result = lhs.compareTo(rhs);
      if (RsortKeyAttribute.RJ.equals(parameter.getAttribute())) {
        result *= -1;
      }
      if (result != 0) {
        return result;
      }
    }

    return 0;
  }
}
