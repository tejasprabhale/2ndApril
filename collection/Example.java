package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Example {

	public static void main(String[] args) {
		
		ArrayList<Integer>in =new ArrayList<>();
		
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		
		System.out.println(in);
		
		for(int i:in)
		{
			System.out.println(i);
		}
		
		System.out.println("==================");

		Iterator<Integer>in1=in.iterator();
		
		while(in1.hasNext())
		{
			System.out.println(in1.next());
		}
		
		System.out.println("==================");
		
		ListIterator<Integer> l = in.listIterator();
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
	}

}
