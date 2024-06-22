package application;

import java.util.ArrayList;
import java.util.List;

public class Aula8 {

	public static void main(String[] args) {
		/* Porém não é possível adicionar dados a uma coleção
		 * do tipo curinga, pois o compilador não sabe qual é o
		 * tipo específico do qual a lista foi instânciada.
		 * */
		
		/* Abaixo temos uma lista de um tipo curinga, o compilador não permite
		 * a adição de dados a uma coleção de um tipo curinga */
		List<?> list = new ArrayList<Integer>();	
		// list.add(23); erro de compilação
	}

}
