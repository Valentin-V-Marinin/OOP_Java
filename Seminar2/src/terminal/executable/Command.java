package terminal.executable;

import data.Student;

import java.util.List;

public class Command {

    private static final String ADD = "/add";
    private static final String DEL = "/del";
    private static final String DELBGA = "/delByGroupAge";

    private String mainFirstCommand;
    private List<String> arguments;

    public Command(String mainFirstCommand, List<String> arguments) {
        this.mainFirstCommand = mainFirstCommand;
        this.arguments = arguments;
    }

    public boolean isCreateCommand() {
        return mainFirstCommand.equals(ADD);
    }

    public boolean isDeleteCommand() {
        return mainFirstCommand.equals(DEL);
    }

    public boolean isDeleteByGroupNumberAgeCommand() {
        return mainFirstCommand.equals(DELBGA);
    }

    public String getFirstArgument(){
        return arguments.get(0);
    }

    public String getSecondArgument(){
        return arguments.get(1);
    }

    public Student getFullSetArguments(){
        Student student = new Student(arguments.get(0),
                Integer.parseInt(arguments.get(1)),
                Integer.parseInt(arguments.get(2)),
                Integer.parseInt(arguments.get(3)),
                Integer.parseInt(arguments.get(4)));
        return student;
    }

}
