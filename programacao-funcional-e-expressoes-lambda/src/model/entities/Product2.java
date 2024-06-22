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
 * Solução: Podemos então usar o default method "sort" da interface List:
 *    default void sort(Comparator<? super E> c)
 * 
 * */
public class Product2 {
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
	
	
	/* reference method com método estático(métodos estáticos não aceitam
	 * fazer referências ao this, pois ele é um membro da classe em questão),
	 * por isso ele trabalhará com o Product passado como argumento
	 * para ele e não para o product do objeto em questão.
	 *  */
	public static boolean staticProductPredicate(Product2 p) {
		return p.getPrice() >= 100;
	}
	
	/* reference method com método não estático, métodos não estáticos
	 * trabalharão com o produto do objeto em questão, pois ele é um
	 * mmebro da instância do objeto em questão.
	 * */
	public boolean nonStaticProductPredicate() {
		return getPrice() >= 100;
	}
	
	/* reference method com método estático - Consumer */
	public static void staticProductPriceUpdateConsumer(Product2 prod) {
		prod.setPrice(prod.getPrice() + (prod.getPrice() * 10.0/100));
	}
	
	/* reference method com método não estática - Consumer */
	public void nonStaticProductPriceUpdateConsumer() {
		setPrice(getPrice() + (getPrice() * 10.0/100));
	}
	
	/* reference method com método estático - Function */
	public static String staticProductUpperCaseNameFunction(Product2 prod) {
		return prod.getName().toUpperCase();
	}
	
	/* reference method com método não estático - Function */
	public String nonStaticProductUpperCaseNameFunction() {
		return getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
   
   
}
