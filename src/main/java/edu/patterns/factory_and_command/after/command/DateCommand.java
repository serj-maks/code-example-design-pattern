package edu.patterns.factory_and_command.after.command;


import edu.patterns.factory_and_command.after.Command;

import java.util.Date;

public class DateCommand implements Command {

    @Override
    public void execute() {
        System.out.println(new Date());
    }
}
