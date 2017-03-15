package com.demo.test;

import com.demo.exception.CustomException;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-03-15.
 */
@Component("arithInterface")
public class ArithImpl implements ArithInterface{

    public int add(int i, int j) {
        int result=i+j;
        System.out.println("in the target class result:"+result);
        return result;
    }

    public int div(int i, int j) {
        int result=0;
        try {
            result=i/j;
            System.out.println("in the target class result:"+result);
        } catch (Exception e) {
            throw new CustomException("出错了："+e);
        }
        return result;
    }
}
