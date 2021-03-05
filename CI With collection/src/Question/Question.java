package Question;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
private String name;
List<String> answers;
public Question() {}
public Question(int id,String name,List<String>answers) {
	super();
	this.id=id;
	this.name=name;
	this.answers=answers;
}
public void displayinfo() {
	System.out.println(id+" "+name);
	System.out.println("Answers are"+" ");
	Iterator itr=answers.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
