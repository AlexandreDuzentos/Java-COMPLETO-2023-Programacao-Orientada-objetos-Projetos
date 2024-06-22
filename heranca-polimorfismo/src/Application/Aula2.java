package Application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aula2 {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		
		
		/* o objeto acc2 é uma instância de classe SavingsAccount, logo, os métodos e
		 * atributos chamados a partir dele, serão os métodos e atributos da classe
		 * SavingsAccount.
		 * */ 
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		
		System.out.println(acc2.getBalance());
		
		/* ídem para o objeto acc3*/
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		
		System.out.println(acc3.getBalance());
		

	}

}
