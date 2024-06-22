package estruturaRepetitiva;

import java.util.Scanner;

public class PrecoTerreno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("AREA = "+ String.format("%.2f", area));
		System.out.println("PRECO = "+ String.format("%.2f", preco));
		
		sc.close();
	}

}
