package testProgram;

import data.GroupStream;
import data.Student;
import data.StudentGroup;
import data.Teacher;
import controller.Controller;
import service.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class TestProgram {
    public static void main(String[] args) throws IOException {

        Controller student = new Controller(new StudentServiceImpl(), new StudentGroupServiceImpl(), new GroupStreamServiceImpl());
        student.createStudent(new Student("Петров Сергей Васильевич", 2001,21, 121212,1));
        student.createStudent(new Student("Сидоров Иван Сергеевич", 2002, 20, 121213,2));
        student.createStudent(new Student("Иванов Виктор Николаевич", 2002,20, 121214,1));
        student.createStudent(new Student("Миронова Дарья Петровна", 2002, 20, 121113,2));
        student.createStudent(new Student("Ситникова Софья Юрьевна", 1999,23, 133113,3));
        student.createStudent(new Student("Сазонов Петр Петрович", 1998,24, 121513,3));
        student.createStudent(new Student("Смирнова Татьяна Олеговна", 2003,19, 127813,3));

        Controller teacher = new Controller(new TeacherServiceImpl(), new StudentGroupServiceImpl(), new GroupStreamServiceImpl());
        teacher.createTeacher(new Teacher("Фёдорова Ираида Михайловна",1977,45,315687,"ООП"));

        // создание и вывод состава группы
        int groupNumber = 1;
        Controller studentGroup = new Controller(new StudentServiceImpl(), new StudentGroupServiceImpl(), new GroupStreamServiceImpl());
        StudentGroup sg  = new StudentGroup(studentGroup.createGroup(groupNumber));
        StudentGroup sg2 = new StudentGroup(studentGroup.createGroup(groupNumber+1));
        StudentGroup sg3 = new StudentGroup(studentGroup.createGroup(groupNumber+2));

        for (Student item:  sg.getStudentList()) {
            System.out.println(item.getInfo());
        }
        System.out.println(sg.getTeacher().getInfo());
        studentGroup.writeGroup(groupNumber, sg);

        // удаление студента
        studentGroup.removeStudent("Иванов Виктор Николаевич", sg);
        for (Student item:  sg.getStudentList()) {
            System.out.println(item.getInfo());
        }

        //добавление групп в потоки, сортировка потоков и вывод в консоль
        Controller groupStream = new Controller(new StudentServiceImpl(), new StudentGroupServiceImpl(), new GroupStreamServiceImpl());
        GroupStream gstream1 = new GroupStream(new ArrayList<StudentGroup>(Arrays.asList(sg, sg2, sg3)),"gr_stream1");
        GroupStream gstream2 = new GroupStream(new ArrayList<StudentGroup>(Arrays.asList(sg3)),"gr_stream2");
        GroupStream gstream3 = new GroupStream(new ArrayList<StudentGroup>(Arrays.asList(sg2, sg3)),"gr_stream3");

        List<GroupStream> lgs = new ArrayList<>();
        lgs.add(gstream1);
        lgs.add(gstream2);
        lgs.add(gstream3);

        System.out.println(lgs.get(0).getName() + " -> " + lgs.get(1).getName() + " -> " + lgs.get(2).getName());
        groupStream.streamSort(lgs);
        System.out.println(lgs.get(0).getName() + " -> " + lgs.get(1).getName() + " -> " + lgs.get(2).getName());
    }
}
