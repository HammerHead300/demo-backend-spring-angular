package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

//Ponemos Long porque el tipo de variable de la id de student es de ese tipo
public interface StudentRepository
        extends JpaRepository<Student, Long> {
}