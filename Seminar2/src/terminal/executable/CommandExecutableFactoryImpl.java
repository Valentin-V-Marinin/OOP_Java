package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private final StudentServiceImpl studentService;

    public CommandExecutableFactoryImpl(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    @Override
    public CommandExecutable create(Command input) {
        if (input.isCreateCommand()) {
            return new CreateStudentExecutable(studentService, new Student(input.getFullSetArguments()));
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(studentService, new Student(input.getFirstArgument()));
        } else {
            return new DeleteStudentByGroupAgeExecutable(studentService, Integer.parseInt(input.getFirstArgument()), Integer.parseInt(input.getSecondArgument()));
        }
    }
}
