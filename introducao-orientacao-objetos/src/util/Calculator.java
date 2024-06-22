package util;

public class Calculator {
	
	/*
	 *  A palavra reservada final indica que PI é uma constante,
	 *  ou seja, não pode ser alterada pela aplicação.
	 *  
	 *  Nomes de constantes devem estar em caixa-alta.
	 *  Se haver mais de uma palavra, o padrão de escrita a ser
	 *  seguido deverá ser o dash-case.
	 *  */
	public static final double PI = 3.14159;
  
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
