package arraysListas;

import java.util.Scanner;

public class ArrayParte1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double averageHeight = 0.0;
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();	
		}
		
		
		double somaAlturas = 0;
		for(int i = 0; i < n; i++) {
			somaAlturas += vet[i];
		}   
		
		averageHeight = somaAlturas / n;
		
		System.out.println("AVERAGE HEIGHT = "+ String.format("%.2f",averageHeight));
		
		sc.close();

	}

}
