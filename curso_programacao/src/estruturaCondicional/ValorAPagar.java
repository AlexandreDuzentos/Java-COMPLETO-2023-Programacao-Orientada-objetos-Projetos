package estruturaCondicional;

import java.util.Scanner;

public class ValorAPagar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double totalPagar;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if(codigo == 1) {
			totalPagar = qtd * 4.0;
		} else if(codigo == 2) {
			totalPagar = qtd * 4.5;
		} else if(codigo == 3) {
			totalPagar = qtd * 5.0;
		} else if(codigo == 4) {
			totalPagar = qtd * 4.0;
		} else {
			totalPagar = qtd * 1.5;
		}
		
		System.out.println("Total: R$ "+ String.format("%.2f", totalPagar));
		
		sc.close();

	}

}
