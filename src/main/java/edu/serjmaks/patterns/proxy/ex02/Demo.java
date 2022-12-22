package edu.serjmaks.patterns.proxy.ex02;

public class Demo {
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoom();
        User serj = new User("serj", mediator);
        User nat = new User("nat", mediator);

        serj.send("Hey!");
        nat.send("Hello!");
    }
}
