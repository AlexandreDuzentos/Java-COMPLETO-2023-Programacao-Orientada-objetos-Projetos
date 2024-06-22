package entities;

public class Product {
  
	public String name;
	public double price;
	public int quantity;
	
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
