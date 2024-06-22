package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Aula8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data");
			System.out.println("Individual or company(i/c)?");
			char ans = sc.next().charAt(0);
			
			if(ans == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
		        
				list.add(new PhysicalPerson(name, anualIncome,healthExpenses));
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int qtdEmployees = sc.nextInt();
				
				list.add(new LegalPerson(name, anualIncome, qtdEmployees));
			}
		}
		
		System.out.println("TAXES PAID: ");
		for(Person p : list) {
			System.out.println(p.getName()+ ": $ "+ String.format("%.2f",p.tax()));
		}
		
		sc.close();

	}

}
