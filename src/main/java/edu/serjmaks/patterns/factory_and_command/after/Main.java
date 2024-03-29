package edu.serjmaks.patterns.factory_and_command.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CommandFactory factoryCommand = new CommandFactory();
        while (true) {
            String input = reader.readLine();
            Command command = factoryCommand.getCommand(input);
            command.execute();
        }
    }
}
