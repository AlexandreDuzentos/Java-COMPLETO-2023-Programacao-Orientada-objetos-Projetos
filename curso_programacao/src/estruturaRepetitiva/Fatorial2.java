package estruturaRepetitiva;

import java.util.Scanner;

public class Fatorial2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* FATORIAL ------ SOLUÇÃO DO ALEXANDRE ------- */
		int fatorial = sc.nextInt();
		
		for(int i = fatorial - 1; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);

		sc.close();
	}

}
