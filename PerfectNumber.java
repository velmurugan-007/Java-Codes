import java.io.*;
class PerfectNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a=0,b;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				{
					a=a+i;
					System.out.println("PerfectNumber="+a);
				}
					
			}
				
			if(n==a)
			{
				System.out.println("PerfectNumber");
			}
			else
			{
				System.out.println("Not perfect number");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}