package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-03-15.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-aop.xml");
        ArithInterface a= (ArithInterface) ctx.getBean("arithInterface");

        String name=a.getClass().getName();
        System.out.println(name);

//        a.div(10,0);
        a.add(1,1);
    }
}
