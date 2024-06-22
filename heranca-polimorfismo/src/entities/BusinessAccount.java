package entities;

public class BusinessAccount extends Account {
   
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}
	
	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		
		/*
		 * chamando o construtor da superclasse, para reaproveitá-lo,
		 * para não ter de repetir as atribuições aos atributos herdados da classe
		 * Account na classe Businessccount.
		 * 
		 * Serve também para reaproveitar a lógica do construtor da classe base.
		*/
		super(number, holder, balance); 
		this.loanLimit = loanLimit;
	}
	
	public double getLoanLimit() {
		return this.loanLimit;
	}
	
	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	/* Método responsável por pedir um dinheiro emprestado a partir da minha BusinessAccount */
	public void loan(double amount) {
		if(amount <= this.loanLimit) {
		   this.balance += this.loanLimit;
		}
	}
	
	
	@Override
	public void withdraw(double amount) {
		/* chamando a implementação do método withdraw da superclasse, afim de reutilizar
		 * o código na superclasse.
		 *  */
		super.withdraw(amount);
		this.balance -= 2.0;
	}
}
