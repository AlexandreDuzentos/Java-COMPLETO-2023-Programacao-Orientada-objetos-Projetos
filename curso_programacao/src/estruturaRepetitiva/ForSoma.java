package estruturaRepetitiva;

import java.util.Scanner;

public class ForSoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x, soma;
		
		soma = 0;
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
