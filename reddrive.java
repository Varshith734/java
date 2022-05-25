import java.util.*;
class reddrive
{
	public static void main(String args[])
	{
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter the bus name:" );
		String busname=s.next():
		System.out.println("enter the bus no:" );
		int busno=s.next():*/
		Scanner s=new Scanner(System.in);
		redbus b=new redbus("vrl",56);
		
        while(true)
        {
            System.out.println("1)Book Ticket\n2)Ticket details\n3)Bus details\n4)update arrival\n5)update departure\n6)cancel ticket\n7)Exit\nEnter your choice:");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:b.booktickets();
                         break;
                case 2:b.ticketdetails();
                         break;
                case 3:b.busdetails();
                        break;
                case 4:b.updatearrival();
                        break;
                case 5:b.updatedeparture();
                        break;
                case 6:b.cancelticket();
                        break;
                case 7:System.exit(0);
			default:System.out.println("\nEnter the correct input!!\n");
            }
        }
	}
}