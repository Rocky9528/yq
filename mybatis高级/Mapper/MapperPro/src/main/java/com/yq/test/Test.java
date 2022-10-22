package com.yq.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yq.entity.Student;
import com.yq.mapper.StudentMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.util.*;

public class Test {

    public static void testQuery4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;
        Student student = studentMapper.selectByPrimaryKey(1);

        System.out.println("**************"+student);

    }
    public static void testQuery(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;
//        List<Student> students = studentMapper.selectAll();
//        System.out.println(students);
        Student student = studentMapper.selectByPrimaryKey(1);
        System.out.println("**************"+student);

        Student student2 = studentMapper.selectByPrimaryKey(1);
        System.out.println("**************"+student2);

    }
    public static void testQuery2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;
        Student stu = new Student();
        stu.setStuName("ls0");
        stu.setStuAge(20);

        Student student = studentMapper.selectOne(stu);//MP :wrapper    ..where stuno =.. stu...
        System.out.println(student);

    }
    public static void testQuery3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;
        Student stu = new Student();
        stu.setStuName("ls0");
        stu.setStuAge(20);
//        studentMapper.selectOne(stu);
        studentMapper.mySelect(stu);

//        Student stu = new Student();
//        stu.setStuName("ls0");
//        stu.setStuAge(20);
        //分页：假分页
//        Student student = studentMapper.selectByRowBounds();
//        System.out.println(student);

    }

    public static void testInsert(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;
        Student stu = new Student("ls0",20);
//        studentMapper.insert(stu);
        System.out.println(stu.getStuNo());
    }

    public static void testInsert2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;

        Student stu = new Student();
        stu.setStuName("y");

        //stu_no , stu_name
//        studentMapper.insertSelective(stu);
    }
    public static void testUpdate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;

        Student stu = new Student();
        stu.setStuNo(2);
        stu.setStuName("y");

//        studentMapper.updateByPrimaryKey(stu);
//        studentMapper.updateByPrimaryKeySelective(stu);

    }

    public static void main(String[] args)  throws Exception{
        testQuery3();
//        testQuery();
//        testQuery4();
//        testInsert();
//        testQuery2();
//        testQuery3();
//        testInsert2();
//        testUpdate();
    }

}
