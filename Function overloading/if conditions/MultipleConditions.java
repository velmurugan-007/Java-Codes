import java.util.*;
class Testing
{
	public void display(int a)
	{
		if(a%2==1)
		{
			System.out.println("The given number is odd");
		}
		else
		{
			System.out.println("The given number is Even");
		}
	}
	public void display(int c,int b)
	{
		if(c>b)
		{
			System.out.println("C is big than b");
		}
		if(b>c)
		{
			System.out.println("b is bigger than c");
		}
	}
	public void display(double d)
	{
		if(0<d)
		{	
			System.out.println("The given number is positive");
		}
		if(0>d)
		{
			System.out.println("The given number is Negative");
		}
	}
}
class MultipleConditions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a");
		a=sc.nextInt();
		Testing t=new Testing();
		t.display(a);
		int c,b;
		System.out.println("Enter c");
		c=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		t.display(c,b);
		double d;
		System.out.println("Enter d");
		d=sc.nextDouble();
		t.display(d);
	}
}