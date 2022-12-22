package edu.serjmaks.patterns.factory;

public class DoorFactory {

    public static Door makeWoodenDoor(int width, int height) {
        return new WoodenDoor(width, height);
    }
}
