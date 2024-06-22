package estruturaCondicional;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horarioInicial, horarioFinal;
		int duracao = 0;
		
		horarioInicial = sc.nextInt();
		horarioFinal = sc.nextInt();
		
		
		/*
		 * Se a condição for verdadeira isso significa que o jogo começou num 
		 * dia e terminou noutro.
		 * 
		 * Quando o jogo for até o segundo dia, para calcularmos a duração
           Será necessário calcularmos a duracao do jogo no primeiro
           dia(que é traduzido por 24 - horarioInicial) e somarmos ela
           com a duração do segundo dia(que é simplesmente o horário final),
           afim de obtermos a duração completa do jogo.
		 * */
		if(horarioInicial > horarioFinal) {
			duracao = (24 - horarioInicial) + horarioFinal;
		} else {
			/*
			 *  Se a condição do if for falsa, isso quer dizer que
			 *  o jogo começou no mesmo dia e terminou no mesmo dia.
			 **/
			duracao = Math.abs(horarioInicial - horarioFinal);
		}
		
		System.out.println("Duração do jogo "+ duracao);
		
		sc.close();

	}

}
