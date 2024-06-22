package estruturaCondicional;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B) {
			if(A % B == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		} else {
			if(B % A == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		}
		
		sc.close();
	}

}
