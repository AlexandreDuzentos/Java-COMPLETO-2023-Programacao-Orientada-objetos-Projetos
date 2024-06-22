package arraysListas;

import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a ordem da matriz?");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		int qtdNegativos = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] < 0) {
					qtdNegativos += 1;
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		System.out.println("Negative numbers "+ qtdNegativos);
		
		sc.close();

	}

}
