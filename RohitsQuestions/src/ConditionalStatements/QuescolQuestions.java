package ConditionalStatements;

import java.util.Iterator;

/*https://quescol.com/interview-preparation/core-java-coding-qu*/
public class QuescolQuestions {
//	Java Coding Questions on Numbers
//	Write a program to reverse an integer in Java.
	private static int reverseInteger(int num) {
		//we will start a loop until num not equals to zero, here first we take reminder and then multiply it with 10 so we can give it a place
		//then add a new remider it after that to elminate that reminder from number we will dic=vide the number with 10
		int reminder=0;
		while(num!=0) {
			reminder=reminder*10+(num%10);
			num=num/10;
			
		}
		
		
		return reminder;
	}
//	Write a program in Java to check whether an integer is Armstrong number or not.
	private static boolean isArmstrong(int num ) {
		int armstrongNum=0;
		int x=0;
		int origin=num;
		while(num!=0) {
			x=num%10;
			armstrongNum=armstrongNum+(x*x*x);
			num=num/10;
		}
		if(origin==armstrongNum) {
			return true;
		}
		return false;
//		System.out.println(armstrongNum);
	}
//	Write a program in Java to check given number is prime or not.
	
	private static boolean isPrime(int num) {
//it needs to put a break statemnet 
		if ((num == 1 || num == 0) ? false : true)

			for (int i = 2; i <= num / 2; i++) {
				if (num % i != 0) {
					return true;
					
				}
				break;
			}
		return false;
	}
//	Write a program in Java to print the Fibonacci series using iteration.
	private static void fibonacci() {
		int Ist_num=1; int IInd_num=1;
		
	for (int i = 1; i <= 10; i++) {
		
	}
	}
//	Write a program in Java to print the Fibonacci series using recursion.
//	Write a program in Java to check whether a number is Palindrome or not using iteration.
//	Write a program in Java to check whether a number is Palindrome or not using recursion.
//	Write a program in Java to find greatest among three integers.
//	Write a program in Java to find sum of digits of a number using recursion?
//	Write a program in Java to swap two numbers without using third variable?
//	Write a program in Java to swap two numbers using third variable?
//	Write a program in Java to find prime factors of a given integer.
//	Write a program in Java to add two integer without using arithmetic operator?
//	Write a program in Java to find given number is perfect or not?
//	Java Program to Calculate the Average of Integer Array.
//	Java Program to calculate the Average of number taken from user.
//	Java Program to calculate factorial using iterative method.
//	Java Program to calculate factorial using recursion.
//	Java Program to check a given number is even or odd.
//	Java program to print first n Prime Number with explanation.
//	Java Program to print Prime Number in a given range.
//	Java Program to find Smallest number among three.
//	Java program to calculate the power using the POW method.
//	Java Program to calculate the power without using POW function.
//	Java Program to calculate the square of a given number.
//	Java Program to calculate the cube of a given number.
//	Java Program to calculate the square root of a given number.
//	Java program to calculate LCM of given two numbers.
//	Java Program to find GCD or HCF of two numbers.
//	Java Program to find GCD of two numbers using recursion.
//	Java Program to check the given year is a leap year or not.
//	Java Program to convert Celsius to Fahrenheit.
//	Java Program to convert Fahrenheit to Celsius.
//	Java program to calculate Simple Interest with explanation.

	public static void main(String[] args) {
		System.out.println(reverseInteger(234566));
		System.out.println(isArmstrong(371));
		System.out.println(isPrime(19));

	}

}
