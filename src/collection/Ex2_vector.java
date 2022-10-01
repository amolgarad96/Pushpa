package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex2_vector 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("sandesh");
		v.add("mayur");
		v.add(12);
		v.add('B');
		v.add(68.7);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.contains(12));
		System.out.println(v.get(0));
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		
		//Left side Operation
		v.remove(5);
		System.out.println(v);
		v.add(3,'C');
		System.out.println(v);
		
		System.out.println("-----forLoop-----");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("----iterator----");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----Listiterator----");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("-----forEachLoop-----");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		System.out.println("----enumerator---");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
