package application;

import entities.Rectangle;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println("AREA = "+String.format("%.2f", rect.area()));
		System.out.println("PERIMETER = "+String.format("%.2f", rect.perimeter()));
		System.out.println("DIAGONAL = "+String.format("%.2f", rect.diagonal()));
		
		
		sc.close();

	}

}
