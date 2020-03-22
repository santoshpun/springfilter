package com.santosh.springfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String info() {
        return "Info method invoked";
    }

    @GetMapping(value = "/users")
    public String users() {
        return "Fetching user list";
    }

    @GetMapping(value = "/greetings")
    public String greeting() {
        return "Greeting called";
    }
}
