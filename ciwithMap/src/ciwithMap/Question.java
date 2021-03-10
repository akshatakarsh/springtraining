package ciwithMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
private int id;
private String name;
private Map<String,String> answers;

public Question() {}
public Question(int id,String name,Map<String,String> answers) {
	this.id=id;
	this.name=name;
	this.answers=answers;
}
public void displayinfo() {
	System.out.println("Question id"+" "+id);
	System.out.println("Question is"+" "+name);
	System.out.println("Answers are...");
	Set<Entry<String,String>> set=answers.entrySet();
	Iterator <Entry<String,String>> itr=set.iterator();
	while(itr.hasNext()) {
		Entry<String,String> entry=itr.next();
		System.out.println("Answers : "+" "+entry.getKey()+" "+entry.getValue());
	}
	
}


}
