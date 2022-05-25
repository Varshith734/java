import java.util.*;

class hoteldrives
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the capaicty");
		int capacity=s.nextInt();
		System.out.println("enter the hotel name");
		String name=s.nextLine();
		name=s.nextLine();
		System.out.println("enter the owner name");
		String owner_name=s.nextLine();
		
		hotel h=new hotel(capacity,name,owner_name);
		boolean exit=true;
		while(exit)
		{
			System.out.println("enter the choice");
			System.out.println("1.bookorder\n2.swiggydetails\n3.hoteldetails\n4.cancelorder\n");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:h.bookorder();
					break;
				case 2:h.swiggydetails();
					break;
				case 3:h.hoteldetails();
					break;
				case 4:h.cancelorder();
					break;
			}
		}
	}
}
		
		











		
		
	