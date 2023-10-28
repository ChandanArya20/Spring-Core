package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {

	Integer id;
	String name;
	String address;
	
	
	public Integer getId() {
		return id;
	}
	@Required
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
