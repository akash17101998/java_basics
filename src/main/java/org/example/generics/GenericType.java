package org.example.generics;

import java.util.ArrayList;
import java.util.List;
//  Generic is used for the type safety
public class GenericType {
    public static void main(String args[]){
        // <Generic> in this we define the type of the data collection
        List<String> list = new ArrayList<>();
        list.add("akash");
        // we can't store the interger because the generic type is string

        List l1 = new ArrayList(); // in this we do not define any generic so it accept all kind of data
        l1.add(123);
        l1.add("hello");
        l1.add(1.23);


    }
}
