package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Aula27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> candidates = new HashMap<>();
		List<String> keys = new ArrayList<>();
		
		System.out.println("Enter file full path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			 String line = br.readLine();
			 
			 while(line != null) {
				 String[] fields = line.split(",");
				 String name = fields[0];
				 Integer votes = Integer.parseInt(fields[1]);
				 
				 /* 
				  * A forma de saber se uma chave já existe no Map é pelo
				  * método containsKey, pois se ele retornar true é porque a
				  * chave já existe no Map.
				  **/
				 if(candidates.containsKey(name)) {
					 int qtdSoFar = candidates.get(name);
					 int totalVotesPerCandidate = votes + qtdSoFar;
					 candidates.put(name, totalVotesPerCandidate);
				 } else {
					 candidates.put(name, votes);
				 }
				  
				 line = br.readLine();	 
			 }
			 
			 for(String key : candidates.keySet()) {
				 System.out.println(key + ": "+ candidates.get(key));
			 }
			 	 
		} catch(IOException e) {
			
		}

	}

}
