package terminal;

import db.StudentTable;
import repository.StudentRepository;
import service.StudentServiceImpl;
import terminal.executable.*;

import java.io.IOException;
import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);

        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void listener() {
        Scanner sc = new Scanner(System.in);
        while (true){
            String scanData = sc.nextLine();
            Command input = commandParser.parseCommand(scanData);
            CommandExecutable commandExecutable = terminalReader.commandExecutableFactory.create(input);
            commandExecutable.execute();
        }
    }
}
