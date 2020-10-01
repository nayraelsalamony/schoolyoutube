package Model;

public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentLevel;
    private String studentAderess;
    private String studentPhone;
    private int studentAge;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    public void setStudentAderess(String studentAderess) {
        this.studentAderess = studentAderess;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public String getStudentAderess() {
        return studentAderess;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public int getStudentAge() {
        return studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentLevel='" + studentLevel + '\'' +
                ", studentAderess='" + studentAderess + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
