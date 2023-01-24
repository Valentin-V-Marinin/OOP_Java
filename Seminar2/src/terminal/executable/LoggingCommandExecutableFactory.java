package terminal.executable;

import service.StudentServiceImpl;

import java.io.IOException;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LoggingCommandExecutableFactory(StudentServiceImpl studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
                System.out.println("start");
                CommandExecutable result = super.create(input);
                System.out.println("end");
                return result;
    }
}
