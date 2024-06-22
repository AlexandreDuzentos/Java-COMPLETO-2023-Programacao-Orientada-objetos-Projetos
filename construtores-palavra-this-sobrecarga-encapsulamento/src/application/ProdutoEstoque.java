package application;

import java.util.Scanner;

import entities.Product;

import entities.Product;

public class ProdutoEstoque {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next(); // variável auxiliar para receber o dado digitado
		
		System.out.print("Price: ");
        double price = sc.nextDouble();
        
        Product product = new Product(name, price);
        
        product.setName("Carro");
        System.out.println("Updated name: "+ product.getName());
        product.setPrice(5000.0);
        System.out.println("Updated price: "+ product.getPrice());
          
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
