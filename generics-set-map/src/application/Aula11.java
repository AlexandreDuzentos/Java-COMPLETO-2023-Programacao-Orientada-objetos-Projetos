package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Aula11 {

	public static void main(String[] args) {
		/* Solução imprópria, não conseguiremos adicionar
		 * elementos na lista na lista do método, porque o compilador não sabe
		 * qual é o tipo específico do qual a lista foi instânciada.
		 *  */
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Circle(2.0));
		myShapes.add(new Rectangle(3.0, 2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		/* Erro de compilação: uma lista de Shape(List<Shape>) é um subtipo de
		 * uma lista de um tipo curinga(List<?>).
		 * */
		 System.out.println("Total area: "+ Aula11.totalArea(myCircles)); 
		

	}
	
	/* No parâmetro eu estou dizendo que a minha lista pode ser de Shape ou
	 * de qualquer tipo que seja um subtipo de Shape, ou seja, ela 
	 * e uma lista de Shape ou de qualquer tipo que seja um subtipo de Shape.
	 * */
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape element: list) {
			sum += element.area();
		}	
     	return sum;
	}

}
