package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    Student findById(int id);
}
