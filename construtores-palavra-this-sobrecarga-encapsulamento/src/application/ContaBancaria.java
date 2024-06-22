package application;

import java.util.Scanner;
import entities.BankAccount;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount ba;
		
		System.out.print("Enter account number: ");
		String accountNumber = sc.next();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit: (y/n)");
        char ans = sc.next().charAt(0);
        
        if(ans == 'y') {
        	System.out.print("Enter inicial deposit value: ");
        	double inicialDeposit = sc.nextDouble();
        	
        	 ba = new BankAccount(accountNumber, holder, inicialDeposit);
        	
        } else {
        	 ba = new BankAccount(accountNumber, holder);
        }  
        
        System.out.println("Account data: ");
        System.out.println(ba.toString());
        
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        ba.deposit(depositValue);
        
        System.out.println("Updated account data: ");
        System.out.println(ba.toString());
        
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        ba.withdraw(withdrawValue);
        
        System.out.println("Updated account data: ");
        System.out.println(ba.toString());
		
		sc.close();

	}

}
