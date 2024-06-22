package application;

import java.io.File;
import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		/* Uma variável do tipo File pode representar tanto o caminho de um arquivo quanto
		 * o caminho de uma pasta.
		 * */
		File path = new File(strPath);
		
		/* O método listFiles recebe como argumento uma outra função responsável
		 * por filtrar "coisas" de dentro de uma matriz. 
		 * 
		 * Foi usada a sintaxe de reference method(File::isDirectory) para referenciar a
		 * funcão responsável por efetuar o filtro.
		 * 
		 * O método listFiles retorna um vetor em que cada elemento é do tipo File.
		 * 
		 * Fazendo uma listagem de pastas que estão dentro de um diretório.
		 *  */
		System.out.println("Folders: ");
		File[] folders = path.listFiles(File::isDirectory);
		for(File folder: folders) {
			System.out.println(folder);
		}

		/* Fazendo uma listagem de arquivos que estão dentro de um diretório */
		System.out.println("Files: ");
		File[] files = path.listFiles(File::isFile);
		for(File file: files) {
			System.out.println(file);
		}
		
		/* criando um subdiretório dentro de outro diretório */
		boolean success = new File(strPath +  "/subdir").mkdir();
		System.out.println("Directory created successfully: "+ success);
	}

}
