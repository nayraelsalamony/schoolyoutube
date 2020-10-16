package Control;

import Model.Student;
import Services.StudentServices;
import ServicesImpl.StudentServicesImpl;

import java.util.Scanner;

public class StudentController {
    public static StudentServices studentServices;
    public static void addStudent(Student student) {
        studentServices = new StudentServicesImpl();
        studentServices.createStudent(student);
    }

    public  static void removeStudent(){
        studentServices=new StudentServicesImpl();
        studentServices.deleteStudent();
    }
    public  static void showAllStudent() {
        studentServices = new StudentServicesImpl();
        studentServices.selectAll();
    }
    public static void searchByName(String studentName) {
        studentServices = new StudentServicesImpl();
        studentServices.selectStudentByName(studentName);
    }
    public static void searchByPhone(String studentPhone){
        studentServices=new StudentServicesImpl();
        studentServices.searchByPhone(studentPhone);
    }
    public static void main(String[] args) {
        System.out.println("enter 1 to insert     ");
        System.out.println("enter 2 to delete a student ");
        System.out.println("enter 3 to show all student");
        System.out.println("enter 4 to search student by name ");
        System.out.println("enter 5 to search student by phone ");
        System.out.println("enter 6 to update data by student id");
        Scanner scanner = new Scanner(System.in);
        int operationnumper = scanner.nextInt();
        if (operationnumper == 1) {
            Student student = new Student();
            student.setStudentName("nayra");
            student.setStudentEmail("nayra@gmail.com");
            student.setStudentLevel("15");
            student.setStudentAderess("monfai");
            student.setStudentPhone("432169876543");
            student.setStudentAge(21);
            addStudent(student); }
        if (operationnumper==2) {
            removeStudent();
        }
        if(operationnumper == 3){
            showAllStudent();
        }
        if (operationnumper == 4) {
            System.out.println("enter Student name to search by it ");
            String name = scanner.next();
            searchByName(name);
        }
    if(operationnumper == 5){
    System.out.println("enter Student phone to search by it ");
    String phone =scanner.next();
    searchByPhone(phone);}

    }
}

