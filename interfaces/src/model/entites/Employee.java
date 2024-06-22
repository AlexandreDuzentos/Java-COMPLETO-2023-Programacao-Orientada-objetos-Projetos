package model.entites;

/* 
 * Quando você fala que uma classe é comparable(comparável) significa que você terá de
 * implementar esse contrato, dizendo como você compara seu objeto com outro.
 * */
public class Employee implements Comparable<Employee> {
   
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	/* Termo do contrato da interface Comparable.
	 * 
	 * Método responsável por comparar um objeto com outro.
	 **/
	@Override
	public int compareTo(Employee other) {
		/*
		 *  comparando um name com o outro, afim de ter uma coleção ordenada de Employees
		 *  por name em ordem crescente.
		 *  
		 *  return salary.compareTo(other.getSalary());
		 *  
		 *  comparando um salary com o outro, afim de ter uma coleção ordenada de Employees
		 *  por salary em ordem crescente.
		 *  
		 *  return name.compareTo(other.getName()); 
		 *  
		 *  comparando um name com o outro, afim de ter uma coleção ordenada de Employees
		 *  por name em ordem decrescente.
		 *  
		 *  return -name.compareTo(other.getName()); 
		 *  
		 *  comparando um salary com o outro, afim de ter uma coleção ordenada de Employees
		 *  por name em ordem decrescente.
		 *  
		 *  return -salary.compareTo(other.getSalary()); 
		 */
		return -name.compareTo(other.getName()); 
	}	
	
}
