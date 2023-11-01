package in.ineuron.comp;

public class Student {

	private Integer sno;
	private String sname;
	private String saddr;
	private Float marks;
	
	public Student(Integer sno, String sname, String saddr, Float marks) {
	
		this.sno = sno;
		this.sname = sname;
		this.saddr = saddr;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddr=" + saddr + ", marks=" + marks + "]";
	}
	
	
}
