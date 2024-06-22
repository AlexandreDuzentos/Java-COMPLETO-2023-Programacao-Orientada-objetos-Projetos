package application;

import java.util.Scanner;

import model.services.PrintServiceObject;

public class Aula3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		PrintServiceObject ps = new PrintServiceObject();
		
		System.out.println("How many values: ");
		Integer n = sc.nextInt();
		
		/*
		 *  operação perfeitamente legal, pois Object aceita qualquer Object, é String é um object,
		 *  porém, quando usamos object um problema de type safety é gerado, por conta do tipo Object
		 *  aceitar qualquer tipo.
		 */
		ps.addValue("Maria"); 
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
			
		}
		
		ps.print();
		
		/* Exceção do tippo ClassCastException será lançada, pois o método first retorna o 
		 * primeiro elemento adicionada a lista, que é do tipo String, mas que foi armazenado
		 * numa variável do tipo Object, e uma conversão de Object para Integer lança uma exce
		 * 
		 * E além do problema do type safety é gerado um outro problema de performance, por conta
		 * da necessidade de se fazer casting de vez quanto e se um tipo primitivo for usado tem
		 * de fazer o boxing e depois o unboxing.
		 * */
		Integer x = (Integer)ps.first();
		
		System.out.println("First: "+ ps.first());
		
		sc.close();

	}

}
