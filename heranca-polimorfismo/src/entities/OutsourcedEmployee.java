package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		double employeePayment = super.payment();
		
        double OutsourcedPayment = employeePayment + 110.0/100 * this.additionalCharge;	
        
        return OutsourcedPayment;
	}

}
