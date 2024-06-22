package estruturaSequencial;

public class ProcessamentoDados {

	public static void main(String[] args) {
		
		/* Início exemplo 1 */
		int x, y;
		
		/*
		 *  x recebe 5
		 *  É aqui onde o processamento de dados acontece.
		 *  */
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
        System.out.println(y);
       /* Fim exemplo 1 */
        
        /* Início exemplo 2 */
        
        /* Boa prática :
         * Sempre indique o tipo do número se a expressão for do
         * ponto flutuante(não inteira) ou seja, retornar um valor
         * de ponto flutuante.
         * 
         * Para double use .0
         * 
         * Para float use f
         * 
         * */
        double b, B, h, area;
        
        b = 6.0;
        B = 8.0;
        h = 5.0;
        
        area = (b + B) / 2.0 * h;
        
        System.out.println(area);
        /* Fim exemplo 2 */
        
        
        /* Início exemplo 3 */
          int c, d;
          double resultado;
          
          c = 5;
          d = 2;
          
          /*
           a palavra double está a fazer um casting, que nada mais é do que
           uma conversão explícita de tipos, no caso, um valor do tipo int
           está a ser convertido para double.
          */
          resultado = (double)c / d;
          
          System.out.println(resultado);
        /* Fim exemplo 3 */
          
          
       // Início exemplo 4
          
          double e;
          int f;
          
          e = 5.0;
          f = (int)e;
          
          System.out.println(f);
       // Fim exemplo 4
	}

}
