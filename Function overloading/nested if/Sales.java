import java.util.*;
class Testing
{
	int b;
	public void display(int a)
	{
			if(a<=10000)
			{
				b=a*0;
				System.out.println("commission 0%="+b);
			}
			else
			{
				if(10000<=a&&20000>=a)
				{
					b=((a-10000)*5/100);
					System.out.println("commission 5%="+b);
				}
				else
				{
					if(20000<=a&&50000>=a)
					{
						b=((10000)*5/100)+((a-20000)*10/100);
						System.out.println("commisssion 10%="+b);
					}
					else
					{
						if(50000<=a&&100000>=a)
						{
							b=((10000)*5/100)+((30000)*10/100)+((a-50000)*15/100);
							System.out.println("commission 15%="+b);
						}
						else
						{
							b=((10000)*5/100)+((30000)*10/100)+((50000)*15/100)+((a-100000)*20/100+500);
							System.out.println("commission 20%+500="+b);
						}
					}
				}
			}
		
	}
	double hra,da,gross;
	public void display(double basic)
	{	
		if(basic<=10000)
		{
				hra=(basic*20/100);
				da=(basic*80/100);
				gross=basic+hra+da;
				System.out.println("hra 20% is="+hra);
				System.out.println("da 80% is="+da);
				System.out.println("gross="+gross);
		}
		else
		{
				if(10000<=basic&&20000>=basic)
				{
					hra=(basic*25/100);
					da=(basic*90/100);
					gross=basic+hra+da;
					System.out.println("hra 25% is="+hra);
					System.out.println("da 90% is="+da);
					System.out.println("grosss="+gross);
				}
				else
				{
					hra=(basic*30/100);
					da=(basic*95/100);
					gross=basic+hra+da;
					System.out.println("hra 30% is="+hra);
					System.out.println("da 95% is="+da);
					System.out.println("gross="+gross);
				}
		}
		

	}
}
class Sales
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter a");
		a=sc.nextInt();
		Testing t=new Testing();
		t.display(a);
		double basic;
		System.out.println("enter basic");
		basic=sc.nextDouble();	
		t.display(basic);
	}
}
	