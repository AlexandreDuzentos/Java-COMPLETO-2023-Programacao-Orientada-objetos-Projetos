package model.services;

import java.util.List;

import model.entities.Product;

public class CalculationService {
 
	/*  Esse método max serve para encontrar o maior valor dentre
	 *  um conjunto de elementos, é uma operação genérica, ou seja, funciona
	 *  para qualquer tipo de dado.
	 * 
	 *  Abaixo estou dizendo que o método max será parametrizado com
	 *  um tipo T qualquer e que esse tipo T é um tipo Comparable, ou seja,
	 *  estou assumindo que T implementará a interface Comparable<T>, que possui
	 *  o método abstrato compareTo, logo T terá de implementar o contrato, que
	 *  corresponde única e exclusivamente ao método compareTo.
	 *  
	 *  
	 *  <T extends Comparable<T>>
	 *  
	 *  <T>  é necessário porque a classe não foi parametrizada
	 *  com um tipo T.
	 *  
	 *  O método max irá trabalhar com qualquer tipo T, desde que o T seja um subtipo
	 *  de Comparable<T>(<T extends Comparable<T>)
	 * 
	 * versão completa: Abaixo estou falando que T é um Comparable ou qualquer superclasse
	 * de T é um Comparable, no caso da minha classe Product, pode ser o Product ou qualquer supertipo
	 * de Product.
	 * 
	 * Por quê?
	 * R: porque se alguma superclasse de Product possuir o método compareTo, o
	 * meu Product herdará esse compareTo, o que também elimina a necessidade de se
	 * implementar a interface Comparable<Product> na classe Product, uma vez que
	 * uma superclasse de Product já a implementou.
	 * 
	 * <T extends Comparable<? super T>>
	 * 
	 * O exemplo abaixo representa um generics delimitado, porque o tipo T específico
	 * está delimitado entre ele mesmo ou qualquer superclasse dele mesmo, logo
	 * o tipo T não pode ser qualquer tipo.
	 **/
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty!");
		}
		
		T max = list.get(0);
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		
		return max;
	}
}
