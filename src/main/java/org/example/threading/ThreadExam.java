package org.example.threading;

public class ThreadExam extends Thread{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println("the value is :"+i);
            try {
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e.getMessage());

            }

        }
    }
public static void main(String[] args){
        ThreadExam t = new ThreadExam();
        t.start();
        RunnableThread r1 = new RunnableThread();
        Thread t1 = new Thread(r1);
        t1.start();
}
}

