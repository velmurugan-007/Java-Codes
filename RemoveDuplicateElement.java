import java.io.*;
class RemoveDuplicateElement
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);	
			int n,i,j,c=0;
			System.out.println("Enter Size");
			n=Integer.parseInt(t.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(a[i]==a[j])
					{
						c=a[i];
						a[i]=a[n-1];
						
					}
				}
				for(i=0;i<n-1;i++)
				{
					System.out.println("After remove duplicate="+a[i]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	