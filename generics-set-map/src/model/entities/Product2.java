package model.entities;

import java.util.Objects;

public class Product2 implements Comparable<Product2> {
   
	private String name;
	private Double price;
	
	public Product2(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product2 other = (Product2) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	/* 
	 * O critério para comparar um objeto com o outro usando  método compareTo
	 * da interface Comparable<T>, depende do negócio.
	 * */
	@Override
	public int compareTo(Product2 other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
	
	
	


}
