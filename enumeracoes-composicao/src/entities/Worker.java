package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
   private String name;
   private WorkerLevel level;
   private Double baseSalary;
   
   /* composição tem-um ou Associação de objetos */
   private Department department;
   
   /* composição de objetos: declarando e instânciando uma lista.
    * 
    * quando temos uma composição tem-muitos, o atributo que armazenará outros objetos
    * não deve ser incluído no construtor, você simplesmente o inicia a sua lista vazia,
    * instânciando-a.
    * 
    * A propriedade contracts não pode estar no construtor por que ela permitirá que 
	* a lista de contracts dentro do objeto seja trocada por outra lista de contracts
	* passada como parâmetro para o contrutor, e o mesmo que aconteceria se tivessemos
	* um método setContract, por conta disso, ele também não deve estar presente.
    * 
    *  */
   private List<HourContract> contracts = new ArrayList<>();
   
   public Worker() {
	   
   }

   public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
	   this.name = name;
	   this.level = level;
	   this.baseSalary = baseSalary;
	   this.department = department;
   }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}
	
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public Double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return this.department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts(){
		 return contracts;
	}
	
	/*
	 *  O método setContracts não pode estar presente, por que ele trocará a minha lista de contracts
	 *  por outra lista de Contracts que for passada como parâmetro, o que é indesejado para esse cenário.
	 * */
	
	/*
	public void setContracts(List<HourContract> contracts) {
		  this.contracts = contracts;
	}
	*/
   
	/* Método responsável por associar o Worker a um contract */
     public void addContract(HourContract contract) {
    	 contracts.add(contract);
     }
     
     /* Método responsável por desassociar o Worker de um contract */
     public void removeContract(HourContract contract) {
    	 contracts.remove(contract);
     }
     
     
     /* Método responsável por calcular o income do Worker baseado em todos os Contracts associados a ele */
	public Double income(int year, int month) {
		 double sum = baseSalary;
    	 Calendar cal = Calendar.getInstance();
    	 
    	 for(HourContract contract : contracts) {
    		 
    		 cal.setTime(contract.getDate());
    		 
    		 /* Extraindo o mês e ano de cada data da lista de contracts */
    		 int cMonth = 1 + cal.get(Calendar.MONTH); // o mês do Calendar começa em 0.
    		 int cYear = cal.get(Calendar.YEAR);
    		 
    		 if(year == cYear && month == cMonth) {
    			 sum += contract.totalValue();
    		 }
    	 }
    	 
    	 return sum;
     }
	
   
}
