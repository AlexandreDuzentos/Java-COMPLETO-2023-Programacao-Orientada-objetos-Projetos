package application;

import model.entites.Circle;
import model.entites.Rectangle;
import model.entites.Shape;
import model.enums.Color;

public class Aula3 {

	public static void main(String[] args) {
		
		/*
		Shape s1 = new Circle(Color.BLACK, 2.0);
		Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: "+ s1.getColor());
		System.out.println("Circle area: "+ String.format("%.3f",s1.area()));
		*/
		
		/* Fazendo um downcasting de um objeto do tipo Shape(mais genérico) para um objeto do
		 * tipo Circle(mais específico), afim de acessar membros pertencentes apenas ao
		 * objeto do tipo Circle, que é o tipo mais específico.
		 *  */
		
		/*
		((Circle)s1).falar();
		System.out.println(((Circle)s1).getRadius());
		
		System.out.println("Rectangle color: "+ s2.getColor());
		System.out.println("Rectangle area: "+ String.format("%.3f",s2.area()));
		*/
		
		/* Idém para o exemplo acima */
		
		/*
		((Rectangle)s2).falar();
		System.out.println(((Rectangle)s2).getHeight());
		*/
		
		

	}

}
