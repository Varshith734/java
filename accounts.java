class accounts
{
 	private String acct_hld_name;
	private long acct_no;
	private int bal;
	
	accounts(String acct_hld_name)
	{
		this.acct_hld_name=acct_hld_name;
	}
	accounts(String acct_hld_name,long acct_no)
	{
		this(acct_hld_name);
		this.acct_no=acct_no;
	}
	accounts(String acct_hld_name,long acct_no,int bal)
	{
		this(acct_hld_name,acct_no);
		this.bal=bal;
	}
	public String getacct_hld_name()
	{
		return acct_hld_name;
	}
	public long getacct_no()
	{
		return acct_no;
	}
	public int getbal()
	{
		return bal;
	}
	public void setacct_hld_name(String acct_hld_name)
	{
		this.acct_hld_name=acct_hld_name;
	}
	public void setbal(int bal)
	{
		this.bal=bal;
	}
	
	

	public void accountsdetails()
	{
		System.out.println("the account holder name:"+getacct_hld_name());
		System.out.println("the account no:"+getacct_no());
		System.out.println("the account bal:"+getbal());
	}
}