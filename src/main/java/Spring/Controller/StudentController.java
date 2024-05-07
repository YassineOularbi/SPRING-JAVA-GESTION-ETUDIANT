package Spring.Controller;

import Spring.Beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @RequestMapping (value = "/" ,method = RequestMethod.GET)
    public String showContactForm(Model model) {
        model.addAttribute("student", new Student());
        return "StudentForm";
    }

    @RequestMapping(value = "/save-student",method = RequestMethod.POST)
    public String saveContact(Student student) {
        students.add(student);
        return "redirect:/students";
    }

    @RequestMapping("/students")
    public String showContacts(Model model) {
        model.addAttribute("students", students);
        return "StudentList";
    }
}
