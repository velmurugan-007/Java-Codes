import java.util.*;
class Testing
{
	public void display(String n,int a,int b)
	{
		int c=0;
		switch(n)
		{
			case "1":
			case "+":c=a+b;
			System.out.println("Addition of two nos="+c);
			break;
			case "2":
			case "-":c=a-b;
			System.out.println("Subraction of two nos="+c);
			break;
			case "3":
			case "/":c=a/b;
			System.out.println("Division of two nos="+c);
			break;
			case "4":
			case "*":c=a*b;
			System.out.println("Multiplication of two nos="+c);
			break;
			case "5":
			case "%":c=a%b;
			System.out.println("Modulas of two nos="+c);
			break;
			default:
			System.out.println("Invalid");
		}			
	}
	
	public void display(String c)
	{
		switch(c)
		{
			case "a":
			case "A":System.out.println("Vowel");
			break;
			case "e":
			case "E":System.out.println("Vowel");
			break;
			case "o":
			case "O":System.out.println("Vowel");
			break;
			case "u":
			case "U":System.out.println("Vowel");
			break;
			case "i":
			case "I":System.out.println("Vowel");
			break;
			default:System.out.println("Consonents");
			
		}
	}

}
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		String n=sc.nextLine();
		System.out.println("Enter no1");
		int a=sc.nextInt();
		System.out.println("Enter no2");
		int b=sc.nextInt();
		Testing t=new Testing();
		t.display(n,a,b);
		System.out.println("Enter value");
		String c=sc.next();
		t.display(c);
	}
}