package ciwithmap2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
private int id;
private String name;
private Map<Answer,User> answer;

public Question() {}
	

public Question(int id,String name,Map <Answer,User> answer) {
	this.id=id;
	this.answer=answer;
	this.name=name;
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
