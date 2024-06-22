package arraysListas;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número");
			vet[i] = sc.nextDouble();
		}
		
		
		double maiorValor = vet[0];
		int posicaoMaiorValor = 0;
		for(int i = 0 ; i < vet.length; i++) {
			if(vet[i] > maiorValor) {
				maiorValor = vet[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println("MAIOR VALOR = "+maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = "+ posicaoMaiorValor);
		
		sc.close();

	}

}
