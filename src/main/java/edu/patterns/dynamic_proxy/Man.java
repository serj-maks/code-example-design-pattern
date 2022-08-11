package edu.patterns.dynamic_proxy;

public class Man implements Human {

    @Override
    public void walk() {
        System.out.println("i am walking");
    }

    @Override
    public void talk() {
        System.out.println("i am talking");
    }
}
