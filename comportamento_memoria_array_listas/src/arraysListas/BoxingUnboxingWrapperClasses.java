package arraysListas;

public class BoxingUnboxingWrapperClasses {

	public static void main(String[] args) {
		
		/* O tipo primitivo int é trata como uma classe, por causa das
		 * wrapper class equivalente a ele, que é o Integer */
		int x = 20;
		
		/* 
		 * Fazendo um boxing: conversão de um objeto tipo 
		 * valor para um objeto tipo referência compatível.
		 * 
		 * Aqui não preciso fazer um casting para Object pois a variável x do tipo int
		 * por ser tratado como a wrapper class Integer, que é um subtipo
		 * de Object, o casting é natural ou seja o upcasting para uma variável
		 * do tipo Object.
		 * 
		 * */
		Object obj = x;
		
		System.out.println(obj);
		
		
		/*
		 * Fazendo um unboxing: conversão de um objeto tipo
		 * referência para um objeto tipo valor.
		 * 
		 * Aqui o casting é obrigatório, pois a atribuição uma variável
		 * que é um supertipo para outra variável que é um subtipo não é
		 * natural na linguagem java, logo, é necessário falar explicitamente
		 * para qual subtipo se deseja converter o obj.
		 * */
		int y = (int)obj;
		
		System.out.println(y);
		
		
		/* 
		 * Wrapper classes permitem o boxing e unboxing de forma
		 * natural na linguagem, retirando a necessidade de 
		 * fazer casting de um tipo para outro.
		 * */
		
		int k = 9;
		
		/*
		 Fazendo boxing sem a necessidade de casting, por
		 conta do objeto tipo valor e tipo referência serem compa
		 tíveis.
		*/
		Integer w = k;
		
		
		/*
		 * Fazendo unboxing sem a necessidade de casting, por
		 * conta do objeto tipo referência e tipo valor serem
		 * compatíveis.
		 * */
		int p = w;
		
		

	}

}
