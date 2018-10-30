package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Book{
    String nameAuthor;

    public Book(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                '}';
    }
}
public class MainFive {
    public static void main(String[] args) {
        Map collection = new HashMap();
        collection.put("1","Dan Brown");
        collection.put("2","Lenin");
        collection.put("3",new Book("Karnegi"));
        collection.put("4","King");
        collection.put("1","Pushkin");
        System.out.println(collection.get("3"));
        Set set =collection.entrySet();
        for (Object o:set) {
            System.out.println(o );
        }
        Set setK =collection.keySet() ;
        for (Object o:setK) {
            System.out.println(o );
        }
    }
}
