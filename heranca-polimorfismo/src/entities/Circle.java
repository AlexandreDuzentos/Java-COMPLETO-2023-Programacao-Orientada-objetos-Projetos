package entities;

import entities.enums.Color;

public class Circle extends Shape {
  /* Declarando e definindo uma constante */
  private static final Double PI = 3.14;
  
  private Double radius;
  
  public Circle() {
	  super();
  }
  
	  public Circle(Color color, Double radius) {
		  super(color);
		  this.radius = radius;
	  }
  
  
	  public Double getCircle() {
		return radius;
	  }
	
	  public void setCircle(Double circle) {
		this.radius = circle;
	  }

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * Math.pow(radius, 2.0);
	}
  
}
