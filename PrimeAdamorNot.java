import java.io.*;
class PrimeAdamorNot
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,b=0,i=2,a,e=0,c=0,d=0,g=0,h=0,f=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=2;n>i;i++)
			{
				if(n%i==0)
				{
					b++;
				}
			}
			a=n;
			c=(int)Math.pow(n,2);
			System.out.println("c="+c);
			for(;a>0;)
			{
				e=a%10;
				d=d*10+e;
				a=a/10;
			}
				h=(int)Math.pow(d,2);
				System.out.println("h="+h);
			for(;h>0;)
			{
				f=h%10;
				g=g*10+f;		
				h=h/10;
			}
				System.out.println("g="+g);
			if(b==0&&c==g)
			{
				System.out.println("PimeAdam");
			}
			else
			{
				System.out.println("not primeadam");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		
					