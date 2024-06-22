package Application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aula6 {

	public static void main(String[] args) {
		
		// A classe Account não pode ser instânciada por conta ser abstrata
		/* Account acc1 = new Account(1001, "Alex", 1000.0); */
		
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0,500.0));
		
	
		for(Account acc : list) {
			acc.deposit(10.0); // depositando 10.0 em cada uma das contas da lista
		}
		
		
		for(Account acc : list) {
			System.out.println("Updated balance for account "+ acc.getNumber()+ ": "
		    +acc.getBalance());
		}
		
		System.out.print("Saldo total: ");
		int saldoTotal = 0;
		for(Account acc : list) {
			/* Calculando o saldo total de todas as contas da lista */
			saldoTotal += acc.getBalance();
		}
			
		System.out.println(saldoTotal);

	}

}
