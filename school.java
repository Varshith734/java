import java.util.Scanner;
class school
{
	static String name="killua";
	static int roll_no;
	static int roomno=9;
	static String from="chennai";
	
	static
	{
		System.out.println("welcome to alvas");
	
	}
	
	public static void student()
	{
  		System.out.println("student name is : "+name);
		System.out.println("student roll number is :"+roll_no);
		System.out.println("student class is :"+roomno);
		System.out.println("student from :"+from);
	}
	public static void principal()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the principal name ");
	String name=s.nextLine();
	System.out.println("enter the principal no");
	int num=s.nextInt(); 
	System.out.println("principal name is :"+name);
	System.out.println("principal phone no :"+num);
	}
	public static void main(String[] args)
	{
		System.out.println("program starts");
		student();
		principal();
		System.out.println("program ends");
	}
	static
	{
		System.out.println("thank you");
	}
}
		
	