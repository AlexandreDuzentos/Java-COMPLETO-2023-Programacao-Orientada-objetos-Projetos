package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product2;

public class Aula4 {
	
	/* 
	 * Método responsável por comparar dois objetos na mesma classe
	 * que contém o método main. 
	 * */
	public static int compareProducts(Product2 p1, Product2 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	} 

	public static void main(String[] args) {
		/* Funções são objetos de primeira ordem(ou primeira classe) */
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("TV", 900.00));
		list.add(new Product2("NOTEBOOK", 1200.00));
		list.add(new Product2("TABLET", 450.00));
		
		
		/*
		 *  Utilizamos aqui "method references"
		 *  
		 *  Operador ::
		 *  
		 *  Sintaxe classe::método
		 * 
		 *  Passando a função compareProducts como argumento
		 *  para a função sort, utilizando "method references"
		 * */
		list.sort(Aula4::compareProducts);
		
		for(Product2 prod: list) {
			System.out.println(prod);
		}

	}

}
