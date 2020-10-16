package Dao;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
    PreparedStatement pre;
    DbConnection dbConnection=new DbConnection();
    Connection connection=dbConnection.getConnection();
    public Student insertStudent(Student student){
        try {
            pre=connection.prepareStatement("insert into youtubeschool.student (studentname,studentemail,studentlevel,studentaddress,studenphone,studenage) values (?,?,?,?,?,?);");
            pre.setString(1, student.getStudentName());
            pre.setString(2,student.getStudentEmail());
            pre.setString(3, student.getStudentLevel());
            pre.setString(4,student.getStudentAderess());
            pre.setString(5,student.getStudentPhone());
            pre.setInt(6,student.getStudentAge());
            pre.executeUpdate();
            return  student;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null; }
    public boolean deleteStudent(int studentId) {
        try {
            pre = connection.prepareStatement("DELETE FROM youtubeschool.student WHERE idstudent = ? ");
            pre.setInt(1,studentId);
            pre.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
    public ResultSet select() {
        try {
            pre = connection.prepareStatement("SELECT * FROM youtubeschool.student");
            ResultSet resultSet= pre.executeQuery();
            return  resultSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
            return null;
        }
        public ResultSet selectByName(String studentName){
            try {
                pre = connection.prepareStatement("SELECT * FROM youtubeschool.student WHERE studentname = ? ");
                pre.setString(1,studentName);
                ResultSet resultSet= pre.executeQuery();
                return  resultSet;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return null ;  }
        public ResultSet selectByPhone(String studentPhone){
            try {
                pre = connection.prepareStatement("SELECT * FROM youtubeschool.student WHERE studenphone = ? ");
                pre.setString(1,studentPhone);
                ResultSet resultSet= pre.executeQuery();
                return  resultSet;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return null ;
        }
}
