package model.funcional.interfaces;

import java.util.function.Consumer;

import model.entities.Product2;

public class ProductPriceUpdateConsumer implements Consumer<Product2> {

	@Override
	public void accept(Product2 prod) {
		prod.setPrice(prod.getPrice() + prod.getPrice() * 10.0/100);
		
	}

}
