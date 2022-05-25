import java.util.scanner;
class caf
{
	public static void add(int a,int b)
	{

		System.out.println("addition\n" +(a+b));
		
	}
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	public static void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String [] args)
	{  
 		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		int num1=s.nextInt
		System.out.println("enter the second value");
		int num2=s.nextInt
		
	 	add(num1,num2);
		sub(num1,num2);               //without using class name
		calf.mul(num1,num2);
		div(num1,num2);  //with using class name

	}
}