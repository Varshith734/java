class hotel
{	
	int capacity;
	String name;
	String owner_name;
	swiggy s;

	hotel(int capacity,String name,String owner_name)
	{
		this.capacity=capacity;
		this.name=name;
		this.owner_name=owner_name;
	}
	public void bookorder()
	{
		
		this.s=new swiggy(125,200.00,"bangalore");
		System.out.println("object created successfully");

	}
	public void cancelorder()
	{
		this.s=null;
		System.out.println("order has been cancelled");
	}
	public void swiggydetails()
	{
		/*System.out.println("the order no:"+s.ordno);
		System.out.println("the price:"+s.price);
		System.out.println("the loc:"+s.loc);*/
		System.out.println(s);
	}
	public void hoteldetails()
	{
		System.out.println("the capacit:" +capacity);
		System.out.println("the name:"+name);	
		System.out.println("the ownername:"+owner_name);
		
	}

}



