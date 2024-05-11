package spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name="student_id")
    private String studentIDNumber;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_email")
    private String studentEmail;
    @Column(name="student_phone")
    private String studentPhoneNumber;
    @Column(name="student_picture")
    private String studentProfilePicture;
    @Column(name="student_pc")
    private String studentHasPCNumber;
    @Column(name="student_bike")
    private String studentHasBike;

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "studentIDNumber='" + studentIDNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                ", studentProfilePicture='" + studentProfilePicture + '\'' +
                ", studentHasPCNumber='" + studentHasPCNumber + '\'' +
                ", studentHasBike='" + studentHasBike + '\'' +
                '}';
    }
}
