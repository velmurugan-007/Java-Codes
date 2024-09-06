import java.util.*;
class Testing
{
	int c;
	public void display(int a,int b,int s)
	{
		c=(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Areaoftriangle="+c);	
	}
}
class AreaofTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,s;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println("Enter s");
		s=sc.nextInt();
		Testing t=new Testing();
		t.display(a,b,s);
	}
}
		