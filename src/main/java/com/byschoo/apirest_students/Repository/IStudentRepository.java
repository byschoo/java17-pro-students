package com.byschoo.apirest_students.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.byschoo.apirest_students.Entity.Student;


public interface IStudentRepository extends JpaRepository<Student, Long> {
    //Student findByName(@Param("name") String name);
    @Query("select u from Student u where u.name = ?1")
    List<Student> findByNameAList(String name);
}
