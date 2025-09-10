package org.zeta.batch4.java.assignment.multiThreadingAndConcurrency.creatingAndManagingThreads;

public class Main {
    public static void main(String[] args) {
        ThreadExample thread1=new ThreadExample();
        Thread thread2=new Thread(new RunnableExample());
        Thread thread3=new Thread(()->{
            try{
            for(int counter =1;counter<=10000;counter++){
                System.out.println(Thread.currentThread().getName()+" - "+counter);
                Thread.sleep(10);
            }
            }catch(InterruptedException e){}

        });
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
