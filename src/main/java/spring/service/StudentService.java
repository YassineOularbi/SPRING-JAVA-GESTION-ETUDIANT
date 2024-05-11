package spring.service;

import spring.entity.Student;
import spring.exception.ResourceNotFoundException;

import java.util.List;



public interface StudentService {

    public List<Student> getStudents();

    public void saveStudent(Student student);

    public Student getStudent(String id) throws ResourceNotFoundException;

    public void deleteStudent(String id);

}