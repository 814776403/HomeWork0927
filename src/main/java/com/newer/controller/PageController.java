package com.newer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    /***
     * 跳转到index.jsp
     * WEB-INF/views/index.jsp
     * @return
     */
    @RequestMapping("/index")
    public String openIndex(){
        return "index";
    }
}
