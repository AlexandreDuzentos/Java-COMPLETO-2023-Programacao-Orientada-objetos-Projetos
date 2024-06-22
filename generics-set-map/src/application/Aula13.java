package application;

import java.util.ArrayList;
import java.util.List;

public class Aula13 {

	public static void main(String[] args) {
		
		/* Princípio  get/put - contravariância
		 * Contravariância é quando a operação de get não é permitida e a
		 * operação de put é permitida.
		 * */
		
		List<Object> myObjs = new ArrayList<>();
		myObjs.add(10);
		myObjs.add(5);
		
		List<? super Number> myNums = myObjs;
		
		/*  Fazendo put - Ok
		 *  porque o compilador sabe, que o tipo do
		 *  valor que está sendo adicionado na lista é compatível com algum
		 *  supertipo de Number ou com o próprio Number.
		 * */
		myNums.add(10);
		myNums.add(3.14);
		
		/* 
		 * Fazendo get - Erro de compilação
		 * Resulta em erro, porque o tipo da minha lista pode ser de um tipo que seja um
		 * supertipo de Number, logo, caso isso ocorra haverá um problema de type
		 * safety, pois o tipo da variável que estará a receber o resultado será imcompátivel
		 * com o retorno do get.
		 * */
		 //Number x = myNums.get(0);

	}
}
