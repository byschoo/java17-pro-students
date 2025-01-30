package com.byschoo.apirest_students.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byschoo.apirest_students.Entity.Student;


public interface IStudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByName(String name);
}
