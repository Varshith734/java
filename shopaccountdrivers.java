class shop
{
	private String name;
	private String loc;
	private long phno;
	private String owner;
	private String type;
	
	shop(String name,String loc,long phno,String owner,String type)
	{
		this.name=name;
		this.loc=loc;
		this.phno=phno;
		this.owner=owner;
		this.type=type;
	}
	
	public String getname()
	{
		return name;
	}
	public String getloc()
	{
		return loc;
	}
	public int getphno()
	{
		return phno;
	}
	public String getowner()
	{
		return owner;
	}
	public String gettype()
	{
		return type;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setloc(String loc)
	{
		this.loc=loc;
	}public void setowner(String owner)
	{
		this.owner=owner;
	}public void settype(String type)
	{
		this.type=type;
	}
	public void setphno(long phno)
	{
		this.phno=phno;
	}


}

class shopdrivers
{
	public static voidmain(String[] args)
	{
	shop s=new shop("fashion","moodbidri",234545,"lathesh","food");
		System.out.println(s.getname());
		System.out.println(s.getloc());
		System.out.println(s.getphno());
		System.out.println(s.getowner());
		System.out.println(s.gettype());
		System.out.println("****details after updating****" );
		s.setname("krishna");
		s.setloc("mg.road);
		s.setphno(83684374);
		s.setowner("mohan");
		s.settype("a.j");
		System.out.println(s.getname());
		System.out.println(s.getloc());
		System.out.println(s.getphno());
		System.out.println(s.getowner());
		System.out.println(s.gettype());
	}
}
		