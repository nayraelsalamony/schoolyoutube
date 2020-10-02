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
        return null;
    }
    public ResultSet selectByPhone(String studentPhone){
        try {
            pre = connection.prepareStatement("SELECT * FROM youtubeschool.student WHERE studenphone = ? ");
            pre.setString(1,studentPhone);
            ResultSet resultSet= pre.executeQuery();
            return  resultSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null ;}
}
