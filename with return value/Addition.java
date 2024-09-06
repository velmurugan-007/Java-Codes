//function without argument with return value
import java.util.*;
class Testing
{
	public int display()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		System.out.println("Enter Number1");
		a=sc.nextInt();
		System.out.println("Enter Number2");
		b=sc.nextInt();
		c=a+b;
		return c;
	}
}
class Addition
{
	public static void main(String args[])
	{
		Testing t=new Testing();
		int z=t.display();
		System.out.println("Add two Numbers="+z);
	}
}