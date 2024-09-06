import java.util.*;
class Testing
{
	public String display()
	{
		Scanner sc=new Scanner(System.in);
		String a,b="";
		System.out.println("Enter Arimthmetic operators");
		a=sc.nextLine();
		char ch=a.charAt(0);
		if(ch=='1' || ch=='+')
		{
			b="Addition";
		}		
		else if(ch=='2' || ch=='-')
		{
			b="Subraction";
		}
		else if(ch=='3'||ch=='%')
		{
			b="Modulas";
		}
		else if(ch=='4'||ch=='/')
		{
			b="Division";
		}
		else
		{
			b="Multiplication";
		}
		return b;
	}
}
class ArithmeticFunction
{
	public static void main(String args[])
	{
		Testing t=new Testing();
		String n=t.display();
		System.out.println(n);
	}
}