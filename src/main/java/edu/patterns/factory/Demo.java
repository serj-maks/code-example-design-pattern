package edu.patterns.factory;

public class Demo {
    public static void main(String[] args) {
        Door door = DoorFactory.makeWoodenDoor(100, 200);
        System.out.println(door.getWidth());
        System.out.println(door.getHeight());
    }
}
