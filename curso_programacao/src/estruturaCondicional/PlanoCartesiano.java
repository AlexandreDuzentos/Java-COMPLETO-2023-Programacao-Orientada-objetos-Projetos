package estruturaCondicional;

import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if(x < 0 && y > 0) {
			System.out.println("Q2");
		} else if(x < 0 && y < 0) {
			System.out.println("Q3");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else if(x == 0 && y != 0 ) {
			System.out.println("Eixo y");
		} else if(y == 0 && x != 0) {
			System.out.println("Eixo x");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();

	}

}
