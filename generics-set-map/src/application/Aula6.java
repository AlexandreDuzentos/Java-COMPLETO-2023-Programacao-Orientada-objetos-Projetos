package application;

import java.util.ArrayList;
import java.util.List;

public class Aula6 {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		/*
		  erro de compilação, um List<Object> não é um supertipo
		  de qualquer tipo de List.
		  
		  Não é possível fazer um upcasting de uma list de Integer para uma list
		  de Object, porque list de Object não é supertipo de qualquer tipo de list.
		  
		  Porém, é possível fazer um Upcasting de um Integer para um Object, pois Object
		  é supertipo de qualquer tipo de dado.
		  
		  myObjs = myNumbers; // erro de compilação
		*/
		
		/* O supertipo de qualquer tipo de List é List<?>, que é um tipo
		 * curinga.
		 * */
		
		/* Abaixo temos uma lista de um tipo curinga, o compilador não
		 * permite a adição de dados a uma coleção de um tipo curinga.
		 * 
		 * Abaixo temos uma lista de uma tipo curinga não delimitado, pois,
		 * os subtipos desse tipo curinga podem ser de qualquer tipo.
		 *  */
		List<?> myObjs2 = new ArrayList<Object>();
		List<Integer> myNumbers2 = new ArrayList<Integer>();
		
		/*
		 * O supertipo de qualquer tipo de lista é List<?>. Este é um tipo
		 * curinga.
		 * 
	       Operação perfeitamente aceitável, porque  uma lista de um tipo curinga
		   é um supertipo de qualquer tipo de lista.
        */
		myObjs2 = myNumbers2; 
			
	}
}
