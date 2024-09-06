import java.util.*;
class Testing
{
	int a1=0;
	public int display(int a,int b,int c,int s)
	{
		a1=(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return a1;
	}
}
class AreaOfTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,s;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		System.out.println("Enter s");
		s=sc.nextInt();
		Testing t=new Testing();
		int a1=t.display(a,b,c,s);
		System.out.println(a1);
	}
}