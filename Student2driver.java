abstract class Student
{	
	static
	{
		System.out.println("static...");
	}
	{
		System.out.println("non static...");
	}
	
	static int a=10;
	int b;
	Student(int b)
	{
		this.b=b;
	}
	public static void m1()
	{
		System.out.println("m1() executing from class student");
	}
	public static void m2()
	{
		System.out.println("m2() executing from class student");
	}
	public  abstract void m3();
	public  abstract void m4();
}


class Student4 extends Student 
{
	
	Student4(int b)
	{
		super(b);
	}
	public  void m3()
	{
		System.out.println("m3() executing from class Student4");
	}
	public void m4()
	{
		System.out.println("m4() executing from class Student4");
	}

}

class Student2driver
{
	public static void main(String [] args)
	{
		Student4 b=new Student4(20);
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		System.out.println(b.a);
		System.out.println(b.b);
	}
}