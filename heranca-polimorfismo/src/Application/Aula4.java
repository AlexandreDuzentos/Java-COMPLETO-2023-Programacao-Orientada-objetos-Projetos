package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Aula4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.println("Enter the number of employees? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.println("Outsourced (y/n)");
			char ans = sc.next().charAt(0);
			
			 if(ans == 'y') {
				 System.out.println("Name: ");
				 sc.nextLine();
				 String name = sc.nextLine();
				 
				 System.out.println("hours: ");
				 int hours = sc.nextInt();
				 
				 System.out.println("Value per hour:");
				 double valuePerHour = sc.nextDouble();
				 
				 System.out.println("Additional charge: ");
				 double additionalCharge = sc.nextDouble();
				 
				 emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			  } else {
				  System.out.println("Name: ");
				  sc.nextLine();
				  String name = sc.nextLine();
					 
				  System.out.println("hours: ");
				  int hours = sc.nextInt();
					 
				  System.out.println("Value per hour: ");
				  double valuePerHour = sc.nextDouble();
				  
				  emp.add(new Employee(name, hours, valuePerHour));
				  
			  }
			    
		}
		
		    System.out.println("PAYMENTS: ");
		    for(Employee em: emp) {
		    	System.out.println(em.getName()+ " - $ "+ String.format("%.2f", em.payment()));
		    }
		
            sc.close();
	}

}
