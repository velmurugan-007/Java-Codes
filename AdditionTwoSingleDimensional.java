import java.io.*;
class AdditionTwoSingleDimensional
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,w=0;
			System.out.println("Enter size");
			n=Integer.parseInt(t.readLine());
			int a1[]=new int[n];
			int a2[]=new int[n];
			int a3[]=new int[w];
			for(i=0;i<n;i++)
			{
				a1[i]=Integer.parseInt(t.readLine());
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
				w=a1[i]+a2[i];
				System.out.println("Sum of an array="+w);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				
			