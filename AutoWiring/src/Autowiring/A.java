package Autowiring;

public class A {
	private B b ,b1;
	
	
public B getB1() {
		return b1;
	}
	public void setB1(B b1) {
		this.b1 = b1;
	}
A(){
	System.out.println("object A is created");
}
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
void print() {System.out.println("Hello A");
}
public void display() {
	print();
	b.print();
}
}
