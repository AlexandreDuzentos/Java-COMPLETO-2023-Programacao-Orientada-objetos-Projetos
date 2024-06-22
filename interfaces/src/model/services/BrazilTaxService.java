package model.services;

public class BrazilTaxService implements TaxService {

	/* Método responsável por calcular o imposto para as regras de imposto do brasil */
	public double tax(double amount) {
		double tax = 0.0;
		if(amount <= 100.0) {
			tax = (20/100.0) * amount;
		} else {
			tax = (15/100.0) * amount;
		}
		
		return tax;
	}
}
