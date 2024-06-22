package arraysListas;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.print("NÚMEROS PARES: ");
		int qtdPares = 0;
		for(int i = 0; i < vet.length; i++) {	
			if(vet[i] % 2 == 0) {
				qtdPares += 1;
				System.out.print(vet[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+qtdPares);		
		sc.close();

	}

}
