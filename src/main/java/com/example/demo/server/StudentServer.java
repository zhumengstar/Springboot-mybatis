package com.example.demo.server;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

public interface StudentServer {
    public Student findById(int id);
}
