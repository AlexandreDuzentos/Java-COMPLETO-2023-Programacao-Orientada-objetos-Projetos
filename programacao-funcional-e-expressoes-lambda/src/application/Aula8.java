package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Product2;

public class Aula8 {

	public static void main(String[] args) {
		/* 
		 * Function(exemplo com o map) - ela é uma interface funcional
		 * generics, ou seja, ela é parametrizada por tipo. 
		 * */
		
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("Tv", 900.0));
		list.add(new Product2("Mouse", 50.0));
		list.add(new Product2("Tablet", 350.0));
		list.add(new Product2("HD case", 80.90));
		
		/* 
		 * Versão 1: implementação da interface
		 * 
		 * A função "map"(não confunda com a estrutura de dados Map), é uma
		 * função que aplica uma função a todos elementos de uma stream. Gerando
		 * uma nova stream com os elementos transformados
		 * 
		 * A função map gera uma nova stream com os elementos modificados, não modifica a strem
		 * original.
		 * 
		 * Conversões: 
		 * 
		 * List para Stream: .stream()
		 * Stream para list: .collect(Collectors.toList)
		 * */
		//List<String> upperCaseName = list.stream().map(new ProductUpperCaseNameFunction()).collect(Collectors.toList());
		
		//upperCaseName.forEach(System.out::println);
		
		/* versão 2: reference method com método estático */
		//List<String> upperCaseName = list.stream().map(Product2::staticProductUpperCaseNameFunction).collect(Collectors.toList());
		//upperCaseName.forEach(System.out::println);
		
		/* versão 3: reference method com método não estático */
		//List<String> upperCaseName = list.stream().map(Product2::nonStaticProductUpperCaseNameFunction).collect(Collectors.toList());
		//upperCaseName.forEach(System.out::println);
		
		/* versão 4: expressão lambda declarada */
		//Function<Product2, String> newList = prod -> prod.getName().toUpperCase();
		
		//List<String> upperCaseName = list.stream().map(newList).collect(Collectors.toList());
		//upperCaseName.forEach(System.out::println);
		
		/* versão 5: expressão lambda inline */
		List<String> upperCaseName = list.stream().map(prod -> prod.getName().toUpperCase()).collect(Collectors.toList());
	    upperCaseName.forEach(System.out::println);
				

	}

}
