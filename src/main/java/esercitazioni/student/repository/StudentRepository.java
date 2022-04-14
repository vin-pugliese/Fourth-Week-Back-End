package esercitazioni.student.repository;

import esercitazioni.student.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends MongoRepository<Student, String> {
}
