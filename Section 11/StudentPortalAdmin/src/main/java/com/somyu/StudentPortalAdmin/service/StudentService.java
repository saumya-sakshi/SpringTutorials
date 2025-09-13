package com.somyu.StudentPortalAdmin.service;


import com.somyu.StudentPortalAdmin.model.Student;
import com.somyu.StudentPortalAdmin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository repository;
    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }




    public void addStudent(Student s){
        repository.save(s);
    }

    public List<Student> getStudents() {
        return  repository.findAll();
    }

    public List<Student> getByName(String name) {
        return  repository.findByName(name);
    }

    public Optional<Student> findByID(int id) {
        return repository.findById(id);
    }

    public Student  updateStudent(Student student, int id) {
        Student s = repository.findById(id).get();

        s.setName(student.getName());
        s.setMarks(student.getMarks());
        return repository.save(s);

    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}
