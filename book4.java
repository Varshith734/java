class book3
{
private	String name="aot";
private	int id=34;
private	String author="sathwik shetty";
private	String publisher="pawan";
	
	//public  void book3()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(author);
		System.out.println(publisher);
	}//
	
}
class book4
{
	public static void main(String[] args)
	{
		book3 b=new book3();
		//b.book3();//
		System.out.println(b.name);
	}
}