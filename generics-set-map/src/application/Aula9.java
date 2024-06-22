package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula9 {

	public static void main(String[] args) {
		/* Declarando e inicializando a lista com valores */
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Bob", "Alex");

	}
	
	public static <T> void printList(List<T> list) {
		for(T element: list) {
			System.out.println(element);
		}
	}

}
