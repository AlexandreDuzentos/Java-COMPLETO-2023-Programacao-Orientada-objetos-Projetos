package dataHoraParte2;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDataComCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		/* convertendo uma data-hora global para uma data-hora local */
		Date d = Date.from(Instant.parse("2023-12-07T14:29:05Z"));
		
		System.out.println(sdf1.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		/* setando a data a ser manipulada pelo Calendar */
		cal.setTime(d);
		
		/* Adicionando 4 horas a uma data */
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		/* Obtendo a data [manipulada] dentro do calendar */
		d = cal.getTime();
		
		System.out.println(sdf1.format(d));
		
		
		/* OBTENDO UMA UNIDADE DE TEMPO */
		int minutes = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR);
		int seconds = cal.get(Calendar.SECOND);
		int month = 1 + cal.get(Calendar.MONTH); // no Calendar o mês começa em 0
		
		System.out.println("MINUTES: "+ minutes);
		System.out.println("HOUR: "+ hour);
		System.out.println("SECONDS: "+ seconds);
		System.out.println("MONTH: "+ month);
		
	}

}
