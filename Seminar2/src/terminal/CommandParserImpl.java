package terminal;

import terminal.executable.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandParserImpl implements CommandParser {

    @Override
    public Command parseCommand(String inputCommand) {
        String firstArgument = null;
        List<String> parseObj = new ArrayList<>();
        String[] parseRow = inputCommand.split(" ");
        for (int i = 0; i < parseRow.length; i++) {
            if (i == 0) {
                firstArgument = parseRow[i];
            } else {
                parseObj.add(parseRow[i]);
            }
        }
        return new Command(firstArgument, parseObj);
    }
}
