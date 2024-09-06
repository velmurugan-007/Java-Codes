import java.util.*;
class Testing
{
	public void display(int a)
	{
		if(a%2==1)
		{
			System.out.println("The given number is odd");
		}
		else
		{
			System.out.println("The given number is Even");
		}
	}
}
class OddEven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a");
		a=sc.nextInt();
		Testing t=new Testing();
		t.display(a);
	}
}