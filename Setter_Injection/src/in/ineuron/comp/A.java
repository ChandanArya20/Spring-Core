package in.ineuron.comp;

public class A {
	
	private B b;

	static {
		System.out.println("A.class file is loaded");
	}
	public A() {
		System.out.println("A: 0 param contructor");
	}	
	public A(B b) {
		this.b = b;
		System.out.println("A.A():: 1 param constructor");
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("setB(B b)");
	}
	
	public B getB() {
		return b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

	
	
	
}
