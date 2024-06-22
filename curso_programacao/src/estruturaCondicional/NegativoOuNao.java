package estruturaCondicional;

import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if(n < 0){
		   System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}
		
		sc.close();
		
		

	}

}
