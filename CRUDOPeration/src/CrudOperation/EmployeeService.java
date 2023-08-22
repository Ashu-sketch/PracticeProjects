package CrudOperation;

import java.util.Scanner;

public class EmployeeService {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		Employee emp = null;
		EmployeeDao dao=new EmployeeDao();
		int choice 	;
		
		do {
			
			System.out.println("1. insert");
			System.out.println("2. list");
			System.out.println("3. selectUser");
			System.out.println("4. delete");
			choice=in.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("insert employee name");
					String name=in.next();
					System.out.println("insert employee designation");
					String designation= in.next();
					System.out.println("insert salary");
					float salary=in.nextFloat();
					emp=new Employee(name, designation, salary);
					dao.insertUser(emp);
					
					break;
				case 2:
					System.out.println();
					break;
				case 3:
					System.out.println("enter employee id");
					int eId=in.nextInt();
					dao.selectUser(eId);
					System.out.println(emp.geteName());
					

		}
		}
		while(choice!=0);
		
	}
		
	}

