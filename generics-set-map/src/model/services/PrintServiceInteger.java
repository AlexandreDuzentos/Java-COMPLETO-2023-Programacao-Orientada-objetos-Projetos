package model.services;

import java.util.ArrayList;
import java.util.List;

/*  ------------   SOLUÇÃO USANDO INTEGER ------------------ 
 *  
 *  O service PrintServiceInteger funciona apenas para inteiros, se eu precisar trabalhar
 * com String eu teria de criar outro Service que funciona apenas para String, isso gera
 * um problema de reuso, pois eu terei de recriar toda a classe para que ela funcione para
 * String, isso não é desejável.
 * 
 * As vantagens aqui são  Type Safety e Performance.
 * 
 * Soluções alternativas: Uso do tipo Object que é um tipo mais genérico, sendo uma generaliza
 * ção de tipos como String, Integer e outros, uso de generics.
 * 
 * A melhor solução é com o uso de generics, que garante o benefícoios de reuso, type safety
 * e performance.
 * 
 * */
public class PrintServiceInteger {
	
	/* Aqui já estamos usando generics, a interface List está sendo parametrizada por tipo, que
	 * no caso é o tipo Integer.
	 * */
	List<Integer> list = new ArrayList<>();
	
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() {
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
