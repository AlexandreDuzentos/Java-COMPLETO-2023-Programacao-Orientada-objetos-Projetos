package Devices;

public class ComboDevice extends Device implements Scanner, Printer {
    
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: "+ doc);
		
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo scan result";
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
		
	}
}
