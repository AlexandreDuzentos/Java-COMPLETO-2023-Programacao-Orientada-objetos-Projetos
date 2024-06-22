package Application;

import entities.Account;
import entities.SavingsAccount;

public class Aula3 {

	public static void main(String[] args) {
		
		/* A variável x aponta para o objeto do tipo Account */
		Account x = new Account(1020, "Alex", 1000.0);
		
		/* A variável y aponta para o objeto  do tipo SavingsAccount */
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		/* Essa operação de withdraw está a ser chamada de um objeto do tipo Account que
		 * aponta para o mesmo objeto Account.
		 * */
		x.withdraw(50.0);
		System.out.println(x.getBalance());
		
		/* Essa operação de withdraw está a ser chamada de um objeto do tipo Account, que é 
		 * mais genérico, o objeto aponta um objeto do tipo SavingsAccount que é mais específico.
		 * 
		 * */
		y.withdraw(50.0);
		System.out.println(y.getBalance());

	}

}
