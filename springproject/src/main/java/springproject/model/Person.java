package springproject.model;

public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
    int pid;
    String name;
    Address address;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person(int pid, String name, Address address) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}
   
}
