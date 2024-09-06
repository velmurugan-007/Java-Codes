import java.io.*;
class ReverseString
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String name,s="";
			System.out.println("Enter name");
			name=t.readLine();
			int i,l=name.length();
			for(i=0;i<l;l--)
			{
				char ch=name.charAt(l);
				s=s+ch;
			}
				System.out.println("ReverseString="+s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}