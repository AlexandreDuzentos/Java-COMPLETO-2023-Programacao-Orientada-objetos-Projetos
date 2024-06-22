package estruturaCondicional;

import java.util.Scanner;

public class EscopoEInicializacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price = 400.00;
		
		double discount;
		
		
		// Inicializando o valor da variável com o dado informado pelo usuário
		price = sc.nextInt();
		
		System.out.println(price);
		
		if(price < 200.0) {
			/*
			 *  variáveis declaradas dentro de uma estrutura de controle só existirão durante
			 * a execução da estrutura em questão, quando a estrutura terminar a sua execução
			 * elas sumirão, ou seja, serão desalocadas da memória.
			 * 
			 * Se a atribuição a variável estivesse apenas dentro do if ocorreria um erro de variável
			 * não inicializada, por que não há garantia de que a variável será inicializada aqui dentro,
			 * pois para que ela seja inicializada a condição precisa ser verdadeira.
			 *  */
			discount = price * 0.1;
		} else {
			/*
			 *  A atribuição de um valor a variável dentro da estrutura else, garantirá que o erro de
			 *  variável não inicializada não ocorra.
			 */
			discount = 0.0;
		}
		
		System.out.println(discount);
		
		sc.close();

	}

}
