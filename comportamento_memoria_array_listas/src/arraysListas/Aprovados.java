package arraysListas;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] pNotas = new double[n];
		double[] sNotas = new double[n];
		
		for(int i = 0; i < nomes.length; i++) {
			int numerador = i + 1;
			System.out.println("Digite nome, primeira e segunda nota do "
					+ numerador+"o aluno: ");
			
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			pNotas[i] = sc.nextDouble();
			sNotas[i] = sc.nextDouble();
					
		}
		
		double[] mediaPorAluno = new double[n];
		for(int i = 0; i < nomes.length; i++) {
			mediaPorAluno[i] = (pNotas[i] + sNotas[i]) / 2;

		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < nomes.length; i++) {
			if(mediaPorAluno[i] >= 6.0) {
				System.out.println(nomes[i]);	
			}
		}
		
		
		sc.close();

	}

}
