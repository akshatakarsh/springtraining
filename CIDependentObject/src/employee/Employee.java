package employee;

public class Employee {
private int id;
private String name;
private Address address;
public Employee() {
	System.out.println("Defs Cons");
}
public Employee(int id,String name,Address address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
public void show() {
	System.out.println(id+" "+" "+name);
	System.out.println(address.toString());
}
}
