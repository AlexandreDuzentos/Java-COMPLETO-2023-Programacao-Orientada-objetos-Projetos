package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExercicioProposto {

	public static void main(String[] args) throws NumberFormatException {
		
		String strPath = "c:/temp/products.csv";
		Product[] prods = new Product[4];
		
		/* Lendo o arquivo csv */
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			
			int contador = 0;
			while(line != null) {
				String[] properties = line.split(",");
				
				String name = properties[0];
				double price = Double.parseDouble(properties[1].trim());
				int qtd = Integer.parseInt(properties[2].trim());
				
				prods[contador] = new Product(name, price, qtd);
					
				contador += 1;
			    line = br.readLine();	
			}
			
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		
		/* criando um subdiretório a partir de do diretório de origem, na qual estará
		 * o arquivo summary.csv  */
		
		File newPath2 = new File(strPath);
		new File(newPath2.getParent() + "/out").mkdir();
		
		String newPath = newPath2.getParent() + "/out/summary.csv";
		
		/* escrevendo "coisas" num arquivo que será criado pelo BufferedWriter no diretório out */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
			 
			for(Product p : prods) {
				bw.write(p.toString());
				bw.newLine();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
	    }
		
		

	}

}
