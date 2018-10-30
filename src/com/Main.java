package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] array=new int [10];
        Collection collection=new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.remove("1");
        Iterator iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object o: collection) {
            System.out.println(o);
        }
    }
}
