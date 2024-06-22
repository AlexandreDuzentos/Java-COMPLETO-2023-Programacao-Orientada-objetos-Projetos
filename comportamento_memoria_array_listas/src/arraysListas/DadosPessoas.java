package arraysListas;

import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < altura.length; i++) {
			int numerador = i + 1;
			System.out.println("Altura da "+numerador+"a pessoa: ");
			altura[i] = sc.nextDouble();
			
			System.out.println("Gênero da "+numerador+"a pessoa: ");
			genero[i] = sc.next().charAt(0);
			
		}
		
		double maiorAltura = altura[0];
		double menorAltura = altura[0];
		double somaAlturaMulheres = 0.0;
		double mediaAlturaMulheres;
		int qtdHomens = 0;
		int qtdMulheres = 0;
		for(int i = 0 ; i < altura.length; i++) {
			 if(altura[i] > maiorAltura) {
				 maiorAltura = altura[i];
			 }
			 
			 if(altura[i] < menorAltura) {
				 menorAltura = altura[i];
			 }
			 
			 if(genero[i] == 'F') {
				 somaAlturaMulheres += altura[i];
				 qtdMulheres += 1;
			 } else {
				 qtdHomens += 1;
			 }
			 
			
		}
		
		 mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;
		 
		 System.out.println("Menor altura = "+ menorAltura);
		 System.out.println("Maior altura = "+ maiorAltura);
		 System.out.println("Media altura das mulheres = "+  String.format("%.2f",mediaAlturaMulheres));
		 System.out.println("Número de homens = "+ qtdHomens);
		
		
		sc.close();

	}

}
