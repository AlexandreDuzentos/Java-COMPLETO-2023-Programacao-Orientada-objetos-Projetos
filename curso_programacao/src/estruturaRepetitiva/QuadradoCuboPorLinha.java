package estruturaRepetitiva;

import java.util.Scanner;

public class QuadradoCuboPorLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cubo, quadrado;
		int n;
		
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			cubo = (int)Math.pow(i, 3);
			quadrado =(int)Math.pow(i,  2);
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();

	}

}
