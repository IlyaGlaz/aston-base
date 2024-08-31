package com.iglaz.astonbase.lesson9.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        User user = UserImpl.of();
        user.sayHello();
    }
}
