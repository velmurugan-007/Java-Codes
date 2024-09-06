import java.io.*;
class RemoveSpecificElement
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,m,c,x=0;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(t.readLine());
			}
			System.out.println("enter specific value");
			m=Integer.parseInt(t.readLine());
			for(i=0;i<n;i++)
			{
				if(a[i]==m)
				{
					c=a[i];
					a[i]=a[n-1];
					a[n-1]=c;
					x++;
				}
			}
			
				if(x>0)
				{
					for(i=0;i<n-1;i++)
					{
						System.out.println(a[i]);
					}
				}
				else
				{
					for(i=0;i<n;i++)
					{
						System.out.println(a[i]);
					}
				}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			