package estruturaCondicional;

import java.util.Scanner;

public class diaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int diaSemana;
		String diaPorExtenso;
		
		
		diaSemana = sc.nextInt();
		
		switch(diaSemana) {
		  case 1: 
			 diaPorExtenso = "Domingo";
			 break;
		  case 2:
			 diaPorExtenso = "Segunda-feira";
			 break;
		  case 3:
			 diaPorExtenso = "Terça-feira";
			 break;
		  case 4:
			 diaPorExtenso = "Quarta-feira";
			 break;
		  case 5:
			 diaPorExtenso = "Quinta-feira";
			 break;
		  case 6:
			 diaPorExtenso = "Sexta-feira";
			 break;
		  case 7:
			 diaPorExtenso = "Sabado";
			 break;
		  default:
			 diaPorExtenso = "Dia inválido";
		}
		
		System.out.println(diaPorExtenso);

		
		sc.close();
	}

}
