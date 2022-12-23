package Util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Data.User;

public class ReaderFromTxt {

    private static String path_student = "C:\\GB\\HW\\Files\\student_list.txt";
    private static String path_teacher = "C:\\GB\\HW\\Files\\teacher_list.txt";
    private static String path_studentGroup = "C:\\GB\\HW\\Files\\studentGroup_list.txt";
    public static User read(User user) {
//        try(FileReader reader = new FileReader("notes3.txt"))
//        {
//            char[] buf = new char[256];
//            int c;
//            while((c = reader.read(buf))>0){
//                if(c < 256){ buf = Arrays.copyOf(buf, c);}
//                System.out.print(buf);
//            }
//        }
//        catch(IOException ex){ System.out.println(ex.getMessage()); }
        return null;
    }

    public static StudentGroup readGroup(int groupNumber) throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file;
        try {
            file = new File(path_student);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if ( groupNumber == Integer.parseInt(String.valueOf(line.charAt(line.length()-1))) ){
                    String[] sg_parts = line.split(";");
                    studentList.add(new Student(sg_parts[0],
                                                Integer.parseInt(sg_parts[1]),
                                                Integer.parseInt(sg_parts[2]),
                                                Integer.parseInt(sg_parts[3])));
                    //System.out.println(line);
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file = new File(path_teacher);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        String[] sg_parts = line.split(";");
        Teacher teacher = new Teacher(sg_parts[0],
                Integer.parseInt(sg_parts[1]),
                Integer.parseInt(sg_parts[2]),
                sg_parts[3]);

        StudentGroup sg = new StudentGroup(teacher, studentList);
        sg.setTeacher(teacher);
        sg.setStudentList(studentList);
        return sg;
    }
}
