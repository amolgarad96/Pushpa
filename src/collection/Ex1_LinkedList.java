package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex1_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("amol");
		ll.add("sumit");
		ll.add(55);
		ll.add(null);
		ll.add(null);
		ll.add(65.5);
		ll.add('A');
		
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.contains(null));
		System.out.println(ll.remove(3));
		System.out.println(ll);
		System.out.println(ll.size());
		
		System.out.println("----forLoop-----");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("-----iterator----");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----listiterator----");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("------foreachLoop----");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
	
	
		
		
		
	}

}
