package application;

import model.entites.AbstractShape;
import model.entites.Circle;
import model.entites.Rectangle;
import model.enums.Color;

public class Aula4 {

	public static void main(String[] args) {
		
		/* O método getColor não pode ser acessado a partir de nenhum dos
		 *  objetos abaixo(s1, s2, do tipo IShape), pois a interface IShape
		 *  não possui o método  getColor().
		 *  
		 *  As classe Circle e Rectangle implementam o método area() da interface
		 *  IShape por meio da herança com classe abstrata AbstractShape, ou seja, elas
		 *  estão a herdar o contrato que a interface IShape estabeleceu com a classe
		 *  abstrata AbstractShape.
		 *  
		 *  Um objeto do tipo Circle casa com um objeto do tipo IShape, por que o objeto
		 *  do tipo Circle cumpre o contrato estabelecido pela Interface IShape, ou seja, implementa
		 *  os métodos definidos na interface IShape.
		 *  
		 *  Por que a interface IShape casa com as classes Circle e Rectangle?
		 *  R: Por que as classes Circle e Rectangle implementam o contrato estabelecido
		 *  pela interface IShape, e também porque a classe Circle e Shape tem uma relação 
		 *  do tipo é um com a Interface IShape, por ela fazer parte da cadeia de herança
		 *  que leva até as classes Circle e Shape.
		 *  
		 *   */
		// IShape s1 = new Circle(Color.BLACK, 2.0);
		// IShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		/* Fazendo um downcasting do objeto s1 que é do tipo IShape que é uma
		 * interface para um objeto do tipo Circle, afim de acessar métodos e atributos
		 * específicos da classe Circle a partir de uma variável de um tipo mais genérico.
		 * */
		//System.out.println(((Circle)s1).getColor());
		
		
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
				
		System.out.println("Circle color: "+ s1.getColor());
		System.out.println("Circle area: "+ String.format("%.3f",s1.area()));
		
		System.out.println("Rectangle color: "+ s2.getColor());
		System.out.println("Rectangle area: "+ String.format("%.3f",s2.area()));

	}

}
