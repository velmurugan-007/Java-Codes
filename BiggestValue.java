import java.io.*;
class BiggestValue
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);	
			int n,i,a,b=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=1;i<=n;i++)
			{
				System.out.println("Enter a");
				a=Integer.parseInt(t.readLine());
				if(a<b)
				{
					b=a;
				}
				System.out.println("Biggest Number="+b);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				