package application;

import java.util.HashMap;
import java.util.Map;

import model.entities.Product2;

public class Aula26 {

	public static void main(String[] args) {
		
		/* 
		 *  Como o Map compara elementos?
		 *  R: Ele compara elementos usando o HashCode e o equals caso eles
		 *  estejam implementados na classe do objeto da chave do Map ou a comparação
		 *  de ponteiros caso eles não estejam implementados.
		 *  
		 *  vamos supor que deseja-se armazenar quanto tem de estoque de cada
		 *  product2
		 *  */
		Map<Product2, Double> stock = new HashMap<>();
		
		Product2 p1 = new Product2("Tv", 900.0);
		Product2 p2 = new Product2("Notebook", 1200.00);
		Product2 p3 = new Product2("Tablet", 400.00);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product2 ps = new Product2("Tv", 900.0);
		
		/* Se o retorno for true, isso significa que a chave(key) já
		 * existe no Map.
		 * */
		System.out.println("Contains 'ps' key: "+ stock.containsKey(ps));
		

	}

}
