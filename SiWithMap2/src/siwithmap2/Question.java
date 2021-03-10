package siwithmap2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
private int id;
private String name;
private Map<Answer,User> answer;



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



public Map<Answer, User> getAnswer() {
	return answer;
}



public void setAnswer(Map<Answer, User> answer) {
	this.answer = answer;
}



public void displayinfo() {
	System.out.println("Question id"+id);
    System.out.println("Question :"+name);
    System.out.println("Answer is ");
    Set<Entry<Answer,User>>set=answer.entrySet();
    Iterator <Entry<Answer,User>> itr=set.iterator();
    
    while(itr.hasNext()) {
    	Entry<Answer,User> entry=itr.next();
    	System.out.println(entry.getKey()+" "+ "by" +" "+entry.getValue());
    	
    }
    	
    
	
}
}
