package spring.service;

import spring.entity.Student;
import spring.exception.ResourceNotFoundException;

import java.util.List;



public interface StudentService {

    List<Student> getStudents();

    void saveStudent(Student student);

    Student getStudent(String id) throws ResourceNotFoundException;

    void deleteStudent(String id);

}