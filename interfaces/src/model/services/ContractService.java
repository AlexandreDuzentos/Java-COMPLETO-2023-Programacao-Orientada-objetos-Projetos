package model.services;

import java.time.LocalDate;

import model.entites.Contract;
import model.entites.Installment;

/* Classe responsável por associar um Contract e um Installment */
public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
   
	
	/* Método responsável por gerar as parcelas(Installment) de um contrato(Contract) e associa-las com
	 * o objeto Contract*/
   public void processContract(Contract contract, int installments) {
	   double initialInstallment = contract.getTotalValue() / 3;
	   
	   LocalDate contractDate = LocalDate.parse(contract.getDate().toString());
	   
	   for(int i = 1; i <= installments; i++) {
		   
		   double interest = onlinePaymentService.interest(initialInstallment, i) + initialInstallment;
		   double paymentFee = onlinePaymentService.paymentFee(interest);
		   
		   double finalInstallment = interest + paymentFee;
		   LocalDate dueDate = contractDate.plusMonths(i);
		   
		   contract.addInstallment(new Installment(dueDate, finalInstallment));
		   
	   }
   }
}
