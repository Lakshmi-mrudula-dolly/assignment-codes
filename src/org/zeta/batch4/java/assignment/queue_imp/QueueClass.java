package org.zeta.batch4.java.assignment.queue_imp;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueClass {
    Queue<Integer> queue;
    public QueueClass(List<Integer> queue){
        this.queue=new LinkedList<>(queue);
    }
    public void enqueue(int element){
        System.out.println(element+" is added to queue");
        queue.offer(element);
    }
    public void dequeue(){
        System.out.println("The element "+queue.poll()+" is removed");
    }
    public int peek(){
        return queue.peek();
    }


    public void print() {
        queue.forEach(number-> System.out.print(number+" "));
        System.out.println();
    }
}
