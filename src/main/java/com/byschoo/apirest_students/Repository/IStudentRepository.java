package com.byschoo.apirest_students.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byschoo.apirest_students.Entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);
}
