package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula2 {

	public static void main(String[] args) {
		String path = "c:/temp/in.txt";
		
		/* Abaixo nós temos um bloco try with resources, que nada mais é
		 * do que um bloco try declara um ou mais recursos e garante que esses
		 * recursos serão fechados ao final do bloco.
		 *  */
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			/* retorna uma linha do arquivo, caso o arquivo já esteja no final,
			 * retorna null.
			 * */
			String line = br.readLine(); 
			while(line != null) { System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
