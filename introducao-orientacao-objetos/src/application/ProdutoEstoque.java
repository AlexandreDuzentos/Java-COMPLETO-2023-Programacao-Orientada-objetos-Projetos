package application;

import java.util.Scanner;
import entities.Product;

public class ProdutoEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		
		System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
          
        /* A chamada do método toString é opcional, por que o
         * compilador do java detecta que o objeto está num contexto
         * de um println que está esperando uma String e implícitamente
         * ele chamará o método toString.
         * */
        System.out.println("Product data: "+ product.toString());
        
        System.out.println("Enter the number of products to be added in "
        		+ "stock");
        
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: "+ product.toString());
        
        System.out.println("Enter the number of produtcts to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: "+ product.toString());
        
      
		
		sc.close();
	}

}
