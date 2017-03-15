package com.demo.baseXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-03-15.
 */
public class XmlMain {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-aop-xml.xml");
        ArithInterface a= (ArithInterface) ctx.getBean("arithInterface");
        a.div(1,1);
    }
}
