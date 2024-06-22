package model.services;

import java.util.List;

import model.entities.Product2;

public class ProductService {
    
	/* Porém, com essa solução a classe ProductService não
	 * fica fechada para alteração. Se o critério de filtro de produtos mudar, precisaremos
	 * alterar a classe ProductService. Isso em termos de manutenção é indesejável. O ideal
	 * é termos critérios de filtro independentes da classe ProductService, de modo que
	 * eu não precise abrir e alterar a minha classe ProductService toda vez que mudar o critério
	 * de filtro para efetuar uma soma.
	 * 
	 * Uma possível solução para esse problema é passar a critério de filtro
	 * como parâmetro para o método filteredSum
	 */
	public double filteredSum(List<Product2> prods) {
		double sum = 0.0;	
		for(Product2 p : prods) {
			if(p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		
		return sum;
	}
}
