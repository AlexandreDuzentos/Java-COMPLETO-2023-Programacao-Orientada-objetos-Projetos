package model.entites;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double getTotalPayment() {
		/* Acessando o basicPayment e o Tax através dos métodos, para que
		 * quando num futuro, quando a regra para obter o basicPayment e o Tax mudarem
		 * o meu método já estiver pronto para essas mudanças.
		 * */
		return getBasicPayment() + getTax();
	}
	
}
