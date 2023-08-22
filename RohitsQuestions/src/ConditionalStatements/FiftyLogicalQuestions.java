package ConditionalStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.Popup;

public class FiftyLogicalQuestions {
	/*
	 * 1. How do you reverse a string in Java?
	 */
	public static String reverseString(String anyName) {

		String reversedString = "";
		for (int i = 0; i < anyName.length(); i++) {
			char ch = anyName.charAt(i);
			reversedString = ch + reversedString;
		}
		return reversedString;
	}

	public static String reverseStringAnotherMetod(String in) {
		if (in == null) {
			throw new IllegalAccessError("not valid input");
		}
		StringBuilder out = new StringBuilder();
		char chars[] = in.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			out.append(chars[i]);
		}
		return out.toString();
	}

	/*
	 * 2. How do you swap two numbers without using a third variable in Java?
	 */
	public static void swapTwoNumbersWithoutThirdvariable(int num1, int num2) {
		System.out.println("before swap" + num1 + ", " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println(num1 + ", " + num2);

	}

	/* 3. Write a Java program to check if a vowel is present in a string. */
	public static boolean isVowelPresent(String string) {
		if (string == null) {
			throw new IllegalArgumentException("invalid input");
		}
		char ch[] = string.toCharArray();
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u') {
				return true;
			}
		}
		return false;
	}

	public static boolean isVowelPresentShorterWay(String string) {
		if (string.toLowerCase().matches(".*[aeiou].*")) {
			return true;
		}
		return false;
	}

	/* 4. Write a Java program to check if the given number is a prime number. */
	public static boolean isGivenNumberIsPrime(int num1) {
		if ((num1 == 1 || num1 == 0) ? false : true)

			for (int i = 2; i < num1 / 2; i++) {
				if (num1 % i != 0) {
					return true;
				}
			}
		return false;
	}

	/* 5. Write a Java program to print a Fibonacci sequence using recursion. */
	public static void fibonnaciSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(num1 + ",");
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
		}
	}

	public static int fibonnaciSeriesUsingRecursion(int count) {
		if (count <= 1) {
			return count;
		}
		return fibonnaciSeriesUsingRecursion(count - 1) + fibonnaciSeriesUsingRecursion(count - 2);
	}

	/* 6.Write a Java program to print factorial */
	public static int factorialUsinRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorialUsinRecursion(n - 1);
	}

	public static void factorialrecursion(int n) {
		int factorial = 1;
		if (n == 0 || n == 1) {
			System.out.println(n);
		}
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}
	}

	/*
	 * 7. How do you check if a list of integers contains only odd numbers in Java?
	 */
	public static boolean ifContainingOnlyOddNumbers(List<Integer> numbers) {
		for (Integer integer : numbers) {
			if (integer == 0)
				return false;
		}
		return true;
	}

	public static boolean onlyOddNumbers(List<Integer> list) {
		return list.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

	public static boolean onlyOddNumbersShortWay(List<Integer> list) {
		return list.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

	/* 8. How do you check whether a string is a palindrome in Java? */
	public static void isPalindrome(String string) {
		int l = string.length();
		boolean flag = false;
		for (int i = 0; i < l / 2; i++) {
			if (string.charAt(i) == string.charAt(l - i - 1)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	public static boolean isPalindromeShortMethod(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
				return true;
			}
		}
		return false;
	}

	/* 9. How do you remove spaces from a string in Java? */
	public static void trimmingAstring(String anyName) {
		String x = anyName.trim();
		System.out.println(anyName);
		System.out.println(x);
	}

	// we can use Character.isWhitespace() method
	public static String removingWhiteSpace(String n) {
		char c[] = n.toCharArray();
		StringBuilder out = new StringBuilder();
		for (char d : c) {
			if (!Character.isWhitespace(d)) {
				out.append(d);
			}
		}
		return out.toString();
	}

	/* 10. How do you remove leading and trailing spaces from a string in Java? */
	public static String removingHeadingAndTrailingWhiteSpaces(String string) {
		return string.strip();
	}

	/* 10. How do you sort an array in Java? */
	private static void sortingAnArray(int array[]) {
		Arrays.sort(array);
		System.out.print(Arrays.toString(array));
	}

//other than above programs
	/*
	 * 5. Armstrong number (solution) A number is called an Armstrong number if it
	 * is equal to the cube of its every digit. For example, 153 is an Armstrong
	 * number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to
	 * write a program to check if the given number is Armstrong number or not.Read
	 * more:
	 * https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-
	 * Interviews. html#ixzz84VDMqL00
	 */
	private static void armStrongNumber(int number) {
		int result = 0;
		int orig = number;
		while (number != 0) {
			int reminder = number % 10;
			result = result + reminder * reminder * reminder;
			number = number / 10;
		}
		if (result == orig) {
			System.out.println(result + " :is armstrong number");
		} else {
			System.out.println(orig + ": is not armstrong number");
		}
	}

	/* Remove duplicates from an array */
	private static void removingDuplicateFromArray(ArrayList<Integer> intArrayList) {

		int flag = 0;
		ArrayList<Integer> localArrayList = new ArrayList<>();
		if (intArrayList.size() == 0) {
			throw new IllegalArgumentException("invalid input");
		}

		for (int i = 1; i <= intArrayList.size() - 1; i++) {
			for (int j = i + 1; j <= intArrayList.size() - 1; j++) {
				if (intArrayList.get(i) != intArrayList.get(j)) {
					localArrayList.add(intArrayList.get(j));
				}
			}
		}
		for (Integer integer : localArrayList) {
			System.out.println(integer);
		}
	}

	private static void removingduplicatesFromArrayUsingSet(ArrayList<Integer> intArrayList) {

		Set<Integer> valuesWithoutDuplicate = new HashSet<>(intArrayList);
		intArrayList.clear();
		intArrayList.addAll(valuesWithoutDuplicate);
		for (Integer integer : valuesWithoutDuplicate) {
			System.out.println(integer);
		}
	}

	private static void removingduplicatesFromArrayUsingContainsCheck(ArrayList<Integer> intArrayList) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer integer : intArrayList) {
			if (!newList.contains(integer)) {
				newList.add(integer);
				System.out.println(integer);
			}
		}

	}

	/* Print repeated characters of String? */
	private static void repeatedcharactersofString(String s) {
		s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(i));
				}
			}
		}
	}

	private static void repeatedcharactersFrequency(String s) {
		char n[] = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : n) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Entry<Character, Integer> entry2 : entrySet) {
			if (entry2.getValue() > 1) {
				System.out.println(entry2.getKey() + ": " + entry2.getValue());
			}
		}
	}
