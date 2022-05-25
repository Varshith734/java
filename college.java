class college
{
	String name;
	String loc;
	int capacity;
	String princi_name;
	 students s;
	college(String name,String loc,int capacity,String princi_name)
	{
		this.name=name;
		this.loc=loc;
		this.capacity=capacity;
		this.princi_name=princi_name;
	}
	
	public void addstudents()
	{	
		if(this.s==null)
		{ 
			
			this.s=new students("rocky",21,"m");
			System.out.println("student added successfully");
		}
		else
		{
			System.out.println("already exists");
		}
	}
	public void collegedetails()
	{
		if(this.s!=null)
		{
			System.out.println(" the cllg name :"+name);
			System.out.println(" the cllg loc :"+loc);
			System.out.println(" the cllg capacity :"+capacity);
			System.out.println(" the cllg principal name :"+princi_name);
		}
		else
		{
			System.out.println(" details");
		}

	}
	public void studentsdetails()
	{
		if(this.s!=null)
		{
			
			/*System.out.println(" the name :"+s.name);
			System.out.println(" the student age :"+s.age);
			System.out.println(" the student gender :"+s.gender);*/
			System.out.println(s);
		}
		else
		{
			System.out.println(" details");
		}
		
	}
	public void removestudents()
	{
		this.s=null;
		System.out.println("successsfully removed");
	}
}
	