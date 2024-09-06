import java.util.*;
class Testing
{
	String str="";
	public String display(int a,int b)
	{
		if(a>b)
		{
			str="a is big than b";
		}
		if(b>a)
		{
			str="b is big than a";
		}
		return str;
	}
}
class BigTwo
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
		String str=t.display(a,b);
		System.out.println(str);
	}
}
