package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double amountToBuy = sc.nextDouble();
		
		double valueToPayInReal = CurrencyConverter.convertFromDollarToReal(dollarPrice, amountToBuy);
		
		System.out.println(String.format("%.2f",valueToPayInReal));
		
		sc.close();
	}

}
