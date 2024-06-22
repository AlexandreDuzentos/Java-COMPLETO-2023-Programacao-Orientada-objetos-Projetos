package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class EnumAula1 {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order.toString());
		
		/* Instanciando o objeto os1 do tipo OrderStatus com o valor DELIVERED da enum */
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		/*
		 *  Declarando um objeto os2 do tipo OrderStatus e instanciando o objeto com um valor
		 *  informado pelo usuário.
		 *  
		 *  o método valueOf instância um objeto de um tipo enumerado com um valor informado
		 *  pelo usuário.
		 *  
		 *  Convertendo uma String para enum.
		 *  
		 *  enums são classes especiais.
		 * */
		OrderStatus os2 = OrderStatus.valueOf("Entregue");
       
	}

}
