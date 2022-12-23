package TestProgram;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import controller.Controller;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;
import service.TeacherServiceImpl;
import java.io.IOException;


public class TestProgram {
    public static void main(String[] args) throws IOException {

        Controller student = new Controller(new StudentServiceImpl());

        student.createStudent(new Student("Петров Сергей Васильевич", 21, 121212,1));
        student.createStudent(new Student("Сидоров Иван Сергеевич", 20, 121213,2));
        student.createStudent(new Student("Иванов Виктор Николаевич", 20, 121214,1));
        student.createStudent(new Student("Миронова Дарья Петровна", 20, 121113,2));


        Controller teacher = new Controller(new TeacherServiceImpl());
        teacher.createTeacher(new Teacher("Фёдорова Ираида Михайловна",45,315687,"ООП"));

        int groupNumber = 1;
        Controller studentGroup = new Controller(new StudentGroupServiceImpl());
        StudentGroup a = new StudentGroup(studentGroup.createGroup(groupNumber));

        for (Student item:  a.getStudentList()) {
            System.out.println(item.getFio()+" "+item.getAge()+" "+item.getPassport()+" "+item.getGroupNumber());
        }
        System.out.println(a.getTeacher().getFio()+" "+a.getTeacher().getAge()+" "+a.getTeacher().getPassport()+" "+a.getTeacher().getDepartment());
        studentGroup.writeGroup(groupNumber, a);
    }
}
