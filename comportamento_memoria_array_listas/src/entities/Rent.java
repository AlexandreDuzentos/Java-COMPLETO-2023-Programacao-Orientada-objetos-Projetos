package entities;

public class Rent {

	public String name;
	public String email;
	public int room;
	
	public Rent(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String toString() {
		return this.room
				+ ": "
				+ this.name
				+ ", "
				+ this.email;
	}
}
