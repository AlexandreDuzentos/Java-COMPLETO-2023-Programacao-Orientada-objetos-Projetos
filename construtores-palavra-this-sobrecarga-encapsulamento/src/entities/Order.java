package entities;

import java.util.Date;

public class Order {
   
	public Date date;
	public Product product;
	
	public Order(Date date, Product product) {
		this.date = date;
		this.product.name = "TV";
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
		
	
}
