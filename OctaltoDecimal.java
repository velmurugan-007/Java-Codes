import java.io.*;
class OctaltoDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,d=0,a,i;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=0;n>0;i++)
			{
				a=n%10;
				d=a*(int)(Math.pow(8,i))+d;
				n=n/10;
			} 
				System.out.println("OctaltoDecimal="+d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
				
			