package esercitazioni.student.service;

import esercitazioni.student.domain.Student;
import esercitazioni.student.repository.StudentRepository;
import esercitazioni.student.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
}
