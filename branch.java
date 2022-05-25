import java.util.*;
class branch 
{
	private String manager_name;
	private int ifsc;
	
	
	branch(String manager_name)
	{
		this.manager_name=manager_name;
	}
	branch(String manager_name,int ifsc)
	{
		this(manager_name);
  		this.ifsc=ifsc;
	}
	branch(String manager_name,int ifsc,)
	{
		this(manager_name,ifsc);
  		
	}
	
	public String getmanager_name()
	{
		return manager_name;
	}
	public int getifsc()
	{
		return ifsc;
	}
	public void setmanager_name(String manager_name)
	{
		this.manager_name=manager_name;
	}
	
	public void createaccount()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the account holder name:");
		String acct_hld_name=s.next();
		System.out.println("enter the account no:");
		long acct_no=s.nextLong();
		System.out.println("enter the account bal:");
		int bal=s.nextInt();
		
		
		this.a=new accounts(acct_hld_name,acct_no,bal);
		System.out.println("account been  successfully created");
		
		
	}
	public void branchattribute()
	{
		System.out.println("bank manager name :"+manager_name);
		System.out.println("bank ifsc code :"+ifsc);
	}
	
	public void deleteaccnt()
	{
		if(this.a!=null)
		{
		this.a=null;
		System.out.println("deleted successfully");
		}
		else
		{
		System.out.println("no acct has been created");
		}
	}
}