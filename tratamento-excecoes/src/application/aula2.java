package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class aula2 {
    
	/* Uma exceção pode ser tratada usando o bloco try catch ou propagada
	 * na assinatura do método que lança a exceção.
	 * */
	public static void main(String[] args){
		
	    Scanner sc = new Scanner(System.in);
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    
	    try {
		    System.out.println("Room number: ");
		    int number = sc.nextInt();
		    
		    System.out.println("Check-in date (dd/MM/yyyy): ");
		    /* Convertendo um texto(tipo String) de uma fonte externa num formato específico
		     * para um objeto do tipo Date.
		     * 
		     * Conversões entre tipos podem sempre lançar uma exceção.
		     * */
		    Date checkIn = sdf.parse(sc.next()); // Chamada que pode lançar uma exceção.
		    
		    System.out.println("Check-out date (dd/MM/yyyy): ");
		    Date checkOut = sdf.parse(sc.next()); // Chamada que pode lançar uma exceção.
		    
	    	Reservation reservation =  new Reservation(number, checkIn, checkOut);
	    	System.out.println("Reservation: "+reservation.toString());
	    	
	    	System.out.println();
	    	System.out.println("Enter data to update reservation: ");
	  	    System.out.println("Check-in date (dd/MM/yyyy): ");
	  	    checkIn = sdf.parse(sc.next()); // Chamada que pode lançar uma exceção.
	  	    
	  	    System.out.println("Check-out date (dd/MM/yyyy): ");
	  	    checkOut = sdf.parse(sc.next()); // Chamada que pode lançar uma exceção.
	  	    
	  	    reservation.updateDates(checkIn, checkOut);
	    }
	    catch(ParseException e) {
	    	System.out.println("Invalid date format");
	    }
	    catch(DomainException e) {
	    	System.out.println("Error in reservation: "+ e.getMessage());
	    }catch(RuntimeException e) {
	    	System.out.println("Unexpected error");
	    }
	    
	    sc.close();
  	        
	}

}
