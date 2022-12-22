package edu.serjmaks.patterns.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Demo {

    public static <T> T withLogging(T target, Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[] {clazz}, new LoggingHandler(target));
    }
    public static void main (String[] args){
        Man man = new Man();
        Human logged = withLogging(man, Human.class);
        logged.talk();
        logged.talk();
        logged.walk();
    }
}
