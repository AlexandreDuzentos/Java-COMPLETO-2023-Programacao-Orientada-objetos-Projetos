package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Product;

public class Aula1 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("NOTEBOK", 1200.0));
		list.add(new Product("TABLET", 450.0));
		
		Collections.sort(list);
		
		for(Product element : list) {
			 System.out.println(element);
		}

	}

}
