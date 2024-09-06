import java.io.*;
class DuplicateElements
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j,c=0;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						
						System.out.print(a[i]);	
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
			