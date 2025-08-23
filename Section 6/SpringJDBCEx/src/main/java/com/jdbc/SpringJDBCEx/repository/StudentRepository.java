package com.jdbc.SpringJDBCEx.repository;

import com.jdbc.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Insert student
    public void save(Student s) {
        String query = "INSERT INTO student (rollNo, name, marks) VALUES (?, ?, ?)";
        int rows = jdbcTemplate.update(query, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(" Added " + rows + " row(s)");
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";

//Row Mapper
        return jdbcTemplate.query(sql,( rs,  rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));

            return s;


        });

    }
}
