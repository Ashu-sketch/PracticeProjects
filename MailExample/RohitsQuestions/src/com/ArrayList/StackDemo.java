package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>animals=new Stack<>();
		animals.push("Lion");
		animals.push("cat");
		animals.push("horse");
   animals.add("hdw");
   
   for (Iterator iterator = animals.iterator(); iterator.hasNext();) {
	String string = (String) iterator.next();
	System.out.println(string);
}
   System.out.println(animals.peek());
   System.out.println(animals.pop());
		
	}}
