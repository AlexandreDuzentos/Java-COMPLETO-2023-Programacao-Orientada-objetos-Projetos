package model.services;

import java.util.ArrayList;
import java.util.List;


/*   ------------   SOLUÇÃO USANDO OBJECT ------------------ 
 * 
 *  O uso do tipo Object resolve o problema do reuso, mas gera outro problema que é o
 *  de type safety e performance.
 *  */
public class PrintServiceObject {
	
	/* Aqui já estamos usando generics, a interface List está sendo parametrizada por tipo, que
	 * no caso é o tipo Integer.
	 * */
	List<Object> list = new ArrayList<>();
	
	public void addValue(Object value) {
		list.add(value);
	}
	
	public Object first() {
		/* Programação defensiva no ínício do método */
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty!");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		 }
		
		for(int i = 1; i < list.size(); i++) {
				System.out.print(", " + list.get(i));
		}
		
		System.out.println("]");
	}

}
