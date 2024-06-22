package estruturaRepetitiva;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ans;
		double tempCelsius, tempFarenheit;
		
		do {
			System.out.println("Digite a temperatura em celsius");
			tempCelsius = sc.nextDouble();
			
			tempFarenheit = ((9 * tempCelsius)  / 5) + 32;
			
			System.out.println("Equivalente em farenheit: "+tempFarenheit);
			
			System.out.println("Deseja repetir (s/n)");
			ans = sc.next().charAt(0);
			
		}while(ans != 'n');
		
			
		sc.close();

	}

}
