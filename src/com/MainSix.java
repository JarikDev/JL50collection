package com;

import java.util.*;

public class MainSix {
    public static void main(String[] args) {
        Collection collection=new LinkedHashSet();
        collection.add("2");
        collection.add("4");
        collection.add("1");
        collection.add("3");
        for (Object o: collection) {
            System.out.println(o);
        }
    }
}
