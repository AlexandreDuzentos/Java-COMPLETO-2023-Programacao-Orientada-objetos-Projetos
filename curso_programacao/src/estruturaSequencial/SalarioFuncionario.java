package estruturaSequencial;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoFuncionario, qtdHorasTrabalhadas;
		double salarioPorHora, salario;
		
		codigoFuncionario = sc.nextInt();
		qtdHorasTrabalhadas = sc.nextInt();
		salarioPorHora = sc.nextDouble();
		
		salario = qtdHorasTrabalhadas * salarioPorHora;
		
		System.out.println("NUMBER = "+codigoFuncionario);
		System.out.println("SALARY = "+String.format("%.2f", salario));
		
		sc.close();
		

	}

}
