package Col_PQueue;


import java.util.*;  

public class Sample{  
	public static void main(String args[]){  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("6");  
	queue.add("4");  
	queue.add("3");  
	queue.add("2"); 
	queue.add("5");
	queue.add("1"); 
	System.out.println("head:"+queue.element());  
	//System.out.println("head :"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator<String> itr=queue.iterator();  
	while(itr.hasNext()){  
		System.out.println(itr.next());  
	}  
	queue.remove();  
	//queue.poll();  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){
		System.out.println(itr2.next());  
	}  
  }  
}  