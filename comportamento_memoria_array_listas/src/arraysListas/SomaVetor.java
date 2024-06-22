package arraysListas;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		
		double soma = 0;
		double media;
		System.out.print("VALORES = ");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
			
			soma += vet[i];
		}
		
		
		media = soma / vet.length;
		
		System.out.println();
		System.out.println("SOMA = "+ String.format("%.2f", soma));
		System.out.println("MEDIA = "+ String.format("%.2f", media));
		
		sc.close();

	}

}
