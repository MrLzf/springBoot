package com.lzf.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/index.do")
    public String index(Model model){
        model.addAttribute("msg","集成jsp页面");
        return "index";
    }
}
