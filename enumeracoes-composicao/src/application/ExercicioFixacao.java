package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ExercicioFixacao {

	public static void main(String[] args) throws ParseException {
		
		/* PENDENTE */
		Scanner sc = new Scanner(System.in);
		
		Order2 order = new Order2();
		OrderItem orderItem = new OrderItem();
		Product product = new Product();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("email: ");
	    String email = sc.nextLine();
	    
	    System.out.println("Birth date (DD/M/YYYY): ");
	    
	    /* A função parse converte uma data dada em String num formato
	     * especificado no objeto sdf  convertendo-a para um objeto do tipo
	     * Date.
	     * */
	    Date birthDate = sdf.parse(sc.nextLine());
	     
	    Client client = new Client(name, email, birthDate);
	    
	    System.out.println("Enter order data: ");
	    System.out.println("Status: ");
	    OrderStatus os = OrderStatus.valueOf(sc.next());
	    
	    order = new Order2(new Date(), os, client);
	    
	    System.out.println("How many items to this order? ");
	    int n = sc.nextInt();
	    
	    for(int i = 1; i <= n; i++) {
	    	System.out.println("Enter #"+ i+ " item");	
	    	System.out.println("Product name: ");
	    	sc.nextLine();
	    	String productName = sc.nextLine();
	    	
	    	System.out.println("Product price: ");
	    	double price = sc.nextDouble();
	    	
	    	System.out.println("Quantity: ");
	    	int quantity = sc.nextInt();
	    	
	    	/*
	    	 *  código problemático - instância um novo Order para cada item digitado
	    	 *  o que faz com cada orderItem esteja associado com um order diferente, pois
	    	 *  instâncias diferentes, possuem referência de memória diferentes, ou seja,
	    	 *  a composição entre um Order e item OrderItem era do tipo tem-um na prática,
	    	 *  mas na teoria era do tipo tem-muitos.
	    	 *  
	    	 *  order = new Order2(new Date(), os, client);
	    	 *   */
	 	    
	 	    order.addItem(new OrderItem(quantity, price, new Product(productName))); 	
	    }
	    
	    System.out.println("ORDER SUMMARY: ");
	    System.out.println(order.toString());
	    
	    sc.close();
	    
	}

}
