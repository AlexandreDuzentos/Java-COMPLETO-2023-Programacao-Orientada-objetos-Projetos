package arraysListas;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;


public class Funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        
        List<Employee> emp = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
        	int numerador = i + 1;
        	System.out.println("Employee #"+numerador+":");
        	System.out.println("Id: ");
        	Integer id = sc.nextInt();
        	
        	System.out.println("Name: ");
        	sc.nextLine();
        	String name = sc.nextLine();
        	
        	System.out.println("Salary: ");
        	Double salary = sc.nextDouble();
        	
        	// Adicionando os funcionários na lista
        	emp.add(new Employee(id, name, salary));
        }
        
        
        System.out.println("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        
        Employee result =  emp.stream().filter(x -> x.getId().intValue() == id.intValue()).findFirst().orElse(null);
        
        
        
        if(result != null) { 	
        	System.out.println("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            
			result.increaseSalary(percentage);
		} else { 
			System.out.println("This id does not exist");
		}
		
		
		System.out.println("List of employees: ");
		
		for(Employee employee: emp) {
			 System.out.println(employee.toString());

		}
		
        
		sc.close();

	}

}
