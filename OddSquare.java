import java.io.*;
class OddSquare
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			double i=1,n,s,a=0;
			System.out.println("enter n");
			n=Double.parseDouble(t.readLine());
			for(i=1;i<=n;i++)
			{
				if(i%2==1)
				{
					s=Math.pow(i,2);
					a=a+s;
					System.out.println("a="+a);
				}
					i++;
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	
				