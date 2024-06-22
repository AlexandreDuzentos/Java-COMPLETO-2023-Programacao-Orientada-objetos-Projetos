package arraysListas;

public class LacoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[]{"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------");
		
		/* Leitura: para cada objeto nome contido em vect, faça */
		for(String nome: vect) {
			System.out.println(nome);
		}

	}

}
