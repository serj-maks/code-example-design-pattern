package edu.serjmaks.patterns.factory_and_command.after.command;


import edu.serjmaks.patterns.factory_and_command.after.Command;

import java.util.Date;

public class DateCommand implements Command {

    @Override
    public void execute() {
        System.out.println(new Date());
    }
}
