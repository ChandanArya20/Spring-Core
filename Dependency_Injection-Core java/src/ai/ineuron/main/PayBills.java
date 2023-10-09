package ai.ineuron.main;

import ai.ineuron.cards.CreditCard;
import ai.ineuron.cards.DebitCard;
import ai.ineuron.cards.MasterCard;
import ai.ineuron.paymentprocessing.ProcessPayment;

public class PayBills {
	
	public static void main(String[] args) {
		
		ProcessPayment pp=new ProcessPayment(new DebitCard());
		pp.setPaymentCard(new MasterCard());
		Boolean status=pp.doPayment(200);
		if(status==true)
			System.out.println("Payment success...");
		else
			System.out.println("Payment failed... try again...");
		
	}
	
}
