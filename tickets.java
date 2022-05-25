class tickets
{
	private int ticket_no;
	private String arrival_place;
	private String departure_place;
	private int noofticket;
	
	tickets(int ticket_no)
	{
		this.ticket_no=ticket_no;
	}
	tickets(int ticket_no,String arrival_place)
	{
		this(ticket_no);
		this.arrival_place=arrival_place;
	}
	tickets(int ticket_no,String arrival_place,String departure_place)
	{
		this(ticket_no,arrival_place);
		this.departure_place=departure_place;
	}
	tickets(int ticket_no,String arrival_place,String departure_place,int nooftickets)
	{
		this(ticket_no,arrival_place,departure_place);
		this.noofticket=noofticket;
	}
	
	public int getticket_no()
	{
		return ticket_no;
	}
	public String getarrival_place()
	{
		return arrival_place;
	}
	public String getdeparture_place()
	{
		return departure_place;
	}
	public int getnoofticket()
	{
		return noofticket;
	}

	public void setarrival_place(String arrival_place)
	{
		this.arrival_place=arrival_place;
	}
	public void setdeparture_place(String departure_place)
	{
		this.departure_place=departure_place;
	}
}
	