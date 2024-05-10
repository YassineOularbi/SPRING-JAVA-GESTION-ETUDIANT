package Spring.Controller;

import Spring.Beans.Student;
import Spring.data.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping ("/")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "StudentForm";
    }

    @RequestMapping("/save-student")
    public String saveStudent(@RequestParam("id") String id,@RequestParam("name") String name, @RequestParam("age") Integer age) throws InstantiationException, IllegalAccessException {
        studentService.addStudent(new Student(id, name, age));
        return "redirect:/students";
    }

    @RequestMapping("/students")
    public String showStudentList(Model model) throws InstantiationException, IllegalAccessException {
        model.addAttribute("students", studentService.showStudent());
        return "StudentList";
    }

    @RequestMapping("/remove-student/{id}")
    public String removeStudent(@PathVariable("id") Integer id) throws InstantiationException, IllegalAccessException {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }


}
