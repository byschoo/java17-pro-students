package com.byschoo.apirest_students.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byschoo.apirest_students.Entity.Student;
import com.byschoo.apirest_students.Repository.IStudentRepository;

@Service
public class StudentService {
    
  @Autowired
   private IStudentRepository studentRepository;

   public Student saveStudent(Student student) {
        return studentRepository.save(student);
   }

   public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
   }

   public List<Student> getStudents() {
        return studentRepository.findAll();
   }

   public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow( () -> new RuntimeException("The student with the " + id + " was not found"));
   }

   public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
   }

   public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student Number: ("+ id +") REMOVED !!! ";
   }

   public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        return studentRepository.save(existingStudent);
   }

   public Student updateStudentById(Long id, Student student) {
     Student existingStudent = studentRepository.findById(id).orElseThrow( () -> new RuntimeException("The student with the " + id + " was not found"));
     existingStudent.setName(student.getName());
     existingStudent.setAge(student.getAge());
     return studentRepository.save(existingStudent);
   }
}
