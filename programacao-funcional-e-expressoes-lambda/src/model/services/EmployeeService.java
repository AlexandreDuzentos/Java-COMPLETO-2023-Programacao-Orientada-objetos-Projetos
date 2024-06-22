package model.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Employee;

public class EmployeeService {
   
	public List<String> orderEmailsAlphabetically(List<Employee> emps, Predicate<Employee> criteria, Comparator<String> comp){
		
		List<String> emails = new ArrayList<>();
		for(Employee emp : emps) {
			if(criteria.test(emp)) {
				emails.add(emp.getEmail());
			}	 
		}
		
		emails.sort(comp);
		return emails;
	}
	
	public double sumSalary(List<Employee> emps, Predicate<Employee> criteria) {
		
		double sum = 0.0;
		for(Employee emp : emps) {
			if(criteria.test(emp)) {
				sum += emp.getSalary();
			}
		}
		
		return sum;
	}
}
