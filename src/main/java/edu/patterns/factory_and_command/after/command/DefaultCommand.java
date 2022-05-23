package edu.patterns.factory_and_command.after.command;

import edu.patterns.factory_and_command.after.Command;

public class DefaultCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Unknown command. Please try again");
    }
}
