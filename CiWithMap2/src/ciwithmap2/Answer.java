package ciwithmap2;

public class Answer {
private int id;
private String answer,postedDate;
public Answer() {}
public Answer(int id,String answer,String postedDate) {
	this.id=id;
	this.answer=answer;
	this.postedDate=postedDate;
}
	public String toString() {
	 return id+" "+answer+" "+postedDate;	
	}
	
	
	
	
	
}
