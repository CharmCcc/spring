package com.dgut.test;

import com.dgut.utils.Cal;
import com.dgut.utils.impl.CalImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(1,1);
    }
}
