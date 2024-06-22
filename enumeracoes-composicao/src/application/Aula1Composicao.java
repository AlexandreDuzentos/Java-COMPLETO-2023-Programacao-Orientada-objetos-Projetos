package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Aula1Composicao {

	/* o throws ParseException diz para o compilador que o método main,
	 * ou seja, qualquer código dentro dele, tem luz para lançar a exceção
	 * ParseException.
	 * */
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		/*
		 *  Declarando e instânciando o objeto dept do tipo Department com o valor
		 *  informado pelo usuário.
		 * */
		Department dept = new Department(departmentName);
		
		System.out.println("Enter worker data: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		/*
		 *  Declarando e instânciando um objeto do tipo WorkerLevel com o valor
		 *  informado pelo usuário.
		 * */
		WorkerLevel wl = WorkerLevel.valueOf(level);
		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, wl, baseSalary, dept);
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		
		List<HourContract> contracts = new ArrayList<>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #"+i+" data");
			System.out.print("Date(DD/MM/YY): ");
			
			/* 
			 *  convertendo uma String para um objeto Date respeitando um formato especificado
			 *  num objeto do tipo SimpleDateFormat.
			 */
		
		
			Date contractDate = sdf1.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration: ");
			int hours = sc.nextInt();
			
			worker.addContract(new HourContract(contractDate, valuePerHour, hours));	
			
		}
	
	
		System.out.println("Enter month and year to calculate income (MM/yyyy): ");
		
		/*
		 * lendo uma string no formato especificado no objeto sdf2 e convertendo
		 * para um objeto Date.
		 * */
		Date date = sdf2.parse(sc.next());
		
		/* convertendo o objeto do tipo Date,  para formato definido no objeto
		 * sdf2, o método format retorna uma string.
		 * */
		String monthAndYear = sdf2.format(date);
		
		/* 
		 * ---- OR -----
		 * 
		 * Lendo diretamente uma String e depois recortá-la para obter o mês e o ano.
		 * String monthYear = sc.next()
		 * 
		 * int month = Integer.parseInt(monthYear.substring(0, 2));
		   int year =  Integer.parseInt(monthYear.substring(3));
		 * */
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year =  Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+ worker.getDepartment().getName());	
		System.out.println("Income for "+monthAndYear+ ": "
		+ String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	
	}

}
