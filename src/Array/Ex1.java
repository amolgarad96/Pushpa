package Array;

import java.util.Arrays;
import java.util.Iterator;

public class Ex1 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[5];
		ar[0]=10;
		ar[1]=30;
		ar[2]=20;
		ar[3]=40;
		ar[4]=50;
		
		System.out.println(ar.length);
		System.out.println(ar[2]);
		System.out.println(ar.length-1);
		System.out.println("--------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------");
		
		for(int s1:ar)
		{
			System.out.println(s1);
		}
		System.out.println("------");
		Arrays.sort(ar);
		
		
	}

}
