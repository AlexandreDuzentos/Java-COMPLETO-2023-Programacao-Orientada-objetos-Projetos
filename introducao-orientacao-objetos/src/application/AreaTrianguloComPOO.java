package application;

import java.util.Scanner;

import entities.Triangle;

public class AreaTrianguloComPOO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* A variável x e y são referências dentro da stack para objetos que estão no heap*/
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
	    double areaX  = x.area();
	    double areaY = y.area();
		
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
