package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

public class CommandExecutableFactory {
    StudentServiceImpl studentService;

    public CommandExecutableFactory(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public CommandExecutableFactory() {

    }

    public CommandExecutable create(String[] input){
        if(input[0].equals("/add"))
            {return new CreateStudentExecutable(studentService, new Student(input[1]))}
        else if (input[0].equals("/del_fio"))
            {return new DeleteStudentExecutable(studentService, new Student(input[1]))}
        else
            {return new DeleteStudentExecutable_A(studentService, Integer.parseInt(input[1]), Integer.parseInt(input[2])  )}
    }
}
