package com.telusko.simpleWebApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Wellcome to telusko.com";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont teach, we make you learn";

    }


}
