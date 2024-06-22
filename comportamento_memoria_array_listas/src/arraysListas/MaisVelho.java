package arraysListas;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        
        for(int i = 0; i < nomes.length; i++) {
        	int numerador = i + 1;
        	System.out.println("Dados da "+numerador+"a pessoa");
        	System.out.println("Nome:");
        	sc.nextLine();
        	nomes[i] = sc.nextLine();
        	
        	System.out.println("Idade: ");
        	idades[i] = sc.nextInt();
        }
        
        
        int maisVelhoIdade = idades[0];
        String maisVelhoNome = "";
        for(int i = 0 ; i < nomes.length; i++) {
        	if(idades[i] > maisVelhoIdade) {
        		maisVelhoIdade = idades[i];
        		maisVelhoNome = nomes[i];
        	}
        }
        
        System.out.println("Pessoa mais velha: "+maisVelhoNome);
        
        
		sc.close();

	}

}
