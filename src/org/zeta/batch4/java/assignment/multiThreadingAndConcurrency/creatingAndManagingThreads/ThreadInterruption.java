package org.zeta.batch4.java.assignment.multiThreadingAndConcurrency.creatingAndManagingThreads;

public class ThreadInterruption {
    public static void main(String[] args) {
        InfiniteLoop infiniteThread=new InfiniteLoop();
        infiniteThread.start();
        try{
            infiniteThread.join(6000);
            infiniteThread.interrupt();
        }catch (InterruptedException _){}
        System.out.println("Main thread waited for 6 seconds");
    }
}
