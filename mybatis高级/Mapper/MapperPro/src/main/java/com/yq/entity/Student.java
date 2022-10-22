package com.yq.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="tb_student")
public class Student implements Serializable {
    //主键： 必须 包装类  ，不能是基本类型
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @KeySql(sql = "select SEQ_stu.nextval from dual", order = ORDER.BEFORE)
    private Integer stuNo ;//stuNo -> stu_no   null


    @Column()//属性 驼峰命名法 ->  字段 下划线形式
    private String stuName ; //stuName ->stu_name


    @Column(name="stu_age")
    private Integer stuAge ; // Integer  :0    Integereger：null


    //持久化  student->库
    //瞬态 (内存)
    @Transient
    private String other ;///other


    public Student( ) {
    }
    //身份证   学号
    public Student( String stuName, Integer stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }


    public Student(Integer stuNo, String stuName, Integer stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }


    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {

        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
