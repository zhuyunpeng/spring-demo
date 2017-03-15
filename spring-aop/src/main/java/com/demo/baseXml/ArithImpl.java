package com.demo.baseXml;

import com.demo.exception.CustomException;

/**
 * Created by Administrator on 2017-03-15.
 */
public class ArithImpl implements ArithInterface {

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
