package siwithcollection2;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
private String name;
private  List<Answer> answer;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public List<Answer> getAnswer() {
	return answer;
}


public void setAnswer(List<Answer> answer) {
	this.answer = answer;
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
