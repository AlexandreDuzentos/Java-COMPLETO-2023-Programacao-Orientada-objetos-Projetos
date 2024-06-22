package estruturaSequencial;

import java.util.Scanner;

public class DiferencaProduto {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferencaProduto;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferencaProduto = (a * b) - (c * d);
		
		System.out.println("Diferença = "+ diferencaProduto);
		
		sc.close();
		
	
	}
}
