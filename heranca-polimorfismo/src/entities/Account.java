package entities;

public class Account {
	
   private Integer number;
   private String holder;
   protected Double balance;
   
   public Account() {
	   
   }
   
   public Account(int number, String holder, double balance) {
	   this.number = number;
	   this.holder = holder;
	   this.balance = balance;
   }

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount +  5.0;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
   
   
   
   
}
