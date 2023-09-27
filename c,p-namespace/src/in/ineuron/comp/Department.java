package in.ineuron.comp;

import java.util.Date;

public class Department {
	
	private Integer dno;
	private String name;
	private Date doj;
	
	
	public Department(Integer dno, String name, Date doj) {
		this.dno = dno;
		this.name = name;
		this.doj = doj;
	}
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", name=" + name + ", doj=" + doj + "]";
	}
	
	
}
