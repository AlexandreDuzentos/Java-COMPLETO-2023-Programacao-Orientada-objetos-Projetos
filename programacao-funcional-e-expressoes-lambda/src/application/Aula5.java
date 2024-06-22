package application;

import java.util.Arrays;
import java.util.List;

public class Aula5 {
	
	public static int sum(int acumulador, int valorAtual) {
		return acumulador + valorAtual;
	}

	public static void main(String[] args) {
		/* Expressividade / código conciso */
		
		List<Integer> list = Arrays.asList(2, 5, 7, 8, 9);
		
		// código não expressivo(programação imperativa)
		Integer sum1 = 0;
		for(Integer element : list) {
			sum1 += element;
		}
		
		System.out.println(sum1);
		
		/* código expressivo(programação funcional)
		 * 
		 * O primeiro parâmetro da função reduce é o valor inicial
		 * do acumulador e o segundo e a referência a função que será
		 * executada para cada elemento da lista
		 * 
		 * A função reduce retorna um único valor, que no caso, será
		 * a soma de todos os elementos da listas
		 *  */
		Integer sum2 = list.stream().reduce(0, Aula5::sum);
		
		/*
		 * Sintaxe opcional: passando uma expressão lambda como argumento para a função
		 * reduce.
		 *  */
		Integer sum3 = list.stream().reduce(0, (acumulador, valorAtual) -> acumulador + valorAtual);
		
		System.out.println(sum2);
		System.out.println(sum3);

	}

}