//  find gcd of two numbers
	private static Integer findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}

	public static int findGSDSimply(int x, int y) {
		int gcd = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {

				gcd = i;
			}
		}
		return gcd;
	}
// The square root of number ( reminder = Sqt%i;if (reminder==0 && (Sqt/i)==i)

	private static int rootSquare(int x) {
		int sqr=0;
		for(int i=1;i<=x;i++) {
			int reminder=x%i;
			if(reminder==0 &&(x/i)==i) {
				sqr=i;
			}
		}
		return sqr;
	}
	private static void rootSquareWithInbuiltMethod(float x) {
		float rootSquare=(float) Math.sqrt(x);
		System.out.println(rootSquare);
	}
	 //Reverse array in place
	
	private static void reversedArray(String string[]) {
		 String temp[]=new String[string.length];
		for(int i=0;i<=string.length;i++) {
			String s=string[string.length-1-i];
			
			temp[i]=s;
			
		}
		for (String string2 : temp) {
			System.out.println(string2);
		}
	}
	private static void reversedArrayAnotherMethod() {
		
	}
	
//	private static 
	public static void main(String[] args) {
//		System.out.println([reverseString("college"));
//		System.out.println(reverseStringAnotherMetod("Ashu"));
//		swapTwoNumbersWithoutThirdvariable(6, 4);
//		System.out.println(isVowelPresent("JJKKLL"));		
//		System.out.println(isVowelPresentShorterWay("idufieufh"));
//		System.out.println(isGivenNumberIsPrime(2));
//		fibonnaciSeries(9);
//		fibonnaciSeriesUsingRecursion(9);
//		for (int i = 0; i <=9; i++) {
//			System.out.println(fibonnaciSeriesUsingRecursion(i));
//		}
//		System.out.println(factorialUsinRecursion(7));
//		factorialrecursion(7);		
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(5);
		numbersList.add(1);
		numbersList.add(11);
		numbersList.add(5);
		numbersList.add(5);
		numbersList.add(5);
		numbersList.add(5);
//		for (int i = 0; i <= 20; i++) {
//		numbersList.add(i);	
//		i=+2;
//		}

//		System.out.println(ifContainingOnlyOddNumbers(numbersList)	);  
//		System.out.println(onlyOddNumbersShortWay(numbersList));
//		isPalindrome("Java");
//		System.out.println(isPalindromeShortMethod("AssA"));
//		trimmingAstring("    Hello   World     K   ");		
//		System.out.println(removingWhiteSpace("   kk  LL  M"));
//		System.out.println(removingHeadingAndTrailingWhiteSpaces("      My Life    My  Rule     "));
//		int array[]= {3,90,740,8,};
//		sortingAnArray(array);
//		armStrongNumber(152);
//		removingDuplicateFromArray(numbersList);
//		removingduplicatesFromArrayUsingSet(numbersList);
//		removingduplicatesFromArrayUsingContainsCheck(numbersList);
//		repeatedcharactersofString("Annonymous");
//		repeatedcharactersFrequency("MyNameIsAshuShekhawat");
//		System.out.println(findGCD(6, 8));
//		System.out.println(findGCD(6, 8));
//		System.out.println(findGSDSimply(6, 8));
//		System.out.println(rootSquare(81));
//		rootSquareWithInbuiltMethod(32);
//		String s[]= {"Ashu", "Kanchan", "Arjun"};
//		reversedArray(s);
		
		
		System.out.println(removingHeadingAndTrailingWhiteSpaces("   Ashu  IOO  "));
		trimmingAstring("      Ash    u   ");
		
		
		

	}

}
