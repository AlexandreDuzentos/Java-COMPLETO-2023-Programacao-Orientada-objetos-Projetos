package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product2;
import model.services.ProductService2;

public class Aula10 {

	public static void main(String[] args) {
		/* 
		 * Solução passando uma outra função como argumento. E portanto
		 * deixando a minha classe fechada para alteração, oque é algo
		 * desejável em termos de manutenção.
		 * */
		
		List<Product2> prods = new ArrayList<>();
		
		prods.add(new Product2("Tv", 900.00));
		prods.add(new Product2("Mouse", 500.00));
		prods.add(new Product2("Tablet", 350.00));
		prods.add(new Product2("HD Case", 80.90));
		
		ProductService2 ps = new ProductService2();
		
		/* 
		 * Versão: declaração da expressão lambda
		 * Predicado que armazena a condição para filtrar um produto */
		Predicate<Product2> criteria = prod -> prod.getName().charAt(0) == 'T';
		
		System.out.println(ps.filteredSum(prods, criteria));
		
		

	}

}
