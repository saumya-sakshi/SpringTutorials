package com.somyu.StudentPortalAdmin.controller;

import com.somyu.StudentPortalAdmin.model.Student;
import com.somyu.StudentPortalAdmin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    @CrossOrigin
    public Student saveStudent(@RequestBody Student student) {
         studentService.addStudent(student);
         return  student;
    }

    @GetMapping("/all")
    @CrossOrigin
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<Student> findStudentById(@PathVariable int id) {
        return studentService.findByID(id);
    }

    @GetMapping("/{name}")
    @CrossOrigin
    public  List<Student>  findByName(@PathVariable String name) {
        return studentService.getByName(name);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public  Student updateStudent(@RequestBody Student student, @PathVariable int id) {
        return studentService.updateStudent(student, id);

    }

    @DeleteMapping("/{id}")
    @CrossOrigin
    public  String delete(@PathVariable int id) {
         studentService.deleteStudent(id);
         return "Student with id "+ id +" deleted successfully";

    }


}
