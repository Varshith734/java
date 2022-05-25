 class accountget
{
 	private String name="rener";
 	private long act_no=123456789;
	private String ifsc="kbl420";
	private String branch="mijar";
	private String holder="sathwik";


 	public String getname()
	{
		return name;
	}
	public long getact_no()
	{
		return act_no;
	}
	public String getifsc()
	{
		return ifsc;

	}
	public String getbranch()
	{
		return branch;
	}

	public String getholder()
	{
		return holder;
	}
	
	public void setname(String n)
	{
		this.name=n;
	}
	public void setact_no(long act_no)
	{
		this.act_no=act_no;
	}
	public void setifsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	public void setbranch(String branch)
	{
		this.branch=branch;
	}
	public void setholder(String holder)
	{
		this.holder=holder;
	}
}
	class accountdrivers1
	{
	public static void main(String [] args)
	{
		accountget s=new accountget();
		System.out.println(s.getname());
		System.out.println(s.getact_no());
		System.out.println(s.getifsc());
		System.out.println(s.getholder());
		System.out.println("details after updating" );
		s.setname("krishna");
		s.setact_no(6789);
		s.setifsc("sdg344h");
		s.setbranch("moodbidri");
		s.setholder("a.j");
		System.out.println(s.getname());
		System.out.println(s.getact_no());
		System.out.println(s.getifsc());
		System.out.println(s.getholder());
		
	}
}