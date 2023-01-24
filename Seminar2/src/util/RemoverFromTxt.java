package util;

import data.User;

import java.io.*;

public class RemoverFromTxt {
    public static void delete(User user) {
        try {
            File temp = File.createTempFile("file", ".txt");
            String charset = "UTF-8";
            PrintWriter fileWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temp), charset));

            File file = new File(Location.path_student);
            FileReader fileSource = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileSource);
            String line = reader.readLine();

            while (line != null) {
                String[] sg_parts = line.split(";");
                if (!user.getFio().equals(sg_parts[0])) {
                    fileWriter.write(line + "\n");
                }
                line = reader.readLine();

            }
            fileWriter.close();
            fileSource.close();
            file.delete();
            temp.renameTo(new File(Location.path_student));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
