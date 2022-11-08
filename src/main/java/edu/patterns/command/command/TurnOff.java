package edu.patterns.command.command;

import edu.patterns.command.Bulb;
import edu.patterns.command.Command;

public class TurnOff implements Command {
    protected Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOff();
    }
}
