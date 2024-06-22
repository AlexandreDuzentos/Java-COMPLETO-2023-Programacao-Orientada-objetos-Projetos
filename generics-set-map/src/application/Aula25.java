package application;

import java.util.Map;
import java.util.TreeMap;

public class Aula25 {

	public static void main(String[] args) {
		
		/* 
		 * Declarando uma coleção do tipo Map parametrizando-a
		 * com uma chave do tipo String e o valor do mesmo tipo e
		 * instânciando-a com a implementação TreeMap.
		 * 
		 * A implementação TreeMap ordena os elementos do Map usando
		 * compareTo da interface Comparable<T>  ou o comparator, ele ordena
		 * pela chave.
		 * */
		Map<String, String> cookies = new TreeMap<>();
		
		/* Inserindo elementos no Map */
		cookies.put("userName", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		/* removendo entrada do Map cuja chave é userName */
		cookies.remove("userName");
		
		/* 
		 * Entradas repetidas no Map são substituem outras entradas
		 * já existentes nele.
		 *  */
		cookies.put("phone", "93434737");
		
		System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone"));
		System.out.println("Phone number: "+ cookies.get("phone"));
		System.out.println("userName: "+ cookies.get("userName")); 
		System.out.println("Size: "+ cookies.size());
		
	    System.out.println("ALL COOKIES: ");
	    /* O método keySet retorna um Set<K>(set com as chaves do Map<K,V> */
	    for(String key: cookies.keySet()) {
	    	System.out.println(key + ": "+ cookies.get(key));
	    }

	}

}
