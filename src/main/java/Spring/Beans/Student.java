package Spring.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String studentIDNumber;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private String studentProfilePicture;
    private String studentHasPCNumber;
    private String studentHasBike;

    public Student(String studentIDNumber, String studentName, String studentEmail, String studentPhoneNumber, String studentProfilePicture, String studentHasPCNumber, String studentHasBike) {
        this.studentIDNumber = studentIDNumber;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentProfilePicture = studentProfilePicture;
        this.studentHasPCNumber = studentHasPCNumber;
        this.studentHasBike = studentHasBike;
    }

    public String getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setStudentIDNumber(String studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentProfilePicture() {
        return studentProfilePicture;
    }

    public void setStudentProfilePicture(String studentProfilePicture) {
        this.studentProfilePicture = studentProfilePicture;
    }

    public String getStudentHasPCNumber() {
        return studentHasPCNumber;
    }

    public void setStudentHasPCNumber(String studentHasPCNumber) {
        this.studentHasPCNumber = studentHasPCNumber;
    }

    public String getStudentHasBike() {
        return studentHasBike;
    }

    public void setStudentHasBike(String studentHasBike) {
        this.studentHasBike = studentHasBike;
    }
}
