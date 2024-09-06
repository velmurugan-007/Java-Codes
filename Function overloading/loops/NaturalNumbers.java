import java.util.*;
class Testing
{
	public void display(int n)
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println("Natural Numbers="+i);
		}
			
	}
	double b=0;
	public double display(double a)
	{
		for(int i=0;i<=a;i++)
		{
			b=b+a;
		}
		return b;
	}
}
class NaturalNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
		Testing t=new Testing();
		t.display(n);
		double a;
		System.out.println("Enter a");
		a=sc.nextDouble();
		double b=t.display(a);
		System.out.println(b);
		
	}
}
