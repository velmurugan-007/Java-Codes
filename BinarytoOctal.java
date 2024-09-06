import java.io.*;
class BinarytoOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);

			int n,d=0,a,b,e=1,c=0,i;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(i=0;n>0;i++)
			{
				a=n%10;
				d=a*(int)(Math.pow(2,i))+d;
				n=n/10;
			} 
			for(i=0;d>0;i++)
			{
				b=d%8;
				c=b*(int)(Math.pow(10,i))+c;
				d=d/8;
			}
				System.out.println("BinaryToOctal="+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
				
			