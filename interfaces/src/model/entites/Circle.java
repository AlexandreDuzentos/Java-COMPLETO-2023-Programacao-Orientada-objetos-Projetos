package model.entites;

import model.enums.Color;

public class Circle extends AbstractShape {
   private static final Double PI = 3.15;
   
   private Double radius;
   
   public Circle(Color color, double radius) {
	   super(color);
	   this.radius = radius;
   }
   
	public Double getRadius() {
	   return radius;
    }

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI * Math.pow(radius, 2);
	}
	
	public void falar() {
		System.out.println("Olá!");
	}
}
