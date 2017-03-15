package com.demo.test;

import com.demo.exception.CustomException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Administrator on 2017-03-15.
 *
 *
 *
 */

@Aspect
@Component
public class LoggingProxy {

    //前置通知
    @Before("execution(public int com.demo.test.ArithInterface.*(int,int))")
    public void beforeAdd(JoinPoint joinPoint){


        String methodName=joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();

        System.out.println("the method "+methodName+"() starts with parameter "+ Arrays.asList(args));


    }

    //返回通知,可以有结果需要returning标签进行显示，程序异常不会返回结果
    @AfterReturning(value="execution(public int com.demo.test.ArithInterface.*(int,int))",returning ="result" )
    public void returnAdd(JoinPoint joinPoint,Object result){
        String methodName=joinPoint.getSignature().getName();

        System.out.println("the method "+methodName+"() returning with:"+result);

    }

    //后置通知，不管程序是否异常都会执行，类似try..catch块中的finally最终都会执行,没有返回结果
    @After("execution(public int com.demo.test.ArithInterface.*(int,int))")
    public void afterLog(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the method "+methodName+"() after ends");
    }
    /**
     * 在目标方法出现异常时会执行的代码.
     * 可以访问到异常对象; 且可以指定在出现特定异常时在执行通知代码
     */
    @AfterThrowing(value="execution(public int com.demo.test.ArithInterface.*(int,int))",throwing = "e")
    public void throwException(JoinPoint joinPoint,Exception e){

        String methodName=joinPoint.getSignature().getName();
        System.out.println("the method "+methodName+"() exception occurs: "+e);

    }

    /**
     * 环绕通知需要携带 ProceedingJoinPoint 类型的参数.
     * 环绕通知类似于动态代理的全过程: ProceedingJoinPoint 类型的参数可以决定是否执行目标方法.
     * 且环绕通知必须有返回值, 返回值即为目标方法的返回值
     */
//    @Around("execution(public int com.demo.test.ArithInterface.*(int,int))")
//    public Object around(ProceedingJoinPoint pjd){
//
//
//        Object result = null;
//        String methodName = pjd.getSignature().getName();
//
//        try {
//            //前置通知
//            System.out.println("The method " + methodName + " begins with " + Arrays.asList(pjd.getArgs()));
//            //执行目标方法
//            result = pjd.proceed();
//            //返回通知
//            System.out.println("The method " + methodName + " ends with " + result);
//        } catch (Throwable e) {
//            //异常通知
//            System.out.println("The method " + methodName + " occurs exception:" + e);
//            throw new CustomException(e);
//        }
//        //后置通知
//        System.out.println("The method " + methodName + " ends");
//
//        return result;
//
//    }


}
