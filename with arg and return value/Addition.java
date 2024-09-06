//function without argument with return value
import java.util.*;
class Testing
{
	int c=0;
	public int display(int a,int b)
	{
		c=a+b;
		return c;
	}
}
class Addition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		System.out.println("Enter Number1");
		a=sc.nextInt();
		System.out.println("Enter Number2");
		b=sc.nextInt();
		Testing t=new Testing();
		int z=t.display(a,b);
		System.out.println("Add two Numbers="+z);
	}
}