
class principal 
{
	String name;
	String id;
	String cllgname;
	int age;
	String qualification;
	principal()
	{
	}
	principal(String name)
	{
		this.name=name;
	}
	principal(String name, String iD)
	{
		this.name=name;
		this.id=id;
	}
	
	principal(String name, String id,String cllgname)
	{
		this.name=name;
		this.id=id;
		this.cllgname=cllgname;
	}
	
	principal(String name, String id,String cllgname,int age)
	{
		this.name=name;
		this.id=id;
		this.cllgname=cllgname;
		this.age=age;
	}
	principal(String name, String id,String cllgname,int age,String qualification)
	{
		this.name=name;
		this.id=id;
		this.cllgname=cllgname;
		this.age=age;
		this.qualification=qualification;
	}
	public  void display()
	{
		System.out.println("principal name:"+name);
		System.out.println("the id of the principal:"+id);
		System.out.println("the principal college name:"+cllgname);
		System.out.println("the age:"+age);
		System.out.println("principal qualification:"+qualification);
	}
	public static void main(String[] args)
	{
		principal s1=new principal();
		s1.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		principal s2=new principal("eren");
		s2.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		principal s3=new principal("thor","4AL19IS062");
		s3.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		principal s4=new principal("loki","4AL19IS020","aiet");
		s4.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		principal s5=new principal("bjorn","4AL19IS031","aiet",45);
		s5.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		principal s6=new principal("bjorn","4AL19IS031","AI",36,"be");
		s6.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
	}
} 