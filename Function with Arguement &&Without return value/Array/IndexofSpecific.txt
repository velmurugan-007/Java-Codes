import java.util.*;
class Testing
{
	Scanner sc=new Scanner(System.in);
	int i,m;
	public void display(int n)
	{
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter specific");
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==m)
			{ 
				System.out.println("Index of specific value="+i);
			}
		}	
	}
}
class IndexofSpecific
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Size");
		n=sc.nextInt();
		Testing t=new Testing();
		t.display(n);
	}
}