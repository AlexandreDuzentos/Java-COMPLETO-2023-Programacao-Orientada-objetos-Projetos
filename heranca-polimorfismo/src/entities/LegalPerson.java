package entities;

public class LegalPerson extends Person {
   private Integer qtdEmployees;
   
   public LegalPerson() {
	   super();
   }
   
   public LegalPerson(String name, double anualIncome, int qtdEmployees) {
	   super(name, anualIncome); 
	   this.qtdEmployees = qtdEmployees;
   }
   
 
	public Integer getQtdEmployees() {
	    return qtdEmployees;
    }

	public void setQtdEmployees(Integer qtdEmployees) {
		this.qtdEmployees = qtdEmployees;
	}

	@Override
	public double tax() {
		double tax = 0.0;
		if(this.getQtdEmployees() < 10) {
			tax = 16.0 / 100 * this.getAnualIncome();
		} else {
			tax = 14.0 / 100 * this.getAnualIncome();
		}
		
		return tax;
	}
}
