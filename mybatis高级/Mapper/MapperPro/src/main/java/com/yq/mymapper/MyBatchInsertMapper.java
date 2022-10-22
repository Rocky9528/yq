package com.yq.mymapper;

import org.apache.ibatis.annotations.InsertProvider;
import tk.mybatis.mapper.provider.base.BaseInsertProvider;

import java.util.List;

//自定义批量增加mapper
public interface MyBatchInsertMapper<T> {

    //批量增加的方法
    @InsertProvider(
            type = InsertBatchProvider.class,
            method = "dynamicSQL"
    )

    void insertBatch(List<T> list);

}
