import java.util.*;
class Testing
{
	Scanner sc=new Scanner(System.in);
	int i,n,w;
	public void display(int n)
	{
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[w];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			w=a[i]+b[i];
			System.out.println("Sum of Two Array="+w);
		}	
	}
}
class SumofTwoArray
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