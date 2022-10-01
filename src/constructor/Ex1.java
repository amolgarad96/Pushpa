package constructor;

public class Ex1 
{
	int num1;
	int num2;
	
	Ex1(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	public void addition()
	{
		int sum = num1+num2;
		System.out.println(sum);
	}
	public void multiplication()
	{
		int mul=num1*num2;
		System.out.println(mul);
	}
	
	public static void main(String[] args)
	{
		Ex1 e1=new Ex1(10,2);
		e1.addition();
		e1.multiplication();
		
		System.out.println("--------------");
		
		Ex1 e2=new Ex1(20,15);
		e2.addition();
		e2.multiplication();
		
		System.out.println("-------------------");
		
		Ex2 s2=new Ex2(50,20);
		s2.substraction();
		System.out.println("---------------");
		Ex2 s3=new Ex2(10,5);
		s3.division();
		
	}
	

}
