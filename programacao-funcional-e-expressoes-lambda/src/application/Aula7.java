package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Product2;

public class Aula7 {

	public static void main(String[] args) {
		/* 
		 * Consumer(exemplo com o forEach) - ela é uma interface funcional
		 * generics, ou seja, ela é parametrizada por tipo. 
		 * */
		
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("Tv", 900.0));
		list.add(new Product2("Mouse", 50.0));
		list.add(new Product2("Tablet", 350.0));
		list.add(new Product2("HD case", 80.90));
		
		/* O método forEach da interface List percorre uma coleção e executa
		 * um Consumer para cada elemento da lista, a função foreach modifica a lista original.
		 * 
		 * versão: implementação da interface
		 * */
		//list.forEach(new PriceUpdateConsumer());
		
		/*
		 * para cada elemento da lista, o método println será chamado e para 
		 * ele passado o elemento da lista.
		 * 
		 * Aqui estamos fazendo reference method com método estático, para o 
		 * método println.
		 * */
		//list.forEach(System.out::println);
		
		/* versão 2: reference method com método estático */
		
		//list.forEach(Product2::staticProductPriceUpdateConsumer);
		//list.forEach(System.out::println);
		
		/* versão 3: reference method com método não estático */
		//list.forEach(Product2::nonStaticProductPriceUpdateConsumer);
		//list.forEach(System.out::println);
		
		/* versão 4: expressão lambda declarada */
		//Consumer<Product2> consumer = prod -> prod.setPrice(prod.getPrice() + (prod.getPrice() * 10.0/100));
		
		//list.forEach(consumer);
		//list.forEach(System.out::println);
		
		
		/* versão 5: expressão lambda inline */
		list.forEach(prod -> prod.setPrice(prod.getPrice() + (prod.getPrice() * 10.0/100)));
		list.forEach(System.out::println);
		

	}

}
