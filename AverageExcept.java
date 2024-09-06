import java.io.*;
class AverageExcept
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,c=0,b=0,j,d;
			System.out.println("Enter Size");
			n=Integer.parseInt(t.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(t.readLine());
			}
			
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
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
				System.out.println("a="+a[i]);
			}
			for(i=1;i<n-1;i++)
			{	
				b=b+a[i];
			}
			d=b/(n-2);
			System.out.println(d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
						
					
			