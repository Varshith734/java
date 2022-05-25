class A2
{
	public void m1()
	{
		System.out.println("hi");
	}
	public  void m2()
	{
		System.out.println("hi............");
	}
	public  void m3()
	{
		System.out.println("...namaste..");
	}
	public  void m4()
	{
		System.out.println("how are u");
	}
	public  void m5()
	{
		System.out.println("..what's up..!");
	}
}



class B2 extends A2
{
	
	public  void m1()
	{
		System.out.println("hello..");
	}
	public  void m2()
	{
		System.out.println("hhhh............");
	}
	public  void m3()
	{
		System.out.println("...yeahhh..");
	}
	public void m4()
	{
		System.out.println("how u doing...");
	}
	public  void m5()
	{
		System.out.println("..what..!");
	}
}


class Driver3
{
public static void main(String[] args)
{
	A2 a=new A2();

	a.m1();
	a.m2();
	a.m3();
	a.m4();
	a.m5();

	System.out.println("---------------------------");
	B2 b=new B2();
	b.m1();
	b.m2();
	b.m3();
	b.m4();
	b.m5();
	
	System.out.println("----------up-----------------");
	A2 c=new B2();
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	c.m5();
	
	System.out.println("---------down------------------");
	B2 d=(B2)c;
	d.m1();
	d.m2();
	d.m3();
	d.m4();
	d.m5();

}
}
	