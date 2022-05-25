class gt
{
	  String name;
	 String ID;
	String branch;
	int sem;
	
	public void display()
	{
		this.name=name;
		this.id=id;
		this.branch=branch;
		this.sem=sem;
	}
	public int getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public int getbranch()
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
		gt s=new gt()
		System.out.println(s.getname());
		System.out.println(s.getid());
		System.out.println(s.getbranch());
		System.out.println(s.getsem());
	}
}
		