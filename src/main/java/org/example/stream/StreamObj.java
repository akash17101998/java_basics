package org.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObj {
    public static void main(String[] args) {

        String names[] = {"akash","rahul","divya","dj","daru"};
        Stream<String> names1 = Stream.of(names);
//        names1.forEach(e->{
//            System.out.println(e);

//        });
        List<String> collect = names1.filter(e -> e.startsWith("d")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
