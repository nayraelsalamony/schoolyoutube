package Dao;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDao {
    PreparedStatement pre;
    DbConnection dbConnection=new DbConnection();
    Connection connection=dbConnection.getConnection();
    Scanner scanner=new Scanner(System.in);
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
    public Student updateById(int studentId){
        String name =scanner.next();
        String email =scanner.next();
        String level =scanner.next();
        String address =scanner.next();
        String phone =scanner.next();
        int age =scanner.nextInt();
        try {
            pre = connection.prepareStatement("UPDATE youtubeschool.student" +
                    " SET studentname = ?, studentemail = ?, studentlevel =?, studentaddress = ?, studenphone = ?,  studenage = ?" +
                    " WHERE idstudent = ? ");
            pre.setString(1,name);
            pre.setString(2,email);
            pre.setString(3,level);
            pre.setString(4,address);
            pre.setString(5,phone);
            pre.setInt(6,age);
            pre.setInt(7,studentId);
            pre.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(); }
        return null ;
        }
}
