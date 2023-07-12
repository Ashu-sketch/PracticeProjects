package com.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoWithLinkedList {

	public static void main(String[] args) {
		Queue<String> cars=new LinkedList<>();
		cars.offer("BMW");
		cars.offer("Rolls Royers");
		cars.offer("Maruti");
		cars.offer("Kwid");
		cars.offer("Zen");
		cars.offer("Swift");
		
		System.out.println(cars);
		System.out.println();
		cars.poll();
		System.out.println(cars);
		
		
		System.out.println(cars.peek());
		
		String arr[]=new String[4];
		
	}

}
