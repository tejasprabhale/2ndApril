package collection;

import java.util.PriorityQueue;

public class PriorityQstudy {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("pqr");
		pq.add("lmn");
		pq.add("Pune");
		pq.add("MNO");
		pq.add("xyz");
		//pq.add(100);
		//pq.add(null);
		pq.add("XYZ");
		
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		pq.poll();
		System.out.println("remove method "+pq.remove());
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}

}
