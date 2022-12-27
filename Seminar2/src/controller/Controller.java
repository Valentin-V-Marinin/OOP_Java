package controller;

import data.GroupStream;
import data.Student;
import data.Teacher;
import data.StudentGroup;
import service.*;

import java.io.IOException;
import java.util.List;

public class Controller {
    private final DataService userService;
    private final DataGroupService userServiceGroup;
    private GroupStreamService groupStreamService;

    public Controller(DataService userService, DataGroupService userServiceGroup, GroupStreamService groupStreamService){
        this.userService = userService;
        this.userServiceGroup = userServiceGroup;
        this.groupStreamService = groupStreamService;
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

    public void removeStudent(String fio, StudentGroup sg){
        userServiceGroup.removeStudent(fio, sg);
    }

    public void streamSort(List<GroupStream> groupStream){
        groupStreamService.streamsSort(groupStream);
    };

}
