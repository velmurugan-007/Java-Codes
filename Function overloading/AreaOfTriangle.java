import java.util.*;
class Testing
{
	int d;
	public void display(int a,int b,int c,int s)
	{
		d=(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle="+d);
	}
	public void display(int g,int i,int k)
	{
		d=(int)(g+i+k)/2;
		System.out.println("Perimeter of triangle="+d);
	}
	public void display(int f)
	{
		d=(int)Math.sqrt(3)*(int)Math.pow(f,2/2);
		System.out.println("Area of Equilateral triangle="+d);
	}

}
class AreaOfTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s,a,b,c;
		System.out.println("Enter s");
		s=sc.nextInt();
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		int k,i,g;
		System.out.println("Enter g");
		g=sc.nextInt();
		System.out.println("Enter i");
		i=sc.nextInt();
		System.out.println("Enter k");
		k=sc.nextInt();
		int f;
		System.out.println("Enter f");
		f=sc.nextInt();
		Testing t=new Testing();
		t.display(s,a,b,c);
		t.display(g,i,k);
		t.display(f);
	}
}