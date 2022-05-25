class calculator
{
	public static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;

		System.out.println(c);
		
	}
	public static void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public static void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public static void div()
	{
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String [] args)
	{
	 	add();
		sub();               //without using class name
		calci.mul();
		calci.div();  //with using class name

	}
}