package esercitazioni.student.service.api;

import esercitazioni.student.domain.Student;

import java.util.List;


public interface StudentService {

    List<Student> getAll();

    Student create(Student student);
}
