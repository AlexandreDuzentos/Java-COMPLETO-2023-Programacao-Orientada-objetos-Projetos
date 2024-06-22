package arraysListas;

import java.util.Scanner;
import entities.Product;

public class ArrayParte2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double somaPreco = 0.0;
		double mediaPreco;
		
		/*
		 *  vect.length é a quantidade de elementos do vetor.
		 *  
		 *  É melhor usar o vect.length para que o programa não
		 *  fique dependente de uma variável que não está atrelada
		 *  ao vetor como é o caso da variável n.
		 */
		for(int i = 0; i < vect.length; i++) {
			somaPreco += vect[i].getPrice();
		}
		
		mediaPreco = somaPreco / n;
		 
		System.out.println("AVERAGE PRICE = "+ String.format("%.2f", mediaPreco));
		
		System.out.println();
		
		sc.close();
	}

}
