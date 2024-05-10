package Spring.data.Service;

import Spring.Beans.Student;
import Spring.data.DAORepository.HibernateDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    @Autowired
    private HibernateDAO hibernateDAO;

    public void addStudent(Student student) throws InstantiationException, IllegalAccessException {
        hibernateDAO.save(student);
    }

    public void updateStudent(Student student) throws InstantiationException, IllegalAccessException {
        hibernateDAO.merge(student);
    }

    public void deleteStudent(Integer id) throws InstantiationException, IllegalAccessException {
        hibernateDAO.delete(Student.class, id);
    }

    public ArrayList<Student> showStudent() throws InstantiationException, IllegalAccessException {
        return hibernateDAO.show(Student.class);
    }
}
