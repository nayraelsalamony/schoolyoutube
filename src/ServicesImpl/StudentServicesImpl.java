package ServicesImpl;

import Dao.StudentDao;
import Model.Student;
import Services.StudentServices;

import java.sql.ResultSet;
import java.util.Scanner;

public class StudentServicesImpl implements StudentServices {
    Scanner input=new Scanner(System.in);
    StudentDao studentDao;
    @Override
    public void createStudent(Student student) {
            studentDao=new StudentDao();
            Student student1= studentDao.insertStudent(student);
            System.out.println(student);
    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public ResultSet selectAll() {
        return null;
    }

    @Override
    public ResultSet selectStudentByName(String studentName) {
        return null;
    }

    @Override
    public ResultSet searchByPhone(String studentPhone) {
        return null;
    }
}
