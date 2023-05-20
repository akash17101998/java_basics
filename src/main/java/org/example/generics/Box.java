package org.example.generics;

public class Box {
    // Object class is top most parent class of all java class, we can store any type of data
        Object container;

        public Box(Object container){
            this.container = container;
        }
        public Object getValue(){
            return this.container;
        }

}

class Example<T>{  // we can define the generic of the data type here
    T data;

    public Example(T data){
        this.data = data;
    }
    public T getValue(){
        return this.data;
    }
}