class demo4
{
	public static void ram()
	{
		System.out.println("Program Started");
		System.out.println("m1() is executing");
		lakshman();
		System.out.println("Program ended");
	}

	public static void sita()
	{
		System.out.println("Program Started");
		System.out.println("sita is executing");
		System.out.println("Program ended");
	}

 	public static void lakshman()
	{
		System.out.println("Program Started");
		sita();
		System.out.println("Program ended");
	}
		
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		ram();
		System.out.println("Program ended");
	}
}


		