package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		/* A duplicidade da barra invertida é necessária
		 * porque a barra invertida é o prefixo de caracteres
		 * especias, ou seja, ela antecede todo e qualquer caractere
		 * especial e como não nosso objetivo nesse cenário
		 * representar um caractere especial logo a seguir da barra
		 * invertida, colocando duas barras invertidas, elas serão
		 * reconhecidas como uma única barra invertida.
		 * 
		 * O objeto file encapsulará todo o processo para acessar
		 * o arquivo passado como parâmetro no construtor, bem como
		 * o caminho do arquivo.
		 * */
		File file = new File("C:\\temp\\in.txt");

		Scanner sc = null;
		
		try {
			/*
			 *  se ocorrer um erro na instância do Scanner, o objeto sc
			 *  permanecerá null.
			 */
			sc = new Scanner(file); 
			
			/* O método hasNextLine retorna true se houver outra linha
			 * no arquivo.
			 * */
			while(sc.hasNextLine()) {
				/* Imprimindo a próxima linha do arquivo, caso ela exista */
				System.out.println(sc.nextLine()); 
			}
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			/* É uma boa prática fechar recursos no bloco finally
			 * porque o bloco finally é sempre executado, desso modo,
			 * há a garantia de que o recurso será fechado independente
			 * se deu certo o try ou não.
			 * 
			 * O teste abaixo é necessário porque há um risco de ocorrer
			 * um erro na instânciação da classe Scanner, em caso do erro
			 * ocorrer, o objeto sc permanecerá null, e invocar um método
			 * ou acessar um atributo a partir de um objeto que está null
			 * lança uma exceção do tipo NullPointerException.
			 * */
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
