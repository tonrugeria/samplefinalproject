package com.example.finalproject;

import com.example.finalproject.model.Student;
import com.example.finalproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student();
//		student.setFirstName("Ton");
//		student.setLastName("Rugeria");
//		student.setAddress("Angeles");
//		student.setPhone("090909");
//		student.setEmailId("ton@gmail.com");
//		studentRepository.save(student);
//
//		Student student1 = new Student();
//		student.setFirstName("J");
//		student.setLastName("Rugeria");
//		student.setAddress("Porac");
//		student.setPhone("00000");
//		student.setEmailId("j@gmail.com");
//		studentRepository.save(student1);

	}
}
