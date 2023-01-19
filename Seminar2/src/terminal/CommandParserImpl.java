package terminal;

public class CommandParserImpl implements CommandParser{
    @Override
    public String[] parseCommand(String inputCommand) {
        return inputCommand.split(" ");
    }
}
