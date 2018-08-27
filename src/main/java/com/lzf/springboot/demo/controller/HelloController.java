package com.lzf.springboot.demo.controller;

import com.lzf.springboot.demo.config.AutoLzf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${boot.name}")
    private String name;
    @Value("${boot.age}")
    private String age;
    @Autowired
    private AutoLzf autoLzf;
    @RequestMapping("hello.do")
    public @ResponseBody String index(){
        return "hello"+"-----"+name+"---------------"+age;
    }
    @RequestMapping("auto.do")
    public @ResponseBody String auto(){
        return autoLzf.getName()+"000000000000000"+autoLzf.getUrl();
    }
}
