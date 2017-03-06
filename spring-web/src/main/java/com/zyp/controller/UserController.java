package com.zyp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 朱云鹏 on 2017/3/6.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String doRegister(@RequestParam String username,@RequestParam String password){

        if("test".equals(username)&&"123".equals(password)){
            return "views/home";
        }
        return "error";
    }

}
