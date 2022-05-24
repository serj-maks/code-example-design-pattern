package edu.patterns.factory;

public class WoodenDoor implements Door {
    protected int width;
    protected int height;

    public WoodenDoor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
}
