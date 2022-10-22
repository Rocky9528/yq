package com.yq.my;

import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;

public interface MyMapper<T> extends BaseSelectMapper<T> , BaseDeleteMapper<T>,MySelectMapper<T> {
}
