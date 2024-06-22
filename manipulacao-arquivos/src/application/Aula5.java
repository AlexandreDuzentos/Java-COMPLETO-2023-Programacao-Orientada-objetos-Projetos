package application;

import java.io.File;
import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+ path.getName());
		System.out.println("getPath: "+ path.getPath());
		System.out.println("getParent "+ path.getParent());
		
		sc.close();

	}

}
