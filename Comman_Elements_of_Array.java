import java.io.*;
class Comman_Elements_of_Array
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			int a1[]=new int[n];
			int a2[]=new int[n];
			for(i=0;i<n;i++)
			{
				a1[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				a2[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				System.out.print(a1[i]);
			}
			for(i=0;i<n;i++)
			{
				System.out.print(a2[i]);
			}	
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(a1[i]==a2[j])
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
			
			