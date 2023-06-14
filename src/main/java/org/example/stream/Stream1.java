package org.example.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String args[]){

//        String[] a =new String[5];
//        a[0] = "adf";
//
//        List<String> l = new ArrayList(){};
//        for (String ele:a
//             ) {
//            l.add("safa");
//            System.out.println(l);
//        }

//        System.out.println(l);

        List<Integer> l1 = List.of(1,12,31,14,15);
        List<Integer> list = List.of(1,12,31,14,15);
        List l2 = new ArrayList();
        l2.add(21);
        l2.add(33);
        l2.add(1);
        l2.add(5);

        List<Integer> l3 = Arrays.asList(23, 546, 87, 2, 65);

        //without stream
        List<Integer> listEven = new ArrayList<>();
        for (int i:l1){
            if (i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        // with stream
//        List<Integer> listOdd = new ArrayList<>();
        Stream<Integer> stream = list.stream();
        List<Integer> collect = stream.filter(i -> i % 2 == 1).collect(Collectors.toList());
        System.out.println(collect);
        //  in one line
        List<Integer> collect1 = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
