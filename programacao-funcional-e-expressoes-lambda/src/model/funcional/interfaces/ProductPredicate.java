package model.funcional.interfaces;

import java.util.function.Predicate;

import model.entities.Product2;

public class ProductPredicate implements Predicate<Product2> {

	@Override
	public boolean test(Product2 prod) {
		// TODO Auto-generated method stub
		return prod.getPrice() >= 100;
	}

}
