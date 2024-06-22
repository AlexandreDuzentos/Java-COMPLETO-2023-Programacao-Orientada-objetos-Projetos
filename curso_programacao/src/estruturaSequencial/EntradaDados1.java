package estruturaSequencial;

import java.util.Scanner;

public class EntradaDados1 {

	public static void main(String[] args) {
		
		/*  Alocando o recurso que permitirá o programa ler de dados.
		 * 
		 *  */
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char genero;
		
		/*
		 *  Lendo um dado do tipo string contíguo, ou seja,
		 *  uma única palavra. 
		 */
		nome = sc.next();
		
		// Lendo um dado do tipo int
		idade = sc.nextInt();
		
		// Lendo um dado do tipo double
		altura = sc.nextDouble();
		
		// Lendo um dado do tipo char
		genero = sc.next().charAt(0);
		
			
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(genero);
		
		
		// Desalocando o recurso que permitirá ao programa ler dados
		sc.close();
		
	    
	}

}
