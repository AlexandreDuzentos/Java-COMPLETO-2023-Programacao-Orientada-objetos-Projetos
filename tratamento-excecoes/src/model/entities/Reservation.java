package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
  
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	/* o atributo sendo static, ele será instânciado uma única vez, quando ele for
	 * acessado a partir do identificador da própria classe, se ele não fosse estático
	 * a cada objeto da classe Reservation instânciado, o objeto sdf também seria
	 * instânciado.
	 * */
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation() {}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		/*
		 *  É sempre bom tratar as exceções no começo dos métodos,
		 *  isso se chama programação defensiva, é uma boa prática.
		 *  */
		if(!checkOut.after(checkIn)) {
  	        throw new DomainException("check-out date must be after check-in date");
  	    }
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		/* o método getTime retorna a data em milissegundos */
	   long diff = this.checkOut.getTime() - this.checkIn.getTime();
	   
	   /* TimeUnit é uma classe que é um tipo enumerado complexo do java que tem
	    * algumas operações.
	    * 
	    * Convertendo o valor dado em milissegundos em dias.
	    * */
	   return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	/* Método responsável por atualizar as datas de checkIn e de checkOut, essas
	 * datas não podem ser mudadas arbitráriamente pelos setters, por isso, eles foram
	 * removidos da classe.
	 * */
	public void updateDates(Date checkIn, Date checkOut) {	
		Date now = new Date();
		
		/* o método before testa uma data vem antes de outra */
  	    if(checkIn.before(now) || checkOut.before(now)) {
  	    	/*
  	    	 * A exceção IllegalArgumentException é típicamente usado no java quando os
  	    	 * argumentos passados para um método são inválidos. 
  	    	 * 
  	    	 * lançando minha exceção personalizada(DomainException)
  	    	 *
  	    	 * */
  	    	throw new DomainException("Reservation dates for updates must be future dates");
  	    } else if(!checkOut.after(checkIn)) {
  	    	throw new DomainException("check-out date must be after check-in date");
  	    }
  	    
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		return "Room "
			  + roomNumber
			  + ", check-in: "
			  + sdf.format(checkIn)
			  + ", check-out: "
			  + sdf.format(checkOut)
			  + ", "
			  + this.duration()
			  + " nights";
	}
	
	
}
