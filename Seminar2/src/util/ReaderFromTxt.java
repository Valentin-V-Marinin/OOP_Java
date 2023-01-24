package util;

import data.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReaderFromTxt {
    public static User read(User user) {
        try {
            File file = new File(Location.path_student);
            FileReader fileSource = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileSource);
            String line = reader.readLine();

            while (line != null) {
                String[] sg_parts = line.split(";");
                System.out.printf("Студент:%s Год_рождения:%s Возраст:%s Паспорт:%s Группа:%s",
                        sg_parts[0], sg_parts[1], sg_parts[2], sg_parts[3], sg_parts[4]);
                line = reader.readLine();
            }
            fileSource.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
