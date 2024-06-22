package arraysListas;

import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas: ");
		int linhas = sc.nextInt();
		
		System.out.println("Digite o número de colunas: ");
		int colunas = sc.nextInt();
		
		int[][] mat = new int[linhas][colunas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um valor: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if(n == mat[i][j]) {
					
					
					System.out.print("Position ");
					System.out.print(i + ","+ j+ ":");
					System.out.println();
					
					/* Testando se o índice referente a coluna não excede e nem
					 * inferior a quantidade de colunas da matriz. 
					 * */
					if(j - 1 <= (linhas -1) && j >= 0) {
						// left
						System.out.println("Left: "+ mat[i][j-1]);
					} else {
						System.out.println("Left: "+ mat[i][j-1]);
					}
					
					/* Testando se o índice referente a coluna não excede e nem
					 * inferior a quantidade de colunas da matriz. 
					 * */
					if(j + 1 <= (linhas -1) && j >= 0) {
						// right
						System.out.println("Right: "+ mat[i][j+1]);
					} else {
						// up
						System.out.println("Up: "+ mat[i-1][j]);
					}
					
					/* Testando se o índice referente a linha não excede e nem
					 * inferior a quantidade de linhas da matriz. 
					 * */
					if(i >= 0 && i <= (colunas -1)) {
						// down
						System.out.println("Down: "+ mat[i+1][j]);
					} else {
						// down
						System.out.println("Down: "+ mat[i+1][j]);
					}
						
						
					
				}
			}
		}
		
		sc.close();

	}

}
