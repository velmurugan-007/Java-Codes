import java.io.*;
class Armstrong
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,a,c,b,d=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			b=n;
			a=n;
			for(i=0;n>0;i++)
			{
				n=n/10;
			}
			for(;b>0;)
			{
				c=b%10;
				d=d+(int)(Math.pow(c,i));
				b=b/10;
			}
				System.out.println("d="+d);
				if(a==d)
				{
					System.out.println("Armstrong");
				}
				else
				{
					System.out.println("Not Armstrong");
				}		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}