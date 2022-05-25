class bookmyshow
{
	String movie_name;
	int ticket_no;
	int seat_no;
	String theatre_name;
	
	static
	{
		System.out.println("...welcome to the theatre..");
	}
	static
	{
		System.out.println("...hope you enjoy..");
	}
	static
	{
		System.out.println("..new movies...");
	}
	public  void info()
	{
 	bookmyshow b=new bookmyshow();
	System.out.println("the movie name is :"+b.movie_name);
	System.out.println("the theatre name is :"+b.theatre_name);
	System.out.println("the movie ticket no is :"+b.ticket_no);
	System.out.println("the seat no is :"+b.seat_no);
	}
	
	public static void info2()
	{
		bookmyshow b=new bookmyshow();
		b.movie_name="k.g.f";
		b.ticket_no=123;
		b.seat_no=23;
		b.theatre_name="pvr";
		System.out.println("code is null");
	}
	
	
	
	public static void main (String []args)
	{
	
	bookmyshow b=new bookmyshow();
	b.info2();
	b.info();
	
	
	
	}



	static 
	{
		System.out.println("...**come again**..");
	}
}