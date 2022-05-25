class airport
{
	String loc;
	String capacity;
	int no_flights;
	aeroplane s;
	airport(String loc,String capacity,int no_flights,aeroplane s)
	{
		this.loc=loc;
		this.capacity=capacity;
		this.no_flights=no_flights;
		this.s=s;
	}
	
	public void airportdetails()
	{
		System.out.println("the loc :"+loc);
		System.out.println("the capacity :"+capacity);
		System.out.println(no_flights);
	}
	
	
	public void aeroplanedetails()
	{
		System.out.println("the colour :"+s.colour);
		System.out.println("the capacity:"+s.capacity);
		System.out.println("the brand: "+s.brand);
	}
}	