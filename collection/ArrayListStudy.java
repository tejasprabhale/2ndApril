package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add("Tejas");
		al.add(1423.67);
		al.add(null);
		al.add("Pune");
		al.add('B');
		al.add('B');
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add("Pimpri");
		al.add(0, "Good Night");
		al.add(4, "Velocity");
		System.out.println(al.size());
		al.remove(7);
		System.out.println(al);
		
		System.out.println(al.contains('B'));
		System.out.println(al.contains('Z'));
		
		System.out.println(al.isEmpty());
		System.out.println(al.get(1));
		System.out.println(al.get(8));
		System.out.println(al.indexOf("Pune"));

		System.out.println("=========Using===Loop========");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=======Using===Iterator=========");
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=======Using===For=Each=Loop=========");
		
		for(Object o:al)
		{
			System.out.println(o);
		}

	}

}
