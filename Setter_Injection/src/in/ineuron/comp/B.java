package in.ineuron.comp;

public class B {
	
	private A a;

	static {
		System.out.println("B.class file is loaded");
	}
	public B() {
		System.out.println("B: 0 param contructor");
	}	
	public B(A a) {
		this.a = a;
		System.out.println("B.B():: 1 param constructor");
	}
	
	public void setA(A a) {
		this.a = a;
		System.out.println("setA(A a)");
	}
	public A getA() {
		return a;
	}
	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	
	
}
