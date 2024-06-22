package arraysListas;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		
		int somaPares = 0;
		double mediaPares;
		int qtdPares = 0;
		int impar = 0;
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				qtdPares += 1;
				somaPares += vet[i];
			}
		}
		
		
		if(qtdPares != 0) {
		   mediaPares = somaPares / qtdPares;
		   
		   System.out.println("MEDIA DOS PARES: "
		   +String.format("%.1f",mediaPares));	
		   
		} else {
			System.out.println("NEHNHUM NÚMERO PAR");
		}
		
	
		
		sc.close();
		
		

	}

}
