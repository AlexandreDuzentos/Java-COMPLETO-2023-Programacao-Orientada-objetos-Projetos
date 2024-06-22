package estruturaSequencial;

import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		
		/*
		 *  Setando a localidade para essa instância
		 *  da máquina virtual, afim de alterar o separador
		 *  de casas decimais.
		 */
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 35.789;
		System.out.println(y);
		
		/* Na impressão de um valor de ponto flutuante 
		 * a máquina virtual usa o separador de casas
		 * decimais padrão da localidade pré-definida na
		 * máquina, para alterar isso, é necessário mudar a
		 * localidade para essa instância da máquina virtual.
		 * 
		 * A função format da classe String serve para formatar
		 * a quantidade de casas decimais de um número de ponto
		 * flutuante.
		 **/
		System.out.println(String.format("%.2f", x));
		System.out.printf("%.2f\n", x);
		System.out.println("Bom dia!");
		
		/*
		 *  Concatenar vários elementos em um mesmo comando
		 *  de escrita.
		 */
		
		System.out.println("RESULTADO "+ String.format("%.2f",x) + " METROS");
		
		/* as variáveis devem ser passadas na mesma ordem em que os
		 * placeholders foram passados, no lugar de um placeholder
		 * entra o valor de uma variável.
		 * 
		 * placeholders de formatação: %f, %d, %s.
		 * %f - para números de ponto flutuante.
		 * %d - para números inteiros.
		 * %s - para strings.
		 * 
		 * o /n é um caracter que serve para quebrar a linha.
		 * */
		
		System.out.printf("RESULTADO %.2f METROS\n", x);
		
		String nome = "Alexandre";
		int idade = 20;
		double renda = 235987.900;
		
		System.out.printf("%s tem %d e ganha %.2f\n", nome, idade, renda);
		System.out.println(nome + " tem " + idade + " e ganha "+ String.format("%.2f", renda));
		

	}

}
