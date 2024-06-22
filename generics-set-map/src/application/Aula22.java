package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Product2;

public class Aula22 {

	public static void main(String[] args) {
		/*
		 *  Como o TreeSet compara elementos?
		 *  
		 *  Para o Set com a implementação do TreeSet comparar elementos, o tipo
		 *  T específico ou o tipo do Set precisa implementar a interface Comparable<T> 
		 *  
		 *  O objetivo da comparação entre elementos do conjunto(Set) usando
		 *  a implementação TreeSet é a ordenação dos elementos por ordem alfabética
		 *   ou numérica.
		 */
		
		Set<Product2> prods = new TreeSet<>();
		
		prods.add(new Product2("TV", 900.0));
		prods.add(new Product2("NOTEBOOK", 1200.00));
		prods.add(new Product2("TABLET", 400.0));
		
		
		/* Sem a implementação da interface Comparable<T> um exceção é lançada,
		 * pois o tipo T específico ou tipo do Set precisa ser um Comparable<T>
		 * ou seja, implementar a interface Comparable<T>, para que ele tenha
		 * condições de ordenar os elementos do Set(conjunto)
		 * */
		for(Product2 p: prods) {
			System.out.println(p);
		}

	}

}
