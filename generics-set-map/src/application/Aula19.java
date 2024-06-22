package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aula19 {

	public static void main(String[] args) {
		
		/*---------- Set - implementação LinkedHashSet -----------*/
		
		/*
		 *  A implementação LinkedHashSet tem uma velocidade intermediária
		 *  entre o HashSet e o TreeSet, e os elementos ficam na ordem em que
		 *  foram adicionados.
		*/
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("NOTEBOOK");
		set.add("TABLET");
		
		//set.remove("TABLET");
		/*
		 *  leitura do predicado - todo elemento x tal que x tenha o primeiro
		 *  caracter igual e T.
		 */
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String eletronics: set) {
			System.out.println(eletronics);
		}

	}

}
