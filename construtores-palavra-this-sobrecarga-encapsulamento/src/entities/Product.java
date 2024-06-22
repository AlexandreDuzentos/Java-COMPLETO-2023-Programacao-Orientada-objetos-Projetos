package entities;

public class Product {
	String name;
	private double price;
	private int quantity;
	
	/* 
	 * Sobrecarga é disponibilizar versões diferentes de um mesmo
	 * método numa classe, a diferença entre eles estará apenas na lista de
	 * parâmetros.
	 **/
	
	// construtor padrão
	public Product() {
	}
	
	/*  Os parâmetros passados para um método são variáveis locais
	 *  daquele método, ou seja, acessíveis apenas dentro dele. 
	 * */
	public Product(String name, double price, int quantity) {
		/*
		 *  O this é uma referência para o próprio objeto. 
		 *  É utilizado para diferenciar atributos de variáveis locais.
		 * */
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
		/* A linguagem java, por padrão inicia números de objetos
		 * e arrays como valor zero, logo, a atribuição abaixo 
		 * é opcional, bem como, o uso da palavra this, uma vez que
		 * não há variáveis locais com o mesmo nome do atributo
		 * quantity.
		 * */
		this.quantity = 0;
	}
	
	/* Por convenção, métodos modificadores e acessores vêm depois
	 * do construtor.
	 * */
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* A quantidade de um produto só pode ser alterada pelos métodos
	 * de entrada e saída do stock, por conta disso,
	 * não teremos o método setQuantity, porque ele nos permitirá
	 * modificar diretamente a quantidade no stock.
	 * 
	 * O método setQuantity não será criado para proteger o meu objeto
	 * produto de alterações inconsistentes na quantidade dele.
	 * */
	public int getQuantity() {
		return this.quantity;
	}
		
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	/* Sobrepondo o método toString da classe Objet afim de implementar a minha própria
	 * versão dele, para "falar" como eu desejo que o meu objeto produto apareça na forma de 
	 * string.
	 * 
	 * O método toString converte um objeto para String.
	 * */
	public String toString() {
		return this.name
				+ ", $"
				+ String.format("%.2f", this.price)
				+ ", "
				+ this.quantity
				+ " units, "
				+ "Total: $ "
				+ String.format("%.2f",this.totalValueInStock());		
	}
}
