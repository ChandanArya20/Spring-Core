package ai.ineuron.cards;

public class DebitCard implements PaymentCard {
	public DebitCard(){
		System.out.println("DebitCard object got created...");
	}
	public boolean payBills(Double bills) {
		
		System.out.println("Paying the bill using debit card " + bills);
		return true;
	}
}
