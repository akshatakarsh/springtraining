package ciwithmap2;

public class User {
private int id;
private String name,email;
public User() {}
public User(int id,String name,String email) {
	this.id=id;
	this.email=email;
	this.name=name;
}
public String toString() {
	return id+" "+name+" "+email;
}
}
