package estruturaCondicional;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();

	}

}
