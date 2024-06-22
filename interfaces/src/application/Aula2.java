package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entites.Contract;
import model.entites.Installment;
import model.services.ContractService;
import model.services.PaypalPaymentService;

public class Aula2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		System.out.print("Data(dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate data = LocalDate.parse(sc.nextLine(), dtm);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, data, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int installments = sc.nextInt();
		System.out.println("Parcelas: ");
		
		ContractService contractService = new ContractService(new PaypalPaymentService());
		
		contractService.processContract(contract, installments);
		
		for(Installment installment: contract.getInstallments()) {
			 System.out.println(installment.getDueDate() + " - " + String.format("%.2f", installment.getAmount()));
		}
		
		sc.close();

		
		

	}

}
