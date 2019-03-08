package com.example.demo.controller;

import com.example.demo.server.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloServer helloServer;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloServer.hiService(name);
    }
}