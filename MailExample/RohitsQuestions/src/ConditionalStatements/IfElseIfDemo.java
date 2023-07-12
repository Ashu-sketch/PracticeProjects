package ConditionalStatements;

import java.time.LocalDate;
import java.util.Date;

/*
 * here user input means using Scanner 
 */

public class IfElseIfDemo {
	
//1 Take values of length and breadth of a rectangle from user and check if it is square or not.
	public static boolean isSquare(float length, float breadth ) {
		float result=length*breadth;
		if(result==(length*length)) {
			return true;
		}
		
		return false;
	}
//A shop will give discount of 10% if the cost of purchased quantity is more than 1000	Ask user for quantity	Suppose, one unit will cost 100.
//	Judge and print total cost for user.
	public static void greatervalue(int quantity) {
		float totoalCost=quantity*100;
		float netCost=(float) (0.1*totoalCost);
		if(totoalCost>1000) {			
			System.out.println(netCost);
		}else {
			System.out.println(totoalCost);
		}
		
	}
	//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
	//Ask user for their salary and year of service and print the net bonus amount.
	public static void bonus(float salary, int serveiceYear ) {
		if(serveiceYear>5) {
			System.out.println("you have got bonus of: "+ 0.05*salary+" as you have served more than 5 years and now your salary is"+(( 0.05*salary)+salary)  );
		}else {
			System.out.println("need to work more years to get bonus");
		}
	}
	/*
	 * A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
	 */
	public static void grade(int marks) {
		if(marks>80) {
			System.out.println("A grade");
		}else if(marks>=60&&marks<=80) {
			System.out.println("B grade");
		}else if(marks>=50&&marks<60) {
			System.out.println("C Grade");
		}else if(marks>=45&& marks<50) {
			System.out.println("D Grade");
		}else if(marks>=25&& marks<45) {
			System.out.println("E Grade");
		}else if(marks<25) {
			System.out.println("fail");
		}
		
		
	}
	/*
	 * 
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
	 */
	public static void ExamSittingArrangement(int heldClass,int attendedClasses, boolean medicalCause ) {
		int  attendence=(attendedClasses*100)/heldClass;
		System.out.println(attendence);
		if(attendence<75 && medicalCause==false) {
					
			System.out.println("not allowed to sit in exam, your attendedce is: "+ attendence);
			
		}else {
			System.out.println("allow to sit ");
		}
	}
	/*
	 * If
x = 2
y = 5
z = 0
then find values of the following expressions:
a. x == 2
b. x != 5
c. x != 5 && y >= 5
d. z != 0 || x == 2
e. !(y < 10)
	 */
	public static void evaluateExpressions() {
		int x=2, y=5, z=0;
		   System.out.println(x==2);
		    System.out.println(x != 5);
		    System.out.println(x != 5 && y >= 5);
		    System.out.println(z != 0 || x == 2);
		    System.out.println(!(y < 10));
	}
	/*
	 * Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
	 */
	public static void checkWeatherCharIsLowerOrUppercase(char c) {
		if(c>=65 && c<=90) {
			System.out.println("Upper case");
		}else if(c>=97&& c<=122) {
			System.out.println("lower case");
		}else{
			System.out.println("not a character");
		}
	}
	/*Write a program to check if a year is leap year or not.
      If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. 
	 */
	public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400, so it's a leap year
                } else {
                    return false; // Divisible by 100 but not by 400, not a leap year
                }
            } else {
                return true; // Divisible by 4 but not by 100, so it's a leap year
            }
        } else {
            return false; // Not divisible by 4, not a leap year
        }
    
	}
	/*
	 * Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
	 */
	public static void checkEmployeeAgeAndgender(int age, char gender) {
		if(gender=='F') {
			System.out.println("work only in urban areas ");
		}else if(gender=='M' && age<=40) {
			System.out.println("can work anywhere");
		}else if(gender=='M' && age>40) {
			System.out.println("can work only in urban areas");
		}else {
			System.out.println("invalid input");
		}
	}
	/*
	 * A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
	 */
	public static void reversString(String x) {
		String s="";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			 s=ch+s;
		}
		
		System.out.println(s);
	}
	public static void reverseInt(int x) {
		int first_digit=x%10;
		int second_digit =(x/10)%10;
		int third_digit=(x/100)%10;
		int fourth_digit=(x%1000)%10;
		System.out.println((first_digit*1000)+(second_digit*100)+(third_digit*10)+fourth_digit);
	}
	public static void main(String[] args) {
		boolean squareDemo=isSquare(30, 10);
//		System.out.println(squareDemo);
//		greatervalue(13);
//		bonus(30000, 6);
//		grade(60);
//		ExamSittingArrangement(100,30,false);
//		evaluateExpressions();
//		checkWeatherCharIsLowerOrUppercase('*');
//		date=LocalDate.ofYearDay(1900, 2000)
//		isLeapYear(2013);
//		checkEmployeeAgeAndgender(30, 'i');
//		reversString("Priya");
		reverseInt(2345);
		
		
		

	}

}
