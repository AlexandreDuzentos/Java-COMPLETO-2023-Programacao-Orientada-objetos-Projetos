package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula3 {

	public static void main(String[] args) {
		
		/* Declarando e instânciando um vetor e colocando valores dentro dele */
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good might"};
		
		String path = "c:/temp/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line); // escreve um texto num arquivo sem quebrar a linha
				bw.newLine(); // quebra a linha dentro do arquivo após o texto acima ter sido escrito
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
