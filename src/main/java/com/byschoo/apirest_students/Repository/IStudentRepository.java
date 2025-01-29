package com.byschoo.apirest_students.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.byschoo.apirest_students.Entity.Student;


public interface IStudentRepository extends CrudRepository<Student, Long> {
   List<Student> findByStudentName(String name);
}
