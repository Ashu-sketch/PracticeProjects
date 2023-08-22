package com.ArrayList;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueDemo {

	public static void main(String[] args) {

 Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
 //Queue<Integer>pqd=new PriorityQueue<>();
 pq.offer(90);
 pq.offer(24);
 pq.offer(21);
 pq.offer(8);
 System.out.println(pq);
pq.poll();

System.out.println(pq);
System.out.println(pq.peek());
	}

}
