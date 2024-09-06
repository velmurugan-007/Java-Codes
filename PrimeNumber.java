import java.io.*;
class PrimeNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,b=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=2;n>i;i++)
			{
				if(n%i==0)
				{
					b++;
				}
			}
			if(b==0)
			{
				System.out.println("PrimeNumber");
			}
			else
			{
				System.out.println("not prime number");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			