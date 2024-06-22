package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula14 {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	}
	
	/* Método responsável por copiar elementos de uma lista para outra
	 * lista que pode ser mais genérica que a primeira. 
	 * */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		/* A lista de source é um caso de covariância, ou seja, é permitido
		 * acessar os elementos. 
		 * */
		for(Number number: source) {
			/* a lista destiny é um caso de contravariância, ou seja, é permitido
			 * adicionar elementos a ela.
			 * */
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
