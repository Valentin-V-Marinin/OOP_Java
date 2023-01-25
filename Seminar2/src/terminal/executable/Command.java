package terminal.executable;

import java.util.List;

public class Command {

    private static final String ADD = "/add";
    private static final String DEL = "/del";
    private static final String DELBGA = "/delByGroupAge";

    private final String mainFirstCommand;
    private final List<String> arguments;

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

    public String getFirstArgument() {
        return arguments.get(0);
    }

    public List<String> getArguments() {
        return arguments;
    }
}
