class studentdrivers
{
public static void main(String[] args)
	{
		student2 s1=new student2();
		s1.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student2 s2=new student2("eren");
		s2.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student2 s3=new student2("thor","4AL19IS062");
		s3.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student2 s4=new student2("loki","4AL19IS020","ISE");
		s4.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		student2 s5=new student2("bjorn","4AL19IS031","AI",6);
		s5.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");	
	}
}