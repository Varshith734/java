class cardrivers
{
	public static void main(String [] args)
	{
		car c=new car("black",200000,"audi", new engine(220,45));
		System.out.println("car color : "+c.color);
		System.out.println("car brand :"+c.brand);
		System.out.println("car engine cc: "+c.e.cc);
	}
}