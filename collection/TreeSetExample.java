package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		ts.add("xyz");
		ts.add("Tejas");
		ts.add("abc");
		ts.add("Pune");
		ts.add("xyz");
		//ts.add(100);  { Interger not allowed }
		//ts.add(null); { null pointer not allwed }
		ts.add("ABC");
		ts.add("abc");
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("Pune"));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);

		System.out.println("=====Using Iterator===========");
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("=====For each Loop===========");
		
		for(Object o:ts)
		{
			System.out.println(o);
		}
		
	}

}
