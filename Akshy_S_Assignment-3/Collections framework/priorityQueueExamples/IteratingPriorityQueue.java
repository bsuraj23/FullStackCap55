package priorityQueueExamples;

import java.util.Iterator;
import java.util.PriorityQueue;



public class IteratingPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("D");
		q.add("Q");
		q.add("A");
		q.add("B");
		q.add("P");
		q.add("C");
		q.add("E");
		q.add("R");
		q.add("B");
		System.out.println(q);
		Iterator<String> it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***************************");
		//Iterating and removing elements
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q);
	}

}
