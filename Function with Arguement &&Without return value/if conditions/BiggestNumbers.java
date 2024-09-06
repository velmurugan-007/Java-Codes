import java.util.*;
class Testing
{
	public void display(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is the Biggest Number");
		}
		if(a<b)
		{
			System.out.println("b is the Biggest Number");
		}
	}
}
class BiggestNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		Testing t=new Testing();
		t.display(a,b);
	}
}
		