package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.UserLogEntry;

public class Aula23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<UserLogEntry> set = new HashSet<>();
		System.out.println("Enter file full path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String name = fields[0];
				Instant instant = Instant.parse(fields[1]);
				
				
				set.add(new UserLogEntry(name, instant));
				
				line = br.readLine();
			}
			
			System.out.println("Total users: "+ set.size());
			
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

		sc.close();
	}

}
