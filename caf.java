import java.util.scanner;
class cal_scanner
{
	public static void add(int a,int b)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println("addition\n" +(num1+num2));
		
	}
	public static void sub(int a,int b)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println(num1-num2);
	}
	public static void mul(int a,int b)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println(num1*num2);
	}
	public static void div(int a,int b)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt();
		System.out.println("enter the second value");
		int num2=s.nextInt();
		System.out.println(num1/num2);
	}
	public static void main(String [] args)
	{  
	 	add(num1,num2);
		sub(num1,num2);               //without using class name
		mul(num1,num2);
		div(num1,num2);  //with using class name

	}
}