package util;

public class CurrencyConverter {
    
	public static final double IOF = 6.0;
	
	public static double convertFromDollarToReal(double dollarPrice, double amountToBuy) {
		 return dollarPrice * amountToBuy + (IOF / 100 * (dollarPrice * amountToBuy));
	}
}
