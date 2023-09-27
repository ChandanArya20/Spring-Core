package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {

	// Dependent Object
	private Courier courier;
	private Float discount;

	static {
		System.out.println("\nFlipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart:: Zero param constructor...");
	}
	public Flipkart(Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
