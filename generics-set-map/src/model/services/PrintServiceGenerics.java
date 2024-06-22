package model.services;

import java.util.ArrayList;
import java.util.List;

/*
 *  ------     SOLUÇÃO USANDO GENERICS --------------
 *  Parametrizando minha classe com um tipo T qualquer, oque significa que na
 *  declaração e instanciação do meu PrintServiceGenerics, eu posso parametrizar
 *  com um tipo qualquer oque garantirá benefícios como
 * reuso, ou seja, poderei usar o mesmo printService para qualquer tipo, type safety, ou seja,
 * se eu instânciar um PrintServiceGenerics parametrizado com String, ele vai aceitar somente
 * String, o mesmo é válido para qualquer outro tipo com a qual a classe PrintServiceGeneric
 * for parametrizado e performance, pois eu não terei de fazer casting e nem boxing e unboxing
 * 
 * T é um tipo qualquer, ou seja genérico , o tipo específico será setado posteriormente pelo consumidor da classe.
 * 
 * A letra usada para parametrizar pode ser qualquer uma, como um c, k, h, desde
 * que os métodos e interfaces que estarão parametrizadas sigam o mesmo padrão.
 * 
 * O exemplo abaixo representa uma espécie de generics não delimitado, porque
 *  o tipo T pode ser de qualquer tipo.
 *  */
public class PrintServiceGenerics<T> {
	
	/* Parametrizando uma interface com um tipo T qualquer */
	List<T> list = new ArrayList<>();
	
	/* Parametrizando parâmetro de método com um tipo T qualquer */
	public void addValue(T value) {
		list.add(value);
	}
	
	/* Parametrizando retorna de método com um tipo T qualquer*/
	public T first() {
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
