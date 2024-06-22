package estruturaRepetitiva;

import java.util.Scanner;

public class tipoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0, fim = 0;
		
		int codigoCombustivel = sc.nextInt();
		
		
		while(codigoCombustivel != 4) {
			
			switch(codigoCombustivel) {
		     	case 1:
		     		alcool += 1;
		     		break;
		     	case 2:
		     		gasolina += 1;
		     		break;
		     	case 3: 
		     		diesel += 1;
		     		break;
		     	case 4:
		     		fim += 1;
		     		break;
		     	default:
		     		codigoCombustivel = sc.nextInt();
		     	    continue;
			}
			
			codigoCombustivel = sc.nextInt();
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
		
		sc.close();

	}

}
