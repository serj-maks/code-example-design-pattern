package edu.serjmaks.patterns.command.command;

import edu.serjmaks.patterns.command.Bulb;
import edu.serjmaks.patterns.command.Command;

public class TurnOn implements Command {
    protected Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOn();
    }
}
