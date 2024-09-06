import java.io.*;
class Factorial
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,f=1;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=1;i<=n;i++)
			{
				f=i*f;
				System.out.println("f="+f);
			}	
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}