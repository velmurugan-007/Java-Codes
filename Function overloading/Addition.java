import java.util.*;
class Testing
{
	int c;
	public void display(int x,int y)
	{
		
		c=x+y;
		System.out.println(c);
	}
	public void display(int x,int y,int z)
	{
		
		c=x+y+z;
		System.out.println(c);
	}
	public void display(String name,String city)
	{
		
		
		System.out.println(name+" "+city);
	}


}
class Addition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,n;
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		Testing t=new Testing();
		t.display(a,b);
		t.display(a,b,78);
		t.display("xxx","yyy");
	}
}
		