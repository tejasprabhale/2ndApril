package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(100);
		v.add("Rohit");
		v.add(98.55);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(100));
		
		System.out.println(v.indexOf(null));
		System.out.println(v.get(3));
		v.add(3, "Good Morning");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		System.out.println("=====For each Loop===========");
		
		for(Object t:v)
		{
			System.out.println(t);
		}
		
		System.out.println("=====Using Iterator===========");
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=====Using Loop===========");
		
		for(int i = 0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=====enumeration===========");
		
		/*Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.hasMoreElements());
		}*/

	}

}
