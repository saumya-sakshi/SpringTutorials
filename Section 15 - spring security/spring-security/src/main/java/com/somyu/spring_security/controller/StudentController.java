package com.somyu.spring_security.controller;

import com.somyu.spring_security.entity.Student;
import com.somyu.spring_security.repository.StudentRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;
    List<Student> students = new ArrayList<Student>(
      List.of(
              new Student(1,"Saumya","JAVA"),
              new Student(2, "Rishav","Civil"),
              new Student(3,"Abhishek","Design")
      )
    );

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("csrf")
    public CsrfToken getToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");

    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        //studentRepo.save(student);
        return "Added student successfully";
    }
}
