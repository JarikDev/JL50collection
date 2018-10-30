package com;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainFour {
    public static void main(String[] args) {
        Queue collection3 = new PriorityQueue();
        collection3.offer("1");
        collection3.offer("2");
        collection3.offer("3");
        Iterator iterator=collection3.iterator();
        while(iterator.hasNext()){
            System.out.println(collection3.poll());
            // System.out.println(iterator.next());
        }
        System.out.println("num of elements "+collection3.size());

    }
}
