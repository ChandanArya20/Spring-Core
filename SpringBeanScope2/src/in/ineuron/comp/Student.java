package in.ineuron.comp;

public class Student {

	Integer id;
	String name;
	A a;
	
	public Student() {
		System.out.println("Student(): 0 param constructor");
	}

	public Student(Integer id, String name,A a) {
		this.id = id;
		this.name = name;
		this.a=a;
		System.out.println("Student(Integer id, String name): 2 param constructor");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
		
}
