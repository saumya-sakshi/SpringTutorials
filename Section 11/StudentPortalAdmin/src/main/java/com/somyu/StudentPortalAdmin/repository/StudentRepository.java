package com.somyu.StudentPortalAdmin.repository;


import com.somyu.StudentPortalAdmin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);



}
