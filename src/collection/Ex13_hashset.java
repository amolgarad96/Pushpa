package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex13_hashset
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("suraj");
		hs.add("rajat");
		hs.add('A');
		hs.add(68.5);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.contains("rajat"));
		System.out.println(hs.isEmpty());
		
		//storage type is not index so we can't use for loop
		System.out.println("-----iterator---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----foreachLoop-----");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		
	}

}
