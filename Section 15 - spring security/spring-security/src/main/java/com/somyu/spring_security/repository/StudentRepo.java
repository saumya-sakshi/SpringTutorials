package com.somyu.spring_security.repository;

import com.somyu.spring_security.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
