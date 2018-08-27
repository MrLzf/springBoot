package com.lzf.springboot.demo.controller;

import com.lzf.springboot.demo.moder.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BodyController {

    @RequestMapping("/getUser.do")
    public Object getUser(){
        User user = new User();
        user.setAge("22");
        user.setId(1L);
        user.setName("java");
        return user;
    }
}
