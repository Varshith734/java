class myshow
{
	int id = 125;
	String movie="KGF Chapter 2";
	String releaseDate = "14/04/2022";
	int vacancy = 20;

	static{
		System.out.println("\n");
		System.out.println("+-+-+WELCOME TO BOOK MY SHOW+-+-+");
	}
	
	static{
		System.out.println("/////////////////////////////////");
	}

	public void display()
	{
		System.out.println("\n");
		System.out.println("Movie : "+movie);
		System.out.println("Release date : "+releaseDate);
	}
	java
	public static void print1()
	{
		BookMyShow s = new myshow();
		System.out.println("ID of Movie : "+s.id);
		System.out.println("Total seats availale : "+s.vacancy);
	}
	
	public static void main(String args[])
	{
		BookMyShow s = new myshow();
		s.display();
		print1();
	}
	
	static{
		System.out.println("-------------Trending---------------");
	}
	static{
		System.out.println("*************Thank you**************");
	}
}