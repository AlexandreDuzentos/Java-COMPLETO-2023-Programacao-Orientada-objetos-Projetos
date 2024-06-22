package model.services;

public class PaypalPaymentService implements OnlinePaymentService {
    
	public double paymentFee(double amount) {
		return ((2.0/100) * amount);
	}
	
	public double interest(double amount, int months) {
		return (((1.0/100) * amount) * months);
	}
}
