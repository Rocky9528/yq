package com.yq.test;

import com.yq.entity.TbStudent;
import com.yq.mapper.TbStudentMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public class Test {
    public static void testQuery(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TbStudentMapper studentMapper =context.getBean("tbStudentMapper", TbStudentMapper.class) ;
//        List<TbStudent> students = studentMapper.selectAll();
//        System.out.println(students);
        Example example = new Example(TbStudent.class);

        //order
        example.setDistinct(true);
        example.orderBy("stuName").desc().orderBy("stuNo").asc();
        example.selectProperties("stuName","stuNo");

        //MyBatis:QBC
        //select  distinct ..stuno,stname...... where  (stu_No>=1  and stu_no <=10) or (stu_name like '%s%');


//       SELECT distinct stu_name , stu_no FROM tb_student WHERE ( ( stu_no >= ? and stu_no <= ? ) or ( stu_name like ? ) ) order by stu_name DESC,stu_no ASC
//        DEBUG [main] - ==> Parameters: 1(Integer), 10(Integer), s(String)
        Example.Criteria c1 = example.createCriteria();
        c1.andGreaterThanOrEqualTo("stuNo",1  ) ;
        c1.andLessThanOrEqualTo("stuNo",10 ) ;


        Example.Criteria c2 = example.createCriteria();
        c2.andLike("stuName","%s%");
        //example = example.or(c1.c2) ;
        //example =c1.or(c2) ;

         example.or(c2) ;

        List<TbStudent> tbStudents = studentMapper.selectByExample(example);//Wrapper :MP
        System.out.println(tbStudents);

    }

    public static void main(String[] args)  throws Exception{
        testQuery();
    }

}
