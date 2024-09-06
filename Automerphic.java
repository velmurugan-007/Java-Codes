import java.io.*;
class Automerphic
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,a,b,c,d,i;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			a=(int)Math.pow(n,2);
			b=n;
			for(i=0;b>0;i++)
			{
				b=b/10;
			}	
				d=a%(int)(Math.pow(10,i));		
				System.out.println("d="+d);
			if(d==n)
			{
				System.out.println("Automerphic");
			}
			else
			{
				System.out.println("Not Automerphic");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
				
				
			
			
			