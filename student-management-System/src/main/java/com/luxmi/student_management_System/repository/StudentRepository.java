package com.luxmi.student_management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxmi.student_management_System.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
