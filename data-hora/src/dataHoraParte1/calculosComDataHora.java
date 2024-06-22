package dataHoraParte1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class calculosComDataHora {

	public static void main(String[] args) {
		
		/* Convertendo um texto para um objeto do tipo LocalDate
		 * O objeto LocalDate trabalha com a data local.
		 *  */
		LocalDate d01 = LocalDate.parse("2023-12-06");
		
		/* Convertendo um texto para um objeto do tipo LocalDateTime
		 *  O objeto LocalDate trabalha com a data e a hora locais.
		 *  */
		LocalDateTime d02 = LocalDateTime.parse("2023-12-06T13:46:09.1234");
		
		/* Convertendo um texto para um objeto do tipo Instante
		 *  O objeto LocalDate trabalha com a data e hora globais. */
		Instant d03 = Instant.parse("2023-12-06T13:46:09.1234Z");
		
		/* Os métodos para fazer calculos com datas retornam um cópia do 
		 * objeto LocalDate, e não o objeto original*/
		
		
		/* subtraindo um número de dias a um objeto LocalDate */
		 
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		
		
		/* adicionando um número de dias a um objeto LocalDate */
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		
		System.out.println("d01 - 7 days = "+pastWeekLocalDate);
		System.out.println("d01 + 7 days = "+nextWeekLocalDate);
		
		
		/* Subtraindo uma quantidade de horas a um objeto LocalDateTime */
		LocalDateTime past5HoursLocalDateTime = d02.minusHours(5);
		
		/* Adicionando uma quantidade horas a um objeto LocalDateTime */
		LocalDateTime next5HoursLocalDateTime = d02.plusHours(5);
		
		System.out.println("d02 - 5 hours = "+ past5HoursLocalDateTime);
		System.out.println("d02 + 5 hours = "+ next5HoursLocalDateTime);
		
		/* ChronoUnit é uma enumeração */
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("d03 - 7 days = "+pastWeekInstant);
		System.out.println("d03 + 7 days = "+nextWeekInstant);
		
		
		/* o método between da class Duration, calcula a diferença entre duas
		 * datas.
		 *  */
		Duration t1 = Duration.between(d02,next5HoursLocalDateTime);
		
		/* O duration não suporta objetos LocalDate, é necessário converter o 
		 * objeto LocalDate para LocalDateTime com o método atTime, que recebe hora, minuto e segundo
		 * como argumento, para então calcular a diferença entre as duas datas.
		 * */
		Duration t2 = Duration.between(d01.atTime(0, 0, 0), nextWeekLocalDate.atTime(0, 0, 0));
		
		Duration t3 = Duration.between(d03, nextWeekInstant);
		
		/* obtendo a diferença de horas entre duas datas */
		System.out.println("t1 = "+ t1.toHours());
		
		
		/* obtendo a diferença de dias entre duas datas */
		System.out.println("t2 = "+t2.toDays());
		
		/* obtendo a diferença de dias entre duas datas */
		System.out.println("t3 = "+ t3.toDays());
		
			

	}

}
