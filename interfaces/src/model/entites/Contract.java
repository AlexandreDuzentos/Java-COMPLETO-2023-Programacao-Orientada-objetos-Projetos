package model.entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
  private Integer number;
  private LocalDate date;
  private Double totalValue;
  
  private List<Installment> installments;
  
  public Contract(Integer number, LocalDate date, Double totalValue) {
	  this.number = number;
	  this.date = date;
	  this.totalValue = totalValue;
	  
	  /* ArrayList é uma classe que implementa a interface List, o que está ser
	   * feito abaixo é um upcasting, porque o A classe ArrayList é subtipo do superTipo List.
	   * */
	  installments = new ArrayList<>();
  }

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Double getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	  
	/* Método responsável por associar um contrato(contract) a uma parcela(installment) */
	public void addInstallment(Installment installments) {
		 this.installments.add(installments);
	}
	
	/* Método responsável por retornar todas a parcelas */
	public List<Installment> getInstallments(){
		return installments;
	}
	
	
}
