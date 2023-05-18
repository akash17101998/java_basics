package org.example.collections;

import java.util.*;
public class CollectionFramework {
    // type safe collection -> same type of elements are added
    ArrayList<String> name = new ArrayList<>();
    {
        name.add("akash");
        name.add("123");
        name.add("akash");
    }

        //un-type safe collection-> different types of elements are added
    LinkedList list = new LinkedList();
    {
        list.add(123);
        list.add("hello");
        list.add("hello");
        list.add(1.34);
    }

    Vector<String> vector = new Vector<>();
    {
        vector.addAll(name);
    }

    HashSet<Double> h1 = new HashSet<>();
    {
        h1.add(12.234);
        h1.add(45.542);
        h1.add(97.2222);
        h1.add(7.34);
        h1.add(7.34);   // duplicates are not allowed

    }

    TreeSet<Double> tset = new TreeSet<>();
    {
        tset.addAll(h1);
    }
    public static void main(String args[]){
        CollectionFramework c1 = new CollectionFramework();
        System.out.println(c1.name);
        System.out.println(c1.name.get(1));
        System.out.println(c1.list);
        System.out.println(c1.vector);
        System.out.println("-------------------------------------");
        System.out.println(c1.h1);
        System.out.println(c1.tset);

    }
}
