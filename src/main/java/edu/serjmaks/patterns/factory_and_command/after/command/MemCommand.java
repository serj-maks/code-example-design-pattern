package edu.serjmaks.patterns.factory_and_command.after.command;


import edu.serjmaks.patterns.factory_and_command.after.Command;

public class MemCommand implements Command {

    @Override
    public void execute() {
        long megaBytes = 1024 * 1024;
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println(freeMemory / megaBytes);
    }
}
