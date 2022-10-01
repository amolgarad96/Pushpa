package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public interface ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("amol");
		al.add("suraj");
		al.add('A');
		al.add(68.5);
		al.add(55);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.contains('A'));
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		
		//right shift operation
		al.add(2,'D');
		System.out.println(al);
		//left shift operation
		al.remove(2);
		System.out.println(al);
		
		System.out.println("------");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------");
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("--backward---");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println("--foreach---");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
	}

}
