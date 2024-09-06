import java.io.*;
class Adam
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a,b,d=0,e,f,g=0,c;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			a=(int)(Math.pow(n,2));
			b=n;
			for(;b>0;)
			{
				c=b%10;
				d=d*10+c;
				b=b/10;
			}
				e=(int)(Math.pow(d,2));
			for(;e>0;)
			{
				f=e%10;
				g=g*10+f;
				e=e/10;
			}
				System.out.println("g="+g);
			if(a==g)
			{
				System.out.println("Adam");
			}
			else
			{
				System.out.println("Not Adam");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}