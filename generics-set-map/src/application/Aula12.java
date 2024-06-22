package application;

import java.util.ArrayList;
import java.util.List;

public class Aula12 {

	public static void main(String[] args) {
		
		/* Princípio  get/put - covariância
		 * Covariância é quando a operação de get é permitida e a
		 * operação de put não é permitida.
		 * */
		
		List<Integer> inList = new ArrayList<>();
		inList.add(10);
		inList.add(5);
		
		List<? extends Number> list = inList;
		
		/* 
		 * Fazendo get - ok
		 * A variável usada para armazenar o resultado deve ser do tipo mais
		 * genérico, porque ele aceita qualquer tipo mais específico que pode
		 * estar armazenado na lista, se a variável usada para armazenar o resultado
		 * for de um tipo mais específico, poderá ocorrer um problema de type safety,
		 * por conta disso, o compilador já barra a atribuição a um tipo mais específico.
		 * */
		Number x = list.get(0);
		
		/*  Fazendo put - Erro de compilação
		 *  Erro de compilação: porque o compilador não sabe, se o tipo do
		 * valor que está sendo adicionado na lista é compatível com algum
		 * subtipo de Number com o próprio Number.
		 * */
		//list.add(5);

	}
}
