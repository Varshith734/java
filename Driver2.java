class A1
{
	public static void m1()
	{
		System.out.println("hi");
	}
	public static void m2()
	{
		System.out.println("hi............");
	}
	public static void m3()
	{
		System.out.println("...namaste..");
	}
	public static void m4()
	{
		System.out.println("how are u");
	}
	public static void m5()
	{
		System.out.println("..what's up..!");
	}
}



class B1 extends A1
{
	
	public static void m1()
	{
		System.out.println("hello..");
	}
	public static void m2()
	{
		System.out.println("hhhh............");
	}
	public static void m3()
	{
		System.out.println("...yeahhh..");
	}
	public static void m4()
	{
		System.out.println("how u doing...");
	}
	public static void m5()
	{
		System.out.println("..what..!");
	}
}


class Driver2
{
public static void main(String[] args)
{
	A1 a=new A1();

	a.m1();
	a.m2();
	a.m3();
	a.m4();
	a.m5();

	System.out.println("---------------------------");
	B1 b=new B1();
	b.m1();
	b.m2();
	b.m3();
	b.m4();
	b.m5();
	
	System.out.println("----------up-----------------");
	A1 c=new B1();
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	c.m5();
	
	System.out.println("---------down------------------");
	B1 d=(B1)c;
	d.m1();
	d.m2();
	d.m3();
	d.m4();
	d.m5();

}
}
	