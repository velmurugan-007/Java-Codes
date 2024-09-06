import java.util.*;
class Testing
{
	Scanner sc=new Scanner(System.in);
	int i;
	
	public void display(int n)
	{
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Third Element="+a[0]);
		System.out.println("Fifth Element="+a[n-1]);
	}
}
class Array1
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
		