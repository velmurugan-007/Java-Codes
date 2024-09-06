import java.io.*;
class DecimaltoHexadecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String s="";
			int n,i,a,c=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			for(;n>0;)
			{
				a=n%16;
				
				if(a==10)
				{
					s='A'+s;
				}
				else if(a==11)
				{
					s='B'+s;
				}
				else if(a==12)
				{
					s='C'+s;
				}
				else if(a==13)
				{
					s='D'+s;
				}
				else if(a==14)
				{
					s='E'+s;
				}
				else if(a==15)
				{
					s='F'+s;
				}
				else
				{
					s=String.valueOf(a)+s;
				}
				n=n/16;
				
			}
			System.out.println("DecimaltoHexadecimal="+s);
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
	}
}				
				
	