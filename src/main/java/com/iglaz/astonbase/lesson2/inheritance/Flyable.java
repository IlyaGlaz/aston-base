package com.iglaz.astonbase.lesson2.inheritance;

public interface Flyable {
   static int some = 22;
   void fly();

   default void someMethod() {
       System.out.println();
       somePrivate();
   }

   static void someStatic() {

   }

   private void somePrivate() {

   }
}
