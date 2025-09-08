package org.zeta.batch4.java.assignment.lists.queue_example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueExample {
        public static void main(String[] args) {
            List<Integer> linkedlist=new LinkedList<>(Arrays.asList(1,2,3,4,5));
            QueueClass queue=new QueueClass(linkedlist);
            System.out.println("Elements in the queue are : ");
            queue.print();
            queue.enqueue(6);
            queue.enqueue(5);
            System.out.println("Elements in the queue are : ");
            queue.print();
            queue.dequeue();
            System.out.println("Elements in the queue are : ");
            queue.print();
            System.out.println("The element present at the first is : "+queue.peek());

        }


}
