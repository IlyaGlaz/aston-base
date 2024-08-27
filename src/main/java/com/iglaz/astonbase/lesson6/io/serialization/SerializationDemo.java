package com.iglaz.astonbase.lesson6.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "student.out");
//
//        writeObject(path);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {

            Object object = objectInputStream.readObject();

            System.out.println(object);
        }
    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {

            Person sergey = new Person(26, new Person(40, "Max"),"Sergey");

            objectOutputStream.writeObject(sergey);
        }
    }
}
