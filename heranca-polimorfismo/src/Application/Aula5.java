package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Aula5 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> prod = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #"+i+ " data:");
			System.out.println("Common, used or imported(c/u/i)");
			char ans = sc.next().charAt(0);
			
			if(ans == 'c') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				
				prod.add(new Product(name, price));
				
			} else if(ans == 'u') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Manufacture date(dd/MM/yyyy):");
				Date date = sdf.parse(sc.next());
		
				prod.add(new UsedProduct(name, price, date));
			} else {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				prod.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product pd: prod) {
			System.out.println(pd.priceTag());
		}
		
		sc.close();

	}

}
