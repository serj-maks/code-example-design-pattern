package edu.patterns.factory_and_command.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Зарефакторить код с применением паттерна Command и Factory
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String command = reader.readLine();
            switch (command) {
                case "date":
                    System.out.println(new Date());
                    break;
                case "mem":
                    long megaBytes = 1024 * 1024;
                    long freeMemory = Runtime.getRuntime().freeMemory();
                    System.out.println(freeMemory / megaBytes);
                    break;
                case "proc":
                    int processors = Runtime.getRuntime().availableProcessors();
                    System.out.println(processors);
                    break;
                default:
                    System.out.println("Unknown command. Please try again");
                    break;
            }
        }
    }
}
