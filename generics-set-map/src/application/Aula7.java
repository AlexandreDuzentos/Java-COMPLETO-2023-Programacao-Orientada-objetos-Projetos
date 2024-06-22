package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula7 {

	public static void main(String[] args) {
		/* Declarando e inicializando a lista com valores */
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Bob", "Alex");

	}
	
	/* Com tipos curingas podemos fazer métodos que recebem um genérico
	 * de qualquer tipo.
	 * 
	 * No parâmetro temos uma lista de um tipo curinga, o compilador
	 * não permite adição de dados a uma coleção de um tipo curinga.
	 * 
	 * A variável passada como parâmetro representa uma lista de um tipo
	 * curinga não delimitado, ou seja, que aceita qualquer tipo.
	 * */
	public static void printList(List<?> list) {
		/* Porém não é possível adicionar dados a uma coleção
		 * do tipo curinga, pois o compilador não sabe qual é o
		 * tipo específico do qual a lista foi instânciada.
		 * */

		// list.add(23); erro de compilação
		
		/* Cada elemento da lista é um subtipo de Object, porque Object é um
		 * supertipo de qualquer tipo referência em java, oque está a ocorrer
		 * aqui é um upcasting, do tipo específico da lista para o tipo genérico,
		 * que é o Object.
		 **/
		for(Object element: list) {
			System.out.println(element);
		}
	}

}
