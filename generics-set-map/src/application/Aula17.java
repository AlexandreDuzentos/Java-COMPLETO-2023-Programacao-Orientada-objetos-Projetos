package application;

import java.util.Set;
import java.util.TreeSet;

public class Aula17 {

	public static void main(String[] args) {
		
		/*---------- Set - implementação TreeSet -----------*/
		
		/*
		 *  A implementação TreeSet é mais lenta, porém garante
		    a ordem dos elementos(alfabeticamente ou numericamente, dependendo
		    do tipo do Set).
		*/
		Set<String> set = new TreeSet<>();
		
		set.add("TV");
		set.add("NOTEBOOK");
		set.add("TABLET");
		
		System.out.println(set.contains("NOTEBOOK"));
		
		for(String eletronics: set) {
			System.out.println(eletronics);
		}

	}

}
