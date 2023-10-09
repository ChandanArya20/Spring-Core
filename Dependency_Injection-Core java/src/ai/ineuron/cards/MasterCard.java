package ai.ineuron.cards;

public class MasterCard implements PaymentCard {
	
	public MasterCard(){
		System.out.println("MasterCard object got created...");
	}
	public boolean payBills(Double bills) {
		
		System.out.println("Paying the bill using master card " + bills);
		return true;
	}
}
