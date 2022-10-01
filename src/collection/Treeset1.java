package collection;

import java.util.TreeSet;

public class Treeset1
{
	public static void main(String[] args)
	{
		TreeSet tr=new TreeSet();
		tr.add('A');
		tr.add('B');
		tr.add('C');
		tr.add('D');
		tr.add('E');
		tr.add('F');
		tr.add('G');
		
//		tr.add(null);
//		tr.add(null);
		
		System.out.println(tr);
		System.out.println(tr.contains('C'));
		System.out.println(tr.isEmpty());
		System.out.println(tr.size());
		
		tr.pollFirst();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		System.out.println("-------");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
	}

}
