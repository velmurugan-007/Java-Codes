import java.io.*;
class SumofNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a,b=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=1;i<=n;i++)
			{
				System.out.println("Enter a");
				a=Integer.parseInt(t.readLine());
				b=b+a;
			}
				System.out.println("Sum of number="+b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				