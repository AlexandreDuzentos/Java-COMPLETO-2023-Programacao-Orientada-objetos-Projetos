package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aula12 {

	public static void main(String[] args) {
		/* --------  PIPELINE ---------- */
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (acumulador ,valorAtual) -> acumulador + valorAtual);
		
		System.out.println("Sum: "+ sum);
		
		/* 
		 * Filter e map são operações intermediárias, ou seja, geram novas
		 * streams e o collect(Collectors.toList()) é uma operação terminal. 
		 * */
		List<Integer> newList = list.stream()
				                    .filter(x -> x % 2 == 0) // todo elemento x tal que x mod 2 seja igual a igual
				                    .map(x -> x * 10)
				                    .collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
