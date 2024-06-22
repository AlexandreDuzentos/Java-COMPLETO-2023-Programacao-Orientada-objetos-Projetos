package estruturaCondicional;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numQualquer;
		
		numQualquer = sc.nextDouble();
		
		if(numQualquer >= 0 && numQualquer <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if(numQualquer > 25 && numQualquer <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if(numQualquer > 50 && numQualquer <= 70) {
			System.out.println("Intervalor (50,75]");
		} else if(numQualquer > 75 && numQualquer <= 100) {
			System.out.println("Intervalo (75, 100]");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		
		sc.close();

	}

}
