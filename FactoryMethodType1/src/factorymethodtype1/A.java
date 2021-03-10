package factorymethodtype1;

public class A {
private static final A obj=new A();
private A(){
	System.out.println("Private Constructor");
}
	public static A getA() {
		System.out.println("factory Method");
		return obj;
	}
	public void msg(){  
	    System.out.println("hello user");  
	}  
}

