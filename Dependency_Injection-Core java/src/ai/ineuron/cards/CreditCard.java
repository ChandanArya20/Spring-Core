package ai.ineuron.cards;

public class CreditCard implements PaymentCard {
	
	public CreditCard(){
		System.out.println("CreditCard object got created...");
	}
	public boolean payBills(Double bills) {
		
		System.out.println("Paying the bill using credit card " + bills);
		return true;
	}
}
