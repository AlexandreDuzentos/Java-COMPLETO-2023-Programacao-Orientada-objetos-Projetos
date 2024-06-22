package estruturaSequencial;

import java.util.Scanner;

public class ValorPeca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorUnitarioPeca1, valorUnitarioPeca2, totalPagar;
		int codigoPeca1, qtdPecas1;
		int codigoPeca2, qtdPecas2;
		
		codigoPeca1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();
		
		totalPagar = (qtdPecas1 * valorUnitarioPeca1) + (qtdPecas2 * valorUnitarioPeca2);
		
		System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f", totalPagar));
		
		
		sc.close();

	}

}
