package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;

import com.example.demo.entity.Student;
import com.example.demo.service.impl.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/post")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PutMapping("/put/{id}")
    public Student updateStudent(
            @PathVariable Long id,
            @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
    @GetMapping("/csrf")
    public CsrfToken getCsrfTokrn(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}