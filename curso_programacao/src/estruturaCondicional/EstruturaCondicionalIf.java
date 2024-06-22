package estruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.println("Quantas horas: ");
		hora = sc.nextInt();
		
		/* Quando temos um único comando dentro do if é opcional delimitar por chaves */
		if(hora < 12) {
		   System.out.println("Bom dia!");
		} else if(hora >= 12 && hora < 18) {
		   System.out.println("Boa tarde!");
		} else {
		   System.out.println("Boa noite!");
		}
		 
		
		sc.close();
	
	}

}
