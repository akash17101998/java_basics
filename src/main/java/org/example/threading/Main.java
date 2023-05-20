package org.example.threading;

public class Main {
    public static void main(String[] args){
        Company com = new Company();
        Producer pod = new Producer(com);
        Consumer con = new Consumer(com);
        pod.start();
        con.start();
    }
}
