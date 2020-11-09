package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MybatisTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void getById() throws Exception {
        Student user = studentMapper.findById(1);
        System.out.println(user);
    }
}