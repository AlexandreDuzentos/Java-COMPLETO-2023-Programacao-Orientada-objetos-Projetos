package application;

import java.util.Scanner;

import model.services.PrintServiceGenerics;
import model.services.PrintServiceInteger;
import model.services.PrintServiceString;

public class Aula2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Solução 1 - usando String */
		PrintServiceString ps = new PrintServiceString();
		
		System.out.println("How many values: ");
		Integer n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);	
		}
		
		ps.print();
		System.out.println("First: "+ ps.first());
		
		sc.close();

	}

}
