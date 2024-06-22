package estruturaRepetitiva;

import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String quadrante = "";
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				quadrante = "Q1";
				System.out.println(quadrante);
			} else if(x < 0 && y > 0) {
				quadrante = "Q2";
				System.out.println(quadrante);
			} else if(x < 0 && y < 0) {
				quadrante = "Q3";
				System.out.println(quadrante);
			} else if(x > 0 && y < 0) {
				quadrante = "Q4";
				System.out.println(quadrante);
			} 
					
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		
		sc.close();

	}

}
