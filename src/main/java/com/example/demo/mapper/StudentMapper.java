package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface StudentMapper {
    Student findById(int id);
}
