package com.byschoo.apirest_students.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.byschoo.apirest_students.Entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
    Student findByName(@Param("name") String name);
}
