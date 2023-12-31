package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {

//	@Autowired
	private Courier courier;
	private Float discount;

	static {
		System.out.println("\nFlipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart:: Zero param constructor...");
	}
	
	public Courier getCourier() {
		return courier;
	}

	@Autowired
	public void setCourier(@Qualifier("fFlight") Courier courier) {
		this.courier = courier;
		System.out.println("setCourier(Courier courier)");
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Flipkart(Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println(this);
		System.out.println("Flifkart(Courier courier, Float discount): 2 param constructor");
	}
	public String doShopping(String[] items, float prices[]) {
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is :: " + courier.getClass().getName());
		System.out.println("Discount amount is :: " + discount);

		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		for (float price : prices) {
			billAmt += price;
		}
		billAmt = billAmt - (discount / 100.0f);
		random = new Random();
		oid = random.nextInt(1000);
		System.out.println("Order id is :: " + oid);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchased having prices  " + Arrays.toString(prices)
				+ " with billAmount of " + billAmt + "----->" + msg;
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
