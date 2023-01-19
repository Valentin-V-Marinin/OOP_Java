package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

public class CommandExecutableFactory {
    private final StudentServiceImpl studentService;

    public CommandExecutableFactory(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    public CommandExecutable create(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteByFIO")) {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        } else {
            return new DeleteStudentByGroupAgeExecutable(studentService, Integer.parseInt(input[1]), Integer.parseInt(input[2]));
        }
    }
}
