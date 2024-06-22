package model.entities;

/* 
 * Product precisa implementar a interface Comparable<T>, porque 
 * a classe Product é tipo de uma lista, e para ordenar uma lista
 * usando Collections.sort(List<T>), o tipo T da lista precisa implementar
 * a interface Comparable, pois ele é  responsável por saber qual é o critério 
 * para comparar um produto com outro.
 * 
 * Porém, com a implementação da interface Comparable<T> a classe Product não
 * fica fechada para alteração. Se o critério de comparação mudar, precisaremos
 * alterar a classe Product. Isso em termos de manutenção é indesejável. O ideal
 * é termos critérios de comparação independentes da classe Product, de modo que
 * eu não precise abrir e alterar a minha classe Product toda vez que mudar o critério
 * de comparação.
 * 
 *  o tipo T que parametriza o Comparable<T> é o tipo a ser comparado.
 * 
 * Solução: Podemos então usar o default method "sort" da interface List:
 *    default void sort(Comparator<? super E> c)
 * 
 * */
public class Product implements Comparable<Product> {
   private String name;
   private Double price;
   
   public Product(String name, Double price) {
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

	@Override
	public int compareTo(Product other) {
		/* critério de comparação de um produto com outro pelo nome */
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
   
   
}
