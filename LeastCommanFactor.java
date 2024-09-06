import java.io.*;
class LeastCommanFactor
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a=0,n1,n2,n,i;
			System.out.println("Enter n1");
			n1=Integer.parseInt(t.readLine());
			System.out.println("Enter n2");
			n2=Integer.parseInt(t.readLine());
			n=n1*n2;
			for(i=1;i<=n;i++)
			{
				if(n1%i==0 && n2%i==0 )
				{
					a=n/i;
				}
			}
			System.out.println("Least Comman Factor="+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

				
				
				
					
				