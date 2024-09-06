import java.io.*;
class ArrayWithoutZero
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j,c=0;
			System.out.println("Enter Size");
			n=Integer.parseInt(t.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]==0 && a[j]==-1)
					{
						c++;
					}
					
				}
			}
			if(c>=1)
			{
				System.out.println("Contains 0 and -1");
			}
			else
			{
				System.out.println("Does not Contains 0 an -1");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			