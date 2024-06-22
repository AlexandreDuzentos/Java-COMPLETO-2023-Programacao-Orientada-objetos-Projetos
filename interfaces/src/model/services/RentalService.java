package model.services;

import java.time.Duration;

import model.entites.CarRental;
import model.entites.Invoice;

/* classe responsável por associar um CarRental a um Invoice */
public class RentalService {

	/* O serviço RentalService tem uma peculiaridade de possuir atributos */
	private Double pricePerDay;
	private Double pricePerHour;
	
	/* Um RentalService depende do BrazilTaxService para calcular o imposto(tax) sobre
	 * o valor do basicPayment, imposto este que estará impresso na fatura(Invoice).
	 * 
	 *  Não é uma boa prática termos a declaração abaixo, porque o meu RentalService
	 *  ficará dependende do BrazilTaxService ou seja das regras de imposto do brasil
	 *  para calcular o imposto(tax) sobre o valor do basic payment, isso é problemático
	 *  porque deixará o meu sistema com dois pontos de alteração caso amanhã mude a regra
	 *  de imposto(tax).
	 *  
	 *  como assim dois pontos de alteração?
	 *  R: ponto 1: caso a minha regra de impostos mude para UnitedStatesTaxService, eu terei de instânciar
	 *  uma objeto do tipo UnitedStatesTaxService e passa-lo para o construtor da minha classe RentalService
	 *  no consumidor da classe RentalService afim de alterar a dependência do meu RentalService de BrazilTaxService
	 *  para UnitedStatesTaxService.
	 *  
	 *  Ponto 2 : e também terei de abrir a minha classe RentalService e trocar o tipo do
	 *  taxService para UnitedStatesTaxService.
	 *  
	 *  Por conta desses dois pontos de alteração nós temos um alto acoplamento entre o RentalService
	 *  e o BrazilTaxService.
	 *   
	 *    Qual é a solução para resolver esse problema de dois pontos de alteração?
	 *    R: É aí que entra as interfaces, ao invés da dependência ser com o BrazilTaxService
	 *    ou com o UnitedStatesTaxService, ela será com uma interface implementada por esses
	 *    dois serviços, ou seja o meu RentalService dependerá de TaxService que é uma interface
	 *    genérica implementada pelo BrazilTaxService ou qualquer outro TaxService que possa vir
	 *    a ser criado no futuro.
	 *    
	 *    Por que o TaxService casa ou pode receber com o BrazilTaxService?
	 *    R: Porque o BrazilTaxService é um subtipo de TaxService, o que estará a acontecer 
	 *    é um upcasting, que nada mais é do que a conversão natural de um tipo mais específico
	 *    para um tipo mais genérico.
	 *   */
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		
		/* Injeção de dependência por meio de construtor */
		this.taxService = taxService;
		
		/*
		 * Aqui temos uma não injeção de dependência, oque gera um forte acoplamento
		 * entre entre a classe RentalService e a classe concreta, porque a própria
		 * classe RentalService está sendo responsável por instanciar a dependência dela.
		 **/
		// this.taxService = new BrazilTaxService();
	}
	
	/* Método responsável por processar o carRental gerando para ele o Invoice(fatura), 
	 * ou seja, ele associará um carRental com um Invoice
	 *  */
	public void processInvoice(CarRental carRental) {
		
		/* Obtendo a diferença entre duas datas em minutos */
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		
		/* convertendo a diferença entre as datas de minutos para horas */
		double hours = minutes / 60.0;
		
		/* convertendo a diferença entre as datas de horas para dias */
		double days = hours / 24.0;
		
		double basicPayment;
		if(hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(days);
		}
		
		/* Calculando o tax(imposto) do basicPayment usando o serviço de impostos do brasil */
		double tax = taxService.tax(basicPayment);
		
		/* associando o meu CarRental a um Invoice(fatura) */
		 carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
