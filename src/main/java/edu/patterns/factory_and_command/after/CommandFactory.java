package edu.patterns.factory_and_command.after;

import edu.patterns.factory_and_command.after.command.DateCommand;
import edu.patterns.factory_and_command.after.command.DefaultCommand;
import edu.patterns.factory_and_command.after.command.MemCommand;
import edu.patterns.factory_and_command.after.command.ProcCommand;

import java.util.Map;

public class CommandFactory {
    private static final DefaultCommand DEFAULT_COMMAND = new DefaultCommand();
    private static final Map<String, Command> commandMap = Map.of(
            "date", new DateCommand(),
            "mem", new MemCommand(),
            "proc", new ProcCommand()
    );

    public Command getCommand(String stringCommand) {
        return commandMap.getOrDefault(stringCommand, DEFAULT_COMMAND);
    }
}