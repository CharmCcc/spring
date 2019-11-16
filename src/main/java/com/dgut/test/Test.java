package com.dgut.test;

import com.dgut.entity.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println(student);

        //加载配置文件，即自己写的spring.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)applicationContext.getBean(Student.class);
        System.out.println(student);


    }
}
