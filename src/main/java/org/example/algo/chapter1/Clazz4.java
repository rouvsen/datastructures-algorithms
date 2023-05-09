package org.example.algo.chapter1;

import java.util.*;

public class Clazz4 {//Contact App
    public static void main(String[] args) {

        Map<Character, List<String>> nameMap = new HashMap<>();
        addName(nameMap, "Alice");
        addName(nameMap, "Bob");
        addName(nameMap, "Charlie");
        addName(nameMap, "Eve");

        List<String> aNames = getNames(nameMap, 'A');
        System.out.println("A names: " + aNames); // A names: [Alice]

        List<String> bNames = getNames(nameMap, 'B');
        System.out.println("B names: " + bNames); // B names: [Bob]

        List<String> cNames = getNames(nameMap, 'C');
        System.out.println("C names: " + cNames); // C names: [Charlie]

        List<String> dNames = getNames(nameMap, 'D');
        System.out.println("D names: " + dNames); // D names: []
    }

    public static void addName(Map<Character, List<String>> map, String name) {
        char firstLetter = name.charAt(0);
        if (!map.containsKey(firstLetter)) {
            map.put(firstLetter, new ArrayList<>());
        }
        map.get(firstLetter).add(name);
    }

    public static List<String> getNames(Map<Character, List<String>> map, char firstLetter) {
        List<String> names = map.get(firstLetter);
        return names != null ? new ArrayList<>(names) : Collections.emptyList();
    }


}
