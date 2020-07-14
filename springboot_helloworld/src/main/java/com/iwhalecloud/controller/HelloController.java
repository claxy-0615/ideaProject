package com.iwhalecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String index() {
        String[] split = StringUtils.split("s,ew,sa,w", ",");
        for (String a:split
             ) {
            System.out.println(a+"space");
        }
        return "hello world!";
    }

}
