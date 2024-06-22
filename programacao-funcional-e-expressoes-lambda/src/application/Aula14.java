package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import model.entities.Employee;
import model.services.EmployeeService;

public class Aula14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emps = new ArrayList<>();
		System.out.println("Enter full file path: ");
		String path = sc.next();
		
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salar = Double.parseDouble(fields[2]);
				emps.add(new Employee(name, email, salar));
				
				line = br.readLine();
			}
			
			Predicate<Employee> criteriaSalary = emp -> emp.getSalary() > 2000.0;
			Predicate<Employee> criteriaName = emp -> emp.getName().charAt(0) == 'M';
			Comparator<String> comp = (email1, email2) -> email1.toUpperCase().compareTo(email2.toUpperCase());
			
			
			System.out.println("Email of people whose salary is more than 2000.0");
			EmployeeService eS = new EmployeeService();
			List<String> emails = eS.orderEmailsAlphabetically(emps, criteriaSalary, comp);
			
			for(String email : emails) {
				System.out.println(email);
			}
			
			double totalSalary = eS.sumSalary(emps, criteriaName);
			System.out.println("Sum of salary of people whose name starts with 'M': "+String.format("%.2f", totalSalary));
			
			/*
			 the ConcurrentModificationException is used to fail-fast when
			 something we are iterating on is modified.
			*/
			
			
			
			
			
			
			
			
			
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
