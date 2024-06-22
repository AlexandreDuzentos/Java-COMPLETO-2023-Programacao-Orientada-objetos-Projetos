package arraysListas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		
	  /*
	   * Listas não aceitam tipos primitivos, apenas wrapper
	   * classes.
	   * 
	   * generics: parametrizando a definição de um tipo(List) passando
	   * um outro tipo para ele que é o tipo Integer.
	   * 
	   * Atribuindo a instância de uma classe para uma interface que ela implementa.
	   * 
	   * É opcional parametrizar o tipo ArrayList com um outro tipo.
	   * 
	   * O menor que tipo maior que(<tipo>) serve para parametrizar um tipo com
	   * outro tipo.
	   * 
	   * */
      List<String> list = new ArrayList<>(); // Declarando e instânciando uma lista
      
      // Adicionando elementos numa lista.
      list.add("Alex");
      list.add("Maria");
      list.add("Bob");
      list.add("Anna");
      
      /* 
       * Adicionando elemento na posição dois da lista com
       * uma sobrecarga do método add.
       * */
      list.add(2, "Marco");
      
      // Obtendo a quantidade de elementos da lista.
      System.out.println(list.size());
      
      // Removendo um elemento da lista pelo valor
      list.remove("Anna");
      
      // Removendo um elemento da lista pela posição
      list.remove(1);
      
      /* Percorrendo a lista com o laço for each */
      for(String name: list) {
    	  System.out.println(name);
      }
      
      System.out.println("----------------------------------");
      
      /*
       *  Removendo elementos da lista por predicado que é um
       *  tipo de função lambda.
       *  
       *  predicado é uma função lambada que retorna um valor booleano.
       *  
       *  Leitura: remova todo elemento x tal que o caracter de
       *  indíce 0 de x seja B.
       * */
      list.removeIf(x -> x.charAt(0) == 'B');
      
      for(String name: list) {
    	  System.out.println(name);
      }
      
      System.out.println("-------------------------------------");
      
      /*
       *  Obtendo o índice da primeira ocorrência de um elemento da lista.
       *  
       *  Quando um elemento não é achado, o índice retornado é o -1.
       **/
      System.out.println("Index of Bob "+list.indexOf("Bob")); 
      System.out.println("Index of Alex "+ list.indexOf("Alex"));
      
      System.out.println("--------------------------------------");
      
      /* Convertendo um list de String para uma Stream de string 
       * com a chamada da função Stream.
       * 
       * O tipo Stream é um tipo especial do java 8 em diante que aceita
       * operações com expressões lambda.
       * 
       * A função collect(Collectors.toList) converte uma Stream de String para
       * um list de String.
       * 
       * A função filter recebe como parâmetro um predicado, e os elementos da
       * stream que que atenderem o predicado serão filtrados e retornados para
       * a lista.
       * 
       * A expressão abaixo filtra elementos de uma Stream baseado em uma
       * predicado que é um tipo de expressão lambda.
       * 
       * */
      List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
      
      for(String name: result) {
    	  System.out.println(name);
      }
      
      System.out.println("---------------------------------------");
      /*
       * A função findFirst retornara o primeiro elemento da Stream que atender
       * o predicado, e a orElse retornará null caso o primeiro elemento da Stream
       * não atenda o predicado.
       *  */
      String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
      
      System.out.println(name);
      
	}

}
