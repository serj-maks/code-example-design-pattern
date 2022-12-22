package edu.serjmaks.patterns.command.command;

import edu.serjmaks.patterns.command.Bulb;
import edu.serjmaks.patterns.command.Command;

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
