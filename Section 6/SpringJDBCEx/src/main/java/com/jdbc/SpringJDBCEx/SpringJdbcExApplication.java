package com.jdbc.SpringJDBCEx;

import com.jdbc.SpringJDBCEx.model.Student;
import com.jdbc.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s =context.getBean(Student.class);
		s.setMarks(90);
		s.setName("Saumya");
		s.setRollNo(1881);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> studentList = service.getStudent();
		System.out.println(studentList);
	}

}
