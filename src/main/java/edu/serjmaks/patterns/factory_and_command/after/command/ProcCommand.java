package edu.serjmaks.patterns.factory_and_command.after.command;

import edu.serjmaks.patterns.factory_and_command.after.Command;

public class ProcCommand implements Command {

    @Override
    public void execute() {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
    }
}
