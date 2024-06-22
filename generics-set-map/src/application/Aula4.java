package application;

import java.util.Scanner;

import model.services.PrintServiceGenerics;


public class Aula4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Escolhendo como tipo T qualquer no consumidor da classe genérica
		 * PrintServiceGenerics, o tipo Integer, o que significa que
		 * todos os métodos que forem parametrizados com esse tipo T, seja no
		 * retorno, ou no parâmetro, retornarão apenas dados desse tipo T
		 * receberão apenas argumentos tipo T*/
		PrintServiceGenerics<String> ps = new PrintServiceGenerics<String>();
		
		System.out.println("How many values: ");
		Integer n = sc.nextInt();
		
		/*
		 *  operação ilegal, pois o tipo escolhido para parametrizar  minha
		 *  classe que aceita um tipo T qualquer foi o Integer e abaixo um
		 *  String está sendo passado como argumento, o método addValue
		 *  rejeitará, pois, ele aceitará apenas dados do tipo Integer, quando
		 *  usamos generics o problema de type safety também deixa de existir.
		 */
		//ps.addValue("Maria"); 
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
			
		}
		
		ps.print();
		
		/*
		 * O problema da performance também deixa de existir, pois agora, já
		 * não há a necessidade de fazer casting, nem boxing ou unboxing, por 
		 * conta do type safety.
		 * */
		String x = ps.first();
		
		System.out.println("First: "+ x);
		
		sc.close();

	}

}
