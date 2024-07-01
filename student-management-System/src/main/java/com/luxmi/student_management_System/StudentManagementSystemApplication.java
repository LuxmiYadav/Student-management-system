package com.luxmi.student_management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luxmi.student_management_System.entity.Student;
import com.luxmi.student_management_System.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student("Ramesh","yadav","ramesh@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("luxmi", "yadav","luxmi@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("adi","pawar","adi2gail.com");
		studentRepository.save(student3);*/
	}

}
