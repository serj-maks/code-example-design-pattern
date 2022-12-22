package edu.serjmaks.patterns.factory_and_command.after.command;

import edu.serjmaks.patterns.factory_and_command.after.Command;

public class DefaultCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Unknown command. Please try again");
    }
}
