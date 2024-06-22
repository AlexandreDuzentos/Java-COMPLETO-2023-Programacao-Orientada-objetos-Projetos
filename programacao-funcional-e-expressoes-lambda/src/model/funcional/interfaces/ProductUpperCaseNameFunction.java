package model.funcional.interfaces;

import java.util.List;
import java.util.function.Function;

import model.entities.Product2;

public class ProductUpperCaseNameFunction implements Function<Product2, String> {

	@Override
	public String apply(Product2 prod) {
		 return prod.getName().toUpperCase();
	}

}
