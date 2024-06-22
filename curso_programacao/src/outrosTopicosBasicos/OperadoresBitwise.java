package outrosTopicosBasicos;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		
		/* ---- CASO 1 ----*/
		int n1 = 89;
		int n2 = 60;
		
		/*
		 *  Realizando operações bit a bit usando os três operadores.
		 *  
		 *  O resultado de uma operação bit a bit é um valor binário
		 *  que é convertido para decimal.
		 *  */
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		/* ---- CASO 2 ----*/
		
		Scanner sc = new Scanner(System.in);
		
		// Atribuindo um valor binário para uma variável inteira
		int mask = 0b00100000;
		
		int n = sc.nextInt();
		
		// Testando se o sexto bit de n vale o mesmo que o sexto bit de mask que é 1
		if((n & mask) != 0) {
			System.out.println("6th bit is true");
		} else {
			System.out.println("6th bit is false");
		}	
		
		sc.close();
		
		
		
		
	}

}
