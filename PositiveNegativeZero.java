import java.io.*;
class PositiveNegativeZero
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a,b=0,c=0,d=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=0;i<=n;i++)
			{
				System.out.println("Enter a");
				a=Integer.parseInt(t.readLine());
				if(a>0)
				{
					b++;
				}
				else if(a<0)
				{
					c++;
				}
				else
				{
					d++;
				}
			}
				System.out.println("positive"+b);
				System.out.println("Negative="+c);
				System.out.println("zero="+d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				
									