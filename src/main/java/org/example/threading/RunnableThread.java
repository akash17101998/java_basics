package org.example.threading;

public class RunnableThread implements Runnable {
    // we can create thread by using "Runnable(interface)" and "Thread(class)"
    // Runnable don't have start method, so we need "Thread" to call start
    // Runnable is good because no issue in multiple inheritance but in Thread it is
public void run(){
    for (int i=0;i<=10;i++){
        System.out.println("value of i is :"+i);
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("current thread name is :"+tname);
        try{
            Thread.sleep(100);
        }catch (Exception e)
        {};
    }
}
public static void main(String[] args){
    RunnableThread r1 = new RunnableThread();
    Thread t1 = new Thread(r1);
    ThreadExam t2 = new ThreadExam();
    t2.start();
    t1.start();
    Thread t = Thread.currentThread();
    String tname1 = t.getName();
    System.out.println("thread name is :"+tname1);
    t.setName("myName");
    System.out.println("set name of the main thread: "+ t.getName());

}

}
