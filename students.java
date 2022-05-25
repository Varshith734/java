class students
{
	String name;
	int age;
	String gender;
	students(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
		public String toString()
		{
			return "name :"+name+"\n age :"+age+"\n gender: "+gender;
		}
}