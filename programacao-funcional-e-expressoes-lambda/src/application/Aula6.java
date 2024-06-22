package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product2;

public class Aula6 {
	
	public static void main(String[] args) {
		
		/* 
		 * Predicate(exemplo com removeIf) - ela é uma interface funcional
		 * generics, ou seja, é parametrizada por tipo.
		 **/
		
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("Tv", 900.0));
		list.add(new Product2("Mouse", 50.0));
		list.add(new Product2("Tablet", 350.0));
		list.add(new Product2("HD case", 80.90));
		
		/* 
		 * Removendo elementos da lista baseado em um predicado
		 * 
		 * ProductPredicate é um implementação da interface funcional
		 * predicate<T>, e implementações de interfaces funcionais são
		 * tratadas como expressões lambada.
		 * 
		 * versão 1: implementação da interface
		 * */
		//list.removeIf(new ProductPredicate());
		
		/* Versão 2: reference method com método estático */
		//list.removeIf(Product2::staticproductPredicate);
		
		/* Versão 3: reference method método não estático */
		//list.removeIf(Product2::nonStaticProductPredicate);
		
		/* Versão 4: expressão lambada declarada 1 */
		//Predicate<Product2> pred = p1 -> {
			//return p1.getPrice() >= 100;
		//}; 
		
		//list.removeIf(pred);
		
		/* Versão 4: expressão lambda declarada 2 */
		//Predicate<Product2> pred = p1 -> p1.getPrice() >= 100;
		//list.removeIf(pred);
		
		/* Versão 5: expressão lambda inline */
		list.removeIf(p1 -> p1.getPrice() >= 100);
		
		
		for(Product2 element : list) {
			System.out.println(element);
		}		
		

	}

}
