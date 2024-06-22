package dataHoraParte1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		/* o método ofPattern recebe uma string no formato em que se deseja interpretar a data */
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // objeto de formatação de data num determinado padrão
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDate d01 = LocalDate.now(); // pegando a data local atual
		LocalDateTime d02 = LocalDateTime.now(); // pegando data-hora local atual
		Instant d03 = Instant.now(); // Pegando data-hora global
		
		/* convertendo um texto no padrão ISO 8601 para data local */
		LocalDate d04 = LocalDate.parse("2023-12-04");
		
		/* convertendo um texto no padrão ISO 8601 para data-hora local */
		LocalDateTime d05 = LocalDateTime.parse("2023-12-04T13:03:45.5678");
		
		/* convertendo um texto no padrão ISO 8601 para data-hora global(no padrão UTC/GMT) */
		Instant d06 = Instant.parse("2023-12-04T13:09:34.12345Z");
		
		
		/*
		 *  convertendo um texto ISO 8601 correspondente ao timezone de são paulo
		 *  para a data-hora correspondente em Londres, ou seja, convertendo
		 *  uma data-hora local para uma data-hora global.
		 *  */
		Instant d07 = Instant.parse("2023-12-04T13:09:34.12345-03:00");
		
		/* o método parse do LocalDate, LocalDateTime e Instant tem um
		 * sobrecarga que aceita um segundo argumento que define como será
		 * interpretado o texto customizado
		 * 
		 * convertendo um texto costumizado em data local.
		 *  */
		LocalDate d08 = LocalDate.parse("12/04/2023", fmt1);
		
		/* convertendo um texto costumizado em data-hora local */
		LocalDateTime d09 = LocalDateTime.parse("12/04/2023 14:40:09", fmt2);
		
		/* convertendo dia, mes, ano em data local*/
		LocalDate d10 = LocalDate.of(2023, 05, 24);
		
		
		LocalTime d11 = LocalTime.now(); // pegando a hora local do relógio do sistema
		 
		/* convertendo dia, mes, ano e [horário] em data-[hora] local*/
		LocalDateTime d12 = LocalDateTime.of(d10,d11);
		
		System.out.println("d01 = "+d01.toString());
		System.out.println("d02 = "+ d02.toString());
		System.out.println("d03 = "+ d03.toString());
		System.out.println("d04 = "+ d04.toString());
		System.out.println("d05 = "+ d05.toString());
		System.out.println("d06 = "+ d06.toString());
		System.out.println("d07 = "+ d07.toString());
		System.out.println("d08 = "+ d08.toString());
		System.out.println("d09 = "+ d09.toString());
		System.out.println("d10 = "+ d10.toString());
		System.out.println("d11 = "+ d11.toString());
		System.out.println("d12 = "+d12.toString());

	}

}
