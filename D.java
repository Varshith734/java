//abstarction 
abstract class AA
{
	public static void m1()
	{
		System.out.println("m1() executing from class AA");
	}
	public static void m2()
	{
		System.out.println("m2() executing from class AA");
	}
	
	public  void m3()
	{
		System.out.println("m3() executing from class AA");
	}
	public void m4()
	{
		System.out.println("m4() executing from class AA");
	}
		
	public  abstract void m5();
	public  abstract void m6();
}

class BB extends AA
{
	public  void m5()
	{
		System.out.println("m5() executing from class BB");
	}
	public  void m6()
	{
		System.out.println("m6() executing from class BB");
	}
	
}

class D
{
	public static void main(String [] args)
	{
		AA b=new BB();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m6();

	}
}		