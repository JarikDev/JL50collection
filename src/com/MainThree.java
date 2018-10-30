package com;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MainThree {
    public static void main(String[] args) {
        Set collection2= new HashSet();
        collection2.add("1");
        collection2.add("2");
        collection2.add("3");
        collection2.add("1");
        collection2.add("3");
        collection2.add("1");
        collection2.add("1");
        collection2.add("3");
        collection2.add("1");
        collection2.add("1");
        collection2.add("3");
        collection2.add("1");
        for (Object o:collection2) {
            System.out.println(o);
        }
    }
}
