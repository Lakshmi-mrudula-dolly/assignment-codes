package org.zeta.batch4.java.assignment.multiThreadingAndConcurrency.creatingAndManagingThreads;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        try {
            for (int counter = 1; counter <=10000; counter++) {
                System.out.println(ThreadExample.currentThread().getName() + " " + counter);
                Thread.sleep(10);
            }
        }
        catch(InterruptedException e){}
    }
}
