package estruturaRepetitiva;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial, n;
		fatorial = 1;
		n = sc.nextInt();
		
		if(n == 0) {
			fatorial = 1;
		} else {
			for(int i = 1; i <= n; i++) {
				fatorial = fatorial * i;			
			}
		}
		
		System.out.println(fatorial);
		
		
		sc.close();

	}

}
