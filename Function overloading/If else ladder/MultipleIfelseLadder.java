import java.util.*;
class Testing
{
	public void display(int a,int b,int c)
	{
		if(a>b & a>c)
		{
			System.out.println("a is bigger than of three");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is bigger than of three");
		}	
		else{
			System.out.println("C is bigger than of three");
		}
	}
	public void display(char ch)
	{
		if(ch=='1'||ch=='+')
		{
			System.out.println("Addition");
		}
		else if(ch=='2'||ch=='-')
		{
			System.out.println("Subraction");
		}
		else if(ch=='3'||ch=='%')
		{
			System.out.println("Modulas");
		}
		else if(ch=='4'||ch=='/')
		{
			System.out.println("Division");
		}
		else if(ch=='5'||ch=='*')
		{
			System.out.println("Multiplication");
		}
		else{
			System.out.println("Invalid Functions");
		}
	}
	double e;
	public void display(double d)
	{
		if(d<=199)
		{
			e=(d*1.20);
			System.out.println("chargeunit@1.20="+e);
		}
		else if(200<d&&400>d)
		{
			e=(d*1.20)+((d-200)*1.50);		
			System.out.println("Chargeunit@1.50="+e);
		}
		else if(400<d&&600>d)
		{
			e=(d*1.20)+((d-200)*1.50)+((d-200)*1.80);
			System.out.println("chargeunit@1.80="+e);	
		}
		else
		{
			e=(d*1.20)+((d-200)*1.80)+((d-200)*1.80)+((d-200)*2.00);
			System.out.println("Chargeunit@2.00="+e);
		}
		if(d==400)
		{
			e=(d*15/100);
			System.out.println("commission15%="+e);
		}
		if(d<=100)
		{
			System.out.println("minimum bill only100");
		}
	
	}
}
class MultipleIfelseLadder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value a");
		int a=sc.nextInt();
		System.out.println("Enter value b");
		int b=sc.nextInt();
		System.out.println("Enter value c");
		int c=sc.nextInt();
		Testing t=new Testing();
		t.display(a,b,c);
		String n;
		System.out.println("Enter n");
		n=sc.next();
		char ch=n.charAt(0);
		t.display(ch);
		double d;
		System.out.println("Enter d");
		d=sc.nextDouble();
		t.display(d);
	}
}