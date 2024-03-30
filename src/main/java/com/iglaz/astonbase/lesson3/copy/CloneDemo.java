package com.iglaz.astonbase.lesson3.copy;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Ivan", 22);
        ivan.addFilm("33");

        System.out.println(ivan);

        Person clonePerson = ivan.clone();
        System.out.println(ivan.equals(clonePerson));
        clonePerson.addFilm("someFilm");

        System.out.println(clonePerson);
        System.out.println(ivan);


        Child sadf = new Child("sadf", 23);
        Person clone = sadf.clone();

    }
}
