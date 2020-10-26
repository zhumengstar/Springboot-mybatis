package com.example.demo.server;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServerImpl implements StudentServer {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student findById(int id) {
        return studentMapper.findById(id);
    }
}
