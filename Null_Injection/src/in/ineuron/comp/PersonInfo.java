package in.ineuron.comp;

import java.util.Date;

public class PersonInfo {

	private Integer id;
	private String name;
	private Integer age;
	private Date dob;
	private Date dom;
	private Date doj;
	
	
	
	public PersonInfo(Integer id, String name, Integer age, Date dob, Date dom, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", dom=" + dom + ", doj="
				+ doj + "]";
	}
	
	
	
	
}
