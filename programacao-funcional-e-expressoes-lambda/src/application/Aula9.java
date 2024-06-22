package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product2;
import model.services.ProductService;

public class Aula9 {

	public static void main(String[] args) {
		/* 
		 * Solução sem passar uma outra função como argumento. E portanto
		 * deixando a minha classe ProductService aberta para alteração, oque
		 * é algo ruím em termos de manutenção.
		 * */
		
		List<Product2> prods = new ArrayList<>();
		
		prods.add(new Product2("Tv", 900.00));
		prods.add(new Product2("Mouse", 500.00));
		prods.add(new Product2("Tablet", 350.00));
		prods.add(new Product2("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		System.out.println(ps.filteredSum(prods));
		
		

	}

}
