package arraysListas;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		String[] nomesMenorQue16 = new String[n];
		
		for(int i = 0; i < nomes.length; i++) {
			int numerador = i + 1;
			System.out.println("Dados da "+ numerador+"a pessoa");
			
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		double somaAlturas = 0;
		double alturaMedia;
		double pessoasComMenosDe16AnosPercentagem;
		double qtdPessoasMenorQue16 = 0;
		for(int i = 0; i < nomes.length; i++) {
			somaAlturas += alturas[i];	
			
			if(idades[i] < 16) {
				qtdPessoasMenorQue16 += 1;
				nomesMenorQue16[i] = nomes[i];
			}
		}
		
		alturaMedia = somaAlturas / alturas.length;
		pessoasComMenosDe16AnosPercentagem = qtdPessoasMenorQue16 / idades.length * 100;
		
		System.out.println("Altura média: "+ String.format("%.2f",alturaMedia));
		
		System.out.println("Pessoas com menos de 16 anos: "+ pessoasComMenosDe16AnosPercentagem+ "%");
		
		for(int i = 0; i < nomes.length; i++) {
			if(!(nomesMenorQue16[i] == null)) {
			System.out.println(nomesMenorQue16[i]);
		}
	}
		
		sc.close();

	}

}
