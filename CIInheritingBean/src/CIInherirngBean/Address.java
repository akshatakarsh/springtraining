package CIInherirngBean;

public class Address {
private String village,post,thana,state,city,country;
public Address( String village,String post,String thana,String state,String city,String country) {
	this.village=village;
	this.post=post;
	this.thana=thana;
	this.city=city;
	this.state=state;
	this.country=country;
	
}
public String toString() {
	return village+" " +post+" "+" "+thana+" " +state+" "+city+" "+country;
}

}
