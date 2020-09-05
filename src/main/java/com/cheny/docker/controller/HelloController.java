package com.cheny.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/desc")
    String hello() {
        return "hello docker I am cheny port = " + port;
    }
}
