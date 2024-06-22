package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
    
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	/* Método responsável por atualizar o saldo da conta baseado no interestRate */
	public void updateBalance() {
		this.balance += balance * this.interestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		this.balance -= amount;
	}
	
	
}
