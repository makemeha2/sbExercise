package com.noname.sbExersise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("test", "test 문자열 입니다.");
        return "index";
    }

    @GetMapping("intro")
    public String intro(Model model)
    {
        model.addAttribute("test", "intro 입니다.");
        return "intro";
    }
}
