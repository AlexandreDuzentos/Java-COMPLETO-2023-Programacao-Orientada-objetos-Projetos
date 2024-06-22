package application;

import java.util.Scanner;
import entities.Student;

public class Estudante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String status;
		double missingPoints = 0.0;
		double minimumGradeToPass;
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		if(student.notaEmPorcentagem() >= 60) {
			status = "pass";
		} else {
			status = "failed";
			minimumGradeToPass = (60.0/100 * 100);
			missingPoints =  minimumGradeToPass - student.finalGrade();
		}
		
		System.out.println("Final grade: "+ student.finalGrade());
		System.out.println(status);
		
		if(student.notaEmPorcentagem() < 60) {
			System.out.println("Missing points: "+ missingPoints);
		}
		
		sc.close();

	}

}
