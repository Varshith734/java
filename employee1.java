class employee1
{
	String name="eren";
	static int usn=062;
	String dept="ise";
	static int sem=6;
	
	public void play()	
	{
	System.out.println("employee is working");
	}
	public static void hello()
	{
	System.out.println("hello");
	}
	
	public static void main (String []args)
	{
	employee1 x=new employee1();
	System.out.println("employee name :"+x.name);
	System.out.println("usn :"+usn);
	x.play();
	hello();
	
	}
}