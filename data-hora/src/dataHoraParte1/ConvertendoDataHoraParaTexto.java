package dataHoraParte1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraParaTexto {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-12-05");
		LocalDateTime d02 = LocalDateTime.parse("2023-12-05T15:44:09.23455");
		Instant d03 = Instant.parse("2023-12-05T15:44:09.23455Z");
		
		LocalDate d04 = LocalDate.now();
		
		/* o método offPattern recebe uma data no formato em que deseja formatar a data*/
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		/* Criando um objeto de formatação com um padrão específico, porém considerando
		 * o timezone do sistema local */
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		/* o método format converte data-hora para um texto num formato específico */
		System.out.println("d01 = "+ d01.format(fmt1));
		System.out.println("d01 = "+ fmt1.format(d01));
		System.out.println("d01 = "+ d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		/* Há a possiblidade de formatar uma data com formatos diferentes */
		System.out.println("d02 = "+ d02.format(fmt1));
		System.out.println("d02 = "+ d02.format(fmt2));
		
		
		/*
		 * Para imprimir de forma costumizada uma data global, é necessário além do
		 * formato, informar também o timezone para o objeto de formatação, o objeto
		 * Instant não possui o método format.
		 * */
		System.out.println("d03 = "+ d03); // a data impressa aqui usa o timezone local
		System.out.println("d03 = "+ fmt3.format(d03)); // a data impressa aqui usa o timezone GMT.
		
		

	}

}
