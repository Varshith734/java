 interface A {
	int a=20;
	public static void m1()
	{
	System.out.println("hey");
	}
	public void m2();
	public void m3();
}

class B implements A
{
	public  void m2()
	{
	System.out.println("m2() executes..");
	}
	public  void m3()
	{
	System.out.println("m3() executes..");
	}
}

class Adriver
{
	public static void main(String[] args)
	{
		B b=new B();
		A.m1();
		b.m2();
		b.m3();
		System.out.println(b.a);
	}
}