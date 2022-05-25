class mobile
{
	String brand;
	String color;
	long price;
	int ram;
	sim s;
	
	mobile(String brand,String color,long price,int ram,sim s)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.ram=ram;
		this.s=s;
	}
	
	public void mobiledetails()
	{
	
	System.out.println("the brand:"+brand);
	System.out.println("the color:"+color);
	System.out.println("the price:"+price);
	System.out.println("the ram:"+ram);
	}
	public void simdetails()
	{
	
	
	System.out.println("the talktime:"+s.talktime);
	System.out.println("the provider:"+s.provider);
	System.out.println("the mbl no:"+s.simno);
	
	}


	


	public static void main(String [] args)
	{
	mobile m=new mobile("mi","black",10000,16,new sim(250,"jio",88657));
	m.mobiledetails();
	m.simdetails();
}
}