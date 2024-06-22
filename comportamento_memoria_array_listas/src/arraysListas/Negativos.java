package arraysListas;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] < 0) {
				System.out.print(vet[i]);
			}
		}
		
		
		sc.close();

	}

}
