package priorityQueueExamples;

import java.util.PriorityQueue;

public class Remove {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("D");
		q.add("A");
		q.add("C");
		q.add("E");
		q.add("B");
		System.out.println(q);
		q.remove();//removes element with highest priority/top element
		System.out.println(q);
		q.remove("D");//remove specific element
		System.out.println(q);
		System.out.println("Printing top element in the queue and removing it "+q.poll());
		System.out.println(q);

	}

}
