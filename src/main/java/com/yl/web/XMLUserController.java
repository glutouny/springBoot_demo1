package com.yl.web;

import com.yl.pojo.XmlUser;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 杨黎
 * @Title   XMLUserController
 * @description 测试xml请求与响应
 * @DATE 2018/11/9  8:52
 */
@Controller
public class XMLUserController {

    @PostMapping(value = "/user",
        consumes = MediaType.APPLICATION_XML_VALUE,
        produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public XmlUser create(@RequestBody XmlUser xmlUser){
        xmlUser.setName("this is xml analysis :"+xmlUser.getName());
        xmlUser.setAge(100 + xmlUser.getAge());
        return xmlUser;
    }
}
