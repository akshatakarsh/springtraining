package ciwithcollection2;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
private String name;
private  List<Answer> answer;
public Question() {
	
}
public Question(int id,String name,List<Answer> answer) {
	this.id=id;
	this.name=name;
	this.answer=answer;
	
}

public void displayinfo() {
	System.out.println(id+" "+name);
	System.out.println("Answers are");
	Iterator<Answer> it=answer.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}

}
