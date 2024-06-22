package Application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aula1 {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		/*
		 *  UPCASTING(convertendo um objeto da subclasse(BusinessAccount) para um objeto da
		 *  superclasse(Account)
		 *  
		 *  O upcasting não resulta em erro porque a subclasse BusinessAccount também é uma
		 *  superclasse(Account).
		 *  acc.
		 */
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Mario", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Alexandre", 0.0, 0.5);
		
		
		
		/*
		 * DOWNCASTING(convertendo um objeto da superclasse(Account) para um objeto da
		 * subclasse(BusinessAccount).
		 * 
		 * o downcasting resulta em erro caso não seja feito um casting do objeto da superclasse
		 * (Account) para um objeto do subclasse(BusinessAccount), pois uma superclasse(Account)
		 * não é uma subclasse(BusinessAccount), mas sim uma subclasse(BusinessAccount) é uma
		 * superclasse(Account).
		 * 
		 * A conversão não é feita de forma natural, para força-la é necessário fazer um
		 *  casting manual do objeto da superclasse(Account) para o objeto da
		 *  subclasse(BusinessAccount)
		 * */
		
		BusinessAccount bacc1 = (BusinessAccount)acc2;
		bacc1.loan(100.0);
		
		
		/* Será lançada uma exceção porque o objeto acc3 do tipo Account foi instânciado
		 * como  SavingsAccount, desse modo, não será possível converter um objeto do tipo
		 * Account que foi instânciando como SavingsAccount para BusinessAccount, a classe
		 * BusinessAccount não é uma SavingsAccount, logo, não é possível fazer casting entre
		 * elas, por conta de não terem uma relação de herança, não será possível a conversão
		 * natural e nem a conversão forçada(manual).
		 * 
		 * Esse erro será detectado apenas durante o runtime(tempo de execução).
		 * 
		 * Para evitar esse tipo de erro, deve-se testar primeiro se o objeto acc3 é do tipo
		 * BusinessAccount, caso seja, passa a ser seguro fazer o downcasting de acc3 para
		 * bacc2, caso contrário, não é seguro fazer o downcasting.
		 * 
		 * */
		
		/*
		BusinessAccount bacc2 = (BusinessAccount)acc3;
		*/
		
		/*
		 *  o operador instanceof testa se um objeto é uma instância de uma classe,
		 *  ele é usado porque nem sempre vai dar certo o downcasting, e o compilador
		 *  não sabe disso, por conta disso utilizamos o operador instanceof antes de fazer
		 *   o downcasting, para evitar que uma exceção do tipo ClassCastException seja lançada.
		 *   
		 *   Para que o downcasting funcione, o tipo da variável a partir da qual o downcasting
		 *   está sendo feito deve ser uma instância do tipo da variável para o qual o downcasting
		 *   estará sendo atribuído.
		 */
		 
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount)acc3;
			bacc2.loan(100.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount svcc2 = (SavingsAccount)acc3;
			svcc2.updateBalance();
			System.out.println("Saldo atualizado");
		}
		
		
		
		

	}

}
