package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Aula11 {

	public static void main(String[] args) {
		
		/* --------- STREAM --------------*/
		/* List que será a fonte de dados para o Stream */
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		/* Criando uma Stream a partir de uma List(coleção) */
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		/* O método toArray é uma operação terminal da Stream, ou seja, ela
		 * não retorna uma nova Stream, ela é responsável por converter
		 * uma Stream para Array, o método toString é responsável por
		 * converter um Array para String.
		 * */
		System.out.println(Arrays.toString(st1.toArray()));
		
		/* Criando uma Stream usando a função "of" da classe Stream */
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		
		System.out.println(Arrays.toString(st2.toArray()));
		
		/* Criando uma Stream usando uma função de iteração.
		 * 
		 * O primeiro argumento que a função iterate recebe é o valor inicial
		 * da Stream, e o segundo argumento é uma função define a lógica para 
		 * a geração dos próximos elementos.
		 * 
		 * Note: a Stream abaixo é potencialmente infinita. Pois não há critério
		 * que cortará a execução da função que gera os elementos.
		 *  */
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		
		/* O operação limit é intermediára, ou seja, ela gera uma nova
		 * stream, após a stream possuir 10 elementos, a operação limit
		 * cortará a execução.
		 * */
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		 

	}

}
