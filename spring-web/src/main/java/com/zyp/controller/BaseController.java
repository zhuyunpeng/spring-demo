package com.zyp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 朱云鹏 on 2017/3/6.
 */
@Controller
public class BaseController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
