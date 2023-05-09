package org.example.ds.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Rovshan1");
        list.add("Rovshan2");
        list.add("Rovshan3");

        list.add(1, "Rovshan1.5");

        //with Iterator
        System.out.println("list all 1");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.remove();

        //with foreach
        System.out.println("list all 2");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("+++++++++++++");

        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("+++++++++++++");
        list.removeFirst();
        list.removeLast();

        for (String s : list) {
            System.out.println(list);
        }
    }
}
