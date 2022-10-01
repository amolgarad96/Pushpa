package Array;

public class Ex2 
{
	public static void main(String[] args) 
	{
		//string ARRAY
		
		String[] str=new String[4];
		str[0]="amol";
		str[1]="rahul";
		str[2]="sumit";
		str[3]="sandesh";
		
		System.out.println(str.length);
		System.out.println(str[0]);
		System.out.println(str.length-1);
		
		System.out.println("-------");
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("---------");
		for(String s2:str)
		{
			System.out.println(s2);
		}
		
	}

}
