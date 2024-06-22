package outrosTopicosBasicos;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		/* Chamada de função para calcular o maior valor */
		int higher = max(n1, n2, n3);
		
		/* Chamada de função para imprimir o maior valor */
		showResult(higher);
		
		sc.close();
	}
	
	/* implementação de função para calcular maior valor */
	public static int max(int x1,int x2, int x3) {
		int maior;
		
		if(x1 > x2 && x1 > x3) {
			maior = x1;
		} else if(x2 > x1 && x2 > x3) {
			maior = x2;
		} else {
			maior = x3;
		}
		
		return maior;
	}
	
	// implementação de função para dar saída a um valor
	public static void showResult(int valor) {
		System.out.println("Higher "+ valor);
	}

}
