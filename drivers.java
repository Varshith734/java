class drivers
{
	public static void main(String [] args)
	{
	parent p=new child();
	child a=(child)p;
	System.out.println(a.a);
	a.m1();
	System.out.println(a.b);
	a.m2();
	}
}