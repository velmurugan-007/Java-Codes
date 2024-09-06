import java.util.*;
class Testing
{
	public void display(int n)
	{
		int a,b=0;
		for(;n!=0;)
		{
			a=n%10;
			b=b*10+a;
			n=n/10;
		}
		System.out.println("Reverse Number="+b);
	}
	public void display(String name,int l)
	{
		String s="";
		for(int i=0;i<l;l--)
		{
			char ch=name.charAt(l);
			s=s+ch;
		}
		System.out.println("Reverse String="+s);	
	}
	public void display(String m,int k,char ch)
	{
		char p=0;
		for(int i=0;i<k;i++)
		{
			 p=m.charAt(i);
		}
		System.out.println(p);
	}
}
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
		Testing t=new Testing();
		t.display(n);
		String name;
		System.out.println("Enter word");
		name=sc.next();
		int l=name.length()-1;
		t.display(name,l);
		String m;
		System.out.println("Enter char String");
		m=sc.next();
		int k=m.length()-1;
		char ch=m.charAt(l);
		t.display(m,k,ch);
			
	}
}