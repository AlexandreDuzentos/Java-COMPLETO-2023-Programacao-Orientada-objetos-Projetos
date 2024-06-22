package outrosTopicosBasicos;

public class FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHI ABC abc DEFG  ";

		/* Formatar */
		String s01 = original.toLowerCase(); // converte uma string para minúscula
		String s02 = original.toUpperCase(); // converte uma string para maiúscula
		String s03 = original.trim(); // remove espaços em branco no início ou fim de uma string
		
		/* Recortar */
		String s04 = original.substring(5); // recortar de uma posição até ao final da string
		String s05 = original.substring(2, 7); // recortar de uma posição até outra na string
		
		String s06 = original.replace("a", "x"); // substitui um caracterer por outro
		String s07 = original.replace("AB", "WZ"); // substitui uma sequência de caracteres por outra
		
		int s08 = original.indexOf("bc"); // retorna o índice da primeira ocorrência de uma caractere na string
		int s09 = original.lastIndexOf("bc"); // retorna o índice da última ocorrência de um caractere na string
		
		String[] vet = original.split(" ");
		
		System.out.println("Original -"+original + "-");
		System.out.println("ToLowerCase -"+ s01+ "-");
		System.out.println("ToUpperCase -"+ s02+ "-");
		System.out.println("trim -"+ s03+ "-");
		System.out.println("substring(5) -"+ s04+ "-");
		System.out.println("substring(2,7) -"+ s05+ "-");
		System.out.println("replace('a','x') -"+ s06+ "-");
		System.out.println("replace('AB', 'WZ') -"+ s07+ "-");
		System.out.println("indexOf('bc'): "+ s08);
		System.out.println("lastIndexOf('bc'): "+ s09);
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
		System.out.println(vet[3]);
		System.out.println(vet[4]);
	}

}
