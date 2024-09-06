import java.io.*;
class FibonacciSeries
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a=0,b=1,c;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=0;i<=n;i++)
			{
				c=a+b;
				System.out.println("c="+c);
				a=b;
				b=c;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}