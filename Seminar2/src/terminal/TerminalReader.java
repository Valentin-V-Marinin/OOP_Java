package terminal;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public void listener(){
        Scanner sc = new Scanner(System.in);
        while (true){
            String scanData = sc.nextLine();
            String[] input = commandParser.parseCommand(scanData);
            CommandExecutableFactory commandExecutableFactory =
                    new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(input);
            commandExecutable.execute();
        }
    }
}
