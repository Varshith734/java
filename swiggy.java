class swiggy
{
	int ordno;
	double price;
	String loc;
	swiggy(int ordno,double price,String loc)
	{
		this.ordno=ordno;
		this.price=price;
		this.loc=loc;
	}
	public String toString()
	{
		return "\nthe ordno is:"+ordno+"\nthe price:"+price+"\nthe loc :"+loc;
	}
}