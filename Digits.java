import java.io.*;
class Digits
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n;	
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=1;i<n;i++)
			{
				n=n/10;
			}
				System.out.println("Digits="+i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			