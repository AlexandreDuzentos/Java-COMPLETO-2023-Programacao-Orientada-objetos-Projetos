package entities;

public class BankAccount {

	private String accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount(String accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = 0.0;
	}
	
	public BankAccount(String accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		
		/* O método deposit foi chamado aqui dentro do construtor
		 * para que num futuro, quando a regra de deposito mudar,
		 * haja apenas um ponto de alteração para fazer deposito,
		 * que será no próprio método deposit, dispensando assim a necessidade de realizar altera
		 * cões também no construtor da classe.
		 * 
		 * */
		this.deposit(initialDeposit);
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return  "Account "
			   +this.accountNumber
			   + ", Holder: "
			   + this.holder
			   + ", Balance: $ "
			   + String.format("%.2f",this.getBalance());
	}
	
	
	
}
