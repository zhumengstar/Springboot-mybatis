package com.example.demo.controller;

import com.example.demo.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "这是你的第一个Springboot程序";
    }

    @Autowired
    private StudentServer studentServer;

    @RequestMapping("/{id}")
    public String findById(@PathVariable int id){
        return studentServer.findById(id).toString();
    }
}
