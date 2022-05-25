class stud1
{
	  private String name;
	 private int id;
	private String branch;
	private int sem;
	
	stud1(String name,int id,String branch,int sem)
	{
		this.name=name;
		this.id=id;
		this.branch=branch;
		this.sem=sem;
	}
	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public String getbranch()
	{
		return branch;
	}
	public int getsem()
	{
		return sem;
	}
	
}

class stud
{
	public static void main(String[] args)
	{
		stud1 s=new stud1("nero",78,"ise",6);
		System.out.println(s.getname());
		System.out.println(s.getid());
		System.out.println(s.getbranch());
		System.out.println(s.getsem());
	}
}
		