package estruturaSequencial;

import java.util.Scanner;

public class AreasFigurasGeometricas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio,
		areaQuadrado,areaRetangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTrianguloRetangulo = (a * c) / 2.0;
		areaCirculo = Math.PI * Math.pow(c, 2.0);
		areaTrapezio = (a + b) * c / 2.0;
		areaQuadrado = Math.pow(b, 2.0);
		areaRetangulo = a * b;

		
		System.out.println("TRIANGULO: "+ String.format("%.4f", areaTrianguloRetangulo));
		System.out.println("CÍRCULO: "+ String.format("%.4f", areaCirculo));
		System.out.println("TRAPÉZIO: "+ String.format("%.4f", areaTrapezio));
		System.out.println("QUADRADO: "+ String.format("%.4f", areaQuadrado));
		System.out.println("RETANGULO: "+ String.format("%.4f", areaRetangulo));
		
		sc.close();
		
	}

}
