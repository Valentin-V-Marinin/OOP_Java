package controller;

import Data.Student;
import Data.Teacher;
import Data.StudentGroup;
import service.*;

import java.io.IOException;

public class Controller {
    //private DataService studentService;
    private DataService userService;
    private DataServiceGroup userServiceGroup;

//  public Controller(StudentServiceImpl studentService) {
    public  Controller(StudentServiceImpl userService){
        //this.studentService = studentService;
        this.userService = userService;
    }

    public Controller(TeacherServiceImpl userService){
        this.userService = userService;
    }

    public Controller(StudentGroupServiceImpl userServiceGroup){
        this.userServiceGroup = userServiceGroup;
    }

    public Student createStudent(Student student) throws IOException {
        userService.create(student);
        return (Student) userService.read(student);
    }

    public Teacher createTeacher(Teacher teacher) throws IOException {
        userService.create(teacher);
        return (Teacher) userService.read(teacher);
    }

    public StudentGroup createGroup(int groupNumber) throws IOException {
        return userServiceGroup.read(groupNumber);
    }

    public void writeGroup(int groupNumber, StudentGroup sg) throws IOException {
        userServiceGroup.create(groupNumber, sg);
    }

}
