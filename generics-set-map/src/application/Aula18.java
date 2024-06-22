package application;

import java.util.HashSet;
import java.util.Set;

public class Aula18 {

	public static void main(String[] args) {
		
		/*---------- Set - implementação HashSet -----------*/
		
		/*
		 *  A implementação HashSet é extremamente rápida, porém não garante
		    a ordem dos elementos.
		*/
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("NOTEBOOK");
		set.add("TABLET");
		
		System.out.println(set.contains("NOTEBOOK"));
		
		for(String eletronics: set) {
			System.out.println(eletronics);
		}

	}

}
