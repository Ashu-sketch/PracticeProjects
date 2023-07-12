package com.ArrayList;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		// Reverse the array by my own logic

//		String arr[] = { "Ab", "bc", "cd" };
//		String tempArr[] = new String[arr.length];
//		for (int i = arr.length - 1; i >= 0; i--) {		
//			tempArr[arr.length - i - 1] = arr[i];
//		}
//
//		for (String string : tempArr) {
//			System.out.println(string);
//			
//		}
		
		/*
		 *    *
		 *   ***
		 *  *****
		 * *******
		 */
		
		for(int i=0;i<4;i++) {
			for(int j=(i*2)+1;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}

