package estruturaRepetitiva;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, mediaPonderada;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			mediaPonderada = (double)((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
			
			System.out.println(String.format("%.1f", mediaPonderada));	
		}
		
		sc.close();

	}

}
