package main;

import repository.StudentRepository;
import service.StudentServiceImpl;
import terminal.CommandParserImpl;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactoryImpl;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        TerminalReader tr = TerminalReader.getInstance(new CommandParserImpl(),
                new CommandExecutableFactoryImpl(new StudentServiceImpl(new StudentRepository())));
        tr.listener();
    }
}
