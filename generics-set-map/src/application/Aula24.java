package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> students = new HashSet<>();
		
		System.out.print("How many students for course A:");
		int qtdStudents = sc.nextInt();
		
		for(int i = 1; i <= qtdStudents; i++) {
			int studentId = sc.nextInt();
			students.add(studentId);
		}
		
		System.out.print("How many students for course B:");
		qtdStudents = sc.nextInt();
		
		for(int i = 1; i <= qtdStudents; i++) {
			int studentId = sc.nextInt();
			students.add(studentId);
		}
		
		System.out.print("How many students for course C:");
		qtdStudents = sc.nextInt();
		
		for(int i = 1; i <= qtdStudents; i++) {
			int studentId = sc.nextInt();
			students.add(studentId);
		}
		
		System.out.println("Total students: "+ students.size());
		
		sc.close();

	}

}
