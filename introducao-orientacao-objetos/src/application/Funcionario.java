package application;

import java.util.Scanner;
import entities.Employee;

public class Funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ emp.toString());
		
		System.out.println("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Updated data: "+ emp.toString());
		
		
		sc.close();

	}

}
