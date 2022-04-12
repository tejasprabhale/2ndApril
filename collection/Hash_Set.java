package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {

		HashSet h=new HashSet();
		
		h.add(100);
		h.add("Tejas");
		h.add('A');
		h.add(65.27);
		h.add(null);
		h.add(null);
		h.add(100);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains('A'));
		System.out.println(h.isEmpty());
		System.out.println(h.remove(100));
		System.out.println(h);
		
		System.out.println("=====Using Iterator===========");
	    Iterator it = h.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("=====For each Loop===========");
	    
	    for(Object o:h)
	    {
	    	System.out.println(o);
	    }
	    h.clear();
	    System.out.println(h);
	    System.out.println(h.isEmpty());
		
	}

}
