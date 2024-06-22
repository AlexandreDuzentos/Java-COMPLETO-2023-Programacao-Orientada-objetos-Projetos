package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product2;
import model.services.ProductService3;

public class Aula13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Product2> prods = new ArrayList<>();
		
		System.out.println("Enter full file path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				  String[] fields = line.split(",");
				  String name = fields[0];
				  double price = Double.parseDouble(fields[1]);
				  prods.add(new Product2(name, price));
				  line = br.readLine();
			}
			
			ProductService3 ps = new ProductService3();
			
			double totalPrice = ps.totalPrice(prods);
			
			prods.sort((prod1, prod2) -> -prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase()));
			
			System.out.println("Total price: "+String.format("%.2f", totalPrice));
			
			for(Product2 prod : prods) {
				System.out.println(prod.getName());
			}
		
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		sc.close();

	}

}
