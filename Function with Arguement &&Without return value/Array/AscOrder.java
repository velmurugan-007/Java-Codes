import java.util.*;
class Testing
{
	Scanner sc=new Scanner(System.in);
	int i,c=0,j;
	public void display(int n)
	{
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Ascending Order="+a[i]);
		}	
	}
}
class AscOrder
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