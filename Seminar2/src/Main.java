import repository.StudentRepository;
import service.StudentServiceImpl;
import terminal.CommandParserImpl;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactoryImpl;


public class Main {
    public static void main(String[] args) {

        TerminalReader tr = TerminalReader.getInstance(new CommandParserImpl(),
                new CommandExecutableFactoryImpl(new StudentServiceImpl(new StudentRepository())));
        tr.listener();
    }
}
