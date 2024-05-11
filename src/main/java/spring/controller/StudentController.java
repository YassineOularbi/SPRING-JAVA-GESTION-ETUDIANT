package spring.controller;

import java.util.List;

import spring.entity.Student;
import spring.exception.ResourceNotFoundException;
import spring.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class StudentController {
    private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String listCustomers(Model theModel) {
        List<Student> studentList = studentService.getStudents();
        theModel.addAttribute("students", studentList);
        return "StudentList";
    }

    @GetMapping("/")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show StudentForm handler method");
        Student student = new Student();
        theModel.addAttribute("student", student);
        return "StudentForm";
    }

    @PostMapping("/save-student")
    public String saveCustomer(@ModelAttribute("student") Student student) {
        System.out.println(student.getStudentEmail());
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/update-student")
    public String showFormForUpdate(@RequestParam("studentId") String Id,
                                    Model theModel) throws ResourceNotFoundException {
        Student student = studentService.getStudent(Id);
        theModel.addAttribute("student", student);
        return "UpdateForm";
    }

    @GetMapping("/remove-student")
    public String deleteStudent(@RequestParam("studentId") String Id){
        studentService.deleteStudent(Id);
        return "redirect:/students";
    }

}