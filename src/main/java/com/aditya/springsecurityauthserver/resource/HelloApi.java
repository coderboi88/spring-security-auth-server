package com.aditya.springsecurityauthserver.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/hello")
public class HelloApi {

    @GetMapping
    public String hello(){
        return "Hello Peoples";
    }
}
