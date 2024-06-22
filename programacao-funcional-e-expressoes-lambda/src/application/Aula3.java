package application;

import java.util.Arrays;

public class Aula3 {
	
	/* Se esse valor altera o comportamento da função changeValues também altera s*/
	private static int globalValue = 3;

	public static void main(String[] args) {
		/* Transparência referêncial */
		
		// sintaxe opcional: int[] vect = new int[] { 3, 4, 5 };
		
		int[] vect = { 3, 4, 5 };
		
		changeOddValues(vect);
		
		/* O método toString da classe Arrays converte um array para String */
		System.out.println(Arrays.toString(vect));
			
	}
	
	/* O comportamento da função não depende exclusivamente do que
	 * está dentro da própria função, ele depende de um valor externo, por isso
	 * que essa função abaixo não tem transparência referêncial, esse tipo de
	 * função é mais difícil de entender em um programa do que uma função que
	 * dependesse exclusivamente dos seus valores, pois quando a função depende
	 * exclusivamente dos seus valores, ela é mais previsível.
	 *  */
	public static void changeOddValues(int[] vect) {
		 
		/* Percorrendo a alterando o vetor original */
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 != 0) {
				vect[i] += globalValue;
			}
		}
	}
	

}
