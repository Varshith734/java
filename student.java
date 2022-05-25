//CONSTRUCTOR

class student 
{
	String name;
	String ID;
	String branch;
	int sem;

	student()
	{
	}
	student(String name)
	{
		this.name=name;
	}
	student(String name, String ID)
	{
		this.name=name;
		this.ID=ID;
	}
	
	student(String name, String ID,String branch)
	{
		this.name=name;
		this.ID=ID;
		this.branch=branch;
	}
	
	student(String name, String ID,String branch,int sem)
	{
		this.name=name;
		this.ID=ID;
		this.branch=branch;
		this.sem=sem;
	}
	public  void display()
	{
		System.out.println("student name:"+name);
		System.out.println("the id of the student:"+ID);
		System.out.println("the branch of the student:"+branch);
		System.out.println("the sem of the student:"+sem);
	}
	public static void main(String[] args)
	{
		student s1=new student();
		s1.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student s2=new student("eren");
		s2.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student s3=new student("thor","4AL19IS062");
		s3.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student s4=new student("loki","4AL19IS020","ISE");
		s4.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student s5=new student("bjorn","4AL19IS031","AI",6);
		s5.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");	
	}
} 