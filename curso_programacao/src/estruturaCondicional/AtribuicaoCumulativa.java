package estruturaCondicional;

import java.util.Scanner;

public class AtribuicaoCumulativa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		
		minutos = sc.nextInt();
		
		if(minutos > 100) {
		   conta += (minutos - 100) * 2.0;
		}
		
		System.out.println("Valor a pagar R$ "+String.format("%.2f", conta));
		
		sc.close();
		
		

	}

}
