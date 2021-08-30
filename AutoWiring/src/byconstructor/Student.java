package byconstructor;

public class Student {
	int id;
	String name;
	String city;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		
		System.out.println("Student class is auto wiring");
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
