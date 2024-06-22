package entities;

public class Student {
	
   public String name;
   public double nota1;
   public double nota2;
   public double nota3;
   
   public double finalGrade() {
	   return this.nota1 + this.nota2 + this.nota3;
   }
   
   public double notaEmPorcentagem() {
	 return  this.finalGrade() / 100 * 100;
   } 
   
   
}
