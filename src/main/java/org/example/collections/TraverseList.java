package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseList {
    public static void main(String args[]){
        ArrayList<String> name = new ArrayList<>();
        {
            name.add("akash");
            name.add("123");
            name.add("akash");
            name.add("singh");
            name.add("abhi");
        }

        //traversing through for each loop
        for (String str :name) {
            System.out.println(str+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("----------------------------------");
        // traversing through iterator only forward traversing
        Iterator<String> itr = name.iterator();
        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);

        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        // backward traverse using listIterator
        ListIterator<String> litr = name.listIterator(name.size());
        while (litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("*************************************");
        // forEach method
        name.forEach(e->{
            System.out.println(e);
        });

        System.out.println("Sorting of elements");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(name);
        name.forEach(e->{
            System.out.println(e);
        });
    }
}
