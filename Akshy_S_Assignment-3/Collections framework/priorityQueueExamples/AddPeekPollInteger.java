package priorityQueueExamples;

import java.util.Collections;
import java.util.PriorityQueue;

public class AddPeekPollInteger {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(5);
		q.add(1);
		q.add(4);
		q.add(3);
		q.add(2);
		System.out.println(q);
		System.out.println("The top element in the queue is "+q.peek());
		System.out.println("Printing top element in the queue and removing it "+q.poll());
		System.out.println(q);
		System.out.println("**************************************");
		PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		q1.add(5);
		q1.add(1);
		q1.add(4);
		q1.add(3);
		q1.add(2);
		System.out.println(q1);
		System.out.println("The top element in the queue is "+q1.peek());
		System.out.println("Printing top element in the queue and removing it "+q1.poll());
		System.out.println(q1);
	}

}
