package esercitazioni.student.controller;


import esercitazioni.student.domain.Student;
import esercitazioni.student.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path= "/student/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    ResponseEntity<List<Student>> getAll(){
        List<Student> students = studentService.getAll();
        return new ResponseEntity(students, HttpStatus.OK);
    }

    @PostMapping(path="/post")
    ResponseEntity<Student> create(@RequestBody Student student){
        Student student1 = studentService.create(student);
        return new ResponseEntity<>(student1, HttpStatus.OK);
    }



}
