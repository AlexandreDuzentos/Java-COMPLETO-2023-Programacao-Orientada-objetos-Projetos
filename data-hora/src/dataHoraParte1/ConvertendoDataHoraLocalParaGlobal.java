package dataHoraParte1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraLocalParaGlobal {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-12-06");
		LocalDateTime d02 = LocalDateTime.parse("2023-12-06T13:46:09.1234");
		Instant d03 = Instant.parse("2023-12-06T13:46:09.1234Z");
        
		/*
		 * o método ofInstant permite converter uma data hora global para uma
		 * data hora local.
		 * 
		 * convertendo uma data global para uma data local com o timezone do
		 * sistema.
		 * */
        LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        
        /* convertendo uma data global para uma data local com um timezone diferente
         * do sistema.
         * 
         * o método of da class ZoneId recebe uma String correspondente a um 
         * timezone.
         * */
        LocalDate d05 = LocalDate.ofInstant(d03, ZoneId.of("America/Panama"));
        
        
        
        LocalDateTime d06 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime d07 = LocalDateTime.ofInstant(d03, ZoneId.of("America/Panama"));
        
        System.out.println("d03 = "+ d03);
        System.out.println("d04 = "+d04);
        System.out.println("d05 = "+ d05);
        System.out.println("d06 = "+ d06);
        System.out.println("d07 = "+ d07);
        
        /* Obtendo o dia do mês de uma data local */
        System.out.println("d04 dia = "+ d04.getDayOfMonth());
        
        /* obtendo o mês de uma data local */
        System.out.println("d04 mês = "+ d04.getMonthValue());
        
        /* obtendo o ano de uma data local */
        System.out.println("d04 ano = "+ d04.getYear());
        
        
        /* obtendo a hora de uma data-hora local */
        System.out.println("d05 hora = "+ d06.getHour());
        
        /* obtendo os minutos de uma data-hora local */
        System.out.println("d05 minutos = "+ d06.getMinute());
        
        /* obtendo os segundos de uma data-hora local */
        System.out.println("d06 segundos = "+ d06.getSecond());
        
        
        
        
        
        
        /* o método getAvailableZoneIds retorna um array com todos os timzezones mundiais*/
        for(String timeZone : ZoneId.getAvailableZoneIds()) {
        	 // System.out.println(timeZone);
        }
        
        /* o método systemDefault retorna o fuso horário do sistema */
       // System.out.println(ZoneId.systemDefault());

	}

}
