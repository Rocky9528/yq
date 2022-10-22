package com.yq.my;

import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;


public interface MySelectMapper<T>  {
    @SelectProvider(
            type = MySelectProvider.class,
            method = "dynamicSQL"
    )
    T mySelect(T var1);//select *from ...
}


