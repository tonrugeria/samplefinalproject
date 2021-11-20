package com.example.finalproject.repository;

import com.example.finalproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
    //all crud database method

}
