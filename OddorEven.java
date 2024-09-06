import java.io.*;
class OddorEven
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("Enter size");
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
				if(a[i]%2==1)
				{
					System.out.println("Odd="+a[i]);
				}
				else
				{
					System.out.println("Even="+a[i]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	
			
		
			