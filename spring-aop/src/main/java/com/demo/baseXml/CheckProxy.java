package com.demo.baseXml;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * Created by Administrator on 2017-03-15.
 */
public class CheckProxy {


    public void doSomeCheck(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();

        System.out.println("CHECK ASPECT ->the method "+methodName+"() starts with parameter "+ Arrays.asList(args));
    }
}
