package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entites.Employee;

public class Aula7 {

	public static void main(String[] args) {
		String path = "c:/temp/employee.txt";
		
		List<Employee> emp = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
		      String line = br.readLine();
		      
		      while(line != null) {
		    	  String[] employee = line.split(",");
			      String name = employee[0];
			      Double salary = Double.parseDouble(employee[1]);
			      
		    	  emp.add(new Employee(name, salary));
		    	  line = br.readLine();
		      }
		      
		      /* O método sort pode apenas ordenar uma List<T>(lista de um tipo T), se esse
		       * tipo T for um comparable, ou seja implementar a interface comparable,
		       * o tipo T nesse caso é Employee.
		       * */
		      Collections.sort(emp);
		      
		      for(Employee employee : emp) {
		    	  System.out.println(employee.getName() + ", "+ employee.getSalary());
		      }
		      
		      
		      
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
