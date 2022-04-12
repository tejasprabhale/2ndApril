package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
	
		LinkedList ll=new LinkedList();
		
		ll.add("abc");
		ll.add(100);
		ll.add('A');
		ll.add(87.48);
		ll.add(100);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(100));
		System.out.println(ll.indexOf(100));
		System.out.println(ll.lastIndexOf(100));
		System.out.println(ll.get(3));
		System.out.println(ll);
		
		ll.add(5, "Good Night");
		System.out.println(ll);
		ll.remove(6);
		System.out.println(ll);
		
		System.out.println("=======For==each====Loop====");
		
		for(Object o:ll)
		{
			System.out.println(o);
		}

		System.out.println("=====Using Iterator===========");

		Iterator i = ll.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("=====Using===ListIterator=========");
		
		for(int i1=0;i1<=ll.size()-1;i1++)
		{
			System.out.println(ll.get(i1));
		}
		
	}
}
