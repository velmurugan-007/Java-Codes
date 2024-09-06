import java.io.*;
class HexadecimaltoBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int b,a,s,d=0,c=0,i;
			System.out.println("n");
			n=t.readLine();
			s=n.length()-1;
			for(i=0;s>=0;i++)
			{
				char ch=n.charAt(s);
				a=Character.getNumericValue(ch);
				c=c+(int)(a*Math.pow(16,i));
				s--;
			}
			for(i=0;c>0;i++)
			{
				b=c%2;
				d=b*(int)(Math.pow(10,i))+d;
				c=c/2;
			}
				System.out.println("HexadecimaltoDecimal="+d);				
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
	}
}				
				
	