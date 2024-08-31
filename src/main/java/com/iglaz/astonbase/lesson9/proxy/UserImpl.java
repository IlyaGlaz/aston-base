package com.iglaz.astonbase.lesson9.proxy;

import java.lang.reflect.Proxy;

public final class UserImpl implements User {
    private final static Object userProxy;

    static {
        userProxy = initUser();
    }

    private static Object initUser() {
        UserImpl user = new UserImpl();

        return Proxy.newProxyInstance(UserImpl.class.getClassLoader(), new Class[]{User.class},
                (proxy, method, args) -> {
                    System.out.println("Hello, nice to meet you");
                    return new Object();
                });
    }

    public void sayHello() {
        System.out.println("I am not a good person, good bye");
    }

    public static User of() {
        return (User) userProxy;
    }
}

