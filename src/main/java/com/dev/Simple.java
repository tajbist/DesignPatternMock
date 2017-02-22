package com.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Oops on 2/22/2017.
 */
public class Simple {
    public static void main(String arg[]) {
        List<String> list = new ArrayList<>();
        list.add("Command Design ");
        list.add("Singleton Design ");
        list.add("Factory Design ");
        list.add("Abstract Factory Design ");
        printDesign(list);
    }

    private static void printDesign(List<String> list) {
        List<String> refine = list.stream().filter(l -> l.length() > 10).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
