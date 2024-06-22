package entities;

public abstract class Person {
   
	protected String name;
	protected Double anualIncome;
	
	public Person() {
		
	}
	
	public Person(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	/* Método responsável por calcular o imposto */
	public abstract double tax();
	
	
}
