package com.yq.mapper;

import com.yq.entity.Student;
import com.yq.my.MyMapper;
import tk.mybatis.mapper.common.Mapper;

//开启二级缓存
//@CacheNamespace
//public interface StudentMapper    extends Mapper<Student> {
public interface StudentMapper    extends MyMapper<Student> {
    //add ->mapper.xml
}


//自定义组件：1。开发自定义   2.配置（配置程序 不要在使用默认值了，用自定的）









