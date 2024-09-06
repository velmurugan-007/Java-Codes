import java.io.*;
class ReverseNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a,b=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(;n>0;)
			{
				a=n%10;
				b=b*10+a;
				n=n/10;
			}
				System.out.println("ReverseNumber="+b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}