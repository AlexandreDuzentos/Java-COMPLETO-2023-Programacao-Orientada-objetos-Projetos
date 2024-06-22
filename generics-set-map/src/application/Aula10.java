package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Aula10 {

	public static void main(String[] args) {
		/* Solução imprópria, não conseguiremos adicionar
		 * elementos na lista na lista do método, porque o compilador não sabe
		 * qual é o tipo específico do qual a lista foi instânciada, esse é o
		 * preço a pagar quando trabalhamos com tipos curingas delimitados.
		 *  */
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Circle(2.0));
		myShapes.add(new Rectangle(3.0, 2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		/* Erro de compilação: uma lista de Shape(List<Shape>) não é um supertipo de
		 * uma lista de Circle(List<Circle>), mas uma classe do tipo Shape é um supertipo
		 * de uma classe do tipo Circle, o supertipo de qualquer tipo de lista é List<?>, ?(interrogação) é um
		 * tipo curinga.
		 * */
		// System.out.println("Total area: "+ Aula10.totalArea(myCircles)); 
		

	}
	
	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for(Shape element: list) {
			sum += element.area();
		}	
     	return sum;
	}

}
