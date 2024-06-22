package model.entites;

import model.enums.Color;

/*
 * Para que o compilador não obrigue o programador a implementar os métodos da
 * interface que a classe AbstractShape implementa, ela precisa ser abstrata, quem
 * implementará os métodos da interface IShape são as classes concretas que herdarão
 * da classe abstrata AbstractShape.
 * */
public abstract class AbstractShape implements IShape {
   private Color color;
   
   public AbstractShape(Color color) {
	   this.color = color;
   }

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
   
   
   
   
} 
