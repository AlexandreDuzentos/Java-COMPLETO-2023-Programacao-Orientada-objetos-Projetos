package estruturaSequencial;

import java.util.Scanner;

public class AreaCirculo {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2.0);
		
		System.out.println("Área = "+String.format("%.4f", area));
		
		sc.close();
	}
}
