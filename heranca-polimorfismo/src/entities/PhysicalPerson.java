package entities;

public class PhysicalPerson extends Person {
	
	private Double healthExpenses;
  
  
  public PhysicalPerson() {
	  super();
  }
  
    public PhysicalPerson(String name, double anualIncome, double healthExpenses) {
	    super(name, anualIncome);
	    this.healthExpenses = healthExpenses;
    }

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {
		double tax = 0.0;
		if(this.getAnualIncome() < 20000.0) {
			/* calculando o imposto a ser pago se o anualIncome for inferior a 20.000 */
			tax = 15.0 / 100 * this.getAnualIncome();
			
			/* abatendo os gastos com a saúde no imposto */
            if(this.getHealthExpenses() > 0.0) {
				tax -= 50.0 / 100 * this.getHealthExpenses();
			}
		} else {
			
			/* calculando o imposto a ser pago se o anualIncome for superior a 20.000 */
			tax = 25.0 / 100 * this.getAnualIncome();
			
			/* abatendo os gastos com a saúde no imposto */
			if(this.getHealthExpenses() > 0.0) {
				tax -= 50.0 / 100 * this.getHealthExpenses();
			}
			  
		}
		
		return tax;
	}
  
  
}
