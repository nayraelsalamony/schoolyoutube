package Services;

import Model.Student;

import java.sql.ResultSet;

public interface StudentServices {
    public void createStudent(Student student);
    public void deleteStudent();
    public ResultSet selectAll();
    public ResultSet selectStudentByName(String studentName);
    public ResultSet searchByPhone(String studentPhone);
    public void updateStudent(int studentId);
}
