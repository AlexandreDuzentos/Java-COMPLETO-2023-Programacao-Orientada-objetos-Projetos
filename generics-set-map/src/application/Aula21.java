package application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import model.entities.Product;
import model.entities.Product2;

public class Aula21 {

	public static void main(String[] args) {
		/* Como o Set compara objetos - válido para para qualquer implementação do set */
		Set<Product2> prods = new HashSet<>();
		
		prods.add(new Product2("TV", 900.0));
		prods.add(new Product2("NOTEBOOK", 1200.00));
		prods.add(new Product2("TABLET", 400.0));
		
		Product2 prod = new Product2("NOTEBOOK", 1200.00);
		
		/* A comparação dos objetos dentro do conjunto(Set) com o objeto
		 * passado como parâmetro é feito a partir do método HashCode e equals
		 * caso eles estejam implementados no tipo T específico ou no tipo do
		 * Set, caso contrário,
		 * é usada a comparação de ponteiros, ou seja, as referências de ponteiros
		 * dos objetos serão usadas, o objetivo da comparação de elementos é de
		 * verificar se dado elemento existe no conjunto(Set) quando se deseja
		 * realizar alguma operação(inserção, remoção,
		 * acesso), pois o Set não admite repetições e nem acesso a objetos
		 * que não existem dentro dele, e nem remoção de elementos que também não
		 * estão dentro dele.
		 * */
		System.out.println(prods.contains(prod));

	}

}
