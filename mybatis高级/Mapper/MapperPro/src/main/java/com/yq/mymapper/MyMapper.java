package com.yq.mymapper;

import com.yq.entity.Student;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;

public interface MyMapper<T>   extends Mapper<T> , MyBatchInsertMapper<T>{
}
