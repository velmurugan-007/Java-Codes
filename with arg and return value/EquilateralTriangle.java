import java.util.*;
class Testing
{
	int p=0;
	public int display(int a)
	{
		p=(int)(Math.sqrt(3)*Math.pow(a,2)/4);
		return p;
	}
}
class EquilateralTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a");
		a=sc.nextInt();
		Testing t=new Testing();
		int p=t.display(a);
		System.out.println(p);
	}
}