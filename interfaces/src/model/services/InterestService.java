package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	/*
	 * Quando o método abaixo for chamado a partir de um objeto do tipo InterestService,o
	 * método chamado será o da classe específica.
	 * 
	 * Por exemplo: InterestService is = new BrazilInterestService(2.0)
	 * is.getInterestRate() // o método getInterestRate sendo chamado é o da classe BrazilInterestService
	 * 
	 * O método abaixo não pode ter uma implentação padrão na interface, porque ele depende
	 * do valor da variável InterestRate que está armazenada nos serviços específicos e como
	 * a interface não pode armazenar estado, eu não posso colocar o valor da variável aqui.
	 * */
    double getInterestRate();
   
    /* A palavra reservada default na frente de um método da interface serve para dizer que o
     * método em questão é concreto.
     * 
     * Abaixo nós temos uma implementação padrão do método payment na interface.
     * */
	default double payment(double amount, int months) {
		/* Programação defensiva */
		if(months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
