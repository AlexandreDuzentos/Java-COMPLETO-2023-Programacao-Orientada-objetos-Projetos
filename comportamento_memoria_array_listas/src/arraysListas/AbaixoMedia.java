package arraysListas;

import java.util.Scanner;

public class AbaixoMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print(" ");
		double soma = 0.0;
		double media;
		for(int i = 0; i < vet.length; i++) {
			 soma += vet[i];
		}
		
		media = soma / vet.length;
		
		
		System.out.println("MEDIA DO VETOR = "+String.format("%.3f", media));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] < media) {
				System.out.println(String.format("%.1f", vet[i]));
			}
		}
		
		sc.close();

	}

}
