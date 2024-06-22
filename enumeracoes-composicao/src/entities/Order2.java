package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order2 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
   
	private Date moment;
	private OrderStatus orderStatus;
	
	/* composição tem-vários */
	private List<OrderItem> orderItems = new ArrayList<>();
	
	/* composição tem um ou associação */
	private Client client;
	
	public Order2() {
		
	}
	
	/* Método construtor */
	public Order2(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	
	/* Getters e setters */
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	/* Método responsável por associar um Order a um OrderItem */
	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	/* Método responsável por desassociar um Order de um OrderItem */
	public void removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	/* Método responsável por calcular o valor total do Order */
	public double total() {
		double soma = 0.0;
		
		for(OrderItem orderItem : orderItems) {
			soma += orderItem.subTotal();
		}
		
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
	    sb.append(sdf.format(moment) + "\n");
	    sb.append("Order status: ");
	    sb.append(this.getOrderStatus()+ "\n");
	    sb.append("Client: "+ client.getName()+ " "+ sdf2.format(client.getBirthDate()) + " - "+ client.getEmail()+ "\n");
	    
	    sb.append("Order items: \n");
	    
	    for(OrderItem orderItem: orderItems) {
	    	sb.append(orderItem.getProduct().getName()+ ", ");
	    	sb.append("$"+ orderItem.getPrice()+ ", ");
	    	sb.append("quantity: "+ orderItem.getQuantity()+ ", ");
	    	sb.append("Subtotal: $"+ orderItem.subTotal()+ " "); 
	    	sb.append("\n");
	    	
	    	
	    }
	    
	    sb.append("Total price: "+this.total()+ " "); 
	    return sb.toString();
	}	
	
	
	
	
}
