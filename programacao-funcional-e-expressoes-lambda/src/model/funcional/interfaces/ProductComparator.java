package model.funcional.interfaces;

import java.util.Comparator;

import model.entities.Product2;

/* A classe MyComparator por ser um Comparator, ou seja, por implementar
 * a interface funcional Comparator<T>, ela é tratada como uma expressão 
 * lambda.
 * 
 * A classe MyComparator é uma implementação da interface funcional Comparator<T>,
 * por conta disso, ela é tratada como uma expressão lambda.
 * */
public class ProductComparator implements Comparator<Product2> {

	@Override
	/* o princípio do funcionamento do compare é o mesmo que do compareTO,
	 * retorna um valor positivo se o primeiro objeto for maior do que o segundo,
	 * retorna zero se o primeiro objeto for igual ao  segundo e retorna negativo
	 * se o primeiro for menor que o segundo.
	 * */
	public int compare(Product2 p1, Product2 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

	
}
