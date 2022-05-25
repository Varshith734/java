 class accountget
{
 private String name="rener";
 private long act_no=123456789;
private String ifsc="kbl420";
private String branch="mijar";
private String holder="sathwik";


 public String getName()
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
}


class accountdrivers
{
	public static void main(String [] args)
	{
		accountget s=new accountget();
		System.out.println(s.getname());
		System.out.println(s.getact_no());
		System.out.println(s.getifsc());
		System.out.println(s.getholder());
	}
}