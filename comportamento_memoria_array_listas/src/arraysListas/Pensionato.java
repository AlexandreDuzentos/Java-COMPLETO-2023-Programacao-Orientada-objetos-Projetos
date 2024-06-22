package arraysListas;

import java.util.Scanner;

import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int qtdRooms = sc.nextInt();
		
		Rent[] rent = new Rent[10];
		
		for(int i = 0; i < qtdRooms; i++) {
			int numerador = i + 1;
			System.out.println("Rent #"+ numerador);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			rent[room] = new Rent(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < rent.length; i++) {
			if(rent[i] != null) {
			   System.out.println(rent[i].toString());
			}
		}
				
		sc.close();

	}

}
