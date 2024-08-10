package com.iglaz.astonbase.lesson4.generics;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        Deque<String> names = new LinkedList<>();
////
//        GenList<Integer> stringGenList = new GenList<>(12);
//
//        System.out.println(GenList.doSomthing(22));
//
//        String s = stringGenList.get(1);
//
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("adfa");
//        strings.add("adfa");
//        strings.add("adfa");

//        List<Integer> integers = List.of(234, 234, 234);
//        integers.add(233);
//
//        List<Integer> list = Arrays.asList(2342, 23423, 234);
//        list.add(2, 2323);

        ArrayList<Integer> integers = new ArrayList<>(List.of(234, 234, 234));
        integers.add(22);
//
        System.out.println(integers.hashCode());

//        Set.of();
//
//        Map.of(23, "sdfa", 2424, "sdfa");
//
//        Map.ofEntries(entry(232, "asdfa"), entry(2342, "sdfa"));
//

//        GenList.sort(List.of(234, 234, 234));

//        AnyList list = new AnyList(10);
//
//        list.add("String");
//        list.add("String");
//        list.add("String");
//        list.add(24);
//        list.add(new Client("adf", 22));
//
//        Integer o = (Integer) list.get(1);
//        o.byteValue();

    }
}
