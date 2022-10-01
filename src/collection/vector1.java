package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector1 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("amol");
		v.add("suraj");
		v.add('A');
		v.add(68.5);
		v.add(55);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.contains("amol"));
		System.out.println(v.isEmpty());
		System.out.println(v.get(4));
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
