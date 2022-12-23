package Util;

import java.io.FileWriter;
import java.io.IOException;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Data.User;

public class WriterToTxt {
    private static String path_student = "C:\\GB\\HW\\Files\\student_list.txt";
    private static String path_teacher = "C:\\GB\\HW\\Files\\teacher_list.txt";
    private static String path_studentGroup = "C:\\GB\\HW\\Files\\studentGroup_list.txt";

    public static void write(User user) throws IOException {
        if (user instanceof Student) {
            FileWriter fw = new FileWriter(path_student, true);
            fw.write(user.getFio() + ";" + user.getAge() + ";" + user.getPassport() + ";" + ((Student) user).getGroupNumber() + "\n");
            fw.close();
        }
        if (user instanceof Teacher) {
            FileWriter fw = new FileWriter(path_teacher, true);
            fw.write(user.getFio() + ";" + user.getAge() + ";" + user.getPassport() + ";" + ((Teacher) user).getDepartment() + "\n");
            fw.close();
        }
    }

    public static void writeGroup(int groupNumber, StudentGroup sg) throws IOException{
        FileWriter fw = new FileWriter(path_studentGroup, false);
        fw.write("Группа №" + groupNumber + "\n");
        fw.write("--------------------------------------------------------------------------\n");
        fw.write("\n");
        fw.write("Преподаватель: \n");
        fw.write(sg.getTeacher().getFio()+";"+
                     sg.getTeacher().getAge()+";"+
                     sg.getTeacher().getPassport()+";"+
                     sg.getTeacher().getDepartment()+"\n");
        fw.write("\n");
        fw.write("Студенты: \n");
        for (Student item: sg.getStudentList()) {
            fw.write(item.getFio()+";"+item.getAge()+";"+item.getPassport()+";"+item.getGroupNumber()+"\n");
        }
        fw.close();
    }
}
