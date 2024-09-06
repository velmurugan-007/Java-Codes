import java.util.*;
class Testing
{
	public String display()
	{
		Scanner sc=new Scanner(System.in);
		String c="";
		int a,b;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		if(a>b)
		{
			c="a is bigger than b";
		}
		if(b>a)
		{
			c="b is bigger than a";
		}
		return c;
	}
}
class BigTwo
{
	public static void main(String args[])
	{
		Testing t=new Testing();
		String d=t.display();
		System.out.println(d);
	}
}
