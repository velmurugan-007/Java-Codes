import java.io.*;
class EqualityOfTwoArray
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j,c=0;
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
				System.out.println(a1[i]);
			}	
			for(i=0;i<n;i++)
			{
				System.out.println(a2[i]);
			}
			for(i=0;i<n;i++)
			{
			
					if(a1[i]==a2[i])
					{	
						c++;
					}
					
			}
			if(c==n)
			{
				System.out.println("Equality Array");
			}
			else
			{
				System.out.println("Not Equality Array");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	
		
			