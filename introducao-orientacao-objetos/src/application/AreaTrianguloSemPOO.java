package application;

import java.util.Scanner;

public class AreaTrianguloSemPOO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// Solução sem POO
		double xA, xB, xC, yA, yB, yC, areaX, areaY, pX, pY;
		System.out.println("Enter the measures of triangle x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		pX = (xA + xB + xC) / 2.0;
		areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		pY = (yA + yB + yC) / 2.0;
		areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.println("Triangle x area: "+ String.format("%.4f", areaX));
		
		System.out.println("Triangle y area: "+ String.format("%.4f", areaY));
		
		if(areaX > areaY) {
			System.out.println("Larger area: x");
		} else {
			System.out.println("Larger area: y");
		}
		
		
		sc.close();
		
	}

}
