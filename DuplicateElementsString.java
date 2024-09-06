import java.io.*;
class DuplicateElementsString
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			String a[]=new String[n];
			for(i=0;i<n;i++)
			{
				a[i]=t.readLine();
			}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i].equals(a[j]))
					{	
						System.out.println(a[i]);
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
						