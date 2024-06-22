package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		
		/* Pilha de chamada de métodos(stack trace) */
		aula1.method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("**** METHOD 1 START *****");
		aula1.method2();
		System.out.println("**** METHOD 1 END *****");
	}
	
	public static void method2() {
		System.out.println("**** METHOD 2 START *****");
		/* Declarando um objeto sc do tipo Scanner e instânciando-o */
		Scanner sc = new Scanner(System.in);
		
		/* declarando um vetor de String vet, a função split retorna um vetor de Strings */
		
		
		// Quando uma exceção não é tratada(capturada) a execução do programa é encerrada.
		try {
			// código que pode lançar uma exceção
			String[] vet = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vet[position]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			
			/* Imprime na tela o rastreamento do stack, que conterá a sequência de chamadas
			 * que gerará a exceção, atentar-se a linhas de código indicadas. */
			e.printStackTrace();
			sc.next(); // a leitura de dados pausa o programa.
		} catch(InputMismatchException e) {
			/* código a ser executado caso uma exceção ocorra */
			System.out.println("invalid input");
		}
		
		
		sc.close();
		
		System.out.println("**** METHOD 2 END *****");
	}

}
