import java.util.*;
class redbus
{
	String busname;
	int busno;
	tickets t;
	redbus(String busname)
	{
		this.busname=busname;
	}
	redbus(String busname,int busno)
	{
		this(busname);
		this.busno=busno;
	}
	
	public void booktickets()
	{
		if(this.t==null)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the ticket no:");
		int ticket_no=s.nextInt();
		System.out.println("enter the arrival place:");
		String arrival_place=s.next();
		System.out.println("enter the departure place:");
		String departure_place=s.next();
		System.out.println("enter the departure place:");
		int noticket=s.nextInt();
		}
	else
	{
		System.out.println(" already booked");
	}
	}
	
	public void ticketdetails()
	{
		if(this.t!=null)
		{
		System.out.println("enter the ticket no:"+t.getticket_no());
		System.out.println("enter the arrival place:"+t.getarrival_place());
		System.out.println("enter the departure place:"+t.getdeparture_place());
		System.out.println("enter the departure place:"+t.getdeparture_place());
		}
	else
		{
			System.out.println(" no ticket has been booked");
		}
	}
	
	public void busdetails()
	{	
	
		if(this.t!=null)
		{
		System.out.println("enter the bus name:"+busname);
		System.out.println("enter the bus no :"+busno);
		}
		else
		{
			System.out.println("no bus is booked ");
		}
	}
	
	public void updatearrival()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the arrival place :");
		String b=s.next();
		t.setarrival_place(b);
	}
	public void updatedeparture()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the departure place :");
		String b=s.next();
		t.setdeparture_place(b);
	}

	public void cancelticket()
	{
		if(this.t!=null)
		{
			this.t=null;
			System.out.println("successfully ticket canceled");
		}
		else
		{
			System.out.println("no booking has done");
		}
	}
}
	