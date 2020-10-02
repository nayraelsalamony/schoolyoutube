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
        studentDao=new StudentDao();
        ResultSet resultSet1=studentDao.select();

        try{
            while (resultSet1.next()) {
                Student student=new Student();
                student.setStudentId(resultSet1.getInt("idstudent"));
                student.setStudentName(resultSet1.getString("studentname"));
                student.setStudentEmail(resultSet1.getString("studentemail"));
                student.setStudentLevel(resultSet1.getString("studentlevel"));
                student.setStudentAderess(resultSet1.getString("studentaddress"));
                student.setStudentPhone(resultSet1.getString("studenphone"));
                student.setStudentAge(resultSet1.getInt("studenage"));
                System.out.println(student);
            }}
        catch (Exception e){
            e.printStackTrace();
        }
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
