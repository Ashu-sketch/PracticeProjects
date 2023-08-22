package com.ArrayList;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDequeue {

	public static void main(String[] args) {

		ArrayDeque<Integer> aq = new ArrayDeque<>();
		aq.offer(23);
		aq.offerFirst(5);
		aq.offer(67);
		aq.offerLast(89);
		
System.out.print(aq+",");
		System.out.println(aq.peek());
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());
	}

}
