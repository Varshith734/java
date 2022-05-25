import java.util.*;

class collegedriver
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		
		System.out.println("enter the loc");
		String loc=s.nextLine();
		loc=s.nextLine();
		System.out.println("enter the capacity");
		int capacity=s.nextInt();
		System.out.println("enter the princi name");
		String princi_name=s.nextLine();
		princi_name=s.nextLine();
		
		college h=new college(name,loc,capacity,princi_name);
		boolean exit=true;
		while(exit)
		{
			System.out.println("enter the choice");
			System.out.println("1.addstudents\n2.collegedetails\n3.studentsdetails\n4.removestudents\n");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:h.addstudents();
					break;
				case 2:h.collegedetails();
					break;
				case 3:h.studentsdetails();
					break;
				case 4:h.removestudents();
					break;
			}
		}
	}
}