package util;

import data.Student;
import data.StudentGroup;

import java.io.FileWriter;
import java.io.IOException;


public class WriterGroupToTxt {
    public static void writeGroup(int groupNumber, StudentGroup sg) throws IOException {
        FileWriter fw = new FileWriter(Location.path_studentGroup, false);
        fw.write("Группа №" + groupNumber + "\n");
        fw.write("--------------------------------------------------------------------------\n");
        fw.write("\n");
        fw.write("Преподаватель: \n");
        fw.write(sg.getTeacher().getFio() + ";" +
                sg.getTeacher().getBirthYear() + ";" +
                sg.getTeacher().getAge() + ";" +
                sg.getTeacher().getPassport() + ";" +
                sg.getTeacher().getDepartment() + "\n");
        fw.write("\n");
        fw.write("Студенты: \n");
        for (Student item : sg.getStudentList()) {
            fw.write(item.getFio() + ";" + item.getAge() + ";" + item.getPassport() + ";" + item.getGroupNumber() + "\n");
        }
        fw.close();
    }
}
