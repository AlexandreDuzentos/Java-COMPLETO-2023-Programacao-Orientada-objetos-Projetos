package estruturaRepetitiva;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if(y == 0) {
				System.out.println("Divisão impossível");
			} else {
				System.out.println(x / y);
			}
		}
		
		sc.close();

	}

}
