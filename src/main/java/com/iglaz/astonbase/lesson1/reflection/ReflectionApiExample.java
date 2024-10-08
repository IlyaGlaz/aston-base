package com.iglaz.astonbase.lesson1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApiExample {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(25L, "Ivan", 24);

        Class<? extends User> aClass = user.getClass();
        Class<User> userClass = User.class;

        System.out.println();
//        System.out.println(userClass == userClass1);
        testConstructor();
//        testFields(user);
//        testMethods(user);
    }

    private static void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "Petr");
        System.out.println(petr);
    }

//    private static void testFields(Object object) throws IllegalAccessException {
//        Field[] declaredFields = object.getClass().getSuperclass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            Object value = declaredField.get(object);
//            System.out.println(declaredField.getModifiers());
//            // [0, 0, 0, 0, 0, 0, 1, 1]
//            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
//            System.out.println(value);
//        }
//    }
//
//    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Method method = user.getClass().getDeclaredMethod("setName", String.class);
//        method.invoke(user, "Sveta");
//        System.out.println(user);
//    }
//
//    private class Test1 {
//
//    }
//
//    private static class Test3 {
//
//    }
//
//    private enum Test2 {
//        ONE, TWO
//    }
}
