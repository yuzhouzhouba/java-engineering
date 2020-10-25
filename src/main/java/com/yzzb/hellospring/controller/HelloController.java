package com.yzzb.hellospring.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        String my_env = System.getenv("JAVA_HOME");
        return "hello, the user is: " + my_env ;
    }
}
