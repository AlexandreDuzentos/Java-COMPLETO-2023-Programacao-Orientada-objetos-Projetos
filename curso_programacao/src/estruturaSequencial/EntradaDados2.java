package estruturaSequencial;

import java.util.Scanner;

public class EntradaDados2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		/*
		 *---- ATENÇÃO: QUEBRA DE LINHA PENDENTE ------
		 * 
		 * Quando você usa um comando diferente do nextLine() e da uma quebra
		 * de linha, essa quebra de linha fica pendente na entrada
		 * padrão(teclado).
		 * 
		 * Se você então fizer um nextLine(), aquela quebra de linha pendente
		 * será absorvida ou comsumida pelo nextLine()/
		 * **/
		 x = sc.nextInt();
		 sc.nextLine(); // consumirá a quebra de linha pendente na entrada padrão
		
		/*
		 *  Lendo dados do tipo string não contíguos, ou seja, mais de uma
		 *  palavra, também chamado de até a quebra de linha.
		 */
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(x);

	}

}
