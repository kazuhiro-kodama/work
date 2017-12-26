// -*- coding: utf-8 -*-
//////////////////////////////////////////////////////////////////////////////
// Copyright(C) Hitachi,Ltd. 2016. All rights reserved.
//////////////////////////////////////////////////////////////////////////////

package com.hitachi.pcs.func.task.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hitachi.pcs.common.sort.rsort.RsortComparator;
import com.hitachi.pcs.common.sort.rsort.RsortKey;
import com.hitachi.pcs.common.sort.rsort.RsortKeyAttribute;

@Service
@Scope("prototype")
public final class A562061s extends SortTaskBase {

  @Override
  protected String run(List<String> arguments) throws Exception {

    List<String> sortList = getDD_SORTIN(497);
    List<RsortKey> parameters = new ArrayList<RsortKey>();

    parameters.add(new RsortKey(RsortKeyAttribute.J, 0, 19));
    parameters.add(new RsortKey(RsortKeyAttribute.J, 31, 1));
    parameters.add(new RsortKey(RsortKeyAttribute.J, 19, 9));
    parameters.add(new RsortKey(RsortKeyAttribute.J, 37, 2));

    Collections.sort(sortList, new RsortComparator(parameters));
    setDD_SORTOUT(sortList, 497);

    return "0";
  }
}
