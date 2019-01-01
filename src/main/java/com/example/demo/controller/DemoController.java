package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Gui Yingen
 * @date 2019/1/1
 */
@Controller
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "hello jenkins";
    }
}
