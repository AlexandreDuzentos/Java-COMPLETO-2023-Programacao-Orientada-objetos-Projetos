package model.entities;

import java.time.Instant;
import java.util.Objects;

public class UserLogEntry {
   private String name;
   private Instant instant;
   
   public UserLogEntry(String name, Instant instant) {
	   this.name = name;
	   this.instant = instant;
   }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Instant getInstant() {
		return instant;
	}
	
	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	
	/* 
	 * O critério usado para comparar um objeto com outro foi apenas pelo name, afim
	 * de evitar repetições.
	 * */
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	/* 
	 * O critério usado para comparar um objeto com outro foi apenas pelo name, afim
	 * de evitar repetições.
	 * */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLogEntry other = (UserLogEntry) obj;
		return Objects.equals(name, other.name);
	}
	
	

	
   
   
}
