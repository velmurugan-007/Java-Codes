import java.io.*;
class CommanElementStringArray
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			String a1[]=new String[n];
			String a2[]=new String[n];
			for(i=0;i<n;i++)
			{
				a1[i]=t.readLine();
			}
			for(i=0;i<n;i++)
			{
				a2[i]=t.readLine();
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a1[i]);
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a2[i]);
			}	
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(a1[i].equals(a2[j]))
					{
						System.out.println("common value="+a1[i]);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
			