package dataHoraParte2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoComDatas {
	
	/* Exceção é um erro que deve ser tratado */
	public static void main(String[] args) throws ParseException {
		
		/* A classe simpleDateFormat define formatos para conversão entre Date e String */
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		/* setando o timezone GMT para um objeto do tipo SimpleDateFormat*/
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		/* 
		 *  convertendo uma String para um objeto Date respeitando um formato especificado
		 *  num objeto do tipo SimpleDateFormat.
		 */
		Date y1 = sdf1.parse("12/05/2003");
		
		/* Ídem para a linha de código anterior */
		Date y2 = sdf2.parse("12/05/2003 15:42:07");
		
		
		/* imprimindo uma data no formato especificado num objeto do tipo SimpleDateFormat */
		System.out.println(sdf1.format(y1));
		
		/* Ídem para a linha de código anterior */
		System.out.println(sdf2.format(y2));
		
		/* Instanciando uma data com o instant atual */
		Date x1 = new Date();
		
		/* o argumento passado para o construtor da classe Date devolve o número de
		 * milisegundos correspondente ao instante atual do sistema.
		 * */
		Date x2 = new Date(System.currentTimeMillis());
		
		/* Criando uma data com 0 milissegundos desde a meia noite de 1 de janaeiro
		 * de 1970 que é o marco zero do timezone UTC/GMT, a classe Date usa o timezone
		 * local por padrão, o que influenciará na data resultante com o milissegundos
		 * passados como parâmetro.
		 * */
		Date x3 = new Date(0L);
		
		/* Criando uma data com 5 dias desde a meia noite de 1 janeiro de 1970 que é o
		 * marco zero do timezone UTC/GMT, considerando que a classe Date usa o timezone
		 * local por pdrão */
		Date x4 = new Date(1000L * 60L * 60L * 24L * 5L);
		
		// convertendo um texto no padrão ISO 8601 para data-hora global(no padrão UTC/GMT)
		
		/*
		 *  A classe Date usa o timezone do sistema e para ela usar outro timezone é necessário
		 *  setar isso no objeto SimpleDateFormat que se associará a ela.
		 */
		Date x5 = Date.from(Instant.parse("2023-12-07T14:16:08Z"));
		
		/* imprimindo uma data no formato específicado num objeto do tipo SimpleDateFormat */
		System.out.println(sdf1.format(x1));
		
		System.out.println(sdf1.format(x2));
		
		System.out.println(sdf2.format(x3));
		
		System.out.println(sdf2.format(x4));
		
		System.out.println(sdf3.format(x5));
		

	}

}
