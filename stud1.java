class Stud1
{
	String name;
	int id;
	Stud1(String name)
	{
		this.name=name;
	}
	Stud1(String name,int id)
	{
		this(name);
		this.id=id;
	}
	public   String toString()
	{
		return name+"\nThe id is "+id;
		
	}
public static void main(String [] args)
{
	Stud1 s=new Stud1("chandan",56);
	System.out.println(s);

	
	
}
}