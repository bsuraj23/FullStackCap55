package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueEx {

	public static void main(String[] args) {
	Queue<String> pq=new PriorityQueue<String>();
			
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		System.out.println("Before removing:");
		System.out.println(pq);
		
		pq.remove();
		System.out.println("After removing");
		System.out.println(pq);
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
