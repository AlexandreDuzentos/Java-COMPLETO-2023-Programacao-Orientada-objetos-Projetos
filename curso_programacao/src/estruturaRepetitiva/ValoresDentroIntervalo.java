package estruturaRepetitiva;

import java.util.Scanner;

public class ValoresDentroIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, qtdDentroIntervalo, qtdForaIntervalo;
		
		qtdDentroIntervalo = 0;
		qtdForaIntervalo = 0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				qtdDentroIntervalo++;
			} else {
				qtdForaIntervalo++;
			}
		}
		
		System.out.println("in "+ qtdDentroIntervalo);
		System.out.println("out "+ qtdForaIntervalo);
		
		sc.close();

	}

}
