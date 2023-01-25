package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

import java.util.List;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private final StudentServiceImpl studentService;

    public CommandExecutableFactoryImpl(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Student getFullSetArguments(List<String> arguments) {
        return new Student(arguments.get(0),
                Integer.parseInt(arguments.get(1)),
                Integer.parseInt(arguments.get(2)),
                Integer.parseInt(arguments.get(3)),
                Integer.parseInt(arguments.get(4)));
    }


    @Override
    public CommandExecutable create(Command input) {
        if (input.isCreateCommand()) {
            return new CreateStudentExecutable(studentService, new Student(getFullSetArguments(input.getArguments())));
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(studentService, new Student(input.getFirstArgument()));
        } else
            return null;
    }
}


