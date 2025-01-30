package com.byschoo.apirest_students.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.byschoo.apirest_students.Entity.Student;


public interface IStudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT s FROM Student s WHERE s.name LIKE %:name%")
    List<Student> findByNameLike(String name);
}
