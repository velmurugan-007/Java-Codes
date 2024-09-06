import java.io.*;
class SwapFirstLastDigits
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i=0,a,b,c,d,e,f,g;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			e=n;
			for(i=0;n>0;i++)
			{
				n=n/10;
			}
				System.out.println("i="+i);
				a=(int)Math.pow(10,i-1);
				System.out.println("a="+a);
				b=e/a;
				System.out.println("First Number="+b);
				c=e%10;
				System.out.println("Last Number="+c);
				d=e%a;
				System.out.println("d="+d);
				f=d-c;
				System.out.println("f"+f);
				g=c*a+f+b;
				System.out.println("Swap="+g);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				