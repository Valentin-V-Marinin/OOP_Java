package util;

import data.Student;
import data.StudentGroup;
import data.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderGroupFromTxt {
    public static StudentGroup readGroup(int groupNumber) {
        List<Student> studentList = new ArrayList<>();
        File file;
        try {
            file = new File(Location.path_student);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if (groupNumber == Integer.parseInt(String.valueOf(line.charAt(line.length() - 1)))) {
                    String[] sg_parts = line.split(";");
                    studentList.add(new Student(sg_parts[0],
                            Integer.parseInt(sg_parts[1]),
                            Integer.parseInt(sg_parts[2]),
                            Integer.parseInt(sg_parts[3]),
                            Integer.parseInt(sg_parts[4])));
                }
                line = reader.readLine();
            }
            fr.close();

            file = new File(Location.path_teacher);
            fr = new FileReader(file);
            reader = new BufferedReader(fr);
            line = reader.readLine();
            String[] sg_parts = line.split(";");
            Teacher teacher = new Teacher(sg_parts[0],
                    Integer.parseInt(sg_parts[1]),
                    Integer.parseInt(sg_parts[2]),
                    Integer.parseInt(sg_parts[3]),
                    sg_parts[4]);

            StudentGroup sg = new StudentGroup(teacher, studentList);
            sg.setTeacher(teacher);
            sg.setStudentList(studentList);
            fr.close();
            return sg;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
