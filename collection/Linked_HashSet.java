package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add(100);
		lh.add("Rohit");
		lh.add(79.89);
		lh.add("Pimpri");
		lh.add("velocity");
		lh.add(null);
		lh.add(100);
		lh.add(null);
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.contains(100));
		System.out.println(lh.size());
		System.out.println(lh.remove("Pimpri"));
		lh.remove(null);
		System.out.println(lh);
		
		System.out.println("=====Using Iterator===========");
		
		Iterator it = lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=====For each Loop===========");
		
		for(Object o:lh)
		{
			System.out.println(o);
		}
		lh.clear();
		System.out.println(lh.isEmpty());
		System.out.println(lh.size());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
