package edu.serjmaks.patterns.command;

import edu.serjmaks.patterns.command.command.TurnOff;
import edu.serjmaks.patterns.command.command.TurnOn;

public class Demo {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        TurnOn turnOn = new TurnOn(bulb);
        TurnOff turnOff = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(turnOn);
        remoteControl.submit(turnOff);
    }
}
