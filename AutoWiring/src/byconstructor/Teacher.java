package byconstructor;

public class Teacher {
	
private Student S;





public Teacher(Student s) {
	super();
	S = s;
}





public void print() {
	System.out.println("Printing student object");

	System.out.println(S);
}
}
