package application;

import model.entities.Client;

public class Aula16 {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Maria", "Maria@gmail.com");
		
		/* 
		 * O compilador dá um tratamento especial para valores literais atribuídos a
		 * objetos, como no exemplo abaixo, se eu for comparar  o objeto s1 ao
		 * objeto s2 usando o operador de igualdade(==), internamente o equals seria
		 * usado para efetuar a comparação.
		 * */
		String s1 = "Alex";
		String s2 = "Alex";
		
		/* nesse cenário, o compilador não dá tratamento especial, pois não está
		 * sendo atribuído um valor literal, mas sim uma instância de objeto, a 
		 * regra tradicional de comparação será usada. 
		 * */
		String s3 = new String("Alex");
		String s4 = new String("Alex");
		
		/* Código hash gerado a partir do conteúdo do objeto */
		System.out.println(c1.hashCode());
		
		/* Código hash gerado a partir do conteúdo do objeto */
		System.out.println(c2.hashCode());
		
		/* Comparando o conteúdo dos objetos */
		System.out.println(c1.equals(c2));
		
		/* Comparando referências de memória, que serão diferentes nesse
		 * cenário, pois cada instância de objeto tem sua própria e única
		 * referência de memória, ou seja, os objetos ocupam posições
		 * diferentes no heap.
		 *  */
		System.out.println(c1 == c2);
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

	}

}
