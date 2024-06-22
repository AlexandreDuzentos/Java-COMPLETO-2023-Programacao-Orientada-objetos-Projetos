package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Aula20 {

	public static void main(String[] args) {
		
		Set<Integer> a = new HashSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		/*
		 *  União
		 *  
		 *  passando outro conjunto como argumento para o construtor do HashSet,
		 *  basicamente está sendo feita um cópia do conjunto a para o conjunto
		 *  c. 
		 */
		Set<Integer> c = new HashSet<>(a);
		c.addAll(b);
		
		System.out.println(c);
		
		// Interseção
		Set<Integer> d = new HashSet<>(a);
		d.retainAll(b);
		
		System.out.println(d);
		
		// Diferença
		Set<Integer> e = new HashSet<>(a);
		e.removeAll(b);
		
		System.out.println(e);
		
		

	}

}
