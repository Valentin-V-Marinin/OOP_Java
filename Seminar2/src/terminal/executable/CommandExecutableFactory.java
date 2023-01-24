package terminal.executable;

import java.io.IOException;

public interface CommandExecutableFactory {
    CommandExecutable create(Command input) throws IOException;
}
