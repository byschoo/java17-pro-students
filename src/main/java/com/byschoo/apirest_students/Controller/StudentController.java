package com.byschoo.apirest_students.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byschoo.apirest_students.Entity.Student;
import com.byschoo.apirest_students.Service.StudentService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@Valid @RequestBody Student student) {
    return studentService.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
    return studentService.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
    return studentService.getStudents();
    }

    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable Long id) {
    return studentService.getStudentById(id);
    }

    @GetMapping("/studentByName/{name}")
    public List<Student> findStudentByName(@PathVariable("name") String name) {
    return studentService.getStudentByName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@Valid @RequestBody Student student) {
    return studentService.updateStudent(student);
    }
    
    @PutMapping("/update/{id}")
    public Student updateStudentById(@PathVariable Long id, @Valid @RequestBody Student student) {
    return studentService.updateStudentById(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
    return studentService.deleteStudent(id);
    }
}
