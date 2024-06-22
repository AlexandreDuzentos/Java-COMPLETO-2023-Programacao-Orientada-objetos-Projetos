package model.entites;

public interface IShape {
	/* Na interface o compilador já presume que o modificador de 
	 * acesso das operações é public e que elas são abstratas.
	 * 
	 * Por exemplo: public abstract double area();
	 * */
   double area();
}
