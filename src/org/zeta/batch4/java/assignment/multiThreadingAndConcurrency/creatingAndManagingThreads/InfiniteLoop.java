package org.zeta.batch4.java.assignment.multiThreadingAndConcurrency.creatingAndManagingThreads;

public class InfiniteLoop extends Thread{
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Thread is running");
                Thread.sleep(100);
            }
        } catch (InterruptedException interruptedException){
            System.out.println(interruptedException.getMessage());
        }
    }
}
