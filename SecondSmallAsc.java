import java.io.*;
class SecondSmallAsc
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,b=0,c,j;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(t.readLine());
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
				System.out.print(a[i]);
			}
			System.out.println();
			System.out.println(a[1]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}		