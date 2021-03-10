package CIInherirngBean;

public class Employee {
	private int id;
	private String name;
	Address address;
	public Employee() {}
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.address=address;
		this.name=name;;
	}
	public void show() {
		System.out.println(id +" "+name);
		System.out.println(address);
	}

}
