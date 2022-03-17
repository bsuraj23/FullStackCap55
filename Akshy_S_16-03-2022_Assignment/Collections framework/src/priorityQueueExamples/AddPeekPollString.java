package priorityQueueExamples;

import java.util.Collections;
import java.util.PriorityQueue;

public class AddPeekPollString {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("D");
		q.add("A");
		q.add("C");
		q.add("E");
		q.add("B");
		System.out.println(q);
		System.out.println("The top element in the queue is "+q.peek());
		System.out.println("Printing top element in the queue and removing it "+q.poll());
		System.out.println(q);
		System.out.println("**************************************");
		PriorityQueue<String> q1 = new PriorityQueue<>(Collections.reverseOrder());
		q1.add("D");
		q1.add("A");
		q1.add("C");
		q1.add("E");
		q1.add("B");
		System.out.println(q1);
		System.out.println("The top element in the queue is "+q1.peek());
		System.out.println("Printing top element in the queue and removing it "+q1.poll());
		System.out.println(q1);

	}

}
