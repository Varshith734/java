//CONSTRUCTOR

class student2 
{
	  String name;
	 String ID;
	String branch;
	int sem;

	student2()
	{
	}
	student2(String name)
	{
		this.name=name;
	}
	student2(String name, String ID)
	{
		this.name=name;
		this.ID=ID;
	}
	
	student2(String name, String ID,String branch)
	{
		this.name=name;
		this.ID=ID;
		this.branch=branch;
	}
	
	student2(String name, String ID,String branch,int sem)
	{
		this.name=name;
		this.ID=ID;
		this.branch=branch;
		this.sem=sem;
	}	public  void display()
	{
		System.out.println("student name:"+name);
		System.out.println("the id of the student:"+ID);
		System.out.println("the branch of the student:"+branch);
		System.out.println("the sem of the student:"+sem);
	} 
	
} 