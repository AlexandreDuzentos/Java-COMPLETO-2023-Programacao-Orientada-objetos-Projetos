package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula6 {

	public static void main(String[] args) {
		
		String path = "c:/temp/in2.txt";
		
		/* A classe String por padrão já implementa a interface Comparable */
		List<String> names = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String name = br.readLine();
			while(name != null) {
				names.add(name);
				name = br.readLine();
			}
			
			/* O método sort da classe Collections é responsável por ordenar listas parametrizadas
			 * com um tipo T.
			 * 
			 * O método sort ordena apenas listas parametrizadas com um tipo T que implementa
			 * a interface Comparable, no caso, o tipo T é String.
			 * */
			Collections.sort(names);
			
			for(String line : names) {
				System.out.println(line);
			}
			
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
