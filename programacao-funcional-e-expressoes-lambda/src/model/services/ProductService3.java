package model.services;

import java.util.List;

import model.entities.Product2;

public class ProductService3 {

	public double totalPrice(List<Product2> prods) {
		double sum = 0.0;
		for(Product2 prod : prods) {
			sum += prod.getPrice();
		}
		
		double averagePrice = sum / prods.size();
		
		return averagePrice;
	}
}
