package application;

import Devices.ComboDevice;
import Devices.ConcretePrinter;
import Devices.ConcreteScanner;

public class Aula5 {

	public static void main(String[] args) {
		
		ConcretePrinter pt = new ConcretePrinter("1080");
		pt.processDoc("My letter");
		pt.print("My letter");
		
		System.out.println();
		ConcreteScanner sc = new ConcreteScanner("2003");
		sc.processDoc("My Email");
		System.out.println("Scann result: "+ sc.scan());
		
		
		System.out.println();
		ComboDevice cd = new ComboDevice("3017");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: "+ cd.scan());
			

	}

}
