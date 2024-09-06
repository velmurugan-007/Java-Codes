import java.io.*;
class ArrayWithoutZero
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j;
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
				if(a[i]==0 && a[i]==-1)
				{
					System.out.println("Contains 0 and -1");
				}
				else
				{
					System.out.println("Does not contains 0 and -1");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			