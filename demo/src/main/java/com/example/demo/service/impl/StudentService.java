package com.example.demo.service.impl;


import java.util.List;
import com.example.demo.entity.Student;   // ✅ REQUIRED

public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}

