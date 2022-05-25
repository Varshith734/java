
class A
{
	int a=10;
	static int b=20;
}

class B extends A
{
	int a=50;
	static int b=70;
}

class Drivers1
{
	public static void main(String []args)
	{
	B x=new B();
	A y=new A();
	System.out.println(x.a);
	System.out.println(x.b);
	
	System.out.println(y.a);
	System.out.println(y.b);
	
	A z=new B();
	System.out.println(z.a);
	System.out.println(z.b);
	}

}