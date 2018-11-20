package com.yl.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 杨黎
 * @Title   HelloController
 * @description
 * @DATE 2018/11/8  15:36
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    @RequestMapping(value = "/helloSecurity", method = RequestMethod.GET)
    public String helloSercutiry(){
        return "helloSecurity";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("host","www.goudan.com");
        return "index";
    }

    @RequestMapping("/exception")
    public  String exception() throws Exception {
        throw new Exception("发生错误");
    }
}
