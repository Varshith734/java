import java.util.Scanner;
class cal_scanner
{
	public static void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println("addition :" +(num1+num2));
		
	}
	public static void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println("deletion :"+(num1-num2));
	}
	public static void mul()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println("mul :"+(num1*num2));
	}
	public static void div()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println("div :"+(num1/num2));
	}
	public static void main(String [] args)
	{  
	 	add();
		sub();               //without using class name
		mul();
		div();  //with using class name

	}
}