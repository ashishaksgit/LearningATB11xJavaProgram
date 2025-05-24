package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab258_QUEUE {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
       // PriorityQueue q = new PriorityQueue();
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Pramod");
        q.add("Dutta");
        q.add("Aahish");
        q.add("Babita");
        q.add("ashok");
        // PQ -> Natural - Sorting
        System.out.println(q);
        //remove top one(Promod
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);


    }
}
