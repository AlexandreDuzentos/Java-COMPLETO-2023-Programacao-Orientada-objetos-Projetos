package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Product;
import model.entities.Product2;

public class Aula2 {

	public static void main(String[] args) {
		
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("Tv", 900.0));
		list.add(new Product2("Notebook", 1200.0));
		list.add(new Product2("Tablet", 450.0));
		
		/* O método sort da interface list é responsável por ordenar uma Lista
		 * de um tipo T, recebe como argumento um comparator.
		 * 
		 * Uma das formas de criar um comparator é ter uma classe que
		 * implemente a interface Comparator<T> parametrizando-a com o tipo T
		 * correspondente ao tipo que se deseja comparar. - forma 1
		 * 
		 * A outra forma é declarar um comparator é usando uma sintaxe de classe 
		 * anónima. - forma 2
		 * 
		 *  Existem várias outras formas de definir um comparator no método sort.
		 * */
		// list.sort(new MyComparator()); forma 1 - comparator
		
		/*
		 * sintaxe de classe anónima(classe sem nome)
		 * A declaração de classe anónima é muito verbosa, para deixar isso
		 *  muito mais enxuto, vamos partir para a terceira forma, usando
		 *  expressões lambda.
		 * 
		 **/
		/*
		Comparator<Product2> comp = new Comparator<Product2>() {

			@Override
			public int compare(Product2 p1, Product2 p2) {	
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		*/
		
		/* Sintaxe de expressão lambada, que nada mais é do que uma função anónima.
		 * 
		 * A função anónima tem a seguinte sintaxe: do lado esquerdo, os parâmetros
		 * e depois você coloca o (traco(-) e o maior(>)( ->)) que é a setinha e na frente
		 * você coloca a implementação da função, essa sintaxe é também chamada
		 * de arrow function.
		 * 
		 * É dispensável definir os tipos dos parâmetros, pois, o compilador já
		 * faz uma inferência de tipos como tipo do Comparator.
		 * 
		 *  O return deve estar explícito quando a arrow function possui corpo,
		 *  quando ela não possui é return fica implícito, o corpo é delimitado
		 *  por par de chaves.
		 * */
		/*
		 * Sintaxe opcional
		Comparator<Product2> comp = (p1, p2) -> {
			return p1.getName() .toUpperCase().compareTo(p2.getName().toUpperCase());      
		};
		*/
		
		/* Sintaxe sem corpo e portanto com o return implícito */
		// Comparator<Product2> comp = (p1, p2) -> p1.getName() .toUpperCase().compareTo(p2.getName().toUpperCase());
		
		/* 
		 * Sintaxe passando directamente a expressão lambda como argumento para
		 * o método sort.
		 * */
		list.sort((p1, p2) -> p1.getName() .toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product2 element : list) {
			 System.out.println(element);
		}

	}

}
