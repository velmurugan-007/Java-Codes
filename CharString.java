import java.io.*;
class CharString
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String name;
			System.out.println("Enter name");
			name=t.readLine();
			int i,l=name.length();
			for(i=0;i<l;i++)
			{
				char ch=name.charAt(i);
				System.out.println("charString="+ch);
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}