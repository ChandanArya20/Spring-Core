package ai.ineuron.paymentprocessing;

import ai.ineuron.cards.PaymentCard;

public class ProcessPayment {

	PaymentCard payCard=null;  //new CreditCard() --->field injection
	
	//constructor injection
	public ProcessPayment(PaymentCard payCard){
		this.payCard=payCard;
	}
	
	//setter injection
	public void setPaymentCard(PaymentCard payCard) {
		this.payCard=payCard;
	}
	public boolean doPayment(double amount) {
		
		return payCard.payBills(amount);
	}
}
