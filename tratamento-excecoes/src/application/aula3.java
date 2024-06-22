package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class aula3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		System.out.print("Enter the amount for withdraw: ");
		double withdrawAmount = sc.nextDouble();
		
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);
		
		try {
			acc.withdraw(withdrawAmount);
			System.out.println("new balance: "+ acc.getBalance());
		} catch(DomainException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		} finally {
			
			sc.close();
		}

	}

}
