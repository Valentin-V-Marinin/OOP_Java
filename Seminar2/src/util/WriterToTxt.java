package util;

import data.Student;
import data.Teacher;
import data.User;

import java.io.FileWriter;
import java.io.IOException;

public class WriterToTxt {
    public static void write(User user) {
        try {
            if (user instanceof Student) {
                FileWriter fw = new FileWriter(Location.path_student, true);
                fw.write(user.getFio() + ";" + user.getBirthYear() + ";" + user.getAge() + ";" + user.getPassport() + ";" +
                        ((Student) user).getGroupNumber() + "\n");
                fw.close();
            }
            if (user instanceof Teacher) {
                FileWriter fw = new FileWriter(Location.path_teacher, true);
                fw.write(user.getFio() + ";" + user.getBirthYear() + ";" + user.getAge() + ";" + user.getPassport() + ";" +
                        ((Teacher) user).getDepartment() + "\n");
                fw.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
